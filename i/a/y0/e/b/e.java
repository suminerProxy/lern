package i.a.y0.e.b;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* compiled from: BlockingFlowableNext.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class e<T> implements Iterable<T> {
    public final Publisher<? extends T> b;

    /* compiled from: BlockingFlowableNext.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements Iterator<T> {
        private final b<T> b;
        private final Publisher<? extends T> c;

        /* renamed from: d  reason: collision with root package name */
        private T f28256d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f28257e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f28258f;

        /* renamed from: g  reason: collision with root package name */
        private Throwable f28259g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f28260h;

        public a(Publisher<? extends T> publisher, b<T> bVar) {
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

    /* compiled from: BlockingFlowableNext.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends i.a.h1.b<i.a.a0<T>> {
        private final BlockingQueue<i.a.a0<T>> c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicInteger f28261d;

        public void d(i.a.a0<T> a0Var) {
        }

        public void e() {
        }

        public i.a.a0<T> f() throws InterruptedException {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    public e(Publisher<? extends T> publisher) {
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
    }
}
