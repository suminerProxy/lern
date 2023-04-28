package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.TaxiInfo;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class WalkingRouteResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<WalkingRouteResult> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private List<WalkingRouteLine> f2132a;
    private TaxiInfo b;
    private SuggestAddrInfo c;

    public WalkingRouteResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    public List<WalkingRouteLine> getRouteLines() {
    }

    public SuggestAddrInfo getSuggestAddrInfo() {
    }

    public TaxiInfo getTaxiInfo() {
    }

    public void setRouteLines(List<WalkingRouteLine> list) {
    }

    public void setSuggestAddrInfo(SuggestAddrInfo suggestAddrInfo) {
    }

    public void setTaxiInfo(TaxiInfo taxiInfo) {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public WalkingRouteResult(Parcel parcel) {
    }
}
