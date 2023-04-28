package i.a.y0.e.e;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableWindowBoundarySelector.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class g4<T, B, V> extends i.a.y0.e.e.a<T, i.a.b0<T>> {
    public final i.a.g0<B> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super B, ? extends i.a.g0<V>> f28782d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28783e;

    /* compiled from: ObservableWindowBoundarySelector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, V> extends i.a.a1.e<V> {
        public final c<T, ?, V> c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.g1.j<T> f28784d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f28785e;

        public a(c<T, ?, V> cVar, i.a.g1.j<T> jVar) {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(V v) {
        }
    }

    /* compiled from: ObservableWindowBoundarySelector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, B> extends i.a.a1.e<B> {
        public final c<T, B, ?> c;

        public b(c<T, B, ?> cVar) {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(B b) {
        }
    }

    /* compiled from: ObservableWindowBoundarySelector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T, B, V> extends i.a.y0.d.v<T, Object, i.a.b0<T>> implements i.a.u0.c {
        public final i.a.g0<B> L;
        public final i.a.x0.o<? super B, ? extends i.a.g0<V>> M;
        public final int N;
        public final i.a.u0.b O;
        public i.a.u0.c P;
        public final AtomicReference<i.a.u0.c> Q;
        public final List<i.a.g1.j<T>> R;
        public final AtomicLong S;
        public final AtomicBoolean T;

        public c(i.a.i0<? super i.a.b0<T>> i0Var, i.a.g0<B> g0Var, i.a.x0.o<? super B, ? extends i.a.g0<V>> oVar, int i2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.y0.d.v, i.a.y0.j.r
        public void f(i.a.i0<? super i.a.b0<T>> i0Var, Object obj) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public void j(a<T, V> aVar) {
        }

        public void k() {
        }

        public void l() {
        }

        public void m(Throwable th) {
        }

        public void n(B b) {
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

    /* compiled from: ObservableWindowBoundarySelector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d<T, B> {

        /* renamed from: a  reason: collision with root package name */
        public final i.a.g1.j<T> f28786a;
        public final B b;

        public d(i.a.g1.j<T> jVar, B b) {
        }
    }

    public g4(i.a.g0<T> g0Var, i.a.g0<B> g0Var2, i.a.x0.o<? super B, ? extends i.a.g0<V>> oVar, int i2) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super i.a.b0<T>> i0Var) {
    }
}
