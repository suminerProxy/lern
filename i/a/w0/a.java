package i.a.w0;

import i.a.j0;
import i.a.l;
import i.a.t0.d;
import i.a.t0.f;
import i.a.t0.h;
import i.a.u0.c;
import i.a.x0.g;
import i.a.y0.e.b.k;
import i.a.y0.e.b.z2;
import java.util.concurrent.TimeUnit;

/* compiled from: ConnectableFlowable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class a<T> extends l<T> {
    @f
    public l<T> I8() {
        return J8(1);
    }

    @f
    public l<T> J8(int i2) {
        return K8(i2, i.a.y0.b.a.h());
    }

    @f
    public l<T> K8(int i2, @f g<? super c> gVar) {
        if (i2 <= 0) {
            M8(gVar);
            return i.a.c1.a.T(this);
        }
        return i.a.c1.a.P(new k(this, i2, gVar));
    }

    public final c L8() {
        i.a.y0.j.g gVar = new i.a.y0.j.g();
        M8(gVar);
        return gVar.b;
    }

    public abstract void M8(@f g<? super c> gVar);

    @h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    @d
    @f
    public l<T> N8() {
        return i.a.c1.a.P(new z2(this));
    }

    @d
    @h("none")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> O8(int i2) {
        return Q8(i2, 0L, TimeUnit.NANOSECONDS, i.a.f1.b.i());
    }

    @d
    @h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> P8(int i2, long j2, TimeUnit timeUnit) {
        return Q8(i2, j2, timeUnit, i.a.f1.b.a());
    }

    @d
    @h("custom")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> Q8(int i2, long j2, TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.h(i2, "subscriberCount");
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.P(new z2(this, i2, j2, timeUnit, j0Var));
    }

    @d
    @h("io.reactivex:computation")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> R8(long j2, TimeUnit timeUnit) {
        return Q8(1, j2, timeUnit, i.a.f1.b.a());
    }

    @d
    @h("custom")
    @i.a.t0.b(i.a.t0.a.PASS_THROUGH)
    public final l<T> S8(long j2, TimeUnit timeUnit, j0 j0Var) {
        return Q8(1, j2, timeUnit, j0Var);
    }
}
