package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = null;
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int averageBitrate;
    public final int bitrate;
    public final int channelCount;
    @Nullable
    public final String codecs;
    @Nullable
    public final ColorInfo colorInfo;
    @Nullable
    public final String containerMimeType;
    @Nullable
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    @Nullable
    public final Class<? extends ExoMediaCrypto> exoMediaCryptoType;
    public final float frameRate;
    private int hashCode;
    public final int height;
    @Nullable
    public final String id;
    public final List<byte[]> initializationData;
    @Nullable
    public final String label;
    @Nullable
    public final String language;
    public final int maxInputSize;
    @Nullable
    public final Metadata metadata;
    public final int pcmEncoding;
    public final int peakBitrate;
    public final float pixelWidthHeightRatio;
    @Nullable
    public final byte[] projectionData;
    public final int roleFlags;
    public final int rotationDegrees;
    @Nullable
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int width;

    /* renamed from: com.google.android.exoplayer2.Format$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Parcelable.Creator<Format> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Format createFromParcel(Parcel in) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Format[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Format createFromParcel(Parcel in) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Format[] newArray(int size) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private int accessibilityChannel;
        private int averageBitrate;
        private int channelCount;
        @Nullable
        private String codecs;
        @Nullable
        private ColorInfo colorInfo;
        @Nullable
        private String containerMimeType;
        @Nullable
        private DrmInitData drmInitData;
        private int encoderDelay;
        private int encoderPadding;
        @Nullable
        private Class<? extends ExoMediaCrypto> exoMediaCryptoType;
        private float frameRate;
        private int height;
        @Nullable
        private String id;
        @Nullable
        private List<byte[]> initializationData;
        @Nullable
        private String label;
        @Nullable
        private String language;
        private int maxInputSize;
        @Nullable
        private Metadata metadata;
        private int pcmEncoding;
        private int peakBitrate;
        private float pixelWidthHeightRatio;
        @Nullable
        private byte[] projectionData;
        private int roleFlags;
        private int rotationDegrees;
        @Nullable
        private String sampleMimeType;
        private int sampleRate;
        private int selectionFlags;
        private int stereoMode;
        private long subsampleOffsetUs;
        private int width;

        public /* synthetic */ Builder(Format format, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ String access$100(Builder builder) {
        }

        public static /* synthetic */ String access$1000(Builder builder) {
        }

        public static /* synthetic */ String access$1100(Builder builder) {
        }

        public static /* synthetic */ int access$1200(Builder builder) {
        }

        public static /* synthetic */ List access$1300(Builder builder) {
        }

        public static /* synthetic */ DrmInitData access$1400(Builder builder) {
        }

        public static /* synthetic */ long access$1500(Builder builder) {
        }

        public static /* synthetic */ int access$1600(Builder builder) {
        }

        public static /* synthetic */ int access$1700(Builder builder) {
        }

        public static /* synthetic */ float access$1800(Builder builder) {
        }

        public static /* synthetic */ int access$1900(Builder builder) {
        }

        public static /* synthetic */ String access$200(Builder builder) {
        }

        public static /* synthetic */ float access$2000(Builder builder) {
        }

        public static /* synthetic */ byte[] access$2100(Builder builder) {
        }

        public static /* synthetic */ int access$2200(Builder builder) {
        }

        public static /* synthetic */ ColorInfo access$2300(Builder builder) {
        }

        public static /* synthetic */ int access$2400(Builder builder) {
        }

        public static /* synthetic */ int access$2500(Builder builder) {
        }

        public static /* synthetic */ int access$2600(Builder builder) {
        }

        public static /* synthetic */ int access$2700(Builder builder) {
        }

        public static /* synthetic */ int access$2800(Builder builder) {
        }

        public static /* synthetic */ int access$2900(Builder builder) {
        }

        public static /* synthetic */ String access$300(Builder builder) {
        }

        public static /* synthetic */ Class access$3000(Builder builder) {
        }

        public static /* synthetic */ int access$400(Builder builder) {
        }

        public static /* synthetic */ int access$500(Builder builder) {
        }

        public static /* synthetic */ int access$600(Builder builder) {
        }

        public static /* synthetic */ int access$700(Builder builder) {
        }

        public static /* synthetic */ String access$800(Builder builder) {
        }

        public static /* synthetic */ Metadata access$900(Builder builder) {
        }

        public Format build() {
        }

        public Builder setAccessibilityChannel(int accessibilityChannel) {
        }

        public Builder setAverageBitrate(int averageBitrate) {
        }

        public Builder setChannelCount(int channelCount) {
        }

        public Builder setCodecs(@Nullable String codecs) {
        }

        public Builder setColorInfo(@Nullable ColorInfo colorInfo) {
        }

        public Builder setContainerMimeType(@Nullable String containerMimeType) {
        }

        public Builder setDrmInitData(@Nullable DrmInitData drmInitData) {
        }

        public Builder setEncoderDelay(int encoderDelay) {
        }

        public Builder setEncoderPadding(int encoderPadding) {
        }

        public Builder setExoMediaCryptoType(@Nullable Class<? extends ExoMediaCrypto> exoMediaCryptoType) {
        }

        public Builder setFrameRate(float frameRate) {
        }

        public Builder setHeight(int height) {
        }

        public Builder setId(@Nullable String id) {
        }

        public Builder setInitializationData(@Nullable List<byte[]> initializationData) {
        }

        public Builder setLabel(@Nullable String label) {
        }

        public Builder setLanguage(@Nullable String language) {
        }

        public Builder setMaxInputSize(int maxInputSize) {
        }

        public Builder setMetadata(@Nullable Metadata metadata) {
        }

        public Builder setPcmEncoding(int pcmEncoding) {
        }

        public Builder setPeakBitrate(int peakBitrate) {
        }

        public Builder setPixelWidthHeightRatio(float pixelWidthHeightRatio) {
        }

        public Builder setProjectionData(@Nullable byte[] projectionData) {
        }

        public Builder setRoleFlags(int roleFlags) {
        }

        public Builder setRotationDegrees(int rotationDegrees) {
        }

        public Builder setSampleMimeType(@Nullable String sampleMimeType) {
        }

        public Builder setSampleRate(int sampleRate) {
        }

        public Builder setSelectionFlags(int selectionFlags) {
        }

        public Builder setStereoMode(int stereoMode) {
        }

        public Builder setSubsampleOffsetUs(long subsampleOffsetUs) {
        }

        public Builder setWidth(int width) {
        }

        public Builder() {
        }

        public Builder setId(int id) {
        }

        private Builder(Format format) {
        }
    }

    public /* synthetic */ Format(Builder builder, AnonymousClass1 anonymousClass1) {
    }

    @Deprecated
    public static Format createAudioSampleFormat(@Nullable String id, @Nullable String sampleMimeType, @Nullable String codecs, int bitrate, int maxInputSize, int channelCount, int sampleRate, @Nullable List<byte[]> initializationData, @Nullable DrmInitData drmInitData, int selectionFlags, @Nullable String language) {
    }

    @Deprecated
    public static Format createContainerFormat(@Nullable String id, @Nullable String label, @Nullable String containerMimeType, @Nullable String sampleMimeType, @Nullable String codecs, int bitrate, int selectionFlags, int roleFlags, @Nullable String language) {
    }

    @Deprecated
    public static Format createSampleFormat(@Nullable String id, @Nullable String sampleMimeType) {
    }

    @Deprecated
    public static Format createVideoSampleFormat(@Nullable String id, @Nullable String sampleMimeType, @Nullable String codecs, int bitrate, int maxInputSize, int width, int height, float frameRate, @Nullable List<byte[]> initializationData, @Nullable DrmInitData drmInitData) {
    }

    public static String toLogString(@Nullable Format format) {
    }

    public Builder buildUpon() {
    }

    @Deprecated
    public Format copyWithBitrate(int bitrate) {
    }

    @Deprecated
    public Format copyWithDrmInitData(@Nullable DrmInitData drmInitData) {
    }

    public Format copyWithExoMediaCryptoType(@Nullable Class<? extends ExoMediaCrypto> exoMediaCryptoType) {
    }

    @Deprecated
    public Format copyWithFrameRate(float frameRate) {
    }

    @Deprecated
    public Format copyWithGaplessInfo(int encoderDelay, int encoderPadding) {
    }

    @Deprecated
    public Format copyWithLabel(@Nullable String label) {
    }

    @Deprecated
    public Format copyWithManifestFormatInfo(Format manifestFormat) {
    }

    @Deprecated
    public Format copyWithMaxInputSize(int maxInputSize) {
    }

    @Deprecated
    public Format copyWithMetadata(@Nullable Metadata metadata) {
    }

    @Deprecated
    public Format copyWithSubsampleOffsetUs(long subsampleOffsetUs) {
    }

    @Deprecated
    public Format copyWithVideoSize(int width, int height) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public int getPixelCount() {
    }

    public int hashCode() {
    }

    public boolean initializationDataEquals(Format other) {
    }

    public String toString() {
    }

    public Format withManifestFormatInfo(Format manifestFormat) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
    }

    private Format(Builder builder) {
    }

    @Deprecated
    public static Format createVideoSampleFormat(@Nullable String id, @Nullable String sampleMimeType, @Nullable String codecs, int bitrate, int maxInputSize, int width, int height, float frameRate, @Nullable List<byte[]> initializationData, int rotationDegrees, float pixelWidthHeightRatio, @Nullable DrmInitData drmInitData) {
    }

    @Deprecated
    public static Format createAudioSampleFormat(@Nullable String id, @Nullable String sampleMimeType, @Nullable String codecs, int bitrate, int maxInputSize, int channelCount, int sampleRate, int pcmEncoding, @Nullable List<byte[]> initializationData, @Nullable DrmInitData drmInitData, int selectionFlags, @Nullable String language) {
    }

    public Format(Parcel in) {
    }
}
