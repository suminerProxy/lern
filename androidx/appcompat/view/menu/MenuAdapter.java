package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MenuAdapter extends BaseAdapter {
    public MenuBuilder mAdapterMenu;
    private int mExpandedIndex;
    private boolean mForceShowIcon;
    private final LayoutInflater mInflater;
    private final int mItemLayoutRes;
    private final boolean mOverflowOnly;

    public MenuAdapter(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z, int i2) {
    }

    public void findExpandedIndex() {
    }

    public MenuBuilder getAdapterMenu() {
    }

    @Override // android.widget.Adapter
    public int getCount() {
    }

    public boolean getForceShowIcon() {
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ Object getItem(int i2) {
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
    }

    public void setForceShowIcon(boolean z) {
    }

    @Override // android.widget.Adapter
    public MenuItemImpl getItem(int i2) {
    }
}
