package com.facebook.drawee.backends.pipeline.info.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Supplier;
import com.facebook.common.time.MonotonicClock;
import com.facebook.drawee.backends.pipeline.info.ImagePerfNotifier;
import com.facebook.drawee.backends.pipeline.info.ImagePerfState;
import com.facebook.fresco.ui.common.BaseControllerListener2;
import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.DimensionsInfo;
import com.facebook.fresco.ui.common.OnDrawControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImagePerfControllerListener2 extends BaseControllerListener2<ImageInfo> implements OnDrawControllerListener<ImageInfo>, Closeable {
    private static final int WHAT_STATUS = 1;
    private static final int WHAT_VISIBILITY = 2;
    @Nullable
    private static Handler sHandler;
    private final Supplier<Boolean> mAsyncLogging;
    private final MonotonicClock mClock;
    private final ImagePerfNotifier mImagePerfNotifier;
    private final ImagePerfState mImagePerfState;
    private final Supplier<Boolean> mUseNewState;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LogHandler extends Handler {
        private final ImagePerfNotifier mNotifier;

        public LogHandler(@NonNull Looper looper, @NonNull ImagePerfNotifier notifier) {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message msg) {
        }
    }

    public ImagePerfControllerListener2(MonotonicClock clock, ImagePerfState imagePerfState, ImagePerfNotifier imagePerfNotifier, Supplier<Boolean> asyncLogging, Supplier<Boolean> useNewState) {
    }

    private synchronized void initHandler() {
    }

    private ImagePerfState obtainState() {
    }

    @VisibleForTesting
    private void reportViewInvisible(ImagePerfState state, long time) {
    }

    private boolean shouldDispatchAsync() {
    }

    private void updateStatus(ImagePerfState state, int imageLoadStatus) {
    }

    private void updateVisibility(ImagePerfState state, int visibilityState) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onFailure(String id, @Nullable Throwable throwable, @Nullable ControllerListener2.Extras extras) {
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public /* bridge */ /* synthetic */ void onFinalImageSet(String id, @Nullable Object imageInfo, @Nullable ControllerListener2.Extras extraData) {
    }

    @Override // com.facebook.fresco.ui.common.OnDrawControllerListener
    public /* bridge */ /* synthetic */ void onImageDrawn(String id, ImageInfo info, DimensionsInfo dimensionsInfo) {
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public /* bridge */ /* synthetic */ void onIntermediateImageSet(String id, @Nullable Object imageInfo) {
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onRelease(String id, @Nullable ControllerListener2.Extras extras) {
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onSubmit(String id, @Nullable Object callerContext, @Nullable ControllerListener2.Extras extraData) {
    }

    @VisibleForTesting
    public void reportViewVisible(ImagePerfState state, long now) {
    }

    public void resetState() {
    }

    public void onFinalImageSet(String id, @Nullable ImageInfo imageInfo, @Nullable ControllerListener2.Extras extraData) {
    }

    /* renamed from: onImageDrawn  reason: avoid collision after fix types in other method */
    public void onImageDrawn2(String id, ImageInfo info, DimensionsInfo dimensionsInfo) {
    }

    public void onIntermediateImageSet(String id, @Nullable ImageInfo imageInfo) {
    }
}
