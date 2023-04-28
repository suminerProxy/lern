package i.a.e1.h.f.b;

import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;

/* compiled from: BlockingFlowableLatest.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class c<T> implements Iterable<T> {
    public final Publisher<? extends T> b;

    /* compiled from: BlockingFlowableLatest.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.p.b<i.a.e1.c.h0<T>> implements Iterator<T> {
        public final Semaphore c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReference<i.a.e1.c.h0<T>> f26894d;

        /* renamed from: e  reason: collision with root package name */
        public i.a.e1.c.h0<T> f26895e;

        public void d(i.a.e1.c.h0<T> args) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
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

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    public c(Publisher<? extends T> source) {
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
    }
}
