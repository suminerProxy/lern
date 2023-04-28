package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AudioCapabilities {
    private static final int[] ALL_SURROUND_ENCODINGS = null;
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = null;
    private static final int DEFAULT_MAX_CHANNEL_COUNT = 8;
    private static final int DEFAULT_SAMPLE_RATE_HZ = 48000;
    private static final AudioCapabilities EXTERNAL_SURROUND_SOUND_CAPABILITIES = null;
    private static final String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private final int maxChannelCount;
    private final int[] supportedEncodings;

    @RequiresApi(29)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Api29 {
        private Api29() {
        }

        @DoNotInline
        public static int[] getDirectPlaybackSupportedEncodingsV29() {
        }
    }

    public AudioCapabilities(@Nullable int[] supportedEncodings, int maxChannelCount) {
    }

    public static /* synthetic */ int[] access$000() {
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
    }

    public static AudioCapabilities getCapabilities(Context context) {
    }

    @Nullable
    public static Uri getExternalSurroundSoundGlobalSettingUri() {
    }

    public boolean equals(@Nullable Object other) {
    }

    public int getMaxChannelCount() {
    }

    public int hashCode() {
    }

    public boolean supportsEncoding(int encoding) {
    }

    public String toString() {
    }

    @SuppressLint({"InlinedApi"})
    public static AudioCapabilities getCapabilities(Context context, @Nullable Intent intent) {
    }
}
