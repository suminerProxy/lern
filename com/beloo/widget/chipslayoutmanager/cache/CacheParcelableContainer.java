package com.beloo.widget.chipslayoutmanager.cache;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.NavigableSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class CacheParcelableContainer implements Parcelable {
    public static final Parcelable.Creator<CacheParcelableContainer> CREATOR = null;
    private NavigableSet<Integer> endsRow;
    private NavigableSet<Integer> startsRow;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a implements Parcelable.Creator<CacheParcelableContainer> {
        public CacheParcelableContainer a(Parcel parcel) {
        }

        public CacheParcelableContainer[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CacheParcelableContainer createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CacheParcelableContainer[] newArray(int i2) {
        }
    }

    public /* synthetic */ CacheParcelableContainer(Parcel parcel, a aVar) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public NavigableSet<Integer> getEndsRow() {
    }

    public NavigableSet<Integer> getStartsRow() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public CacheParcelableContainer(NavigableSet<Integer> navigableSet, NavigableSet<Integer> navigableSet2) {
    }

    private CacheParcelableContainer(Parcel parcel) {
    }
}
