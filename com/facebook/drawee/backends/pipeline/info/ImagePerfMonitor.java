package com.facebook.drawee.backends.pipeline.info;

import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.time.MonotonicClock;
import com.facebook.drawee.backends.pipeline.PipelineDraweeController;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.backends.pipeline.info.internal.ImagePerfControllerListener2;
import com.facebook.drawee.backends.pipeline.info.internal.ImagePerfRequestListener;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.listener.ForwardingRequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.util.List;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImagePerfMonitor implements ImagePerfNotifier {
    private final Supplier<Boolean> mAsyncLogging;
    private boolean mEnabled;
    @Nullable
    private ForwardingRequestListener mForwardingRequestListener;
    @Nullable
    private ImageOriginListener mImageOriginListener;
    @Nullable
    private ImageOriginRequestListener mImageOriginRequestListener;
    @Nullable
    private ImagePerfControllerListener2 mImagePerfControllerListener2;
    @Nullable
    private List<ImagePerfDataListener> mImagePerfDataListeners;
    @Nullable
    private ImagePerfRequestListener mImagePerfRequestListener;
    private final ImagePerfState mImagePerfState;
    private final MonotonicClock mMonotonicClock;
    private final PipelineDraweeController mPipelineDraweeController;

    public ImagePerfMonitor(MonotonicClock monotonicClock, PipelineDraweeController pipelineDraweeController, Supplier<Boolean> asyncLogging) {
    }

    private void setupListeners() {
    }

    public void addImagePerfDataListener(@Nullable ImagePerfDataListener imagePerfDataListener) {
    }

    public void addViewportData() {
    }

    public void clearImagePerfDataListeners() {
    }

    @Override // com.facebook.drawee.backends.pipeline.info.ImagePerfNotifier
    public void notifyListenersOfVisibilityStateUpdate(ImagePerfState state, int visibilityState) {
    }

    @Override // com.facebook.drawee.backends.pipeline.info.ImagePerfNotifier
    public void notifyStatusUpdated(ImagePerfState state, int imageLoadStatus) {
    }

    public void removeImagePerfDataListener(ImagePerfDataListener imagePerfDataListener) {
    }

    public void reset() {
    }

    public void setEnabled(boolean enabled) {
    }

    public void updateImageRequestData(AbstractDraweeControllerBuilder<PipelineDraweeControllerBuilder, ImageRequest, CloseableReference<CloseableImage>, ImageInfo> pipelineDraweeControllerBuilder) {
    }
}
