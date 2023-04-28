package com.efs.sdk.pa.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.efs.sdk.base.observer.IConfigCallback;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ConfigManager {
    private static final int A_DAY = 86400000;
    public static final String FLAG_PA_CHECK_IN_STATE = "8f2f54c08600aa25915617fa1371441b";
    public static final String FLAG_PA_FORE_CHECK_TIME = "03f870871950c148387b251894ed3e88";
    private static final int MAX_ANR_STATS_COUNT = 50;
    private static final int MAX_ANR_TRACE_RATE = 100;
    private static final String MODEL_SP = "paconfig";
    public static final String PA_LEVEL = "pa_level";
    private static final String STATS_ANR_LOG_COUNT = "apm_anr_count";
    private final String APM_PATRACE_SWITCH_RATE_CURRENT;
    private final String APM_PATRACE_SWITCH_RATE_LAST;
    private final int DEF_CLOSE_RATE;
    private final String TAG;
    private boolean mCheckIn;
    private int mCurrentRate;
    private IEfsReporter mEfsReporter;
    private int mLastRate;
    private PackageLevel mPackageLevel;
    private SharedPreferences mSharedPreferences;

    /* renamed from: com.efs.sdk.pa.config.ConfigManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements IConfigCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ConfigManager f3273a;

        public AnonymousClass1(ConfigManager configManager) {
        }

        @Override // com.efs.sdk.base.observer.IConfigCallback
        public final void onChange(Map<String, Object> map) {
        }
    }

    public ConfigManager(Context context, PackageLevel packageLevel, IEfsReporter iEfsReporter, boolean z) {
    }

    public static /* synthetic */ void access$000(ConfigManager configManager, String str, int i2) {
    }

    private boolean checkIn(boolean z, Long l2, boolean z2, int i2) {
    }

    private boolean enableAnrTracer() {
    }

    private int getCurrentConfigRate() {
    }

    private void initRate() {
    }

    private boolean isCountEnable() {
    }

    private void putBooleanValue(String str, boolean z) {
    }

    private void putIntValue(String str, int i2) {
    }

    private void putLongValue(String str, long j2) {
    }

    private boolean random(int i2) {
    }

    private void resetRate() {
    }

    private void resetUploadSmoothLogCnt() {
    }

    public boolean enableTracer() {
    }

    public void increaseUploadSmoothLogCnt() {
    }
}
