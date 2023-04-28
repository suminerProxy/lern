package i.a.y0.e.a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: CompletableConcat.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d extends i.a.c {
    public final Publisher<? extends i.a.i> b;
    public final int c;

    /* compiled from: CompletableConcat.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends AtomicInteger implements i.a.q<i.a.i>, i.a.u0.c {
        private static final long serialVersionUID = 9032184911934499404L;
        public volatile boolean active;
        public int consumed;
        public volatile boolean done;
        public final i.a.f downstream;
        public final C0527a inner;
        public final int limit;
        public final AtomicBoolean once;
        public final int prefetch;
        public i.a.y0.c.o<i.a.i> queue;
        public int sourceFused;
        public Subscription upstream;

        /* compiled from: CompletableConcat.java */
        /* renamed from: i.a.y0.e.a.d$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0527a extends AtomicReference<i.a.u0.c> implements i.a.f {
            private static final long serialVersionUID = -5454794857847146511L;
            public final a parent;

            public C0527a(a aVar) {
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

        public a(i.a.f fVar, int i2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void drain() {
        }

        public void innerComplete() {
        }

        public void innerError(Throwable th) {
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
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        public void request() {
        }

        public void onNext(i.a.i iVar) {
        }
    }

    public d(Publisher<? extends i.a.i> publisher, int i2) {
    }

    @Override // i.a.c
    public void I0(i.a.f fVar) {
    }
}
