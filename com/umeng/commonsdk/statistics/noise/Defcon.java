package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.d;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class Defcon implements d {
    private static final int LEVEL_0 = 0;
    private static final int LEVEL_1 = 1;
    private static final int LEVEL_2 = 2;
    private static final int LEVEL_3 = 3;
    private static final long MILLIS_24_HOURS = 86400000;
    private static final long MILLIS_4_HOURS = 14400000;
    private static final long MILLIS_8_HOURS = 28800000;
    private static Defcon instanse;
    private int mLevel;

    private Defcon() {
    }

    public static synchronized Defcon getService(Context context) {
    }

    public int getLevel() {
    }

    public long getReqInterval() {
    }

    public long getRetryInterval() {
    }

    public boolean isOpen() {
    }

    @Override // com.umeng.commonsdk.statistics.internal.d
    public void onImprintChanged(ImprintHandler.a aVar) {
    }

    public void setLevel(int i2) {
    }
}
