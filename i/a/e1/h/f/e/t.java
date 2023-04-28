package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableCombineLatest.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class t<T, R> extends i.a.e1.c.i0<R> {
    public final i.a.e1.c.n0<? extends T>[] b;
    public final Iterable<? extends i.a.e1.c.n0<? extends T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super Object[], ? extends R> f27637d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27638e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27639f;

    /* compiled from: ObservableCombineLatest.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        public final int index;
        public final b<T, R> parent;

        public a(b<T, R> parent, int index) {
        }

        public void dispose() {
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
    }

    /* compiled from: ObservableCombineLatest.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, R> extends AtomicInteger implements i.a.e1.d.f {
        private static final long serialVersionUID = 8567835998786448817L;
        public int active;
        public volatile boolean cancelled;
        public final i.a.e1.g.o<? super Object[], ? extends R> combiner;
        public int complete;
        public final boolean delayError;
        public volatile boolean done;
        public final i.a.e1.c.p0<? super R> downstream;
        public final i.a.e1.h.k.c errors;
        public Object[] latest;
        public final a<T, R>[] observers;
        public final i.a.e1.h.g.c<Object[]> queue;

        public b(i.a.e1.c.p0<? super R> actual, i.a.e1.g.o<? super Object[], ? extends R> combiner, int count, int bufferSize, boolean delayError) {
        }

        public void cancelSources() {
        }

        public void clear(i.a.e1.h.g.c<?> q) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        public void innerComplete(int index) {
        }

        public void innerError(int index, Throwable ex) {
        }

        public void innerNext(int index, T item) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        public void subscribe(i.a.e1.c.n0<? extends T>[] sources) {
        }
    }

    public t(i.a.e1.c.n0<? extends T>[] sources, Iterable<? extends i.a.e1.c.n0<? extends T>> sourcesIterable, i.a.e1.g.o<? super Object[], ? extends R> combiner, int bufferSize, boolean delayError) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super R> observer) {
    }
}
