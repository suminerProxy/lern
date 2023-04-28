package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SearchResult implements Parcelable {
    public ERRORNO error;
    public int status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ERRORNO {
        private static final /* synthetic */ ERRORNO[] $VALUES = null;
        public static final ERRORNO AMBIGUOUS_KEYWORD = null;
        public static final ERRORNO AMBIGUOUS_ROURE_ADDR = null;
        public static final ERRORNO INDOOR_ROUTE_NO_IN_BUILDING = null;
        public static final ERRORNO INDOOR_ROUTE_NO_IN_SAME_BUILDING = null;
        public static final ERRORNO INVALID_DISTRICT_ID = null;
        public static final ERRORNO KEY_ERROR = null;
        public static final ERRORNO MASS_TRANSIT_NO_POI_ERROR = null;
        public static final ERRORNO MASS_TRANSIT_OPTION_ERROR = null;
        public static final ERRORNO MASS_TRANSIT_SERVER_ERROR = null;
        public static final ERRORNO NETWORK_ERROR = null;
        public static final ERRORNO NETWORK_TIME_OUT = null;
        public static final ERRORNO NOT_SUPPORT_BUS = null;
        public static final ERRORNO NOT_SUPPORT_BUS_2CITY = null;
        public static final ERRORNO NO_ADVANCED_PERMISSION = null;
        public static final ERRORNO NO_DATA_FOR_LATLNG = null;
        public static final ERRORNO NO_ERROR = null;
        public static final ERRORNO PARAMER_ERROR = null;
        public static final ERRORNO PERMISSION_UNFINISHED = null;
        public static final ERRORNO POIINDOOR_BID_ERROR = null;
        public static final ERRORNO POIINDOOR_FLOOR_ERROR = null;
        public static final ERRORNO POIINDOOR_SERVER_ERROR = null;
        public static final ERRORNO REQUEST_ERROR = null;
        public static final ERRORNO RESULT_NOT_FOUND = null;
        public static final ERRORNO SEARCH_OPTION_ERROR = null;
        public static final ERRORNO SEARCH_SERVER_INTERNAL_ERROR = null;
        public static final ERRORNO ST_EN_TOO_NEAR = null;

        private ERRORNO(String str, int i2) {
        }

        public static ERRORNO valueOf(String str) {
        }

        public static ERRORNO[] values() {
        }
    }

    public SearchResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public SearchResult(ERRORNO errorno) {
    }

    public SearchResult(Parcel parcel) {
    }
}
