package com.tencent.cloud.huiyansdkface.wehttp2;

import com.tencent.cloud.huiyansdkface.wehttp2.WeReq;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class WeBaseCallback<T> extends BaseCallback<Resp<T>> {

    /* renamed from: a  reason: collision with root package name */
    private static int f11276a;
    private int b;

    public static void successCodeGlobal(int i2) {
    }

    public abstract void failed(WeReq weReq, WeReq.ErrType errType, int i2, String str, IOException iOException);

    @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
    public void onFailed(WeReq weReq, WeReq.ErrType errType, int i2, String str, IOException iOException) {
    }

    public void onSuccess(WeReq weReq, Resp<T> resp) {
    }

    @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
    public /* bridge */ /* synthetic */ void onSuccess(WeReq weReq, Object obj) {
    }

    public abstract void success(WeReq weReq, T t);

    public WeBaseCallback<T> successCode(int i2) {
    }
}
