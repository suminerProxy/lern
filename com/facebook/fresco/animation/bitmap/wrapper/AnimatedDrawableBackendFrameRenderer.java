package com.facebook.fresco.animation.bitmap.wrapper;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.fresco.animation.bitmap.BitmapFrameRenderer;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimatedDrawableBackendFrameRenderer implements BitmapFrameRenderer {
    private static final Class<?> TAG = AnimatedDrawableBackendFrameRenderer.class;
    private AnimatedDrawableBackend mAnimatedDrawableBackend;
    private AnimatedImageCompositor mAnimatedImageCompositor;
    private final BitmapFrameCache mBitmapFrameCache;
    private final AnimatedImageCompositor.Callback mCallback;

    public AnimatedDrawableBackendFrameRenderer(BitmapFrameCache bitmapFrameCache, AnimatedDrawableBackend animatedDrawableBackend) {
        AnimatedImageCompositor.Callback callback = new AnimatedImageCompositor.Callback(this) { // from class: com.facebook.fresco.animation.bitmap.wrapper.AnimatedDrawableBackendFrameRenderer.1
            public final /* synthetic */ AnimatedDrawableBackendFrameRenderer this$0;

            @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.Callback
            @Nullable
            public CloseableReference<Bitmap> getCachedBitmap(int frameNumber) {
            }

            @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.Callback
            public void onIntermediateResult(int frameNumber, Bitmap bitmap) {
            }
        };
        this.mCallback = callback;
        this.mBitmapFrameCache = bitmapFrameCache;
        this.mAnimatedDrawableBackend = animatedDrawableBackend;
        this.mAnimatedImageCompositor = new AnimatedImageCompositor(animatedDrawableBackend, callback);
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameRenderer
    public int getIntrinsicHeight() {
        return this.mAnimatedDrawableBackend.getHeight();
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameRenderer
    public int getIntrinsicWidth() {
        return this.mAnimatedDrawableBackend.getWidth();
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameRenderer
    public boolean renderFrame(int frameNumber, Bitmap targetBitmap) {
        try {
            this.mAnimatedImageCompositor.renderFrame(frameNumber, targetBitmap);
            return true;
        } catch (IllegalStateException e2) {
            FLog.e(TAG, e2, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(frameNumber));
            return false;
        }
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameRenderer
    public void setBounds(@Nullable Rect bounds) {
        AnimatedDrawableBackend forNewBounds = this.mAnimatedDrawableBackend.forNewBounds(bounds);
        if (forNewBounds != this.mAnimatedDrawableBackend) {
            this.mAnimatedDrawableBackend = forNewBounds;
            this.mAnimatedImageCompositor = new AnimatedImageCompositor(forNewBounds, this.mCallback);
        }
    }
}
