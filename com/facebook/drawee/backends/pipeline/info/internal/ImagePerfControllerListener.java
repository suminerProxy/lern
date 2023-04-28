package com.facebook.drawee.backends.pipeline.info.internal;

import android.graphics.drawable.Animatable;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.time.MonotonicClock;
import com.facebook.drawee.backends.pipeline.info.ImagePerfMonitor;
import com.facebook.drawee.backends.pipeline.info.ImagePerfState;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.fresco.ui.common.DimensionsInfo;
import com.facebook.fresco.ui.common.OnDrawControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImagePerfControllerListener extends BaseControllerListener<ImageInfo> implements OnDrawControllerListener<ImageInfo> {
    private final MonotonicClock mClock;
    private final ImagePerfMonitor mImagePerfMonitor;
    private final ImagePerfState mImagePerfState;

    public ImagePerfControllerListener(MonotonicClock clock, ImagePerfState imagePerfState, ImagePerfMonitor imagePerfMonitor) {
    }

    @VisibleForTesting
    private void reportViewInvisible(long time) {
    }

    @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
    public void onFailure(String id, Throwable throwable) {
    }

    @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
    public /* bridge */ /* synthetic */ void onFinalImageSet(String id, @Nullable Object imageInfo, @Nullable Animatable animatable) {
    }

    @Override // com.facebook.fresco.ui.common.OnDrawControllerListener
    public /* bridge */ /* synthetic */ void onImageDrawn(String id, ImageInfo info, DimensionsInfo dimensionsInfo) {
    }

    @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
    public /* bridge */ /* synthetic */ void onIntermediateImageSet(String id, @Nullable Object imageInfo) {
    }

    @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
    public void onRelease(String id) {
    }

    @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
    public void onSubmit(String id, Object callerContext) {
    }

    @VisibleForTesting
    public void reportViewVisible(long now) {
    }

    public void onFinalImageSet(String id, @Nullable ImageInfo imageInfo, @Nullable Animatable animatable) {
    }

    /* renamed from: onImageDrawn  reason: avoid collision after fix types in other method */
    public void onImageDrawn2(String id, ImageInfo info, DimensionsInfo dimensionsInfo) {
    }

    public void onIntermediateImageSet(String id, @Nullable ImageInfo imageInfo) {
    }
}
