package i.a.e1.h.f.b;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.reactivestreams.Subscription;

/* compiled from: BlockingFlowableIterable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class b<T> implements Iterable<T> {
    public final i.a.e1.c.s<T> b;
    public final int c;

    /* compiled from: BlockingFlowableIterable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<Subscription> implements i.a.e1.c.x<T>, Iterator<T>, Runnable, i.a.e1.d.f {
        private static final long serialVersionUID = 6695226475494099826L;
        public final long batchSize;
        public final Condition condition;
        public volatile boolean done;
        public volatile Throwable error;
        public final long limit;
        public final Lock lock;
        public long produced;
        public final i.a.e1.h.g.b<T> queue;

        public a(int batchSize) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // java.util.Iterator
        public T next() {
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

        @Override // java.util.Iterator
        public void remove() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void signalConsumer() {
        }
    }

    public b(i.a.e1.c.s<T> source, int bufferSize) {
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
    }
}
