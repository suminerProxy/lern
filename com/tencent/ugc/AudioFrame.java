package com.tencent.ugc;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;

@JNINamespace("liteav::ugc")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class AudioFrame {
    private int mChannels;
    private AudioCodecFormat mCodecFormat;
    private ByteBuffer mData;
    private int mSampleRate;
    private long mTimestampMs;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class AudioCodecFormat {
        private static final /* synthetic */ AudioCodecFormat[] $VALUES = null;
        public static final AudioCodecFormat AAC = null;
        public static final AudioCodecFormat PCM = null;
        public static final AudioCodecFormat UNKNOWN = null;
        private final int mValue;

        private AudioCodecFormat(String str, int i2, int i3) {
        }

        public static AudioCodecFormat valueOf(String str) {
        }

        public static AudioCodecFormat[] values() {
        }

        public final int getValue() {
        }
    }

    @CalledByNative
    public int getChannelCount() {
    }

    public AudioCodecFormat getCodecFormat() {
    }

    @CalledByNative
    public ByteBuffer getData() {
    }

    @CalledByNative
    public int getSampleRate() {
    }

    @CalledByNative
    public long getTimestamp() {
    }

    public void setChannelCount(int i2) {
    }

    public void setCodecFormat(AudioCodecFormat audioCodecFormat) {
    }

    public void setData(ByteBuffer byteBuffer) {
    }

    public void setSampleRate(int i2) {
    }

    public void setTimestamp(long j2) {
    }
}
