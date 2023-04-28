package i.a.b1;

import com.tencent.android.tpush.common.MessageKey;
import i.a.j0;
import i.a.l;
import i.a.t0.f;
import i.a.x0.o;
import i.a.x0.q;
import i.a.x0.r;
import i.a.y0.e.f.e;
import i.a.y0.e.f.g;
import i.a.y0.e.f.h;
import i.a.y0.e.f.i;
import i.a.y0.e.f.j;
import i.a.y0.e.f.k;
import i.a.y0.e.f.m;
import i.a.y0.e.f.n;
import i.a.y0.e.f.p;
import i.a.y0.j.w;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelFlowable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class b<T> {
    @i.a.t0.d
    @f
    public static <T> b<T> A(@f Publisher<? extends T> publisher, int i2, int i3) {
        i.a.y0.b.b.g(publisher, MessageKey.MSG_SOURCE);
        i.a.y0.b.b.h(i2, "parallelism");
        i.a.y0.b.b.h(i3, "prefetch");
        return i.a.c1.a.V(new h(publisher, i2, i3));
    }

    @i.a.t0.d
    @f
    public static <T> b<T> B(@f Publisher<T>... publisherArr) {
        if (publisherArr.length != 0) {
            return i.a.c1.a.V(new g(publisherArr));
        }
        throw new IllegalArgumentException("Zero publishers not supported");
    }

    @i.a.t0.d
    public static <T> b<T> y(@f Publisher<? extends T> publisher) {
        return A(publisher, Runtime.getRuntime().availableProcessors(), l.U());
    }

    @i.a.t0.d
    public static <T> b<T> z(@f Publisher<? extends T> publisher, int i2) {
        return A(publisher, i2, l.U());
    }

    @i.a.t0.d
    @f
    public final <R> b<R> C(@f o<? super T, ? extends R> oVar) {
        i.a.y0.b.b.g(oVar, "mapper");
        return i.a.c1.a.V(new j(this, oVar));
    }

    @i.a.t0.d
    @f
    public final <R> b<R> D(@f o<? super T, ? extends R> oVar, @f i.a.x0.c<? super Long, ? super Throwable, a> cVar) {
        i.a.y0.b.b.g(oVar, "mapper");
        i.a.y0.b.b.g(cVar, "errorHandler is null");
        return i.a.c1.a.V(new k(this, oVar, cVar));
    }

    @i.a.t0.d
    @f
    public final <R> b<R> E(@f o<? super T, ? extends R> oVar, @f a aVar) {
        i.a.y0.b.b.g(oVar, "mapper");
        i.a.y0.b.b.g(aVar, "errorHandler is null");
        return i.a.c1.a.V(new k(this, oVar, aVar));
    }

    public abstract int F();

    @i.a.t0.d
    @f
    public final l<T> G(@f i.a.x0.c<T, T, T> cVar) {
        i.a.y0.b.b.g(cVar, "reducer");
        return i.a.c1.a.P(new n(this, cVar));
    }

    @i.a.t0.d
    @f
    public final <R> b<R> H(@f Callable<R> callable, @f i.a.x0.c<R, ? super T, R> cVar) {
        i.a.y0.b.b.g(callable, "initialSupplier");
        i.a.y0.b.b.g(cVar, "reducer");
        return i.a.c1.a.V(new m(this, callable, cVar));
    }

    @i.a.t0.d
    @f
    public final b<T> I(@f j0 j0Var) {
        return J(j0Var, l.U());
    }

    @i.a.t0.d
    @f
    public final b<T> J(@f j0 j0Var, int i2) {
        i.a.y0.b.b.g(j0Var, "scheduler");
        i.a.y0.b.b.h(i2, "prefetch");
        return i.a.c1.a.V(new i.a.y0.e.f.o(this, j0Var, i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> K() {
        return L(l.U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @f
    public final l<T> L(int i2) {
        i.a.y0.b.b.h(i2, "prefetch");
        return i.a.c1.a.P(new i(this, i2, false));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @f
    public final l<T> M() {
        return N(l.U());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @f
    public final l<T> N(int i2) {
        i.a.y0.b.b.h(i2, "prefetch");
        return i.a.c1.a.P(new i(this, i2, true));
    }

    @i.a.t0.d
    @f
    public final l<T> O(@f Comparator<? super T> comparator) {
        return P(comparator, 16);
    }

    @i.a.t0.d
    @f
    public final l<T> P(@f Comparator<? super T> comparator, int i2) {
        i.a.y0.b.b.g(comparator, "comparator is null");
        i.a.y0.b.b.h(i2, "capacityHint");
        return i.a.c1.a.P(new p(H(i.a.y0.b.a.f((i2 / F()) + 1), i.a.y0.j.o.instance()).C(new w(comparator)), comparator));
    }

    public abstract void Q(@f Subscriber<? super T>[] subscriberArr);

    @i.a.t0.d
    @f
    public final <U> U R(@f o<? super b<T>, U> oVar) {
        try {
            return (U) ((o) i.a.y0.b.b.g(oVar, "converter is null")).apply(this);
        } catch (Throwable th) {
            i.a.v0.b.b(th);
            throw i.a.y0.j.k.f(th);
        }
    }

    @i.a.t0.d
    @f
    public final l<List<T>> S(@f Comparator<? super T> comparator) {
        return T(comparator, 16);
    }

    @i.a.t0.d
    @f
    public final l<List<T>> T(@f Comparator<? super T> comparator, int i2) {
        i.a.y0.b.b.g(comparator, "comparator is null");
        i.a.y0.b.b.h(i2, "capacityHint");
        return i.a.c1.a.P(H(i.a.y0.b.a.f((i2 / F()) + 1), i.a.y0.j.o.instance()).C(new w(comparator)).G(new i.a.y0.j.p(comparator)));
    }

    public final boolean U(@f Subscriber<?>[] subscriberArr) {
        int F = F();
        if (subscriberArr.length != F) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("parallelism = " + F + ", subscribers = " + subscriberArr.length);
            int length = subscriberArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                i.a.y0.i.g.error(illegalArgumentException, subscriberArr[i2]);
            }
            return false;
        }
        return true;
    }

    @i.a.t0.d
    @f
    public final <R> R a(@f c<T, R> cVar) {
        return (R) ((c) i.a.y0.b.b.g(cVar, "converter is null")).a(this);
    }

    @i.a.t0.d
    @f
    public final <C> b<C> b(@f Callable<? extends C> callable, @f i.a.x0.b<? super C, ? super T> bVar) {
        i.a.y0.b.b.g(callable, "collectionSupplier is null");
        i.a.y0.b.b.g(bVar, "collector is null");
        return i.a.c1.a.V(new i.a.y0.e.f.a(this, callable, bVar));
    }

    @i.a.t0.d
    @f
    public final <U> b<U> c(@f d<T, U> dVar) {
        return i.a.c1.a.V(((d) i.a.y0.b.b.g(dVar, "composer is null")).a(this));
    }

    @i.a.t0.d
    @f
    public final <R> b<R> d(@f o<? super T, ? extends Publisher<? extends R>> oVar) {
        return e(oVar, 2);
    }

    @i.a.t0.d
    @f
    public final <R> b<R> e(@f o<? super T, ? extends Publisher<? extends R>> oVar, int i2) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "prefetch");
        return i.a.c1.a.V(new i.a.y0.e.f.b(this, oVar, i2, i.a.y0.j.j.IMMEDIATE));
    }

    @i.a.t0.d
    @f
    public final <R> b<R> f(@f o<? super T, ? extends Publisher<? extends R>> oVar, int i2, boolean z) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "prefetch");
        return i.a.c1.a.V(new i.a.y0.e.f.b(this, oVar, i2, z ? i.a.y0.j.j.END : i.a.y0.j.j.BOUNDARY));
    }

    @i.a.t0.d
    @f
    public final <R> b<R> g(@f o<? super T, ? extends Publisher<? extends R>> oVar, boolean z) {
        return f(oVar, 2, z);
    }

    @i.a.t0.d
    @f
    public final b<T> h(@f i.a.x0.g<? super T> gVar) {
        i.a.y0.b.b.g(gVar, "onAfterNext is null");
        i.a.x0.g h2 = i.a.y0.b.a.h();
        i.a.x0.g h3 = i.a.y0.b.a.h();
        i.a.x0.a aVar = i.a.y0.b.a.c;
        return i.a.c1.a.V(new i.a.y0.e.f.l(this, h2, gVar, h3, aVar, aVar, i.a.y0.b.a.h(), i.a.y0.b.a.f28143g, aVar));
    }

    @i.a.t0.d
    @f
    public final b<T> i(@f i.a.x0.a aVar) {
        i.a.y0.b.b.g(aVar, "onAfterTerminate is null");
        i.a.x0.g h2 = i.a.y0.b.a.h();
        i.a.x0.g h3 = i.a.y0.b.a.h();
        i.a.x0.g h4 = i.a.y0.b.a.h();
        i.a.x0.a aVar2 = i.a.y0.b.a.c;
        return i.a.c1.a.V(new i.a.y0.e.f.l(this, h2, h3, h4, aVar2, aVar, i.a.y0.b.a.h(), i.a.y0.b.a.f28143g, aVar2));
    }

    @i.a.t0.d
    @f
    public final b<T> j(@f i.a.x0.a aVar) {
        i.a.y0.b.b.g(aVar, "onCancel is null");
        i.a.x0.g h2 = i.a.y0.b.a.h();
        i.a.x0.g h3 = i.a.y0.b.a.h();
        i.a.x0.g h4 = i.a.y0.b.a.h();
        i.a.x0.a aVar2 = i.a.y0.b.a.c;
        return i.a.c1.a.V(new i.a.y0.e.f.l(this, h2, h3, h4, aVar2, aVar2, i.a.y0.b.a.h(), i.a.y0.b.a.f28143g, aVar));
    }

    @i.a.t0.d
    @f
    public final b<T> k(@f i.a.x0.a aVar) {
        i.a.y0.b.b.g(aVar, "onComplete is null");
        i.a.x0.g h2 = i.a.y0.b.a.h();
        i.a.x0.g h3 = i.a.y0.b.a.h();
        i.a.x0.g h4 = i.a.y0.b.a.h();
        i.a.x0.a aVar2 = i.a.y0.b.a.c;
        return i.a.c1.a.V(new i.a.y0.e.f.l(this, h2, h3, h4, aVar, aVar2, i.a.y0.b.a.h(), i.a.y0.b.a.f28143g, aVar2));
    }

    @i.a.t0.d
    @f
    public final b<T> l(@f i.a.x0.g<Throwable> gVar) {
        i.a.y0.b.b.g(gVar, "onError is null");
        i.a.x0.g h2 = i.a.y0.b.a.h();
        i.a.x0.g h3 = i.a.y0.b.a.h();
        i.a.x0.a aVar = i.a.y0.b.a.c;
        return i.a.c1.a.V(new i.a.y0.e.f.l(this, h2, h3, gVar, aVar, aVar, i.a.y0.b.a.h(), i.a.y0.b.a.f28143g, aVar));
    }

    @i.a.t0.d
    @f
    public final b<T> m(@f i.a.x0.g<? super T> gVar) {
        i.a.y0.b.b.g(gVar, "onNext is null");
        i.a.x0.g h2 = i.a.y0.b.a.h();
        i.a.x0.g h3 = i.a.y0.b.a.h();
        i.a.x0.a aVar = i.a.y0.b.a.c;
        return i.a.c1.a.V(new i.a.y0.e.f.l(this, gVar, h2, h3, aVar, aVar, i.a.y0.b.a.h(), i.a.y0.b.a.f28143g, aVar));
    }

    @i.a.t0.d
    @f
    public final b<T> n(@f i.a.x0.g<? super T> gVar, @f i.a.x0.c<? super Long, ? super Throwable, a> cVar) {
        i.a.y0.b.b.g(gVar, "onNext is null");
        i.a.y0.b.b.g(cVar, "errorHandler is null");
        return i.a.c1.a.V(new i.a.y0.e.f.c(this, gVar, cVar));
    }

    @i.a.t0.d
    @f
    public final b<T> o(@f i.a.x0.g<? super T> gVar, @f a aVar) {
        i.a.y0.b.b.g(gVar, "onNext is null");
        i.a.y0.b.b.g(aVar, "errorHandler is null");
        return i.a.c1.a.V(new i.a.y0.e.f.c(this, gVar, aVar));
    }

    @i.a.t0.d
    @f
    public final b<T> p(@f q qVar) {
        i.a.y0.b.b.g(qVar, "onRequest is null");
        i.a.x0.g h2 = i.a.y0.b.a.h();
        i.a.x0.g h3 = i.a.y0.b.a.h();
        i.a.x0.g h4 = i.a.y0.b.a.h();
        i.a.x0.a aVar = i.a.y0.b.a.c;
        return i.a.c1.a.V(new i.a.y0.e.f.l(this, h2, h3, h4, aVar, aVar, i.a.y0.b.a.h(), qVar, aVar));
    }

    @i.a.t0.d
    @f
    public final b<T> q(@f i.a.x0.g<? super Subscription> gVar) {
        i.a.y0.b.b.g(gVar, "onSubscribe is null");
        i.a.x0.g h2 = i.a.y0.b.a.h();
        i.a.x0.g h3 = i.a.y0.b.a.h();
        i.a.x0.g h4 = i.a.y0.b.a.h();
        i.a.x0.a aVar = i.a.y0.b.a.c;
        return i.a.c1.a.V(new i.a.y0.e.f.l(this, h2, h3, h4, aVar, aVar, gVar, i.a.y0.b.a.f28143g, aVar));
    }

    @i.a.t0.d
    public final b<T> r(@f r<? super T> rVar) {
        i.a.y0.b.b.g(rVar, "predicate");
        return i.a.c1.a.V(new i.a.y0.e.f.d(this, rVar));
    }

    @i.a.t0.d
    public final b<T> s(@f r<? super T> rVar, @f i.a.x0.c<? super Long, ? super Throwable, a> cVar) {
        i.a.y0.b.b.g(rVar, "predicate");
        i.a.y0.b.b.g(cVar, "errorHandler is null");
        return i.a.c1.a.V(new e(this, rVar, cVar));
    }

    @i.a.t0.d
    public final b<T> t(@f r<? super T> rVar, @f a aVar) {
        i.a.y0.b.b.g(rVar, "predicate");
        i.a.y0.b.b.g(aVar, "errorHandler is null");
        return i.a.c1.a.V(new e(this, rVar, aVar));
    }

    @i.a.t0.d
    @f
    public final <R> b<R> u(@f o<? super T, ? extends Publisher<? extends R>> oVar) {
        return x(oVar, false, Integer.MAX_VALUE, l.U());
    }

    @i.a.t0.d
    @f
    public final <R> b<R> v(@f o<? super T, ? extends Publisher<? extends R>> oVar, boolean z) {
        return x(oVar, z, Integer.MAX_VALUE, l.U());
    }

    @i.a.t0.d
    @f
    public final <R> b<R> w(@f o<? super T, ? extends Publisher<? extends R>> oVar, boolean z, int i2) {
        return x(oVar, z, i2, l.U());
    }

    @i.a.t0.d
    @f
    public final <R> b<R> x(@f o<? super T, ? extends Publisher<? extends R>> oVar, boolean z, int i2, int i3) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.h(i2, "maxConcurrency");
        i.a.y0.b.b.h(i3, "prefetch");
        return i.a.c1.a.V(new i.a.y0.e.f.f(this, oVar, z, i2, i3));
    }
}
