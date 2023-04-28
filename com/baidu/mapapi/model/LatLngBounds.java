package com.baidu.mapapi.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class LatLngBounds implements Parcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = null;
    public final LatLng northeast;
    public final LatLng southwest;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
    }

    public boolean contains(LatLng latLng) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public LatLng getCenter() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public LatLngBounds(Parcel parcel) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private double f1941a;
        private double b;
        private double c;

        /* renamed from: d  reason: collision with root package name */
        private double f1942d;

        /* renamed from: e  reason: collision with root package name */
        private double f1943e;

        /* renamed from: f  reason: collision with root package name */
        private double f1944f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1945g;

        private void a(LatLng latLng) {
        }

        public LatLngBounds build() {
        }

        public Builder include(LatLng latLng) {
        }

        public Builder include(List<LatLng> list) {
        }
    }
}
