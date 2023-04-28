package com.tencent.thumbplayer.core.decoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.tencent.thumbplayer.h.b;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;

@RequiresApi(api = 16)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class TPBaseMediaCodecDecoder implements ITPMediaCodecDecoder {
    private static final int DUMP_BYTE_BUFFER_BYTES = 100;
    private static final int DUMP_ONE_LINE_BYTES = 20;
    private static final int MEDIA_CODEC_ERROR_INDEX = -1000;
    private static long MEDIA_CODEC_INPUT_TIMEOUT_US = 2000;
    private static long MEDIA_CODEC_OUTPUT_TIMEOUT_US = 2000;
    private static final int MSG_FLUSH = 1002;
    private static final int MSG_RELEASE = 1003;
    private static final int MSG_RELEASE_OUTPUT_BUFFER = 1000;
    private static final int MSG_SET_OUTPUT_SURFACE = 1001;
    private b mCodec;
    public int mCodecId;
    private MediaCodec.CryptoInfo mCryptoInfo;
    private HandlerThread mDecodeThread;
    private AsyncDecodeHandler mDecoderHandler;
    public int mDolbyVisionLevel;
    public int mDolbyVisionProfile;
    public int mDrmType;
    public boolean mEnableAsyncMode;
    private boolean mEnableAudioPassThrough;
    public boolean mEnableMediaCodecReuse;
    private boolean mEnableSetOutputSurfaceApi;
    private TPFrameInfo mFrameInfo;
    private int mHandlerResult;
    private BlockingQueue<Integer> mInputQueue;
    public MediaCrypto mMediaCrypto;
    private BlockingQueue<TPFrameInfo> mOutputQueue;
    private boolean mRestartCodecOnException;
    public boolean mStarted;
    public Surface mSurface;
    private final Object mThreadLock;

    /* renamed from: com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends com.tencent.thumbplayer.h.a.b {
        public final /* synthetic */ TPBaseMediaCodecDecoder this$0;

        public AnonymousClass1(TPBaseMediaCodecDecoder tPBaseMediaCodecDecoder) {
        }

        @Override // com.tencent.thumbplayer.h.a.b, com.tencent.thumbplayer.h.a.a
        public void onReuseCodecAPIException(String str, Throwable th) {
        }

        @Override // com.tencent.thumbplayer.h.a.b, com.tencent.thumbplayer.h.a.a
        public void onStarted(Boolean bool, String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AsyncDecodeHandler extends Handler {
        public final /* synthetic */ TPBaseMediaCodecDecoder this$0;

        public AsyncDecodeHandler(TPBaseMediaCodecDecoder tPBaseMediaCodecDecoder, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    @RequiresApi(api = 21)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class BufferCallback extends b.a {
        public final /* synthetic */ TPBaseMediaCodecDecoder this$0;

        private BufferCallback(TPBaseMediaCodecDecoder tPBaseMediaCodecDecoder) {
        }

        public /* synthetic */ BufferCallback(TPBaseMediaCodecDecoder tPBaseMediaCodecDecoder, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.tencent.thumbplayer.h.b.a
        public void onError(@NonNull b bVar, @NonNull MediaCodec.CodecException codecException) {
        }

        @Override // com.tencent.thumbplayer.h.b.a
        public void onInputBufferAvailable(@NonNull b bVar, int i2) {
        }

        @Override // com.tencent.thumbplayer.h.b.a
        public void onOutputBufferAvailable(@NonNull b bVar, int i2, @NonNull MediaCodec.BufferInfo bufferInfo) {
        }

        @Override // com.tencent.thumbplayer.h.b.a
        public void onOutputFormatChanged(@NonNull b bVar, @NonNull MediaFormat mediaFormat) {
        }
    }

    public TPBaseMediaCodecDecoder(int i2) {
    }

    public static /* synthetic */ BlockingQueue access$100(TPBaseMediaCodecDecoder tPBaseMediaCodecDecoder) {
    }

    public static /* synthetic */ BlockingQueue access$200(TPBaseMediaCodecDecoder tPBaseMediaCodecDecoder) {
    }

    public static /* synthetic */ int access$300(TPBaseMediaCodecDecoder tPBaseMediaCodecDecoder) {
    }

    public static /* synthetic */ Object access$400(TPBaseMediaCodecDecoder tPBaseMediaCodecDecoder) {
    }

    public static /* synthetic */ int access$500(TPBaseMediaCodecDecoder tPBaseMediaCodecDecoder, int i2, boolean z) {
    }

    public static /* synthetic */ int access$600(TPBaseMediaCodecDecoder tPBaseMediaCodecDecoder, Surface surface) {
    }

    public static /* synthetic */ int access$700(TPBaseMediaCodecDecoder tPBaseMediaCodecDecoder) {
    }

    public static /* synthetic */ int access$800(TPBaseMediaCodecDecoder tPBaseMediaCodecDecoder) {
    }

    public static /* synthetic */ void access$900(TPBaseMediaCodecDecoder tPBaseMediaCodecDecoder, int i2) {
    }

    private void bufferSizeCheck(ByteBuffer byteBuffer, byte[] bArr) {
    }

    @RequiresApi(api = 21)
    private int decodeAsync(byte[] bArr, boolean z, long j2, boolean z2) {
    }

    private TPFrameInfo dequeueOutputBufferAsync() {
    }

    private void dumpByteArray(byte[] bArr, int i2, int i3, int i4) {
    }

    private void exitDecodeThread() {
    }

    private int flushAsync() {
    }

    private int handleFlush() {
    }

    private void handleMessageComplete(int i2) {
    }

    private int handleRelease() {
    }

    private int handleReleaseOutputBuffer(int i2, boolean z) {
    }

    private int handleSetOutputSurface(Surface surface) {
    }

    private int handleSignalEndOfStream(int i2) {
    }

    private boolean initMediaCodecInternal() {
    }

    private int onFlush() {
    }

    private int onMediaCodecException(Exception exc) {
    }

    private int onRelease() {
    }

    private int onReleaseOutputBuffer(int i2, boolean z) {
    }

    private int onSetOutputSurface(Surface surface) {
    }

    private int queueInputBuffer(byte[] bArr, long j2, boolean z) {
    }

    private int releaseAsync() {
    }

    private int releaseOutputBufferAsync(int i2, boolean z) {
    }

    private void resetFrameInfo() {
    }

    private MediaCodecInfo selectCodec(String str) {
    }

    private int setOutputSurfaceAsync(Surface surface) {
    }

    private int signalEndOfStreamAsync() {
    }

    private int waitingForHandleMessage(Message message) {
    }

    public abstract void configCodec(@NonNull b bVar);

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int decode(byte[] bArr, boolean z, long j2, boolean z2) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public TPFrameInfo dequeueOutputBuffer() {
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int flush() {
    }

    public abstract String getLogTag();

    public abstract String getMimeType();

    public String getStackTrace(Throwable th) {
    }

    public abstract void processMediaCodecException(Exception exc);

    public abstract void processOutputBuffer(@NonNull b bVar, int i2, @NonNull MediaCodec.BufferInfo bufferInfo, @NonNull TPFrameInfo tPFrameInfo);

    public abstract void processOutputConfigData(@NonNull b bVar, int i2, @NonNull MediaCodec.BufferInfo bufferInfo, @NonNull TPFrameInfo tPFrameInfo);

    public abstract void processOutputFormatChanged(@NonNull MediaFormat mediaFormat);

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int release() {
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int releaseOutputBuffer(int i2, boolean z) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public void setCryptoInfo(int i2, @NonNull int[] iArr, @NonNull int[] iArr2, @NonNull byte[] bArr, @NonNull byte[] bArr2, int i3) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int setOperateRate(float f2) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int setOutputSurface(Surface surface) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBool(int i2, boolean z) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBytes(int i2, byte[] bArr) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamInt(int i2, int i3) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamLong(int i2, long j2) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamObject(int i2, Object obj) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamString(int i2, String str) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int signalEndOfStream() {
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean startDecoder() {
    }
}
