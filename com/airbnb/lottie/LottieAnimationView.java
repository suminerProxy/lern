package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final LottieListener<Throwable> DEFAULT_FAILURE_LISTENER = null;
    private static final String TAG = null;
    private String animationName;
    @RawRes
    private int animationResId;
    private boolean autoPlay;
    private int buildDrawingCacheDepth;
    private boolean cacheComposition;
    @Nullable
    private LottieComposition composition;
    @Nullable
    private LottieTask<LottieComposition> compositionTask;
    @Nullable
    private LottieListener<Throwable> failureListener;
    @DrawableRes
    private int fallbackResource;
    private boolean isInitialized;
    private final LottieListener<LottieComposition> loadedListener;
    private final LottieDrawable lottieDrawable;
    private Set<LottieOnCompositionLoadedListener> lottieOnCompositionLoadedListeners;
    private boolean playAnimationWhenShown;
    private RenderMode renderMode;
    private boolean wasAnimatingWhenDetached;
    private boolean wasAnimatingWhenNotShown;
    private final LottieListener<Throwable> wrappedFailureListener;

    /* renamed from: com.airbnb.lottie.LottieAnimationView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements LottieListener<Throwable> {
        @Override // com.airbnb.lottie.LottieListener
        public /* bridge */ /* synthetic */ void onResult(Throwable th) {
        }

        /* renamed from: onResult  reason: avoid collision after fix types in other method */
        public void onResult2(Throwable th) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements LottieListener<LottieComposition> {
        public final /* synthetic */ LottieAnimationView this$0;

        public AnonymousClass2(LottieAnimationView lottieAnimationView) {
        }

        @Override // com.airbnb.lottie.LottieListener
        public /* bridge */ /* synthetic */ void onResult(LottieComposition lottieComposition) {
        }

        /* renamed from: onResult  reason: avoid collision after fix types in other method */
        public void onResult2(LottieComposition lottieComposition) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements LottieListener<Throwable> {
        public final /* synthetic */ LottieAnimationView this$0;

        public AnonymousClass3(LottieAnimationView lottieAnimationView) {
        }

        @Override // com.airbnb.lottie.LottieListener
        public /* bridge */ /* synthetic */ void onResult(Throwable th) {
        }

        /* renamed from: onResult  reason: avoid collision after fix types in other method */
        public void onResult2(Throwable th) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ LottieAnimationView this$0;
        public final /* synthetic */ int val$rawRes;

        public AnonymousClass4(LottieAnimationView lottieAnimationView, int i2) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ LottieResult<LottieComposition> call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public LottieResult<LottieComposition> call() throws Exception {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ LottieAnimationView this$0;
        public final /* synthetic */ String val$assetName;

        public AnonymousClass5(LottieAnimationView lottieAnimationView, String str) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ LottieResult<LottieComposition> call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public LottieResult<LottieComposition> call() throws Exception {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.airbnb.lottie.LottieAnimationView$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass6<T> extends LottieValueCallback<T> {
        public final /* synthetic */ LottieAnimationView this$0;
        public final /* synthetic */ SimpleLottieValueCallback val$callback;

        public AnonymousClass6(LottieAnimationView lottieAnimationView, SimpleLottieValueCallback simpleLottieValueCallback) {
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass7 {
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$RenderMode = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public String animationName;
        public int animationResId;
        public String imageAssetsFolder;
        public boolean isAnimating;
        public float progress;
        public int repeatCount;
        public int repeatMode;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState[] newArray(int i2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, AnonymousClass1 anonymousClass1) {
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public SavedState(Parcelable parcelable) {
        }

        private SavedState(Parcel parcel) {
        }
    }

    public LottieAnimationView(Context context) {
    }

    public static /* synthetic */ int access$000(LottieAnimationView lottieAnimationView) {
    }

    public static /* synthetic */ LottieListener access$100(LottieAnimationView lottieAnimationView) {
    }

    public static /* synthetic */ LottieListener access$200() {
    }

    public static /* synthetic */ boolean access$300(LottieAnimationView lottieAnimationView) {
    }

    private void cancelLoaderTask() {
    }

    private void clearComposition() {
    }

    private void enableOrDisableHardwareLayer() {
    }

    private LottieTask<LottieComposition> fromAssets(String str) {
    }

    private LottieTask<LottieComposition> fromRawRes(@RawRes int i2) {
    }

    private void init(@Nullable AttributeSet attributeSet, @AttrRes int i2) {
    }

    private void setCompositionTask(LottieTask<LottieComposition> lottieTask) {
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
    }

    public boolean addLottieOnCompositionLoadedListener(@NonNull LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, LottieValueCallback<T> lottieValueCallback) {
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
    }

    @MainThread
    public void cancelAnimation() {
    }

    public void disableExtraScaleModeInFitXY() {
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
    }

    @Nullable
    public LottieComposition getComposition() {
    }

    public long getDuration() {
    }

    public int getFrame() {
    }

    @Nullable
    public String getImageAssetsFolder() {
    }

    public float getMaxFrame() {
    }

    public float getMinFrame() {
    }

    @Nullable
    public PerformanceTracker getPerformanceTracker() {
    }

    @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
    public float getProgress() {
    }

    public int getRepeatCount() {
    }

    public int getRepeatMode() {
    }

    public float getScale() {
    }

    public float getSpeed() {
    }

    public boolean hasMasks() {
    }

    public boolean hasMatte() {
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
    }

    public boolean isAnimating() {
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
    }

    @Deprecated
    public void loop(boolean z) {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i2) {
    }

    @MainThread
    public void pauseAnimation() {
    }

    @MainThread
    public void playAnimation() {
    }

    public void removeAllAnimatorListeners() {
    }

    public void removeAllLottieOnCompositionLoadedListener() {
    }

    public void removeAllUpdateListeners() {
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
    }

    public boolean removeLottieOnCompositionLoadedListener(@NonNull LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
    }

    public List<KeyPath> resolveKeyPath(KeyPath keyPath) {
    }

    @MainThread
    public void resumeAnimation() {
    }

    public void reverseAnimationSpeed() {
    }

    public void setAnimation(@RawRes int i2) {
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
    }

    public void setAnimationFromUrl(String str) {
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
    }

    public void setCacheComposition(boolean z) {
    }

    public void setComposition(@NonNull LottieComposition lottieComposition) {
    }

    public void setFailureListener(@Nullable LottieListener<Throwable> lottieListener) {
    }

    public void setFallbackResource(@DrawableRes int i2) {
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
    }

    public void setFrame(int i2) {
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
    }

    public void setImageAssetsFolder(String str) {
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i2) {
    }

    public void setMaxFrame(int i2) {
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    public void setMinAndMaxFrame(String str) {
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3) {
    }

    public void setMinFrame(int i2) {
    }

    public void setMinProgress(float f2) {
    }

    public void setPerformanceTrackingEnabled(boolean z) {
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    public void setRenderMode(RenderMode renderMode) {
    }

    public void setRepeatCount(int i2) {
    }

    public void setRepeatMode(int i2) {
    }

    public void setSafeMode(boolean z) {
    }

    public void setScale(float f2) {
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public void setSpeed(float f2) {
    }

    public void setTextDelegate(TextDelegate textDelegate) {
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, SimpleLottieValueCallback<T> simpleLottieValueCallback) {
    }

    public void setAnimationFromJson(String str, @Nullable String str2) {
    }

    public void setMaxFrame(String str) {
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
    }

    public void setMinFrame(String str) {
    }

    public void setMinAndMaxFrame(int i2, int i3) {
    }

    public void setAnimation(String str) {
    }

    public void setAnimationFromUrl(String str, @Nullable String str2) {
    }

    public void setAnimation(InputStream inputStream, @Nullable String str) {
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i2) {
    }
}
