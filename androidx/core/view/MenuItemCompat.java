package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class MenuItemCompat {
    @Deprecated
    public static final int SHOW_AS_ACTION_ALWAYS = 2;
    @Deprecated
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
    @Deprecated
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;
    @Deprecated
    public static final int SHOW_AS_ACTION_NEVER = 0;
    @Deprecated
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
    private static final String TAG = "MenuItemCompat";

    /* renamed from: androidx.core.view.MenuItemCompat$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements MenuItem.OnActionExpandListener {
        public final /* synthetic */ OnActionExpandListener val$listener;

        public AnonymousClass1(OnActionExpandListener onActionExpandListener) {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
        }
    }

    @Deprecated
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnActionExpandListener {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    private MenuItemCompat() {
    }

    @Deprecated
    public static boolean collapseActionView(MenuItem menuItem) {
    }

    @Deprecated
    public static boolean expandActionView(MenuItem menuItem) {
    }

    public static ActionProvider getActionProvider(MenuItem menuItem) {
    }

    @Deprecated
    public static View getActionView(MenuItem menuItem) {
    }

    public static int getAlphabeticModifiers(MenuItem menuItem) {
    }

    public static CharSequence getContentDescription(MenuItem menuItem) {
    }

    public static ColorStateList getIconTintList(MenuItem menuItem) {
    }

    public static PorterDuff.Mode getIconTintMode(MenuItem menuItem) {
    }

    public static int getNumericModifiers(MenuItem menuItem) {
    }

    public static CharSequence getTooltipText(MenuItem menuItem) {
    }

    @Deprecated
    public static boolean isActionViewExpanded(MenuItem menuItem) {
    }

    public static MenuItem setActionProvider(MenuItem menuItem, ActionProvider actionProvider) {
    }

    @Deprecated
    public static MenuItem setActionView(MenuItem menuItem, View view) {
    }

    public static void setAlphabeticShortcut(MenuItem menuItem, char c, int i2) {
    }

    public static void setContentDescription(MenuItem menuItem, CharSequence charSequence) {
    }

    public static void setIconTintList(MenuItem menuItem, ColorStateList colorStateList) {
    }

    public static void setIconTintMode(MenuItem menuItem, PorterDuff.Mode mode) {
    }

    public static void setNumericShortcut(MenuItem menuItem, char c, int i2) {
    }

    @Deprecated
    public static MenuItem setOnActionExpandListener(MenuItem menuItem, OnActionExpandListener onActionExpandListener) {
    }

    public static void setShortcut(MenuItem menuItem, char c, char c2, int i2, int i3) {
    }

    @Deprecated
    public static void setShowAsAction(MenuItem menuItem, int i2) {
    }

    public static void setTooltipText(MenuItem menuItem, CharSequence charSequence) {
    }

    @Deprecated
    public static MenuItem setActionView(MenuItem menuItem, int i2) {
    }
}
