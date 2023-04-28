package com.google.android.exoplayer2.audio;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Bundleable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AudioAttributes implements Bundleable {
    public static final Bundleable.Creator<AudioAttributes> CREATOR = null;
    public static final AudioAttributes DEFAULT = null;
    private static final int FIELD_ALLOWED_CAPTURE_POLICY = 3;
    private static final int FIELD_CONTENT_TYPE = 0;
    private static final int FIELD_FLAGS = 1;
    private static final int FIELD_USAGE = 2;
    public final int allowedCapturePolicy;
    @Nullable
    private android.media.AudioAttributes audioAttributesV21;
    public final int contentType;
    public final int flags;
    public final int usage;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private int allowedCapturePolicy;
        private int contentType;
        private int flags;
        private int usage;

        public AudioAttributes build() {
        }

        public Builder setAllowedCapturePolicy(int allowedCapturePolicy) {
        }

        public Builder setContentType(int contentType) {
        }

        public Builder setFlags(int flags) {
        }

        public Builder setUsage(int usage) {
        }
    }

    public /* synthetic */ AudioAttributes(int i2, int i3, int i4, int i5, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ AudioAttributes a(Bundle bundle) {
    }

    private static String keyForField(int field) {
    }

    public boolean equals(@Nullable Object obj) {
    }

    @RequiresApi(21)
    public android.media.AudioAttributes getAudioAttributesV21() {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    private AudioAttributes(int contentType, int flags, int usage, int allowedCapturePolicy) {
    }
}
