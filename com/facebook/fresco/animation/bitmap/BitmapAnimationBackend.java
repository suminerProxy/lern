package com.facebook.fresco.animation.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.backend.AnimationBackendDelegateWithInactivityCheck;
import com.facebook.fresco.animation.backend.AnimationInformation;
import com.facebook.fresco.animation.bitmap.preparation.BitmapFramePreparationStrategy;
import com.facebook.fresco.animation.bitmap.preparation.BitmapFramePreparer;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.infer.annotation.Nullsafe;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BitmapAnimationBackend implements AnimationBackend, AnimationBackendDelegateWithInactivityCheck.InactivityListener {
    public static final int FRAME_TYPE_CACHED = 0;
    public static final int FRAME_TYPE_CREATED = 2;
    public static final int FRAME_TYPE_FALLBACK = 3;
    public static final int FRAME_TYPE_REUSED = 1;
    public static final int FRAME_TYPE_UNKNOWN = -1;
    private static final Class<?> TAG = BitmapAnimationBackend.class;
    private final AnimationInformation mAnimationInformation;
    private final BitmapFrameCache mBitmapFrameCache;
    @Nullable
    private final BitmapFramePreparationStrategy mBitmapFramePreparationStrategy;
    @Nullable
    private final BitmapFramePreparer mBitmapFramePreparer;
    private final BitmapFrameRenderer mBitmapFrameRenderer;
    private int mBitmapHeight;
    private int mBitmapWidth;
    @Nullable
    private Rect mBounds;
    @Nullable
    private FrameListener mFrameListener;
    private final PlatformBitmapFactory mPlatformBitmapFactory;
    private Bitmap.Config mBitmapConfig = Bitmap.Config.ARGB_8888;
    private final Paint mPaint = new Paint(6);

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface FrameListener {
        void onDrawFrameStart(BitmapAnimationBackend backend, int frameNumber);

        void onFrameDrawn(BitmapAnimationBackend backend, int frameNumber, int frameType);

        void onFrameDropped(BitmapAnimationBackend backend, int frameNumber);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface FrameType {
    }

    public BitmapAnimationBackend(PlatformBitmapFactory platformBitmapFactory, BitmapFrameCache bitmapFrameCache, AnimationInformation animationInformation, BitmapFrameRenderer bitmapFrameRenderer, @Nullable BitmapFramePreparationStrategy bitmapFramePreparationStrategy, @Nullable BitmapFramePreparer bitmapFramePreparer) {
        this.mPlatformBitmapFactory = platformBitmapFactory;
        this.mBitmapFrameCache = bitmapFrameCache;
        this.mAnimationInformation = animationInformation;
        this.mBitmapFrameRenderer = bitmapFrameRenderer;
        this.mBitmapFramePreparationStrategy = bitmapFramePreparationStrategy;
        this.mBitmapFramePreparer = bitmapFramePreparer;
        updateBitmapDimensions();
    }

    private boolean drawBitmapAndCache(int frameNumber, @Nullable CloseableReference<Bitmap> bitmapReference, Canvas canvas, int frameType) {
        if (CloseableReference.isValid(bitmapReference)) {
            if (this.mBounds == null) {
                canvas.drawBitmap(bitmapReference.get(), 0.0f, 0.0f, this.mPaint);
            } else {
                canvas.drawBitmap(bitmapReference.get(), (Rect) null, this.mBounds, this.mPaint);
            }
            if (frameType != 3) {
                this.mBitmapFrameCache.onFrameRendered(frameNumber, bitmapReference, frameType);
            }
            FrameListener frameListener = this.mFrameListener;
            if (frameListener != null) {
                frameListener.onFrameDrawn(this, frameNumber, frameType);
                return true;
            }
            return true;
        }
        return false;
    }

    private boolean drawFrameOrFallback(Canvas canvas, int frameNumber, int frameType) {
        CloseableReference<Bitmap> cachedFrame;
        boolean drawBitmapAndCache;
        int i2 = 3;
        boolean z = false;
        try {
            if (frameType != 0) {
                if (frameType == 1) {
                    cachedFrame = this.mBitmapFrameCache.getBitmapToReuseForFrame(frameNumber, this.mBitmapWidth, this.mBitmapHeight);
                    if (renderFrameInBitmap(frameNumber, cachedFrame) && drawBitmapAndCache(frameNumber, cachedFrame, canvas, 1)) {
                        z = true;
                    }
                    i2 = 2;
                } else if (frameType == 2) {
                    cachedFrame = this.mPlatformBitmapFactory.createBitmap(this.mBitmapWidth, this.mBitmapHeight, this.mBitmapConfig);
                    if (renderFrameInBitmap(frameNumber, cachedFrame) && drawBitmapAndCache(frameNumber, cachedFrame, canvas, 2)) {
                        z = true;
                    }
                } else if (frameType != 3) {
                    return false;
                } else {
                    cachedFrame = this.mBitmapFrameCache.getFallbackFrame(frameNumber);
                    drawBitmapAndCache = drawBitmapAndCache(frameNumber, cachedFrame, canvas, 3);
                    i2 = -1;
                }
                drawBitmapAndCache = z;
            } else {
                cachedFrame = this.mBitmapFrameCache.getCachedFrame(frameNumber);
                drawBitmapAndCache = drawBitmapAndCache(frameNumber, cachedFrame, canvas, 0);
                i2 = 1;
            }
            CloseableReference.closeSafely(cachedFrame);
            return (drawBitmapAndCache || i2 == -1) ? drawBitmapAndCache : drawFrameOrFallback(canvas, frameNumber, i2);
        } catch (RuntimeException e2) {
            FLog.w(TAG, "Failed to create frame bitmap", e2);
            return false;
        } finally {
            CloseableReference.closeSafely((CloseableReference<?>) null);
        }
    }

    private boolean renderFrameInBitmap(int frameNumber, @Nullable CloseableReference<Bitmap> targetBitmap) {
        if (CloseableReference.isValid(targetBitmap)) {
            boolean renderFrame = this.mBitmapFrameRenderer.renderFrame(frameNumber, targetBitmap.get());
            if (!renderFrame) {
                CloseableReference.closeSafely(targetBitmap);
            }
            return renderFrame;
        }
        return false;
    }

    private void updateBitmapDimensions() {
        int intrinsicWidth = this.mBitmapFrameRenderer.getIntrinsicWidth();
        this.mBitmapWidth = intrinsicWidth;
        if (intrinsicWidth == -1) {
            Rect rect = this.mBounds;
            this.mBitmapWidth = rect == null ? -1 : rect.width();
        }
        int intrinsicHeight = this.mBitmapFrameRenderer.getIntrinsicHeight();
        this.mBitmapHeight = intrinsicHeight;
        if (intrinsicHeight == -1) {
            Rect rect2 = this.mBounds;
            this.mBitmapHeight = rect2 != null ? rect2.height() : -1;
        }
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public void clear() {
        this.mBitmapFrameCache.clear();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public boolean drawFrame(Drawable parent, Canvas canvas, int frameNumber) {
        BitmapFramePreparer bitmapFramePreparer;
        FrameListener frameListener;
        FrameListener frameListener2 = this.mFrameListener;
        if (frameListener2 != null) {
            frameListener2.onDrawFrameStart(this, frameNumber);
        }
        boolean drawFrameOrFallback = drawFrameOrFallback(canvas, frameNumber, 0);
        if (!drawFrameOrFallback && (frameListener = this.mFrameListener) != null) {
            frameListener.onFrameDropped(this, frameNumber);
        }
        BitmapFramePreparationStrategy bitmapFramePreparationStrategy = this.mBitmapFramePreparationStrategy;
        if (bitmapFramePreparationStrategy != null && (bitmapFramePreparer = this.mBitmapFramePreparer) != null) {
            bitmapFramePreparationStrategy.prepareFrames(bitmapFramePreparer, this.mBitmapFrameCache, this, frameNumber);
        }
        return drawFrameOrFallback;
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public int getFrameCount() {
        return this.mAnimationInformation.getFrameCount();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public int getFrameDurationMs(int frameNumber) {
        return this.mAnimationInformation.getFrameDurationMs(frameNumber);
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public int getIntrinsicHeight() {
        return this.mBitmapHeight;
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public int getIntrinsicWidth() {
        return this.mBitmapWidth;
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public int getLoopCount() {
        return this.mAnimationInformation.getLoopCount();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public int getSizeInBytes() {
        return this.mBitmapFrameCache.getSizeInBytes();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackendDelegateWithInactivityCheck.InactivityListener
    public void onInactive() {
        clear();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public void setAlpha(@IntRange(from = 0, to = 255) int alpha) {
        this.mPaint.setAlpha(alpha);
    }

    public void setBitmapConfig(Bitmap.Config bitmapConfig) {
        this.mBitmapConfig = bitmapConfig;
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public void setBounds(@Nullable Rect bounds) {
        this.mBounds = bounds;
        this.mBitmapFrameRenderer.setBounds(bounds);
        updateBitmapDimensions();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    public void setFrameListener(@Nullable FrameListener frameListener) {
        this.mFrameListener = frameListener;
    }
}
