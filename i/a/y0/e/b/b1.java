package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* compiled from: FlowableFlatMapCompletableCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b1<T> extends i.a.c implements i.a.y0.c.b<T> {
    public final i.a.l<T> b;
    public final i.a.x0.o<? super T, ? extends i.a.i> c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28220d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28221e;

    /* compiled from: FlowableFlatMapCompletableCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.q<T>, i.a.u0.c {
        private static final long serialVersionUID = 8443155186132538303L;
        public final boolean delayErrors;
        public volatile boolean disposed;
        public final i.a.f downstream;
        public final i.a.y0.j.c errors;
        public final i.a.x0.o<? super T, ? extends i.a.i> mapper;
        public final int maxConcurrency;
        public final i.a.u0.b set;
        public Subscription upstream;

        /* compiled from: FlowableFlatMapCompletableCompletable.java */
        /* renamed from: i.a.y0.e.b.b1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class C0531a extends AtomicReference<i.a.u0.c> implements i.a.f, i.a.u0.c {
            private static final long serialVersionUID = 8606673141535671828L;
            public final /* synthetic */ a this$0;

            public C0531a(a aVar) {
            }

            @Override // i.a.u0.c
            public void dispose() {
            }

            @Override // i.a.u0.c
            public boolean isDisposed() {
            }

            @Override // i.a.f
            public void onComplete() {
            }

            @Override // i.a.f
            public void onError(Throwable th) {
            }

            @Override // i.a.f
            public void onSubscribe(i.a.u0.c cVar) {
            }
        }

        public a(i.a.f fVar, i.a.x0.o<? super T, ? extends i.a.i> oVar, boolean z, int i2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void innerComplete(a<T>.C0531a c0531a) {
        }

        public void innerError(a<T>.C0531a c0531a, Throwable th) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }

    public b1(i.a.l<T> lVar, i.a.x0.o<? super T, ? extends i.a.i> oVar, boolean z, int i2) {
    }

    @Override // i.a.c
    public void I0(i.a.f fVar) {
    }

    @Override // i.a.y0.c.b
    public i.a.l<T> c() {
    }
}
