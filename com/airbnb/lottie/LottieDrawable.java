package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.manager.FontAssetManager;
import com.airbnb.lottie.manager.ImageAssetManager;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.layer.CompositionLayer;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    private static final String TAG = null;
    private int alpha;
    private final LottieValueAnimator animator;
    private final Set<ColorFilterData> colorFilterData;
    private LottieComposition composition;
    @Nullable
    private CompositionLayer compositionLayer;
    private boolean enableMergePaths;
    @Nullable
    public FontAssetDelegate fontAssetDelegate;
    @Nullable
    private FontAssetManager fontAssetManager;
    @Nullable
    private ImageAssetDelegate imageAssetDelegate;
    @Nullable
    private ImageAssetManager imageAssetManager;
    @Nullable
    private String imageAssetsFolder;
    private boolean isApplyingOpacityToLayersEnabled;
    private boolean isDirty;
    private boolean isExtraScaleEnabled;
    private final ArrayList<LazyCompositionTask> lazyCompositionTasks;
    private final Matrix matrix;
    private boolean performanceTrackingEnabled;
    private final ValueAnimator.AnimatorUpdateListener progressUpdateListener;
    private boolean safeMode;
    private float scale;
    @Nullable
    private ImageView.ScaleType scaleType;
    private boolean systemAnimationsEnabled;
    @Nullable
    public TextDelegate textDelegate;

    /* renamed from: com.airbnb.lottie.LottieDrawable$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ LottieDrawable this$0;

        public AnonymousClass1(LottieDrawable lottieDrawable) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass10 implements LazyCompositionTask {
        public final /* synthetic */ LottieDrawable this$0;
        public final /* synthetic */ String val$markerName;

        public AnonymousClass10(LottieDrawable lottieDrawable, String str) {
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        public void run(LottieComposition lottieComposition) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass11 implements LazyCompositionTask {
        public final /* synthetic */ LottieDrawable this$0;
        public final /* synthetic */ String val$endMarkerName;
        public final /* synthetic */ boolean val$playEndMarkerStartFrame;
        public final /* synthetic */ String val$startMarkerName;

        public AnonymousClass11(LottieDrawable lottieDrawable, String str, String str2, boolean z) {
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        public void run(LottieComposition lottieComposition) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass12 implements LazyCompositionTask {
        public final /* synthetic */ LottieDrawable this$0;
        public final /* synthetic */ int val$maxFrame;
        public final /* synthetic */ int val$minFrame;

        public AnonymousClass12(LottieDrawable lottieDrawable, int i2, int i3) {
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        public void run(LottieComposition lottieComposition) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass13 implements LazyCompositionTask {
        public final /* synthetic */ LottieDrawable this$0;
        public final /* synthetic */ float val$maxProgress;
        public final /* synthetic */ float val$minProgress;

        public AnonymousClass13(LottieDrawable lottieDrawable, float f2, float f3) {
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        public void run(LottieComposition lottieComposition) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass14 implements LazyCompositionTask {
        public final /* synthetic */ LottieDrawable this$0;
        public final /* synthetic */ int val$frame;

        public AnonymousClass14(LottieDrawable lottieDrawable, int i2) {
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        public void run(LottieComposition lottieComposition) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass15 implements LazyCompositionTask {
        public final /* synthetic */ LottieDrawable this$0;
        public final /* synthetic */ float val$progress;

        public AnonymousClass15(LottieDrawable lottieDrawable, float f2) {
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        public void run(LottieComposition lottieComposition) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass16 implements LazyCompositionTask {
        public final /* synthetic */ LottieDrawable this$0;
        public final /* synthetic */ LottieValueCallback val$callback;
        public final /* synthetic */ KeyPath val$keyPath;
        public final /* synthetic */ Object val$property;

        public AnonymousClass16(LottieDrawable lottieDrawable, KeyPath keyPath, Object obj, LottieValueCallback lottieValueCallback) {
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        public void run(LottieComposition lottieComposition) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.airbnb.lottie.LottieDrawable$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass17<T> extends LottieValueCallback<T> {
        public final /* synthetic */ LottieDrawable this$0;
        public final /* synthetic */ SimpleLottieValueCallback val$callback;

        public AnonymousClass17(LottieDrawable lottieDrawable, SimpleLottieValueCallback simpleLottieValueCallback) {
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements LazyCompositionTask {
        public final /* synthetic */ LottieDrawable this$0;

        public AnonymousClass2(LottieDrawable lottieDrawable) {
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        public void run(LottieComposition lottieComposition) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements LazyCompositionTask {
        public final /* synthetic */ LottieDrawable this$0;

        public AnonymousClass3(LottieDrawable lottieDrawable) {
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        public void run(LottieComposition lottieComposition) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements LazyCompositionTask {
        public final /* synthetic */ LottieDrawable this$0;
        public final /* synthetic */ int val$minFrame;

        public AnonymousClass4(LottieDrawable lottieDrawable, int i2) {
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        public void run(LottieComposition lottieComposition) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements LazyCompositionTask {
        public final /* synthetic */ LottieDrawable this$0;
        public final /* synthetic */ float val$minProgress;

        public AnonymousClass5(LottieDrawable lottieDrawable, float f2) {
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        public void run(LottieComposition lottieComposition) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass6 implements LazyCompositionTask {
        public final /* synthetic */ LottieDrawable this$0;
        public final /* synthetic */ int val$maxFrame;

        public AnonymousClass6(LottieDrawable lottieDrawable, int i2) {
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        public void run(LottieComposition lottieComposition) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass7 implements LazyCompositionTask {
        public final /* synthetic */ LottieDrawable this$0;
        public final /* synthetic */ float val$maxProgress;

        public AnonymousClass7(LottieDrawable lottieDrawable, float f2) {
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        public void run(LottieComposition lottieComposition) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass8 implements LazyCompositionTask {
        public final /* synthetic */ LottieDrawable this$0;
        public final /* synthetic */ String val$markerName;

        public AnonymousClass8(LottieDrawable lottieDrawable, String str) {
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        public void run(LottieComposition lottieComposition) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass9 implements LazyCompositionTask {
        public final /* synthetic */ LottieDrawable this$0;
        public final /* synthetic */ String val$markerName;

        public AnonymousClass9(LottieDrawable lottieDrawable, String str) {
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        public void run(LottieComposition lottieComposition) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ColorFilterData {
        @Nullable
        public final ColorFilter colorFilter;
        @Nullable
        public final String contentName;
        public final String layerName;

        public ColorFilterData(@Nullable String str, @Nullable String str2, @Nullable ColorFilter colorFilter) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface LazyCompositionTask {
        void run(LottieComposition lottieComposition);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface RepeatMode {
    }

    public static /* synthetic */ CompositionLayer access$000(LottieDrawable lottieDrawable) {
    }

    public static /* synthetic */ LottieValueAnimator access$100(LottieDrawable lottieDrawable) {
    }

    private void buildCompositionLayer() {
    }

    private void drawInternal(@NonNull Canvas canvas) {
    }

    private void drawWithNewAspectRatio(Canvas canvas) {
    }

    private void drawWithOriginalAspectRatio(Canvas canvas) {
    }

    @Nullable
    private Context getContext() {
    }

    private FontAssetManager getFontAssetManager() {
    }

    private ImageAssetManager getImageAssetManager() {
    }

    private float getMaxScale(@NonNull Canvas canvas) {
    }

    private void updateBounds() {
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, LottieValueCallback<T> lottieValueCallback) {
    }

    public void cancelAnimation() {
    }

    public void clearComposition() {
    }

    public void disableExtraScaleModeInFitXY() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    public boolean enableMergePathsForKitKatAndAbove() {
    }

    @MainThread
    public void endAnimation() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    public LottieComposition getComposition() {
    }

    public int getFrame() {
    }

    @Nullable
    public Bitmap getImageAsset(String str) {
    }

    @Nullable
    public String getImageAssetsFolder() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    public float getMaxFrame() {
    }

    public float getMinFrame() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
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

    @Nullable
    public TextDelegate getTextDelegate() {
    }

    @Nullable
    public Typeface getTypeface(String str, String str2) {
    }

    public boolean hasMasks() {
    }

    public boolean hasMatte() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
    }

    public boolean isAnimating() {
    }

    public boolean isApplyingOpacityToLayersEnabled() {
    }

    public boolean isLooping() {
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
    }

    @Deprecated
    public void loop(boolean z) {
    }

    public void pauseAnimation() {
    }

    @MainThread
    public void playAnimation() {
    }

    public void removeAllAnimatorListeners() {
    }

    public void removeAllUpdateListeners() {
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
    }

    public void removeAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
    }

    public List<KeyPath> resolveKeyPath(KeyPath keyPath) {
    }

    @MainThread
    public void resumeAnimation() {
    }

    public void reverseAnimationSpeed() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i2) {
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public boolean setComposition(LottieComposition lottieComposition) {
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
    }

    public void setFrame(int i2) {
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
    }

    public void setImagesAssetsFolder(@Nullable String str) {
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

    public void setRepeatCount(int i2) {
    }

    public void setRepeatMode(int i2) {
    }

    public void setSafeMode(boolean z) {
    }

    public void setScale(float f2) {
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public void setSpeed(float f2) {
    }

    public void setSystemAnimationsAreEnabled(Boolean bool) {
    }

    public void setTextDelegate(TextDelegate textDelegate) {
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
    }

    public boolean useTextGlyphs() {
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
    }

    public void setMaxFrame(String str) {
    }

    public void setMinFrame(String str) {
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, SimpleLottieValueCallback<T> simpleLottieValueCallback) {
    }

    public void setMinAndMaxFrame(int i2, int i3) {
    }
}
