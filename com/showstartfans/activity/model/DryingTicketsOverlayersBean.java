package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class DryingTicketsOverlayersBean implements Parcelable {
    public static final Parcelable.Creator<DryingTicketsOverlayersBean> CREATOR = null;
    public int corner;
    public String dataReferenceName;
    public List<DryingTicketsDrawsBean> draws;
    public int eangle;
    public int height;
    public String overlayerType;
    public DryingTicketsTimeRangeBean timeRange;
    public int width;
    public int x;
    public String xdirection;
    public int y;
    public String ydirection;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<DryingTicketsOverlayersBean> {
        public DryingTicketsOverlayersBean a(Parcel parcel) {
        }

        public DryingTicketsOverlayersBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DryingTicketsOverlayersBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DryingTicketsOverlayersBean[] newArray(int i2) {
        }
    }

    public DryingTicketsOverlayersBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public DryingTicketsOverlayersBean(Parcel parcel) {
    }
}
