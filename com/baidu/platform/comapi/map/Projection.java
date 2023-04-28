package com.baidu.platform.comapi.map;

import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.basestruct.Point;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface Projection {
    GeoPoint fromPixels(int i2, int i3);

    float metersToEquatorPixels(float f2);

    Point toPixels(GeoPoint geoPoint, Point point);

    Point world2Screen(float f2, float f3, float f4);
}
