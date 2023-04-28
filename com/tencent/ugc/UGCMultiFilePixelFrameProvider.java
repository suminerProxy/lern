package com.tencent.ugc;

import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.ugc.UGCFrameQueue;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCMultiFilePixelFrameProvider implements UGCFrameQueue.UGCFrameQueueListener, UGCPixelFrameProvider {
    private static final String TAG = "UGCMultiFileVideoFrameProvider";
    private int mClipIndexOfMaxFps;
    private final List<Clip> mClipList;
    private long mCurrentTimestamp;
    private long mFrameDuration;
    private final UGCFrameQueue<List<PixelFrame>> mPixelFrameListQueue;
    private final PixelFrame[] mPixelFrameStash;
    private final UGCPixelFrameProvider[] mProviderList;
    private final com.tencent.liteav.base.util.b mSingleFileProviderHandler;
    private final com.tencent.liteav.base.util.b mWorkHandler;

    public UGCMultiFilePixelFrameProvider(List<Clip> list, com.tencent.liteav.base.util.b bVar) {
    }

    public static /* synthetic */ void access$lambda$0(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
    }

    private void clearFrameCache() {
    }

    private void clearFrameQueue() {
    }

    private PixelFrame copyPixelFrame(PixelFrame pixelFrame) {
    }

    private void getCurrentTimestampWithFpsInfo() {
    }

    public static /* synthetic */ void lambda$seekTo$2(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider, long j2, boolean z) {
    }

    public static /* synthetic */ void lambda$start$0(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
    }

    public static /* synthetic */ void lambda$stop$1(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
    }

    private void putOneFrameToList(PixelFrame pixelFrame, List<PixelFrame> list) {
    }

    private void readFrameToCache() {
    }

    private void readFrameToQueue() {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public UGCFrameQueue<List<PixelFrame>> getFrameQueue() {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void initialize() {
    }

    @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
    public void onFrameDequeued() {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void seekTo(long j2, boolean z) {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setReverse(boolean z) {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void start() {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void stop() {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void uninitialize() {
    }
}
