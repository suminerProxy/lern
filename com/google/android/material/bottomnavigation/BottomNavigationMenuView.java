package com.google.android.material.bottomnavigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.util.Pools;
import androidx.transition.TransitionSet;
import com.google.android.material.badge.BadgeDrawable;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class BottomNavigationMenuView extends ViewGroup implements MenuView {
    private static final long ACTIVE_ANIMATION_DURATION_MS = 115;
    private static final int[] CHECKED_STATE_SET = null;
    private static final int[] DISABLED_STATE_SET = null;
    private static final int ITEM_POOL_SIZE = 5;
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    @NonNull
    private SparseArray<BadgeDrawable> badgeDrawables;
    @Nullable
    private BottomNavigationItemView[] buttons;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private Drawable itemBackground;
    private int itemBackgroundRes;
    private final int itemHeight;
    private boolean itemHorizontalTranslationEnabled;
    @Dimension
    private int itemIconSize;
    private ColorStateList itemIconTint;
    private final Pools.Pool<BottomNavigationItemView> itemPool;
    @StyleRes
    private int itemTextAppearanceActive;
    @StyleRes
    private int itemTextAppearanceInactive;
    @Nullable
    private final ColorStateList itemTextColorDefault;
    private ColorStateList itemTextColorFromUser;
    private int labelVisibilityMode;
    private MenuBuilder menu;
    @NonNull
    private final View.OnClickListener onClickListener;
    @NonNull
    private final SparseArray<View.OnTouchListener> onTouchListeners;
    private BottomNavigationPresenter presenter;
    private int selectedItemId;
    private int selectedItemPosition;
    @NonNull
    private final TransitionSet set;
    private int[] tempChildWidths;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationMenuView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ BottomNavigationMenuView this$0;

        public AnonymousClass1(BottomNavigationMenuView bottomNavigationMenuView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public BottomNavigationMenuView(Context context) {
    }

    public static /* synthetic */ BottomNavigationPresenter access$000(BottomNavigationMenuView bottomNavigationMenuView) {
    }

    public static /* synthetic */ MenuBuilder access$100(BottomNavigationMenuView bottomNavigationMenuView) {
    }

    private BottomNavigationItemView getNewItem() {
    }

    private boolean isShifting(int i2, int i3) {
    }

    private boolean isValidId(int i2) {
    }

    private void removeUnusedBadges() {
    }

    private void setBadgeIfNeeded(@NonNull BottomNavigationItemView bottomNavigationItemView) {
    }

    private void validateMenuItemId(int i2) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void buildMenuView() {
    }

    @Nullable
    public ColorStateList createDefaultColorStateList(int i2) {
    }

    @Nullable
    @VisibleForTesting
    public BottomNavigationItemView findItemView(int i2) {
    }

    @Nullable
    public BadgeDrawable getBadge(int i2) {
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
    }

    @Nullable
    public ColorStateList getIconTintList() {
    }

    @Nullable
    public Drawable getItemBackground() {
    }

    @Deprecated
    public int getItemBackgroundRes() {
    }

    @Dimension
    public int getItemIconSize() {
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
    }

    public ColorStateList getItemTextColor() {
    }

    public int getLabelVisibilityMode() {
    }

    public BadgeDrawable getOrCreateBadge(int i2) {
    }

    public int getSelectedItemId() {
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(MenuBuilder menuBuilder) {
    }

    public boolean isItemHorizontalTranslationEnabled() {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void removeBadge(int i2) {
    }

    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
    }

    public void setIconTintList(ColorStateList colorStateList) {
    }

    public void setItemBackground(@Nullable Drawable drawable) {
    }

    public void setItemBackgroundRes(int i2) {
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
    }

    public void setItemIconSize(@Dimension int i2) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i2, @Nullable View.OnTouchListener onTouchListener) {
    }

    public void setItemTextAppearanceActive(@StyleRes int i2) {
    }

    public void setItemTextAppearanceInactive(@StyleRes int i2) {
    }

    public void setItemTextColor(ColorStateList colorStateList) {
    }

    public void setLabelVisibilityMode(int i2) {
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
    }

    public void tryRestoreSelectedItemId(int i2) {
    }

    public void updateMenuView() {
    }

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
    }
}
