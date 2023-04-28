package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Dimension;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class NavigationMenuPresenter implements MenuPresenter {
    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HEADER = "android:menu:header";
    private static final String STATE_HIERARCHY = "android:menu:list";
    public NavigationMenuAdapter adapter;
    private MenuPresenter.Callback callback;
    public boolean hasCustomItemIconSize;
    public LinearLayout headerLayout;
    public ColorStateList iconTintList;
    private int id;
    public boolean isBehindStatusBar;
    public Drawable itemBackground;
    public int itemHorizontalPadding;
    public int itemIconPadding;
    public int itemIconSize;
    private int itemMaxLines;
    public LayoutInflater layoutInflater;
    public MenuBuilder menu;
    private NavigationMenuView menuView;
    public final View.OnClickListener onClickListener;
    private int overScrollMode;
    public int paddingSeparator;
    private int paddingTopDefault;
    public int textAppearance;
    public boolean textAppearanceSet;
    public ColorStateList textColor;

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ NavigationMenuPresenter this$0;

        public AnonymousClass1(NavigationMenuPresenter navigationMenuPresenter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class NavigationMenuAdapter extends RecyclerView.Adapter<ViewHolder> {
        private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
        private static final String STATE_CHECKED_ITEM = "android:menu:checked";
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private MenuItemImpl checkedItem;
        private final ArrayList<NavigationMenuItem> items;
        public final /* synthetic */ NavigationMenuPresenter this$0;
        private boolean updateSuspended;

        public NavigationMenuAdapter(NavigationMenuPresenter navigationMenuPresenter) {
        }

        private void appendTransparentIconIfMissing(int i2, int i3) {
        }

        private void prepareMenuItems() {
        }

        @NonNull
        public Bundle createInstanceState() {
        }

        public MenuItemImpl getCheckedItem() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i2) {
        }

        public int getRowCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull ViewHolder viewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @Nullable
        public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onViewRecycled(ViewHolder viewHolder) {
        }

        public void restoreInstanceState(@NonNull Bundle bundle) {
        }

        public void setCheckedItem(@NonNull MenuItemImpl menuItemImpl) {
        }

        public void setUpdateSuspended(boolean z) {
        }

        public void update() {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(@NonNull ViewHolder viewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @Nullable
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public ViewHolder onCreateViewHolder2(ViewGroup viewGroup, int i2) {
        }

        /* renamed from: onViewRecycled  reason: avoid collision after fix types in other method */
        public void onViewRecycled2(ViewHolder viewHolder) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class NavigationMenuHeaderItem implements NavigationMenuItem {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface NavigationMenuItem {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class NavigationMenuSeparatorItem implements NavigationMenuItem {
        private final int paddingBottom;
        private final int paddingTop;

        public NavigationMenuSeparatorItem(int i2, int i3) {
        }

        public int getPaddingBottom() {
        }

        public int getPaddingTop() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class NavigationMenuTextItem implements NavigationMenuItem {
        private final MenuItemImpl menuItem;
        public boolean needsEmptyIcon;

        public NavigationMenuTextItem(MenuItemImpl menuItemImpl) {
        }

        public MenuItemImpl getMenuItem() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class NavigationMenuViewAccessibilityDelegate extends RecyclerViewAccessibilityDelegate {
        public final /* synthetic */ NavigationMenuPresenter this$0;

        public NavigationMenuViewAccessibilityDelegate(@NonNull NavigationMenuPresenter navigationMenuPresenter, RecyclerView recyclerView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
        }
    }

    public static /* synthetic */ int access$000(NavigationMenuPresenter navigationMenuPresenter) {
    }

    private void updateTopPadding() {
    }

    public void addHeaderView(@NonNull View view) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
    }

    public void dispatchApplyWindowInsets(@NonNull WindowInsetsCompat windowInsetsCompat) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
    }

    @Nullable
    public MenuItemImpl getCheckedItem() {
    }

    public int getHeaderCount() {
    }

    public View getHeaderView(int i2) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
    }

    @Nullable
    public Drawable getItemBackground() {
    }

    public int getItemHorizontalPadding() {
    }

    public int getItemIconPadding() {
    }

    public int getItemMaxLines() {
    }

    @Nullable
    public ColorStateList getItemTextColor() {
    }

    @Nullable
    public ColorStateList getItemTintList() {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
    }

    public View inflateHeaderView(@LayoutRes int i2) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
    }

    public boolean isBehindStatusBar() {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    public Parcelable onSaveInstanceState() {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
    }

    public void removeHeaderView(@NonNull View view) {
    }

    public void setBehindStatusBar(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
    }

    public void setCheckedItem(@NonNull MenuItemImpl menuItemImpl) {
    }

    public void setId(int i2) {
    }

    public void setItemBackground(@Nullable Drawable drawable) {
    }

    public void setItemHorizontalPadding(int i2) {
    }

    public void setItemIconPadding(int i2) {
    }

    public void setItemIconSize(@Dimension int i2) {
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
    }

    public void setItemMaxLines(int i2) {
    }

    public void setItemTextAppearance(@StyleRes int i2) {
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
    }

    public void setOverScrollMode(int i2) {
    }

    public void setUpdateSuspended(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
    }
}
