package com.tencent.cloud.huiyansdkface.wehttp2;

import com.tencent.cloud.huiyansdkface.wehttp2.WeReq;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class Observable<T> {

    /* renamed from: a  reason: collision with root package name */
    private WeReq f11269a;

    /* renamed from: com.tencent.cloud.huiyansdkface.wehttp2.Observable$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 extends Observable<T> {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ int f11270a;
        private /* synthetic */ String b;

        public AnonymousClass1(int i2, String str) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.Observable
        public final void subscribe(WeReq.Callback<T> callback) {
        }
    }

    public Observable() {
    }

    public Observable(WeReq weReq) {
    }

    public static <T> Observable<T> error(int i2, String str) {
    }

    public void cancel() {
    }

    public abstract void subscribe(WeReq.Callback<T> callback);
}
