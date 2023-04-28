package com.tencent.android.tpush;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.showstartfans.activity.view.videocut.VideoTrimmerView;
import com.sobot.network.http.SobotOkHttpUtils;
import com.tencent.android.tpush.c.d;
import com.tencent.android.tpush.common.AppInfos;
import com.tencent.android.tpush.common.BroadcastAgent;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.android.tpush.common.ReturnCode;
import com.tencent.android.tpush.common.h;
import com.tencent.android.tpush.common.i;
import com.tencent.android.tpush.data.MessageId;
import com.tencent.android.tpush.encrypt.Rijndael;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.android.tpush.message.MessageManager;
import com.tencent.android.tpush.message.PushMessageManager;
import com.tencent.android.tpush.message.e;
import com.tencent.android.tpush.service.XGVipPushService;
import com.tencent.android.tpush.service.cache.CacheManager;
import com.tencent.android.tpush.service.protocol.j;
import com.tencent.android.tpush.service.protocol.m;
import com.tencent.android.tpush.service.protocol.n;
import com.tencent.android.tpush.service.util.SharePrefsUtil;
import com.tencent.android.tpush.service.util.f;
import com.tencent.android.tpush.service.util.g;
import com.tencent.android.tpush.stat.ServiceStat;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.api.TPErrorCode;
import com.tencent.tpns.baseapi.XGApiConfig;
import com.tencent.tpns.baseapi.base.PushPreferences;
import com.tencent.tpns.baseapi.base.device.GUIDInfo;
import com.tencent.tpns.baseapi.base.device.GuidInfoManager;
import com.tencent.tpns.baseapi.base.logger.TBaseLogger;
import com.tencent.tpns.baseapi.base.security.Security;
import com.tencent.tpns.baseapi.base.util.CacheHelper;
import com.tencent.tpns.baseapi.base.util.CommonWorkingThread;
import com.tencent.tpns.baseapi.base.util.Md5;
import com.tencent.tpns.baseapi.base.util.NetworkUtil;
import com.tencent.tpns.baseapi.base.util.PushMd5Pref;
import com.tencent.tpns.baseapi.base.util.TGlobalHelper;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.baseapi.core.net.HttpRequestCallback;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Pattern;
import net.sourceforge.pinyin4j.ChineseToPinyinResource;
import org.json.JSONArray;
import org.json.JSONObject;
import tencent.txlive.zhibo.TCConstants;

