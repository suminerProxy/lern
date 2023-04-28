package com.efs.sdk.base.http;

import androidx.annotation.NonNull;
import com.efs.sdk.base.core.util.concurrent.b;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class HttpEnv {
    private List<b<HttpResponse>> mHttpListenerList;
    private IHttpUtil mHttpUtil;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SingletonHolder {
        private static final HttpEnv INSTANCE = null;

        private SingletonHolder() {
        }

        public static /* synthetic */ HttpEnv access$100() {
        }
    }

    public /* synthetic */ HttpEnv(AnonymousClass1 anonymousClass1) {
    }

    public static HttpEnv getInstance() {
    }

    public void addListener(@NonNull AbsHttpListener absHttpListener) {
    }

    public List<b<HttpResponse>> getHttpListenerList() {
    }

    public IHttpUtil getHttpUtil() {
    }

    public void removeListener(@NonNull AbsHttpListener absHttpListener) {
    }

    public void setHttpUtil(IHttpUtil iHttpUtil) {
    }

    private HttpEnv() {
    }
}
