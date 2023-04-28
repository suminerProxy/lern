package com.baidu.platform.comapi.location;

import android.os.Bundle;
import com.baidu.platform.comapi.basestruct.Point;
import com.baidu.platform.comapi.basestruct.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class CoordinateUtil {
    public static native Point bd09llTobd09mc(double d2, double d3);

    public static native Point bd09llTogcj02ll(double d2, double d3);

    public static native Point bd09mcTobd09ll(double d2, double d3);

    public static Point bd09mcTogcj02ll(double d2, double d3) {
    }

    public static Point complexPtToPoint(String str) {
    }

    public static native Point gcj02Tobd09ll(double d2, double d3);

    public static Point gcj02Tobd09mc(double d2, double d3) {
    }

    public static a geoStringToComplexPt(String str) {
    }

    public static a geoStringToComplexPtBound(String str) {
    }

    public static Point geoStringToPoint(String str) {
    }

    public static native double getDistanceByMc(double d2, double d3, double d4, double d5);

    private static native Point nativeComplexPtToPoint(String str);

    private static native boolean nativeGeoStringToComplexPt(String str, Bundle bundle);

    private static native boolean nativeGeoStringToComplexPtBound(String str, Bundle bundle);

    private static native Point nativeGeoStringToPoint(String str);

    private static native String nativePointToGeoString(double d2, double d3);

    public static String pointToGeoString(Point point) {
    }

    public static Point wgs84Tobd09ll(double d2, double d3) {
    }

    public static Point wgs84Tobd09mc(double d2, double d3) {
    }

    public static native Point wgs84Togcj02(double d2, double d3);
}
