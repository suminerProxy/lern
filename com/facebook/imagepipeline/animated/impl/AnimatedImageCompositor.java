package com.facebook.imagepipeline.animated.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimatedImageCompositor {
    private final AnimatedDrawableBackend mAnimatedDrawableBackend;
    private final Callback mCallback;
    private final Paint mTransparentFillPaint;

    /* renamed from: com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$imagepipeline$animated$impl$AnimatedImageCompositor$FrameNeededResult = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface Callback {
        @Nullable
        CloseableReference<Bitmap> getCachedBitmap(int frameNumber);

        void onIntermediateResult(int frameNumber, Bitmap bitmap);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class FrameNeededResult {
        private static final /* synthetic */ FrameNeededResult[] $VALUES = null;
        public static final FrameNeededResult ABORT = null;
        public static final FrameNeededResult NOT_REQUIRED = null;
        public static final FrameNeededResult REQUIRED = null;
        public static final FrameNeededResult SKIP = null;

        private FrameNeededResult(String $enum$name, int $enum$ordinal) {
        }

        public static FrameNeededResult valueOf(String name) {
        }

        public static FrameNeededResult[] values() {
        }
    }

    public AnimatedImageCompositor(AnimatedDrawableBackend animatedDrawableBackend, Callback callback) {
    }

    private void disposeToBackground(Canvas canvas, AnimatedDrawableFrameInfo frameInfo) {
    }

    private FrameNeededResult isFrameNeededForRendering(int index) {
    }

    private boolean isFullFrame(AnimatedDrawableFrameInfo frameInfo) {
    }

    private boolean isKeyFrame(int index) {
    }

    private void maybeApplyTransformation(Bitmap bitmap) {
    }

    private int prepareCanvasWithClosestCachedFrame(int previousFrameNumber, Canvas canvas) {
    }

    public void renderFrame(int frameNumber, Bitmap bitmap) {
    }
}
