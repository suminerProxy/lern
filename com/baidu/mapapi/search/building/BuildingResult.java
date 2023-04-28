package com.baidu.mapapi.search.building;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.BuildingInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BuildingResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<BuildingResult> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private List<BuildingInfo> f1950a;

    public BuildingResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    public List<BuildingInfo> getBuildingList() {
    }

    public void setBuildingList(List<BuildingInfo> list) {
    }

    public String toString() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public BuildingResult(Parcel parcel) {
    }
}
