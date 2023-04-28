package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.common.collect.ImmutableList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR = null;
    @Deprecated
    public static final TrackSelectionParameters DEFAULT = null;
    public static final TrackSelectionParameters DEFAULT_WITHOUT_CONTEXT = null;
    public final boolean forceHighestSupportedBitrate;
    public final boolean forceLowestBitrate;
    public final int maxAudioBitrate;
    public final int maxAudioChannelCount;
    public final int maxVideoBitrate;
    public final int maxVideoFrameRate;
    public final int maxVideoHeight;
    public final int maxVideoWidth;
    public final int minVideoBitrate;
    public final int minVideoFrameRate;
    public final int minVideoHeight;
    public final int minVideoWidth;
    public final ImmutableList<String> preferredAudioLanguages;
    public final ImmutableList<String> preferredAudioMimeTypes;
    public final int preferredAudioRoleFlags;
    public final ImmutableList<String> preferredTextLanguages;
    public final int preferredTextRoleFlags;
    public final ImmutableList<String> preferredVideoMimeTypes;
    public final boolean selectUndeterminedTextLanguage;
    public final int viewportHeight;
    public final boolean viewportOrientationMayChange;
    public final int viewportWidth;

    /* renamed from: com.google.android.exoplayer2.trackselection.TrackSelectionParameters$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Parcelable.Creator<TrackSelectionParameters> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TrackSelectionParameters createFromParcel(Parcel in) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TrackSelectionParameters[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrackSelectionParameters createFromParcel(Parcel in) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrackSelectionParameters[] newArray(int size) {
        }
    }

    public TrackSelectionParameters(Builder builder) {
    }

    public static TrackSelectionParameters getDefaults(Context context) {
    }

    public Builder buildUpon() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public int hashCode() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Builder {
        private boolean forceHighestSupportedBitrate;
        private boolean forceLowestBitrate;
        private int maxAudioBitrate;
        private int maxAudioChannelCount;
        private int maxVideoBitrate;
        private int maxVideoFrameRate;
        private int maxVideoHeight;
        private int maxVideoWidth;
        private int minVideoBitrate;
        private int minVideoFrameRate;
        private int minVideoHeight;
        private int minVideoWidth;
        private ImmutableList<String> preferredAudioLanguages;
        private ImmutableList<String> preferredAudioMimeTypes;
        private int preferredAudioRoleFlags;
        private ImmutableList<String> preferredTextLanguages;
        private int preferredTextRoleFlags;
        private ImmutableList<String> preferredVideoMimeTypes;
        private boolean selectUndeterminedTextLanguage;
        private int viewportHeight;
        private boolean viewportOrientationMayChange;
        private int viewportWidth;

        @Deprecated
        public Builder() {
        }

        public static /* synthetic */ int access$000(Builder builder) {
        }

        public static /* synthetic */ int access$100(Builder builder) {
        }

        public static /* synthetic */ boolean access$1000(Builder builder) {
        }

        public static /* synthetic */ ImmutableList access$1100(Builder builder) {
        }

        public static /* synthetic */ ImmutableList access$1200(Builder builder) {
        }

        public static /* synthetic */ int access$1300(Builder builder) {
        }

        public static /* synthetic */ int access$1400(Builder builder) {
        }

        public static /* synthetic */ int access$1500(Builder builder) {
        }

        public static /* synthetic */ ImmutableList access$1600(Builder builder) {
        }

        public static /* synthetic */ ImmutableList access$1700(Builder builder) {
        }

        public static /* synthetic */ int access$1800(Builder builder) {
        }

        public static /* synthetic */ boolean access$1900(Builder builder) {
        }

        public static /* synthetic */ int access$200(Builder builder) {
        }

        public static /* synthetic */ boolean access$2000(Builder builder) {
        }

        public static /* synthetic */ boolean access$2100(Builder builder) {
        }

        public static /* synthetic */ int access$300(Builder builder) {
        }

        public static /* synthetic */ int access$400(Builder builder) {
        }

        public static /* synthetic */ int access$500(Builder builder) {
        }

        public static /* synthetic */ int access$600(Builder builder) {
        }

        public static /* synthetic */ int access$700(Builder builder) {
        }

        public static /* synthetic */ int access$800(Builder builder) {
        }

        public static /* synthetic */ int access$900(Builder builder) {
        }

        @RequiresApi(19)
        private void setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettingsV19(Context context) {
        }

        public TrackSelectionParameters build() {
        }

        public Builder clearVideoSizeConstraints() {
        }

        public Builder clearViewportSizeConstraints() {
        }

        public Builder setForceHighestSupportedBitrate(boolean forceHighestSupportedBitrate) {
        }

        public Builder setForceLowestBitrate(boolean forceLowestBitrate) {
        }

        public Builder setMaxAudioBitrate(int maxAudioBitrate) {
        }

        public Builder setMaxAudioChannelCount(int maxAudioChannelCount) {
        }

        public Builder setMaxVideoBitrate(int maxVideoBitrate) {
        }

        public Builder setMaxVideoFrameRate(int maxVideoFrameRate) {
        }

        public Builder setMaxVideoSize(int maxVideoWidth, int maxVideoHeight) {
        }

        public Builder setMaxVideoSizeSd() {
        }

        public Builder setMinVideoBitrate(int minVideoBitrate) {
        }

        public Builder setMinVideoFrameRate(int minVideoFrameRate) {
        }

        public Builder setMinVideoSize(int minVideoWidth, int minVideoHeight) {
        }

        public Builder setPreferredAudioLanguage(@Nullable String preferredAudioLanguage) {
        }

        public Builder setPreferredAudioLanguages(String... preferredAudioLanguages) {
        }

        public Builder setPreferredAudioMimeType(@Nullable String mimeType) {
        }

        public Builder setPreferredAudioMimeTypes(String... mimeTypes) {
        }

        public Builder setPreferredAudioRoleFlags(int preferredAudioRoleFlags) {
        }

        public Builder setPreferredTextLanguage(@Nullable String preferredTextLanguage) {
        }

        public Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
        }

        public Builder setPreferredTextLanguages(String... preferredTextLanguages) {
        }

        public Builder setPreferredTextRoleFlags(int preferredTextRoleFlags) {
        }

        public Builder setPreferredVideoMimeType(@Nullable String mimeType) {
        }

        public Builder setPreferredVideoMimeTypes(String... mimeTypes) {
        }

        public Builder setSelectUndeterminedTextLanguage(boolean selectUndeterminedTextLanguage) {
        }

        public Builder setViewportSize(int viewportWidth, int viewportHeight, boolean viewportOrientationMayChange) {
        }

        public Builder setViewportSizeToPhysicalDisplaySize(Context context, boolean viewportOrientationMayChange) {
        }

        public Builder(Context context) {
        }

        public Builder(TrackSelectionParameters initialValues) {
        }
    }

    public TrackSelectionParameters(Parcel in) {
    }
}
