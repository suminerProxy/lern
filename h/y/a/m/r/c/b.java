package h.y.a.m.r.c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.Cookie;

/* compiled from: IdentifiableCookie.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private Cookie f26258a;

    public b(Cookie cookie) {
        this.f26258a = cookie;
    }

    public static List<b> a(Collection<Cookie> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Cookie cookie : collection) {
            arrayList.add(new b(cookie));
        }
        return arrayList;
    }

    public Cookie b() {
        return this.f26258a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            return bVar.f26258a.name().equals(this.f26258a.name()) && bVar.f26258a.domain().equals(this.f26258a.domain()) && bVar.f26258a.path().equals(this.f26258a.path()) && bVar.f26258a.secure() == this.f26258a.secure() && bVar.f26258a.hostOnly() == this.f26258a.hostOnly();
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f26258a.name().hashCode()) * 31) + this.f26258a.domain().hashCode()) * 31) + this.f26258a.path().hashCode()) * 31) + (!this.f26258a.secure())) * 31) + (!this.f26258a.hostOnly());
    }
}
