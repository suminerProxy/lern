package com.facebook.common.time;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SystemClock implements Clock {
    private static final SystemClock INSTANCE = new SystemClock();

    private SystemClock() {
    }

    public static SystemClock get() {
        return INSTANCE;
    }

    @Override // com.facebook.common.time.Clock
    public long now() {
        return System.currentTimeMillis();
    }
}
