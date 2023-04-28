package com.facebook.imagepipeline.decoder;

import com.facebook.imageformat.ImageFormat;
import com.facebook.infer.annotation.Nullsafe;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImageDecoderConfig {
    @Nullable
    private final Map<ImageFormat, ImageDecoder> mCustomImageDecoders;
    @Nullable
    private final List<ImageFormat.FormatChecker> mCustomImageFormats;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Builder {
        @Nullable
        private Map<ImageFormat, ImageDecoder> mCustomImageDecoders;
        @Nullable
        private List<ImageFormat.FormatChecker> mCustomImageFormats;

        public static /* synthetic */ Map access$000(Builder builder) {
        }

        public static /* synthetic */ List access$100(Builder builder) {
        }

        public Builder addDecodingCapability(ImageFormat imageFormat, ImageFormat.FormatChecker imageFormatChecker, ImageDecoder decoder) {
        }

        public ImageDecoderConfig build() {
        }

        public Builder overrideDecoder(ImageFormat imageFormat, ImageDecoder decoder) {
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Nullable
    public Map<ImageFormat, ImageDecoder> getCustomImageDecoders() {
        return this.mCustomImageDecoders;
    }

    @Nullable
    public List<ImageFormat.FormatChecker> getCustomImageFormats() {
        return this.mCustomImageFormats;
    }

    private ImageDecoderConfig(Builder builder) {
        this.mCustomImageDecoders = Builder.access$000(builder);
        this.mCustomImageFormats = Builder.access$100(builder);
    }
}
