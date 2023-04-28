package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSampleWithObservable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class w2<T> extends i.a.y0.e.e.a<T, T> {
    public final i.a.g0<?> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f28985d;

    /* compiled from: ObservableSampleWithObservable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        public volatile boolean done;
        public final AtomicInteger wip;

        public a(i.a.i0<? super T> i0Var, i.a.g0<?> g0Var) {
        }

        @Override // i.a.y0.e.e.w2.c
        public void completeMain() {
        }

        @Override // i.a.y0.e.e.w2.c
        public void completeOther() {
        }

        @Override // i.a.y0.e.e.w2.c
        public void run() {
        }
    }

    /* compiled from: ObservableSampleWithObservable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public b(i.a.i0<? super T> i0Var, i.a.g0<?> g0Var) {
        }

        @Override // i.a.y0.e.e.w2.c
        public void completeMain() {
        }

        @Override // i.a.y0.e.e.w2.c
        public void completeOther() {
        }

        @Override // i.a.y0.e.e.w2.c
        public void run() {
        }
    }

    /* compiled from: ObservableSampleWithObservable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class c<T> extends AtomicReference<T> implements i.a.i0<T>, i.a.u0.c {
        private static final long serialVersionUID = -3517602651313910099L;
        public final i.a.i0<? super T> downstream;
        public final AtomicReference<i.a.u0.c> other;
        public final i.a.g0<?> sampler;
        public i.a.u0.c upstream;

        public c(i.a.i0<? super T> i0Var, i.a.g0<?> g0Var) {
        }

        public void complete() {
        }

        public abstract void completeMain();

        public abstract void completeOther();

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void emit() {
        }

        public void error(Throwable th) {
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

        public abstract void run();

        public boolean setOther(i.a.u0.c cVar) {
        }
    }

    /* compiled from: ObservableSampleWithObservable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d<T> implements i.a.i0<Object> {
        public final c<T> b;

        public d(c<T> cVar) {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(Object obj) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    public w2(i.a.g0<T> g0Var, i.a.g0<?> g0Var2, boolean z) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
