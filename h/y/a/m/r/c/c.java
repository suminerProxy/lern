package h.y.a.m.r.c;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import okhttp3.Cookie;

/* compiled from: SetCookieCache.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class c implements h.y.a.m.r.c.a {
    private Set<b> b = new HashSet();

    /* compiled from: SetCookieCache.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements Iterator<Cookie> {
        private Iterator<b> b;

        public a() {
            this.b = c.this.b.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Cookie next() {
            return this.b.next().b();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.b.remove();
        }
    }

    @Override // h.y.a.m.r.c.a
    public void addAll(Collection<Cookie> collection) {
        for (b bVar : b.a(collection)) {
            this.b.remove(bVar);
            this.b.add(bVar);
        }
    }

    @Override // h.y.a.m.r.c.a
    public void clear() {
        this.b.clear();
    }

    @Override // java.lang.Iterable
    public Iterator<Cookie> iterator() {
        return new a();
    }
}