/* compiled from: ProGuard */
@JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.RECEIVERCHECK, EType.INTENTCHECK})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class XGPushManager {
    public static final int MAX_TAG_LENGTH = 50;
    public static final int MAX_TAG_SIZE = 500;
    public static final int OPERATION_FAIL = 1;
    public static final int OPERATION_REQ_REGISTER = 100;
    public static final int OPERATION_REQ_UNREGISTER = 101;
    public static final int OPERATION_SUCCESS = 0;
    public static Map<String, Long> lastSuccessRegisterMap = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private static boolean f8479a = false;
    private static Context b = null;
    private static Long c = 0L;

    /* renamed from: d  reason: collision with root package name */
    private static long f8480d = 30000;

    /* renamed from: e  reason: collision with root package name */
    private static volatile TTask f8481e = null;

    /* renamed from: f  reason: collision with root package name */
    private static volatile Queue<Long> f8482f = new ConcurrentLinkedQueue();

    /* renamed from: g  reason: collision with root package name */
    private static XGPushNotifactionCallback f8483g = null;

    /* renamed from: h  reason: collision with root package name */
    private static XGSysPushNotifactionCallback f8484h = null;

    /* renamed from: i  reason: collision with root package name */
    private static Map<b, c> f8485i = new ConcurrentHashMap();

    /* renamed from: j  reason: collision with root package name */
    private static final char[] f8486j = "0123456789ABCDEF".toCharArray();

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AccountInfo {
        public String accountName;
        public int accountType;

        public AccountInfo(int i2, String str) {
            this.accountType = i2;
            this.accountName = str;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public enum AccountType {
        UNKNOWN(0),
        CUSTOM(1),
        QQ(TCConstants.RECORD_TYPE_CAMERA),
        QQMD5(TCConstants.RECORD_TYPE_SCREEN),
        IDFA(993),
        IDFMD5(994),
        MAC(995),
        MACMDS(996),
        OAID(997),
        OAIDMD5(998),
        UNIONID(TPErrorCode.TP_ERROR_TYPE_UNKONW),
        IMEI(1000),
        IMEIMD5(1001),
        PHONE_NUMBER(1002),
        WX_OPEN_ID(1003),
        QQ_OPEN_ID(1004),
        EMAIL(1005),
        SINA_WEIBO(1006),
        ALIPAY(1007),
        TAOBAO(1008),
        DOUBAN(1009),
        FACEBOOK(1010),
        TWITTER(1011),
        GOOGLE(1012),
        BAIDU(1013),
        JINGDONG(1014),
        LINKEDIN(1015);
        
        private int value;

        AccountType(int i2) {
            this.value = i2;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a extends TTask {

        /* renamed from: a  reason: collision with root package name */
        private Context f8555a;
        private Intent b;
        private XGIOperateCallback c;

        /* renamed from: d  reason: collision with root package name */
        private int f8556d;

        /* renamed from: e  reason: collision with root package name */
        private int f8557e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f8558f;

        public a(XGIOperateCallback xGIOperateCallback, Context context, Intent intent, int i2, int i3, boolean z) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public Context f8559a;
        public Intent b;
        public XGIOperateCallback c;

        /* renamed from: d  reason: collision with root package name */
        public int f8560d;

        public b(Context context, Intent intent, XGIOperateCallback xGIOperateCallback) {
            this.f8559a = null;
            this.b = null;
            this.c = null;
            this.f8560d = 0;
            this.f8559a = context;
            this.b = intent;
            this.c = xGIOperateCallback;
            this.f8560d = intent.getIntExtra("opType", 0);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                CommonWorkingThread.getInstance().getHandler().removeCallbacks((c) XGPushManager.f8485i.remove(this));
                TLogger.d("XGPushManager", "Service start from app :" + intent.getStringExtra("pkg") + " , sdk version:" + intent.getStringExtra("ver"));
                int i2 = this.f8560d;
                if (i2 == 0) {
                    XGPushManager.c(this.f8559a, this.b, this.c);
                } else if (i2 == 1) {
                    XGPushManager.d(this.f8559a, this.b, this.c);
                } else {
                    TLogger.e("XGPushManager", "RegisterStartReceiver error optype:" + this.f8560d);
                }
                i.a(this.f8559a, this);
            } catch (Throwable th) {
                TLogger.e("XGPushManager", "RegisterStartReceiver error", th);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class c extends TTask {

        /* renamed from: a  reason: collision with root package name */
        public Context f8561a;
        public Intent b;
        public XGIOperateCallback c;

        /* renamed from: d  reason: collision with root package name */
        public int f8562d;

        public c(Context context, Intent intent, XGIOperateCallback xGIOperateCallback) {
            this.f8561a = null;
            this.b = null;
            this.c = null;
            this.f8562d = 0;
            this.f8561a = context;
            this.b = intent;
            this.c = xGIOperateCallback;
            this.f8562d = intent.getIntExtra("opType", 0);
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
            try {
                int i2 = this.f8562d;
                if (i2 == 0) {
                    CommonWorkingThread.getInstance().execute(new TTask(this) { // from class: com.tencent.android.tpush.XGPushManager.c.1

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ c f8563a;

                        @Override // com.tencent.tpns.baseapi.base.util.TTask
                        public void TRun() {
                        }
                    });
                } else if (i2 != 1) {
                    TLogger.e("XGPushManager", "TimeoutRunnable error optype:" + this.f8562d);
                } else {
                    XGPushManager.d(this.f8561a, this.b, this.c);
                }
                for (b bVar : XGPushManager.f8485i.keySet()) {
                    i.a(this.f8561a, bVar);
                }
                XGPushManager.f8485i.clear();
            } catch (Throwable th) {
                TLogger.e("XGPushManager", " RegisterTimeoutRunnable run error", th);
            }
        }
    }

    private XGPushManager() {
    }

    public static long addLocalNotification(Context context, XGLocalMessage xGLocalMessage) {
        return a(context, xGLocalMessage, -1L);
    }

    public static void addLocalNotificationList(final Context context, ArrayList<XGLocalMessage> arrayList) {
        Iterator<XGLocalMessage> it = arrayList.iterator();
        while (it.hasNext()) {
            final XGLocalMessage next = it.next();
            CommonWorkingThread.getInstance().execute(new TTask() { // from class: com.tencent.android.tpush.XGPushManager.13
                @Override // com.tencent.tpns.baseapi.base.util.TTask
                public void TRun() {
                    long a2 = XGPushManager.a(context, next, -1L);
                    TLogger.i("XGPushManager", "ret :" + a2 + ",msgID:" + next.getMsgId());
                }
            }, 1000L);
        }
    }

    @Deprecated
    public static void addTags(Context context, String str, Set<String> set) {
        appendTags(context, str, set);
    }

    @Deprecated
    public static void appendAccount(Context context, String str, XGIOperateCallback xGIOperateCallback) {
        upsertAccounts(context, str, xGIOperateCallback);
    }

    @Deprecated
    public static void appendTags(Context context, String str, Set<String> set) {
        if (context != null && set != null && !set.isEmpty()) {
            String a2 = a(set, "addTags");
            if (g.a(a2)) {
                TLogger.ee("XGPushManager", "addTags -> getTagsFromSet return null!!!");
                return;
            }
            TLogger.ii("XGPushManager", "addTags -> setTags with all tags = " + a2);
            a(context, a2, 5, -1L, (String) null, str);
            return;
        }
        TLogger.ee("XGPushManager", "the parameter context or tags of addTags is invalid.");
    }

    @Deprecated
    public static void bindAccount(Context context, String str, XGIOperateCallback xGIOperateCallback) {
        clearAndAppendAccount(context, str, xGIOperateCallback);
    }

    public static String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            char[] cArr2 = f8486j;
            cArr[i4] = cArr2[i3 >>> 4];
            cArr[i4 + 1] = cArr2[i3 & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str, int i2, String str2, final XGIOperateCallback xGIOperateCallback) {
        if (context != null) {
            if (c()) {
                if (xGIOperateCallback != null) {
                    ReturnCode returnCode = ReturnCode.CODE_SDK_API_FREQUENCY_LIMIT_ERROR;
                    xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
                    return;
                }
                return;
            } else if (i.a(context) > 0) {
                return;
            } else {
                if (str != null) {
                    long accessId = XGPushConfig.getAccessId(context);
                    String accessKey = XGPushConfig.getAccessKey(context);
                    if (accessId >= 0 && !g.a(accessKey)) {
                        Intent intent = new Intent(context.getPackageName() + "com.tencent.android.xg.vip.action.ATTRIBUTE.V4");
                        intent.putExtra("accId", accessId);
                        intent.putExtra(Constants.FLAG_ACC_KEY, Rijndael.encrypt(accessKey));
                        intent.putExtra(Constants.FLAG_PACK_NAME, Rijndael.encrypt(context.getPackageName()));
                        intent.putExtra(Constants.FLAG_ATTRIBUTES_TYPE, i2);
                        intent.putExtra(Constants.FLAG_ATTRIBUTES_NAME, Rijndael.encrypt(str));
                        intent.putExtra(Constants.FLAG_ATTRIBUTES_OPER_NAME, str2);
                        if (xGIOperateCallback != null) {
                            try {
                                BroadcastAgent.registerReceiver(context, new BroadcastReceiver() { // from class: com.tencent.android.tpush.XGPushManager.3
                                    @Override // android.content.BroadcastReceiver
                                    public void onReceive(Context context2, Intent intent2) {
                                        TLogger.ii("XGPushManager", "attributes call back to " + context2.getPackageName());
                                        try {
                                            CommonWorkingThread.getInstance().execute(new TTask(this, intent2) { // from class: com.tencent.android.tpush.XGPushManager.3.1

                                                /* renamed from: a  reason: collision with root package name */
                                                public final /* synthetic */ Intent f8533a;
                                                public final /* synthetic */ AnonymousClass3 b;

                                                @Override // com.tencent.tpns.baseapi.base.util.TTask
                                                public void TRun() {
                                                }
                                            });
                                        } catch (Throwable unused) {
                                        }
                                        i.a(context2, this);
                                    }
                                }, new IntentFilter("com.tencent.android.xg.vip.action.ATTRIBUTE.RESULT.V4"), 4);
                            } catch (Throwable unused) {
                            }
                        }
                        BroadcastAgent.sendBroadcast(context, intent);
                        return;
                    }
                    throw new IllegalArgumentException("The accessId or accessKey not set!");
                }
                throw new IllegalArgumentException("The attributes parameter can not be null!");
            }
        }
        throw new IllegalArgumentException("The context parameter can not be null!");
    }

    public static void cancelAllNotifaction(Context context) {
        try {
            ((NotificationManager) context.getSystemService("notification")).cancelAll();
            if (XGPushConfig.isUsedOtherPush(context) && "xiaomi".equalsIgnoreCase(d.a(context).j())) {
                Class<?> cls = Class.forName("com.xiaomi.mipush.sdk.MiPushClient");
                cls.getDeclaredMethod("clearNotification", Context.class).invoke(cls, context);
            }
        } catch (Throwable th) {
            TLogger.e("XGPushManager", "cancelAllNotifaction error " + th.toString());
        }
    }

    public static void cancelNotifaction(Context context, int i2) {
        try {
            ((NotificationManager) context.getSystemService("notification")).cancel(i2);
        } catch (Throwable th) {
            TLogger.e("XGPushManager", "cancelNotification error " + th.toString());
        }
    }

    @Deprecated
    public static void cleanTags(Context context, String str) {
        clearTags(context, str);
    }

    public static void clearAccounts(Context context) {
        if (context == null) {
            TLogger.ee("XGPushManager", "the parameter context of delAllAccount is null.");
        } else {
            clearAccounts(context, new XGIOperateCallback() { // from class: com.tencent.android.tpush.XGPushManager.27
                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onFail(Object obj, int i2, String str) {
                    TLogger.ee("XGPushManager", "TPNS deleteAllAccount failed, errCode =  " + i2 + ", msg = " + str);
                }

                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onSuccess(Object obj, int i2) {
                    TLogger.ii("XGPushManager", "TPNS deleteAllAccount success" + obj);
                }
            });
        }
    }

    @Deprecated
    public static void clearAndAppendAccount(Context context, String str, XGIOperateCallback xGIOperateCallback) {
        String a2 = a(str, 0);
        if (context != null && !g.a(str) && !g.a(a2)) {
            b(context, a2, 0L, (String) null, 0, str, xGIOperateCallback);
            return;
        }
        TLogger.ee("XGPushManager", "the parameter context or account of bindAccount is null.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        ReturnCode returnCode = ReturnCode.CODE_INVALID_ACCOUNT;
        xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
    }

    public static void clearAndAppendAttributes(Context context, String str, Map<String, String> map, XGIOperateCallback xGIOperateCallback) {
        if (context != null && map != null && !map.isEmpty()) {
            String a2 = a(map);
            if (a("clearAndAppendAttributes", a2)) {
                TLogger.ii("XGPushManager", "clearAndAppendAttributes with all attribute = " + a2);
                b(context, a2, 2, str, xGIOperateCallback);
                return;
            }
            return;
        }
        TLogger.ee("XGPushManager", "the parameter context or attributes of clearAndAppendAttributes is invalid.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        ReturnCode returnCode = ReturnCode.CODE_INVALID_ATTRIBUTE;
        xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
    }

    @Deprecated
    public static void clearAndAppendTags(Context context, String str, Set<String> set) {
        if (context != null && set != null && !set.isEmpty()) {
            String a2 = a(set, "setTags");
            if (g.a(a2)) {
                TLogger.ee("XGPushManager", "setTags -> getTagsFromSet return null!!!");
                return;
            }
            TLogger.ii("XGPushManager", "Action -> setTags with all tags = " + a2);
            a(context, a2, 6, -1L, (String) null, str);
            return;
        }
        TLogger.ee("XGPushManager", "the parameter context or tags of setTags is invalid.");
    }

    public static void clearAttributes(Context context, String str, XGIOperateCallback xGIOperateCallback) {
        if (context == null) {
            TLogger.ee("XGPushManager", "the parameter context of clearAttributes is invalid");
            if (context == null || xGIOperateCallback == null) {
                return;
            }
            ReturnCode returnCode = ReturnCode.CODE_INVALID_ATTRIBUTE;
            xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
            return;
        }
        TLogger.ii("XGPushManager", "Action -> clearAttributes");
        b(context, "{}", 4, str, xGIOperateCallback);
    }

    public static void clearLocalNotifications(Context context) {
        if (context == null) {
            TLogger.e("XGPushManager", "clearLocalNotifications  context==null.");
        } else if (i.a(context) > 0) {
        } else {
            final Context applicationContext = context.getApplicationContext();
            CommonWorkingThread.getInstance().execute(new TTask() { // from class: com.tencent.android.tpush.XGPushManager.14
                @Override // com.tencent.tpns.baseapi.base.util.TTask
                public void TRun() {
                    MessageManager.getInstance().clearAllLocalMsg(applicationContext);
                }
            });
        }
    }

    public static void clearTags(Context context, String str) {
        if (context == null) {
            TLogger.ee("XGPushManager", "the parameter context of cleanTags is invalid");
            return;
        }
        TLogger.ii("XGPushManager", "Action -> cleanTags");
        a(context, "*", 8, -1L, (String) null, str);
    }

    public static void createNotificationChannel(Context context, String str, String str2, boolean z, boolean z2, boolean z3, Uri uri) {
        if (Build.VERSION.SDK_INT < 26) {
            TLogger.ii("XGPushManager", "CreateNotificationChannel SDK < 26");
            return;
        }
        try {
            Class<?> cls = Class.forName("android.app.NotificationChannel");
            Object newInstance = cls.getConstructor(String.class, CharSequence.class, Integer.TYPE).newInstance(str, str2, 4);
            Class<?> cls2 = newInstance.getClass();
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("enableVibration", cls3).invoke(newInstance, Boolean.valueOf(z));
            newInstance.getClass().getMethod("enableLights", cls3).invoke(newInstance, Boolean.valueOf(z2));
            Method method = newInstance.getClass().getMethod("setSound", Uri.class, Class.forName("android.media.AudioAttributes"));
            if (!z3) {
                method.invoke(newInstance, null, null);
            } else if (uri != null) {
                method.invoke(newInstance, uri, null);
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            notificationManager.getClass().getMethod("createNotificationChannel", cls).invoke(notificationManager, newInstance);
            TLogger.ii("XGPushManager", "CreateNotificationChannel channelId: " + str + " success");
        } catch (Throwable th) {
            TLogger.ee("XGPushManager", "CreateNotificationChannel channelId: " + str + " Error: ", th);
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, String str, int i2, long j2, String str2, String str3, final XGIOperateCallback xGIOperateCallback) {
        if (context != null) {
            if (c()) {
                if (xGIOperateCallback != null) {
                    ReturnCode returnCode = ReturnCode.CODE_SDK_API_FREQUENCY_LIMIT_ERROR;
                    xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
                    return;
                }
                return;
            } else if (i.a(context) > 0) {
                return;
            } else {
                if (str == null) {
                    throw new IllegalArgumentException("The tagName parameter can not be null!");
                }
                if (j2 <= 0) {
                    j2 = XGPushConfig.getAccessId(context);
                }
                if (j2 >= 0) {
                    if (i.b(str2)) {
                        str2 = XGPushConfig.getAccessKey(context);
                    }
                    Intent intent = new Intent(context.getPackageName() + "com.tencent.android.xg.vip.action.TAG.V4");
                    intent.putExtra("accId", j2);
                    intent.putExtra(Constants.FLAG_ACC_KEY, Rijndael.encrypt(str2));
                    intent.putExtra(Constants.FLAG_PACK_NAME, Rijndael.encrypt(context.getPackageName()));
                    intent.putExtra(Constants.FLAG_TAG_TYPE, i2);
                    intent.putExtra(Constants.FLAG_TAG_NAME, Rijndael.encrypt(str));
                    intent.putExtra(Constants.FLAG_TAG_OPER_NAME, str3);
                    if (xGIOperateCallback != null) {
                        try {
                            BroadcastAgent.registerReceiver(context, new BroadcastReceiver() { // from class: com.tencent.android.tpush.XGPushManager.8
                                @Override // android.content.BroadcastReceiver
                                public void onReceive(Context context2, Intent intent2) {
                                    TLogger.ii("XGPushManager", "Tag call back to " + context2.getPackageName());
                                    try {
                                        CommonWorkingThread.getInstance().execute(new TTask(this, intent2) { // from class: com.tencent.android.tpush.XGPushManager.8.1

                                            /* renamed from: a  reason: collision with root package name */
                                            public final /* synthetic */ Intent f8549a;
                                            public final /* synthetic */ AnonymousClass8 b;

                                            @Override // com.tencent.tpns.baseapi.base.util.TTask
                                            public void TRun() {
                                            }
                                        });
                                    } catch (Throwable th) {
                                        TLogger.e("XGPushManager", "tagManager handle callback error " + th.toString());
                                    }
                                    i.a(context2, this);
                                }
                            }, new IntentFilter("com.tencent.android.xg.vip.action.TAG.RESULT.V4"), 4);
                        } catch (Throwable th) {
                            TLogger.e("XGPushManager", "tagManager registerReceiver error " + th.toString());
                        }
                    }
                    BroadcastAgent.sendBroadcast(context, intent);
                    return;
                }
                throw new IllegalArgumentException("The accessId not set!");
            }
        }
        throw new IllegalArgumentException("The context parameter can not be null!");
    }

    @Deprecated
    public static void delAccount(Context context, String str, XGIOperateCallback xGIOperateCallback) {
        String a2 = a(str, 0);
        if (context != null && !g.a(str) && !g.a(a2)) {
            b(context, a2, 0L, (String) null, 3, str, xGIOperateCallback);
            return;
        }
        TLogger.ee("XGPushManager", "the parameter context or account of delAccount is null.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        ReturnCode returnCode = ReturnCode.CODE_INVALID_ACCOUNT;
        xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
    }

    public static void delAccounts(Context context, Set<Integer> set, XGIOperateCallback xGIOperateCallback) {
        if (context != null && set != null && set.size() > 0) {
            String b2 = b(set);
            if (g.a(b2)) {
                TLogger.ee("XGPushManager", "delAccounts | accountTypeStr is empty");
                return;
            }
            TLogger.d("XGPushManager", "delAccounts | accountTypeStr : " + b2);
            b(context, b2, 0L, (String) null, 7, b2, xGIOperateCallback);
            return;
        }
        TLogger.ee("XGPushManager", "delAccounts | the parameter context or accounts of delAccounts is null.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        ReturnCode returnCode = ReturnCode.CODE_INVALID_ACCOUNT;
        xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
    }

    @Deprecated
    public static void delAccountsByKeys(Context context, Set<Integer> set, XGIOperateCallback xGIOperateCallback) {
        delAccounts(context, set, xGIOperateCallback);
    }

    @Deprecated
    public static void delAllAccount(Context context) {
        clearAccounts(context);
    }

    public static void delAttributes(Context context, String str, Set<String> set, XGIOperateCallback xGIOperateCallback) {
        if (context != null && set != null && !set.isEmpty()) {
            String a2 = a(set);
            if (a("delAttributes", a2)) {
                TLogger.ii("XGPushManager", "delAttributes -> attributes = " + a2);
                b(context, a2, 3, str, xGIOperateCallback);
                return;
            }
            return;
        }
        TLogger.ee("XGPushManager", "the parameter context or attributes of delAttributes is invalid.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        ReturnCode returnCode = ReturnCode.CODE_INVALID_ATTRIBUTE;
        xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
    }

    @Deprecated
    public static void delTag(Context context, String str) {
        TLogger.ii("XGPushManager", "Action -> deleteTag with tag = " + str);
        if (context != null && str != null && str.trim().length() != 0) {
            a(context, str, 2, -1L, (String) null, str);
        } else {
            TLogger.ee("XGPushManager", "context is null or tagName invalid.");
        }
    }

    public static void delTags(Context context, String str, Set<String> set) {
        if (context != null && set != null && !set.isEmpty()) {
            String a2 = a(set, "deleteTags");
            if (g.a(a2)) {
                TLogger.ee("XGPushManager", "deleteTags -> getTagsFromSet return null!!!");
                return;
            }
            TLogger.ii("XGPushManager", "deleteTags -> setTags with all tags = " + a2);
            a(context, a2, 7, -1L, (String) null, str);
            return;
        }
        TLogger.ee("XGPushManager", "the parameter context or tags of deleteTags is invalid.");
    }

    public static void deleteKeyValueTag(Context context, String str, String str2) {
        if (context != null && str != null && str.trim().length() != 0) {
            String str3 = str + "::::" + str2;
            TLogger.ii("XGPushManager", "Action -> deleteKeyValueTag with tag = " + str3);
            a(context, str3, 4, -1L, (String) null, str3);
            return;
        }
        TLogger.ee("XGPushManager", "deleteKeyValueTag context or tagKey invalid.");
    }

    @Deprecated
    public static void deleteTag(Context context, String str) {
        delTag(context, str);
    }

    @Deprecated
    public static void deleteTags(Context context, String str, Set<String> set) {
        delTags(context, str, set);
    }

    public static void enableService(Context context, boolean z) {
        if (context == null) {
            return;
        }
        if (!z && i.h(context)) {
            TLogger.e("XGPushManager", "TPNS is disable.");
            stopPushService(context);
        }
        TLogger.ii("XGPushManager", "enableService=" + (z ? 1 : 0));
        PushMd5Pref.putInt(context, context.getPackageName() + ".enableService", z ? 1 : 0);
    }

    public static Context getContext() {
        return b;
    }

    public static String getCustomContentFromIntent(Context context, Intent intent) {
        Uri data;
        try {
            if (!(context instanceof Activity)) {
                TLogger.ee("XGPushManager", "getCustomContentFromIntent parse intent customContent error, please call this method through Activity context");
                return "";
            } else if (intent == null) {
                TLogger.ee("XGPushManager", "getCustomContentFromIntent parse intent customContent error, parse null intent");
                return "";
            } else {
                String stringExtra = intent.getStringExtra("custom_content");
                return (!TextUtils.isEmpty(stringExtra) || (data = intent.getData()) == null) ? stringExtra : data.getQueryParameter("customContent");
            }
        } catch (Throwable th) {
            TLogger.w("XGPushManager", "getCustomContentFromIntent parse intent customContent error: ", th);
            return "";
        }
    }

    public static XGPushNotificationBuilder getDefaultNotificationBuilder(Context context) {
        XGPushNotificationBuilder notificationBuilder = getNotificationBuilder(context, 0);
        if (notificationBuilder == null) {
            com.tencent.android.tpush.message.b.a(context);
        }
        return notificationBuilder;
    }

    public static XGPushNotifactionCallback getNotifactionCallback() {
        return f8483g;
    }

    public static XGPushNotificationBuilder getNotificationBuilder(Context context, int i2) {
        if (context == null) {
            TLogger.e("XGPushManager", "getNotificationBuilder  context == null");
            return null;
        }
        return com.tencent.android.tpush.message.b.a(context, i2);
    }

    public static String getServiceTag(Context context) {
        if (Security.checkTpnsSecurityLibSo(context)) {
            return Rijndael.encrypt(XGPushConfig.getAccessId(context) + ChineseToPinyinResource.Field.COMMA + "xg_service_enable");
        }
        return "xg_service_enable";
    }

    public static XGSysPushNotifactionCallback getSysNotifactionCallback() {
        return f8484h;
    }

    public static void initCommonComponents(final Context context) {
        CommonWorkingThread.getInstance().execute(new TTask() { // from class: com.tencent.android.tpush.XGPushManager.15
            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
                d.a(context);
                i.f(context);
            }
        });
    }

    public static boolean isNotificationOpened(Context context) {
        return com.tencent.android.tpush.service.util.b.a(context);
    }

    public static String loadOtherPushToken(Context context, boolean z, long j2) {
        try {
            TLogger.ii("XGPushManager", "start other push channel register !");
            if (XGPushConfig.isUsedOtherPush(context)) {
                d.a(context).o();
                if (d.a(context).l()) {
                    d.a(context).c();
                    if (z) {
                        String a2 = a(context, j2);
                        if (g.a(a2) && XGPushConfig.isUsedOtherPush(context)) {
                            ServiceStat.reportTokenFailed(context);
                        }
                        return a2;
                    }
                    return null;
                }
                return null;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void logger(int i2, String str, String str2, Throwable th) {
        TBaseLogger.addThirdLog(i2, str, str2, th);
    }

    public static void msgAck(Context context, PushMessageManager pushMessageManager) {
        if (context == null || pushMessageManager == null) {
            return;
        }
        TLogger.v("XGPushManager", "Action -> msgAck(" + context.getPackageName() + ChineseToPinyinResource.Field.COMMA + pushMessageManager.getMsgId() + ChineseToPinyinResource.Field.RIGHT_BRACKET);
        if (pushMessageManager.getMsgId() > 0) {
            MessageId msgId = MessageManager.getInstance().getMsgId(context, context.getPackageName(), pushMessageManager.getMsgId());
            if (msgId == null) {
                TLogger.ww("XGPushManager", "Action -> msgAck(" + context.getPackageName() + ChineseToPinyinResource.Field.COMMA + pushMessageManager.getMsgId() + ")error, no the id: " + pushMessageManager.getMsgId());
                return;
            }
            Intent intent = new Intent(context.getPackageName() + "com.tencent.android.xg.vip.action.MSG_ACK.V4");
            intent.putExtra(MessageKey.MSG_ID, pushMessageManager.getMsgId());
            intent.putExtra(Constants.FLAG_PACK_NAME, context.getPackageName());
            intent.putExtra("MessageId", msgId);
            intent.putExtra(MessageKey.MSG_CHANNEL_ID, pushMessageManager.getChannelId());
            BroadcastAgent.sendBroadcast(context, intent);
        }
    }

    public static XGPushClickedResult onActivityStarted(Activity activity) {
        Intent intent;
        TLogger.ii("XGPushManager", ">>> onActivityStarted " + activity);
        if (activity != null && activity.getIntent() != null && i.h(activity) && (intent = activity.getIntent()) != null) {
            try {
                if (intent.hasExtra(Constants.TAG_TPUSH_NOTIFICATION)) {
                    Serializable serializableExtra = intent.getSerializableExtra(Constants.TAG_TPUSH_NOTIFICATION);
                    intent.removeExtra(Constants.TAG_TPUSH_NOTIFICATION);
                    if (serializableExtra != null && (serializableExtra instanceof XGPushClickedResult)) {
                        XGPushClickedResult xGPushClickedResult = (XGPushClickedResult) serializableExtra;
                        xGPushClickedResult.parseIntent(intent);
                        return xGPushClickedResult;
                    }
                }
            } catch (Throwable th) {
                TLogger.e("XGPushManager", "onActivityStarted", th);
            }
        }
        return null;
    }

    public static void onActivityStoped(Activity activity) {
        if (activity == null) {
        }
    }

    public static void onEvent(Context context, String str, Properties properties) {
        ServiceStat.reportCustomData(context, str, properties);
    }

    public static void onMessageCleared(Context context, XGPushTextMessage xGPushTextMessage) {
        a(context, xGPushTextMessage.a(), "com.tencent.android.xg.vip.action.PUSH_CANCELLED.RESULT.V4");
    }

    public static void onMessageClicked(Context context, XGPushTextMessage xGPushTextMessage) {
        a(context, xGPushTextMessage.a(), "com.tencent.android.xg.vip.action.PUSH_CLICK.RESULT.V4");
    }

    public static void openNotification(Context context) {
        i.i(context);
    }

    public static void openNotificationSettings(Context context) {
        i.j(context);
    }

    public static void queryTags(final Context context, final String str, final int i2, final int i3, final XGIOperateCallback xGIOperateCallback) {
        if (context != null && i2 >= 0 && i3 > 0) {
            TLogger.ii("XGPushManager", "Action -> queryTags");
            if (XGApiConfig.isRegistered(context) && i.h(context)) {
                b(context, str, i2, i3, null, xGIOperateCallback);
                return;
            } else {
                registerPush(context, new XGIOperateCallback() { // from class: com.tencent.android.tpush.XGPushManager.4
                    @Override // com.tencent.android.tpush.XGIOperateCallback
                    public void onFail(Object obj, int i4, String str2) {
                        XGIOperateCallback xGIOperateCallback2 = xGIOperateCallback;
                        if (xGIOperateCallback2 != null) {
                            xGIOperateCallback2.onFail(obj, i4, str2);
                        }
                    }

                    @Override // com.tencent.android.tpush.XGIOperateCallback
                    public void onSuccess(Object obj, int i4) {
                        XGPushManager.b(context, str, i2, i3, null, xGIOperateCallback);
                    }
                });
                return;
            }
        }
        TLogger.ee("XGPushManager", "the parameter context or tags of deleteTags is invalid.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        xGIOperateCallback.onFail("", ReturnCode.CODE_INVALID_QUERYTAGS.getType(), ReturnCode.CODE_INVALID_TAG.getStr());
    }

    public static void registerPush(Context context) {
        registerPush(context, new XGIOperateCallback() { // from class: com.tencent.android.tpush.XGPushManager.1
            @Override // com.tencent.android.tpush.XGIOperateCallback
            public void onFail(Object obj, int i2, String str) {
                TLogger.ee("XGPushManager", "TPNS register push failed with token : " + obj + ", errCode : " + i2 + " , msg : " + str);
            }

            @Override // com.tencent.android.tpush.XGIOperateCallback
            public void onSuccess(Object obj, int i2) {
                TLogger.ii("XGPushManager", "TPNS register push success with token : " + obj);
            }
        });
    }

    public static void reportTpnsInfoToBugly(Context context) {
        try {
            StringBuilder sb = new StringBuilder("TPNS INFO ");
            sb.append(XGPushConfig.getToken(context));
            Class<?> cls = Class.forName("com.tencent.bugly.crashreport.BuglyLog");
            cls.getMethod("i", String.class, String.class).invoke(cls, sb.toString(), "");
            TLogger.d("XGPushManager", "reportTpnsInfoToBugly | report tpnsInfo to bugly : " + sb.toString());
        } catch (Throwable unused) {
            TLogger.w("XGPushManager", "reportTpnsInfoToBugly | Bugly sdk not found");
        }
    }

    public static void sendCommReport2Service(Context context, String str, String str2) {
        long accessId = XGPushConfig.getAccessId(context);
        Intent intent = new Intent(context.getPackageName() + "com.tencent.android.xg.vip.action.COMM_REPORT.V4");
        intent.putExtra("type", 1L);
        intent.putExtra("accessId", Rijndael.encrypt("" + accessId));
        intent.putExtra(MessageKey.MSG_ID, 1000L);
        intent.putExtra("broadcastId", 0L);
        intent.putExtra("msgTimestamp", System.currentTimeMillis() / 1000);
        intent.putExtra("clientTimestamp", System.currentTimeMillis() / 1000);
        intent.putExtra("pkgName", context.getPackageName());
        intent.putExtra("msg", Rijndael.encrypt(str));
        intent.putExtra(TUIConstants.TUIOfflinePush.NOTIFICATION_EXT_KEY, Rijndael.encrypt(str2));
        BroadcastAgent.sendBroadcast(context, intent);
    }

    public static void setContext(Context context) {
        if (b != null || context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        b = applicationContext;
        TGlobalHelper.setContext(applicationContext);
    }

    public static void setDefaultNotificationBuilder(Context context, XGPushNotificationBuilder xGPushNotificationBuilder) {
        if (context == null || xGPushNotificationBuilder == null) {
            return;
        }
        com.tencent.android.tpush.message.b.a(context, 0, xGPushNotificationBuilder);
    }

    public static void setKeyValueTag(Context context, String str, String str2) {
        if (context != null && str != null && str.trim().length() != 0 && str2 != null && str2.trim().length() != 0) {
            String str3 = str + "::::" + str2;
            TLogger.ii("XGPushManager", "Action -> setKeyValueTag with tag = " + str3);
            a(context, str3, 3, -1L, (String) null, str3);
            return;
        }
        TLogger.ee("XGPushManager", "setKeyValueTag context or tagKey or tagValue invalid.");
    }

    public static void setNotifactionCallback(XGPushNotifactionCallback xGPushNotifactionCallback) {
        f8483g = xGPushNotifactionCallback;
    }

    public static void setPushNotificationBuilder(Context context, int i2, XGPushNotificationBuilder xGPushNotificationBuilder) {
        if (context == null) {
            throw new IllegalArgumentException("context is null.");
        }
        if (i2 < 1 || i2 > 4096) {
            throw new IllegalArgumentException("notificationBulderId不在范围[1, 4096].");
        }
        if (xGPushNotificationBuilder == null) {
            return;
        }
        com.tencent.android.tpush.message.b.a(context, i2, xGPushNotificationBuilder);
    }

    public static void setSysNotifactionCallback(XGSysPushNotifactionCallback xGSysPushNotifactionCallback) {
        f8484h = xGSysPushNotifactionCallback;
    }

    @Deprecated
    public static void setTag(Context context, String str) {
        if (context != null && !g.a(str)) {
            TLogger.ii("XGPushManager", "Action -> setTag with tag = " + str);
            a(context, str, 1, -1L, (String) null, str);
            return;
        }
        TLogger.ee("XGPushManager", "the parameter context or tagName of setTag is null.");
    }

    @Deprecated
    public static void setTags(Context context, String str, Set<String> set) {
        clearAndAppendTags(context, str, set);
    }

    public static void startPushService(Context context) {
        if (context != null) {
            setContext(context);
            TLogger.ii("XGPushManager", context.getPackageName() + "call start Push Service");
            i.f(context);
            if (i.c(context) == 0) {
                i.e(context);
            }
        }
    }

    public static void stopPushService(Context context) {
        if (context != null) {
            TLogger.ii("XGPushManager", context.getPackageName() + " call stop Push Service");
            try {
                ServiceConnection f2 = com.tencent.android.tpush.service.b.f();
                TLogger.d("XGPushManager", "vipConn:" + f2);
                if (f2 != null) {
                    context.unbindService(f2);
                    com.tencent.android.tpush.service.b.g();
                }
                Intent intent = new Intent();
                intent.setClass(context.getApplicationContext(), XGVipPushService.class);
                context.stopService(intent);
            } catch (Throwable unused) {
            }
            try {
                f.f(context);
                BroadcastAgent.sendBroadcast(context, new Intent(context.getPackageName() + "com.tencent.android.xg.vip.action.KILLSERVICEPROCESS.V4"));
            } catch (Throwable unused2) {
            }
        }
    }

    public static void unregisterPush(Context context) {
        if (context == null) {
            TLogger.e("XGPushManager", "the context of unregisterPush is null");
        } else {
            unregisterPush(context, new XGIOperateCallback() { // from class: com.tencent.android.tpush.XGPushManager.28
                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onFail(Object obj, int i2, String str) {
                    TLogger.ee("XGPushManager", "UnRegisterPush push failed with token = " + obj + " , errCode = " + i2 + " , msg = " + str);
                }

                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onSuccess(Object obj, int i2) {
                    TLogger.ii("XGPushManager", "UnRegisterPush push succeed with token = " + obj + " flag = " + i2);
                }
            });
        }
    }

    public static void uploadLogFile(final Context context, final HttpRequestCallback httpRequestCallback) {
        if (context != null && httpRequestCallback != null) {
            try {
                final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.tencent.android.tpush.XGPushManager.21
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context2, Intent intent) {
                        TLogger.ii("XGPushManager", "action - sendFlush onReceiver");
                        i.a(context2, this);
                        CommonWorkingThread.getInstance().remove(26);
                        TBaseLogger.uploadLogFile(context2.getApplicationContext(), HttpRequestCallback.this);
                    }
                };
                BroadcastAgent.registerReceiver(context, broadcastReceiver, new IntentFilter("com.tencent.android.xg.vip.action.FLUSH.RESULT.V4"), 4);
                CommonWorkingThread.getInstance().executeAtTime(new TTask() { // from class: com.tencent.android.tpush.XGPushManager.22
                    @Override // com.tencent.tpns.baseapi.base.util.TTask
                    public void TRun() {
                        TLogger.ii("XGPushManager", "action - executeAtTime");
                        TBaseLogger.uploadLogFile(context.getApplicationContext(), httpRequestCallback);
                        i.a(context, broadcastReceiver);
                    }
                }, 26, VideoTrimmerView.J);
                Intent intent = new Intent(context.getPackageName() + "com.tencent.android.xg.vip.action.FLUSH.V4");
                intent.putExtra(Constants.FLAG_PACK_NAME, Rijndael.encrypt(context.getPackageName()));
                BroadcastAgent.sendBroadcast(context, intent);
                return;
            } catch (Throwable th) {
                TLogger.ww("XGPushManager", "unexpected for uploadLogFile:" + th.getMessage());
                return;
            }
        }
        TLogger.ee("XGPushManager", "parameter can not be null!");
    }

    @Deprecated
    public static void upsertAccounts(Context context, String str, XGIOperateCallback xGIOperateCallback) {
        String a2 = a(str, 0);
        if (context != null && !g.a(str) && !g.a(a2)) {
            b(context, a2, 0L, (String) null, 2, str, xGIOperateCallback);
            return;
        }
        TLogger.ee("XGPushManager", "the parameter context or account of appendAccount is null.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        ReturnCode returnCode = ReturnCode.CODE_INVALID_ACCOUNT;
        xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
    }

    public static void upsertAttributes(Context context, String str, Map<String, String> map, XGIOperateCallback xGIOperateCallback) {
        if (context != null && map != null && !map.isEmpty()) {
            String a2 = a(map);
            if (a("upsertAttributes", a2)) {
                TLogger.ii("XGPushManager", "upsertAttributes with all attribute = " + a2);
                b(context, a2, 1, str, xGIOperateCallback);
                return;
            }
            return;
        }
        TLogger.ee("XGPushManager", "the parameter context or attributes of upsertAttributes is invalid.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        ReturnCode returnCode = ReturnCode.CODE_INVALID_ATTRIBUTE;
        xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
    }

    public static void upsertPhoneNumber(Context context, String str, XGIOperateCallback xGIOperateCallback) {
        try {
            if (!Pattern.compile("^\\+?[1-9]\\d{1,14}$").matcher(str).matches() && xGIOperateCallback != null) {
                ReturnCode returnCode = ReturnCode.CODE_INVALID_ACCOUNT;
                xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
                return;
            }
        } catch (Throwable th) {
            TLogger.ee("XGPushManager", "the parameter phoneNumber error", th);
        }
        upsertAccounts(context, str, AccountType.PHONE_NUMBER.getValue(), xGIOperateCallback);
    }

    @Deprecated
    public static void addTags(Context context, String str, Set<String> set, XGIOperateCallback xGIOperateCallback) {
        appendTags(context, str, set, xGIOperateCallback);
    }

    @Deprecated
    public static void appendAccount(Context context, String str, int i2, XGIOperateCallback xGIOperateCallback) {
        upsertAccounts(context, str, i2, xGIOperateCallback);
    }

    @Deprecated
    public static void bindAccount(Context context, String str, int i2, XGIOperateCallback xGIOperateCallback) {
        clearAndAppendAccount(context, str, i2, xGIOperateCallback);
    }

    @Deprecated
    public static void cleanTags(Context context, String str, XGIOperateCallback xGIOperateCallback) {
        clearTags(context, str, xGIOperateCallback);
    }

    @Deprecated
    public static void delAllAccount(Context context, XGIOperateCallback xGIOperateCallback) {
        clearAccounts(context, xGIOperateCallback);
    }

    @Deprecated
    public static void deleteTag(Context context, String str, XGIOperateCallback xGIOperateCallback) {
        delTag(context, str, xGIOperateCallback);
    }

    @Deprecated
    public static void deleteTags(Context context, String str, Set<String> set, XGIOperateCallback xGIOperateCallback) {
        delTags(context, str, set, xGIOperateCallback);
    }

    public static void registerPush(Context context, XGIOperateCallback xGIOperateCallback) {
        if (xGIOperateCallback != null) {
            a(context, null, -1, null, xGIOperateCallback, -1L, null, null, null, null, -1L);
            return;
        }
        throw new IllegalArgumentException("The callback parameter can not be null!");
    }

    @Deprecated
    public static void setTags(Context context, String str, Set<String> set, XGIOperateCallback xGIOperateCallback) {
        clearAndAppendTags(context, str, set, xGIOperateCallback);
    }

    @Deprecated
    public static void appendAccount(Context context, String str, int i2) {
        upsertAccounts(context, str, i2);
    }

    @Deprecated
    public static void bindAccount(Context context, String str, int i2) {
        clearAndAppendAccount(context, str, i2);
    }

    public static void clearAccounts(Context context, XGIOperateCallback xGIOperateCallback) {
        if (context == null) {
            TLogger.ee("XGPushManager", "the parameter context of delAllAccount is null.");
            if (context == null || xGIOperateCallback == null) {
                return;
            }
            ReturnCode returnCode = ReturnCode.CODE_INVALID_ACCOUNT;
            xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
            return;
        }
        b(context, (String) null, 0L, (String) null, 1, "", xGIOperateCallback);
    }

    public static void unregisterPush(Context context, String str, String str2, String str3, XGIOperateCallback xGIOperateCallback) {
        a(context, xGIOperateCallback, XGPushConfig.getAccessId(context), XGPushConfig.getAccessKey(context), str, str2, str3);
    }

    @Deprecated
    public static void appendAccount(Context context, String str) {
        upsertAccounts(context, str);
    }

    @Deprecated
    public static void bindAccount(Context context, String str) {
        clearAndAppendAccount(context, str);
    }

    public static void clearTags(Context context, String str, XGIOperateCallback xGIOperateCallback) {
        if (context == null) {
            TLogger.ee("XGPushManager", "the parameter context of cleanTags is invalid");
            return;
        }
        TLogger.ii("XGPushManager", "Action -> cleanTags");
        a(context, "", 8, -1L, (String) null, str, xGIOperateCallback);
    }

    public static void registerPush(Context context, long j2, XGIOperateCallback xGIOperateCallback) {
        if (xGIOperateCallback != null) {
            a(context, null, -1, null, xGIOperateCallback, -1L, null, null, null, null, j2);
            return;
        }
        throw new IllegalArgumentException("The callback parameter can not be null!");
    }

    private static void b(final Context context, final String str, final int i2, final String str2, final XGIOperateCallback xGIOperateCallback) {
        if (XGApiConfig.isRegistered(context) && i.h(context)) {
            c(context, str, i2, str2, xGIOperateCallback);
        } else {
            registerPush(context, new com.tencent.android.tpush.b() { // from class: com.tencent.android.tpush.XGPushManager.2
                @Override // com.tencent.android.tpush.b
                public void a(Object obj, int i3) {
                    XGPushManager.c(context, str, i2, str2, xGIOperateCallback);
                }

                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onFail(Object obj, int i3, String str3) {
                    XGIOperateCallback xGIOperateCallback2 = xGIOperateCallback;
                    if (xGIOperateCallback2 != null) {
                        xGIOperateCallback2.onFail(obj, i3, str3);
                    }
                }

                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onSuccess(Object obj, int i3) {
                }
            });
        }
    }

    @Deprecated
    public static void delTag(Context context, String str, XGIOperateCallback xGIOperateCallback) {
        TLogger.ii("XGPushManager", "Action -> deleteTag with tag = " + str);
        if (context != null && str != null && str.trim().length() != 0) {
            a(context, str, 2, -1L, (String) null, str, xGIOperateCallback);
            return;
        }
        TLogger.ee("XGPushManager", "context is null or tagName invalid.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        ReturnCode returnCode = ReturnCode.CODE_INVALID_TAG;
        xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
    }

    @Deprecated
    public static void setTag(Context context, String str, XGIOperateCallback xGIOperateCallback) {
        if (context != null && !g.a(str)) {
            TLogger.ii("XGPushManager", "Action -> setTag with tag = " + str);
            a(context, str, 1, -1L, (String) null, str, xGIOperateCallback);
            return;
        }
        TLogger.ee("XGPushManager", "the parameter context or tagName of setTag is null.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        ReturnCode returnCode = ReturnCode.CODE_INVALID_TAG;
        xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
    }

    public static void registerPush(Context context, long j2, AccountInfo accountInfo, XGIOperateCallback xGIOperateCallback) {
        if (xGIOperateCallback != null) {
            String str = null;
            int i2 = -1;
            if (accountInfo != null) {
                str = accountInfo.accountName;
                i2 = accountInfo.accountType;
            }
            a(context, str, i2, null, xGIOperateCallback, -1L, null, null, null, null, j2);
            return;
        }
        throw new IllegalArgumentException("The callback parameter can not be null!");
    }

    public static void unregisterPush(Context context, XGIOperateCallback xGIOperateCallback) {
        a(context, xGIOperateCallback, XGPushConfig.getAccessId(context), XGPushConfig.getAccessKey(context), (String) null, (String) null, (String) null);
    }

    public static void a(Context context, final XGIOperateCallback xGIOperateCallback, final long j2, final String str, String str2, String str3, String str4) {
        if (context == null) {
            if (xGIOperateCallback != null) {
                xGIOperateCallback.onFail("", ReturnCode.CODE_LOGIC_ILLEGAL_ARGUMENT.getType(), "The context parameter can not be null!");
                return;
            }
            throw new IllegalArgumentException("The context parameter can not be null!");
        }
        final Context applicationContext = context.getApplicationContext();
        CacheManager.clearTokenCache();
        if (!i.h(applicationContext)) {
            if (xGIOperateCallback != null) {
                xGIOperateCallback.onSuccess("It's already unregistered", 0);
                return;
            }
            return;
        }
        com.tencent.android.tpush.service.util.b.f9031a = 2;
        try {
            long currentTimeMillis = System.currentTimeMillis() - c.longValue();
            if (f8481e != null && currentTimeMillis < f8480d) {
                TLogger.d("XGPushManager", "cancel dump register, registerRunnable4NewDevice:" + f8481e);
                CommonWorkingThread.getInstance().remove(f8481e);
                f8481e = null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        CommonWorkingThread.getInstance().execute(new TTask() { // from class: com.tencent.android.tpush.XGPushManager.29
            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
                XGIOperateCallback xGIOperateCallback2;
                try {
                    int a2 = i.a(applicationContext);
                    if (a2 != 0) {
                        XGIOperateCallback xGIOperateCallback3 = xGIOperateCallback;
                        if (xGIOperateCallback3 != null) {
                            xGIOperateCallback3.onFail("", a2, "XINGE SDK config error");
                            return;
                        }
                        return;
                    }
                    long j3 = j2;
                    if (j3 <= 0) {
                        j3 = XGPushConfig.getAccessId(applicationContext);
                    }
                    String accessKey = i.b(str) ? XGPushConfig.getAccessKey(applicationContext) : str;
                    String token = XGPushConfig.getToken(applicationContext);
                    if ((j3 > 0 && !i.b(accessKey) && !i.b(token)) || (xGIOperateCallback2 = xGIOperateCallback) == null) {
                        Intent intent = new Intent(applicationContext.getPackageName() + "com.tencent.android.xg.vip.action.UNREGISTER.V4");
                        intent.putExtra("accId", Rijndael.encrypt("" + j3));
                        intent.putExtra(Constants.FLAG_ACC_KEY, Rijndael.encrypt(accessKey));
                        intent.putExtra(Constants.FLAG_TOKEN, Rijndael.encrypt(token));
                        intent.putExtra(Constants.FLAG_PACK_NAME, Rijndael.encrypt(applicationContext.getPackageName()));
                        intent.putExtra("operation", 101);
                        intent.putExtra("opType", 1);
                        boolean b2 = h.a(applicationContext).b();
                        boolean a3 = com.tencent.android.tpush.service.b.a();
                        if (i.c(applicationContext) == 1 && a3) {
                            XGPushManager.d(applicationContext, intent, xGIOperateCallback);
                            return;
                        } else {
                            XGPushManager.a(applicationContext, intent, xGIOperateCallback, b2);
                            return;
                        }
                    }
                    int type = ReturnCode.CODE_LOGIC_ILLEGAL_ARGUMENT.getType();
                    xGIOperateCallback2.onFail("", type, "The accessId, accessKey or token is invalid! accessId=" + j3);
                    throw new IllegalArgumentException("accessId, accessKey or token is invalid.");
                } catch (Throwable th2) {
                    TLogger.ee("XGPushManager", "unregisterPush", th2);
                }
            }
        });
    }

    public static void appendTags(Context context, String str, Set<String> set, XGIOperateCallback xGIOperateCallback) {
        String a2 = a(set, "addTags");
        if (context != null && set != null && !set.isEmpty() && !TextUtils.isEmpty(a2)) {
            TLogger.ii("XGPushManager", "addTags -> setTags with all tags = " + a2);
            a(context, a2, 5, -1L, (String) null, str, xGIOperateCallback);
            return;
        }
        TLogger.ee("XGPushManager", "the parameter context or tags of addTags is invalid.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        ReturnCode returnCode = ReturnCode.CODE_INVALID_TAG;
        xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, int i2, int i3, String str2, final XGIOperateCallback xGIOperateCallback) {
        if (context != null) {
            if (i.a(context) > 0) {
                return;
            }
            if (c()) {
                if (xGIOperateCallback != null) {
                    ReturnCode returnCode = ReturnCode.CODE_SDK_API_FREQUENCY_LIMIT_ERROR;
                    xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
                    return;
                }
                return;
            }
            long accessId = XGPushConfig.getAccessId(context);
            if (accessId >= 0) {
                String accessKey = XGPushConfig.getAccessKey(context);
                Intent intent = new Intent(context.getPackageName() + "com.tencent.android.xg.vip.action.QUERYTAGS.V4");
                intent.putExtra("accId", accessId);
                intent.putExtra(Constants.FLAG_ACC_KEY, Rijndael.encrypt(accessKey));
                intent.putExtra(Constants.FLAG_PACK_NAME, Rijndael.encrypt(context.getPackageName()));
                intent.putExtra(Constants.FLAG_QUERY_TAGS_OPER_NAME, str);
                intent.putExtra(Constants.FLAG_TAG_OFFSET, i2);
                intent.putExtra("limit", i3);
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra(Constants.FLAG_TAG_QUERY_TYPE, str2);
                }
                if (xGIOperateCallback != null) {
                    try {
                        BroadcastAgent.registerReceiver(context, new BroadcastReceiver() { // from class: com.tencent.android.tpush.XGPushManager.6
                            @Override // android.content.BroadcastReceiver
                            public void onReceive(Context context2, Intent intent2) {
                                TLogger.ii("XGPushManager", "Tag call back to " + context2.getPackageName());
                                try {
                                    CommonWorkingThread.getInstance().execute(new TTask(this, intent2) { // from class: com.tencent.android.tpush.XGPushManager.6.1

                                        /* renamed from: a  reason: collision with root package name */
                                        public final /* synthetic */ Intent f8542a;
                                        public final /* synthetic */ AnonymousClass6 b;

                                        @Override // com.tencent.tpns.baseapi.base.util.TTask
                                        public void TRun() {
                                        }
                                    });
                                } catch (Throwable th) {
                                    TLogger.e("XGPushManager", "tagManager handle callback error " + th.toString());
                                }
                                i.a(context2, this);
                            }
                        }, new IntentFilter("com.tencent.android.xg.vip.action.QUERYTAGS.RESULT.V4"), 4);
                    } catch (Throwable th) {
                        TLogger.e("XGPushManager", "tagManager registerReceiver error " + th.toString());
                    }
                }
                BroadcastAgent.sendBroadcast(context, intent);
                return;
            }
            throw new IllegalArgumentException("The accessId not set!");
        }
        throw new IllegalArgumentException("The context parameter can not be null!");
    }

    @Deprecated
    public static void clearAndAppendAccount(Context context, String str, int i2, XGIOperateCallback xGIOperateCallback) {
        String a2 = a(str, i2);
        if (context != null && !g.a(str) && !g.a(a2)) {
            b(context, a2, 0L, (String) null, 0, str, xGIOperateCallback);
            return;
        }
        TLogger.ee("XGPushManager", "the parameter context or account of clearAndAppendAccount is null.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        ReturnCode returnCode = ReturnCode.CODE_INVALID_ACCOUNT;
        xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
    }

    public static void clearAndAppendTags(Context context, String str, Set<String> set, XGIOperateCallback xGIOperateCallback) {
        String a2 = a(set, "setTags");
        if (context != null && set != null && !set.isEmpty() && !TextUtils.isEmpty(a2)) {
            TLogger.ii("XGPushManager", "Action -> setTags with all tags = " + a2);
            a(context, a2, 6, -1L, (String) null, str, xGIOperateCallback);
            return;
        }
        TLogger.ee("XGPushManager", "the parameter context or tags of setTags is invalid.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        ReturnCode returnCode = ReturnCode.CODE_INVALID_TAG;
        xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
    }

    @Deprecated
    public static void delAccount(Context context, String str, int i2, XGIOperateCallback xGIOperateCallback) {
        String a2 = a(str, i2);
        if (context != null && !g.a(str) && !g.a(a2)) {
            b(context, a2, 0L, (String) null, 3, str, xGIOperateCallback);
            return;
        }
        if (context != null && xGIOperateCallback != null) {
            ReturnCode returnCode = ReturnCode.CODE_INVALID_ACCOUNT;
            xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
        }
        TLogger.ee("XGPushManager", "the parameter context or account of delAccount is null.");
    }

    public static void delTags(Context context, String str, Set<String> set, XGIOperateCallback xGIOperateCallback) {
        String a2 = a(set, "deleteTags");
        if (context != null && set != null && !set.isEmpty() && !TextUtils.isEmpty(a2)) {
            TLogger.ii("XGPushManager", "deleteTags -> setTags with all tags = " + a2);
            a(context, a2, 7, -1L, (String) null, str, xGIOperateCallback);
            return;
        }
        TLogger.ee("XGPushManager", "the parameter context or tags of deleteTags is invalid.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        ReturnCode returnCode = ReturnCode.CODE_INVALID_TAG;
        xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
    }

    @Deprecated
    public static void upsertAccounts(Context context, String str, int i2, XGIOperateCallback xGIOperateCallback) {
        String a2 = a(str, i2);
        if (context != null && !g.a(str) && !g.a(a2)) {
            b(context, a2, 0L, (String) null, 2, str, xGIOperateCallback);
            return;
        }
        TLogger.ee("XGPushManager", "the parameter context or account of appendAccount is null.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        ReturnCode returnCode = ReturnCode.CODE_INVALID_ACCOUNT;
        xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
    }

    public static void queryTags(final Context context, final String str, final int i2, final int i3, final String str2, final XGIOperateCallback xGIOperateCallback) {
        if (context != null && i2 >= 0 && i3 > 0) {
            if (XGApiConfig.isRegistered(context) && i.h(context)) {
                b(context, str, i2, i3, str2, xGIOperateCallback);
                return;
            } else {
                registerPush(context, new XGIOperateCallback() { // from class: com.tencent.android.tpush.XGPushManager.5
                    @Override // com.tencent.android.tpush.XGIOperateCallback
                    public void onFail(Object obj, int i4, String str3) {
                        XGIOperateCallback xGIOperateCallback2 = xGIOperateCallback;
                        if (xGIOperateCallback2 != null) {
                            xGIOperateCallback2.onFail(obj, i4, str3);
                        }
                    }

                    @Override // com.tencent.android.tpush.XGIOperateCallback
                    public void onSuccess(Object obj, int i4) {
                        XGPushManager.b(context, str, i2, i3, str2, xGIOperateCallback);
                    }
                });
                return;
            }
        }
        TLogger.ee("XGPushManager", "the parameter context or tags of deleteTags is invalid.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        xGIOperateCallback.onFail("", ReturnCode.CODE_INVALID_QUERYTAGS.getType(), ReturnCode.CODE_INVALID_TAG.getStr());
    }

    public static void registerPush(Context context, String str, String str2, String str3, XGIOperateCallback xGIOperateCallback) {
        if (xGIOperateCallback != null) {
            a(context, null, -1, null, xGIOperateCallback, -1L, null, str, str2, str3, -1L);
            return;
        }
        throw new IllegalArgumentException("The callback parameter can not be null!");
    }

    @Deprecated
    public static void clearAndAppendAccount(Context context, final String str, int i2) {
        if (context != null && !g.a(str)) {
            clearAndAppendAccount(context, str, i2, new XGIOperateCallback() { // from class: com.tencent.android.tpush.XGPushManager.12
                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onFail(Object obj, int i3, String str2) {
                    TLogger.ee("XGPushManager", "TPNS binderAccount " + str + " failed, errCode =  " + i3 + ", msg = " + str2);
                }

                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onSuccess(Object obj, int i3) {
                    TLogger.ii("XGPushManager", "TPNS binderAccount " + str + " success");
                }
            });
        } else {
            TLogger.ee("XGPushManager", "the parameter context or account of bindAccount is null.");
        }
    }

    @Deprecated
    public static void delAccount(Context context, final String str) {
        if (context != null && !g.a(str)) {
            delAccount(context, str, new XGIOperateCallback() { // from class: com.tencent.android.tpush.XGPushManager.26
                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onFail(Object obj, int i2, String str2) {
                    TLogger.ee("XGPushManager", "TPNS deleteAccount " + str + " failed, errCode =  " + i2 + ", msg = " + str2);
                }

                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onSuccess(Object obj, int i2) {
                    TLogger.ii("XGPushManager", "TPNS deleteAccount " + str + " success");
                }
            });
        } else {
            TLogger.ee("XGPushManager", "the parameter context or account of delAccount is null.");
        }
    }

    @Deprecated
    public static void upsertAccounts(Context context, final String str, int i2) {
        if (context != null && !g.a(str)) {
            upsertAccounts(context, str, i2, new XGIOperateCallback() { // from class: com.tencent.android.tpush.XGPushManager.24
                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onFail(Object obj, int i3, String str2) {
                    TLogger.ee("XGPushManager", "TPNS appendAccount " + str + " failed, errCode =  " + i3 + ", msg = " + str2);
                }

                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onSuccess(Object obj, int i3) {
                    TLogger.ii("XGPushManager", "TPNS appendAccount " + str + " success");
                }
            });
        } else {
            TLogger.ee("XGPushManager", "the parameter context or account of appendAccount is null.");
        }
    }

    @Deprecated
    public static void clearAndAppendAccount(Context context, final String str) {
        if (context != null && !g.a(str)) {
            clearAndAppendAccount(context, str, new XGIOperateCallback() { // from class: com.tencent.android.tpush.XGPushManager.23
                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onFail(Object obj, int i2, String str2) {
                    TLogger.ee("XGPushManager", "TPNS binderAccount " + str + " failed, errCode =  " + i2 + ", msg = " + str2);
                }

                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onSuccess(Object obj, int i2) {
                    TLogger.ii("XGPushManager", "TPNS binderAccount " + str + " success");
                }
            });
        } else {
            TLogger.ee("XGPushManager", "the parameter context or account of bindAccount is null.");
        }
    }

    @Deprecated
    public static void upsertAccounts(Context context, final String str) {
        if (context != null && !g.a(str)) {
            upsertAccounts(context, str, new XGIOperateCallback() { // from class: com.tencent.android.tpush.XGPushManager.25
                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onFail(Object obj, int i2, String str2) {
                    TLogger.ee("XGPushManager", "TPNS appendAccount " + str + " failed, errCode =  " + i2 + ", msg = " + str2);
                }

                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onSuccess(Object obj, int i2) {
                    TLogger.ii("XGPushManager", "TPNS appendAccount " + str + " success");
                }
            });
        } else {
            TLogger.ee("XGPushManager", "the parameter context or account of appendAccount is null.");
        }
    }

    public static String a(Set<String> set, String str) {
        if (set == null) {
            TLogger.ee("XGPushManager", str + " -> the parameter tags is null.");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        Iterator<String> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String replaceAll = it.next().replaceAll(" ", "");
            if (replaceAll.length() > 50) {
                TLogger.ww("XGPushManager", str + " -> the tag:" + replaceAll + " length is more than 50, discard it");
            } else {
                if (i2 < 500) {
                    if (i2 != 0) {
                        sb.append(" ");
                    }
                    sb.append(replaceAll);
                } else if (XGPushConfig.enableDebug) {
                    TLogger.ww("XGPushManager", str + " -> tags size is " + (i2 + 1) + ", so discard tag:" + replaceAll);
                } else {
                    TLogger.ww("XGPushManager", str + " -> tags size is more than 500, discard some tags");
                    break;
                }
                i2++;
            }
        }
        return sb.toString();
    }

    private static void c(final Context context, final String str, final int i2, final long j2, final String str2, final String str3, final XGIOperateCallback xGIOperateCallback) {
        if (XGApiConfig.isRegistered(context) && i.h(context)) {
            d(context, str, i2, j2, str2, str3, xGIOperateCallback);
        } else {
            registerPush(context, new com.tencent.android.tpush.b() { // from class: com.tencent.android.tpush.XGPushManager.7
                @Override // com.tencent.android.tpush.b
                public void a(Object obj, int i3) {
                    XGPushManager.d(context, str, i2, j2, str2, str3, xGIOperateCallback);
                }

                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onFail(Object obj, int i3, String str4) {
                    XGIOperateCallback xGIOperateCallback2 = xGIOperateCallback;
                    if (xGIOperateCallback2 != null) {
                        xGIOperateCallback2.onFail(obj, i3, str4);
                    }
                }

                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onSuccess(Object obj, int i3) {
                }
            });
        }
    }

    public static void upsertAccounts(Context context, List<AccountInfo> list, XGIOperateCallback xGIOperateCallback) {
        String a2 = a(list);
        if (context != null && list != null && list.size() != 0 && !TextUtils.isEmpty(a2)) {
            b(context, a2, 0L, (String) null, 6, "", xGIOperateCallback);
            return;
        }
        TLogger.ee("XGPushManager", "upsertAccounts | the parameter is illegal.");
        if (context == null || xGIOperateCallback == null) {
            return;
        }
        ReturnCode returnCode = ReturnCode.CODE_INVALID_ACCOUNT;
        xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
    }

    private static void d(final Context context, final String str, final int i2, final String str2, final XGIOperateCallback xGIOperateCallback, final long j2, final String str3, final String str4, final String str5, final String str6, final long j3) {
        CommonWorkingThread.getInstance().execute(new TTask() { // from class: com.tencent.android.tpush.XGPushManager.17
            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
                long j4;
                try {
                    int a2 = i.a(context);
                    if (a2 != 0) {
                        XGIOperateCallback xGIOperateCallback2 = xGIOperateCallback;
                        if (xGIOperateCallback2 != null) {
                            xGIOperateCallback2.onFail("", a2, ReturnCode.errCodeToMsg(a2));
                            return;
                        }
                        return;
                    }
                    long j5 = j2;
                    long j6 = 0;
                    if (j5 <= 0) {
                        j5 = XGPushConfig.getAccessId(context);
                    }
                    String accessKey = i.b(str3) ? XGPushConfig.getAccessKey(context) : str3;
                    if (j5 > 0 && !i.b(accessKey)) {
                        TLogger.ii("XGPushManager", "start other push channel register !");
                        XGPushManager.loadOtherPushToken(context, true, j3);
                        Intent intent = new Intent(context.getPackageName() + "com.tencent.android.xg.vip.action.REGISTER.V4");
                        intent.putExtra("accId", Rijndael.encrypt("" + j5));
                        intent.putExtra("accChannel", XGPushConfig.getChannelId(context));
                        intent.putExtra(Constants.FLAG_ACC_KEY, Rijndael.encrypt(accessKey));
                        AccountInfo accountInfo = null;
                        if ((i2 >> 4) != 1) {
                            intent.putExtra("appVer", AppInfos.getCurAppVersion(context));
                            intent.putExtra(Constants.FLAG_PACK_NAME, Rijndael.encrypt(context.getPackageName()));
                            String str7 = str;
                            if (str7 != null) {
                                accountInfo = new AccountInfo(i2, str7);
                                intent.putExtra(Constants.FLAG_TICKET, Rijndael.encrypt(str));
                            }
                            String str8 = str2;
                            if (str8 != null) {
                                intent.putExtra("qua", Rijndael.encrypt(str8));
                            }
                            intent.putExtra("operation", 100);
                            intent.putExtra("aidl", i.b(context));
                        }
                        if (XGPushConfig.isUsedOtherPush(context) && d.a(context).k()) {
                            String j7 = d.a(context).j();
                            String e2 = d.a(context).e();
                            String f2 = d.a(context).f();
                            TLogger.ii("XGPushManager", "other push token is : " + e2 + "  other push type: " + j7 + " other push region: " + f2);
                            if (!i.b(j7) && !i.b(e2)) {
                                intent.putExtra("channelToken", e2);
                                intent.putExtra("channelType", j7);
                                intent.putExtra("deviceRegion", f2);
                            }
                        }
                        intent.putExtra(Constants.FLAG_TICKET_TYPE, i2);
                        intent.putExtra("currentTimeMillis", System.currentTimeMillis());
                        intent.putExtra("opType", 0);
                        if (!i.b(str4)) {
                            intent.putExtra("url", str4);
                            j6 = 4;
                        }
                        if (i.b(str6)) {
                            j4 = 1;
                        } else {
                            intent.putExtra("otherToken", str6);
                            j4 = !SharePrefsUtil.getString(context, str6, "").equals(CacheManager.getToken(context)) ? 2L : 3L;
                        }
                        if (!i.b(str5)) {
                            intent.putExtra("payload", str5);
                        }
                        intent.putExtra("otherPushTokenOpType", j4);
                        intent.putExtra("otherPushType", j6);
                        TLogger.d("XGPushManager", "url = " + str4 + " payload = " + str5 + " otherPushType " + j6 + " otherPushTokenOpType " + j4);
                        Intent b2 = XGPushManager.b(context, intent, xGIOperateCallback, accountInfo);
                        if (!XGPushConfig.isUsedTpnsChannel(context)) {
                            TLogger.d("XGPushManager", "registerPush not use Tpns channel service");
                            return;
                        }
                        boolean a3 = h.a(context).a();
                        int c2 = i.c(context);
                        boolean a4 = com.tencent.android.tpush.service.b.a();
                        TLogger.d("XGPushManager", "serviceStatus:" + c2 + ", isHasBinded: " + a4);
                        if (c2 == 1 && a4) {
                            TLogger.d("XGPushManager", "send boardcast to register");
                            XGPushManager.c(context, b2, xGIOperateCallback);
                            return;
                        }
                        TLogger.d("XGPushManager", "startServiceAndRegisterOrUnregister:");
                        XGPushManager.a(context, b2, xGIOperateCallback, a3);
                        return;
                    }
                    XGIOperateCallback xGIOperateCallback3 = xGIOperateCallback;
                    int type = ReturnCode.CODE_LOGIC_ILLEGAL_ARGUMENT.getType();
                    xGIOperateCallback3.onFail("", type, "The accessId or accessKey is(are) invalid!@accessId:" + j5 + ", @accessKey:" + accessKey);
                } catch (Throwable th) {
                    TLogger.e("XGPushManager", "register", th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, Intent intent) {
        if (intent != null) {
            Intent intent2 = new Intent(Constants.ACTION_FEEDBACK);
            intent2.setPackage(context.getPackageName());
            intent2.putExtra(Constants.FEEDBACK_TAG, 4);
            intent2.putExtra(Constants.FEEDBACK_ERROR_CODE, 0);
            intent2.putExtras(intent);
            BroadcastAgent.sendBroadcast(context, intent2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, Intent intent, final XGIOperateCallback xGIOperateCallback) {
        try {
            TLogger.ii("XGPushManager", "Action -> Unregister to TPNS server");
            BroadcastAgent.registerReceiver(context, new BroadcastReceiver() { // from class: com.tencent.android.tpush.XGPushManager.20
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent2) {
                    i.a(context2, this);
                    if (XGPushConfig.isUsedOtherPush(context2) && d.a(context2).a()) {
                        try {
                            CommonWorkingThread.getInstance().execute(new TTask(this, context2) { // from class: com.tencent.android.tpush.XGPushManager.20.1

                                /* renamed from: a  reason: collision with root package name */
                                public final /* synthetic */ Context f8523a;
                                public final /* synthetic */ AnonymousClass20 b;

                                @Override // com.tencent.tpns.baseapi.base.util.TTask
                                public void TRun() {
                                }
                            });
                        } catch (Throwable th) {
                            TLogger.e("XGPushManager", "unregister otherPush handle callback error " + th.toString());
                        }
                    }
                    if (XGIOperateCallback.this != null) {
                        try {
                            CommonWorkingThread.getInstance().execute(new a(XGIOperateCallback.this, context2, intent2, 1, 1, false));
                        } catch (Throwable th2) {
                            TLogger.e("XGPushManager", "unregister handle callback error " + th2.toString());
                        }
                    }
                    XGApiConfig.clearRegistered(context2);
                    XGPushManager.enableService(context2, false);
                }
            }, new IntentFilter("com.tencent.android.xg.vip.action.UNREGISTER.RESULT.V4"), 4);
            BroadcastAgent.sendBroadcast(context, intent);
        } catch (Throwable th) {
            TLogger.e("XGPushManager", "unregister registerReceiver error " + th.toString());
        }
    }

    private static void b(final Context context, final String str, final long j2, final String str2, final int i2, final String str3, final XGIOperateCallback xGIOperateCallback) {
        if (XGApiConfig.isRegistered(context) && i.h(context)) {
            a(context, str, j2, str2, i2, str3, xGIOperateCallback);
        } else {
            registerPush(context, new com.tencent.android.tpush.b() { // from class: com.tencent.android.tpush.XGPushManager.9
                @Override // com.tencent.android.tpush.b
                public void a(Object obj, int i3) {
                    TLogger.d("XGPushManager", "accountPrepare onServiceRspSuccess");
                    XGPushManager.a(context, str, j2, str2, i2, str3, xGIOperateCallback);
                }

                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onFail(Object obj, int i3, String str4) {
                    XGIOperateCallback xGIOperateCallback2 = xGIOperateCallback;
                    if (xGIOperateCallback2 != null) {
                        xGIOperateCallback2.onFail(obj, i3, str4);
                    }
                }

                @Override // com.tencent.android.tpush.XGIOperateCallback
                public void onSuccess(Object obj, int i3) {
                }
            });
        }
    }

    public static void c(Context context, String str, int i2, String str2, XGIOperateCallback xGIOperateCallback, long j2, String str3, String str4, String str5, String str6, long j3) {
        d(context, str, i2, str2, xGIOperateCallback, j2, str3, str4, str5, str6, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(Context context, Intent intent, final XGIOperateCallback xGIOperateCallback) {
        synchronized (XGPushManager.class) {
            TLogger.ii("XGPushManager", "Action -> Register to TPNS server");
            if (xGIOperateCallback != null) {
                final boolean booleanExtra = intent != null ? intent.getBooleanExtra("invokedCallBack", false) : false;
                BroadcastAgent.registerReceiver(context, new BroadcastReceiver() { // from class: com.tencent.android.tpush.XGPushManager.19
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context2, Intent intent2) {
                        TLogger.ii("XGPushManager", "Register call back to " + context2.getPackageName());
                        try {
                            CommonWorkingThread.getInstance().execute(new a(XGIOperateCallback.this, context2, intent2, 1, 0, booleanExtra));
                        } catch (Throwable th) {
                            TLogger.e("XGPushManager", "register handle callback error " + th.toString());
                        }
                        i.a(context2, this);
                    }
                }, new IntentFilter("com.tencent.android.xg.vip.action.REGISTER.RESULT.V4"), 4);
            }
            BroadcastAgent.sendBroadcast(context, intent);
        }
    }

    public static void b(Context context, String str, int i2, String str2, XGIOperateCallback xGIOperateCallback, long j2, String str3, String str4, String str5, String str6, long j3) {
        a(context, str, i2, str2, xGIOperateCallback, j2, str3, str4, str5, str6, f8480d, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent b(final Context context, Intent intent, XGIOperateCallback xGIOperateCallback, AccountInfo accountInfo) {
        if (context != null && intent != null && xGIOperateCallback != null) {
            try {
                if (XGPushConfig.isUsedTpnsChannel(context)) {
                    try {
                        n nVar = new n();
                        String str = (String) CacheHelper.get(context, com.tencent.android.tpush.d.b.a.b());
                        if (!i.b(str)) {
                            str = i.e(str);
                        }
                        nVar.a(str);
                        if (!i.b(nVar.b)) {
                            if (accountInfo != null) {
                                final ArrayList arrayList = new ArrayList();
                                arrayList.add(accountInfo);
                                upsertAccounts(context, arrayList, new XGIOperateCallback() { // from class: com.tencent.android.tpush.XGPushManager.18
                                    @Override // com.tencent.android.tpush.XGIOperateCallback
                                    public void onFail(Object obj, int i2, String str2) {
                                        TLogger.d("XGPushManager", "upsertAccounts failed ， error：" + i2 + ", msg:" + str2 + " retry direct");
                                        XGPushManager.upsertAccounts(context, arrayList, (XGIOperateCallback) null);
                                    }

                                    @Override // com.tencent.android.tpush.XGIOperateCallback
                                    public void onSuccess(Object obj, int i2) {
                                        TLogger.d("XGPushManager", "upsertAccounts succenss !");
                                    }
                                });
                            }
                            xGIOperateCallback.onSuccess(nVar.b, 0);
                            intent.putExtra("invokedCallBack", true);
                            return intent;
                        }
                    } catch (Throwable unused) {
                    }
                }
                m a2 = m.a(context, intent, false);
                JSONObject jSONObject = null;
                if (a2 != null) {
                    try {
                        jSONObject = a2.a(context);
                    } catch (Throwable unused2) {
                    }
                }
                if (a2 != null && jSONObject != null) {
                    if (!a2.I && XGApiConfig.isRegistered(context)) {
                        TLogger.d("XGPushManager", "registerPush same request within an hour");
                        String token = XGPushConfig.getToken(context);
                        xGIOperateCallback.onSuccess(token, 0);
                        intent.putExtra(Constants.FLAG_TOKEN, token);
                        intent.putExtra("hasRegisted", true);
                        intent.putExtra("invokedCallBack", true);
                        return intent;
                    } else if (!i.b(jSONObject.toString())) {
                        GUIDInfo finalGuidInfo = GuidInfoManager.getFinalGuidInfo(context, true, jSONObject.toString());
                        if (finalGuidInfo != null && !finalGuidInfo.isError()) {
                            if (xGIOperateCallback instanceof com.tencent.android.tpush.b) {
                                ((com.tencent.android.tpush.b) xGIOperateCallback).a(finalGuidInfo.token, finalGuidInfo.errCode);
                            }
                            xGIOperateCallback.onSuccess(finalGuidInfo.token, finalGuidInfo.errCode);
                            XGApiConfig.setRegisterSuccess(context);
                            String f2 = i.f(n.a(context, finalGuidInfo.token));
                            if (!i.b(f2)) {
                                String str2 = (String) CacheHelper.get(context, com.tencent.android.tpush.d.b.a.a(a2.f8986a + ""));
                                if (str2 == null || !TextUtils.equals(str2, a2.v)) {
                                    CacheHelper.set(context, com.tencent.android.tpush.d.b.a.b().set(f2));
                                } else {
                                    CacheHelper.set(context, com.tencent.android.tpush.d.b.a.b().set(f2), com.tencent.android.tpush.d.b.a.a(a2.f8986a + "").set(a2.v), com.tencent.android.tpush.d.b.a.b(a2.f8986a + "").set(Long.valueOf(System.currentTimeMillis())));
                                }
                                com.tencent.android.tpush.service.util.b.a(a2.N);
                            }
                            intent.putExtra(Constants.FLAG_TOKEN, finalGuidInfo.token);
                            intent.putExtra("hasRegisted", true);
                            intent.putExtra("invokedCallBack", true);
                            return intent;
                        } else if (!XGPushConfig.isUsedTpnsChannel(context)) {
                            xGIOperateCallback.onFail("", finalGuidInfo.errCode, finalGuidInfo.result);
                            intent.putExtra("hasRegisted", false);
                            intent.putExtra("invokedCallBack", false);
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        }
        return intent;
    }

    private static String a(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            if (map.size() > 50) {
                return "out_size";
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String value = entry.getValue();
                    if (g.a(value)) {
                        return "empty";
                    }
                    if (value.length() > 50) {
                        return "out_length";
                    }
                    jSONObject.put(entry.getKey(), value);
                }
                return jSONObject.toString();
            } catch (Throwable th) {
                TLogger.ww("XGPushManager", "unexpected for getAttributesFromMap", th);
                return null;
            }
        }
        TLogger.ee("XGPushManager", "getAttributesFromMap -> the parameter attributes is null.");
        return null;
    }

    private static boolean c() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (f8482f == null) {
                f8482f = new ConcurrentLinkedQueue();
            }
            if (f8482f.size() < 10) {
                f8482f.offer(Long.valueOf(currentTimeMillis));
                return false;
            } else if (currentTimeMillis - f8482f.peek().longValue() < SobotOkHttpUtils.DEFAULT_MILLISECONDS) {
                return true;
            } else {
                f8482f.poll();
                f8482f.offer(Long.valueOf(currentTimeMillis));
                return false;
            }
        } catch (Throwable th) {
            TLogger.i("XGPushManager", "apiRateLimit error: " + th.toString());
            return false;
        }
    }

    private static String a(Set<String> set) {
        if (set == null) {
            TLogger.ee("XGPushManager", "getAttributesFromSet -> the parameter attributes is null.");
            return null;
        } else if (set.size() > 50) {
            return "out_size";
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : set) {
                    if (str.length() > 50) {
                        return "out_length";
                    }
                    jSONObject.put(str, "0");
                }
                return jSONObject.toString();
            } catch (Throwable th) {
                TLogger.ww("XGPushManager", "unexpected for getAttributesFromSet", th);
                return null;
            }
        }
    }

    private static boolean a(String str, String str2) {
        if (g.a(str2)) {
            TLogger.ee("XGPushManager", str + " -> getAttributesFromMap return null!!!");
            return false;
        } else if ("empty".equals(str2)) {
            TLogger.ee("XGPushManager", str + " -> the parameter attributes has empty value!");
            return false;
        } else if ("out_length".equals(str2)) {
            TLogger.ee("XGPushManager", str + " -> the parameter attribute_name or attribute_value length is out of limit:50");
            return false;
        } else if ("out_size".equals(str2)) {
            TLogger.ee("XGPushManager", str + " -> the parameter attributes size is out of limit:50");
            return false;
        } else {
            return true;
        }
    }

    public static void a(Context context, String str, int i2, long j2, String str2, String str3) {
        c(context, str, i2, j2, str2, str3, null);
    }

    public static void a(Context context, String str, int i2, long j2, String str2, String str3, XGIOperateCallback xGIOperateCallback) {
        c(context, str, i2, j2, str2, str3, xGIOperateCallback);
    }

    public static void a(final Context context, final String str, final long j2, String str2, final int i2, final String str3, final XGIOperateCallback xGIOperateCallback) {
        if (context != null) {
            if (i.a(context) > 0) {
                return;
            }
            CommonWorkingThread.getInstance().execute(new TTask() { // from class: com.tencent.android.tpush.XGPushManager.10
                @Override // com.tencent.tpns.baseapi.base.util.TTask
                public void TRun() {
                    try {
                        String str4 = str;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = str4;
                        long j3 = j2;
                        if (j3 <= 0) {
                            j3 = XGPushConfig.getAccessId(context);
                        }
                        long j4 = j3;
                        if (j4 >= 0) {
                            if (XGPushConfig.isUsedHttpAccountOperate(context)) {
                                com.tencent.android.tpush.common.a.a(context, str5, j4, i2, xGIOperateCallback);
                                return;
                            }
                            String accessKey = XGPushConfig.getAccessKey(context);
                            Intent intent = new Intent(context.getPackageName() + "com.tencent.android.xg.vip.action.ACCOUNT.V4");
                            intent.putExtra("accId", j4);
                            intent.putExtra(Constants.FLAG_ACC_KEY, Rijndael.encrypt(accessKey));
                            intent.putExtra(Constants.FLAG_ACCOUNT_OP_TYPE, i2);
                            intent.putExtra(Constants.FLAG_ACCOUNT, Rijndael.encrypt(str));
                            intent.putExtra(Constants.FLAG_ACCOUNT_FEEDBACK, str3);
                            intent.putExtra(Constants.FLAG_PACK_NAME, Rijndael.encrypt(context.getPackageName()));
                            if (xGIOperateCallback != null) {
                                BroadcastAgent.registerReceiver(context, new BroadcastReceiver(this) { // from class: com.tencent.android.tpush.XGPushManager.10.1

                                    /* renamed from: a  reason: collision with root package name */
                                    public final /* synthetic */ AnonymousClass10 f8491a;

                                    /* compiled from: ProGuard */
                                    /* renamed from: com.tencent.android.tpush.XGPushManager$10$1$1  reason: invalid class name and collision with other inner class name */
                                    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
                                    public class C01491 extends TTask {

                                        /* renamed from: a  reason: collision with root package name */
                                        public final /* synthetic */ Intent f8492a;
                                        public final /* synthetic */ AnonymousClass1 b;

                                        public C01491(AnonymousClass1 anonymousClass1, Intent intent) {
                                        }

                                        @Override // com.tencent.tpns.baseapi.base.util.TTask
                                        public void TRun() {
                                        }
                                    }

                                    @Override // android.content.BroadcastReceiver
                                    public void onReceive(Context context2, Intent intent2) {
                                    }
                                }, new IntentFilter("com.tencent.android.xg.vip.action.ACCOUNT.RESULT.V4"), 4);
                            }
                            BroadcastAgent.sendBroadcast(context, intent);
                            return;
                        }
                        throw new IllegalArgumentException("The accessId not set!");
                    } catch (Throwable unused) {
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("The context parameter can not be null!");
    }

    public static XGPushClickedResult a(final Activity activity) {
        TLogger.ii("XGPushManager", ">>> onActivityStarted activity=" + activity);
        if (activity == null || activity.getIntent() == null) {
            return null;
        }
        final Intent intent = activity.getIntent();
        if ("true".equalsIgnoreCase(intent.getStringExtra(Constants.TAG_TPUSH_MESSAGE)) && i.a(activity.getApplicationContext()) <= 0) {
            XGPushClickedResult xGPushClickedResult = new XGPushClickedResult();
            xGPushClickedResult.parseIntent(intent);
            intent.removeExtra(Constants.TAG_TPUSH_MESSAGE);
            CommonWorkingThread.getInstance().execute(new TTask() { // from class: com.tencent.android.tpush.XGPushManager.11
                @Override // com.tencent.tpns.baseapi.base.util.TTask
                public void TRun() {
                    XGPushManager.a(activity, intent);
                    XGPushManager.c(activity, intent);
                }
            });
            return xGPushClickedResult;
        }
        return null;
    }

    private static String b(Set<Integer> set) {
        if (set != null && set.size() > 0) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (Integer num : set) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(Constants.FLAG_ACCOUNT, "");
                    jSONObject.put("account_type", num);
                    jSONArray.put(jSONObject);
                }
                TLogger.d("XGPushManager", "getAccountTypeSetJson | " + jSONArray.toString());
                return jSONArray.toString();
            } catch (Throwable th) {
                TLogger.ww("XGPushManager", "getAccountTypeSetJson:", th);
            }
        }
        return null;
    }

    public static long a(Context context, XGLocalMessage xGLocalMessage, long j2) {
        try {
            if (context != null && xGLocalMessage != null) {
                if (Security.checkTpnsSecurityLibSo(context)) {
                    long accessId = j2 <= 0 ? XGPushConfig.getAccessId(context) : j2;
                    long currentTimeMillis = System.currentTimeMillis();
                    StringBuilder sb = new StringBuilder(64);
                    sb.append(accessId);
                    sb.append(xGLocalMessage.getMsgId());
                    sb.append(context.getPackageName());
                    String str = "";
                    sb.append(TextUtils.isEmpty(xGLocalMessage.getTitle()) ? "" : xGLocalMessage.getTitle());
                    sb.append(TextUtils.isEmpty(xGLocalMessage.getContent()) ? "" : xGLocalMessage.getContent());
                    String custom_content = xGLocalMessage.getCustom_content();
                    sb.append((TextUtils.isEmpty(custom_content) || new JSONObject(custom_content).length() == 0) ? "" : "");
                    if (xGLocalMessage.getType() == 1) {
                        sb.append(TextUtils.isEmpty(xGLocalMessage.getUrl()) ? "" : xGLocalMessage.getUrl());
                        sb.append(TextUtils.isEmpty(xGLocalMessage.getIntent()) ? "" : xGLocalMessage.getIntent());
                        if (!TextUtils.isEmpty(xGLocalMessage.getActivity())) {
                            str = xGLocalMessage.getActivity();
                        }
                        sb.append(str);
                    }
                    String sb2 = sb.toString();
                    String str2 = Constants.LOCAL_MESSAGE_FLAG + Md5.md5(sb2);
                    long expirationTimeMs = xGLocalMessage.getExpirationTimeMs();
                    PushPreferences.putLong(context, str2, expirationTimeMs);
                    TLogger.i("XGPushManager", sb2 + ",tag:" + str2 + ",exp:" + expirationTimeMs);
                    j jVar = new j();
                    jVar.f8966a = xGLocalMessage.getMsgId();
                    jVar.b = accessId;
                    jVar.f8970g = context.getPackageName();
                    jVar.c = xGLocalMessage.getBusiMsgId();
                    jVar.f8971h = currentTimeMillis / 1000;
                    long j3 = -currentTimeMillis;
                    jVar.f8974k = j3;
                    jVar.f8975l = xGLocalMessage.getTtl();
                    jVar.f8969f = xGLocalMessage.getType();
                    jVar.f8972i = 0L;
                    jVar.f8973j = xGLocalMessage.getDate();
                    jVar.f8968e = "{\"title\":\"" + xGLocalMessage.getTitle() + "\",\"content\":\"" + a(xGLocalMessage.getContent()) + "\",\"builder_id\":" + xGLocalMessage.getBuilderId() + ",\"custom_content\":" + xGLocalMessage.getCustom_content() + ",\"ring\":" + xGLocalMessage.getRing() + ",\"vibrate\":" + xGLocalMessage.getVibrate() + ",\"lights\":" + xGLocalMessage.getLights() + ",\"n_id\":" + xGLocalMessage.getNotificationId() + ",\"is_show_type\":" + xGLocalMessage.getNsModel() + ", \"n_ch_id\":\"" + xGLocalMessage.getChannelId() + "\",\"ring_raw\":\"" + xGLocalMessage.getRing_raw() + "\",\"icon_type\":" + xGLocalMessage.getIcon_type() + ",\"color\":" + xGLocalMessage.getColor() + ",\"icon_res\":\"" + xGLocalMessage.getIcon_res() + "\",\"xg_media_resources\":\"" + xGLocalMessage.getTpns_media_resources() + "\",\"style_id\":" + xGLocalMessage.getStyle_id() + ",\"small_icon\":\"" + xGLocalMessage.getSmall_icon() + "\",\"badge_type\":" + xGLocalMessage.getBadgeType() + ",\"thread_id\":\"" + xGLocalMessage.getThreadId() + "\",\"thread_sumtext\":\"" + xGLocalMessage.getThreadSumText() + "\",\"clearable\":1,\"accept_time\":[{\"start\":{\"hour\":\"" + xGLocalMessage.getHour() + "\",\"min\":\"" + xGLocalMessage.getMin() + "\"},\"end\":{\"hour\":\"23\",\"min\":\"59\"}}],\"action\":{\"action_type\":" + xGLocalMessage.getAction_type() + ",\"activity\":\"" + xGLocalMessage.getActivity() + "\",\"browser\":{\"url\":\"" + xGLocalMessage.getUrl() + "\"},\"intent\":\"" + xGLocalMessage.getIntent() + "\",\"package_name\":{\"packageDownloadUrl\":\"" + xGLocalMessage.getPackageDownloadUrl() + "\",\"packageName\":\"" + xGLocalMessage.getPackageName() + "\"}}}";
                    jVar.t = xGLocalMessage.targetType;
                    jVar.u = xGLocalMessage.source;
                    jVar.w = xGLocalMessage.templateId;
                    jVar.x = xGLocalMessage.traceId;
                    com.tencent.android.tpush.service.channel.a aVar = new com.tencent.android.tpush.service.channel.a(0, "127.0.0.1");
                    Intent intent = new Intent(Constants.ACTION_INTERNAL_PUSH_MESSAGE);
                    intent.setPackage(jVar.f8970g);
                    intent.putExtra(MessageKey.MSG_ID, jVar.f8966a);
                    intent.putExtra("content", Rijndael.encrypt(jVar.f8968e));
                    intent.putExtra("date", jVar.f8973j);
                    intent.putExtra("type", jVar.f8969f);
                    intent.putExtra("accId", jVar.b);
                    intent.putExtra(MessageKey.MSG_BUSI_MSG_ID, jVar.c);
                    intent.putExtra(MessageKey.MSG_CREATE_TIMESTAMPS, jVar.f8971h);
                    intent.putExtra(MessageKey.MSG_CREATE_MULTIPKG, jVar.f8972i);
                    intent.putExtra(MessageKey.MSG_SERVER_TIME, jVar.f8974k * 1000);
                    intent.putExtra(MessageKey.MSG_TTL, jVar.f8975l);
                    intent.putExtra(MessageKey.MSG_EXPIRE_TIME, expirationTimeMs);
                    intent.putExtra(MessageKey.MSG_PUSH_CHANNEL, xGLocalMessage.pushChannel);
                    intent.putExtra(MessageKey.MSG_PUSH_TIME, xGLocalMessage.pushTime);
                    intent.putExtra("groupId", xGLocalMessage.nGroupId);
                    intent.putExtra(MessageKey.MSG_SERVICE_ACK, true);
                    intent.putExtra(MessageKey.MSG_EXTRA_HOST, i.d(aVar.b()));
                    intent.putExtra(MessageKey.MSG_EXTRA_PORT, aVar.c());
                    intent.putExtra(MessageKey.MSG_EXTRA_PACT, com.tencent.android.tpush.service.c.a(aVar.a()));
                    intent.putExtra(MessageKey.MSG_EXTRA_PUSHTIME, currentTimeMillis);
                    intent.putExtra(MessageKey.MSG_TARGET_TYPE, jVar.t);
                    intent.putExtra(MessageKey.MSG_SOURCE, jVar.u);
                    intent.putExtra(MessageKey.MSG_TEMPLATE_ID, jVar.w);
                    intent.putExtra(MessageKey.MSG_TRACE_ID, jVar.x);
                    e.a(context).b(intent);
                    return j3;
                }
                return -1L;
            }
            TLogger.e("XGPushManager", "addLocalNotification context == null or msg == null");
            return -1L;
        } catch (Throwable th) {
            TLogger.e("XGPushManager", "addLocalNotification ", th);
            return 0L;
        }
    }

    public static void a(Context context, Intent intent) {
        MessageManager.getInstance().updateCachedMsgIntentToClick(context, intent.getLongExtra(MessageKey.MSG_ID, -1L));
        Intent intent2 = new Intent("com.tencent.android.xg.vip.action.PUSH_CLICK.RESULT.V4");
        intent2.putExtras(intent);
        intent2.putExtra(Constants.FLAG_PACK_NAME, context.getPackageName());
        intent2.putExtra(Constants.FLAG_CLICK_TIME, System.currentTimeMillis() / 1000);
        ServiceStat.appReportNotificationClicked(context, intent2);
        BroadcastAgent.sendBroadcast(context, intent2);
    }

    private static void a(Context context, Intent intent, String str) {
        if (context == null || intent == null || str == null) {
            return;
        }
        Intent intent2 = new Intent(str);
        intent2.putExtras(intent);
        intent2.putExtra(Constants.FLAG_PACK_NAME, context.getPackageName());
        intent2.putExtra(Constants.FLAG_CLICK_TIME, System.currentTimeMillis() / 1000);
        if ("com.tencent.android.xg.vip.action.PUSH_CANCELLED.RESULT.V4".equals(str)) {
            intent2.putExtra("action", NotificationAction.delete.getType());
            ServiceStat.appReportNotificationCleared(context, intent2);
        } else if ("com.tencent.android.xg.vip.action.PUSH_CLICK.RESULT.V4".equals(str)) {
            intent2.putExtra("action", NotificationAction.clicked.getType());
            ServiceStat.appReportNotificationClicked(context, intent2);
        }
        BroadcastAgent.sendBroadcast(context, intent2);
    }

    public static void a(Context context, String str, int i2, String str2, XGIOperateCallback xGIOperateCallback, long j2, String str3, String str4, String str5, String str6, long j3) {
        if (context == null) {
            xGIOperateCallback.onFail("", ReturnCode.CODE_LOGIC_ILLEGAL_ARGUMENT.getType(), "The context parameter can not be null!");
        } else if (c()) {
            if (xGIOperateCallback != null) {
                ReturnCode returnCode = ReturnCode.CODE_SDK_API_FREQUENCY_LIMIT_ERROR;
                xGIOperateCallback.onFail("", returnCode.getType(), returnCode.getStr());
            }
        } else if (!NetworkUtil.isNetworkConnected(context) && xGIOperateCallback != null) {
            xGIOperateCallback.onFail("", ReturnCode.CODE_NETWORK_UNREACHABLE.getType(), "no network, please check again!");
        } else {
            com.tencent.android.tpush.service.util.b.f9031a = 1;
            initCommonComponents(context);
            Context applicationContext = context.getApplicationContext();
            if (!PushPreferences.getBoolean(applicationContext, Constants.KEY_START_SERVICE_BY_USER, false)) {
                PushPreferences.putBoolean(applicationContext, Constants.KEY_START_SERVICE_BY_USER, true);
            }
            setContext(applicationContext);
            enableService(applicationContext, true);
            if (!f8479a) {
                ServiceStat.reportIsCustomDataAcquisitionVersion(applicationContext);
                f8479a = true;
            }
            c = Long.valueOf(System.currentTimeMillis());
            c(applicationContext, str, i2, str2, xGIOperateCallback, j2, str3, str4, str5, str6, j3);
            if (i.a(XGPushConfig.getToken(applicationContext))) {
                return;
            }
            try {
                TLogger.d("XGPushManager", "try to setup registerRunnable4NewDevice");
                b(applicationContext, str, i2, str2, xGIOperateCallback, j2, str3, str4, str5, str6, j3);
            } catch (Throwable th) {
                TLogger.e("XGPushManager", "doDumpRegister4NewDevice exe error", th);
            }
        }
    }

    public static void a(final Context context, final String str, final int i2, final String str2, XGIOperateCallback xGIOperateCallback, final long j2, final String str3, final String str4, final String str5, final String str6, final long j3, final long j4) {
        if (f8481e != null) {
            TLogger.d("XGPushManager", "update registerRunnable4NewDevice");
            CommonWorkingThread.getInstance().remove(f8481e);
        }
        f8481e = new TTask() { // from class: com.tencent.android.tpush.XGPushManager.16
            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
                try {
                    XGIOperateCallback xGIOperateCallback2 = new XGIOperateCallback(this) { // from class: com.tencent.android.tpush.XGPushManager.16.1

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ AnonymousClass16 f8507a;

                        @Override // com.tencent.android.tpush.XGIOperateCallback
                        public void onFail(Object obj, int i3, String str7) {
                        }

                        @Override // com.tencent.android.tpush.XGIOperateCallback
                        public void onSuccess(Object obj, int i3) {
                        }
                    };
                    TLogger.d("XGPushManager", "registerRunnable4NewDevice, delayMillis:" + j3 + ",registerRunnable4NewDevice:" + XGPushManager.f8481e);
                    XGPushManager.c(context, str, i2, str2, xGIOperateCallback2, j2, str3, str4, str5, str6, j4);
                } catch (Throwable th) {
                    TLogger.e("XGPushManager", "doDumpRegister4NewDevice run error", th);
                }
            }
        };
        CommonWorkingThread.getInstance().execute(f8481e, j3);
    }

    private static String a(Context context, long j2) {
        try {
            if (XGPushConfig.isUsedOtherPush(context) && d.a(context).l()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (j2 < 0 || j2 > h.w.a.e.b.b.s.e.r) {
                    TLogger.ii("XGPushManager", "invalid sync wait other channel push time:" + j2 + ", reset to 4s ");
                    j2 = 4000L;
                }
                int i2 = 1000;
                int i3 = ((int) j2) / 2;
                if (i3 != 0 && 1000 > i3) {
                    i2 = 20;
                    if (i3 > 20) {
                        i2 = i3;
                    }
                }
                do {
                    try {
                        String g2 = d.a(context).g();
                        if (!i.b(g2)) {
                            TLogger.ii("XGPushManager", "get chanelToken is : " + g2);
                            d.a(context).p();
                            return g2;
                        }
                        String h2 = d.a(context).h();
                        if (!i.b(h2)) {
                            TLogger.ii("XGPushManager", "get fcmToken is : " + h2);
                            d.a(context).p();
                            return h2;
                        } else if (j2 != 0) {
                            Thread.sleep(i2);
                        }
                    } catch (InterruptedException unused) {
                        TLogger.e("XGPushManager", "OtherPush: call getToken InterruptedException!");
                        return null;
                    } catch (Throwable unused2) {
                        TLogger.e("XGPushManager", "OtherPush: call getToken Error!");
                        return null;
                    }
                } while (System.currentTimeMillis() - currentTimeMillis < j2);
            }
        } catch (Throwable unused3) {
        }
        TLogger.i("XGPushManager", "Can't get otherPush token ");
        return null;
    }

    public static void a(Context context, Intent intent, XGIOperateCallback xGIOperateCallback, boolean z) {
        i.e(context);
        b bVar = new b(context, intent, xGIOperateCallback);
        try {
            BroadcastAgent.registerReceiver(context, bVar, new IntentFilter("com.tencent.android.xg.vip.action.SERVICE_START.V4"), 4);
        } catch (Throwable th) {
            TLogger.e("XGPushManager", "Receiver not registered exception error : ", th);
        }
        c cVar = new c(context, intent, xGIOperateCallback);
        try {
            f8485i.put(bVar, cVar);
            CommonWorkingThread.getInstance().execute(cVar, SobotOkHttpUtils.DEFAULT_MILLISECONDS);
        } catch (Throwable th2) {
            TLogger.e("XGPushManager", "mapTimeRunnableOfMessage error", th2);
        }
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\f') {
                sb.append("\\f");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        sb.append("\\b");
                        continue;
                    case '\t':
                        sb.append("\\t");
                        continue;
                    case '\n':
                        sb.append("\\n");
                        continue;
                    default:
                        if (charAt > 31) {
                            sb.append(charAt);
                            break;
                        } else {
                            sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                            continue;
                        }
                }
            } else {
                sb.append('\\');
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    private static String a(List<AccountInfo> list) {
        if (list != null && list.size() != 0) {
            JSONArray jSONArray = new JSONArray();
            try {
                for (AccountInfo accountInfo : list) {
                    if (accountInfo != null && !i.b(accountInfo.accountName)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Constants.FLAG_ACCOUNT, accountInfo.accountName);
                        jSONObject.put("account_type", accountInfo.accountType);
                        jSONArray.put(jSONObject);
                    }
                }
                TLogger.d("XGPushManager", "getAccountInfosJsonArrayString | " + jSONArray.toString());
                if (jSONArray.length() > 0) {
                    return jSONArray.toString();
                }
            } catch (Throwable th) {
                TLogger.ww("XGPushManager", "getAccountInfosJsonArrayString | ", th);
            }
        }
        return "";
    }

    private static String a(String str, int i2) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("account_type", i2);
            if (i2 == AccountType.PHONE_NUMBER.getValue()) {
                str = bytesToHex(Security.encryptSrvData(str.getBytes()));
            }
            jSONObject.put(Constants.FLAG_ACCOUNT, str);
            jSONArray.put(jSONObject);
            return jSONArray.toString();
        } catch (Throwable th) {
            TLogger.ww("XGPushManager", "getTypeAccountsJsonArrayStr:", th);
            return null;
        }
    }
}
