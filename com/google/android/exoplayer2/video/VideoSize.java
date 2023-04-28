package com.google.android.exoplayer2.video;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.material.shadow.ShadowDrawableWrapper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class VideoSize implements Bundleable {
    public static final Bundleable.Creator<VideoSize> CREATOR = null;
    private static final int DEFAULT_HEIGHT = 0;
    private static final float DEFAULT_PIXEL_WIDTH_HEIGHT_RATIO = 1.0f;
    private static final int DEFAULT_UNAPPLIED_ROTATION_DEGREES = 0;
    private static final int DEFAULT_WIDTH = 0;
    private static final int FIELD_HEIGHT = 1;
    private static final int FIELD_PIXEL_WIDTH_HEIGHT_RATIO = 3;
    private static final int FIELD_UNAPPLIED_ROTATION_DEGREES = 2;
    private static final int FIELD_WIDTH = 0;
    public static final VideoSize UNKNOWN = null;
    @IntRange(from = 0)
    public final int height;
    @FloatRange(from = ShadowDrawableWrapper.COS_45, fromInclusive = false)
    public final float pixelWidthHeightRatio;
    @IntRange(from = 0, to = 359)
    public final int unappliedRotationDegrees;
    @IntRange(from = 0)
    public final int width;

    public VideoSize(@IntRange(from = 0) int width, @IntRange(from = 0) int height) {
    }

    public static /* synthetic */ VideoSize a(Bundle bundle) {
    }

    private static String keyForField(int field) {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public VideoSize(@IntRange(from = 0) int width, @IntRange(from = 0) int height, @IntRange(from = 0, to = 359) int unappliedRotationDegrees, @FloatRange(from = 0.0d, fromInclusive = false) float pixelWidthHeightRatio) {
    }
}
