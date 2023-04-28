package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import com.facebook.fresco.ui.common.OnFadeListener;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FadeDrawable extends ArrayDrawable {
    @VisibleForTesting
    public static final int TRANSITION_NONE = 2;
    @VisibleForTesting
    public static final int TRANSITION_RUNNING = 1;
    @VisibleForTesting
    public static final int TRANSITION_STARTING = 0;
    private final int mActualImageLayer;
    @VisibleForTesting
    public int mAlpha;
    @VisibleForTesting
    public int[] mAlphas;
    private final int mDefaultLayerAlpha;
    private final boolean mDefaultLayerIsOn;
    @VisibleForTesting
    public int mDurationMs;
    private boolean mIsFadingActualImage;
    @VisibleForTesting
    public boolean[] mIsLayerOn;
    private final Drawable[] mLayers;
    private boolean mMutateDrawables;
    @Nullable
    private OnFadeListener mOnFadeListener;
    private boolean mOnFadeListenerShowImmediately;
    @VisibleForTesting
    public int mPreventInvalidateCount;
    @VisibleForTesting
    public int[] mStartAlphas;
    @VisibleForTesting
    public long mStartTimeMs;
    @VisibleForTesting
    public int mTransitionState;

    public FadeDrawable(Drawable[] layers) {
    }

    private void drawDrawableWithAlpha(Canvas canvas, Drawable drawable, int alpha) {
    }

    private void maybeOnFadeFinished() {
    }

    private void maybeOnFadeStarted() {
    }

    private void maybeOnImageShownImmediately() {
    }

    private void resetInternal() {
    }

    private boolean updateAlphas(float ratio) {
    }

    public void beginBatchMode() {
    }

    @Override // com.facebook.drawee.drawable.ArrayDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    public void endBatchMode() {
    }

    public void fadeInAllLayers() {
    }

    public void fadeInLayer(int index) {
    }

    public void fadeOutAllLayers() {
    }

    public void fadeOutLayer(int index) {
    }

    public void fadeToLayer(int index) {
    }

    public void fadeUpToLayer(int index) {
    }

    public void finishTransitionImmediately() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    public long getCurrentTimeMs() {
    }

    public int getTransitionDuration() {
    }

    @VisibleForTesting
    public int getTransitionState() {
    }

    public void hideLayerImmediately(int index) {
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
    }

    public boolean isDefaultLayerIsOn() {
    }

    public boolean isLayerOn(int index) {
    }

    public void reset() {
    }

    @Override // com.facebook.drawee.drawable.ArrayDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    public void setMutateDrawables(boolean mutateDrawables) {
    }

    public void setOnFadeListener(@Nullable OnFadeListener onFadeListener) {
    }

    public void setTransitionDuration(int durationMs) {
    }

    public void showLayerImmediately(int index) {
    }

    public FadeDrawable(Drawable[] layers, boolean allLayersVisible, int actualImageLayer) {
    }
}
