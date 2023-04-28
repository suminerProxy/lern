package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BaseControllerListener<INFO> implements ControllerListener<INFO> {
    private static final ControllerListener<Object> NO_OP_LISTENER = null;

    public static <INFO> ControllerListener<INFO> getNoOpListener() {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFailure(String id, Throwable throwable) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFinalImageSet(String id, @Nullable INFO imageInfo, @Nullable Animatable animatable) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageFailed(String id, Throwable throwable) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageSet(String id, @Nullable INFO imageInfo) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onRelease(String id) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onSubmit(String id, Object callerContext) {
    }
}
