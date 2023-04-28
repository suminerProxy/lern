package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.circularreveal.CircularRevealHelper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface CircularRevealWidget extends CircularRevealHelper.Delegate {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CircularRevealEvaluator implements TypeEvaluator<RevealInfo> {
        public static final TypeEvaluator<RevealInfo> CIRCULAR_REVEAL = null;
        private final RevealInfo revealInfo;

        @Override // android.animation.TypeEvaluator
        @NonNull
        public /* bridge */ /* synthetic */ RevealInfo evaluate(float f2, @NonNull RevealInfo revealInfo, @NonNull RevealInfo revealInfo2) {
        }

        @NonNull
        /* renamed from: evaluate  reason: avoid collision after fix types in other method */
        public RevealInfo evaluate2(float f2, @NonNull RevealInfo revealInfo, @NonNull RevealInfo revealInfo2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CircularRevealProperty extends Property<CircularRevealWidget, RevealInfo> {
        public static final Property<CircularRevealWidget, RevealInfo> CIRCULAR_REVEAL = null;

        private CircularRevealProperty(String str) {
        }

        @Override // android.util.Property
        @Nullable
        public /* bridge */ /* synthetic */ RevealInfo get(@NonNull CircularRevealWidget circularRevealWidget) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(@NonNull CircularRevealWidget circularRevealWidget, @Nullable RevealInfo revealInfo) {
        }

        @Nullable
        /* renamed from: get  reason: avoid collision after fix types in other method */
        public RevealInfo get2(@NonNull CircularRevealWidget circularRevealWidget) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(@NonNull CircularRevealWidget circularRevealWidget, @Nullable RevealInfo revealInfo) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CircularRevealScrimColorProperty extends Property<CircularRevealWidget, Integer> {
        public static final Property<CircularRevealWidget, Integer> CIRCULAR_REVEAL_SCRIM_COLOR = null;

        private CircularRevealScrimColorProperty(String str) {
        }

        @Override // android.util.Property
        @NonNull
        public /* bridge */ /* synthetic */ Integer get(@NonNull CircularRevealWidget circularRevealWidget) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(@NonNull CircularRevealWidget circularRevealWidget, @NonNull Integer num) {
        }

        @NonNull
        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Integer get2(@NonNull CircularRevealWidget circularRevealWidget) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(@NonNull CircularRevealWidget circularRevealWidget, @NonNull Integer num) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class RevealInfo {
        public static final float INVALID_RADIUS = Float.MAX_VALUE;
        public float centerX;
        public float centerY;
        public float radius;

        public /* synthetic */ RevealInfo(AnonymousClass1 anonymousClass1) {
        }

        public boolean isInvalid() {
        }

        public void set(float f2, float f3, float f4) {
        }

        private RevealInfo() {
        }

        public RevealInfo(float f2, float f3, float f4) {
        }

        public void set(@NonNull RevealInfo revealInfo) {
        }

        public RevealInfo(@NonNull RevealInfo revealInfo) {
        }
    }

    void buildCircularRevealCache();

    void destroyCircularRevealCache();

    void draw(Canvas canvas);

    @Nullable
    Drawable getCircularRevealOverlayDrawable();

    @ColorInt
    int getCircularRevealScrimColor();

    @Nullable
    RevealInfo getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@Nullable Drawable drawable);

    void setCircularRevealScrimColor(@ColorInt int i2);

    void setRevealInfo(@Nullable RevealInfo revealInfo);
}
