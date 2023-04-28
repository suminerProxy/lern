package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableDebounce.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class d0<T, U> extends i.a.e1.h.f.e.a<T, T> {
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<U>> c;

    /* compiled from: ObservableDebounce.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U> implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        public final i.a.e1.c.p0<? super T> b;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<U>> c;

        /* renamed from: d  reason: collision with root package name */
        public i.a.e1.d.f f27403d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReference<i.a.e1.d.f> f27404e;

        /* renamed from: f  reason: collision with root package name */
        public volatile long f27405f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f27406g;

        /* compiled from: ObservableDebounce.java */
        /* renamed from: i.a.e1.h.f.e.d0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0478a<T, U> extends i.a.e1.j.e<U> {
            public final a<T, U> c;

            /* renamed from: d  reason: collision with root package name */
            public final long f27407d;

            /* renamed from: e  reason: collision with root package name */
            public final T f27408e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f27409f;

            /* renamed from: g  reason: collision with root package name */
            public final AtomicBoolean f27410g;

            public C0478a(a<T, U> parent, long index, T value) {
            }

            public void b() {
            }

            @Override // i.a.e1.c.p0
            public void onComplete() {
            }

            @Override // i.a.e1.c.p0
            public void onError(Throwable t) {
            }

            @Override // i.a.e1.c.p0
            public void onNext(U t) {
            }
        }

        public a(i.a.e1.c.p0<? super T> actual, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<U>> debounceSelector) {
        }

        public void a(long idx, T value) {
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

    public d0(i.a.e1.c.n0<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<U>> debounceSelector) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> t) {
    }
}
