package i.a.y0.e.e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableReplay.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class r2<T> extends i.a.z0.a<T> implements i.a.y0.c.g<T>, i.a.y0.a.g {

    /* renamed from: f  reason: collision with root package name */
    public static final b f28937f = null;
    public final i.a.g0<T> b;
    public final AtomicReference<j<T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final b<T> f28938d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.g0<T> f28939e;

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class a<T> extends AtomicReference<f> implements h<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        public int size;
        public f tail;

        public final void addLast(f fVar) {
        }

        public final void collect(Collection<? super T> collection) {
        }

        @Override // i.a.y0.e.e.r2.h
        public final void complete() {
        }

        public Object enterTransform(Object obj) {
        }

        @Override // i.a.y0.e.e.r2.h
        public final void error(Throwable th) {
        }

        public f getHead() {
        }

        public boolean hasCompleted() {
        }

        public boolean hasError() {
        }

        public Object leaveTransform(Object obj) {
        }

        @Override // i.a.y0.e.e.r2.h
        public final void next(T t) {
        }

        public final void removeFirst() {
        }

        public final void removeSome(int i2) {
        }

        @Override // i.a.y0.e.e.r2.h
        public final void replay(d<T> dVar) {
        }

        public final void setFirst(f fVar) {
        }

        public final void trimHead() {
        }

        public abstract void truncate();

        public void truncateFinal() {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface b<T> {
        h<T> call();
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<R> implements i.a.x0.g<i.a.u0.c> {
        private final n4<R> b;

        public c(n4<R> n4Var) {
        }

        public void a(i.a.u0.c cVar) {
        }

        @Override // i.a.x0.g
        public /* bridge */ /* synthetic */ void accept(i.a.u0.c cVar) throws Exception {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d<T> extends AtomicInteger implements i.a.u0.c {
        private static final long serialVersionUID = 2728361546769921047L;
        public volatile boolean cancelled;
        public final i.a.i0<? super T> child;
        public Object index;
        public final j<T> parent;

        public d(j<T> jVar, i.a.i0<? super T> i0Var) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public <U> U index() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class e<R, U> extends i.a.b0<R> {
        private final Callable<? extends i.a.z0.a<U>> b;
        private final i.a.x0.o<? super i.a.b0<U>, ? extends i.a.g0<R>> c;

        public e(Callable<? extends i.a.z0.a<U>> callable, i.a.x0.o<? super i.a.b0<U>, ? extends i.a.g0<R>> oVar) {
        }

        @Override // i.a.b0
        public void subscribeActual(i.a.i0<? super R> i0Var) {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class f extends AtomicReference<f> {
        private static final long serialVersionUID = 245354315435971818L;
        public final Object value;

        public f(Object obj) {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class g<T> extends i.a.z0.a<T> {
        private final i.a.z0.a<T> b;
        private final i.a.b0<T> c;

        public g(i.a.z0.a<T> aVar, i.a.b0<T> b0Var) {
        }

        @Override // i.a.z0.a
        public void f(i.a.x0.g<? super i.a.u0.c> gVar) {
        }

        @Override // i.a.b0
        public void subscribeActual(i.a.i0<? super T> i0Var) {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface h<T> {
        void complete();

        void error(Throwable th);

        void next(T t);

        void replay(d<T> dVar);
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class i<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f28940a;

        public i(int i2) {
        }

        @Override // i.a.y0.e.e.r2.b
        public h<T> call() {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class j<T> extends AtomicReference<i.a.u0.c> implements i.a.i0<T>, i.a.u0.c {
        public static final d[] EMPTY = null;
        public static final d[] TERMINATED = null;
        private static final long serialVersionUID = -533785617179540163L;
        public final h<T> buffer;
        public boolean done;
        public final AtomicReference<d[]> observers;
        public final AtomicBoolean shouldConnect;

        public j(h<T> hVar) {
        }

        public boolean add(d<T> dVar) {
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

        public void remove(d<T> dVar) {
        }

        public void replay() {
        }

        public void replayFinal() {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class k<T> implements i.a.g0<T> {
        private final AtomicReference<j<T>> b;
        private final b<T> c;

        public k(AtomicReference<j<T>> atomicReference, b<T> bVar) {
        }

        @Override // i.a.g0
        public void subscribe(i.a.i0<? super T> i0Var) {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class l<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f28941a;
        private final long b;
        private final TimeUnit c;

        /* renamed from: d  reason: collision with root package name */
        private final i.a.j0 f28942d;

        public l(int i2, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
        }

        @Override // i.a.y0.e.e.r2.b
        public h<T> call() {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class m<T> extends a<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        public final int limit;
        public final long maxAge;
        public final i.a.j0 scheduler;
        public final TimeUnit unit;

        public m(int i2, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
        }

        @Override // i.a.y0.e.e.r2.a
        public Object enterTransform(Object obj) {
        }

        @Override // i.a.y0.e.e.r2.a
        public f getHead() {
        }

        @Override // i.a.y0.e.e.r2.a
        public Object leaveTransform(Object obj) {
        }

        @Override // i.a.y0.e.e.r2.a
        public void truncate() {
        }

        @Override // i.a.y0.e.e.r2.a
        public void truncateFinal() {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class n<T> extends a<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        public final int limit;

        public n(int i2) {
        }

        @Override // i.a.y0.e.e.r2.a
        public void truncate() {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class o implements b<Object> {
        @Override // i.a.y0.e.e.r2.b
        public h<Object> call() {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class p<T> extends ArrayList<Object> implements h<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        public volatile int size;

        public p(int i2) {
        }

        @Override // i.a.y0.e.e.r2.h
        public void complete() {
        }

        @Override // i.a.y0.e.e.r2.h
        public void error(Throwable th) {
        }

        @Override // i.a.y0.e.e.r2.h
        public void next(T t) {
        }

        @Override // i.a.y0.e.e.r2.h
        public void replay(d<T> dVar) {
        }
    }

    private r2(i.a.g0<T> g0Var, i.a.g0<T> g0Var2, AtomicReference<j<T>> atomicReference, b<T> bVar) {
    }

    public static <T> i.a.z0.a<T> m(i.a.g0<T> g0Var, int i2) {
    }

    public static <T> i.a.z0.a<T> n(i.a.g0<T> g0Var, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
    }

    public static <T> i.a.z0.a<T> o(i.a.g0<T> g0Var, long j2, TimeUnit timeUnit, i.a.j0 j0Var, int i2) {
    }

    public static <T> i.a.z0.a<T> p(i.a.g0<T> g0Var, b<T> bVar) {
    }

    public static <T> i.a.z0.a<T> q(i.a.g0<? extends T> g0Var) {
    }

    public static <U, R> i.a.b0<R> r(Callable<? extends i.a.z0.a<U>> callable, i.a.x0.o<? super i.a.b0<U>, ? extends i.a.g0<R>> oVar) {
    }

    public static <T> i.a.z0.a<T> s(i.a.z0.a<T> aVar, i.a.j0 j0Var) {
    }

    @Override // i.a.y0.a.g
    public void a(i.a.u0.c cVar) {
    }

    @Override // i.a.z0.a
    public void f(i.a.x0.g<? super i.a.u0.c> gVar) {
    }

    @Override // i.a.y0.c.g
    public i.a.g0<T> source() {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
