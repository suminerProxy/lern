package i.a.e1.h.f.a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: CompletableMerge.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b0 extends i.a.e1.c.j {
    public final Publisher<? extends i.a.e1.c.p> b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f26838d;

    /* compiled from: CompletableMerge.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends AtomicInteger implements i.a.e1.c.x<i.a.e1.c.p>, i.a.e1.d.f {
        private static final long serialVersionUID = -2108443387387077490L;
        public final boolean delayErrors;
        public final i.a.e1.c.m downstream;
        public final i.a.e1.h.k.c errors;
        public final int maxConcurrency;
        public final i.a.e1.d.d set;
        public Subscription upstream;

        /* compiled from: CompletableMerge.java */
        /* renamed from: i.a.e1.h.f.a.b0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class C0434a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.m, i.a.e1.d.f {
            private static final long serialVersionUID = 251330541679988317L;
            public final /* synthetic */ a this$0;

            public C0434a(final a this$0) {
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

        public a(i.a.e1.c.m actual, int maxConcurrency, boolean delayErrors) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void innerComplete(C0434a inner) {
        }

        public void innerError(C0434a inner, Throwable t) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public /* bridge */ /* synthetic */ void onNext(Object t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        public void onNext(i.a.e1.c.p t) {
        }
    }

    public b0(Publisher<? extends i.a.e1.c.p> source, int maxConcurrency, boolean delayErrors) {
    }

    @Override // i.a.e1.c.j
    public void Y0(i.a.e1.c.m observer) {
    }
}
