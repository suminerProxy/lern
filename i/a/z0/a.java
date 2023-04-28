package i.a.z0;

import i.a.b0;
import i.a.j0;
import i.a.t0.d;
import i.a.t0.f;
import i.a.t0.h;
import i.a.u0.c;
import i.a.x0.g;
import i.a.y0.e.e.k;
import i.a.y0.e.e.n2;
import java.util.concurrent.TimeUnit;

/* compiled from: ConnectableObservable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class a<T> extends b0<T> {
    @f
    public b0<T> b() {
        return c(1);
    }

    @f
    public b0<T> c(int i2) {
        return d(i2, i.a.y0.b.a.h());
    }

    @f
    public b0<T> d(int i2, @f g<? super c> gVar) {
        if (i2 <= 0) {
            f(gVar);
            return i.a.c1.a.U(this);
        }
        return i.a.c1.a.R(new k(this, i2, gVar));
    }

    public final c e() {
        i.a.y0.j.g gVar = new i.a.y0.j.g();
        f(gVar);
        return gVar.b;
    }

    public abstract void f(@f g<? super c> gVar);

    @d
    @h("none")
    @f
    public b0<T> g() {
        return i.a.c1.a.R(new n2(this));
    }

    @d
    @h("none")
    public final b0<T> h(int i2) {
        return j(i2, 0L, TimeUnit.NANOSECONDS, i.a.f1.b.i());
    }

    @d
    @h("io.reactivex:computation")
    public final b0<T> i(int i2, long j2, TimeUnit timeUnit) {
        return j(i2, j2, timeUnit, i.a.f1.b.a());
    }

    @d
    @h("custom")
    public final b0<T> j(int i2, long j2, TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.h(i2, "subscriberCount");
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.R(new n2(this, i2, j2, timeUnit, j0Var));
    }

    @d
    @h("io.reactivex:computation")
    public final b0<T> k(long j2, TimeUnit timeUnit) {
        return j(1, j2, timeUnit, i.a.f1.b.a());
    }

    @d
    @h("custom")
    public final b0<T> l(long j2, TimeUnit timeUnit, j0 j0Var) {
        return j(1, j2, timeUnit, j0Var);
    }
}
