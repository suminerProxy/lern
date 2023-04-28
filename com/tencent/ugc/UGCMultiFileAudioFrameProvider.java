package com.tencent.ugc;

import com.tencent.ugc.UGCFrameQueue;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCMultiFileAudioFrameProvider implements UGCAudioFrameProvider, UGCFrameQueue.UGCFrameQueueListener {
    private static final String TAG = "UGCMultiFileAudioFrameProvider";
    private final UGCFrameQueue<List<AudioFrame>> mAudioFrameListQueue;
    private final List<Clip> mClipList;
    private final UGCAudioFrameProvider[] mProviderList;
    private final com.tencent.liteav.base.util.b mSingleFileProviderHandler;
    private final com.tencent.liteav.base.util.b mWorkHandler;

    public UGCMultiFileAudioFrameProvider(List<Clip> list, com.tencent.liteav.base.util.b bVar) {
    }

    public static /* synthetic */ void lambda$seekTo$2(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider, long j2) {
    }

    public static /* synthetic */ void lambda$start$0(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider) {
    }

    public static /* synthetic */ void lambda$stop$1(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider) {
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public UGCFrameQueue<List<AudioFrame>> getFrameQueue() {
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void initialize() {
    }

    @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
    public void onFrameDequeued() {
    }

    public void readFrameToQueue() {
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void seekTo(long j2) {
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void start() {
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void stop() {
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void uninitialize() {
    }
}
