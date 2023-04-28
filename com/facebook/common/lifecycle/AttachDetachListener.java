package com.facebook.common.lifecycle;

import android.view.View;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface AttachDetachListener {
    void onAttachToView(View view);

    void onDetachFromView(View view);
}
