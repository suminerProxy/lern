package com.tencent.cloud.huiyansdkface.okhttp3;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface CookieJar {

    /* renamed from: a  reason: collision with root package name */
    public static final CookieJar f10682a = null;

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.CookieJar$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 implements CookieJar {
        @Override // com.tencent.cloud.huiyansdkface.okhttp3.CookieJar
        public final List<Cookie> loadForRequest(HttpUrl httpUrl) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.CookieJar
        public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        }
    }

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);
}
