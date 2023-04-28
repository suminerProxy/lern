package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MenuItemWrapperICS extends BaseMenuWrapper implements MenuItem {
    public static final String LOG_TAG = "MenuItemWrapper";
    private Method mSetExclusiveCheckableMethod;
    private final SupportMenuItem mWrappedObject;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ActionProviderWrapper extends ActionProvider {
        public final android.view.ActionProvider mInner;
        public final /* synthetic */ MenuItemWrapperICS this$0;

        public ActionProviderWrapper(MenuItemWrapperICS menuItemWrapperICS, Context context, android.view.ActionProvider actionProvider) {
        }

        @Override // androidx.core.view.ActionProvider
        public boolean hasSubMenu() {
        }

        @Override // androidx.core.view.ActionProvider
        public View onCreateActionView() {
        }

        @Override // androidx.core.view.ActionProvider
        public boolean onPerformDefaultAction() {
        }

        @Override // androidx.core.view.ActionProvider
        public void onPrepareSubMenu(SubMenu subMenu) {
        }
    }

    @RequiresApi(16)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ActionProviderWrapperJB extends ActionProviderWrapper implements ActionProvider.VisibilityListener {
        private ActionProvider.VisibilityListener mListener;
        public final /* synthetic */ MenuItemWrapperICS this$0;

        public ActionProviderWrapperJB(MenuItemWrapperICS menuItemWrapperICS, Context context, android.view.ActionProvider actionProvider) {
        }

        @Override // androidx.core.view.ActionProvider
        public boolean isVisible() {
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
        }

        @Override // androidx.core.view.ActionProvider
        public View onCreateActionView(MenuItem menuItem) {
        }

        @Override // androidx.core.view.ActionProvider
        public boolean overridesItemVisibility() {
        }

        @Override // androidx.core.view.ActionProvider
        public void refreshVisibility() {
        }

        @Override // androidx.core.view.ActionProvider
        public void setVisibilityListener(ActionProvider.VisibilityListener visibilityListener) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class CollapsibleActionViewWrapper extends FrameLayout implements CollapsibleActionView {
        public final android.view.CollapsibleActionView mWrappedView;

        public CollapsibleActionViewWrapper(View view) {
        }

        public View getWrappedView() {
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public void onActionViewCollapsed() {
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public void onActionViewExpanded() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class OnActionExpandListenerWrapper implements MenuItem.OnActionExpandListener {
        private final MenuItem.OnActionExpandListener mObject;
        public final /* synthetic */ MenuItemWrapperICS this$0;

        public OnActionExpandListenerWrapper(MenuItemWrapperICS menuItemWrapperICS, MenuItem.OnActionExpandListener onActionExpandListener) {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class OnMenuItemClickListenerWrapper implements MenuItem.OnMenuItemClickListener {
        private final MenuItem.OnMenuItemClickListener mObject;
        public final /* synthetic */ MenuItemWrapperICS this$0;

        public OnMenuItemClickListenerWrapper(MenuItemWrapperICS menuItemWrapperICS, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
        }
    }

    public MenuItemWrapperICS(Context context, SupportMenuItem supportMenuItem) {
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
    }

    @Override // android.view.MenuItem
    public View getActionView() {
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
    }

    @Override // android.view.MenuItem
    public int getItemId() {
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
    }

    @Override // android.view.MenuItem
    public int getOrder() {
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
    }

    @Override // android.view.MenuItem
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

    @Override // android.view.MenuItem
    public boolean isVisible() {
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
    }

    public void setExclusiveCheckable(boolean z) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
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

    @Override // android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i2, int i3) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
    }
}
