package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BikingRouteResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<BikingRouteResult> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private List<BikingRouteLine> f2059a;
    private SuggestAddrInfo b;

    public BikingRouteResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    public List<BikingRouteLine> getRouteLines() {
    }

    public SuggestAddrInfo getSuggestAddrInfo() {
    }

    public void setRouteLines(List<BikingRouteLine> list) {
    }

    public void setSuggestAddrInfo(SuggestAddrInfo suggestAddrInfo) {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public BikingRouteResult(Parcel parcel) {
    }
}
