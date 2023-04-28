package com.mob.tools.gui;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class PullToRequestBaseListAdapter extends PullToRequestAdatper {
    public PullToRequestBaseListAdapter(PullToRequestView pullToRequestView) {
    }

    public abstract int getCount();

    public abstract Object getItem(int i2);

    public abstract long getItemId(int i2);

    public int getItemViewType(int i2) {
    }

    public abstract View getView(int i2, View view, ViewGroup viewGroup);

    public int getViewTypeCount() {
    }

    public abstract boolean isFling();

    public abstract void onScroll(Scrollable scrollable, int i2, int i3, int i4);
}
