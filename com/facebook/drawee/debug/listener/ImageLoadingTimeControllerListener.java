package com.facebook.drawee.debug.listener;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImageLoadingTimeControllerListener extends BaseControllerListener {
    private long mFinalImageSetTimeMs;
    @Nullable
    private ImageLoadingTimeListener mImageLoadingTimeListener;
    private long mRequestSubmitTimeMs;

    public ImageLoadingTimeControllerListener(@Nullable ImageLoadingTimeListener imageLoadingTimeListener) {
    }

    @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
    public void onFinalImageSet(String id, @Nullable Object imageInfo, @Nullable Animatable animatable) {
    }

    @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
    public void onSubmit(String id, Object callerContext) {
    }
}
