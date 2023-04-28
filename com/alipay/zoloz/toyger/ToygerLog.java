package com.alipay.zoloz.toyger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ToygerLog {
    public static final String DIAGNOSE = "diagnose";
    private static final String TAG = "Toyger";
    private static final String TAG_PREFIX = "Toyger_";
    private static ToygerLogger sTargetLogger;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class AndroidLogger extends ToygerLogger {
        private AndroidLogger() {
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public int debug(String str, String str2) {
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public int error(String str, String str2) {
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public String getStackTraceString(Throwable th) {
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public int info(String str, String str2) {
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public int verbose(String str, String str2) {
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public int warn(String str, String str2) {
        }

        public /* synthetic */ AndroidLogger(AnonymousClass1 anonymousClass1) {
        }
    }

    private ToygerLog() {
    }

    public static void d(String str) {
    }

    public static void e(String str) {
    }

    public static void i(String str) {
    }

    public static void setLogger(ToygerLogger toygerLogger) {
    }

    public static void v(String str) {
    }

    public static void w(String str) {
    }

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static void i(String str, String str2) {
    }

    public static void v(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }

    public static void e(Throwable th) {
    }

    public static void w(Throwable th) {
    }

    public static void e(String str, Throwable th) {
    }

    public static void w(String str, Throwable th) {
    }

    public static void e(String str, String str2, Throwable th) {
    }

    public static void w(String str, String str2, Throwable th) {
    }
}
