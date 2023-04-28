package com.facebook.fresco.ui.common;

import android.net.Uri;
import com.facebook.common.internal.Fn;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class MultiUriHelper {
    @Nullable
    public static <T> Uri getMainUri(@Nullable T mainRequest, @Nullable T lowResRequest, @Nullable T[] firstAvailableRequest, Fn<T, Uri> requestToUri) {
    }
}
