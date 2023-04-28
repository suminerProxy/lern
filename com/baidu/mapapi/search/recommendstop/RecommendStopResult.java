package com.baidu.mapapi.search.recommendstop;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.RecommendStopInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RecommendStopResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<RecommendStopResult> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private List<RecommendStopInfo> f2049a;

    public RecommendStopResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    public List<RecommendStopInfo> getRecommendStopInfoList() {
    }

    public void setRecommendStopInfoList(List<RecommendStopInfo> list) {
    }

    public String toString() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public RecommendStopResult(Parcel parcel) {
    }
}
