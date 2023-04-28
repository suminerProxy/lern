package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TrackGroupArray implements Parcelable {
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = null;
    public static final TrackGroupArray EMPTY = null;
    private int hashCode;
    public final int length;
    private final TrackGroup[] trackGroups;

    /* renamed from: com.google.android.exoplayer2.source.TrackGroupArray$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Parcelable.Creator<TrackGroupArray> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TrackGroupArray createFromParcel(Parcel in) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TrackGroupArray[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrackGroupArray createFromParcel(Parcel in) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrackGroupArray[] newArray(int size) {
        }
    }

    public TrackGroupArray(TrackGroup... trackGroups) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public TrackGroup get(int index) {
    }

    public int hashCode() {
    }

    public int indexOf(TrackGroup group) {
    }

    public boolean isEmpty() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
    }

    public TrackGroupArray(Parcel in) {
    }
}
