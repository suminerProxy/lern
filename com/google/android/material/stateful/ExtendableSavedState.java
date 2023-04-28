package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.customview.view.AbsSavedState;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = null;
    @NonNull
    public final SimpleArrayMap<String, Bundle> extendableStates;

    /* renamed from: com.google.android.material.stateful.ExtendableSavedState$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
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
        public /* bridge */ /* synthetic */ ExtendableSavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public ExtendableSavedState[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        public ExtendableSavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
        }

        @Override // android.os.Parcelable.Creator
        @Nullable
        public ExtendableSavedState createFromParcel(@NonNull Parcel parcel) {
        }
    }

    public /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, AnonymousClass1 anonymousClass1) {
    }

    @NonNull
    public String toString() {
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
    }

    public ExtendableSavedState(Parcelable parcelable) {
    }

    private ExtendableSavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
    }
}
