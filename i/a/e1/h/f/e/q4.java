package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableZip.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class q4<T, R> extends i.a.e1.c.i0<R> {
    public final i.a.e1.c.n0<? extends T>[] b;
    public final Iterable<? extends i.a.e1.c.n0<? extends T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super Object[], ? extends R> f27594d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27595e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27596f;

    /* compiled from: ObservableZip.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.e1.d.f {
        private static final long serialVersionUID = 2983708048395377667L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public final i.a.e1.c.p0<? super R> downstream;
        public final b<T, R>[] observers;
        public final T[] row;
        public final i.a.e1.g.o<? super Object[], ? extends R> zipper;

        public a(i.a.e1.c.p0<? super R> actual, i.a.e1.g.o<? super Object[], ? extends R> zipper, int count, boolean delayError) {
        }

        public void cancel() {
        }

        public void cancelSources() {
        }

        public boolean checkTerminated(boolean d2, boolean empty, i.a.e1.c.p0<? super R> a2, boolean delayError, b<?, ?> source) {
        }

        public void clear() {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        public void subscribe(i.a.e1.c.n0<? extends T>[] sources, int bufferSize) {
        }
    }

    /* compiled from: ObservableZip.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, R> implements i.a.e1.c.p0<T> {
        public final a<T, R> b;
        public final i.a.e1.h.g.c<T> c;

        /* renamed from: d  reason: collision with root package name */
        public volatile boolean f27597d;

        /* renamed from: e  reason: collision with root package name */
        public Throwable f27598e;

        /* renamed from: f  reason: collision with root package name */
        public final AtomicReference<i.a.e1.d.f> f27599f;

        public b(a<T, R> parent, int bufferSize) {
        }

        public void a() {
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

    public q4(i.a.e1.c.n0<? extends T>[] sources, Iterable<? extends i.a.e1.c.n0<? extends T>> sourcesIterable, i.a.e1.g.o<? super Object[], ? extends R> zipper, int bufferSize, boolean delayError) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super R> observer) {
    }
}
