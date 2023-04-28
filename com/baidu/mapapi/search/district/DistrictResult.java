package com.baidu.mapapi.search.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DistrictResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<DistrictResult> CREATOR = null;
    public LatLng centerPt;
    public int cityCode;
    public String cityName;
    public List<List<LatLng>> polylines;

    public DistrictResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    public LatLng getCenterPt() {
    }

    public int getCityCode() {
    }

    public String getCityName() {
    }

    public List<List<LatLng>> getPolylines() {
    }

    public void setCenterPt(LatLng latLng) {
    }

    public void setCityCode(int i2) {
    }

    public void setCityName(String str) {
    }

    public void setPolylines(List<List<LatLng>> list) {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public DistrictResult(Parcel parcel) {
    }
}
