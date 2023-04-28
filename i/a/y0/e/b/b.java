package i.a.y0.e.b;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.reactivestreams.Subscription;

/* compiled from: BlockingFlowableIterable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b<T> implements Iterable<T> {
    public final i.a.l<T> b;
    public final int c;

    /* compiled from: BlockingFlowableIterable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<Subscription> implements i.a.q<T>, Iterator<T>, Runnable, i.a.u0.c {
        private static final long serialVersionUID = 6695226475494099826L;
        public final long batchSize;
        public final Condition condition;
        public volatile boolean done;
        public Throwable error;
        public final long limit;
        public final Lock lock;
        public long produced;
        public final i.a.y0.f.b<T> queue;

        public a(int i2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // java.util.Iterator
        public T next() {
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

        @Override // java.util.Iterator
        public void remove() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void signalConsumer() {
        }
    }

    public b(i.a.l<T> lVar, int i2) {
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
    }
}
