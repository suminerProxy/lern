package i.a.e1.h.f.f;

import i.a.e1.c.s;
import i.a.e1.c.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelReduceFull.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class o<T> extends s<T> {
    public final i.a.e1.k.b<? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.c<T, T, T> f27740d;

    /* compiled from: ParallelReduceFull.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<Subscription> implements x<T> {
        private static final long serialVersionUID = -7954444275102466525L;
        public boolean done;
        public final b<T> parent;
        public final i.a.e1.g.c<T, T, T> reducer;
        public T value;

        public a(b<T> parent, i.a.e1.g.c<T, T, T> reducer) {
        }

        public void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    /* compiled from: ParallelReduceFull.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends i.a.e1.h.j.f<T> {
        private static final long serialVersionUID = -5370107872170712765L;
        public final AtomicReference<c<T>> current;
        public final i.a.e1.h.k.c error;
        public final i.a.e1.g.c<T, T, T> reducer;
        public final AtomicInteger remaining;
        public final a<T>[] subscribers;

        public b(Subscriber<? super T> subscriber, int n2, i.a.e1.g.c<T, T, T> reducer) {
        }

        public c<T> addValue(T value) {
        }

        @Override // i.a.e1.h.j.f, org.reactivestreams.Subscription
        public void cancel() {
        }

        public void innerComplete(T value) {
        }

        public void innerError(Throwable ex) {
        }
    }

    /* compiled from: ParallelReduceFull.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends AtomicInteger {
        private static final long serialVersionUID = 473971317683868662L;
        public T first;
        public final AtomicInteger releaseIndex;
        public T second;

        public boolean releaseSlot() {
        }

        public int tryAcquireSlot() {
        }
    }

    public o(i.a.e1.k.b<? extends T> source, i.a.e1.g.c<T, T, T> reducer) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
