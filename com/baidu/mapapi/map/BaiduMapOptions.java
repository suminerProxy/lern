package com.baidu.mapapi.map;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class BaiduMapOptions implements Parcelable {
    public static final Parcelable.Creator<BaiduMapOptions> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    public MapStatus f1556a;
    public boolean b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1557d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1558e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1559f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1560g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1561h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1562i;

    /* renamed from: j  reason: collision with root package name */
    public LogoPosition f1563j;

    /* renamed from: k  reason: collision with root package name */
    public Point f1564k;

    /* renamed from: l  reason: collision with root package name */
    public Point f1565l;

    public BaiduMapOptions() {
    }

    public com.baidu.mapsdkplatform.comapi.map.u a() {
    }

    public BaiduMapOptions compassEnabled(boolean z) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public BaiduMapOptions logoPosition(LogoPosition logoPosition) {
    }

    public BaiduMapOptions mapStatus(MapStatus mapStatus) {
    }

    public BaiduMapOptions mapType(int i2) {
    }

    public BaiduMapOptions overlookingGesturesEnabled(boolean z) {
    }

    public BaiduMapOptions rotateGesturesEnabled(boolean z) {
    }

    public BaiduMapOptions scaleControlEnabled(boolean z) {
    }

    public BaiduMapOptions scaleControlPosition(Point point) {
    }

    public BaiduMapOptions scrollGesturesEnabled(boolean z) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public BaiduMapOptions zoomControlsEnabled(boolean z) {
    }

    public BaiduMapOptions zoomControlsPosition(Point point) {
    }

    public BaiduMapOptions zoomGesturesEnabled(boolean z) {
    }

    public BaiduMapOptions(Parcel parcel) {
    }
}
