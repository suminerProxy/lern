package com.facebook.fresco.ui.common;

import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.infer.annotation.Nullsafe;
import java.util.List;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ForwardingControllerListener2<I> extends BaseControllerListener2<I> {
    private static final String TAG = "FwdControllerListener2";
    private final List<ControllerListener2<I>> mListeners;

    private synchronized void onException(String message, Throwable t) {
    }

    public synchronized void addListener(ControllerListener2<I> listener) {
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onFailure(String id, @Nullable Throwable throwable, @Nullable ControllerListener2.Extras extras) {
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onFinalImageSet(String id, @Nullable I imageInfo, @Nullable ControllerListener2.Extras extraData) {
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onRelease(String id, @Nullable ControllerListener2.Extras extras) {
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onSubmit(String id, @Nullable Object callerContext, @Nullable ControllerListener2.Extras extras) {
    }

    public synchronized void removeAllListeners() {
    }

    public synchronized void removeListener(ControllerListener2<I> listener) {
    }
}
