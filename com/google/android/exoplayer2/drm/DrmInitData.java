package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = null;
    private int hashCode;
    public final int schemeDataCount;
    private final SchemeData[] schemeDatas;
    @Nullable
    public final String schemeType;

    /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DrmInitData createFromParcel(Parcel in) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DrmInitData[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DrmInitData createFromParcel(Parcel in) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DrmInitData[] newArray(int size) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = null;
        @Nullable
        public final byte[] data;
        private int hashCode;
        @Nullable
        public final String licenseServerUrl;
        public final String mimeType;
        public final UUID uuid;

        /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$SchemeData$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SchemeData createFromParcel(Parcel in) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SchemeData[] newArray(int size) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SchemeData createFromParcel(Parcel in) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SchemeData[] newArray(int size) {
            }
        }

        public SchemeData(UUID uuid, String mimeType, @Nullable byte[] data) {
        }

        public boolean canReplace(SchemeData other) {
        }

        public SchemeData copyWithData(@Nullable byte[] data) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public boolean equals(@Nullable Object obj) {
        }

        public boolean hasData() {
        }

        public int hashCode() {
        }

        public boolean matches(UUID schemeUuid) {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
        }

        public SchemeData(UUID uuid, @Nullable String licenseServerUrl, String mimeType, @Nullable byte[] data) {
        }

        public SchemeData(Parcel in) {
        }
    }

    public DrmInitData(List<SchemeData> schemeDatas) {
    }

    private static boolean containsSchemeDataWithUuid(ArrayList<SchemeData> datas, int limit, UUID uuid) {
    }

    @Nullable
    public static DrmInitData createSessionCreationData(@Nullable DrmInitData manifestData, @Nullable DrmInitData mediaData) {
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(SchemeData first, SchemeData second) {
    }

    public DrmInitData copyWithSchemeType(@Nullable String schemeType) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // java.util.Comparator
    public boolean equals(@Nullable Object obj) {
    }

    public SchemeData get(int index) {
    }

    public int hashCode() {
    }

    public DrmInitData merge(DrmInitData drmInitData) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
    }

    public DrmInitData(@Nullable String schemeType, List<SchemeData> schemeDatas) {
    }

    /* renamed from: compare  reason: avoid collision after fix types in other method */
    public int compare2(SchemeData first, SchemeData second) {
    }

    public DrmInitData(SchemeData... schemeDatas) {
    }

    public DrmInitData(@Nullable String schemeType, SchemeData... schemeDatas) {
    }

    private DrmInitData(@Nullable String schemeType, boolean cloneSchemeDatas, SchemeData... schemeDatas) {
    }

    public DrmInitData(Parcel in) {
    }
}
