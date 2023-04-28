package i.a.y0.e.b;

import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;

/* compiled from: BlockingFlowableLatest.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class c<T> implements Iterable<T> {
    public final Publisher<? extends T> b;

    /* compiled from: BlockingFlowableLatest.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends i.a.h1.b<i.a.a0<T>> implements Iterator<T> {
        public final Semaphore c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReference<i.a.a0<T>> f28227d;

        /* renamed from: e  reason: collision with root package name */
        public i.a.a0<T> f28228e;

        public void d(i.a.a0<T> a0Var) {
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
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    public c(Publisher<? extends T> publisher) {
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
    }
}
