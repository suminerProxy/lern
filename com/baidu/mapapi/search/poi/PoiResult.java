package com.baidu.mapapi.search.poi;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.CityInfo;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PoiResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<PoiResult> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private int f2040a;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f2041d;

    /* renamed from: e  reason: collision with root package name */
    private List<PoiInfo> f2042e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2043f;

    /* renamed from: g  reason: collision with root package name */
    private List<PoiAddrInfo> f2044g;

    /* renamed from: h  reason: collision with root package name */
    private List<CityInfo> f2045h;

    public PoiResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    public List<PoiAddrInfo> getAllAddr() {
    }

    public List<PoiInfo> getAllPoi() {
    }

    public int getCurrentPageCapacity() {
    }

    public int getCurrentPageNum() {
    }

    public List<CityInfo> getSuggestCityList() {
    }

    public int getTotalPageNum() {
    }

    public int getTotalPoiNum() {
    }

    public boolean isHasAddrInfo() {
    }

    public void setAddrInfo(List<PoiAddrInfo> list) {
    }

    public void setCurrentPageCapacity(int i2) {
    }

    public void setCurrentPageNum(int i2) {
    }

    public void setHasAddrInfo(boolean z) {
    }

    public void setPoiInfo(List<PoiInfo> list) {
    }

    public void setSuggestCityList(List<CityInfo> list) {
    }

    public void setTotalPageNum(int i2) {
    }

    public void setTotalPoiNum(int i2) {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PoiResult(SearchResult.ERRORNO errorno) {
    }

    public PoiResult(Parcel parcel) {
    }
}
