package com.tencent.ugc;

import android.graphics.Bitmap;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.ugc.TXVideoEditConstants;
import java.util.List;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCMediaListSource {
    private static final int MAX_FRAME_SIZE = 5;
    private final UGCFrameQueue<List<AudioFrame>> mAudioFrameListQueue;
    private com.tencent.liteav.base.util.b mAudioHandler;
    private long mAudioSeekTimeInClip;
    private List<Bitmap> mBitmapList;
    private FutureTask<Long> mCalculateDurationTask;
    private final List<Clip> mClipList;
    private int mCurrentAudioClipIndex;
    private UGCAudioFrameProvider mCurrentAudioFrameProvider;
    private UGCPixelFrameProvider mCurrentPixelFrameProvider;
    private int mCurrentVideoClipIndex;
    private int mFps;
    private FutureTask<Boolean> mHasAudioDataTask;
    private final AtomicBoolean mIsAudioSeeking;
    private boolean mIsMediaSourceOverlapped;
    private boolean mIsPreciseSeek;
    private boolean mIsReverse;
    private final AtomicBoolean mIsVideoSeeking;
    private long mLastAudioFrameTimestamp;
    private long mLastVideoFrameTimestamp;
    private final List<a> mMediaInfoList;
    private UGCPixelFrameProvider mNextPixelFrameProvider;
    private int mNextVideoClipIndex;
    private final UGCFrameQueue<List<PixelFrame>> mPixelFrameListQueue;
    private List<TXVideoEditConstants.TXRepeat> mRepeatList;
    private long mSourceRangeEnd;
    private long mSourceRangeStart;
    private List<String> mSources;
    private List<TXVideoEditConstants.TXSpeed> mSpeedList;
    private final String mTAG;
    private final List<PixelFrame> mTailPixelFrameList;
    private long mTailWaterMarkDurationMs;
    private long mTotalDuration;
    private int mTransitionType;
    private com.tencent.liteav.base.util.b mVideoHandler;
    private long mVideoSeekTimeInClip;
    private com.tencent.liteav.base.util.b mWorkHandler;

    public static /* synthetic */ void access$lambda$0(UGCMediaListSource uGCMediaListSource) {
    }

    public static /* synthetic */ boolean access$lambda$1(UGCMediaListSource uGCMediaListSource) {
    }

    public static /* synthetic */ void access$lambda$10(UGCMediaListSource uGCMediaListSource) {
    }

    public static /* synthetic */ void access$lambda$11(UGCMediaListSource uGCMediaListSource) {
    }

    public static /* synthetic */ void access$lambda$12(UGCMediaListSource uGCMediaListSource) {
    }

    public static /* synthetic */ void access$lambda$13(UGCMediaListSource uGCMediaListSource) {
    }

    public static /* synthetic */ void access$lambda$14(UGCMediaListSource uGCMediaListSource) {
    }

    public static /* synthetic */ void access$lambda$15(UGCMediaListSource uGCMediaListSource) {
    }

    public static /* synthetic */ long access$lambda$16(UGCMediaListSource uGCMediaListSource) {
    }

    public static /* synthetic */ long access$lambda$2(UGCMediaListSource uGCMediaListSource) {
    }

    public static /* synthetic */ long access$lambda$3(UGCMediaListSource uGCMediaListSource) {
    }

    public static /* synthetic */ long access$lambda$4(UGCMediaListSource uGCMediaListSource) {
    }

    public static /* synthetic */ void access$lambda$5(UGCMediaListSource uGCMediaListSource) {
    }

    public static /* synthetic */ void access$lambda$6(UGCMediaListSource uGCMediaListSource) {
    }

    public static /* synthetic */ void access$lambda$7(UGCMediaListSource uGCMediaListSource) {
    }

    public static /* synthetic */ long access$lambda$8(UGCMediaListSource uGCMediaListSource) {
    }

    public static /* synthetic */ long access$lambda$9(UGCMediaListSource uGCMediaListSource) {
    }

    private void addClipToList(long j2, long j3, a aVar) {
    }

    private void addVideoTailFrameListToQueue() {
    }

    private void adjustAudioFrameTimestamp(List<AudioFrame> list) {
    }

    private void adjustPixelFrameTimestamp(List<PixelFrame> list) {
    }

    private long calculateAudioFrameDuration(AudioFrame audioFrame) {
    }

    private long calculateTotalDurationOfClips() {
    }

    private void clearFrameQueue() {
    }

    private void closeCurrentAudioFrameProvider() {
    }

    private void closeCurrentPixelFrameProvider() {
    }

    private void closeNextPixelFrameProvider() {
    }

    private UGCPixelFrameProvider createImageProvider() {
    }

    private UGCAudioFrameProvider createMuteAudioProvider() {
    }

    private TXVideoEditConstants.TXSpeed createTXSpeed(long j2, long j3, int i2) {
    }

    private UGCPixelFrameProvider createVideoFileProvider(int i2, boolean z) {
    }

    private void cutMultipleFileToClips() {
    }

    private void cutSingleVideoFileToClips() {
    }

    private long estimateSourceOpenTime() {
    }

    private long getClipDuration(Clip clip) {
    }

    private long getImageDuration() {
    }

    private static a getMediaInfo(String str) {
    }

    public static float getSpeed(int i2) {
    }

    private boolean hasAudioDataInternal() {
    }

    private boolean isImageSource() {
    }

    private boolean isInvalidRepeat(TXVideoEditConstants.TXRepeat tXRepeat) {
    }

    public static /* synthetic */ int lambda$cutSingleVideoFileToClips$1(TXVideoEditConstants.TXRepeat tXRepeat, TXVideoEditConstants.TXRepeat tXRepeat2) {
    }

    public static /* synthetic */ void lambda$seekTo$7(UGCMediaListSource uGCMediaListSource, long j2, boolean z) {
    }

    public static /* synthetic */ void lambda$setIsMediaSourceOverlapped$3(UGCMediaListSource uGCMediaListSource, boolean z) {
    }

    public static /* synthetic */ void lambda$setPictureList$5(UGCMediaListSource uGCMediaListSource, List list, int i2) {
    }

    public static /* synthetic */ void lambda$setPictureTransition$6(UGCMediaListSource uGCMediaListSource, int i2) {
    }

    public static /* synthetic */ void lambda$setRepeatPlay$8(UGCMediaListSource uGCMediaListSource, List list) {
    }

    public static /* synthetic */ void lambda$setReverse$9(UGCMediaListSource uGCMediaListSource, boolean z) {
    }

    public static /* synthetic */ void lambda$setSpeedList$10(UGCMediaListSource uGCMediaListSource, List list) {
    }

    public static /* synthetic */ void lambda$setTailWaterMarkDurationSecond$11(UGCMediaListSource uGCMediaListSource, int i2) {
    }

    public static /* synthetic */ void lambda$setVideoSourceRange$4(UGCMediaListSource uGCMediaListSource, long j2, long j3) {
    }

    public static /* synthetic */ void lambda$setVideoSources$0(UGCMediaListSource uGCMediaListSource, List list) {
    }

    public static /* synthetic */ int lambda$updateSpeedInfoToClips$2(TXVideoEditConstants.TXSpeed tXSpeed, TXVideoEditConstants.TXSpeed tXSpeed2) {
    }

    private void prePareNextUGCPixelFrameProvider() {
    }

    private void readAudioFrameListToQueue() {
    }

    private void readNextAudioFrameInternal() {
    }

    private void readNextVideoFrameInternal() {
    }

    private void readVideoFrameListToQueue() {
    }

    private void removeRunnable(Runnable runnable) {
    }

    private void resetReadPositionInternal() {
    }

    private void runOnWorkThread(Runnable runnable) {
    }

    private void saveTailVideoFrameToList(List<PixelFrame> list) {
    }

    private void seekToInternal(long j2, boolean z) {
    }

    private void setVideoSourcesInternal(List<String> list) {
    }

    private void uninitializeInternal() {
    }

    private void updateClipsInfo() {
    }

    private boolean updateCurrentAudioFrameProvider() {
    }

    private boolean updateCurrentPixelFrameProvider() {
    }

    private void updateSpeedInfoToClips(Clip clip) {
    }

    private void updateTimelineToClips() {
    }

    public long getDuration() {
    }

    public boolean hasAudioData() {
    }

    public void impreciseSeekTo(long j2) {
    }

    public void initialize() {
    }

    public List<AudioFrame> readNextAudioFrame() {
    }

    public List<PixelFrame> readNextVideoFrame() {
    }

    public void resetReadPosition() {
    }

    public void seekTo(long j2) {
    }

    public void setIsMediaSourceOverlapped(boolean z) {
    }

    public void setPictureList(List<Bitmap> list, int i2) {
    }

    public void setPictureTransition(int i2) {
    }

    public void setRepeatPlay(List<TXVideoEditConstants.TXRepeat> list) {
    }

    public void setReverse(boolean z) {
    }

    public void setSpeedList(List<TXVideoEditConstants.TXSpeed> list) {
    }

    public void setTailWaterMarkDurationSecond(int i2) {
    }

    public void setVideoSourceRange(long j2, long j3) {
    }

    public void setVideoSources(List<String> list) {
    }

    public long transitionOffsetTimeWithPts(long j2) {
    }

    public void uninitialize() {
    }

    private void runOnWorkThread(Runnable runnable, int i2) {
    }

    private void seekTo(long j2, boolean z) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f14251a;
        public long b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public float f14252d;

        /* renamed from: e  reason: collision with root package name */
        public String f14253e;

        /* renamed from: f  reason: collision with root package name */
        public String f14254f;

        private a() {
        }

        public /* synthetic */ a(byte b) {
        }
    }
}
