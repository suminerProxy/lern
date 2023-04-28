package com.tencent.liteav.audio;

import android.annotation.TargetApi;
import android.media.AudioRecord;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;

@JNINamespace("liteav::audio")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class LiteavAudioRecord {
    private static final String TAG = "LiteavAudioRecord";
    private AudioRecord mAudioRecord;

    @TargetApi(24)
    private static String audioSourceToString(int i2) {
    }

    private static AudioRecord createStartedAudioRecord(int i2, int i3, int i4, int i5) {
    }

    private static void destroyAudioRecord(AudioRecord audioRecord) {
    }

    @CalledByNative
    public int read(ByteBuffer byteBuffer, int i2) {
    }

    @CalledByNative
    public int startRecording(int i2, int i3, int i4, int i5) {
    }

    @CalledByNative
    public void stopRecording() {
    }
}
