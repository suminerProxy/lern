package androidx.media;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesImpl;

@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributes mAudioAttributes;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mLegacyStreamType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Builder implements AudioAttributesImpl.Builder {
        public final AudioAttributes.Builder mFwkBuilder;

        public Builder() {
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

        public Builder(Object aa) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesImplApi21() {
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
    @SuppressLint({"NewApi"})
    public int getVolumeControlStream() {
    }

    public int hashCode() {
    }

    @NonNull
    public String toString() {
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int explicitLegacyStream) {
    }
}
