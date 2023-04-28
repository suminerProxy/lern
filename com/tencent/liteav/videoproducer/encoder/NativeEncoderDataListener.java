package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaFormat;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.videobase.h;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class NativeEncoderDataListener implements VideoEncoderDef.VideoEncoderDataListener {
    public static final String TAG = "NativeEncoderDataListener";
    private long mNativeVideoEncodeDataListener;
    private int mStreamType;

    @CalledByNative
    public NativeEncoderDataListener(long j2, int i2) {
    }

    private native void nativeOnEncodedFail(long j2, int i2, int i3);

    private native void nativeOnEncodedNAL(long j2, int i2, EncodedVideoFrame encodedVideoFrame, ByteBuffer byteBuffer, int i3, int i4, int i5, int i6, long j3, long j4, long j5, long j6, long j7, long j8, int i7, int i8);

    @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.VideoEncoderDataListener
    public synchronized void onEncodedFail(h.a aVar) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.VideoEncoderDataListener
    public synchronized void onEncodedNAL(EncodedVideoFrame encodedVideoFrame, boolean z) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.VideoEncoderDataListener
    public synchronized void onOutputFormatChanged(MediaFormat mediaFormat) {
    }

    @CalledByNative
    public synchronized void reset() {
    }
}
