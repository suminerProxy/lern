package com.tencent.android.tpush;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.android.tpush.common.BroadcastAgent;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.android.tpush.common.i;
import com.tencent.android.tpush.encrypt.Rijndael;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.android.tpush.service.channel.security.d;
import com.tencent.tpns.baseapi.base.util.CommonWorkingThread;
import com.tencent.tpns.baseapi.base.util.ErrCode;
import com.tencent.tpns.baseapi.base.util.Md5;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.umeng.analytics.pro.am;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: ProGuard */
@JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.ACTIVITYCHECK, EType.INTENTCHECK, EType.INTENTSCHEMECHECK})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TpnsActivity extends Activity {
    public static final String CHECK_CODE = "checkCode";
    public static final String CUSTOM_CONTENT = "customContent";
    public static final String JUMP_type = "jumpType";
    public static final String MSG_TYPE = "msgType";
    public static final String TARGE_ACTIVITY = "targetActivity";
    public static final String TIMESTAMP = "timestamp";

    /* renamed from: a  reason: collision with root package name */
    public static Application.ActivityLifecycleCallbacks f8429a = null;
    public static List<String> b = null;
    public static String c = "";

    /* renamed from: d  reason: collision with root package name */
    public static long f8430d;

    /* renamed from: e  reason: collision with root package name */
    public static long f8431e;

    /* renamed from: f  reason: collision with root package name */
    private String f8432f = "";

    /* renamed from: g  reason: collision with root package name */
    private int f8433g = 100;

    /* renamed from: h  reason: collision with root package name */
    private RSAPublicKey f8434h = null;

    public static void addActivityNames(String str) {
        if (i.b(str)) {
            return;
        }
        if (b == null) {
            b = new ArrayList();
        }
        if (b.contains(str)) {
            return;
        }
        b.add(str);
    }

    private void b(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            finish();
        }
        String stringExtra = intent.getStringExtra("checkCode");
        String stringExtra2 = intent.getStringExtra(MessageKey.MSG_ID);
        String stringExtra3 = intent.getStringExtra(am.aF);
        String md5 = Md5.md5(stringExtra2);
        if (md5 != null && stringExtra.equals(md5)) {
            String string = extras.getString("content");
            TLogger.ii("TpnsActivity", "fcmChannelDeepLink content ：" + string);
            if (string != null && !TextUtils.isEmpty(string)) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    JSONObject optJSONObject = jSONObject.optJSONObject("action");
                    int optInt = optJSONObject.optInt(Constants.FLAG_ACTION_TYPE, 0);
                    String optString = optJSONObject.optString("activity");
                    String optString2 = optJSONObject.optJSONObject("browser").optString("url");
                    String optString3 = optJSONObject.optString("intent");
                    String optString4 = jSONObject.optString("custom_content");
                    XGPushClickedResult xGPushClickedResult = new XGPushClickedResult();
                    boolean z = true;
                    if (optInt != 1) {
                        if (optInt != 2) {
                            if (optInt != 3) {
                                if (optInt == 5 && !TextUtils.isEmpty(optString3)) {
                                    xGPushClickedResult.activityName = optString3;
                                    Context applicationContext = getApplicationContext();
                                    z = a(applicationContext, stringExtra2, "101", optInt + "", optString3, stringExtra3);
                                    if (z) {
                                        c(optString3, optString4);
                                    }
                                }
                            } else if (optString3 != null && !TextUtils.isEmpty(optString3)) {
                                xGPushClickedResult.activityName = optString3;
                                Context applicationContext2 = getApplicationContext();
                                z = a(applicationContext2, stringExtra2, "101", optInt + "", optString3, stringExtra3);
                                if (z) {
                                    b(optString3, optString4);
                                }
                            }
                        } else if (optString2 != null && !TextUtils.isEmpty(optString2)) {
                            xGPushClickedResult.activityName = optString2;
                            Context applicationContext3 = getApplicationContext();
                            z = a(applicationContext3, stringExtra2, "101", optInt + "", optString2, stringExtra3);
                            if (z) {
                                b(optString2);
                            }
                        }
                    } else if (optString != null && !TextUtils.isEmpty(optString)) {
                        xGPushClickedResult.activityName = optString;
                        Context applicationContext4 = getApplicationContext();
                        z = a(applicationContext4, stringExtra2, "101", optInt + "", optString, stringExtra3);
                        if (z) {
                            a(optString, optString4);
                        }
                    } else {
                        Context applicationContext5 = getApplicationContext();
                        z = a(applicationContext5, stringExtra2, "101", optInt + "", "", stringExtra3);
                        if (z) {
                            xGPushClickedResult.activityName = optString;
                            a(optString4);
                        }
                    }
                    xGPushClickedResult.notificationActionType = optInt;
                    xGPushClickedResult.customContent = optString4;
                    if (z) {
                        CommonWorkingThread.getInstance().execute(new TTask(this, extras, xGPushClickedResult) { // from class: com.tencent.android.tpush.TpnsActivity.1

                            /* renamed from: a  reason: collision with root package name */
                            public final /* synthetic */ Bundle f8435a;
                            public final /* synthetic */ XGPushClickedResult b;
                            public final /* synthetic */ TpnsActivity c;

                            @Override // com.tencent.tpns.baseapi.base.util.TTask
                            public void TRun() {
                            }
                        });
                    }
                } catch (Throwable th) {
                    TLogger.ii("TpnsActivity", "TpnsActivity fcmChannelDeepLink e:" + th);
                }
            }
        } else {
            finish();
        }
        finish();
    }

    private void c(Intent intent) {
        if (intent != null) {
            try {
                Uri data = intent.getData();
                if (data != null) {
                    TLogger.ii("TpnsActivity", "TpnsActivity receiver otherChannelDeepLink url:" + data.toString());
                    String queryParameter = data.getQueryParameter(MessageKey.MSG_ID);
                    String queryParameter2 = data.getQueryParameter("checkCode");
                    String queryParameter3 = data.getQueryParameter(MessageKey.MSG_PUSH_CHANNEL);
                    String queryParameter4 = data.getQueryParameter(am.aF);
                    String queryParameter5 = data.getQueryParameter("customContent");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        this.f8433g = Integer.parseInt(queryParameter3);
                    }
                    if (queryParameter != null && !TextUtils.isEmpty(queryParameter) && queryParameter2 != null && !TextUtils.isEmpty(queryParameter2)) {
                        Md5.md5(queryParameter);
                        String queryParameter6 = data.getQueryParameter("jumpType");
                        String queryParameter7 = data.getQueryParameter("targetActivity");
                        if (a(getApplicationContext(), queryParameter, this.f8433g + "", queryParameter6 + "", queryParameter7, queryParameter4)) {
                            if (queryParameter6 != null && queryParameter7 != null && !TextUtils.isEmpty(queryParameter7)) {
                                if (queryParameter7 != null && queryParameter7.length() > 0) {
                                    if (queryParameter6 != null && queryParameter6.equals("0")) {
                                        a(queryParameter5);
                                    } else if (queryParameter6 != null && queryParameter6.equals("1")) {
                                        a(queryParameter7, queryParameter5);
                                    } else if (queryParameter6 != null && queryParameter6.equals("2")) {
                                        b(queryParameter7);
                                    } else if (queryParameter6 != null && queryParameter6.equals("3")) {
                                        b(queryParameter7, queryParameter5);
                                    }
                                }
                                CommonWorkingThread.getInstance().execute(new TTask(this, data) { // from class: com.tencent.android.tpush.TpnsActivity.3

                                    /* renamed from: a  reason: collision with root package name */
                                    public final /* synthetic */ Uri f8439a;
                                    public final /* synthetic */ TpnsActivity b;

                                    @Override // com.tencent.tpns.baseapi.base.util.TTask
                                    public void TRun() {
                                    }
                                });
                            }
                            TLogger.i("TpnsActivity", "TpnsActivity receiver jumpType == null || targetIntent == null");
                            a(queryParameter5);
                            CommonWorkingThread.getInstance().execute(new TTask(this, data) { // from class: com.tencent.android.tpush.TpnsActivity.3

                                /* renamed from: a  reason: collision with root package name */
                                public final /* synthetic */ Uri f8439a;
                                public final /* synthetic */ TpnsActivity b;

                                @Override // com.tencent.tpns.baseapi.base.util.TTask
                                public void TRun() {
                                }
                            });
                        } else {
                            TLogger.w("TpnsActivity", "checkValidRequest failed");
                        }
                    }
                }
            } catch (Throwable th) {
                TLogger.ii("TpnsActivity", "TpnsActivity receiver e:" + th);
                finish();
                return;
            }
        }
        finish();
    }

    private void d(Intent intent) {
        XGPushManager.a(getApplicationContext(), intent);
    }

    public static long getMsgIdWithIntent(Intent intent) {
        long j2;
        Uri data;
        Object obj;
        if (intent == null) {
            return 0L;
        }
        try {
            Bundle extras = intent.getExtras();
            if (extras != null && (obj = extras.get(MessageKey.MSG_ID)) != null) {
                if (obj instanceof String) {
                    j2 = Long.parseLong((String) obj);
                } else if (obj instanceof Long) {
                    j2 = ((Long) obj).longValue();
                }
                if (j2 != 0 && (data = intent.getData()) != null) {
                    String queryParameter = data.getQueryParameter(MessageKey.MSG_ID);
                    return !i.b(queryParameter) ? Long.parseLong(queryParameter) : j2;
                }
            }
            j2 = 0;
            return j2 != 0 ? j2 : j2;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static boolean isMonitorActivityNames(String str) {
        return (b == null || i.b(str) || !b.contains(str)) ? false : true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            TLogger.i("TpnsActivity", "TpnsActivity receiver intent:" + intent);
            if (intent != null && intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                if (extras.containsKey(MessageKey.MSG_PUSH_CHANNEL) && (extras.get(MessageKey.MSG_PUSH_CHANNEL) instanceof String) && (string = extras.getString(MessageKey.MSG_PUSH_CHANNEL)) != null && !TextUtils.isEmpty(string)) {
                    int intValue = Integer.valueOf(string).intValue();
                    this.f8433g = intValue;
                    if (intValue == 101) {
                        b(intent);
                    }
                }
            }
            if (a(intent)) {
                this.f8433g = intent.getIntExtra(MessageKey.MSG_PUSH_CHANNEL, 100);
                finish();
                return;
            }
            c(intent);
        } catch (Throwable th) {
            TLogger.ww("TpnsActivity", "warning", th);
            try {
                finish();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
    }

    private boolean a(Intent intent) {
        if (intent == null || !intent.hasExtra(MessageKey.MSG_PORTECT_TAG)) {
            return false;
        }
        String stringExtra = intent.getStringExtra(MessageKey.MSG_PORTECT_TAG);
        if (i.b(stringExtra)) {
            return false;
        }
        try {
            Long valueOf = Long.valueOf(Rijndael.decrypt(stringExtra));
            if (valueOf.longValue() > 0) {
                return System.currentTimeMillis() >= valueOf.longValue();
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle, XGPushClickedResult xGPushClickedResult) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String str;
        String str2;
        long j2;
        try {
            string = bundle.getString("groupId");
            string2 = bundle.getString("ts");
            string3 = bundle.getString(MessageKey.MSG_TARGET_TYPE);
            string4 = bundle.getString(MessageKey.MSG_BUSI_MSG_ID);
            string5 = bundle.getString(MessageKey.MSG_ID);
            string6 = bundle.getString(MessageKey.MSG_PUSH_TIME);
            string7 = bundle.getString(MessageKey.MSG_SOURCE);
            string8 = bundle.getString("type");
            string9 = bundle.getString(MessageKey.MSG_PUSH_CHANNEL);
            string10 = bundle.getString(MessageKey.MSG_TEMPLATE_ID);
            string11 = bundle.getString(MessageKey.MSG_TRACE_ID);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Intent intent = new Intent();
            if (string4 != null) {
                long longValue = Long.valueOf(f8431e).longValue();
                str = MessageKey.MSG_TRACE_ID;
                str2 = MessageKey.MSG_TEMPLATE_ID;
                j2 = longValue;
            } else {
                str = MessageKey.MSG_TRACE_ID;
                str2 = MessageKey.MSG_TEMPLATE_ID;
                j2 = 0;
            }
            intent.putExtra(MessageKey.MSG_BUSI_MSG_ID, j2);
            intent.putExtra(MessageKey.MSG_ID, string5 != null ? Long.valueOf(string5).longValue() : 0L);
            intent.putExtra("type", string8 != null ? Long.valueOf(string8).longValue() : 1L);
            intent.putExtra("groupId", string);
            intent.putExtra(MessageKey.MSG_PUSH_CHANNEL, string9 != null ? Integer.valueOf(string9).intValue() : 101);
            intent.putExtra(MessageKey.MSG_TARGET_TYPE, string3 != null ? Long.valueOf(string3).longValue() : 0L);
            intent.putExtra(MessageKey.MSG_PUSH_TIME, string6 != null ? Long.valueOf(string6).longValue() * 1000 : 0L);
            intent.putExtra(MessageKey.MSG_SOURCE, string7 != null ? Long.valueOf(string7).longValue() : 0L);
            intent.putExtra(MessageKey.MSG_CREATE_TIMESTAMPS, string2 != null ? Long.valueOf(string2).longValue() * 1000 : 0L);
            String str3 = str2;
            intent.putExtra(str3, string10);
            String str4 = str;
            intent.putExtra(str4, string11);
            d(intent);
            Intent intent2 = new Intent(Constants.ACTION_FEEDBACK);
            intent2.setPackage(getApplicationContext().getPackageName());
            intent2.putExtra(Constants.FEEDBACK_TAG, 4);
            intent2.putExtra(Constants.FEEDBACK_ERROR_CODE, 0);
            intent2.putExtra(Constants.PUSH_CHANNEL, string9 != null ? Integer.valueOf(string9).intValue() : 101);
            intent2.putExtra("action", NotificationAction.clicked.getType());
            int i2 = xGPushClickedResult.notificationActionType;
            if (i2 == 0) {
                i2 = NotificationAction.activity.getType();
            }
            intent2.putExtra("notificationActionType", i2);
            intent2.putExtra("custom_content", xGPushClickedResult.customContent);
            intent2.putExtra(MessageKey.MSG_ID, string5 != null ? Long.valueOf(string5).longValue() : 0L);
            intent2.putExtra(str3, string10);
            intent2.putExtra(str4, string11);
            String str5 = xGPushClickedResult.activityName;
            if (str5 != null && !TextUtils.isEmpty(str5)) {
                intent2.putExtra("activity", xGPushClickedResult.activityName);
            } else {
                String a2 = a(this);
                this.f8432f = a2;
                intent2.putExtra("activity", a2);
            }
            BroadcastAgent.sendBroadcast(getApplicationContext(), intent2);
        } catch (Throwable th2) {
            th = th2;
            TLogger.ii("TpnsActivity", "TpnsActivity reportAndFeekbackFcmChannelDeepLink e:" + th);
        }
    }

    private void c(String str, String str2) {
        try {
            Intent intent = new Intent();
            TLogger.i("TpnsActivity", "InnerTpnsActivity receiver jumpOtherChannelIntentAction targetActivity:" + str);
            intent.setAction(str);
            intent.setPackage(getPackageName());
            intent.setFlags(268435456);
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("custom_content", str2);
            }
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
            finish();
        } catch (Throwable th) {
            TLogger.e("TpnsActivity", "jumpOtherChannelIntentAction error: ", th);
        }
    }

    private void b(String str) {
        try {
            TLogger.i("TpnsActivity", "TpnsActivity receiver jumpOtherChannelUrl targetActivity :" + str);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            intent.putExtra(MessageKey.MSG_PUSH_CHANNEL, this.f8433g);
            startActivity(intent);
        } catch (Throwable th) {
            TLogger.e("TpnsActivity", "openUrl error.", th);
        }
    }

    private void b(String str, String str2) {
        try {
            Intent intent = new Intent();
            TLogger.i("TpnsActivity", "TpnsActivity receiver jumpOtherChannelIntent targetActivity:" + str);
            Class<?> cls = Class.forName("android.content.Intent");
            Object invoke = cls.getDeclaredMethod(new String(Base64.decode("cGFyc2VVcmk=", 0), "UTF-8"), String.class, Integer.TYPE).invoke(cls, str, 1);
            if (invoke != null) {
                intent = (Intent) invoke;
            }
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra(MessageKey.MSG_PUSH_CHANNEL, this.f8433g);
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("custom_content", str2);
            }
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        } catch (Throwable th) {
            TLogger.e("TpnsActivity", "jumpOtherChannelIntent error.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Uri uri) {
        String str;
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String str2;
        String str3;
        long j2;
        String str4;
        long j3;
        try {
            String queryParameter9 = uri.getQueryParameter("jumpType");
            String queryParameter10 = uri.getQueryParameter(MessageKey.MSG_BUSI_MSG_ID);
            String queryParameter11 = uri.getQueryParameter(MessageKey.MSG_ID);
            String queryParameter12 = uri.getQueryParameter("msgType");
            try {
                queryParameter = uri.getQueryParameter("groupId");
                queryParameter2 = uri.getQueryParameter(MessageKey.MSG_PUSH_CHANNEL);
            } catch (Throwable th) {
                th = th;
            }
            try {
                queryParameter3 = uri.getQueryParameter(MessageKey.MSG_TARGET_TYPE);
                String queryParameter13 = uri.getQueryParameter(MessageKey.MSG_PUSH_TIME);
                String queryParameter14 = uri.getQueryParameter(MessageKey.MSG_SOURCE);
                queryParameter4 = uri.getQueryParameter("timestamp");
                queryParameter5 = uri.getQueryParameter("customContent");
                queryParameter6 = uri.getQueryParameter("targetActivity");
                queryParameter7 = uri.getQueryParameter("tmpl");
                queryParameter8 = uri.getQueryParameter("trace");
                Intent intent = new Intent();
                if (queryParameter10 != null) {
                    str2 = queryParameter13;
                    str3 = queryParameter14;
                    j2 = Long.valueOf(queryParameter10).longValue();
                } else {
                    str2 = queryParameter13;
                    str3 = queryParameter14;
                    j2 = 0;
                }
                intent.putExtra(MessageKey.MSG_BUSI_MSG_ID, j2);
                intent.putExtra(MessageKey.MSG_ID, queryParameter11 != null ? Long.valueOf(queryParameter11).longValue() : 0L);
                intent.putExtra("type", queryParameter12 != null ? Long.valueOf(queryParameter12).longValue() : 1L);
                intent.putExtra("groupId", queryParameter);
                intent.putExtra(MessageKey.MSG_PUSH_CHANNEL, queryParameter2 != null ? Integer.valueOf(queryParameter2).intValue() : 0);
                intent.putExtra(MessageKey.MSG_TARGET_TYPE, queryParameter3 != null ? Long.valueOf(queryParameter3).longValue() : 0L);
                intent.putExtra(MessageKey.MSG_PUSH_TIME, str2 != null ? Long.valueOf(str2).longValue() * 1000 : 0L);
                if (str3 != null) {
                    j3 = Long.valueOf(str3).longValue();
                    str4 = MessageKey.MSG_SOURCE;
                } else {
                    str4 = MessageKey.MSG_SOURCE;
                    j3 = 0;
                }
                intent.putExtra(str4, j3);
                intent.putExtra(MessageKey.MSG_CREATE_TIMESTAMPS, queryParameter4 != null ? Long.valueOf(queryParameter4).longValue() * 1000 : 0L);
                intent.putExtra(MessageKey.MSG_TEMPLATE_ID, queryParameter7);
                intent.putExtra(MessageKey.MSG_TRACE_ID, queryParameter8);
                d(intent);
                str = "TpnsActivity";
            } catch (Throwable th2) {
                th = th2;
                str = "TpnsActivity";
                TLogger.ii(str, "TpnsActivity reportOtherChannelDeepLink exception:" + th);
            }
            try {
                TLogger.i(str, "TpnsActivity receiver params : msgBuildId " + queryParameter10 + " , msgId = " + queryParameter11 + " , jumpType = " + queryParameter9 + " , msgType = " + queryParameter12 + " , groupId = " + queryParameter + " , pushChannel = " + queryParameter2 + " , targetType = " + queryParameter3 + " , pushTime = " + str2 + " , source = " + str3 + " , timestamp = " + queryParameter4 + " , templateId = " + queryParameter7 + " , traceId = " + queryParameter8);
                Intent intent2 = new Intent(Constants.ACTION_FEEDBACK);
                intent2.setPackage(getApplicationContext().getPackageName());
                intent2.putExtra(Constants.FEEDBACK_TAG, 4);
                intent2.putExtra(Constants.FEEDBACK_ERROR_CODE, 0);
                intent2.putExtra(Constants.PUSH_CHANNEL, queryParameter2 != null ? Integer.valueOf(queryParameter2).intValue() : 0);
                intent2.putExtra("action", NotificationAction.clicked.getType());
                intent2.putExtra("notificationActionType", queryParameter9 != null ? Integer.valueOf(queryParameter9).intValue() : NotificationAction.activity.getType());
                intent2.putExtra("custom_content", queryParameter5);
                intent2.putExtra(MessageKey.MSG_ID, queryParameter11 != null ? Long.valueOf(queryParameter11).longValue() : 0L);
                intent2.putExtra(MessageKey.MSG_TEMPLATE_ID, queryParameter7);
                intent2.putExtra(MessageKey.MSG_TRACE_ID, queryParameter8);
                if (queryParameter6 != null && !TextUtils.isEmpty(queryParameter6)) {
                    intent2.putExtra("activity", queryParameter6);
                } else {
                    String a2 = a(this);
                    this.f8432f = a2;
                    intent2.putExtra("activity", a2);
                }
                BroadcastAgent.sendBroadcast(getApplicationContext(), intent2);
            } catch (Throwable th3) {
                th = th3;
                TLogger.ii(str, "TpnsActivity reportOtherChannelDeepLink exception:" + th);
            }
        } catch (Throwable th4) {
            th = th4;
            str = "TpnsActivity";
        }
    }

    private void a(String str, String str2) {
        try {
            Intent intent = new Intent();
            TLogger.i("TpnsActivity", "TpnsActivity receiver  jumpOtherChannelActivitys targetActivity = " + str);
            intent.setClassName(getApplicationContext(), str);
            intent.putExtra(MessageKey.MSG_PUSH_CHANNEL, this.f8433g);
            intent.setFlags(603979776);
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("custom_content", str2);
            }
            startActivity(intent);
        } catch (Throwable th) {
            TLogger.ii("TpnsActivity", "TpnsActivity receiver jumpOtherChannelActivitys = " + th);
        }
    }

    private void a(String str) {
        Intent intent = new Intent();
        String str2 = this.f8432f;
        if (str2 == null || TextUtils.isEmpty(str2)) {
            this.f8432f = a(this);
        }
        TLogger.i("TpnsActivity", "TpnsActivity receiver  jumpOtherChannelActivity targetActivity = " + this.f8432f);
        intent.setClassName(getApplicationContext(), this.f8432f);
        intent.setFlags(603979776);
        intent.putExtra(MessageKey.MSG_PUSH_CHANNEL, this.f8433g);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("custom_content", str);
        }
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            TLogger.ii("TpnsActivity", "TpnsActivity receiver ActivityNotFoundException = " + e2);
        }
    }

    private static String a(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 0)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    return activityInfo.name;
                }
            }
        } catch (Throwable th) {
            TLogger.e("TpnsActivity", "get Activity error", th);
        }
        return null;
    }

    private boolean a(Context context, String str, String str2, String str3, String str4, String str5) {
        String str6;
        String packageName;
        String str7 = "";
        try {
            TLogger.d("TpnsActivity", "msgid:" + str + "pushChannel:" + str2 + "jumptype:" + str3 + "target:" + str4 + "checksum:" + str5 + "");
            if (TextUtils.isEmpty(str5)) {
                TLogger.w("TpnsActivity", "checksum was null");
                a(context, str, ErrCode.CHECK_CLICK_RESULT_ERROR_CHECK_SUM_NULL, "checksum was null");
                return false;
            } else if (TextUtils.isEmpty(str)) {
                TLogger.w("TpnsActivity", "msgid was null");
                return false;
            } else {
                if (this.f8434h == null) {
                    this.f8434h = d.a("MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAMw0HSS1vXYrOeuXPEIKiJpe4xY9flsHmWb21O34FZVBwXnrKtDWgPQY+uV48ZJ6bVzaySwNrAa/eJo1HrOgVk8CAwEAAQ==");
                }
                try {
                    str6 = d.a(Base64.decode(str5, 0), this.f8434h);
                } catch (Exception e2) {
                    TLogger.e("TpnsActivity", "checkValidRequest decrypt failed, err:" + e2.toString());
                    a(context, str, ErrCode.CHECK_CLICK_RESULT_ERROR_CHECK_SUM_DECRYPT_FAILED, "decryptChecksum failed " + e2.toString());
                    str6 = "";
                }
                TLogger.d("TpnsActivity", "decryptChecksum:" + str6);
                if (str6 != null && !TextUtils.isEmpty(str6)) {
                    int length = str6.length();
                    int i2 = length - 1;
                    int parseInt = Integer.parseInt(str6.substring(i2, length));
                    TLogger.w("TpnsActivity", "pushType:" + parseInt);
                    if (parseInt == 1) {
                        packageName = XGPushConfig.getToken(context);
                    } else if (parseInt == 2) {
                        packageName = context.getPackageName();
                    } else {
                        TLogger.w("TpnsActivity", "invalid pushType: " + parseInt);
                        a(context, str, ErrCode.CHECK_CLICK_RESULT_ERROR_CHECK_SUM_INVALID_PUSH_TYPE, "invalid pushType: " + parseInt);
                        return false;
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        str7 = str4;
                    }
                    if (!TextUtils.isEmpty(str6) && str6.length() >= 2) {
                        String substring = str6.substring(0, i2);
                        String md5 = Md5.md5(str + str2 + packageName + str3 + str7);
                        StringBuilder sb = new StringBuilder();
                        sb.append("decryptChecksum:");
                        sb.append(substring);
                        sb.append(" , md5Str:");
                        sb.append(md5);
                        TLogger.d("TpnsActivity", sb.toString());
                        if (substring.equalsIgnoreCase(md5)) {
                            return true;
                        }
                        TLogger.w("TpnsActivity", "decryptChecksum was invalid");
                        a(context, str, ErrCode.CHECK_CLICK_RESULT_ERROR_CHECK_SUM_MISMATCH, "decryptChecksum mismatch");
                        return false;
                    }
                    TLogger.w("TpnsActivity", "decryptChecksum was invalid:" + str6);
                    a(context, str, ErrCode.CHECK_CLICK_RESULT_ERROR_CHECK_SUM_DECRYPT_FAILED, "decryptChecksum was null");
                    return false;
                }
                TLogger.w("TpnsActivity", "decryptChecksum was null");
                return false;
            }
        } catch (Throwable th) {
            TLogger.e("TpnsActivity", "checkValidRequest failed, err:" + th);
            a(context, str, ErrCode.CHECK_CLICK_RESULT_ERROR_OTHER, "decryptChecksum other error: " + th.toString());
            return false;
        }
    }

    private void a(Context context, String str, int i2, String str2) {
        CommonWorkingThread.getInstance().execute(new TTask(this, context, i2, str2, str) { // from class: com.tencent.android.tpush.TpnsActivity.2

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f8436a;
            public final /* synthetic */ int b;
            public final /* synthetic */ String c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ String f8437d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ TpnsActivity f8438e;

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        });
    }
}
