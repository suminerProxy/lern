package com.facebook.fresco.animation.bitmap.preparation;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.fresco.animation.bitmap.BitmapFrameRenderer;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.ExecutorService;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DefaultBitmapFramePreparer implements BitmapFramePreparer {
    private static final Class<?> TAG = DefaultBitmapFramePreparer.class;
    private final Bitmap.Config mBitmapConfig;
    private final BitmapFrameRenderer mBitmapFrameRenderer;
    private final ExecutorService mExecutorService;
    private final SparseArray<Runnable> mPendingFrameDecodeJobs = new SparseArray<>();
    private final PlatformBitmapFactory mPlatformBitmapFactory;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class FrameDecodeRunnable implements Runnable {
        private final AnimationBackend mAnimationBackend;
        private final BitmapFrameCache mBitmapFrameCache;
        private final int mFrameNumber;
        private final int mHashCode;
        public final /* synthetic */ DefaultBitmapFramePreparer this$0;

        public FrameDecodeRunnable(final DefaultBitmapFramePreparer this$0, AnimationBackend animationBackend, BitmapFrameCache bitmapFrameCache, int frameNumber, int hashCode) {
        }

        private boolean prepareFrameAndCache(int frameNumber, int frameType) {
        }

        private boolean renderFrameAndCache(int frameNumber, @Nullable CloseableReference<Bitmap> bitmapReference, int frameType) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public DefaultBitmapFramePreparer(PlatformBitmapFactory platformBitmapFactory, BitmapFrameRenderer bitmapFrameRenderer, Bitmap.Config bitmapConfig, ExecutorService executorService) {
        this.mPlatformBitmapFactory = platformBitmapFactory;
        this.mBitmapFrameRenderer = bitmapFrameRenderer;
        this.mBitmapConfig = bitmapConfig;
        this.mExecutorService = executorService;
    }

    private static int getUniqueId(AnimationBackend backend, int frameNumber) {
        return (backend.hashCode() * 31) + frameNumber;
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.BitmapFramePreparer
    public boolean prepareFrame(BitmapFrameCache bitmapFrameCache, AnimationBackend animationBackend, int frameNumber) {
        int uniqueId = getUniqueId(animationBackend, frameNumber);
        synchronized (this.mPendingFrameDecodeJobs) {
            if (this.mPendingFrameDecodeJobs.get(uniqueId) != null) {
                FLog.v(TAG, "Already scheduled decode job for frame %d", Integer.valueOf(frameNumber));
                return true;
            } else if (bitmapFrameCache.contains(frameNumber)) {
                FLog.v(TAG, "Frame %d is cached already.", Integer.valueOf(frameNumber));
                return true;
            } else {
                FrameDecodeRunnable frameDecodeRunnable = new FrameDecodeRunnable(this, animationBackend, bitmapFrameCache, frameNumber, uniqueId);
                this.mPendingFrameDecodeJobs.put(uniqueId, frameDecodeRunnable);
                this.mExecutorService.execute(frameDecodeRunnable);
                return true;
            }
        }
    }
}
