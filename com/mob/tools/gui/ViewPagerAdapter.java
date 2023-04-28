package com.mob.tools.gui;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ViewPagerAdapter {
    private MobViewPager parent;

    public abstract int getCount();

    public abstract View getView(int i2, View view, ViewGroup viewGroup);

    public void invalidate() {
    }

    public void onScreenChange(int i2, int i3) {
    }

    public void onScreenChanging(float f2) {
    }

    public final void setMobViewPager(MobViewPager mobViewPager) {
    }
}
