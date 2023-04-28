package com.tencent.cloud.huiyansdkface.wehttp2;

import com.tencent.cloud.huiyansdkface.okhttp3.Cookie;
import com.tencent.cloud.huiyansdkface.okhttp3.HttpUrl;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MemoryCookieJar implements WeCookie, Iterable<Cookie> {
    private HashSet<NamedCookie> b;

    /* renamed from: com.tencent.cloud.huiyansdkface.wehttp2.MemoryCookieJar$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Iterator<Cookie> {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Iterator f11266a;

        public AnonymousClass1(MemoryCookieJar memoryCookieJar, Iterator it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Cookie next() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Cookie next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeCookie
    public void clearCookie() {
    }

    @Override // java.lang.Iterable
    public Iterator<Cookie> iterator() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.CookieJar
    public synchronized List<Cookie> loadForRequest(HttpUrl httpUrl) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.CookieJar
    public synchronized void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
    }
}
