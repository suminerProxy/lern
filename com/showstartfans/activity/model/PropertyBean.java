package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PropertyBean implements Parcelable {
    public static final Parcelable.Creator<PropertyBean> CREATOR = null;
    private String id;
    private String name;
    private List<PropertyValueBaen> values;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<PropertyBean> {
        public PropertyBean a(Parcel parcel) {
        }

        public PropertyBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PropertyBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PropertyBean[] newArray(int i2) {
        }
    }

    public PropertyBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getId() {
    }

    public String getName() {
    }

    public List<PropertyValueBaen> getValues() {
    }

    public void setId(String str) {
    }

    public void setName(String str) {
    }

    public void setValues(List<PropertyValueBaen> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PropertyBean(Parcel parcel) {
    }
}
