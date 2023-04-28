package i.a.e1.h.f.e;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableBuffer.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class m<T, U extends Collection<? super T>> extends i.a.e1.h.f.e.a<T, U> {
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27510d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.s<U> f27511e;

    /* compiled from: ObservableBuffer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U extends Collection<? super T>> implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        public final i.a.e1.c.p0<? super U> b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.e1.g.s<U> f27512d;

        /* renamed from: e  reason: collision with root package name */
        public U f27513e;

        /* renamed from: f  reason: collision with root package name */
        public int f27514f;

        /* renamed from: g  reason: collision with root package name */
        public i.a.e1.d.f f27515g;

        public a(i.a.e1.c.p0<? super U> actual, int count, i.a.e1.g.s<U> bufferSupplier) {
        }

        public boolean a() {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
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

    /* compiled from: ObservableBuffer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, U extends Collection<? super T>> extends AtomicBoolean implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -8223395059921494546L;
        public final i.a.e1.g.s<U> bufferSupplier;
        public final ArrayDeque<U> buffers;
        public final int count;
        public final i.a.e1.c.p0<? super U> downstream;
        public long index;
        public final int skip;
        public i.a.e1.d.f upstream;

        public b(i.a.e1.c.p0<? super U> actual, int count, int skip, i.a.e1.g.s<U> bufferSupplier) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
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

    public m(i.a.e1.c.n0<T> source, int count, int skip, i.a.e1.g.s<U> bufferSupplier) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super U> t) {
    }
}
