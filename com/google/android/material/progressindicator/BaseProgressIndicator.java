package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BaseProgressIndicator<S extends BaseProgressIndicatorSpec> extends ProgressBar {
    public static final float DEFAULT_OPACITY = 0.2f;
    public static final int DEF_STYLE_RES = 0;
    public static final int HIDE_INWARD = 2;
    public static final int HIDE_NONE = 0;
    public static final int HIDE_OUTWARD = 1;
    public static final int MAX_ALPHA = 255;
    public static final int MAX_HIDE_DELAY = 1000;
    public static final int SHOW_INWARD = 2;
    public static final int SHOW_NONE = 0;
    public static final int SHOW_OUTWARD = 1;
    public AnimatorDurationScaleProvider animatorDurationScaleProvider;
    private final Runnable delayedHide;
    private final Runnable delayedShow;
    private final Animatable2Compat.AnimationCallback hideAnimationCallback;
    private boolean isIndeterminateModeChangeRequested;
    private boolean isParentDoneInitializing;
    private long lastShowStartTime;
    private final int minHideDelay;
    private final int showDelay;
    public S spec;
    private int storedProgress;
    private boolean storedProgressAnimated;
    private final Animatable2Compat.AnimationCallback switchIndeterminateModeCallback;
    private int visibilityAfterHide;

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ BaseProgressIndicator this$0;

        public AnonymousClass1(BaseProgressIndicator baseProgressIndicator) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ BaseProgressIndicator this$0;

        public AnonymousClass2(BaseProgressIndicator baseProgressIndicator) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends Animatable2Compat.AnimationCallback {
        public final /* synthetic */ BaseProgressIndicator this$0;

        public AnonymousClass3(BaseProgressIndicator baseProgressIndicator) {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 extends Animatable2Compat.AnimationCallback {
        public final /* synthetic */ BaseProgressIndicator this$0;

        public AnonymousClass4(BaseProgressIndicator baseProgressIndicator) {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface HideAnimationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface ShowAnimationBehavior {
    }

    public BaseProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
    }

    public static /* synthetic */ void access$000(BaseProgressIndicator baseProgressIndicator) {
    }

    public static /* synthetic */ void access$100(BaseProgressIndicator baseProgressIndicator) {
    }

    public static /* synthetic */ long access$202(BaseProgressIndicator baseProgressIndicator, long j2) {
    }

    public static /* synthetic */ int access$300(BaseProgressIndicator baseProgressIndicator) {
    }

    public static /* synthetic */ boolean access$400(BaseProgressIndicator baseProgressIndicator) {
    }

    public static /* synthetic */ boolean access$500(BaseProgressIndicator baseProgressIndicator) {
    }

    public static /* synthetic */ int access$600(BaseProgressIndicator baseProgressIndicator) {
    }

    @Nullable
    private DrawingDelegate<S> getCurrentDrawingDelegate() {
    }

    private void internalHide() {
    }

    private void internalShow() {
    }

    private boolean isNoLongerNeedToBeVisible() {
    }

    private void registerAnimationCallbacks() {
    }

    private void unregisterAnimationCallbacks() {
    }

    public void applyNewVisibility(boolean z) {
    }

    public abstract S createSpec(@NonNull Context context, @NonNull AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    @Nullable
    public Drawable getCurrentDrawable() {
    }

    public int getHideAnimationBehavior() {
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public /* bridge */ /* synthetic */ Drawable getIndeterminateDrawable() {
    }

    @NonNull
    public int[] getIndicatorColor() {
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public /* bridge */ /* synthetic */ Drawable getProgressDrawable() {
    }

    public int getShowAnimationBehavior() {
    }

    @ColorInt
    public int getTrackColor() {
    }

    @Px
    public int getTrackCornerRadius() {
    }

    @Px
    public int getTrackThickness() {
    }

    public void hide() {
    }

    @Override // android.view.View
    public void invalidate() {
    }

    public boolean isEffectivelyVisible() {
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(@NonNull Canvas canvas) {
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i2) {
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull AnimatorDurationScaleProvider animatorDurationScaleProvider) {
    }

    public void setHideAnimationBehavior(int i2) {
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i2) {
    }

    public void setProgressCompat(int i2, boolean z) {
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
    }

    public void setShowAnimationBehavior(int i2) {
    }

    public void setTrackColor(@ColorInt int i2) {
    }

    public void setTrackCornerRadius(@Px int i2) {
    }

    public void setTrackThickness(@Px int i2) {
    }

    public void setVisibilityAfterHide(int i2) {
    }

    public void show() {
    }

    public boolean visibleToUser() {
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public IndeterminateDrawable<S> getIndeterminateDrawable() {
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public DeterminateDrawable<S> getProgressDrawable() {
    }
}
