package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PoiDetailInfo implements Parcelable {
    public static final Parcelable.Creator<PoiDetailInfo> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private String f1973a;
    private LatLng b;
    private String c;
    public int checkinNum;
    public int commentNum;

    /* renamed from: d  reason: collision with root package name */
    private String f1974d;
    public String detailUrl;
    public int discountNum;
    public int distance;

    /* renamed from: e  reason: collision with root package name */
    private String f1975e;
    public double environmentRating;

    /* renamed from: f  reason: collision with root package name */
    private String f1976f;
    public double facilityRating;
    public int favoriteNum;

    /* renamed from: g  reason: collision with root package name */
    private String f1977g;
    public int grouponNum;

    /* renamed from: h  reason: collision with root package name */
    private String f1978h;
    public double hygieneRating;

    /* renamed from: i  reason: collision with root package name */
    private String f1979i;
    public int imageNum;

    /* renamed from: j  reason: collision with root package name */
    private int f1980j;

    /* renamed from: k  reason: collision with root package name */
    private List<PoiChildrenInfo> f1981k;
    public LatLng naviLocation;
    public double overallRating;
    public double price;
    public double serviceRating;
    public String shopHours;
    public String tag;
    public double tasteRating;
    public double technologyRating;
    public String type;

    public PoiDetailInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAddress() {
    }

    public String getArea() {
    }

    public int getCheckinNum() {
    }

    public String getCity() {
    }

    public int getCommentNum() {
    }

    public int getDetail() {
    }

    public String getDetailUrl() {
    }

    public int getDiscountNum() {
    }

    public int getDistance() {
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

    public LatLng getNaviLocation() {
    }

    public double getOverallRating() {
    }

    public List<PoiChildrenInfo> getPoiChildrenInfoList() {
    }

    public double getPrice() {
    }

    public String getProvince() {
    }

    public double getServiceRating() {
    }

    public String getShopHours() {
    }

    public String getStreetId() {
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

    public void setArea(String str) {
    }

    public void setCheckinNum(int i2) {
    }

    public void setCity(String str) {
    }

    public void setCommentNum(int i2) {
    }

    public void setDetail(String str) {
    }

    public void setDetailUrl(String str) {
    }

    public void setDiscountNum(int i2) {
    }

    public void setDistance(int i2) {
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

    public void setNaviLocation(LatLng latLng) {
    }

    public void setOverallRating(double d2) {
    }

    public void setPoiChildrenInfoList(List<PoiChildrenInfo> list) {
    }

    public void setPrice(double d2) {
    }

    public void setProvince(String str) {
    }

    public void setServiceRating(double d2) {
    }

    public void setShopHours(String str) {
    }

    public void setStreetId(String str) {
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

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PoiDetailInfo(Parcel parcel) {
    }
}
