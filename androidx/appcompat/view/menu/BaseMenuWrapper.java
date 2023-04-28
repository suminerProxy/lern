package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class BaseMenuWrapper {
    public final Context mContext;
    private SimpleArrayMap<SupportMenuItem, MenuItem> mMenuItems;
    private SimpleArrayMap<SupportSubMenu, SubMenu> mSubMenus;

    public BaseMenuWrapper(Context context) {
    }

    public final MenuItem getMenuItemWrapper(MenuItem menuItem) {
    }

    public final SubMenu getSubMenuWrapper(SubMenu subMenu) {
    }

    public final void internalClear() {
    }

    public final void internalRemoveGroup(int i2) {
    }

    public final void internalRemoveItem(int i2) {
    }
}
