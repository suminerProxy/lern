package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RouteStep implements Parcelable {
    public static final Parcelable.Creator<RouteStep> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    public int f1994a;
    public int b;
    public String c;
    public List<LatLng> mWayPoints;

    public RouteStep() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getDistance() {
    }

    public int getDuration() {
    }

    public String getName() {
    }

    public List<LatLng> getWayPoints() {
    }

    public void setDistance(int i2) {
    }

    public void setDuration(int i2) {
    }

    public void setName(String str) {
    }

    public void setWayPoints(List<LatLng> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public RouteStep(Parcel parcel) {
    }
}
