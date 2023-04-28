package androidx.media;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesImpl;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mContentType;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mFlags;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mLegacyStream;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mUsage;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Builder implements AudioAttributesImpl.Builder {
        private int mContentType;
        private int mFlags;
        private int mLegacyStream;
        private int mUsage;

        public Builder() {
        }

        private Builder setInternalLegacyStreamType(int streamType) {
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        public AudioAttributesImpl build() {
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        public /* bridge */ /* synthetic */ AudioAttributesImpl.Builder setContentType(int contentType) {
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        public /* bridge */ /* synthetic */ AudioAttributesImpl.Builder setFlags(int flags) {
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        public /* bridge */ /* synthetic */ AudioAttributesImpl.Builder setLegacyStreamType(int streamType) {
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        public /* bridge */ /* synthetic */ AudioAttributesImpl.Builder setUsage(int usage) {
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        public Builder setContentType(int contentType) {
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        public Builder setFlags(int flags) {
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        public Builder setLegacyStreamType(int streamType) {
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        public Builder setUsage(int usage) {
        }

        public Builder(AudioAttributesCompat aa) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesImplBase() {
    }

    public static int usageForStreamType(int streamType) {
    }

    public boolean equals(Object o2) {
    }

    @Override // androidx.media.AudioAttributesImpl
    @Nullable
    public Object getAudioAttributes() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getLegacyStreamType() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getRawLegacyStreamType() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getUsage() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
    }

    public int hashCode() {
    }

    @NonNull
    public String toString() {
    }

    public AudioAttributesImplBase(int contentType, int flags, int usage, int legacyStream) {
    }
}
