package com.facebook.common.time;

import com.facebook.common.internal.DoNotStrip;
import com.facebook.infer.annotation.Nullsafe;

@DoNotStrip
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AwakeTimeSinceBootClock implements MonotonicClock, MonotonicNanoClock {
    @DoNotStrip
    private static final AwakeTimeSinceBootClock INSTANCE = null;

    private AwakeTimeSinceBootClock() {
    }

    @DoNotStrip
    public static AwakeTimeSinceBootClock get() {
    }

    @Override // com.facebook.common.time.MonotonicClock
    @DoNotStrip
    public long now() {
    }

    @Override // com.facebook.common.time.MonotonicNanoClock
    @DoNotStrip
    public long nowNanos() {
    }
}
