package i.a.y0.e.e;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: BlockingObservableIterable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b<T> implements Iterable<T> {
    public final i.a.g0<? extends T> b;
    public final int c;

    /* compiled from: BlockingObservableIterable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<i.a.u0.c> implements i.a.i0<T>, Iterator<T>, i.a.u0.c {
        private static final long serialVersionUID = 6695226475494099826L;
        public final Condition condition;
        public volatile boolean done;
        public Throwable error;
        public final Lock lock;
        public final i.a.y0.f.c<T> queue;

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

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(T t) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        public void signalConsumer() {
        }
    }

    public b(i.a.g0<? extends T> g0Var, int i2) {
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
    }
}
