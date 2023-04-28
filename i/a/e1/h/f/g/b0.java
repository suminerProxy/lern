package i.a.e1.h.f.g;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;

/* compiled from: SingleFlatMapIterableFlowable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class b0<T, R> extends i.a.e1.c.s<R> {
    public final i.a.e1.c.x0<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends Iterable<? extends R>> f27751d;

    /* compiled from: SingleFlatMapIterableFlowable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends i.a.e1.h.j.c<R> implements i.a.e1.c.u0<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        public volatile boolean cancelled;
        public final Subscriber<? super R> downstream;
        public volatile Iterator<? extends R> it;
        public final i.a.e1.g.o<? super T, ? extends Iterable<? extends R>> mapper;
        public boolean outputFused;
        public final AtomicLong requested;
        public i.a.e1.d.f upstream;

        public a(Subscriber<? super R> actual, i.a.e1.g.o<? super T, ? extends Iterable<? extends R>> mapper) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
        }

        public void drain() {
        }

        public void fastPath(Subscriber<? super R> a2, Iterator<? extends R> iterator) {
        }

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.u0
        public void onSuccess(T value) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public R poll() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }
    }

    public b0(i.a.e1.c.x0<T> source, i.a.e1.g.o<? super T, ? extends Iterable<? extends R>> mapper) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
