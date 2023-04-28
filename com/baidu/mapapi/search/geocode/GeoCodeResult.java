package com.baidu.mapapi.search.geocode;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.SearchResult;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class GeoCodeResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<GeoCodeResult> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private LatLng f2009a;
    private String b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f2010d;

    /* renamed from: e  reason: collision with root package name */
    private String f2011e;

    public GeoCodeResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    @Deprecated
    public String getAddress() {
    }

    public int getConfidence() {
    }

    public String getLevel() {
    }

    public LatLng getLocation() {
    }

    public int getPrecise() {
    }

    @Deprecated
    public void setAddress(String str) {
    }

    public void setConfidence(int i2) {
    }

    public void setLevel(String str) {
    }

    public void setLocation(LatLng latLng) {
    }

    public void setPrecise(int i2) {
    }

    public String toString() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public GeoCodeResult(Parcel parcel) {
    }
}
