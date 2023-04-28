package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSampleWithObservable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class b3<T> extends i.a.e1.h.f.e.a<T, T> {
    public final i.a.e1.c.n0<?> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27394d;

    /* compiled from: ObservableSampleWithObservable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        public volatile boolean done;
        public final AtomicInteger wip;

        public a(i.a.e1.c.p0<? super T> actual, i.a.e1.c.n0<?> other) {
        }

        @Override // i.a.e1.h.f.e.b3.c
        public void completion() {
        }

        @Override // i.a.e1.h.f.e.b3.c
        public void run() {
        }
    }

    /* compiled from: ObservableSampleWithObservable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public b(i.a.e1.c.p0<? super T> actual, i.a.e1.c.n0<?> other) {
        }

        @Override // i.a.e1.h.f.e.b3.c
        public void completion() {
        }

        @Override // i.a.e1.h.f.e.b3.c
        public void run() {
        }
    }

    /* compiled from: ObservableSampleWithObservable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class c<T> extends AtomicReference<T> implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -3517602651313910099L;
        public final i.a.e1.c.p0<? super T> downstream;
        public final AtomicReference<i.a.e1.d.f> other;
        public final i.a.e1.c.n0<?> sampler;
        public i.a.e1.d.f upstream;

        public c(i.a.e1.c.p0<? super T> actual, i.a.e1.c.n0<?> other) {
        }

        public void complete() {
        }

        public abstract void completion();

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void emit() {
        }

        public void error(Throwable e2) {
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

        public abstract void run();

        public boolean setOther(i.a.e1.d.f o2) {
        }
    }

    /* compiled from: ObservableSampleWithObservable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<T> implements i.a.e1.c.p0<Object> {
        public final c<T> b;

        public d(c<T> parent) {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(Object t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    public b3(i.a.e1.c.n0<T> source, i.a.e1.c.n0<?> other, boolean emitLast) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> t) {
    }
}
