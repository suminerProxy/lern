package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableFlatMapCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class a1<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> f26868d;

    /* renamed from: e  reason: collision with root package name */
    public final int f26869e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f26870f;

    /* compiled from: FlowableFlatMapCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.h.j.c<T> implements i.a.e1.c.x<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public final Subscriber<? super T> downstream;
        public final i.a.e1.h.k.c errors;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper;
        public final int maxConcurrency;
        public final i.a.e1.d.d set;
        public Subscription upstream;

        /* compiled from: FlowableFlatMapCompletable.java */
        /* renamed from: i.a.e1.h.f.b.a1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class C0438a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.m, i.a.e1.d.f {
            private static final long serialVersionUID = 8606673141535671828L;
            public final /* synthetic */ a this$0;

            public C0438a(final a this$0) {
            }

            @Override // i.a.e1.d.f
            public void dispose() {
            }

            @Override // i.a.e1.d.f
            public boolean isDisposed() {
            }

            @Override // i.a.e1.c.m
            public void onComplete() {
            }

            @Override // i.a.e1.c.m
            public void onError(Throwable e2) {
            }

            @Override // i.a.e1.c.m
            public void onSubscribe(i.a.e1.d.f d2) {
            }
        }

        public a(Subscriber<? super T> subscriber, i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper, boolean delayErrors, int maxConcurrency) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
        }

        public void innerComplete(a<T>.C0438a inner) {
        }

        public void innerError(a<T>.C0438a inner, Throwable e2) {
        }

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable e2) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T value) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }
    }

    public a1(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper, boolean delayErrors, int maxConcurrency) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> subscriber) {
    }
}
