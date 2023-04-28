package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PlanNode implements Parcelable {
    public static final Parcelable.Creator<PlanNode> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private LatLng f2111a;
    private String b;
    private String c;

    public PlanNode(LatLng latLng, String str, String str2) {
    }

    public static PlanNode withCityCodeAndPlaceName(int i2, String str) {
    }

    public static PlanNode withCityNameAndPlaceName(String str, String str2) {
    }

    public static PlanNode withLocation(LatLng latLng) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getCity() {
    }

    public LatLng getLocation() {
    }

    public String getName() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PlanNode(Parcel parcel) {
    }
}
