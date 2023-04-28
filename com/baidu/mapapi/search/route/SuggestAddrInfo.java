package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.CityInfo;
import com.baidu.mapapi.search.core.PoiInfo;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SuggestAddrInfo implements Parcelable {
    public static final Parcelable.Creator<SuggestAddrInfo> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private List<PoiInfo> f2113a;
    private List<PoiInfo> b;
    private List<List<PoiInfo>> c;

    /* renamed from: d  reason: collision with root package name */
    private List<CityInfo> f2114d;

    /* renamed from: e  reason: collision with root package name */
    private List<CityInfo> f2115e;

    /* renamed from: f  reason: collision with root package name */
    private List<List<CityInfo>> f2116f;

    public SuggestAddrInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public List<CityInfo> getSuggestEndCity() {
    }

    public List<PoiInfo> getSuggestEndNode() {
    }

    public List<CityInfo> getSuggestStartCity() {
    }

    public List<PoiInfo> getSuggestStartNode() {
    }

    public List<List<CityInfo>> getSuggestWpCity() {
    }

    public List<List<PoiInfo>> getSuggestWpNode() {
    }

    public void setSuggestEndCity(List<CityInfo> list) {
    }

    public void setSuggestEndNode(List<PoiInfo> list) {
    }

    public void setSuggestStartCity(List<CityInfo> list) {
    }

    public void setSuggestStartNode(List<PoiInfo> list) {
    }

    public void setSuggestWpCity(List<List<CityInfo>> list) {
    }

    public void setSuggestWpNode(List<List<PoiInfo>> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public SuggestAddrInfo(Parcel parcel) {
    }
}
