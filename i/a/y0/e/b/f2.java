package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableMergeWithCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class f2<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.i f28273d;

    /* compiled from: FlowableMergeWithCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = -4592979584110982903L;
        public final Subscriber<? super T> downstream;
        public final i.a.y0.j.c error;
        public volatile boolean mainDone;
        public final AtomicReference<Subscription> mainSubscription;
        public volatile boolean otherDone;
        public final C0535a otherObserver;
        public final AtomicLong requested;

        /* compiled from: FlowableMergeWithCompletable.java */
        /* renamed from: i.a.y0.e.b.f2$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0535a extends AtomicReference<i.a.u0.c> implements i.a.f {
            private static final long serialVersionUID = -2935427570954647017L;
            public final a<?> parent;

            public C0535a(a<?> aVar) {
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

        public a(Subscriber<? super T> subscriber) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
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

        public void otherComplete() {
        }

        public void otherError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    public f2(i.a.l<T> lVar, i.a.i iVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
