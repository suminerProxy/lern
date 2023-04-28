package com.facebook.imagepipeline.request;

import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BaseRepeatedPostProcessor extends BasePostprocessor implements RepeatedPostprocessor {
    @Nullable
    private RepeatedPostprocessorRunner mCallback;

    @Nullable
    private synchronized RepeatedPostprocessorRunner getCallback() {
    }

    @Override // com.facebook.imagepipeline.request.RepeatedPostprocessor
    public synchronized void setCallback(RepeatedPostprocessorRunner runner) {
    }

    public void update() {
    }
}
