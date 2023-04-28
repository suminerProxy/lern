package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.WindowInsetsCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ViewUtils {

    /* renamed from: com.google.android.material.internal.ViewUtils$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Runnable {
        public final /* synthetic */ View val$view;

        public AnonymousClass1(View view) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.internal.ViewUtils$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements OnApplyWindowInsetsListener {
        public final /* synthetic */ OnApplyWindowInsetsListener val$listener;
        public final /* synthetic */ boolean val$paddingBottomSystemWindowInsets;
        public final /* synthetic */ boolean val$paddingLeftSystemWindowInsets;
        public final /* synthetic */ boolean val$paddingRightSystemWindowInsets;

        public AnonymousClass2(boolean z, boolean z2, boolean z3, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        }

        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull RelativePadding relativePadding) {
        }
    }

    /* renamed from: com.google.android.material.internal.ViewUtils$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 implements androidx.core.view.OnApplyWindowInsetsListener {
        public final /* synthetic */ RelativePadding val$initialPadding;
        public final /* synthetic */ OnApplyWindowInsetsListener val$listener;

        public AnonymousClass3(OnApplyWindowInsetsListener onApplyWindowInsetsListener, RelativePadding relativePadding) {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        }
    }

    /* renamed from: com.google.android.material.internal.ViewUtils$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass4 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NonNull View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnApplyWindowInsetsListener {
        WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, RelativePadding relativePadding);
    }

    private ViewUtils() {
    }

    public static void addOnGlobalLayoutListener(@Nullable View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    public static void doOnApplyWindowInsets(@NonNull View view, @Nullable AttributeSet attributeSet, int i2, int i3) {
    }

    public static float dpToPx(@NonNull Context context, @Dimension(unit = 0) int i2) {
    }

    @Nullable
    public static ViewGroup getContentView(@Nullable View view) {
    }

    @Nullable
    public static ViewOverlayImpl getContentViewOverlay(@NonNull View view) {
    }

    @Nullable
    public static ViewOverlayImpl getOverlay(@Nullable View view) {
    }

    public static float getParentAbsoluteElevation(@NonNull View view) {
    }

    public static boolean isLayoutRtl(View view) {
    }

    public static PorterDuff.Mode parseTintMode(int i2, PorterDuff.Mode mode) {
    }

    public static void removeOnGlobalLayoutListener(@Nullable View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    public static void requestApplyInsetsWhenAttached(@NonNull View view) {
    }

    public static void requestFocusAndShowKeyboard(@NonNull View view) {
    }

    public static void doOnApplyWindowInsets(@NonNull View view, @Nullable AttributeSet attributeSet, int i2, int i3, @Nullable OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
    }

    public static void removeOnGlobalLayoutListener(@NonNull ViewTreeObserver viewTreeObserver, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;

        /* renamed from: top  reason: collision with root package name */
        public int f3355top;

        public RelativePadding(int i2, int i3, int i4, int i5) {
        }

        public void applyToView(View view) {
        }

        public RelativePadding(@NonNull RelativePadding relativePadding) {
        }
    }

    public static void doOnApplyWindowInsets(@NonNull View view, @NonNull OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
    }
}
