package com.tencent.android.tpush.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.android.tpush.XGPushConfig;
import com.tencent.android.tpush.common.BroadcastAgent;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.ReturnCode;
import com.tencent.android.tpush.common.i;
import com.tencent.android.tpush.data.RegisterEntity;
import com.tencent.android.tpush.encrypt.Rijndael;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.android.tpush.service.cache.CacheManager;
import com.tencent.android.tpush.service.protocol.m;
import com.tencent.android.tpush.service.protocol.n;
import com.tencent.android.tpush.service.protocol.r;
import com.tencent.android.tpush.service.util.f;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.tpns.baseapi.base.device.GuidInfoManager;
import com.tencent.tpns.baseapi.base.logger.TBaseLogger;
import com.tencent.tpns.baseapi.base.util.CommonWorkingThread;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.mqttchannel.api.MqttConfig;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Iterator;
import net.sourceforge.pinyin4j.ChineseToPinyinResource;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ProGuard */
@JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.INTENTCHECK})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f8809a;
    private static volatile C0157a b;
    private static volatile c c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile d f8810d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f8811e = false;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<Intent> f8812f = new ArrayList<>();

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.android.tpush.service.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class C0157a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f8853a;

        private C0157a(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public /* synthetic */ C0157a(a aVar, AnonymousClass1 anonymousClass1) {
        }
    }

    /* compiled from: ProGuard */
    @JgClassChecked(author = 1, fComment = "确认已进行安全校验", lastDate = "20150316", reviewer = 3, vComment = {EType.INTENTCHECK})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class b extends TTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f8854a;
        private Context b;
        private Intent c;

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.android.tpush.service.a$b$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements TBaseLogger.WriteFileCallback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f8855a;

            public AnonymousClass1(b bVar) {
            }

            @Override // com.tencent.tpns.baseapi.base.logger.TBaseLogger.WriteFileCallback
            public void onFinished() {
            }
        }

        public b(a aVar, Context context, Intent intent) {
        }

        public static /* synthetic */ Intent a(b bVar) {
        }

        public static /* synthetic */ Context b(b bVar) {
        }

        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class c extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f8856a;

        private c(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public /* synthetic */ c(a aVar, AnonymousClass1 anonymousClass1) {
        }
    }

    private a() {
    }

    private static boolean a(Object obj) {
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class d extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public long f8857a;
        public final /* synthetic */ a b;

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.android.tpush.service.a$d$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends TTask {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f8858a;

            public AnonymousClass1(d dVar) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.android.tpush.service.a$d$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass2 extends TTask {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f8859a;
            public final /* synthetic */ d b;

            public AnonymousClass2(d dVar, Context context) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        private d(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public /* synthetic */ d(a aVar, AnonymousClass1 anonymousClass1) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        long longExtra = intent.getLongExtra("accId", -1L);
        String decrypt = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_ACC_KEY));
        String decrypt2 = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_PACK_NAME));
        int intExtra = intent.getIntExtra(Constants.FLAG_ATTRIBUTES_TYPE, -1);
        String decrypt3 = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_ATTRIBUTES_NAME));
        try {
            com.tencent.android.tpush.service.c.a().b(longExtra, decrypt, decrypt2, intExtra, decrypt3, new com.tencent.android.tpush.service.c.a(this, longExtra, intExtra, decrypt3, decrypt2, intent.getStringExtra(Constants.FLAG_ATTRIBUTES_OPER_NAME)) { // from class: com.tencent.android.tpush.service.a.5

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ long f8822a;
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ String f8823d;

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ String f8824e;

                /* renamed from: f  reason: collision with root package name */
                public final /* synthetic */ a f8825f;

                @Override // com.tencent.android.tpush.service.c.a
                public void a(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
                }

                @Override // com.tencent.android.tpush.service.c.a
                public void b(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
                }
            });
        } catch (Throwable th) {
            TLogger.e("PushServiceBroadcastHandler", ">> attributes Handler error " + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        long longExtra = intent.getLongExtra("accId", -1L);
        String decrypt = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_ACC_KEY));
        String decrypt2 = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_PACK_NAME));
        int intExtra = intent.getIntExtra(Constants.FLAG_TAG_OFFSET, -1);
        int intExtra2 = intent.getIntExtra("limit", -1);
        String stringExtra = intent.getStringExtra(Constants.FLAG_TAG_QUERY_TYPE);
        try {
            com.tencent.android.tpush.service.c.a().a(longExtra, decrypt, decrypt2, intExtra, intExtra2, stringExtra, new com.tencent.android.tpush.service.c.a(this, longExtra, intExtra, intExtra2, decrypt2, intent.getStringExtra(Constants.FLAG_QUERY_TAGS_OPER_NAME), stringExtra) { // from class: com.tencent.android.tpush.service.a.6

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ long f8826a;
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ String f8827d;

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ String f8828e;

                /* renamed from: f  reason: collision with root package name */
                public final /* synthetic */ String f8829f;

                /* renamed from: g  reason: collision with root package name */
                public final /* synthetic */ a f8830g;

                @Override // com.tencent.android.tpush.service.c.a
                public void a(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
                }

                @Override // com.tencent.android.tpush.service.c.a
                public void b(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
                }
            });
        } catch (Throwable th) {
            TLogger.e("PushServiceBroadcastHandler", ">> QueryTagsHandler error " + th);
            TLogger.e("PushServiceBroadcastHandler", ">> QueryTagsHandler error-> " + TLogger.getStackTraceString(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        long longExtra = intent.getLongExtra("accId", -1L);
        String decrypt = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_ACC_KEY));
        String decrypt2 = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_PACK_NAME));
        int intExtra = intent.getIntExtra(Constants.FLAG_TAG_TYPE, -1);
        String decrypt3 = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_TAG_NAME));
        try {
            com.tencent.android.tpush.service.c.a().a(longExtra, decrypt, decrypt2, intExtra, decrypt3, new com.tencent.android.tpush.service.c.a(this, longExtra, intExtra, decrypt3, decrypt2, intent.getStringExtra(Constants.FLAG_TAG_OPER_NAME)) { // from class: com.tencent.android.tpush.service.a.7

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ long f8831a;
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ String f8832d;

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ String f8833e;

                /* renamed from: f  reason: collision with root package name */
                public final /* synthetic */ a f8834f;

                @Override // com.tencent.android.tpush.service.c.a
                public void a(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
                }

                @Override // com.tencent.android.tpush.service.c.a
                public void b(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
                }
            });
        } catch (Throwable th) {
            TLogger.e("PushServiceBroadcastHandler", ">> TagHandler error " + th);
            TLogger.e("PushServiceBroadcastHandler", ">> TagHandler error-> " + TLogger.getStackTraceString(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        String decrypt = Rijndael.decrypt(intent.getStringExtra("accId"));
        String decrypt2 = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_ACC_KEY));
        String decrypt3 = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_PACK_NAME));
        String decrypt4 = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_TOKEN));
        CacheManager.UnregisterInfoByPkgName(decrypt3);
        try {
            com.tencent.android.tpush.service.c.a().a(decrypt4, com.tencent.android.tpush.service.util.a.a(), Long.parseLong(decrypt), decrypt2, decrypt3, new com.tencent.android.tpush.service.c.a(this, decrypt, decrypt3) { // from class: com.tencent.android.tpush.service.a.8

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ String f8835a;
                public final /* synthetic */ String b;
                public final /* synthetic */ a c;

                @Override // com.tencent.android.tpush.service.c.a
                public void a(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
                }

                @Override // com.tencent.android.tpush.service.c.a
                public void b(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
                }
            });
        } catch (Throwable th) {
            TLogger.e("PushServiceBroadcastHandler", ">>> unregister error " + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        String decrypt = Rijndael.decrypt(intent.getStringExtra("accId"));
        String decrypt2 = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_ACC_KEY));
        String decrypt3 = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_TOKEN));
        String decrypt4 = Rijndael.decrypt(intent.getStringExtra("other_push_type"));
        String decrypt5 = Rijndael.decrypt(intent.getStringExtra(Constants.OTHER_PUSH_TOKEN));
        String decrypt6 = Rijndael.decrypt(intent.getStringExtra("other_push_region"));
        TLogger.i("PushServiceBroadcastHandler", "binding OtherPush token with accessId = " + decrypt + "  token = " + decrypt3 + " otherPushType = " + decrypt4 + " otherPushToken = " + decrypt5 + " other push region: " + decrypt6);
        com.tencent.android.tpush.service.c.a().a(Long.parseLong(decrypt), decrypt2, decrypt4, decrypt5, decrypt6, new com.tencent.android.tpush.service.c.a(this, decrypt, decrypt3, decrypt4, decrypt5) { // from class: com.tencent.android.tpush.service.a.9

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f8836a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ String f8837d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ a f8838e;

            @Override // com.tencent.android.tpush.service.c.a
            public void a(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
            }

            @Override // com.tencent.android.tpush.service.c.a
            public void b(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        com.tencent.android.tpush.service.c.a().a(intent, new com.tencent.android.tpush.service.c.a(this, Rijndael.decrypt(intent.getStringExtra("accessId")), context, intent.getStringExtra("pkgName"), intent) { // from class: com.tencent.android.tpush.service.a.2

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f8814a;
            public final /* synthetic */ Context b;
            public final /* synthetic */ String c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ Intent f8815d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ a f8816e;

            @Override // com.tencent.android.tpush.service.c.a
            public void a(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
            }

            @Override // com.tencent.android.tpush.service.c.a
            public void b(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Context context, Intent intent) {
        int intExtra;
        if (intent == null || context == null || (intExtra = intent.getIntExtra(am.aU, -1)) < 10 || intExtra >= 36000) {
            return;
        }
        MqttConfig.setKeepAliveInterval(context, intExtra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(Context context, Intent intent) {
        if (intent == null || context == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("debugMode", false);
        XGPushConfig.enableDebug = booleanExtra;
        TLogger.enableDebug(context, booleanExtra);
    }

    public synchronized void c(Context context) {
        this.f8812f.clear();
        if (context != null) {
            if (b != null) {
                i.a(context, b);
                b = null;
            }
            if (c != null) {
                i.a(context, c);
                c = null;
            }
            if (f8810d != null) {
                i.a(context, f8810d);
                f8810d = null;
            }
        }
    }

    public synchronized void b(Context context) {
        TLogger.d("PushServiceBroadcastHandler", "action - registerReceiver");
        if (context != null) {
            if (b == null) {
                b = new C0157a(this, null);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addDataScheme(TPDownloadProxyEnum.DLPARAM_PACKAGE);
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                BroadcastAgent.registerReceiver(context, b, intentFilter, 4);
            }
            if (c == null) {
                c = new c(this, null);
                IntentFilter intentFilter2 = new IntentFilter();
                String packageName = context.getPackageName();
                intentFilter2.addAction(packageName + "com.tencent.android.xg.vip.action.REGISTER.V4");
                intentFilter2.addAction(packageName + "com.tencent.android.xg.vip.action.UNREGISTER.V4");
                intentFilter2.addAction(packageName + "com.tencent.android.xg.vip.action.ENABLE_DEBUG.V4");
                intentFilter2.addAction(packageName + "com.tencent.android.xg.vip.action.SET_HTINTERVALMS.V4");
                intentFilter2.addAction(packageName + "com.tencent.android.xg.vip.action.MSG_ACK.V4");
                intentFilter2.addAction(packageName + "com.tencent.android.xg.vip.action.ACCOUNT.V4");
                intentFilter2.addAction(packageName + "com.tencent.android.xg.vip.action.TAG.V4");
                intentFilter2.addAction(packageName + "com.tencent.android.xg.vip.action.QUERYTAGS.V4");
                intentFilter2.addAction("com.tencent.android.xg.vip.action.PUSH_CLICK.RESULT.V4");
                intentFilter2.addAction("com.tencent.android.xg.vip.action.PUSH_CANCELLED.RESULT.V4");
                intentFilter2.addAction(packageName + "com.tencent.android.xg.vip.action.ack.sdk2srv.V4");
                intentFilter2.addAction(packageName + "com.tencent.android.xg.vip.action.reserved.act.V4");
                intentFilter2.addAction(packageName + "com.tencent.android.xg.vip.action.UPDATE_OTHER_PUSH_TOKEN.V4");
                intentFilter2.addAction(packageName + "com.tencent.android.xg.vip.action.COMM_REPORT.V4");
                intentFilter2.addAction(packageName + "com.tencent.android.xg.vip.action.FLUSH.V4");
                intentFilter2.addAction(packageName + "com.tencent.android.xg.vip.action.ATTRIBUTE.V4");
                intentFilter2.addAction(packageName + "com.tencent.android.xg.vip.action.KILLSERVICEPROCESS.V4");
                BroadcastAgent.registerReceiver(context, c, intentFilter2, 4);
            }
            if (f8810d == null) {
                f8810d = new d(this, null);
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.USER_PRESENT");
                intentFilter3.addAction("android.intent.action.SCREEN_ON");
                intentFilter3.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter3.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                intentFilter3.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter3.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter3.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter3.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                if (Build.VERSION.SDK_INT >= 33) {
                    context.getApplicationContext().registerReceiver(f8810d, intentFilter3, 4);
                } else {
                    context.getApplicationContext().registerReceiver(f8810d, intentFilter3);
                }
            }
        }
    }

    public synchronized void a(Context context) {
        TLogger.ii("PushServiceBroadcastHandler", "handleServiceInited, beforeInitedIntents size:" + this.f8812f.size());
        this.f8811e = true;
        Intent intent = new Intent("com.tencent.android.xg.vip.action.SERVICE_START.V4");
        intent.putExtra("pkg", com.tencent.android.tpush.service.b.e().getPackageName());
        intent.putExtra("ver", "1.3.7.0");
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), intent);
        Iterator<Intent> it = this.f8812f.iterator();
        while (it.hasNext()) {
            TLogger.ii("PushServiceBroadcastHandler", "excute, beforeInitedIntents size:" + this.f8812f.size());
            CommonWorkingThread.getInstance().execute(new b(this, context, it.next()));
        }
        this.f8812f.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        long longExtra = intent.getLongExtra("accId", -1L);
        String decrypt = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_ACC_KEY));
        int intExtra = intent.getIntExtra(Constants.FLAG_ACCOUNT_OP_TYPE, -1);
        String decrypt2 = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_ACCOUNT));
        String stringExtra = intent.getStringExtra(Constants.FLAG_ACCOUNT_FEEDBACK);
        try {
            com.tencent.android.tpush.service.c.a().a(longExtra, decrypt, decrypt2, intExtra, new com.tencent.android.tpush.service.c.a(this, longExtra, Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_PACK_NAME)), decrypt2, stringExtra, intExtra) { // from class: com.tencent.android.tpush.service.a.4

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ long f8818a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ String f8819d;

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ int f8820e;

                /* renamed from: f  reason: collision with root package name */
                public final /* synthetic */ a f8821f;

                @Override // com.tencent.android.tpush.service.c.a
                public void a(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
                }

                @Override // com.tencent.android.tpush.service.c.a
                public void b(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
                }
            });
        } catch (Throwable th) {
            TLogger.e("PushServiceBroadcastHandler", ">> AccountHandler error " + th);
            TLogger.e("PushServiceBroadcastHandler", ">> AccountHandler error-> " + TLogger.getStackTraceString(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2, String str, int i3, String str2, String str3) {
        Intent intent = new Intent("com.tencent.android.xg.vip.action.TAG.RESULT.V4");
        intent.putExtra("flag", i3);
        intent.putExtra("operation", 0);
        if (!i.b(str2)) {
            intent.setPackage(str2);
        }
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), intent);
        a(i2, str, i3, str2, str3);
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f8809a == null) {
                f8809a = new a();
            }
            aVar = f8809a;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (dataString == null || context == null || !f.d(context, dataString.substring(8))) {
            return;
        }
        com.tencent.android.tpush.service.b.b().d();
        CommonWorkingThread.getInstance().execute(new TTask(this, context) { // from class: com.tencent.android.tpush.service.a.1

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f8813a;
            public final /* synthetic */ a b;

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }, 2000L);
    }

    private void a(int i2, String str, int i3, String str2) {
        if (i.b(str)) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.FLAG_ACCOUNT, str);
            jSONObject.put("accountType", i3);
            jSONArray.put(jSONObject);
            a(i2, jSONArray.toString(), str, 0, str2);
        } catch (Throwable th) {
            TLogger.ww("PushServiceBroadcastHandler", "getTypeAccountsJsonArrayStr:", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, String str, int i3, String str2, String str3, String str4) {
        Intent intent = new Intent("com.tencent.android.xg.vip.action.ATTRIBUTE.RESULT.V4");
        intent.putExtra("flag", i3);
        intent.putExtra("operation", 0);
        if (!i.b(str2)) {
            intent.setPackage(str2);
        }
        if (!i.b(str4)) {
            intent.putExtra("data", str4);
        }
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), intent);
        b(i2, str, i3, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, String str, String str2, int i3, String str3, String str4) {
        TLogger.e("PushServiceBroadcastHandler", "attributesFailHandler failed with (" + i2 + ChineseToPinyinResource.Field.COMMA + str + ChineseToPinyinResource.Field.COMMA + str3 + ChineseToPinyinResource.Field.RIGHT_BRACKET);
        Intent intent = new Intent("com.tencent.android.xg.vip.action.ATTRIBUTE.RESULT.V4");
        intent.putExtra("flag", i3);
        intent.putExtra("code", i2);
        intent.putExtra("msg", str);
        intent.putExtra("operation", 1);
        if (!i.b(str3)) {
            intent.setPackage(str3);
        }
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), intent);
        b(i2, str2, i3, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, Intent intent) {
        m a2 = m.a(context, intent, false);
        if (context == null || intent == null) {
            return;
        }
        try {
            com.tencent.android.tpush.service.c.a().a(context, a2, new com.tencent.android.tpush.service.c.a(this, context, a2) { // from class: com.tencent.android.tpush.service.a.3

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Context f8817a;
                public final /* synthetic */ m b;
                public final /* synthetic */ a c;

                @Override // com.tencent.android.tpush.service.c.a
                public void a(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
                }

                @Override // com.tencent.android.tpush.service.c.a
                public void b(int i2, String str, com.tencent.android.tpush.service.protocol.d dVar) {
                }
            });
        } catch (Throwable th) {
            TLogger.e("PushServiceBroadcastHandler", ">> register error " + th);
            TLogger.e("PushServiceBroadcastHandler", ">> register error-> " + TLogger.getStackTraceString(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            Intent intent = new Intent("com.tencent.android.xg.vip.action.UPDATE.OTHER.TOKEN.RESULT.V4");
            intent.putExtra("flag", ReturnCode.FLAG_ONLINE.getType());
            intent.putExtra("operation", 0);
            intent.setPackage(com.tencent.android.tpush.service.b.e().getPackageName());
            BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), intent);
        } catch (Throwable th) {
            TLogger.ee("PushServiceBroadcastHandler", "updateOtherPushTokenSuccessHandler error: " + th.toString());
        }
    }

    private void a(int i2, m mVar, String str, String str2, long j2, String str3) {
        Intent a2 = f.a(i2, str2, 1);
        a2.putExtra("accId", mVar.f8986a);
        if (str != null && str.length() != 0) {
            a2.putExtra(Constants.FLAG_TOKEN, str);
        }
        String str4 = mVar.f8988e;
        if (str4 != null && str4.length() != 0) {
            a2.putExtra(Constants.FLAG_TICKET, mVar.f8988e);
            a2.putExtra(Constants.FLAG_TICKET_TYPE, mVar.f8989f);
        }
        String str5 = mVar.c;
        if (str5 != null && str5.length() != 0) {
            a2.putExtra(Constants.FLAG_DEVICE_ID, mVar.c);
        }
        if (j2 >= 0) {
            a2.putExtra("otherPushType", j2);
            if (!i.b(str3)) {
                a2.putExtra("otherPushToken", str3);
            }
        }
        if (a(mVar)) {
            a2.putExtra(Constants.FLAG_REGISTER_FROM_CLOUDCTRL, true);
        }
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), a2);
    }

    private void b(int i2, String str, int i3, String str2, String str3) {
        Intent a2 = f.a(i2, str2, 7);
        a2.putExtra(Constants.FLAG_ATTRIBUTES_NAME, Rijndael.encrypt(str));
        a2.putExtra(Constants.FLAG_ATTRIBUTES_TYPE, i3);
        a2.putExtra(Constants.FLAG_ATTRIBUTES_OPER_NAME, str3);
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2, String str, String str2, int i3, String str3) {
        Intent intent = new Intent("com.tencent.android.xg.vip.action.ACCOUNT.RESULT.V4");
        intent.putExtra("flag", i3);
        intent.putExtra("operation", 0);
        if (!i.b(str3)) {
            intent.setPackage(str3);
        }
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), intent);
        a(i2, str, str2, i3, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2, String str, String str2, int i3, String str3, String str4) {
        TLogger.e("PushServiceBroadcastHandler", "tagFailHandler failed with (" + i2 + ChineseToPinyinResource.Field.COMMA + str + ChineseToPinyinResource.Field.COMMA + str3 + ChineseToPinyinResource.Field.RIGHT_BRACKET);
        Intent intent = new Intent("com.tencent.android.xg.vip.action.TAG.RESULT.V4");
        intent.putExtra("flag", i3);
        intent.putExtra("code", i2);
        intent.putExtra("msg", str);
        intent.putExtra("operation", 1);
        if (!i.b(str3)) {
            intent.setPackage(str3);
        }
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), intent);
        a(i2, str2, i3, str3, str4);
    }

    private void a(int i2, String str) {
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), f.a(i2, str, 2));
    }

    private void a(int i2, String str, String str2, int i3, String str3) {
        Intent a2 = f.a(i2, str3, 6);
        a2.putExtra(Constants.FLAG_ACCOUNT_NAME, Rijndael.encrypt(str));
        a2.putExtra(Constants.FLAG_ACCOUNT_FEEDBACK, str2);
        a2.putExtra(Constants.FLAG_ACCOUNT_OP_TYPE, i3);
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), a2);
    }

    private void a(int i2, String str, int i3, String str2, String str3) {
        Intent a2 = f.a(i2, str2, 3);
        a2.putExtra(Constants.FLAG_TAG_NAME, Rijndael.encrypt(str));
        a2.putExtra(Constants.FLAG_TAG_TYPE, i3);
        a2.putExtra(Constants.FLAG_TAG_OPER_NAME, str3);
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2, int i3, int i4, String str, String str2, String str3) {
        TLogger.e("PushServiceBroadcastHandler", "tagFailHandler failed with (" + i2 + ChineseToPinyinResource.Field.COMMA + str2 + ChineseToPinyinResource.Field.COMMA + str + ChineseToPinyinResource.Field.RIGHT_BRACKET);
        Intent intent = new Intent("com.tencent.android.xg.vip.action.TAG.RESULT.V4");
        intent.putExtra("code", i2);
        intent.putExtra("msg", str2);
        intent.putExtra("operation", 1);
        if (!i.b(str)) {
            intent.setPackage(str);
        }
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), intent);
        a(i2, str, str2, str3);
    }

    private void a(int i2, String str, String str2, String str3) {
        Intent a2 = f.a(i2, str, 8);
        if (!TextUtils.isEmpty(str2)) {
            a2.putExtra("data", Rijndael.encrypt(str2));
        }
        a2.putExtra(Constants.FLAG_QUERY_TAGS_OPER_NAME, str3);
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, n nVar, m mVar, String str, boolean z, String str2) {
        Intent intent = new Intent("com.tencent.android.xg.vip.action.REGISTER.RESULT.V4");
        intent.putExtra("accId", mVar.f8986a);
        intent.putExtra("data", nVar.b);
        intent.putExtra("flag", ReturnCode.FLAG_ONLINE.getType());
        intent.putExtra("code", i2);
        intent.putExtra("operation", 0);
        intent.putExtra("otherPushType", nVar.f9001d);
        intent.putExtra("otherPushToken", nVar.f9002e);
        intent.putExtra("lastNMd5str", str2);
        RegisterEntity registerEntity = new RegisterEntity();
        registerEntity.accessId = mVar.f8986a;
        registerEntity.accessKey = mVar.b;
        registerEntity.token = nVar.b;
        registerEntity.channelId = mVar.s;
        registerEntity.packageName = str;
        registerEntity.timestamp = System.currentTimeMillis() / 1000;
        CacheManager.addRegisterInfo(registerEntity);
        registerEntity.guid = nVar.c;
        if (!i.b(str)) {
            intent.setPackage(str);
        }
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), intent);
        try {
            String str3 = nVar.f9006i;
            if (i.b(str3)) {
                a(i2, mVar, nVar.b, str, nVar.f9001d, nVar.f9002e);
            } else {
                a(i2, str3, nVar.f9007j, str);
            }
        } catch (Throwable unused) {
            TLogger.w("PushServiceBroadcastHandler", "unexpected for registerSuccessHandler");
        }
        if (com.tencent.android.tpush.service.b.e() != null) {
            com.tencent.android.tpush.a.b(com.tencent.android.tpush.service.b.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, String str, m mVar, String str2) {
        Intent intent = new Intent("com.tencent.android.xg.vip.action.REGISTER.RESULT.V4");
        intent.putExtra("data", "");
        intent.putExtra("code", i2);
        intent.putExtra("msg", str);
        intent.putExtra("flag", ReturnCode.FLAG_ONLINE.getType());
        intent.putExtra("operation", 1);
        if (!i.b(str2)) {
            intent.setPackage(str2);
        }
        try {
            BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), intent);
            if (mVar != null) {
                String str3 = mVar.f8988e;
                if (i.b(str3)) {
                    a(i2, mVar, GuidInfoManager.getToken(com.tencent.android.tpush.service.b.e()), str2, -1L, (String) null);
                } else {
                    a(i2, str3, mVar.f8989f, str2);
                }
            }
        } catch (Throwable unused) {
            TLogger.w("PushServiceBroadcastHandler", "unexpected for registerFailHandler");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, r rVar, String str) {
        Intent intent = new Intent("com.tencent.android.xg.vip.action.UNREGISTER.RESULT.V4");
        intent.putExtra("flag", ReturnCode.FLAG_ONLINE.getType());
        intent.putExtra("operation", 0);
        CacheManager.UnregisterInfoSuccessByPkgName(str);
        CacheManager.removeRegisterInfos(str);
        if (!i.b(str)) {
            intent.setPackage(str);
        }
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), intent);
        a(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, String str, r rVar, String str2) {
        TLogger.e("PushServiceBroadcastHandler", "unregisterFailHandler failed with (" + i2 + ChineseToPinyinResource.Field.COMMA + str + ChineseToPinyinResource.Field.COMMA + rVar + ChineseToPinyinResource.Field.COMMA + str2 + ChineseToPinyinResource.Field.RIGHT_BRACKET);
        Intent intent = new Intent("com.tencent.android.xg.vip.action.UNREGISTER.RESULT.V4");
        intent.putExtra("flag", ReturnCode.FLAG_ONLINE.getType());
        intent.putExtra("code", i2);
        intent.putExtra("msg", str);
        intent.putExtra("operation", 1);
        if (!i.b(str2)) {
            intent.setPackage(str2);
        }
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), intent);
        a(i2, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, String str, String str2, String str3, int i3, String str4) {
        TLogger.e("PushServiceBroadcastHandler", "accountFailHandler failed with (" + i2 + ChineseToPinyinResource.Field.COMMA + str + ChineseToPinyinResource.Field.COMMA + str4 + ChineseToPinyinResource.Field.RIGHT_BRACKET);
        Intent intent = new Intent("com.tencent.android.xg.vip.action.ACCOUNT.RESULT.V4");
        intent.putExtra("flag", i3);
        intent.putExtra("code", i2);
        intent.putExtra("msg", str);
        intent.putExtra("operation", 1);
        if (!i.b(str4)) {
            intent.setPackage(str4);
        }
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), intent);
        a(i2, str2, str3, i3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, int i3, int i4, String str, String str2, String str3) {
        Intent intent = new Intent("com.tencent.android.xg.vip.action.QUERYTAGS.RESULT.V4");
        intent.putExtra("data", str2);
        intent.putExtra("operation", 0);
        if (!i.b(str)) {
            intent.setPackage(str);
        }
        BroadcastAgent.sendBroadcast(com.tencent.android.tpush.service.b.e(), intent);
        a(i2, str, str2, str3);
    }
}
