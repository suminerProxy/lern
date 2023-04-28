package i.a.e1.h.f.e;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BlockingObservableNext.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class e<T> implements Iterable<T> {
    public final i.a.e1.c.n0<T> b;

    /* compiled from: BlockingObservableNext.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements Iterator<T> {
        private final b<T> b;
        private final i.a.e1.c.n0<T> c;

        /* renamed from: d  reason: collision with root package name */
        private T f27420d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f27421e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f27422f;

        /* renamed from: g  reason: collision with root package name */
        private Throwable f27423g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f27424h;

        public a(i.a.e1.c.n0<T> items, b<T> observer) {
        }

        private boolean a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* compiled from: BlockingObservableNext.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends i.a.e1.j.e<i.a.e1.c.h0<T>> {
        private final BlockingQueue<i.a.e1.c.h0<T>> c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicInteger f27425d;

        public void b(i.a.e1.c.h0<T> args) {
        }

        public void c() {
        }

        public i.a.e1.c.h0<T> d() throws InterruptedException {
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
    }

    public e(i.a.e1.c.n0<T> source) {
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
    }
}
