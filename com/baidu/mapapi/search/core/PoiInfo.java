package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PoiInfo implements Parcelable {
    public static final Parcelable.Creator<PoiInfo> CREATOR = null;
    public String address;
    public String area;
    public String city;
    public int detail;
    public String direction;
    public int distance;
    public boolean hasCaterDetails;
    public boolean isPano;
    public LatLng location;
    public String name;
    public ParentPoiInfo parentPoiInfo;
    public String phoneNum;
    public PoiDetailInfo poiDetailInfo;
    public String postCode;
    public String province;
    public String street_id;
    public String tag;
    public POITYPE type;
    public String uid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class POITYPE {
        private static final /* synthetic */ POITYPE[] $VALUES = null;
        public static final POITYPE BUS_LINE = null;
        public static final POITYPE BUS_STATION = null;
        public static final POITYPE POINT = null;
        public static final POITYPE SUBWAY_LINE = null;
        public static final POITYPE SUBWAY_STATION = null;

        /* renamed from: a  reason: collision with root package name */
        private int f1982a;

        private POITYPE(String str, int i2, int i3) {
        }

        public static POITYPE fromInt(int i2) {
        }

        public static POITYPE valueOf(String str) {
        }

        public static POITYPE[] values() {
        }

        public int getInt() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ParentPoiInfo implements Parcelable {
        public static final Parcelable.Creator<ParentPoiInfo> CREATOR = null;
        public String parentPoiAddress;
        public String parentPoiDirection;
        public int parentPoiDistance;
        public LatLng parentPoiLocation;
        public String parentPoiName;
        public String parentPoiTag;
        public String parentPoiUid;

        public ParentPoiInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public String getParentPoiAddress() {
        }

        public String getParentPoiDirection() {
        }

        public int getParentPoiDistance() {
        }

        public LatLng getParentPoiLocation() {
        }

        public String getParentPoiName() {
        }

        public String getParentPoiTag() {
        }

        public String getParentPoiUid() {
        }

        public void setParentPoiAddress(String str) {
        }

        public void setParentPoiDirection(String str) {
        }

        public void setParentPoiDistance(int i2) {
        }

        public void setParentPoiLocation(LatLng latLng) {
        }

        public void setParentPoiName(String str) {
        }

        public void setParentPoiTag(String str) {
        }

        public void setParentPoiUid(String str) {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public ParentPoiInfo(Parcel parcel) {
        }
    }

    public PoiInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAddress() {
    }

    public String getArea() {
    }

    public String getCity() {
    }

    public int getDetail() {
    }

    public String getDirection() {
    }

    public int getDistance() {
    }

    public LatLng getLocation() {
    }

    public String getName() {
    }

    public ParentPoiInfo getParentPoi() {
    }

    public String getPhoneNum() {
    }

    public PoiDetailInfo getPoiDetailInfo() {
    }

    public String getPostCode() {
    }

    public String getProvince() {
    }

    public String getStreetId() {
    }

    public String getTag() {
    }

    public POITYPE getType() {
    }

    public String getUid() {
    }

    public boolean isHasCaterDetails() {
    }

    public boolean isPano() {
    }

    public void setAddress(String str) {
    }

    public void setArea(String str) {
    }

    public void setCity(String str) {
    }

    public void setDetail(int i2) {
    }

    public void setDirection(String str) {
    }

    public void setDistance(int i2) {
    }

    public void setHasCaterDetails(boolean z) {
    }

    public void setLocation(LatLng latLng) {
    }

    public void setName(String str) {
    }

    public void setPano(boolean z) {
    }

    public void setParentPoi(ParentPoiInfo parentPoiInfo) {
    }

    public void setPhoneNum(String str) {
    }

    public void setPoiDetailInfo(PoiDetailInfo poiDetailInfo) {
    }

    public void setPostCode(String str) {
    }

    public void setProvince(String str) {
    }

    public void setStreetId(String str) {
    }

    public void setTag(String str) {
    }

    public void setType(POITYPE poitype) {
    }

    public void setUid(String str) {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PoiInfo(Parcel parcel) {
    }
}
