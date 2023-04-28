package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videoproducer.encoder.VideoEncodeParams;
import com.tencent.ugc.MP4Writer;
import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.UGCAVSyncer;
import com.tencent.ugc.UGCAudioProcessor;
import com.tencent.ugc.UGCThumbnailGenerator;
import com.tencent.ugc.UGCVideoProcessor;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXVideoEditer {
    private static final String TAG = "TXVideoEditer";
    @NonNull
    private final UGCAVSyncer mAVSyncer;
    private int mAudioEncodeBitrate;
    private final UGCAudioProcessor.AudioEncodedFrameListener mAudioEncodedFrameListener;
    private List<MediaFormat> mAudioFormatList;
    @NonNull
    private final UGCAudioProcessor mAudioProcessor;
    private MediaFormat mBGMFormat;
    private CombineFilterInfo mCombineFilterInfo;
    private final Context mContext;
    private int mEncodeProfile;
    private com.tencent.liteav.base.util.p mEncodeResolution;
    private long mEndTimeMs;
    private FrameLayout mFrameLayout;
    private boolean mHasBGM;
    private final TXThumbnailListener mInnerThumbnailListener;
    private boolean mIsAudioEnd;
    private boolean mIsFullIFrame;
    private boolean mIsGenerating;
    private boolean mIsProcessToFullKeyFrame;
    private boolean mIsReverse;
    private boolean mIsVideoEnd;
    private final com.tencent.liteav.base.util.b mMainHandler;
    @NonNull
    private final UGCMediaListSource mMediaListSource;
    private MP4Writer mMp4Writer;
    private final MP4Writer.MP4WriterListener mMp4WriterListener;
    private UGCAVSyncer.SyncMode mPreviewSyncMode;
    private String mProcessOutputPath;
    private UGCThumbnailGenerator.UGCThumbnailGenerateParams mProcessThumbnailInfo;
    private TXThumbnailListener mProcessThumbnailListener;
    private Rotation mRotation;
    public final com.tencent.liteav.base.util.l mSequenceTaskRunner;
    private String mSourcePath;
    private long mStartTimeMs;
    @NonNull
    private final UGCThumbnailGenerator mThumbnailGenerator;
    private int mVideoEncodeBitrate;
    private final UGCVideoProcessor.VideoEncodedFrameListener mVideoEncodedFrameListener;
    private List<MediaFormat> mVideoFormatList;
    private TXVideoGenerateListener mVideoGenerateListener;
    private TXVideoPreviewListener mVideoPreviewListener;
    private TXVideoProcessListener mVideoProcessListener;
    private final UGCVideoProcessor.VideoProcessListener mVideoProcessProgressListener;
    @NonNull
    private final UGCVideoProcessor mVideoProcessor;

    /* renamed from: com.tencent.ugc.TXVideoEditer$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements MP4Writer.MP4WriterListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXVideoEditer f14242a;

        public AnonymousClass1(TXVideoEditer tXVideoEditer) {
        }

        @Override // com.tencent.ugc.MP4Writer.MP4WriterListener
        public final void onComplete(long j2) {
        }

        @Override // com.tencent.ugc.MP4Writer.MP4WriterListener
        public final void onError(String str) {
        }
    }

    /* renamed from: com.tencent.ugc.TXVideoEditer$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements UGCVideoProcessor.VideoEncodedFrameListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXVideoEditer f14243a;

        public AnonymousClass2(TXVideoEditer tXVideoEditer) {
        }

        @Override // com.tencent.ugc.UGCVideoProcessor.VideoEncodedFrameListener
        public final void onVideoEncodingCompleted() {
        }

        @Override // com.tencent.ugc.UGCVideoProcessor.VideoEncodedFrameListener
        public final void onVideoFrameEncoded(EncodedVideoFrame encodedVideoFrame) {
        }
    }

    /* renamed from: com.tencent.ugc.TXVideoEditer$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements UGCAudioProcessor.AudioEncodedFrameListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXVideoEditer f14244a;

        public AnonymousClass3(TXVideoEditer tXVideoEditer) {
        }

        @Override // com.tencent.ugc.UGCAudioProcessor.AudioEncodedFrameListener
        public final void onAudioEncodingCompleted() {
        }

        @Override // com.tencent.ugc.UGCAudioProcessor.AudioEncodedFrameListener
        public final void onAudioFrameEncoded(AudioFrame audioFrame) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface TXPCMCallbackListener {
        TXAudioFrame onPCMCallback(TXAudioFrame tXAudioFrame);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface TXThumbnailListener {
        void onThumbnail(int i2, long j2, Bitmap bitmap);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface TXVideoCustomProcessListener {
        int onTextureCustomProcess(int i2, int i3, int i4, long j2);

        void onTextureDestroyed();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface TXVideoGenerateListener {
        void onGenerateComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult);

        void onGenerateProgress(float f2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface TXVideoPreviewListener {
        void onPreviewFinished();

        void onPreviewProgress(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface TXVideoPreviewListenerEx extends TXVideoPreviewListener {
        void onPreviewError(TXVideoEditConstants.TXPreviewError tXPreviewError);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface TXVideoProcessListener {
        void onProcessComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult);

        void onProcessProgress(float f2);
    }

    public TXVideoEditer(Context context) {
    }

    public static /* synthetic */ void access$000(TXVideoEditer tXVideoEditer, int i2, long j2) {
    }

    public static /* synthetic */ void access$100(TXVideoEditer tXVideoEditer, EncodedVideoFrame encodedVideoFrame) {
    }

    public static /* synthetic */ boolean access$1000(TXVideoEditer tXVideoEditer) {
    }

    public static /* synthetic */ void access$1100(TXVideoEditer tXVideoEditer, int i2) {
    }

    public static /* synthetic */ void access$200(TXVideoEditer tXVideoEditer) {
    }

    public static /* synthetic */ void access$300(TXVideoEditer tXVideoEditer, AudioFrame audioFrame) {
    }

    public static /* synthetic */ void access$400(TXVideoEditer tXVideoEditer) {
    }

    public static /* synthetic */ boolean access$500(TXVideoEditer tXVideoEditer) {
    }

    public static /* synthetic */ boolean access$502(TXVideoEditer tXVideoEditer, boolean z) {
    }

    public static /* synthetic */ boolean access$602(TXVideoEditer tXVideoEditer, boolean z) {
    }

    public static /* synthetic */ UGCAVSyncer access$700(TXVideoEditer tXVideoEditer) {
    }

    public static /* synthetic */ void access$800(TXVideoEditer tXVideoEditer) {
    }

    public static /* synthetic */ UGCMediaListSource access$900(TXVideoEditer tXVideoEditer) {
    }

    public static /* synthetic */ void access$lambda$0(TXVideoEditer tXVideoEditer) {
    }

    private float calculateProgress(long j2) {
    }

    private void doGetThumbnail(List<Long> list, int i2, int i3, boolean z, TXThumbnailListener tXThumbnailListener) {
    }

    private void doStopPlayInner() {
    }

    private String generateVideoPath() {
    }

    private void getAllMediaFormatFromSource(List<String> list) {
    }

    private void handleEncodedCompletedInner() {
    }

    private void handleWriteMP4Completed(int i2, long j2) {
    }

    private static boolean isAudioChannelSatisfied(MediaFormat mediaFormat) {
    }

    private static int isAudioFormatValid(MediaExtractor mediaExtractor, boolean z) {
    }

    private int isBGMValid(String str) {
    }

    private boolean isFullIFrame(String str) {
    }

    private boolean isGopEqualOne(String str) {
    }

    public static int isMediaSourceValid(String str) {
    }

    public static /* synthetic */ void lambda$cancel$50(TXVideoEditer tXVideoEditer) {
    }

    public static /* synthetic */ void lambda$deleteAllEffect$31(TXVideoEditer tXVideoEditer) {
    }

    public static /* synthetic */ void lambda$deleteLastEffect$30(TXVideoEditer tXVideoEditer) {
    }

    public static /* synthetic */ void lambda$deleteLastTransitionEffect$27(TXVideoEditer tXVideoEditer) {
    }

    public static /* synthetic */ void lambda$doGetThumbnail$52(TXThumbnailListener tXThumbnailListener, List list, UGCThumbnailGenerator uGCThumbnailGenerator, int i2, long j2, Bitmap bitmap) {
    }

    public static /* synthetic */ void lambda$generateVideo$49(TXVideoEditer tXVideoEditer, int i2, String str) {
    }

    public static /* synthetic */ void lambda$getThumbnail$33(TXVideoEditer tXVideoEditer, List list, int i2, int i3, boolean z, TXThumbnailListener tXThumbnailListener) {
    }

    public static /* synthetic */ void lambda$getThumbnail$34(TXVideoEditer tXVideoEditer, int i2, int i3, boolean z, int i4, TXThumbnailListener tXThumbnailListener) {
    }

    public static /* synthetic */ void lambda$handleWriteMP4Completed$53(TXVideoEditer tXVideoEditer, int i2, long j2) {
    }

    public static /* synthetic */ void lambda$initWithPreview$39(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
    }

    public static /* synthetic */ void lambda$new$1(TXVideoEditer tXVideoEditer, int i2, long j2, Bitmap bitmap) {
    }

    public static /* synthetic */ void lambda$notifyGenerateComplete$61(int i2, TXVideoGenerateListener tXVideoGenerateListener) {
    }

    public static /* synthetic */ void lambda$notifyGenerateProgress$60(TXVideoGenerateListener tXVideoGenerateListener, float f2) {
    }

    public static /* synthetic */ void lambda$notifyPreviewProgress$58(TXVideoPreviewListener tXVideoPreviewListener, int i2) {
    }

    public static /* synthetic */ void lambda$notifyProcessComplete$59(int i2, TXVideoProcessListener tXVideoProcessListener) {
    }

    public static /* synthetic */ void lambda$null$0(TXVideoEditer tXVideoEditer, int i2, long j2, int i3) {
    }

    public static /* synthetic */ void lambda$onAudioEncodedFrame$56(TXVideoEditer tXVideoEditer, AudioFrame audioFrame) {
    }

    public static /* synthetic */ void lambda$onAudioEncodedFrameComplete$57(TXVideoEditer tXVideoEditer) {
    }

    public static /* synthetic */ void lambda$onVideoEncodedFrame$54(TXVideoEditer tXVideoEditer, EncodedVideoFrame encodedVideoFrame) {
    }

    public static /* synthetic */ void lambda$onVideoEncodedFrameComplete$55(TXVideoEditer tXVideoEditer) {
    }

    public static /* synthetic */ void lambda$pausePlay$41(TXVideoEditer tXVideoEditer) {
    }

    public static /* synthetic */ void lambda$previewAtTime$44(TXVideoEditer tXVideoEditer, long j2) {
    }

    public static /* synthetic */ void lambda$release$37(TXVideoEditer tXVideoEditer) {
    }

    public static /* synthetic */ void lambda$resumePlay$42(TXVideoEditer tXVideoEditer) {
    }

    public static /* synthetic */ void lambda$setAnimatedPasterList$20(TXVideoEditer tXVideoEditer, List list) {
    }

    public static /* synthetic */ void lambda$setAudioBitrate$48(TXVideoEditer tXVideoEditer, int i2) {
    }

    public static /* synthetic */ void lambda$setBGM$11(TXVideoEditer tXVideoEditer, String str, boolean z) {
    }

    public static /* synthetic */ void lambda$setBGMAtVideoTime$13(TXVideoEditer tXVideoEditer, long j2) {
    }

    public static /* synthetic */ void lambda$setBGMFadeInOutDuration$16(TXVideoEditer tXVideoEditer, long j2, long j3) {
    }

    public static /* synthetic */ void lambda$setBGMLoop$12(TXVideoEditer tXVideoEditer, boolean z) {
    }

    public static /* synthetic */ void lambda$setBGMStartTime$14(TXVideoEditer tXVideoEditer, long j2, long j3) {
    }

    public static /* synthetic */ void lambda$setBGMVolume$15(TXVideoEditer tXVideoEditer, float f2) {
    }

    public static /* synthetic */ void lambda$setBeautyFilter$8(TXVideoEditer tXVideoEditer, int i2, int i3) {
    }

    public static /* synthetic */ void lambda$setCustomVideoProcessListener$3(TXVideoEditer tXVideoEditer, TXVideoCustomProcessListener tXVideoCustomProcessListener) {
    }

    public static /* synthetic */ void lambda$setCutFromTime$46(TXVideoEditer tXVideoEditer, long j2, long j3) {
    }

    public static /* synthetic */ void lambda$setFilter$6(TXVideoEditer tXVideoEditer, Bitmap bitmap) {
    }

    public static /* synthetic */ void lambda$setFilter$7(TXVideoEditer tXVideoEditer, float f2, float f3, float f4, Bitmap bitmap, Bitmap bitmap2) {
    }

    public static /* synthetic */ void lambda$setPasterList$21(TXVideoEditer tXVideoEditer, List list) {
    }

    public static /* synthetic */ void lambda$setPictureList$9(TXVideoEditer tXVideoEditer, int i2, List list) {
    }

    public static /* synthetic */ void lambda$setPictureTransition$10(TXVideoEditer tXVideoEditer, int i2) {
    }

    public static /* synthetic */ void lambda$setProfile$4(TXVideoEditer tXVideoEditer, int i2) {
    }

    public static /* synthetic */ void lambda$setRenderRotation$22(TXVideoEditer tXVideoEditer, int i2) {
    }

    public static /* synthetic */ void lambda$setRepeatPlay$24(TXVideoEditer tXVideoEditer, List list) {
    }

    public static /* synthetic */ void lambda$setReverse$25(TXVideoEditer tXVideoEditer, boolean z) {
    }

    public static /* synthetic */ void lambda$setSpecialRatio$5(TXVideoEditer tXVideoEditer, float f2) {
    }

    public static /* synthetic */ void lambda$setSpeedList$23(TXVideoEditer tXVideoEditer, List list) {
    }

    public static /* synthetic */ void lambda$setSubtitleList$19(TXVideoEditer tXVideoEditer, List list) {
    }

    public static /* synthetic */ void lambda$setTXVideoPreviewListener$38(TXVideoEditer tXVideoEditer, TXVideoPreviewListener tXVideoPreviewListener) {
    }

    public static /* synthetic */ void lambda$setTailWaterMark$18(TXVideoEditer tXVideoEditer, int i2, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
    }

    public static /* synthetic */ void lambda$setThumbnail$35(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXThumbnail tXThumbnail) {
    }

    public static /* synthetic */ void lambda$setThumbnailListener$36(TXVideoEditer tXVideoEditer, TXThumbnailListener tXThumbnailListener) {
    }

    public static /* synthetic */ void lambda$setTransitionEffect$26(TXVideoEditer tXVideoEditer, int i2, long j2, long j3, AtomicBoolean atomicBoolean) {
    }

    public static /* synthetic */ void lambda$setVideoBitrate$47(TXVideoEditer tXVideoEditer, int i2) {
    }

    public static /* synthetic */ void lambda$setVideoGenerateListener$45(TXVideoEditer tXVideoEditer, TXVideoGenerateListener tXVideoGenerateListener) {
    }

    public static /* synthetic */ void lambda$setVideoPath$2(TXVideoEditer tXVideoEditer, String str) {
    }

    public static /* synthetic */ void lambda$setVideoProcessListener$32(TXVideoEditer tXVideoEditer, TXVideoProcessListener tXVideoProcessListener) {
    }

    public static /* synthetic */ void lambda$setVideoVolume$51(TXVideoEditer tXVideoEditer, float f2) {
    }

    public static /* synthetic */ void lambda$setWaterMark$17(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXRect tXRect, Bitmap bitmap) {
    }

    public static /* synthetic */ void lambda$startEffect$28(TXVideoEditer tXVideoEditer, int i2, long j2) {
    }

    public static /* synthetic */ void lambda$startPlayFromTime$40(TXVideoEditer tXVideoEditer, long j2, long j3) {
    }

    public static /* synthetic */ void lambda$stopEffect$29(TXVideoEditer tXVideoEditer, int i2, long j2) {
    }

    public static /* synthetic */ void lambda$stopPlay$43(TXVideoEditer tXVideoEditer) {
    }

    private void notifyGenerateComplete(int i2, long j2) {
    }

    private void notifyGenerateProgress(float f2) {
    }

    private void notifyPreviewFinished() {
    }

    private void notifyPreviewProgress(int i2) {
    }

    private void notifyProcessComplete(int i2) {
    }

    private void onAudioEncodedFrame(AudioFrame audioFrame) {
    }

    private void onAudioEncodedFrameComplete() {
    }

    private void onPlayProgressEnd() {
    }

    private void onVideoEncodedFrame(EncodedVideoFrame encodedVideoFrame) {
    }

    private void onVideoEncodedFrameComplete() {
    }

    private void processVideoInternal() {
    }

    private void startMP4Writer(String str) {
    }

    private void startRecord(String str, VideoEncodeParams videoEncodeParams, AudioEncodeParams audioEncodeParams) {
    }

    private void stopMp4Writer() {
    }

    public void cancel() {
    }

    public void deleteAllEffect() {
    }

    public void deleteLastEffect() {
    }

    public void deleteLastTransitionEffect() {
    }

    public void generateVideo(int i2, String str) {
    }

    public long getDuration() {
    }

    public void getThumbnail(List<Long> list, int i2, int i3, boolean z, TXThumbnailListener tXThumbnailListener) {
    }

    public int getThumbnailCount() {
    }

    public String getVideoProcessPath() {
    }

    public String getVideoSourcePath() {
    }

    public void initWithPreview(TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
    }

    public boolean isHasAudio() {
    }

    public void pausePlay() {
    }

    public void previewAtTime(long j2) {
    }

    public void processVideo() {
    }

    public void refreshOneFrame() {
    }

    public void release() {
    }

    public void resumePlay() {
    }

    public void setAnimatedPasterList(List<TXVideoEditConstants.TXAnimatedPaster> list) {
    }

    @Deprecated
    public void setAudioBitrate(int i2) {
    }

    public int setBGM(String str) {
    }

    public void setBGMAtVideoTime(long j2) {
    }

    public void setBGMFadeInOutDuration(long j2, long j3) {
    }

    public void setBGMLoop(boolean z) {
    }

    public void setBGMStartTime(long j2, long j3) {
    }

    public void setBGMVolume(float f2) {
    }

    public void setBeautyFilter(int i2, int i3) {
    }

    public void setCustomVideoProcessListener(TXVideoCustomProcessListener tXVideoCustomProcessListener) {
    }

    public void setCutFromTime(long j2, long j3) {
    }

    public void setFilter(Bitmap bitmap) {
    }

    public void setIsFullIFrame(boolean z) {
    }

    public void setIsSplitScreen(boolean z) {
    }

    public int setMediaSourcePaths(List<String> list) {
    }

    public void setOutputSize(com.tencent.liteav.base.util.p pVar) {
    }

    public void setPasterList(List<TXVideoEditConstants.TXPaster> list) {
    }

    public int setPictureList(List<Bitmap> list, int i2) {
    }

    public long setPictureTransition(int i2) {
    }

    public void setProfile(int i2) {
    }

    public void setRenderRotation(int i2) {
    }

    public void setRepeatPlay(List<TXVideoEditConstants.TXRepeat> list) {
    }

    public void setReverse(boolean z) {
    }

    public void setSpecialRatio(float f2) {
    }

    public void setSpeedList(List<TXVideoEditConstants.TXSpeed> list) {
    }

    public void setSplitScreenList(List<TXVideoEditConstants.TXAbsoluteRect> list, int i2, int i3) {
    }

    public void setSubtitleList(List<TXVideoEditConstants.TXSubtitle> list) {
    }

    public void setTXVideoPreviewListener(TXVideoPreviewListener tXVideoPreviewListener) {
    }

    public void setTailWaterMark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect, int i2) {
    }

    public void setThumbnail(TXVideoEditConstants.TXThumbnail tXThumbnail) {
    }

    public void setThumbnailListener(TXThumbnailListener tXThumbnailListener) {
    }

    public boolean setTransitionEffect(int i2, long j2, long j3) {
    }

    public void setVideoBitrate(int i2) {
    }

    public void setVideoGenerateListener(TXVideoGenerateListener tXVideoGenerateListener) {
    }

    public int setVideoPath(String str) {
    }

    public void setVideoProcessListener(TXVideoProcessListener tXVideoProcessListener) {
    }

    public void setVideoVolume(float f2) {
    }

    public void setVideoVolumes(float[] fArr) {
    }

    public void setWaterMark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
    }

    public void startEffect(int i2, long j2) {
    }

    public void startPlayFromTime(long j2, long j3) {
    }

    public void stopEffect(int i2, long j2) {
    }

    public void stopPlay() {
    }

    public TXVideoEditer(Context context, @NonNull com.tencent.liteav.base.util.l lVar) {
    }

    public void getThumbnail(int i2, int i3, int i4, boolean z, TXThumbnailListener tXThumbnailListener) {
    }

    public boolean setTransitionEffect(int i2, long j2, long j3, long j4) {
    }

    /* renamed from: com.tencent.ugc.TXVideoEditer$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements UGCVideoProcessor.VideoProcessListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXVideoEditer f14245a;

        public AnonymousClass4(TXVideoEditer tXVideoEditer) {
        }

        public static /* synthetic */ void a(AnonymousClass4 anonymousClass4, float f2) {
        }

        @Override // com.tencent.ugc.UGCVideoProcessor.VideoProcessListener
        public final void onComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult) {
        }

        @Override // com.tencent.ugc.UGCVideoProcessor.VideoProcessListener
        public final void onProgress(float f2) {
        }

        public static /* synthetic */ void a(AnonymousClass4 anonymousClass4) {
        }
    }

    public void setFilter(Bitmap bitmap, float f2, Bitmap bitmap2, float f3, float f4) {
    }
}
