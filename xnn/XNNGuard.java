package xnn;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class XNNGuard {
    private static String NAME = "xGuard";
    private static String TAG = "XNNGuard";
    private static SharedPreferences sharedPreferences;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class GuardInfo {
        public int crash_freq;
        public int last_proc_fail_freq;
        public int yearDay;
    }

    private static void countCrashFreq() {
    }

    private static String createGuardInfo(int i2, int i3, int i4) {
    }

    private static Context getContext() {
    }

    private static GuardInfo getInfo(String str) {
    }

    private static synchronized void init() {
    }

    public static synchronized boolean startGuard(byte[] bArr, int i2, int i3) {
    }

    public static synchronized void stopGuard(byte[] bArr) {
    }
}
