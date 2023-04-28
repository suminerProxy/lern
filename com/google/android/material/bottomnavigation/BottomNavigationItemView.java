package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import com.google.android.material.badge.BadgeDrawable;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class BottomNavigationItemView extends FrameLayout implements MenuView.ItemView {
    private static final int[] CHECKED_STATE_SET = null;
    public static final int INVALID_ITEM_POSITION = -1;
    @Nullable
    private BadgeDrawable badgeDrawable;
    private final int defaultMargin;
    private ImageView icon;
    @Nullable
    private ColorStateList iconTint;
    private boolean isShifting;
    @Nullable
    private MenuItemImpl itemData;
    private int itemPosition;
    private final ViewGroup labelGroup;
    private int labelVisibilityMode;
    private final TextView largeLabel;
    @Nullable
    private Drawable originalIconDrawable;
    private float scaleDownFactor;
    private float scaleUpFactor;
    private float shiftAmount;
    private final TextView smallLabel;
    @Nullable
    private Drawable wrappedIconDrawable;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationItemView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements View.OnLayoutChangeListener {
        public final /* synthetic */ BottomNavigationItemView this$0;

        public AnonymousClass1(BottomNavigationItemView bottomNavigationItemView) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        }
    }

    public BottomNavigationItemView(@NonNull Context context) {
    }

    public static /* synthetic */ ImageView access$000(BottomNavigationItemView bottomNavigationItemView) {
    }

    public static /* synthetic */ void access$100(BottomNavigationItemView bottomNavigationItemView, View view) {
    }

    private void calculateTextScaleFactors(float f2, float f3) {
    }

    @Nullable
    private FrameLayout getCustomParentForBadge(View view) {
    }

    private int getItemVisiblePosition() {
    }

    private boolean hasBadge() {
    }

    private static void setViewLayoutParams(@NonNull View view, int i2, int i3) {
    }

    private static void setViewScaleValues(@NonNull View view, float f2, float f3, int i2) {
    }

    private void tryAttachBadgeToAnchor(@Nullable View view) {
    }

    private void tryRemoveBadgeFromAnchor(@Nullable View view) {
    }

    private void tryUpdateBadgeBounds(View view) {
    }

    private static void updateViewPaddingBottom(@NonNull View view, int i2) {
    }

    @Nullable
    public BadgeDrawable getBadge() {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
    }

    public int getItemPosition() {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
    }

    public void removeBadge() {
    }

    public void setBadge(@NonNull BadgeDrawable badgeDrawable) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z) {
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
    }

    public void setIconSize(int i2) {
    }

    public void setIconTintList(ColorStateList colorStateList) {
    }

    public void setItemBackground(int i2) {
    }

    public void setItemPosition(int i2) {
    }

    public void setLabelVisibilityMode(int i2) {
    }

    public void setShifting(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(@StyleRes int i2) {
    }

    public void setTextAppearanceInactive(@StyleRes int i2) {
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
    }

    public BottomNavigationItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public BottomNavigationItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public void setItemBackground(@Nullable Drawable drawable) {
    }
}
