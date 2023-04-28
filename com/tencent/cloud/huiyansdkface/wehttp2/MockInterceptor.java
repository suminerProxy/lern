package com.tencent.cloud.huiyansdkface.wehttp2;

import com.tencent.cloud.huiyansdkface.okhttp3.HttpUrl;
import com.tencent.cloud.huiyansdkface.okhttp3.Interceptor;
import com.tencent.cloud.huiyansdkface.okhttp3.Request;
import com.tencent.cloud.huiyansdkface.okhttp3.Response;
import com.tencent.cloud.huiyansdkface.okhttp3.ResponseBody;
import java.io.IOException;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MockInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    private List<Mock> f11267a;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class JsonMock<T> implements Mock {
        public boolean isMock(HttpUrl httpUrl, Request request) {
        }

        public boolean isPathMock(String str) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.MockInterceptor.Mock
        public Response mock(Interceptor.Chain chain) {
        }

        public abstract String mockPath();

        public Response resp(Request request) {
        }

        public ResponseBody respBody(Request request) {
        }

        public abstract T respObj(Request request);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface Mock {
        Response mock(Interceptor.Chain chain);
    }

    public MockInterceptor addMock(Mock mock) {
    }

    public MockInterceptor clear() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
    }

    public MockInterceptor removeMock(Mock mock) {
    }
}
