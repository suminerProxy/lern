package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PlaybackParameters implements Bundleable {
    public static final Bundleable.Creator<PlaybackParameters> CREATOR = null;
    public static final PlaybackParameters DEFAULT = null;
    private static final int FIELD_PITCH = 1;
    private static final int FIELD_SPEED = 0;
    public final float pitch;
    private final int scaledUsPerMs;
    public final float speed;

    public PlaybackParameters(float speed) {
    }

    public static /* synthetic */ PlaybackParameters a(Bundle bundle) {
    }

    private static String keyForField(int field) {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public long getMediaTimeUsForPlayoutTimeMs(long timeMs) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public String toString() {
    }

    @CheckResult
    public PlaybackParameters withSpeed(float speed) {
    }

    public PlaybackParameters(float speed, float pitch) {
    }
}
