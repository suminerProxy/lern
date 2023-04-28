package com.facebook.drawee.backends.pipeline;

import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.Suppliers;
import com.facebook.drawee.backends.pipeline.info.ImagePerfDataListener;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.infer.annotation.Nullsafe;
import java.util.List;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DraweeConfig {
    @Nullable
    private final ImmutableList<DrawableFactory> mCustomDrawableFactories;
    private final Supplier<Boolean> mDebugOverlayEnabledSupplier;
    @Nullable
    private final ImagePerfDataListener mImagePerfDataListener;
    @Nullable
    private final PipelineDraweeControllerFactory mPipelineDraweeControllerFactory;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Builder {
        @Nullable
        private List<DrawableFactory> mCustomDrawableFactories;
        @Nullable
        private Supplier<Boolean> mDebugOverlayEnabledSupplier;
        @Nullable
        private ImagePerfDataListener mImagePerfDataListener;
        @Nullable
        private PipelineDraweeControllerFactory mPipelineDraweeControllerFactory;

        public static /* synthetic */ List access$000(Builder builder) {
        }

        public static /* synthetic */ Supplier access$100(Builder builder) {
        }

        public static /* synthetic */ PipelineDraweeControllerFactory access$200(Builder builder) {
        }

        public static /* synthetic */ ImagePerfDataListener access$300(Builder builder) {
        }

        public Builder addCustomDrawableFactory(DrawableFactory factory) {
        }

        public DraweeConfig build() {
        }

        public Builder setDebugOverlayEnabledSupplier(Supplier<Boolean> debugOverlayEnabledSupplier) {
        }

        public Builder setDrawDebugOverlay(boolean drawDebugOverlay) {
        }

        public Builder setImagePerfDataListener(@Nullable ImagePerfDataListener imagePerfDataListener) {
        }

        public Builder setPipelineDraweeControllerFactory(PipelineDraweeControllerFactory factory) {
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Nullable
    public ImmutableList<DrawableFactory> getCustomDrawableFactories() {
        return this.mCustomDrawableFactories;
    }

    public Supplier<Boolean> getDebugOverlayEnabledSupplier() {
        return this.mDebugOverlayEnabledSupplier;
    }

    @Nullable
    public ImagePerfDataListener getImagePerfDataListener() {
        return this.mImagePerfDataListener;
    }

    @Nullable
    public PipelineDraweeControllerFactory getPipelineDraweeControllerFactory() {
        return this.mPipelineDraweeControllerFactory;
    }

    private DraweeConfig(Builder builder) {
        Supplier<Boolean> of;
        this.mCustomDrawableFactories = Builder.access$000(builder) != null ? ImmutableList.copyOf(Builder.access$000(builder)) : null;
        if (Builder.access$100(builder) != null) {
            of = Builder.access$100(builder);
        } else {
            of = Suppliers.of(Boolean.FALSE);
        }
        this.mDebugOverlayEnabledSupplier = of;
        this.mPipelineDraweeControllerFactory = Builder.access$200(builder);
        this.mImagePerfDataListener = Builder.access$300(builder);
    }
}
