package androidx.appcompat.view.menu;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class MenuItemImpl implements SupportMenuItem {
    private static final int CHECKABLE = 1;
    private static final int CHECKED = 2;
    private static final int ENABLED = 16;
    private static final int EXCLUSIVE = 4;
    private static final int HIDDEN = 8;
    private static final int IS_ACTION = 32;
    public static final int NO_ICON = 0;
    private static final int SHOW_AS_ACTION_MASK = 3;
    private static final String TAG = "MenuItemImpl";
    private ActionProvider mActionProvider;
    private View mActionView;
    private final int mCategoryOrder;
    private MenuItem.OnMenuItemClickListener mClickListener;
    private CharSequence mContentDescription;
    private int mFlags;
    private final int mGroup;
    private boolean mHasIconTint;
    private boolean mHasIconTintMode;
    private Drawable mIconDrawable;
    private int mIconResId;
    private ColorStateList mIconTintList;
    private PorterDuff.Mode mIconTintMode;
    private final int mId;
    private Intent mIntent;
    private boolean mIsActionViewExpanded;
    private Runnable mItemCallback;
    public MenuBuilder mMenu;
    private ContextMenu.ContextMenuInfo mMenuInfo;
    private boolean mNeedToApplyIconTint;
    private MenuItem.OnActionExpandListener mOnActionExpandListener;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private int mShortcutAlphabeticModifiers;
    private char mShortcutNumericChar;
    private int mShortcutNumericModifiers;
    private int mShowAsAction;
    private SubMenuBuilder mSubMenu;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;
    private CharSequence mTooltipText;

    /* renamed from: androidx.appcompat.view.menu.MenuItemImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ActionProvider.VisibilityListener {
        public final /* synthetic */ MenuItemImpl this$0;

        public AnonymousClass1(MenuItemImpl menuItemImpl) {
        }

        @Override // androidx.core.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
        }
    }

    public MenuItemImpl(MenuBuilder menuBuilder, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
    }

    private static void appendModifier(StringBuilder sb, int i2, int i3, String str) {
    }

    private Drawable applyIconTintIfNecessary(Drawable drawable) {
    }

    public void actionFormatChanged() {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public View getActionView() {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
    }

    public Runnable getCallback() {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getContentDescription() {
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public ColorStateList getIconTintList() {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getNumericModifiers() {
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
    }

    @Override // android.view.MenuItem
    public int getOrder() {
    }

    public int getOrdering() {
    }

    public char getShortcut() {
    }

    public String getShortcutLabel() {
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public ActionProvider getSupportActionProvider() {
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
    }

    public CharSequence getTitleForItemView(MenuView.ItemView itemView) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getTooltipText() {
    }

    public boolean hasCollapsibleActionView() {
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
    }

    public boolean invoke() {
    }

    public boolean isActionButton() {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
    }

    public boolean isExclusiveCheckable() {
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
    }

    public boolean requestsActionButton() {
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresActionButton() {
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresOverflow() {
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
    }

    public void setActionViewExpanded(boolean z) {
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
    }

    public MenuItem setCallback(Runnable runnable) {
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
    }

    public void setCheckedInt(boolean z) {
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
    }

    public void setExclusiveCheckable(boolean z) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
    }

    public void setIsActionButton(boolean z) {
    }

    public void setMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
    }

    public void setSubMenu(SubMenuBuilder subMenuBuilder) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public SupportMenuItem setSupportActionProvider(ActionProvider actionProvider) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
    }

    public boolean setVisibleInt(boolean z) {
    }

    public boolean shouldShowIcon() {
    }

    public boolean shouldShowShortcut() {
    }

    public boolean showsTextAsAction() {
    }

    public String toString() {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public SupportMenuItem setContentDescription(CharSequence charSequence) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public SupportMenuItem setShowAsActionFlags(int i2) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public SupportMenuItem setTooltipText(CharSequence charSequence) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public SupportMenuItem setActionView(View view) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i2) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i2) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i2, int i3) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public SupportMenuItem setActionView(int i2) {
    }
}
