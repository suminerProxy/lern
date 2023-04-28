package com.tencent.liteav.audio;

import android.media.AudioManager;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::audio")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class AudioDeviceManager {
    private static final String TAG = "AudioDeviceManager";
    private AudioManager mAudioManager;

    private synchronized AudioManager getAudioManager() {
    }

    @CalledByNative
    private int getAudioMode() {
    }

    @CalledByNative
    private int getSystemVolume() {
    }
}
