package com.baidu.mapapi.search.poi;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.PoiDetailInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PoiDetailSearchResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<PoiDetailSearchResult> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private List<PoiDetailInfo> f2027a;

    public PoiDetailSearchResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    public List<PoiDetailInfo> getPoiDetailInfoList() {
    }

    public void setPoiDetailInfoList(List<PoiDetailInfo> list) {
    }

    public String toString() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PoiDetailSearchResult(SearchResult.ERRORNO errorno) {
    }

    public PoiDetailSearchResult(Parcel parcel) {
    }
}
