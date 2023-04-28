package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableMergeWithCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class j2<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.c.p f27005d;

    /* compiled from: FlowableMergeWithCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = -4592979584110982903L;
        public final Subscriber<? super T> downstream;
        public final i.a.e1.h.k.c errors;
        public volatile boolean mainDone;
        public final AtomicReference<Subscription> mainSubscription;
        public volatile boolean otherDone;
        public final C0448a otherObserver;
        public final AtomicLong requested;

        /* compiled from: FlowableMergeWithCompletable.java */
        /* renamed from: i.a.e1.h.f.b.j2$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0448a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.m {
            private static final long serialVersionUID = -2935427570954647017L;
            public final a<?> parent;

            public C0448a(a<?> parent) {
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

        public a(Subscriber<? super T> downstream) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable ex) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        public void otherComplete() {
        }

        public void otherError(Throwable ex) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public j2(i.a.e1.c.s<T> source, i.a.e1.c.p other) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> subscriber) {
    }
}
