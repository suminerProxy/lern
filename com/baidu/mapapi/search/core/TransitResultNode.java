package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TransitResultNode implements Parcelable {
    public static final Parcelable.Creator<TransitResultNode> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private int f2003a;
    private String b;
    private LatLng c;

    /* renamed from: d  reason: collision with root package name */
    private String f2004d;

    public TransitResultNode(int i2, String str, LatLng latLng, String str2) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getCityId() {
    }

    public String getCityName() {
    }

    public LatLng getLocation() {
    }

    public String getSearchWord() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public TransitResultNode(Parcel parcel) {
    }
}
