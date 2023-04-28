package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class DryingTicketsTemplateBean implements Parcelable {
    public static final Parcelable.Creator<DryingTicketsTemplateBean> CREATOR = null;
    public String audioURL;
    public int fps;
    public String height;
    public List<DryingTicketsOverlayersBean> overlayers;
    public String tempateId;
    public String tempateName;
    public String videoURL;
    public String width;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<DryingTicketsTemplateBean> {
        public DryingTicketsTemplateBean a(Parcel parcel) {
        }

        public DryingTicketsTemplateBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DryingTicketsTemplateBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DryingTicketsTemplateBean[] newArray(int i2) {
        }
    }

    public DryingTicketsTemplateBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public DryingTicketsTemplateBean(Parcel parcel) {
    }
}
