package i.a.y0.e.e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableSkipLastTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h3<T> extends i.a.y0.e.e.a<T, T> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f28790d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.j0 f28791e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28792f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f28793g;

    /* compiled from: ObservableSkipLastTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.i0<T>, i.a.u0.c {
        private static final long serialVersionUID = -5677354903406201275L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public final i.a.i0<? super T> downstream;
        public Throwable error;
        public final i.a.y0.f.c<Object> queue;
        public final i.a.j0 scheduler;
        public final long time;
        public final TimeUnit unit;
        public i.a.u0.c upstream;

        public a(i.a.i0<? super T> i0Var, long j2, TimeUnit timeUnit, i.a.j0 j0Var, int i2, boolean z) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void drain() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(T t) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    public h3(i.a.g0<T> g0Var, long j2, TimeUnit timeUnit, i.a.j0 j0Var, int i2, boolean z) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
