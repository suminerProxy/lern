package i.a.y0.e.e;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BlockingObservableNext.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class e<T> implements Iterable<T> {
    public final i.a.g0<T> b;

    /* compiled from: BlockingObservableNext.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements Iterator<T> {
        private final b<T> b;
        private final i.a.g0<T> c;

        /* renamed from: d  reason: collision with root package name */
        private T f28733d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f28734e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f28735f;

        /* renamed from: g  reason: collision with root package name */
        private Throwable f28736g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f28737h;

        public a(i.a.g0<T> g0Var, b<T> bVar) {
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
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends i.a.a1.e<i.a.a0<T>> {
        private final BlockingQueue<i.a.a0<T>> c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicInteger f28738d;

        public void b(i.a.a0<T> a0Var) {
        }

        public void c() {
        }

        public i.a.a0<T> d() throws InterruptedException {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    public e(i.a.g0<T> g0Var) {
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
    }
}
