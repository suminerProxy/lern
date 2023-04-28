package com.tencent.android.tpush.stat;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public enum StatReportStrategy {
    INSTANT(1),
    ONLY_WIFI(2),
    BATCH(3),
    APP_LAUNCH(4),
    DEVELOPER(5),
    PERIOD(6),
    ONLY_WIFI_NO_CACHE(7);
    
    public int v;

    StatReportStrategy(int i2) {
        this.v = i2;
    }

    public static StatReportStrategy getStatReportStrategy(int i2) {
        StatReportStrategy[] values;
        for (StatReportStrategy statReportStrategy : values()) {
            if (i2 == statReportStrategy.getIntValue()) {
                return statReportStrategy;
            }
        }
        return null;
    }

    public int getIntValue() {
        return this.v;
    }
}
