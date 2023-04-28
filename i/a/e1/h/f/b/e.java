package i.a.e1.h.f.b;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* compiled from: BlockingFlowableNext.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class e<T> implements Iterable<T> {
    public final Publisher<? extends T> b;

    /* compiled from: BlockingFlowableNext.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements Iterator<T> {
        private final b<T> b;
        private final Publisher<? extends T> c;

        /* renamed from: d  reason: collision with root package name */
        private T f26920d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f26921e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f26922f;

        /* renamed from: g  reason: collision with root package name */
        private Throwable f26923g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f26924h;

        public a(Publisher<? extends T> items, b<T> subscriber) {
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
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends i.a.e1.p.b<i.a.e1.c.h0<T>> {
        private final BlockingQueue<i.a.e1.c.h0<T>> c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicInteger f26925d;

        public void d(i.a.e1.c.h0<T> args) {
        }

        public void e() {
        }

        public i.a.e1.c.h0<T> f() throws InterruptedException {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable e2) {
        }

        @Override // org.reactivestreams.Subscriber
        public /* bridge */ /* synthetic */ void onNext(Object args) {
        }
    }

    public e(Publisher<? extends T> source) {
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
    }
}
