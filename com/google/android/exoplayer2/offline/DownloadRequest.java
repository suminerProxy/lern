package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import java.io.IOException;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = null;
    @Nullable
    public final String customCacheKey;
    public final byte[] data;
    public final String id;
    @Nullable
    public final byte[] keySetId;
    @Nullable
    public final String mimeType;
    public final List<StreamKey> streamKeys;
    public final Uri uri;

    /* renamed from: com.google.android.exoplayer2.offline.DownloadRequest$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DownloadRequest createFromParcel(Parcel in) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DownloadRequest[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest createFromParcel(Parcel in) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest[] newArray(int size) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Builder {
        @Nullable
        private String customCacheKey;
        @Nullable
        private byte[] data;
        private final String id;
        @Nullable
        private byte[] keySetId;
        @Nullable
        private String mimeType;
        @Nullable
        private List<StreamKey> streamKeys;
        private final Uri uri;

        public Builder(String id, Uri uri) {
        }

        public DownloadRequest build() {
        }

        public Builder setCustomCacheKey(@Nullable String customCacheKey) {
        }

        public Builder setData(@Nullable byte[] data) {
        }

        public Builder setKeySetId(@Nullable byte[] keySetId) {
        }

        public Builder setMimeType(@Nullable String mimeType) {
        }

        public Builder setStreamKeys(@Nullable List<StreamKey> streamKeys) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class UnsupportedRequestException extends IOException {
    }

    public /* synthetic */ DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, AnonymousClass1 anonymousClass1) {
    }

    public DownloadRequest copyWithId(String id) {
    }

    public DownloadRequest copyWithKeySetId(@Nullable byte[] keySetId) {
    }

    public DownloadRequest copyWithMergedRequest(DownloadRequest newRequest) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object o2) {
    }

    public final int hashCode() {
    }

    public MediaItem toMediaItem() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
    }

    private DownloadRequest(String id, Uri uri, @Nullable String mimeType, List<StreamKey> streamKeys, @Nullable byte[] keySetId, @Nullable String customCacheKey, @Nullable byte[] data) {
    }

    public DownloadRequest(Parcel in) {
    }
}
