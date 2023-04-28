package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = null;
    private static final String TAG = "TrackGroup";
    private final Format[] formats;
    private int hashCode;
    public final int length;

    /* renamed from: com.google.android.exoplayer2.source.TrackGroup$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Parcelable.Creator<TrackGroup> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TrackGroup createFromParcel(Parcel in) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TrackGroup[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrackGroup createFromParcel(Parcel in) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrackGroup[] newArray(int size) {
        }
    }

    public TrackGroup(Format... formats) {
    }

    private static void logErrorMessage(String mismatchField, @Nullable String valueIndex0, @Nullable String otherValue, int otherIndex) {
    }

    private static String normalizeLanguage(@Nullable String language) {
    }

    private static int normalizeRoleFlags(int roleFlags) {
    }

    private void verifyCorrectness() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public Format getFormat(int index) {
    }

    public int hashCode() {
    }

    public int indexOf(Format format) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
    }

    public TrackGroup(Parcel in) {
    }
}
