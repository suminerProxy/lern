package com.tencent.thumbplayer.core.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;

@TargetApi(21)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class TPAudioPassThroughCapabilities {
    public static final TPAudioPassThroughCapabilities DEFAULT_AUDIO_CAPABILITIES = null;
    private static final int DEFAULT_MAX_CHANNEL_COUNT = 8;
    private static final TPAudioPassThroughCapabilities EXTERNAL_SURROUND_SOUND_CAPABILITIES = null;
    private static final String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private final int maxChannelCount;
    private final int[] supportedEncodings;

    public TPAudioPassThroughCapabilities(@Nullable int[] iArr, int i2) {
    }

    public static TPAudioPassThroughCapabilities getCapabilities(Context context) {
    }

    @SuppressLint({"InlinedApi"})
    public static TPAudioPassThroughCapabilities getCapabilities(Context context, @Nullable Intent intent) {
    }

    public final boolean equals(@Nullable Object obj) {
    }

    public final int getMaxChannelCount() {
    }

    public final int hashCode() {
    }

    public final boolean supportsEncoding(int i2) {
    }

    public final String toString() {
    }
}
