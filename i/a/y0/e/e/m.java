package i.a.y0.e.e;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableBuffer.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class m<T, U extends Collection<? super T>> extends i.a.y0.e.e.a<T, U> {
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28856d;

    /* renamed from: e  reason: collision with root package name */
    public final Callable<U> f28857e;

    /* compiled from: ObservableBuffer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U extends Collection<? super T>> implements i.a.i0<T>, i.a.u0.c {
        public final i.a.i0<? super U> b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final Callable<U> f28858d;

        /* renamed from: e  reason: collision with root package name */
        public U f28859e;

        /* renamed from: f  reason: collision with root package name */
        public int f28860f;

        /* renamed from: g  reason: collision with root package name */
        public i.a.u0.c f28861g;

        public a(i.a.i0<? super U> i0Var, int i2, Callable<U> callable) {
        }

        public boolean a() {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(T t) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    /* compiled from: ObservableBuffer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, U extends Collection<? super T>> extends AtomicBoolean implements i.a.i0<T>, i.a.u0.c {
        private static final long serialVersionUID = -8223395059921494546L;
        public final Callable<U> bufferSupplier;
        public final ArrayDeque<U> buffers;
        public final int count;
        public final i.a.i0<? super U> downstream;
        public long index;
        public final int skip;
        public i.a.u0.c upstream;

        public b(i.a.i0<? super U> i0Var, int i2, int i3, Callable<U> callable) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(T t) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    public m(i.a.g0<T> g0Var, int i2, int i3, Callable<U> callable) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super U> i0Var) {
    }
}
