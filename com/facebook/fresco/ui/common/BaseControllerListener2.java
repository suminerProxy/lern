package com.facebook.fresco.ui.common;

import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BaseControllerListener2<INFO> implements ControllerListener2<INFO> {
    private static final ControllerListener2 NO_OP_LISTENER = null;

    public static <I> ControllerListener2<I> getNoOpListener() {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onFailure(String id, @Nullable Throwable throwable, @Nullable ControllerListener2.Extras extras) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onFinalImageSet(String id, @Nullable INFO imageInfo, @Nullable ControllerListener2.Extras extraData) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onIntermediateImageFailed(String id) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onIntermediateImageSet(String id, @Nullable INFO imageInfo) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onRelease(String id, @Nullable ControllerListener2.Extras extras) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onSubmit(String id, @Nullable Object callerContext, @Nullable ControllerListener2.Extras extras) {
    }
}
