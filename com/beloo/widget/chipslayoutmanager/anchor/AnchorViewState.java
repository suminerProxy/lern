package com.beloo.widget.chipslayoutmanager.anchor;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnchorViewState implements Parcelable {
    public static final Parcelable.Creator<AnchorViewState> CREATOR = null;
    private Rect anchorViewRect;
    private Integer position;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a implements Parcelable.Creator<AnchorViewState> {
        public AnchorViewState a(Parcel parcel) {
        }

        public AnchorViewState[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AnchorViewState createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AnchorViewState[] newArray(int i2) {
        }
    }

    public /* synthetic */ AnchorViewState(Parcel parcel, a aVar) {
    }

    public static AnchorViewState getNotFoundState() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public Rect getAnchorViewRect() {
    }

    public Integer getPosition() {
    }

    public boolean isNotFoundState() {
    }

    public boolean isRemoving() {
    }

    public void setAnchorViewRect(Rect rect) {
    }

    public void setPosition(Integer num) {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    private AnchorViewState() {
    }

    public AnchorViewState(int i2, @NonNull Rect rect) {
    }

    private AnchorViewState(Parcel parcel) {
    }
}
