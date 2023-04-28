package i.a.e1.f;

import i.a.e1.b.d;
import i.a.e1.b.f;
import i.a.e1.b.h;
import i.a.e1.c.q0;
import i.a.e1.c.s;
import i.a.e1.g.g;
import i.a.e1.h.f.b.e3;
import i.a.e1.h.f.b.k;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: ConnectableFlowable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class a<T> extends s<T> {
    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @d
    public s<T> e9() {
        return f9(1);
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @d
    public s<T> f9(int numberOfSubscribers) {
        return g9(numberOfSubscribers, i.a.e1.h.b.a.h());
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @d
    public s<T> g9(int numberOfSubscribers, @f g<? super i.a.e1.d.f> connection) {
        Objects.requireNonNull(connection, "connection is null");
        if (numberOfSubscribers <= 0) {
            i9(connection);
            return i.a.e1.l.a.T(this);
        }
        return i.a.e1.l.a.P(new k(this, numberOfSubscribers, connection));
    }

    @f
    @h("none")
    public final i.a.e1.d.f h9() {
        i.a.e1.h.k.g gVar = new i.a.e1.h.k.g();
        i9(gVar);
        return gVar.b;
    }

    @h("none")
    public abstract void i9(@f g<? super i.a.e1.d.f> connection);

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @d
    public s<T> j9() {
        return i.a.e1.l.a.P(new e3(this));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @d
    public final s<T> k9(int subscriberCount) {
        return m9(subscriberCount, 0L, TimeUnit.NANOSECONDS, i.a.e1.n.b.j());
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("io.reactivex:computation")
    @f
    @d
    public final s<T> l9(int subscriberCount, long timeout, @f TimeUnit unit) {
        return m9(subscriberCount, timeout, unit, i.a.e1.n.b.a());
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("custom")
    @f
    @d
    public final s<T> m9(int subscriberCount, long timeout, @f TimeUnit unit, @f q0 scheduler) {
        i.a.e1.h.b.b.b(subscriberCount, "subscriberCount");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.P(new e3(this, subscriberCount, timeout, unit, scheduler));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("io.reactivex:computation")
    @f
    @d
    public final s<T> n9(long timeout, @f TimeUnit unit) {
        return m9(1, timeout, unit, i.a.e1.n.b.a());
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("custom")
    @f
    @d
    public final s<T> o9(long timeout, @f TimeUnit unit, @f q0 scheduler) {
        return m9(1, timeout, unit, scheduler);
    }

    @h("none")
    public abstract void p9();
}
