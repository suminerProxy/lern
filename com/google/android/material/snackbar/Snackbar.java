package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] SNACKBAR_BUTTON_STYLE_ATTR = null;
    private static final int[] SNACKBAR_CONTENT_STYLE_ATTRS = null;
    @Nullable
    private final AccessibilityManager accessibilityManager;
    @Nullable
    private BaseTransientBottomBar.BaseCallback<Snackbar> callback;
    private boolean hasAction;

    /* renamed from: com.google.android.material.snackbar.Snackbar$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ Snackbar this$0;
        public final /* synthetic */ View.OnClickListener val$listener;

        public AnonymousClass1(Snackbar snackbar, View.OnClickListener onClickListener) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Callback extends BaseTransientBottomBar.BaseCallback<Snackbar> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        /* renamed from: onDismissed  reason: avoid collision after fix types in other method */
        public void onDismissed2(Snackbar snackbar, int i2) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public /* bridge */ /* synthetic */ void onDismissed(Snackbar snackbar, int i2) {
        }

        /* renamed from: onShown  reason: avoid collision after fix types in other method */
        public void onShown2(Snackbar snackbar) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public /* bridge */ /* synthetic */ void onShown(Snackbar snackbar) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i2, int i3) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@Nullable Drawable drawable) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@Nullable Drawable drawable) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
        }
    }

    private Snackbar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull ContentViewCallback contentViewCallback) {
    }

    @Nullable
    private static ViewGroup findSuitableParent(View view) {
    }

    @Deprecated
    public static boolean hasSnackbarButtonStyleAttr(@NonNull Context context) {
    }

    private static boolean hasSnackbarContentStyleAttrs(@NonNull Context context) {
    }

    @NonNull
    public static Snackbar make(@NonNull View view, @NonNull CharSequence charSequence, int i2) {
    }

    @NonNull
    private static Snackbar makeInternal(@Nullable Context context, @NonNull View view, @NonNull CharSequence charSequence, int i2) {
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void dismiss() {
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int getDuration() {
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean isShown() {
    }

    @NonNull
    public Snackbar setAction(@StringRes int i2, View.OnClickListener onClickListener) {
    }

    @NonNull
    public Snackbar setActionTextColor(ColorStateList colorStateList) {
    }

    @NonNull
    public Snackbar setBackgroundTint(@ColorInt int i2) {
    }

    @NonNull
    public Snackbar setBackgroundTintList(@Nullable ColorStateList colorStateList) {
    }

    @NonNull
    public Snackbar setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
    }

    @NonNull
    @Deprecated
    public Snackbar setCallback(@Nullable Callback callback) {
    }

    @NonNull
    public Snackbar setMaxInlineActionWidth(@Dimension int i2) {
    }

    @NonNull
    public Snackbar setText(@NonNull CharSequence charSequence) {
    }

    @NonNull
    public Snackbar setTextColor(ColorStateList colorStateList) {
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void show() {
    }

    @NonNull
    public static Snackbar make(@NonNull Context context, @NonNull View view, @NonNull CharSequence charSequence, int i2) {
    }

    @NonNull
    public Snackbar setAction(@Nullable CharSequence charSequence, @Nullable View.OnClickListener onClickListener) {
    }

    @NonNull
    public static Snackbar make(@NonNull View view, @StringRes int i2, int i3) {
    }

    @NonNull
    public Snackbar setActionTextColor(@ColorInt int i2) {
    }

    @NonNull
    public Snackbar setText(@StringRes int i2) {
    }

    @NonNull
    public Snackbar setTextColor(@ColorInt int i2) {
    }
}
