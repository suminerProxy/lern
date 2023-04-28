package com.flurgle.camerakit;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.collection.SparseArrayCompat;
import h.j.a.t;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class AspectRatio implements Comparable<AspectRatio>, Parcelable {
    public static final Parcelable.Creator<AspectRatio> CREATOR = null;
    private static final SparseArrayCompat<SparseArrayCompat<AspectRatio>> sCache = null;
    private final int mX;
    private final int mY;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class a implements Parcelable.Creator<AspectRatio> {
        public AspectRatio a(Parcel parcel) {
        }

        public AspectRatio[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AspectRatio createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AspectRatio[] newArray(int i2) {
        }
    }

    private AspectRatio(int i2, int i3) {
    }

    private static int gcd(int i2, int i3) {
    }

    public static AspectRatio of(int i2, int i3) {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(@NonNull AspectRatio aspectRatio) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public int getX() {
    }

    public int getY() {
    }

    public int hashCode() {
    }

    public AspectRatio inverse() {
    }

    public boolean matches(t tVar) {
    }

    public float toFloat() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    /* renamed from: compareTo  reason: avoid collision after fix types in other method */
    public int compareTo2(@NonNull AspectRatio aspectRatio) {
    }
}
