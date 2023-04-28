package com.baidu.mapapi.search.poi;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PoiIndoorResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<PoiIndoorResult> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private List<PoiIndoorInfo> f2039a;
    public int pageNum;
    public int poiNum;

    public PoiIndoorResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    public List<PoiIndoorInfo> getArrayPoiInfo() {
    }

    public int getPageNum() {
    }

    public int getPoiNum() {
    }

    @Deprecated
    public List<PoiIndoorInfo> getmArrayPoiInfo() {
    }

    public void setArrayPoiInfo(List<PoiIndoorInfo> list) {
    }

    public void setPageNum(int i2) {
    }

    public void setPoiNum(int i2) {
    }

    @Deprecated
    public void setmArrayPoiInfo(List<PoiIndoorInfo> list) {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PoiIndoorResult(SearchResult.ERRORNO errorno) {
    }

    public PoiIndoorResult(Parcel parcel) {
    }
}
