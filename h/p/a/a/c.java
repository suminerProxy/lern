package h.p.a.a;

/* compiled from: Pair.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class c<A, B> {

    /* renamed from: a  reason: collision with root package name */
    private final A f17713a;
    private final B b;

    private c(A a2, B b) {
        this.f17713a = a2;
        this.b = b;
    }

    public static <A, B> c<A, B> a(A a2, B b) {
        return new c<>(a2, b);
    }

    public A b() {
        return this.f17713a;
    }

    public B c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            A a2 = this.f17713a;
            if (a2 == null) {
                if (cVar.f17713a != null) {
                    return false;
                }
            } else if (!a2.equals(cVar.f17713a)) {
                return false;
            }
            B b = this.b;
            if (b == null) {
                if (cVar.b != null) {
                    return false;
                }
            } else if (!b.equals(cVar.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        A a2 = this.f17713a;
        int hashCode = ((a2 == null ? 0 : a2.hashCode()) + 31) * 31;
        B b = this.b;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        return "first = " + this.f17713a + " , second = " + this.b;
    }
}
