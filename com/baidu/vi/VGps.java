package com.baidu.vi;

import android.annotation.SuppressLint;
import android.location.GpsStatus;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Handler;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class VGps {

    /* renamed from: e  reason: collision with root package name */
    private static int f2903e = 3;
    @SuppressLint({"HandlerLeak"})

    /* renamed from: h  reason: collision with root package name */
    private static Handler f2904h;

    /* renamed from: a  reason: collision with root package name */
    private GpsStatus.Listener f2905a;
    private LocationListener b;
    private LocationManager c;

    /* renamed from: d  reason: collision with root package name */
    private GpsStatus f2906d;

    /* renamed from: f  reason: collision with root package name */
    private int f2907f;

    /* renamed from: g  reason: collision with root package name */
    private int f2908g;

    public static /* synthetic */ int a() {
    }

    public static /* synthetic */ GpsStatus b(VGps vGps) {
    }

    public static /* synthetic */ int c(VGps vGps) {
    }

    public static /* synthetic */ void d(VGps vGps) {
    }

    public static /* synthetic */ GpsStatus.Listener e(VGps vGps) {
    }

    public static /* synthetic */ LocationListener f(VGps vGps) {
    }

    public int getGpsSatellitesNum() {
    }

    public boolean init() {
    }

    public boolean unInit() {
    }

    public native void updateGps(double d2, double d3, float f2, float f3, float f4, int i2);

    public static /* synthetic */ int a(VGps vGps, int i2) {
    }

    private synchronized void b() {
    }

    public static /* synthetic */ GpsStatus a(VGps vGps, GpsStatus gpsStatus) {
    }

    public static /* synthetic */ LocationManager a(VGps vGps) {
    }

    public static /* synthetic */ LocationManager a(VGps vGps, LocationManager locationManager) {
    }
}
