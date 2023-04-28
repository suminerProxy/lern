package com.tencent.cloud.huiyansdkface.wehttp2;

import com.tencent.cloud.huiyansdkface.okhttp3.Call;
import com.tencent.cloud.huiyansdkface.okhttp3.Callback;
import com.tencent.cloud.huiyansdkface.okhttp3.HttpUrl;
import com.tencent.cloud.huiyansdkface.okhttp3.Request;
import com.tencent.cloud.huiyansdkface.okhttp3.Response;
import com.tencent.cloud.huiyansdkface.wehttp2.BaseReq;
import com.tencent.cloud.huiyansdkface.wehttp2.WeReq;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class BaseReq<R extends BaseReq> implements WeReq {

    /* renamed from: a  reason: collision with root package name */
    public String f11202a;
    public WeOkHttp b;
    public Request.Builder c;

    /* renamed from: d  reason: collision with root package name */
    private String f11203d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f11204e;

    /* renamed from: f  reason: collision with root package name */
    private Call f11205f;

    /* renamed from: g  reason: collision with root package name */
    private long f11206g;

    /* renamed from: h  reason: collision with root package name */
    private long f11207h;

    /* renamed from: i  reason: collision with root package name */
    private long f11208i;

    /* renamed from: j  reason: collision with root package name */
    private long f11209j;

    /* renamed from: com.tencent.cloud.huiyansdkface.wehttp2.BaseReq$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends Observable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ BaseReq f11210a;

        public AnonymousClass1(BaseReq baseReq, WeReq weReq) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.Observable
        public void subscribe(WeReq.Callback callback) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.tencent.cloud.huiyansdkface.wehttp2.BaseReq$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2<T> implements WeReq.InnerCallback<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeReq.Callback f11211a;
        private boolean b;
        private /* synthetic */ boolean c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ boolean f11212d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ boolean f11213e;

        /* renamed from: com.tencent.cloud.huiyansdkface.wehttp2.BaseReq$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ AnonymousClass2 f11214a;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.cloud.huiyansdkface.wehttp2.BaseReq$2$2  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class RunnableC01782 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ WeReq f11215a;
            private /* synthetic */ Object b;
            private /* synthetic */ AnonymousClass2 c;

            public RunnableC01782(AnonymousClass2 anonymousClass2, WeReq weReq, Object obj) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.cloud.huiyansdkface.wehttp2.BaseReq$2$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass3 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ WeReq f11216a;
            private /* synthetic */ WeReq.ErrType b;
            private /* synthetic */ int c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ String f11217d;

            /* renamed from: e  reason: collision with root package name */
            private /* synthetic */ IOException f11218e;

            /* renamed from: f  reason: collision with root package name */
            private /* synthetic */ AnonymousClass2 f11219f;

            public AnonymousClass3(AnonymousClass2 anonymousClass2, WeReq weReq, WeReq.ErrType errType, int i2, String str, IOException iOException) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass2(BaseReq baseReq, WeReq.Callback callback, boolean z, boolean z2, boolean z3) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onFailed(WeReq weReq, WeReq.ErrType errType, int i2, String str, IOException iOException) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onFinish() {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onStart(WeReq weReq) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onSuccess(WeReq weReq, T t) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.wehttp2.BaseReq$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements Callback {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ WeReq.InnerCallback f11220a;
        private /* synthetic */ Type b;
        private /* synthetic */ BaseReq c;

        public AnonymousClass3(BaseReq baseReq, WeReq.InnerCallback innerCallback, Type type) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.Callback
        public void onResponse(Call call, Response response) {
        }
    }

    public BaseReq(WeOkHttp weOkHttp, String str, String str2) {
    }

    public static /* synthetic */ int a(BaseReq baseReq, IOException iOException) {
    }

    private static HttpUrl.Builder a(HttpUrl.Builder builder, Map<String, String> map) {
    }

    private static void a(Request.Builder builder, Map<String, String> map) {
    }

    public static /* synthetic */ void a(BaseReq baseReq, WeReq.InnerCallback innerCallback, WeReq.ErrType errType, int i2, String str, IOException iOException) {
    }

    public static /* synthetic */ void a(BaseReq baseReq, Object obj, WeReq.InnerCallback innerCallback) {
    }

    public static /* synthetic */ String b(BaseReq baseReq, IOException iOException) {
    }

    private Call d() {
    }

    public final Request.Builder a() {
    }

    public final HttpUrl.Builder b() {
    }

    public abstract Call c();

    public final R callTimeoutInMillis(int i2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq
    public void cancel() {
    }

    public final R connectTimeoutInMillis(long j2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq
    public WeConfig context() {
    }

    @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq
    public <T> WeReq execute(WeReq.Callback<T> callback) {
    }

    @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq
    public <T> T execute(Class<T> cls) throws ReqFailException {
    }

    @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq
    public <T> T execute(Type type) throws ReqFailException {
    }

    public final R header(String str, String str2) {
    }

    public final R param(String str, String str2) {
    }

    public final R param(Map<String, String> map) {
    }

    public final R readTimeoutInMillis(long j2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq
    public Observable subscribe() {
    }

    public final R tag(Object obj) {
    }

    public final R writeTimeoutInMillis(long j2) {
    }
}
