package i.a.y0.e.a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: CompletableMerge.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a0 extends i.a.c {
    public final Publisher<? extends i.a.i> b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f28179d;

    /* compiled from: CompletableMerge.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends AtomicInteger implements i.a.q<i.a.i>, i.a.u0.c {
        private static final long serialVersionUID = -2108443387387077490L;
        public final boolean delayErrors;
        public final i.a.f downstream;
        public final i.a.y0.j.c error;
        public final int maxConcurrency;
        public final i.a.u0.b set;
        public Subscription upstream;

        /* compiled from: CompletableMerge.java */
        /* renamed from: i.a.y0.e.a.a0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class C0525a extends AtomicReference<i.a.u0.c> implements i.a.f, i.a.u0.c {
            private static final long serialVersionUID = 251330541679988317L;
            public final /* synthetic */ a this$0;

            public C0525a(a aVar) {
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

        public a(i.a.f fVar, int i2, boolean z) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void innerComplete(C0525a c0525a) {
        }

        public void innerError(C0525a c0525a, Throwable th) {
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

        public void onNext(i.a.i iVar) {
        }
    }

    public a0(Publisher<? extends i.a.i> publisher, int i2, boolean z) {
    }

    @Override // i.a.c
    public void I0(i.a.f fVar) {
    }
}
