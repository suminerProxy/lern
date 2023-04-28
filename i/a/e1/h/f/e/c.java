package i.a.e1.h.f.e;

import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: BlockingObservableLatest.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class c<T> implements Iterable<T> {
    public final i.a.e1.c.n0<T> b;

    /* compiled from: BlockingObservableLatest.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.j.e<i.a.e1.c.h0<T>> implements Iterator<T> {
        public i.a.e1.c.h0<T> c;

        /* renamed from: d  reason: collision with root package name */
        public final Semaphore f27399d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReference<i.a.e1.c.h0<T>> f27400e;

        public void b(i.a.e1.c.h0<T> args) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.p0
        public /* bridge */ /* synthetic */ void onNext(Object args) {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    public c(i.a.e1.c.n0<T> source) {
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
    }
}
