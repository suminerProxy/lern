package com.baidu.mapapi.search.sug;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiChildrenInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SuggestionResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<SuggestionResult> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<SuggestionInfo> f2136a;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SuggestionInfo implements Parcelable {
        public static final Parcelable.Creator<SuggestionInfo> CREATOR = null;
        public String address;
        public String city;
        public String district;
        public String key;
        public List<PoiChildrenInfo> poiChildrenInfoList;
        public LatLng pt;
        public String tag;
        public String uid;

        public SuggestionInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public String getAddress() {
        }

        public String getCity() {
        }

        public String getDistrict() {
        }

        public String getKey() {
        }

        public List<PoiChildrenInfo> getPoiChildrenInfoList() {
        }

        public LatLng getPt() {
        }

        public String getTag() {
        }

        public String getUid() {
        }

        public void setAddress(String str) {
        }

        public void setCity(String str) {
        }

        public void setDistrict(String str) {
        }

        public void setKey(String str) {
        }

        public void setPoiChildrenInfoList(List<PoiChildrenInfo> list) {
        }

        public void setPt(LatLng latLng) {
        }

        public void setTag(String str) {
        }

        public void setUid(String str) {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public SuggestionInfo(Parcel parcel) {
        }
    }

    public SuggestionResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    public List<SuggestionInfo> getAllSuggestions() {
    }

    public void setSuggestionInfo(ArrayList<SuggestionInfo> arrayList) {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public SuggestionResult(SearchResult.ERRORNO errorno) {
    }

    public SuggestionResult(Parcel parcel) {
    }
}
