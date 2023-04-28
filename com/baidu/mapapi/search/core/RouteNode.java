package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RouteNode implements Parcelable {
    public static final Parcelable.Creator<RouteNode> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private String f1993a;
    private LatLng b;
    private String c;

    public RouteNode() {
    }

    public static RouteNode location(LatLng latLng) {
    }

    public static RouteNode titleAndLocation(String str, LatLng latLng) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public LatLng getLocation() {
    }

    public String getTitle() {
    }

    public String getUid() {
    }

    public void setLocation(LatLng latLng) {
    }

    public void setTitle(String str) {
    }

    public void setUid(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public RouteNode(Parcel parcel) {
    }
}
