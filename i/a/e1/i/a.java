package i.a.e1.i;

import i.a.e1.b.d;
import i.a.e1.b.f;
import i.a.e1.b.h;
import i.a.e1.c.i0;
import i.a.e1.c.q0;
import i.a.e1.g.g;
import i.a.e1.h.f.e.k;
import i.a.e1.h.f.e.s2;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: ConnectableObservable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class a<T> extends i0<T> {
    @h("none")
    @f
    @d
    public i0<T> A8(int numberOfSubscribers) {
        return B8(numberOfSubscribers, i.a.e1.h.b.a.h());
    }

    @h("none")
    @f
    @d
    public i0<T> B8(int numberOfSubscribers, @f g<? super i.a.e1.d.f> connection) {
        Objects.requireNonNull(connection, "connection is null");
        if (numberOfSubscribers <= 0) {
            D8(connection);
            return i.a.e1.l.a.U(this);
        }
        return i.a.e1.l.a.R(new k(this, numberOfSubscribers, connection));
    }

    @f
    @h("none")
    public final i.a.e1.d.f C8() {
        i.a.e1.h.k.g gVar = new i.a.e1.h.k.g();
        D8(gVar);
        return gVar.b;
    }

    @h("none")
    public abstract void D8(@f g<? super i.a.e1.d.f> connection);

    @f
    @d
    @h("none")
    public i0<T> E8() {
        return i.a.e1.l.a.R(new s2(this));
    }

    @h("none")
    @f
    @d
    public final i0<T> F8(int subscriberCount) {
        return H8(subscriberCount, 0L, TimeUnit.NANOSECONDS, i.a.e1.n.b.j());
    }

    @h("io.reactivex:computation")
    @f
    @d
    public final i0<T> G8(int subscriberCount, long timeout, @f TimeUnit unit) {
        return H8(subscriberCount, timeout, unit, i.a.e1.n.b.a());
    }

    @h("custom")
    @f
    @d
    public final i0<T> H8(int subscriberCount, long timeout, @f TimeUnit unit, @f q0 scheduler) {
        i.a.e1.h.b.b.b(subscriberCount, "subscriberCount");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.R(new s2(this, subscriberCount, timeout, unit, scheduler));
    }

    @h("io.reactivex:computation")
    @f
    @d
    public final i0<T> I8(long timeout, @f TimeUnit unit) {
        return H8(1, timeout, unit, i.a.e1.n.b.a());
    }

    @h("custom")
    @f
    @d
    public final i0<T> J8(long timeout, @f TimeUnit unit, @f q0 scheduler) {
        return H8(1, timeout, unit, scheduler);
    }

    @h("none")
    public abstract void K8();

    @f
    @d
    @h("none")
    public i0<T> z8() {
        return A8(1);
    }
}
