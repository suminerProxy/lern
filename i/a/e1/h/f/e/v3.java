package i.a.e1.h.f.e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableTakeLastTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class v3<T> extends i.a.e1.h.f.e.a<T, T> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27656d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f27657e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.c.q0 f27658f;

    /* renamed from: g  reason: collision with root package name */
    public final int f27659g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f27660h;

    /* compiled from: ObservableTakeLastTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicBoolean implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -5677354903406201275L;
        public volatile boolean cancelled;
        public final long count;
        public final boolean delayError;
        public final i.a.e1.c.p0<? super T> downstream;
        public Throwable error;
        public final i.a.e1.h.g.c<Object> queue;
        public final i.a.e1.c.q0 scheduler;
        public final long time;
        public final TimeUnit unit;
        public i.a.e1.d.f upstream;

        public a(i.a.e1.c.p0<? super T> actual, long count, long time, TimeUnit unit, i.a.e1.c.q0 scheduler, int bufferSize, boolean delayError) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    public v3(i.a.e1.c.n0<T> source, long count, long time, TimeUnit unit, i.a.e1.c.q0 scheduler, int bufferSize, boolean delayError) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> t) {
    }
}
