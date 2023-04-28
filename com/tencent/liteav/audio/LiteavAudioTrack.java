package com.tencent.liteav.audio;

import android.media.AudioTrack;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;

@JNINamespace("liteav::audio")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class LiteavAudioTrack {
    private static final String TAG = "LiteavAudioTrack";
    private AudioTrack mAudioTrack;
    private byte[] mPlayBuffer;

    private static AudioTrack createStartedAudioTrack(int i2, int i3, int i4, int i5) {
    }

    private static void destroyAudioTrack(AudioTrack audioTrack) {
    }

    private static String streamTypeToString(int i2) {
    }

    @CalledByNative
    public int startPlayout(int i2, int i3, int i4, int i5) {
    }

    @CalledByNative
    public void stopPlayout() {
    }

    @CalledByNative
    public int write(ByteBuffer byteBuffer, int i2, int i3) {
    }
}
