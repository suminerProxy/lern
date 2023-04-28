package com.facebook.imagepipeline.animated.base;

import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.concurrent.Immutable;

@Nullsafe(Nullsafe.Mode.STRICT)
@Immutable
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimatedDrawableOptions {
    public static AnimatedDrawableOptions DEFAULTS;
    public final boolean allowPrefetching;
    public final boolean enableDebugging;
    public final boolean forceKeepAllFramesInMemory;
    public final int maximumBytes;

    public AnimatedDrawableOptions(AnimatedDrawableOptionsBuilder builder) {
    }

    public static AnimatedDrawableOptionsBuilder newBuilder() {
    }
}
