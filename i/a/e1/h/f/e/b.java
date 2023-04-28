package i.a.e1.h.f.e;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: BlockingObservableIterable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class b<T> implements Iterable<T> {
    public final i.a.e1.c.n0<? extends T> b;
    public final int c;

    /* compiled from: BlockingObservableIterable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<T>, Iterator<T>, i.a.e1.d.f {
        private static final long serialVersionUID = 6695226475494099826L;
        public final Condition condition;
        public volatile boolean done;
        public volatile Throwable error;
        public final Lock lock;
        public final i.a.e1.h.g.c<T> queue;

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

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        public void signalConsumer() {
        }
    }

    public b(i.a.e1.c.n0<? extends T> source, int bufferSize) {
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
    }
}
