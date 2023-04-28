package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.TaxiInfo;
import com.baidu.mapapi.search.core.TransitResultNode;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class MassTransitRouteResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<MassTransitRouteResult> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private TransitResultNode f2107a;
    private TransitResultNode b;
    private TaxiInfo c;

    /* renamed from: d  reason: collision with root package name */
    private int f2108d;

    /* renamed from: e  reason: collision with root package name */
    private List<MassTransitRouteLine> f2109e;

    /* renamed from: f  reason: collision with root package name */
    private SuggestAddrInfo f2110f;

    public MassTransitRouteResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    public TransitResultNode getDestination() {
    }

    public TransitResultNode getOrigin() {
    }

    public List<MassTransitRouteLine> getRouteLines() {
    }

    public SuggestAddrInfo getSuggestAddrInfo() {
    }

    public TaxiInfo getTaxiInfo() {
    }

    public int getTotal() {
    }

    public void setDestination(TransitResultNode transitResultNode) {
    }

    public void setOrigin(TransitResultNode transitResultNode) {
    }

    public void setRoutelines(List<MassTransitRouteLine> list) {
    }

    public void setSuggestAddrInfo(SuggestAddrInfo suggestAddrInfo) {
    }

    public void setTaxiInfo(TaxiInfo taxiInfo) {
    }

    public void setTotal(int i2) {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MassTransitRouteResult(Parcel parcel) {
    }
}
