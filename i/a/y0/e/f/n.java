package i.a.y0.e.f;

import i.a.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelReduceFull.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class n<T> extends i.a.l<T> {
    public final i.a.b1.b<? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.c<T, T, T> f29063d;

    /* compiled from: ParallelReduceFull.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<Subscription> implements q<T> {
        private static final long serialVersionUID = -7954444275102466525L;
        public boolean done;
        public final b<T> parent;
        public final i.a.x0.c<T, T, T> reducer;
        public T value;

        public a(b<T> bVar, i.a.x0.c<T, T, T> cVar) {
        }

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
    }

    /* compiled from: ParallelReduceFull.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends i.a.y0.i.f<T> {
        private static final long serialVersionUID = -5370107872170712765L;
        public final AtomicReference<c<T>> current;
        public final AtomicReference<Throwable> error;
        public final i.a.x0.c<T, T, T> reducer;
        public final AtomicInteger remaining;
        public final a<T>[] subscribers;

        public b(Subscriber<? super T> subscriber, int i2, i.a.x0.c<T, T, T> cVar) {
        }

        public c<T> addValue(T t) {
        }

        @Override // i.a.y0.i.f, org.reactivestreams.Subscription
        public void cancel() {
        }

        public void innerComplete(T t) {
        }

        public void innerError(Throwable th) {
        }
    }

    /* compiled from: ParallelReduceFull.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
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

    public n(i.a.b1.b<? extends T> bVar, i.a.x0.c<T, T, T> cVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
