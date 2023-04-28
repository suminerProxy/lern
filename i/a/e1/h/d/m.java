package i.a.e1.h.d;

import i.a.e1.c.u0;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import org.reactivestreams.Subscriber;

/* compiled from: MaybeFlattenStreamAsFlowable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class m<T, R> extends i.a.e1.c.s<R> {
    public final i.a.e1.c.z<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends Stream<? extends R>> f26794d;

    /* compiled from: MaybeFlattenStreamAsFlowable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends i.a.e1.h.j.c<R> implements i.a.e1.c.c0<T>, u0<T> {
        private static final long serialVersionUID = 7363336003027148283L;
        public volatile boolean cancelled;
        public AutoCloseable close;
        public final Subscriber<? super R> downstream;
        public long emitted;
        public volatile Iterator<? extends R> iterator;
        public final i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper;
        public boolean once;
        public boolean outputFused;
        public final AtomicLong requested;
        public i.a.e1.d.f upstream;

        public a(Subscriber<? super R> downstream, i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
        }

        public void close(AutoCloseable c) {
        }

        public void drain() {
        }

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.m
        public void onComplete() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onError(@i.a.e1.b.f Throwable e2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(@i.a.e1.b.f i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0
        public void onSuccess(@i.a.e1.b.f T t) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public R poll() throws Throwable {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }
    }

    public m(i.a.e1.c.z<T> source, i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper) {
    }

    @Override // i.a.e1.c.s
    public void F6(@i.a.e1.b.f Subscriber<? super R> s) {
    }
}
