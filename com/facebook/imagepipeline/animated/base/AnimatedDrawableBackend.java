package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.facebook.common.references.CloseableReference;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface AnimatedDrawableBackend {
    void dropCaches();

    AnimatedDrawableBackend forNewBounds(@Nullable Rect bounds);

    AnimatedImageResult getAnimatedImageResult();

    int getDurationMs();

    int getDurationMsForFrame(int frameNumber);

    int getFrameCount();

    int getFrameForPreview();

    int getFrameForTimestampMs(int timestampMs);

    AnimatedDrawableFrameInfo getFrameInfo(int frameNumber);

    int getHeight();

    int getLoopCount();

    int getMemoryUsage();

    @Nullable
    CloseableReference<Bitmap> getPreDecodedFrame(int frameNumber);

    int getRenderedHeight();

    int getRenderedWidth();

    int getTimestampMsForFrame(int frameNumber);

    int getWidth();

    boolean hasPreDecodedFrame(int frameNumber);

    void renderFrame(int frameNumber, Canvas canvas);
}
