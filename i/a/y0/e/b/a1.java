package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableFlatMapCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a1<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends i.a.i> f28208d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28209e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f28210f;

    /* compiled from: FlowableFlatMapCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends i.a.y0.i.c<T> implements i.a.q<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public final Subscriber<? super T> downstream;
        public final i.a.y0.j.c errors;
        public final i.a.x0.o<? super T, ? extends i.a.i> mapper;
        public final int maxConcurrency;
        public final i.a.u0.b set;
        public Subscription upstream;

        /* compiled from: FlowableFlatMapCompletable.java */
        /* renamed from: i.a.y0.e.b.a1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class C0530a extends AtomicReference<i.a.u0.c> implements i.a.f, i.a.u0.c {
            private static final long serialVersionUID = 8606673141535671828L;
            public final /* synthetic */ a this$0;

            public C0530a(a aVar) {
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

        public a(Subscriber<? super T> subscriber, i.a.x0.o<? super T, ? extends i.a.i> oVar, boolean z, int i2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.y0.c.o
        public void clear() {
        }

        public void innerComplete(a<T>.C0530a c0530a) {
        }

        public void innerError(a<T>.C0530a c0530a, Throwable th) {
        }

        @Override // i.a.y0.c.o
        public boolean isEmpty() {
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

        @Override // i.a.y0.c.o
        @i.a.t0.g
        public T poll() throws Exception {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        @Override // i.a.y0.c.k
        public int requestFusion(int i2) {
        }
    }

    public a1(i.a.l<T> lVar, i.a.x0.o<? super T, ? extends i.a.i> oVar, boolean z, int i2) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
