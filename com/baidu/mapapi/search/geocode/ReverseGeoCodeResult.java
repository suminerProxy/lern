package com.baidu.mapapi.search.geocode;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ReverseGeoCodeResult extends SearchResult {
    public static final Parcelable.Creator<ReverseGeoCodeResult> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private String f2018a;
    private String b;
    private AddressComponent c;

    /* renamed from: d  reason: collision with root package name */
    private LatLng f2019d;

    /* renamed from: e  reason: collision with root package name */
    private int f2020e;

    /* renamed from: f  reason: collision with root package name */
    private List<PoiInfo> f2021f;

    /* renamed from: g  reason: collision with root package name */
    private String f2022g;

    /* renamed from: h  reason: collision with root package name */
    private List<PoiRegionsInfo> f2023h;

    /* renamed from: i  reason: collision with root package name */
    private List<RoadInfo> f2024i;

    /* renamed from: j  reason: collision with root package name */
    private int f2025j;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AddressComponent implements Parcelable {
        public static final Parcelable.Creator<AddressComponent> CREATOR = null;
        public int adcode;
        public String city;
        public int cityLevel;
        public int countryCode;
        public String countryCodeIso;
        public String countryCodeIso2;
        public String countryName;
        public String direction;
        public String distance;
        public String district;
        public String province;
        public String street;
        public String streetNumber;
        public String town;
        public String townCode;

        public AddressComponent() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public String getDirection() {
        }

        public String getDistance() {
        }

        public String getTown() {
        }

        public void setDirection(String str) {
        }

        public void setDistance(String str) {
        }

        public void setTown(String str) {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public AddressComponent(Parcel parcel) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class PoiRegionsInfo implements Parcelable {
        public static final Parcelable.Creator<PoiRegionsInfo> CREATOR = null;
        public String directionDesc;
        public String regionName;
        public String regionTag;

        public PoiRegionsInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public String getDirectionDesc() {
        }

        public String getRegionName() {
        }

        public String getRegionTag() {
        }

        public void setDirectionDesc(String str) {
        }

        public void setRegionName(String str) {
        }

        public void setRegionTag(String str) {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public PoiRegionsInfo(Parcel parcel) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class RoadInfo implements Parcelable {
        public static final Parcelable.Creator<RoadInfo> CREATOR = null;
        public String distance;
        public String name;

        public RoadInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public RoadInfo(Parcel parcel) {
        }
    }

    public ReverseGeoCodeResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    public int getAdcode() {
    }

    public String getAddress() {
    }

    public AddressComponent getAddressDetail() {
    }

    public String getBusinessCircle() {
    }

    public int getCityCode() {
    }

    public LatLng getLocation() {
    }

    public List<PoiInfo> getPoiList() {
    }

    public List<PoiRegionsInfo> getPoiRegionsInfoList() {
    }

    public List<RoadInfo> getRoadInfoList() {
    }

    public String getSematicDescription() {
    }

    public void setAdcode(int i2) {
    }

    public void setAddress(String str) {
    }

    public void setAddressDetail(AddressComponent addressComponent) {
    }

    public void setBusinessCircle(String str) {
    }

    public void setCityCode(int i2) {
    }

    public void setLocation(LatLng latLng) {
    }

    public void setPoiList(List<PoiInfo> list) {
    }

    public void setPoiRegionsInfoList(List<PoiRegionsInfo> list) {
    }

    public void setRoadInfoList(List<RoadInfo> list) {
    }

    public void setSematicDescription(String str) {
    }

    public String toString() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ReverseGeoCodeResult(Parcel parcel) {
    }
}
