package com.google.android.exoplayer2.device;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DeviceInfo implements Bundleable {
    public static final Bundleable.Creator<DeviceInfo> CREATOR = null;
    private static final int FIELD_MAX_VOLUME = 2;
    private static final int FIELD_MIN_VOLUME = 1;
    private static final int FIELD_PLAYBACK_TYPE = 0;
    public static final int PLAYBACK_TYPE_LOCAL = 0;
    public static final int PLAYBACK_TYPE_REMOTE = 1;
    public static final DeviceInfo UNKNOWN = null;
    public final int maxVolume;
    public final int minVolume;
    public final int playbackType;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface PlaybackType {
    }

    public DeviceInfo(int playbackType, int minVolume, int maxVolume) {
    }

    public static /* synthetic */ DeviceInfo a(Bundle bundle) {
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
}
