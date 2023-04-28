package com.baidu.mapapi.map;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class MapStatus implements Parcelable {
    public static final Parcelable.Creator<MapStatus> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    public com.baidu.mapsdkplatform.comapi.map.w f1656a;
    private double b;
    public final LatLngBounds bound;
    private double c;
    public final float overlook;
    public final float rotate;
    public final LatLng target;
    public final Point targetScreen;
    public WinRound winRound;
    public final float zoom;

    public MapStatus(float f2, LatLng latLng, float f3, float f4, Point point, LatLngBounds latLngBounds) {
    }

    public double a() {
    }

    public double b() {
    }

    public com.baidu.mapsdkplatform.comapi.map.w c() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public static MapStatus a(com.baidu.mapsdkplatform.comapi.map.w wVar) {
    }

    public com.baidu.mapsdkplatform.comapi.map.w b(com.baidu.mapsdkplatform.comapi.map.w wVar) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private float f1657a;
        private LatLng b;
        private float c;

        /* renamed from: d  reason: collision with root package name */
        private float f1658d;

        /* renamed from: e  reason: collision with root package name */
        private Point f1659e;

        /* renamed from: f  reason: collision with root package name */
        private LatLngBounds f1660f;

        /* renamed from: g  reason: collision with root package name */
        private double f1661g;

        /* renamed from: h  reason: collision with root package name */
        private double f1662h;

        /* renamed from: i  reason: collision with root package name */
        private final float f1663i;

        public Builder() {
        }

        private float a(float f2) {
        }

        public MapStatus build() {
        }

        public Builder overlook(float f2) {
        }

        public Builder rotate(float f2) {
        }

        public Builder target(LatLng latLng) {
        }

        public Builder targetScreen(Point point) {
        }

        public Builder zoom(float f2) {
        }

        public Builder(MapStatus mapStatus) {
        }
    }

    public MapStatus(float f2, LatLng latLng, float f3, float f4, Point point, double d2, double d3, LatLngBounds latLngBounds) {
    }

    public MapStatus(float f2, LatLng latLng, float f3, float f4, Point point, com.baidu.mapsdkplatform.comapi.map.w wVar, double d2, double d3, LatLngBounds latLngBounds, WinRound winRound) {
    }

    public MapStatus(Parcel parcel) {
    }
}
