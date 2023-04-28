package com.tencent.android.tpush.stat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.android.tpush.XGPushConfig;
import com.tencent.android.tpush.common.h;
import com.tencent.android.tpush.common.i;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.android.tpush.service.protocol.PushStatClientReport;
import com.tencent.android.tpush.service.protocol.j;
import com.tencent.android.tpush.stat.event.g;
import com.tencent.tpns.baseapi.base.util.ChannelUtils;
import com.tencent.tpns.baseapi.base.util.CloudManager;
import com.tencent.tpns.baseapi.base.util.ErrCode;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ServiceStat {
    public static final String ACCOUNT_EVENT_ID = "SdkAccount";
    public static final String ACK_EVENT_ID = "Ack";
    public static final String APP_LIST_EVENT_ID = "app_list";
    public static final int EnumPushAction_IN_MSG_ACTION_MOBILE_USER_DISABLED = 129;
    public static final int EnumPushAction_PUSH_ACTION_MOBILE_APP_RECEIVED = 8;
    public static final int EnumPushAction_PUSH_ACTION_MOBILE_CLEAN_UP = 64;
    public static final int EnumPushAction_PUSH_ACTION_MOBILE_REVOKE_MESSAGE_SERVICE_RECEIVED = 2048;
    public static final int EnumPushAction_PUSH_ACTION_MOBILE_SERVICE_RECEIVED = 4;
    public static final int EnumPushAction_PUSH_ACTION_MOBILE_SHOW = 128;
    public static final int EnumPushAction_PUSH_ACTION_MOBILE_USER_CLICK = 16;
    public static final int EnumPushChannel = 0;
    public static final int EnumPushChannel_CHANNEL_FCM = 101;
    public static final int EnumPushChannel_CHANNEL_HONOR = 107;
    public static final int EnumPushChannel_CHANNEL_HUAWEI = 102;
    public static final int EnumPushChannel_CHANNEL_LOCAL = 99;
    public static final int EnumPushChannel_CHANNEL_MEIZU = 106;
    public static final int EnumPushChannel_CHANNEL_OPPO = 105;
    public static final int EnumPushChannel_CHANNEL_VIVO = 104;
    public static final int EnumPushChannel_CHANNEL_XG = 100;
    public static final int EnumPushChannel_CHANNEL_XIAOMI = 103;
    public static final String FAILED_CNT = "failed_cnt";
    public static final String HEARTBEAT_EVENT_ID = "SdkHeartbeat";
    public static final String IS_CUSTOMDATA_VERSION_EVENT_ID = "IsCustomDataVersion";
    public static final String LAST_REPORT_APPLIST = "last_reportAppList_time";
    public static final String LAST_REPORT_NOTIFICATION = "last_reportNotification_time";
    public static final String NETWORKTYOE = "np";
    public static final String NOTIFACTION_CLICK_OR_CLEAR_EVENT_ID = "Action";
    public static final String NOTIFICATION_STATUS_EVENT_ID = "notification_st";
    public static final String REGISTER_EVENT_ID = "SdkRegister";
    public static final String SDK_ACK_EVENT_ID = "SdkAck";
    public static final String SDK_OTHER_PULLUP_ID = "OtherPull";
    public static final String SERVICE_EVENT_ID = "SdkService";
    public static final String SHOW_EVENT_ID = "SHOW";
    public static final String SRV_ACK_EVENT_ID = "SrvAck";
    public static final String STRATTIME = "failed_cnt";
    public static final String SUCC_CNT = "suc_cnt";
    public static final String UNREGISTER_EVENT_ID = "SdkUnRegister";
    public static final String VERIFY_EVENT_ID = "Verify";
    public static AtomicBoolean _isInited = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    private static Context f9041a;
    private static boolean b;
    private static volatile a c;

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a extends BroadcastReceiver {

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.android.tpush.stat.ServiceStat$a$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends TTask {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f9042a;
            public final /* synthetic */ a b;

            public AnonymousClass1(a aVar, Context context) {
            }

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        }

        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5 A[Catch: all -> 0x00fb, TryCatch #0 {all -> 0x00fb, blocks: (B:7:0x000f, B:9:0x0037, B:12:0x0041, B:13:0x0047, B:15:0x0063, B:16:0x0065, B:18:0x0072, B:20:0x0078, B:23:0x0081, B:25:0x008e, B:27:0x00d5, B:28:0x00f3, B:24:0x0088), top: B:35:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(android.content.Context r16, android.content.Intent r17, int r18) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.android.tpush.stat.ServiceStat.a(android.content.Context, android.content.Intent, int):void");
    }

    public static void appReportInMsgUserDisabled(Context context, Intent intent) {
        a(context, intent, 129);
    }

    public static void appReportNotificationCleared(Context context, Intent intent) {
        a(context, intent, 64);
    }

    public static void appReportNotificationClicked(Context context, Intent intent) {
        a(context, intent, 16);
    }

    public static void appReportNotificationShowed(Context context, Intent intent) {
        a(context, intent, 128);
    }

    public static void appReportPullupAck(Context context, Intent intent) {
    }

    public static void appReportRevokeMessageServiceReceived(Context context, Intent intent) {
        a(context, intent, 2048);
    }

    public static void appReportSDKReceived(Context context, Intent intent) {
        a(context, intent, 8);
    }

    public static void appReportServiceReceived(Context context, Intent intent) {
        a(context, intent, 4);
    }

    public static void commit() {
        StatServiceImpl.commitEvents(f9041a, -1);
    }

    public static void debug(boolean z) {
        d.a(z);
    }

    public static synchronized void init(Context context) {
        synchronized (ServiceStat.class) {
            if (_isInited.get()) {
                return;
            }
            d.c(true);
            d.a(StatReportStrategy.INSTANT);
            StatServiceImpl.setContext(context);
            StatServiceImpl.getHandler(context);
            f9041a = context.getApplicationContext();
            if (c == null) {
                TLogger.d("ServiceStat", "register network receiver on ServiceStat.init");
                c = new a(null);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                if (Build.VERSION.SDK_INT >= 33) {
                    f9041a.getApplicationContext().registerReceiver(c, intentFilter, 4);
                } else {
                    f9041a.getApplicationContext().registerReceiver(c, intentFilter);
                }
            }
            _isInited.set(true);
        }
    }

    public static void reportAck(ArrayList<PushStatClientReport> arrayList) {
    }

    public static void reportCloudControl(Context context, long j2, int i2, String str, long j3) {
        try {
            init(context);
            com.tencent.android.tpush.stat.event.b bVar = new com.tencent.android.tpush.stat.event.b(context, j2, i2);
            if (j3 != 0) {
                bVar.b = j3;
            }
            if (!TextUtils.isEmpty(str)) {
                bVar.f9140a = str;
            }
            StatServiceImpl.reportXGEvent(context.getApplicationContext(), bVar);
        } catch (Throwable th) {
            TLogger.w("ServiceStat", "unexpected for reportCloudControl", th);
        }
    }

    public static void reportCustomData(Context context, String str, Properties properties) {
        init(context);
        if (CloudManager.getInstance(context).disableRepoCusEv()) {
            TLogger.d("ServiceStat", "disable reportCustomData");
        } else {
            StatServiceImpl.trackCustomKVEvent(context, str, properties);
        }
    }

    public static void reportCustomData4FirstLaunch(Context context) {
        init(context);
        StatServiceImpl.trackCustomKVEvent(context, "FIRST_OPEN", null);
    }

    public static void reportErrCode(Context context, int i2, String str, long j2, String str2) {
        try {
            if (CloudManager.getInstance(context).disableReptErrCode()) {
                TLogger.d("ServiceStat", "disable reportErrCode");
                return;
            }
            init(context);
            g gVar = new g(context, i2, str2);
            if (!TextUtils.isEmpty(str)) {
                gVar.f9163m = str;
            }
            if (j2 != 0) {
                gVar.f9164n = j2;
            }
            StatServiceImpl.reportXGEvent(context.getApplicationContext(), gVar);
        } catch (Throwable th) {
            TLogger.w("ServiceStat", "unexpected for reportErrCode", th);
        }
    }

    public static void reportIsCustomDataAcquisitionVersion(Context context) {
    }

    public static void reportLaunchEvent(Context context, int i2, int i3, long j2) {
        init(context);
        StatServiceImpl.trackLaunchEvent(context, i2, i3, j2);
    }

    public static void reportNotifactionClickedOrClear(ArrayList<PushStatClientReport> arrayList) {
    }

    public static void reportPullYYB() {
    }

    public static void reportSrvAck(ArrayList<j> arrayList) {
    }

    public static void reportTokenFailed(Context context) {
        try {
            if (b) {
                return;
            }
            String i2 = com.tencent.android.tpush.c.d.i();
            int i3 = 0;
            int i4 = (h.a(context).c() && XGPushConfig.isUsedFcmPush(context)) ? ErrCode.INNER_ERROR_FCM_TOKEN_ERROR : 0;
            if (com.tencent.android.tpush.c.d.a(context).m()) {
                if (com.tencent.android.tpush.e.a.b(context)) {
                    i3 = ErrCode.INNER_ERROR_SYS_TOKEN_ERROR;
                } else if ((ChannelUtils.isBrandXiaoMi() || ChannelUtils.isBrandBlackShark()) && !i.b(com.tencent.android.tpush.c.d.f8644a)) {
                    i3 = ErrCode.INNER_ERROR_XIAOMI_TOKEN_ERROR;
                } else if ((ChannelUtils.isBrandHuaWei() || ChannelUtils.isBrandHonor()) && !i.b(i.l(context))) {
                    i3 = ErrCode.INNER_ERROR_HUAWEI_TOKEN_ERROR;
                } else if (ChannelUtils.isBrandMeiZu() && !i.b(com.tencent.android.tpush.c.d.c)) {
                    i3 = ErrCode.INNER_ERROR_MEIZU_TOKEN_ERROR;
                } else if (("oppo".equals(i2) || "oneplus".equals(i2) || "realme".equals(i2)) && !i.b(com.tencent.android.tpush.c.d.f8646e)) {
                    i3 = ErrCode.INNER_ERROR_OPPO_TOKEN_ERROR;
                } else if ("vivo".equals(i2) && !i.b(i.m(context))) {
                    i3 = ErrCode.INNER_ERROR_VIVO_TOKEN_ERROR;
                }
            }
            if (i4 == 0 && i3 == 0) {
                return;
            }
            b = true;
            if (i4 != 0 && i3 != 0) {
                reportErrCode(context, ErrCode.INNER_ERROR_FCM_AND_ChANNEL_TOKEN_ERROR, i2 + ":" + XGPushConfig.getOtherPushErrCode(context), 0L, "inner");
            } else if (i4 != 0) {
                reportErrCode(context, i4, i2 + ":" + XGPushConfig.getOtherPushErrCode(context), 0L, "inner");
            } else if (i3 != 0) {
                reportErrCode(context, i3, i2 + ":" + XGPushConfig.getOtherPushErrCode(context), 0L, "inner");
            }
        } catch (Throwable th) {
            TLogger.w("ServiceStat", "unexpected for reportTokenFailed", th);
        }
    }

    public static void reportXGLBS(Context context, String str, JSONObject jSONObject) {
    }

    public static void reportXGStat(Context context, long j2, String str, JSONObject jSONObject) {
    }

    public static void reportXGStat2(Context context, String str, JSONObject jSONObject) {
    }

    public static void sendLocalMsg(Context context) {
        if (context == null) {
            return;
        }
        init(context);
        if (StatServiceImpl.storedList) {
            StatServiceImpl.storedList = !StatServiceImpl.sendLocalMsg(context, -1);
        }
    }
}
