package com.baidu.platform.comapi.map;

import com.baidu.platform.comapi.basestruct.Point;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface NaviMapViewListener {
    void onAction(int i2, Object obj);

    boolean onItemClick(String str, int i2, int i3);

    void onMapAnimationFinish();

    void onMapRenderModeChange(int i2);

    Point onTapInterception(Point point);

    void resizeScreen(int i2, int i3);
}
