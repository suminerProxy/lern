package i.a.y0.e.g;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;

/* compiled from: SingleFlatMapIterableFlowable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class z<T, R> extends i.a.l<R> {
    public final i.a.q0<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends Iterable<? extends R>> f29097d;

    /* compiled from: SingleFlatMapIterableFlowable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends i.a.y0.i.c<R> implements i.a.n0<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        public volatile boolean cancelled;
        public final Subscriber<? super R> downstream;
        public volatile Iterator<? extends R> it;
        public final i.a.x0.o<? super T, ? extends Iterable<? extends R>> mapper;
        public boolean outputFused;
        public final AtomicLong requested;
        public i.a.u0.c upstream;

        public a(Subscriber<? super R> subscriber, i.a.x0.o<? super T, ? extends Iterable<? extends R>> oVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.y0.c.o
        public void clear() {
        }

        public void drain() {
        }

        @Override // i.a.y0.c.o
        public boolean isEmpty() {
        }

        @Override // i.a.n0
        public void onError(Throwable th) {
        }

        @Override // i.a.n0
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // i.a.n0
        public void onSuccess(T t) {
        }

        @Override // i.a.y0.c.o
        @i.a.t0.g
        public R poll() throws Exception {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        @Override // i.a.y0.c.k
        public int requestFusion(int i2) {
        }

        public void slowPath(Subscriber<? super R> subscriber, Iterator<? extends R> it) {
        }
    }

    public z(i.a.q0<T> q0Var, i.a.x0.o<? super T, ? extends Iterable<? extends R>> oVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }
}
