package h.y.a.m.r;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

/* compiled from: PersistentCookieJar.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private h.y.a.m.r.c.a f26257a;
    private h.y.a.m.r.e.a b;

    public b(h.y.a.m.r.c.a aVar, h.y.a.m.r.e.a aVar2) {
        this.f26257a = aVar;
        this.b = aVar2;
        aVar.addAll(aVar2.b());
    }

    private static boolean b(Cookie cookie) {
        return cookie.expiresAt() < System.currentTimeMillis();
    }

    @Override // h.y.a.m.r.a
    public void a() {
        this.f26257a.clear();
        this.f26257a.addAll(this.b.b());
    }

    @Override // h.y.a.m.r.a
    public synchronized void clear() {
        this.f26257a.clear();
        this.b.clear();
    }

    @Override // okhttp3.CookieJar
    public synchronized List<Cookie> loadForRequest(HttpUrl httpUrl) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList = new ArrayList();
        Iterator<Cookie> it = this.f26257a.iterator();
        while (it.hasNext()) {
            Cookie next = it.next();
            if (b(next)) {
                arrayList2.add(next);
                it.remove();
            } else if (next.matches(httpUrl)) {
                arrayList.add(next);
            }
        }
        this.b.removeAll(arrayList2);
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public synchronized void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        this.f26257a.addAll(list);
        this.b.a(list);
    }
}
