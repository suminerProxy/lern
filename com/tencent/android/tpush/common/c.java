package com.tencent.android.tpush.common;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.tpns.baseapi.base.util.ChannelUtils;
import com.tencent.tpns.baseapi.base.util.CommonWorkingThread;
import com.tencent.tpns.baseapi.base.util.TTask;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static int f8662a;
    private static int b;
    private static Handler c;

    /* renamed from: d  reason: collision with root package name */
    private static ReentrantLock f8663d = new ReentrantLock();

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private Context f8668a;

        public a(Context context) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, String str, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString(TPDownloadProxyEnum.DLPARAM_PACKAGE, context.getPackageName());
        bundle.putString("class", i.p(context));
        bundle.putInt("badgenumber", i2);
        context.getContentResolver().call(Uri.parse(str), "change_badge", (String) null, bundle);
    }

    public static void e(Context context, int i2) {
        String b2 = i.b();
        if (TextUtils.isEmpty(b2) || !"vivo".equals(b2)) {
            return;
        }
        CommonWorkingThread.getInstance().execute(new TTask(i2, context) { // from class: com.tencent.android.tpush.common.c.4

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f8667a;
            public final /* synthetic */ Context b;

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Context context, int i2) {
        if (ChannelUtils.isBrandHuaWei() || ChannelUtils.isBrandHonor() || ChannelUtils.isEmuiOrOhosVersion()) {
            CommonWorkingThread.getInstance().execute(new TTask(i2, context) { // from class: com.tencent.android.tpush.common.c.1

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ int f8664a;
                public final /* synthetic */ Context b;

                @Override // com.tencent.tpns.baseapi.base.util.TTask
                public void TRun() {
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(Context context, int i2) {
        if (ChannelUtils.isBrandHuaWei() || ChannelUtils.isBrandHonor() || ChannelUtils.isEmuiOrOhosVersion()) {
            CommonWorkingThread.getInstance().execute(new TTask(i2, context) { // from class: com.tencent.android.tpush.common.c.2

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ int f8665a;
                public final /* synthetic */ Context b;

                @Override // com.tencent.tpns.baseapi.base.util.TTask
                public void TRun() {
                }
            });
        }
    }

    public static /* synthetic */ int a(int i2) {
        int i3 = b - i2;
        b = i3;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString(TPDownloadProxyEnum.DLPARAM_PACKAGE, context.getPackageName());
        bundle.putString("class", i.p(context));
        Bundle call = context.getContentResolver().call(Uri.parse(str), "getbadgeNumber", (String) null, bundle);
        int i3 = 0;
        int i4 = (call != null ? call.getInt("badgenumber", 0) : 0) + i2;
        if (i4 >= 0) {
            i3 = i4;
        }
        bundle.putInt("badgenumber", i3);
        context.getContentResolver().call(Uri.parse(str), "change_badge", (String) null, bundle);
    }

    public static void a(Context context) {
        b(context, 0);
    }

    public static void b(Context context, int i2) {
        if (ChannelUtils.isBrandHuaWei() || ChannelUtils.isBrandHonor() || ChannelUtils.isEmuiOrOhosVersion()) {
            try {
                if (c == null) {
                    c = new a(context.getApplicationContext());
                }
                Message message = new Message();
                message.what = 2;
                message.arg1 = i2;
                c.sendMessage(message);
            } catch (Throwable th) {
                TLogger.w("BadgeUtils", "set huawei badge error: " + th.toString());
            }
        }
    }

    public static void a(Context context, int i2) {
        StringBuilder sb;
        if (ChannelUtils.isBrandHuaWei() || ChannelUtils.isBrandHonor() || ChannelUtils.isEmuiOrOhosVersion()) {
            try {
                f8663d.lock();
                if (c == null) {
                    c = new a(context.getApplicationContext());
                }
                b++;
                f8662a += i2;
                Message message = new Message();
                message.what = 1;
                c.sendMessageDelayed(message, 200L);
                try {
                    f8663d.unlock();
                } catch (Throwable th) {
                    th = th;
                    sb = new StringBuilder();
                    sb.append("change huawei badge unlock error: ");
                    sb.append(th.toString());
                    TLogger.e("BadgeUtils", sb.toString());
                }
            } catch (Throwable th2) {
                try {
                    TLogger.w("BadgeUtils", "change huawei badge error: " + th2.toString());
                    try {
                        f8663d.unlock();
                    } catch (Throwable th3) {
                        th = th3;
                        sb = new StringBuilder();
                        sb.append("change huawei badge unlock error: ");
                        sb.append(th.toString());
                        TLogger.e("BadgeUtils", sb.toString());
                    }
                } catch (Throwable th4) {
                    try {
                        f8663d.unlock();
                    } catch (Throwable th5) {
                        TLogger.e("BadgeUtils", "change huawei badge unlock error: " + th5.toString());
                    }
                    throw th4;
                }
            }
        }
    }

    public static void d(Context context, int i2) {
        String b2 = i.b();
        if (TextUtils.isEmpty(b2) || !"oppo".equals(b2)) {
            return;
        }
        CommonWorkingThread.getInstance().execute(new TTask(i2, context) { // from class: com.tencent.android.tpush.common.c.3

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f8666a;
            public final /* synthetic */ Context b;

            @Override // com.tencent.tpns.baseapi.base.util.TTask
            public void TRun() {
            }
        });
    }

    public static void b(Context context) {
        b(context, 0);
        d(context, 0);
        e(context, 0);
    }

    public static void c(Context context, int i2) {
        if (i2 < 0) {
            return;
        }
        b(context, i2);
        e(context, i2);
        d(context, i2);
    }
}
