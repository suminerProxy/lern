package com.facebook.fresco.animation.backend;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimationBackendDelegate<T extends AnimationBackend> implements AnimationBackend {
    private static final int ALPHA_UNSET = -1;
    @IntRange(from = -1, to = 255)
    private int mAlpha = -1;
    @Nullable
    private T mAnimationBackend;
    @Nullable
    private Rect mBounds;
    @Nullable
    private ColorFilter mColorFilter;

    public AnimationBackendDelegate(@Nullable T animationBackend) {
        this.mAnimationBackend = animationBackend;
    }

    @SuppressLint({"Range"})
    private void applyBackendProperties(AnimationBackend backend) {
        Rect rect = this.mBounds;
        if (rect != null) {
            backend.setBounds(rect);
        }
        int i2 = this.mAlpha;
        if (i2 >= 0 && i2 <= 255) {
            backend.setAlpha(i2);
        }
        ColorFilter colorFilter = this.mColorFilter;
        if (colorFilter != null) {
            backend.setColorFilter(colorFilter);
        }
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public void clear() {
        T t = this.mAnimationBackend;
        if (t != null) {
            t.clear();
        }
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public boolean drawFrame(Drawable parent, Canvas canvas, int frameNumber) {
        T t = this.mAnimationBackend;
        return t != null && t.drawFrame(parent, canvas, frameNumber);
    }

    @Nullable
    public T getAnimationBackend() {
        return this.mAnimationBackend;
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public int getFrameCount() {
        T t = this.mAnimationBackend;
        if (t == null) {
            return 0;
        }
        return t.getFrameCount();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public int getFrameDurationMs(int frameNumber) {
        T t = this.mAnimationBackend;
        if (t == null) {
            return 0;
        }
        return t.getFrameDurationMs(frameNumber);
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public int getIntrinsicHeight() {
        T t = this.mAnimationBackend;
        if (t == null) {
            return -1;
        }
        return t.getIntrinsicHeight();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public int getIntrinsicWidth() {
        T t = this.mAnimationBackend;
        if (t == null) {
            return -1;
        }
        return t.getIntrinsicWidth();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public int getLoopCount() {
        T t = this.mAnimationBackend;
        if (t == null) {
            return 0;
        }
        return t.getLoopCount();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public int getSizeInBytes() {
        T t = this.mAnimationBackend;
        if (t == null) {
            return 0;
        }
        return t.getSizeInBytes();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public void setAlpha(@IntRange(from = 0, to = 255) int alpha) {
        T t = this.mAnimationBackend;
        if (t != null) {
            t.setAlpha(alpha);
        }
        this.mAlpha = alpha;
    }

    public void setAnimationBackend(@Nullable T animationBackend) {
        this.mAnimationBackend = animationBackend;
        if (animationBackend != null) {
            applyBackendProperties(animationBackend);
        }
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public void setBounds(Rect bounds) {
        T t = this.mAnimationBackend;
        if (t != null) {
            t.setBounds(bounds);
        }
        this.mBounds = bounds;
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        T t = this.mAnimationBackend;
        if (t != null) {
            t.setColorFilter(colorFilter);
        }
        this.mColorFilter = colorFilter;
    }
}
