package com.sobot.network.http.callback;

import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class Callback<T> {
    public static Callback CALLBACK_DEFAULT;

    /* renamed from: com.sobot.network.http.callback.Callback$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 extends Callback {
        @Override // com.sobot.network.http.callback.Callback
        public void onError(Call call, Exception exc) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public void onResponse(Object obj) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public Object parseNetworkResponse(Response response) throws Exception {
        }
    }

    public void inProgress(float f2) {
    }

    public void onAfter() {
    }

    public void onBefore(Request request) {
    }

    public abstract void onError(Call call, Exception exc);

    public abstract void onResponse(T t);

    public abstract T parseNetworkResponse(Response response) throws Exception;
}
