package i.a.e1.h.f.a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: CompletableConcat.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d extends i.a.e1.c.j {
    public final Publisher<? extends i.a.e1.c.p> b;
    public final int c;

    /* compiled from: CompletableConcat.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends AtomicInteger implements i.a.e1.c.x<i.a.e1.c.p>, i.a.e1.d.f {
        private static final long serialVersionUID = 9032184911934499404L;
        public volatile boolean active;
        public int consumed;
        public volatile boolean done;
        public final i.a.e1.c.m downstream;
        public final C0435a inner;
        public final int limit;
        public final AtomicBoolean once;
        public final int prefetch;
        public i.a.e1.h.c.q<i.a.e1.c.p> queue;
        public int sourceFused;
        public Subscription upstream;

        /* compiled from: CompletableConcat.java */
        /* renamed from: i.a.e1.h.f.a.d$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0435a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.m {
            private static final long serialVersionUID = -5454794857847146511L;
            public final a parent;

            public C0435a(a parent) {
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

        public a(i.a.e1.c.m actual, int prefetch) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        public void innerComplete() {
        }

        public void innerError(Throwable e2) {
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

        public void request() {
        }

        public void onNext(i.a.e1.c.p t) {
        }
    }

    public d(Publisher<? extends i.a.e1.c.p> sources, int prefetch) {
    }

    @Override // i.a.e1.c.j
    public void Y0(i.a.e1.c.m observer) {
    }
}
