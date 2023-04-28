package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface ControllerListener<INFO> {
    void onFailure(String id, Throwable throwable);

    void onFinalImageSet(String id, @Nullable INFO imageInfo, @Nullable Animatable animatable);

    void onIntermediateImageFailed(String id, Throwable throwable);

    void onIntermediateImageSet(String id, @Nullable INFO imageInfo);

    void onRelease(String id);

    void onSubmit(String id, Object callerContext);
}
