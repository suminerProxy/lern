package com.google.android.exoplayer2.audio;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface AudioListener {
    void onAudioAttributesChanged(AudioAttributes audioAttributes);

    void onAudioSessionIdChanged(int audioSessionId);

    void onSkipSilenceEnabledChanged(boolean skipSilenceEnabled);

    void onVolumeChanged(float volume);
}
