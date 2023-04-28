package com.tencent.ugc;

import android.graphics.Bitmap;
import com.tencent.ugc.TXVideoEditer;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCThumbnailGenerator {
    private com.tencent.liteav.videobase.b.e mEGLCore;
    private final com.tencent.liteav.videobase.frame.c mGLFrameBuffer;
    private com.tencent.liteav.videobase.frame.e mGLTexturePool;
    private int mGenerateIndex;
    private com.tencent.liteav.base.util.b mHandler;
    private boolean mIsInitialized;
    private final UGCMediaListSource mMediaListSource;
    private com.tencent.liteav.videobase.frame.j mPixelFrameRender;
    private Object mSharedContext;
    private String mTag;
    private UGCThumbnailGenerateParams mThumbnailGenerateInfo;
    private TXVideoEditer.TXThumbnailListener mThumbnailListener;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class UGCThumbnailGenerateParams {
        public boolean fast;
        public int height;
        public List<Long> thumbnailPtsList;
        public int width;
    }

    public static /* synthetic */ void access$lambda$0(UGCThumbnailGenerator uGCThumbnailGenerator) {
    }

    public static List<Long> calculateThumbnailList(int i2, long j2, long j3, long j4) {
    }

    private Bitmap getBitmapFromTexture(com.tencent.liteav.videobase.frame.d dVar) {
    }

    private void getNextThumbnail() {
    }

    private void initOpenGLComponents(Object obj, int i2, int i3) {
    }

    public static /* synthetic */ void lambda$setVideoSourceList$1(UGCThumbnailGenerator uGCThumbnailGenerator, List list) {
    }

    public static /* synthetic */ void lambda$setVideoSourceRange$2(UGCThumbnailGenerator uGCThumbnailGenerator, long j2, long j3) {
    }

    public static /* synthetic */ void lambda$start$3(UGCThumbnailGenerator uGCThumbnailGenerator, UGCThumbnailGenerateParams uGCThumbnailGenerateParams, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
    }

    public static /* synthetic */ void lambda$stop$4(UGCThumbnailGenerator uGCThumbnailGenerator) {
    }

    public static /* synthetic */ void lambda$uninitialize$0(UGCThumbnailGenerator uGCThumbnailGenerator) {
    }

    private boolean runOnThumbnailThread(Runnable runnable) {
    }

    private void uninitOpenGLComponents() {
    }

    public void initialize() {
    }

    public void setVideoSourceList(List<String> list) {
    }

    public void setVideoSourceRange(long j2, long j3) {
    }

    public void start(UGCThumbnailGenerateParams uGCThumbnailGenerateParams, TXVideoEditer.TXThumbnailListener tXThumbnailListener) {
    }

    public void stop() {
    }

    public void uninitialize() {
    }
}
