package com.tencent.cloud.huiyansdkface.okhttp3;

import com.tencent.cloud.huiyansdkface.okhttp3.internal.NamedRunnable;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.http.RetryAndFollowUpInterceptor;
import com.tencent.cloud.huiyansdkface.okio.AsyncTimeout;
import com.tencent.cloud.huiyansdkface.okio.Timeout;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class RealCall implements Call {

    /* renamed from: a  reason: collision with root package name */
    public final OkHttpClient f10769a;
    public final RetryAndFollowUpInterceptor b;
    public final AsyncTimeout c;

    /* renamed from: d  reason: collision with root package name */
    public final Request f10770d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10771e;

    /* renamed from: f  reason: collision with root package name */
    private EventListener f10772f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10773g;

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.RealCall$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends AsyncTimeout {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ RealCall f10774a;

        public AnonymousClass1(RealCall realCall) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.AsyncTimeout
        public void timedOut() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AsyncCall extends NamedRunnable {
        private static /* synthetic */ boolean c;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RealCall f10775a;
        private final Callback b;

        public AsyncCall(RealCall realCall, Callback callback) {
        }

        public final String a() {
        }

        public final void a(ExecutorService executorService) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.NamedRunnable
        public final void execute() {
        }
    }

    private RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
    }

    public static /* synthetic */ EventListener a(RealCall realCall) {
    }

    public static RealCall a(OkHttpClient okHttpClient, Request request, boolean z) {
    }

    private void c() {
    }

    public final IOException a(IOException iOException) {
    }

    public final String a() {
    }

    public final Response b() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Call
    public final void cancel() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Call
    public final /* bridge */ /* synthetic */ Call clone() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Call
    public final RealCall clone() {
    }

    /* renamed from: clone  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ Object m33clone() throws CloneNotSupportedException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Call
    public final void enqueue(Callback callback) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Call
    public final Response execute() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Call
    public final boolean isCanceled() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Call
    public final synchronized boolean isExecuted() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Call
    public final Request request() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Call
    public final Timeout timeout() {
    }
}
