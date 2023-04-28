package com.baidu.mapapi.map;

import android.graphics.Point;
import com.baidu.mapapi.map.v;
import com.baidu.mapapi.model.LatLng;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class WeightedLatLng extends v.a {
    public static final double DEFAULT_INTENSITY = 1.0d;

    /* renamed from: a  reason: collision with root package name */
    private Point f1883a;
    public final double intensity;
    public final LatLng latLng;

    public WeightedLatLng(LatLng latLng, double d2) {
    }

    @Override // com.baidu.mapapi.map.v.a
    public Point a() {
    }

    public WeightedLatLng(LatLng latLng) {
    }
}
