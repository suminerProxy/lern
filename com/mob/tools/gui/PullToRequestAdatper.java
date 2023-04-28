package com.mob.tools.gui;

import android.content.Context;
import android.view.View;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class PullToRequestAdatper {
    private Context context;
    private PullToRequestView parent;

    public PullToRequestAdatper(PullToRequestView pullToRequestView) {
    }

    public abstract Scrollable getBodyView();

    public Context getContext() {
    }

    public abstract View getFooterView();

    public abstract View getHeaderView();

    public PullToRequestView getParent() {
    }

    public abstract boolean isPullDownReady();

    public abstract boolean isPullUpReady();

    public void notifyDataSetChanged() {
    }

    public void onPullDown(int i2) {
    }

    public void onPullUp(int i2) {
    }

    public void onRefresh() {
    }

    public void onRequestNext() {
    }

    public void onReversed() {
    }
}
