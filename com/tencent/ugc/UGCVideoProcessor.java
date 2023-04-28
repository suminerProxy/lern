package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videobase.videobase.h;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;
import com.tencent.liteav.videoproducer.encoder.VideoEncodeParams;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.TXVideoEditer;
import com.tencent.ugc.videoprocessor.SpeedProcessor;
import com.tencent.ugc.videoprocessor.VideoEffectProcessor;
import com.tencent.ugc.videoprocessor.VideoProcessManager;
import com.tencent.ugc.videoprocessor.VideoTransitionProcessor;
import com.tencent.ugc.videoprocessor.WatermarkProcessor;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCVideoProcessor {
    private static final int MSG_FORCE_PROCESS = 105;
    private static final int MSG_PAUSE = 102;
    private static final int MSG_PROCESS_FROM_SOURCE = 101;
    private static final int MSG_REFRESH = 104;
    private static final int MSG_START = 100;
    private static final int MSG_STOP = 103;
    private static final String TAG = "UGCVideoProcessor";
    private Object mCurEGLContext;
    private int mCurEGLHeight;
    private int mCurEGLWidth;
    private DisplayTarget mDisplayTarget;
    private com.tencent.liteav.videobase.b.e mEGLCore;
    private VideoProcessManager.IVideoProcessorListener mEffectProcessorListener;
    private long mFinalPts;
    private com.tencent.liteav.videobase.frame.e mGLTexturePool;
    private boolean mInvalidate;
    private boolean mIsInit;
    private boolean mIsRecord;
    private float mLastProgress;
    private PixelFrame mLastRenderFrame;
    private int mOutputHeight;
    private int mOutputWidth;
    private com.tencent.liteav.videobase.frame.j mPreScaleRenderer;
    private List<TXVideoEditConstants.TXAbsoluteRect> mRectList;
    private HandlerThread mRenderThread;
    private com.tencent.liteav.videoconsumer.renderer.h mRenderer;
    private IVideoReporter mReporter;
    private Rotation mRotation;
    private GLConstants.GLScaleType mScaleType;
    private SpeedProcessor mSpeedProcessor;
    private a mStatus;
    private TXVideoEditer.TXVideoCustomProcessListener mTXVideoCustomProcessListener;
    private int mTransitionType;
    private final UGCAVSyncer mUGCAVSyncer;
    private UGCCombineProcessor mUGCCombineProcessor;
    private UGCMediaListSource mUGCMediaListSource;
    private UGCTransitionProcessor mUGCTransitionProcessor;
    private com.tencent.liteav.videoproducer.encoder.ah mVideoEncodeController;
    private VideoEncodeParams mVideoEncodeParams;
    private VideoEncodedFrameListener mVideoEncodedFrameListener;
    private VideoEncoderDef.VideoEncoderDataListener mVideoEncoderDataListener;
    private com.tencent.liteav.videoproducer.preprocessor.ah mVideoPreprocessorListener;
    private com.tencent.liteav.base.util.b mVideoProcessHandler;
    private VideoProcessListener mVideoProcessListener;
    private final VideoProcessManager mVideoProcessManager;
    private VideoRenderListener mVideoRenderListener;

    /* renamed from: com.tencent.ugc.UGCVideoProcessor$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements VideoRenderListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UGCVideoProcessor f14265a;

        public AnonymousClass1(UGCVideoProcessor uGCVideoProcessor) {
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1, int i2, int i3) {
        }

        @Override // com.tencent.liteav.videoconsumer.renderer.VideoRenderListener
        public final void onRenderFrame(PixelFrame pixelFrame) {
        }

        @Override // com.tencent.liteav.videoconsumer.renderer.VideoRenderListener
        public final void onRenderTargetSizeChanged(int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.ugc.UGCVideoProcessor$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements com.tencent.liteav.videoproducer.preprocessor.ah {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UGCVideoProcessor f14266a;

        public AnonymousClass2(UGCVideoProcessor uGCVideoProcessor) {
        }

        @Override // com.tencent.liteav.videoproducer.preprocessor.ah
        public final void a(int i2, PixelFrame pixelFrame) {
        }
    }

    /* renamed from: com.tencent.ugc.UGCVideoProcessor$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements VideoEncoderDef.VideoEncoderDataListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UGCVideoProcessor f14267a;

        public AnonymousClass3(UGCVideoProcessor uGCVideoProcessor) {
        }

        public static /* synthetic */ void a(AnonymousClass3 anonymousClass3, EncodedVideoFrame encodedVideoFrame) {
        }

        @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.VideoEncoderDataListener
        public final void onEncodedFail(h.a aVar) {
        }

        @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.VideoEncoderDataListener
        public final void onEncodedNAL(EncodedVideoFrame encodedVideoFrame, boolean z) {
        }

        @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.VideoEncoderDataListener
        public final void onOutputFormatChanged(MediaFormat mediaFormat) {
        }
    }

    /* renamed from: com.tencent.ugc.UGCVideoProcessor$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements VideoProcessManager.IVideoProcessorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UGCVideoProcessor f14268a;

        public AnonymousClass4(UGCVideoProcessor uGCVideoProcessor) {
        }

        public static /* synthetic */ void a(AnonymousClass4 anonymousClass4, PixelFrame pixelFrame) {
        }

        @Override // com.tencent.ugc.videoprocessor.VideoProcessManager.IVideoProcessorListener
        public final int customProcessFrame(PixelFrame pixelFrame) {
        }

        @Override // com.tencent.ugc.videoprocessor.VideoProcessManager.IVideoProcessorListener
        public final void didProcessFrame(PixelFrame pixelFrame) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface VideoEncodedFrameListener {
        void onVideoEncodingCompleted();

        void onVideoFrameEncoded(EncodedVideoFrame encodedVideoFrame);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface VideoProcessListener {
        void onComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult);

        void onProgress(float f2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14269a = null;
        public static final a b = null;
        public static final a c = null;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ a[] f14270d = null;

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    public UGCVideoProcessor(Context context, UGCMediaListSource uGCMediaListSource, UGCAVSyncer uGCAVSyncer, IVideoReporter iVideoReporter, boolean z) {
    }

    public static /* synthetic */ boolean access$000(UGCVideoProcessor uGCVideoProcessor, Runnable runnable) {
    }

    public static /* synthetic */ VideoProcessManager access$100(UGCVideoProcessor uGCVideoProcessor) {
    }

    public static /* synthetic */ VideoProcessListener access$200(UGCVideoProcessor uGCVideoProcessor) {
    }

    public static /* synthetic */ VideoEncodedFrameListener access$300(UGCVideoProcessor uGCVideoProcessor) {
    }

    public static /* synthetic */ long access$400(UGCVideoProcessor uGCVideoProcessor) {
    }

    public static /* synthetic */ void access$500(UGCVideoProcessor uGCVideoProcessor) {
    }

    public static /* synthetic */ TXVideoEditer.TXVideoCustomProcessListener access$600(UGCVideoProcessor uGCVideoProcessor) {
    }

    public static /* synthetic */ void access$700(UGCVideoProcessor uGCVideoProcessor, PixelFrame pixelFrame) {
    }

    public static /* synthetic */ boolean access$lambda$0(UGCVideoProcessor uGCVideoProcessor, Message message) {
    }

    public static /* synthetic */ void access$lambda$1(UGCVideoProcessor uGCVideoProcessor) {
    }

    private boolean handleMessage(@NonNull Message message) {
    }

    private void handleProcessFrame(PixelFrame pixelFrame) {
    }

    private void initEncoder() {
    }

    private void initProcessChain(Object obj, int i2, int i3) {
    }

    private void initRenderer() {
    }

    private void initializeEGL(Object obj, int i2, int i3) {
    }

    private boolean isNeedReCreateEGL(Object obj, int i2, int i3) {
    }

    public static /* synthetic */ void lambda$setBeautyFilter$10(UGCVideoProcessor uGCVideoProcessor, int i2, int i3) {
    }

    public static /* synthetic */ void lambda$setCustomVideoProcessListener$13(UGCVideoProcessor uGCVideoProcessor, TXVideoEditer.TXVideoCustomProcessListener tXVideoCustomProcessListener) {
    }

    public static /* synthetic */ void lambda$setDisplayView$4(UGCVideoProcessor uGCVideoProcessor, DisplayTarget displayTarget, GLConstants.GLScaleType gLScaleType) {
    }

    public static /* synthetic */ void lambda$setEncodeParams$6(UGCVideoProcessor uGCVideoProcessor, VideoEncodeParams videoEncodeParams) {
    }

    public static /* synthetic */ void lambda$setFilter$12(UGCVideoProcessor uGCVideoProcessor, Bitmap bitmap, float f2, Bitmap bitmap2, float f3, float f4) {
    }

    public static /* synthetic */ void lambda$setOutputSize$3(UGCVideoProcessor uGCVideoProcessor, int i2, int i3, GLConstants.GLScaleType gLScaleType) {
    }

    public static /* synthetic */ void lambda$setPictureTransition$8(UGCVideoProcessor uGCVideoProcessor, int i2) {
    }

    public static /* synthetic */ void lambda$setProgressListener$14(UGCVideoProcessor uGCVideoProcessor, VideoProcessListener videoProcessListener) {
    }

    public static /* synthetic */ void lambda$setRenderRotation$5(UGCVideoProcessor uGCVideoProcessor, Rotation rotation) {
    }

    public static /* synthetic */ void lambda$setSpecialRatio$11(UGCVideoProcessor uGCVideoProcessor, float f2) {
    }

    public static /* synthetic */ void lambda$setSpeedList$9(UGCVideoProcessor uGCVideoProcessor, List list) {
    }

    public static /* synthetic */ void lambda$setSplitScreenList$2(UGCVideoProcessor uGCVideoProcessor, List list, int i2, int i3) {
    }

    public static /* synthetic */ void lambda$setVideoEncodedFrameListener$7(UGCVideoProcessor uGCVideoProcessor, VideoEncodedFrameListener videoEncodedFrameListener) {
    }

    public static /* synthetic */ void lambda$start$1(UGCVideoProcessor uGCVideoProcessor, boolean z) {
    }

    public static /* synthetic */ void lambda$unInitialize$0(UGCVideoProcessor uGCVideoProcessor) {
    }

    private PixelFrame preScale(PixelFrame pixelFrame) {
    }

    private void processFrame() {
    }

    private void reInitProcessorChain(Object obj, int i2, int i3) {
    }

    private void removeMsgFromVideoProcessHandler(int i2) {
    }

    private boolean runOnVideoProcessHandler(Runnable runnable) {
    }

    private void sendMsgToVideoProcessHandler(int i2) {
    }

    private void stopEncoder() {
    }

    private void uninitVideoProcessor() {
    }

    private void uninitializedEGL() {
    }

    public VideoEffectProcessor getEffectProcessor() {
    }

    public VideoTransitionProcessor getTransitionProcessor() {
    }

    public WatermarkProcessor getWatermarkProcessor() {
    }

    public void initialize() {
    }

    public void seekTo(long j2) {
    }

    public void setBeautyFilter(int i2, int i3) {
    }

    public void setCustomVideoProcessListener(TXVideoEditer.TXVideoCustomProcessListener tXVideoCustomProcessListener) {
    }

    public void setDisplayView(DisplayTarget displayTarget, GLConstants.GLScaleType gLScaleType) {
    }

    public void setEncodeParams(VideoEncodeParams videoEncodeParams) {
    }

    public void setFilter(Bitmap bitmap, float f2, Bitmap bitmap2, float f3, float f4) {
    }

    public void setOutputSize(int i2, int i3, GLConstants.GLScaleType gLScaleType) {
    }

    public void setPictureTransition(int i2) {
    }

    public void setProgressListener(VideoProcessListener videoProcessListener) {
    }

    public void setRenderRotation(Rotation rotation) {
    }

    public void setSpecialRatio(float f2) {
    }

    public void setSpeedList(List<TXVideoEditConstants.TXSpeed> list) {
    }

    public void setSplitScreenList(List<TXVideoEditConstants.TXAbsoluteRect> list, int i2, int i3) {
    }

    public void setVideoEncodedFrameListener(VideoEncodedFrameListener videoEncodedFrameListener) {
    }

    public void start(boolean z) {
    }

    public void stop() {
    }

    public void unInitialize() {
    }
}
