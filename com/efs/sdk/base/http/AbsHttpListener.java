package com.efs.sdk.base.http;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.efs.sdk.base.core.util.concurrent.b;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class AbsHttpListener implements b<HttpResponse> {
    public abstract void onError(@Nullable HttpResponse httpResponse);

    public abstract void onSuccess(@NonNull HttpResponse httpResponse);

    @Override // com.efs.sdk.base.core.util.concurrent.b
    public /* bridge */ /* synthetic */ void result(@Nullable HttpResponse httpResponse) {
    }

    /* renamed from: result  reason: avoid collision after fix types in other method */
    public void result2(@Nullable HttpResponse httpResponse) {
    }
}
