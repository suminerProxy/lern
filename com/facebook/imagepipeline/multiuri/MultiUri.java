package com.facebook.imagepipeline.multiuri;

import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MultiUri {
    @Nullable
    private ImageRequest mHighResImageRequest;
    @Nullable
    private ImageRequest mLowResImageRequest;
    @Nullable
    private ImageRequest[] mMultiImageRequests;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Builder {
        @Nullable
        private ImageRequest mHighResImageRequest;
        @Nullable
        private ImageRequest mLowResImageRequest;
        @Nullable
        private ImageRequest[] mMultiImageRequests;

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ ImageRequest access$000(Builder builder) {
        }

        public static /* synthetic */ ImageRequest access$100(Builder builder) {
        }

        public static /* synthetic */ ImageRequest[] access$200(Builder builder) {
        }

        public MultiUri build() {
        }

        public Builder setHighResImageRequest(@Nullable ImageRequest highResImageRequest) {
        }

        public Builder setImageRequests(@Nullable ImageRequest... multiImageRequests) {
        }

        public Builder setLowResImageRequest(@Nullable ImageRequest lowResImageRequest) {
        }

        private Builder() {
        }
    }

    public /* synthetic */ MultiUri(Builder builder, AnonymousClass1 anonymousClass1) {
    }

    public static Builder create() {
    }

    @Nullable
    public ImageRequest getHighResImageRequest() {
    }

    @Nullable
    public ImageRequest getLowResImageRequest() {
    }

    @Nullable
    public ImageRequest[] getMultiImageRequests() {
    }

    private MultiUri(Builder builder) {
    }
}
