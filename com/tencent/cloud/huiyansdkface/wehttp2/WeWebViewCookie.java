package com.tencent.cloud.huiyansdkface.wehttp2;

import android.content.Context;
import com.tencent.cloud.huiyansdkface.okhttp3.Cookie;
import com.tencent.cloud.huiyansdkface.okhttp3.HttpUrl;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class WeWebViewCookie implements WeCookie {
    public WeWebViewCookie(Context context) {
    }

    @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeCookie
    public void clearCookie() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.CookieJar
    public synchronized List<Cookie> loadForRequest(HttpUrl httpUrl) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.CookieJar
    public synchronized void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
    }
}
