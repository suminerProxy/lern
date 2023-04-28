package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.TaxiInfo;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class DrivingRouteResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<DrivingRouteResult> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private List<DrivingRouteLine> f2077a;
    private List<TaxiInfo> b;
    private TaxiInfo c;

    /* renamed from: d  reason: collision with root package name */
    private SuggestAddrInfo f2078d;

    public DrivingRouteResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    public List<DrivingRouteLine> getRouteLines() {
    }

    public SuggestAddrInfo getSuggestAddrInfo() {
    }

    @Deprecated
    public TaxiInfo getTaxiInfo() {
    }

    public List<TaxiInfo> getTaxiInfos() {
    }

    public void setRouteLines(List<DrivingRouteLine> list) {
    }

    public void setSuggestAddrInfo(SuggestAddrInfo suggestAddrInfo) {
    }

    public void setTaxiInfos(List<TaxiInfo> list) {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public DrivingRouteResult(Parcel parcel) {
    }
}
