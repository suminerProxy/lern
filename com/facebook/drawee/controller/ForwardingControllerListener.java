package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import com.facebook.fresco.ui.common.DimensionsInfo;
import com.facebook.fresco.ui.common.OnDrawControllerListener;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ForwardingControllerListener<INFO> implements ControllerListener<INFO>, OnDrawControllerListener<INFO> {
    private static final String TAG = "FdingControllerListener";
    private final List<ControllerListener<? super INFO>> mListeners;

    public static <INFO> ForwardingControllerListener<INFO> create() {
    }

    public static <INFO> ForwardingControllerListener<INFO> of(ControllerListener<? super INFO> listener) {
    }

    private synchronized void onException(String message, Throwable t) {
    }

    public synchronized void addListener(ControllerListener<? super INFO> listener) {
    }

    public synchronized void clearListeners() {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public synchronized void onFailure(String id, Throwable throwable) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public synchronized void onFinalImageSet(String id, @Nullable INFO imageInfo, @Nullable Animatable animatable) {
    }

    @Override // com.facebook.fresco.ui.common.OnDrawControllerListener
    public void onImageDrawn(String id, INFO imageInfo, DimensionsInfo dimensionsInfo) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageFailed(String id, Throwable throwable) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageSet(String id, @Nullable INFO imageInfo) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public synchronized void onRelease(String id) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public synchronized void onSubmit(String id, Object callerContext) {
    }

    public synchronized void removeListener(ControllerListener<? super INFO> listener) {
    }

    public static <INFO> ForwardingControllerListener<INFO> of(ControllerListener<? super INFO> listener1, ControllerListener<? super INFO> listener2) {
    }
}
