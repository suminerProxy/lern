package com.beloo.widget.chipslayoutmanager;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ParcelableContainer implements Parcelable {
    public static final Parcelable.Creator<ParcelableContainer> CREATOR = null;
    private AnchorViewState anchorViewState;
    private SparseArray<Object> cacheNormalizationPositionMap;
    private int orientation;
    private SparseArray<Object> orientationCacheMap;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a implements Parcelable.Creator<ParcelableContainer> {
        public ParcelableContainer a(Parcel parcel) {
        }

        public ParcelableContainer[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ParcelableContainer createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ParcelableContainer[] newArray(int i2) {
        }
    }

    public /* synthetic */ ParcelableContainer(Parcel parcel, a aVar) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public AnchorViewState getAnchorViewState() {
    }

    @IntRange(from = 0)
    @Nullable
    public Integer getNormalizationPosition(int i2) {
    }

    public int getOrientation() {
    }

    @Nullable
    public Parcelable getPositionsCache(int i2) {
    }

    public void putAnchorViewState(AnchorViewState anchorViewState) {
    }

    public void putNormalizationPosition(int i2, @Nullable Integer num) {
    }

    public void putOrientation(int i2) {
    }

    public void putPositionsCache(int i2, Parcelable parcelable) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ParcelableContainer() {
    }

    private ParcelableContainer(Parcel parcel) {
    }
}
