package com.baidu.mapapi.search.poi;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.SearchResult;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PoiDetailResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<PoiDetailResult> CREATOR = null;
    public String address;
    public int checkinNum;
    public int commentNum;
    public String detailUrl;
    public int discountNum;
    public double environmentRating;
    public double facilityRating;
    public int favoriteNum;
    public int grouponNum;
    public double hygieneRating;
    public int imageNum;
    public LatLng location;
    public String name;
    public double overallRating;
    public double price;
    public double serviceRating;
    public String shopHours;
    public String tag;
    public double tasteRating;
    public double technologyRating;
    public String telephone;
    public String type;
    public String uid;

    public PoiDetailResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    public String getAddress() {
    }

    public int getCheckinNum() {
    }

    public int getCommentNum() {
    }

    public String getDetailUrl() {
    }

    public int getDiscountNum() {
    }

    public double getEnvironmentRating() {
    }

    public double getFacilityRating() {
    }

    public int getFavoriteNum() {
    }

    public int getGrouponNum() {
    }

    public double getHygieneRating() {
    }

    public int getImageNum() {
    }

    public LatLng getLocation() {
    }

    public String getName() {
    }

    public double getOverallRating() {
    }

    public double getPrice() {
    }

    public double getServiceRating() {
    }

    public String getShopHours() {
    }

    public String getTag() {
    }

    public double getTasteRating() {
    }

    public double getTechnologyRating() {
    }

    public String getTelephone() {
    }

    public String getType() {
    }

    public String getUid() {
    }

    public void setAddress(String str) {
    }

    public void setCheckinNum(int i2) {
    }

    public void setCommentNum(int i2) {
    }

    public void setDetailUrl(String str) {
    }

    public void setDiscountNum(int i2) {
    }

    public void setEnvironmentRating(double d2) {
    }

    public void setFacilityRating(double d2) {
    }

    public void setFavoriteNum(int i2) {
    }

    public void setGrouponNum(int i2) {
    }

    public void setHygieneRating(double d2) {
    }

    public void setImageNum(int i2) {
    }

    public void setLocation(LatLng latLng) {
    }

    public void setName(String str) {
    }

    public void setOverallRating(double d2) {
    }

    public void setPrice(double d2) {
    }

    public void setServiceRating(double d2) {
    }

    public void setShopHours(String str) {
    }

    public void setTag(String str) {
    }

    public void setTasteRating(double d2) {
    }

    public void setTechnologyRating(double d2) {
    }

    public void setTelephone(String str) {
    }

    public void setType(String str) {
    }

    public void setUid(String str) {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PoiDetailResult(SearchResult.ERRORNO errorno) {
    }

    public PoiDetailResult(Parcel parcel) {
    }
}
