package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ParcelableSparseArray extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseArray> CREATOR = null;

    /* renamed from: com.google.android.material.internal.ParcelableSparseArray$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Parcelable.ClassLoaderCreator<ParcelableSparseArray> {
        @Override // android.os.Parcelable.Creator
        @Nullable
        public /* bridge */ /* synthetic */ Object createFromParcel(@NonNull Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        public /* bridge */ /* synthetic */ ParcelableSparseArray createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public ParcelableSparseArray[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        public ParcelableSparseArray createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
        }

        @Override // android.os.Parcelable.Creator
        @Nullable
        public ParcelableSparseArray createFromParcel(@NonNull Parcel parcel) {
        }
    }

    public ParcelableSparseArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
    }

    public ParcelableSparseArray(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
    }
}
