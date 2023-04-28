package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.TaxiInfo;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class TransitRouteResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<TransitRouteResult> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private TaxiInfo f2124a;
    private List<TransitRouteLine> b;
    private SuggestAddrInfo c;

    public TransitRouteResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    public List<TransitRouteLine> getRouteLines() {
    }

    public SuggestAddrInfo getSuggestAddrInfo() {
    }

    public TaxiInfo getTaxiInfo() {
    }

    public void setRoutelines(List<TransitRouteLine> list) {
    }

    public void setSuggestAddrInfo(SuggestAddrInfo suggestAddrInfo) {
    }

    public void setTaxiInfo(TaxiInfo taxiInfo) {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public TransitRouteResult(Parcel parcel) {
    }
}
