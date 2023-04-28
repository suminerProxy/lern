package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = null;
    public static final String ID = "COMM";
    public final String description;
    public final String language;
    public final String text;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.CommentFrame$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CommentFrame createFromParcel(Parcel in) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CommentFrame[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CommentFrame createFromParcel(Parcel in) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CommentFrame[] newArray(int size) {
        }
    }

    public CommentFrame(String language, String description, String text) {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
    }

    public CommentFrame(Parcel in) {
    }
}
