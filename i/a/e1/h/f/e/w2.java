package i.a.e1.h.f.e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableReplay.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class w2<T> extends i.a.e1.i.a<T> implements i.a.e1.h.c.i<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final b f27667f = null;
    public final i.a.e1.c.n0<T> b;
    public final AtomicReference<i<T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final b<T> f27668d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.c.n0<T> f27669e;

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class a<T> extends AtomicReference<f> implements g<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        public final boolean eagerTruncate;
        public int size;
        public f tail;

        public a(boolean eagerTruncate) {
        }

        public final void addLast(f n2) {
        }

        public final void collect(Collection<? super T> output) {
        }

        @Override // i.a.e1.h.f.e.w2.g
        public final void complete() {
        }

        public Object enterTransform(Object value) {
        }

        @Override // i.a.e1.h.f.e.w2.g
        public final void error(Throwable e2) {
        }

        public f getHead() {
        }

        public boolean hasCompleted() {
        }

        public boolean hasError() {
        }

        public Object leaveTransform(Object value) {
        }

        @Override // i.a.e1.h.f.e.w2.g
        public final void next(T value) {
        }

        public final void removeFirst() {
        }

        public final void removeSome(int n2) {
        }

        @Override // i.a.e1.h.f.e.w2.g
        public final void replay(d<T> output) {
        }

        public final void setFirst(f n2) {
        }

        public final void trimHead() {
        }

        public abstract void truncate();

        public void truncateFinal() {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface b<T> {
        g<T> call();
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<R> implements i.a.e1.g.g<i.a.e1.d.f> {
        private final s4<R> b;

        public c(s4<R> srw) {
        }

        public void a(i.a.e1.d.f r) {
        }

        @Override // i.a.e1.g.g
        public /* bridge */ /* synthetic */ void accept(i.a.e1.d.f r) throws Throwable {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<T> extends AtomicInteger implements i.a.e1.d.f {
        private static final long serialVersionUID = 2728361546769921047L;
        public volatile boolean cancelled;
        public final i.a.e1.c.p0<? super T> child;
        public Object index;
        public final i<T> parent;

        public d(i<T> parent, i.a.e1.c.p0<? super T> child) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public <U> U index() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e<R, U> extends i.a.e1.c.i0<R> {
        private final i.a.e1.g.s<? extends i.a.e1.i.a<U>> b;
        private final i.a.e1.g.o<? super i.a.e1.c.i0<U>, ? extends i.a.e1.c.n0<R>> c;

        public e(i.a.e1.g.s<? extends i.a.e1.i.a<U>> connectableFactory, i.a.e1.g.o<? super i.a.e1.c.i0<U>, ? extends i.a.e1.c.n0<R>> selector) {
        }

        @Override // i.a.e1.c.i0
        public void c6(i.a.e1.c.p0<? super R> child) {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class f extends AtomicReference<f> {
        private static final long serialVersionUID = 245354315435971818L;
        public final Object value;

        public f(Object value) {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface g<T> {
        void complete();

        void error(Throwable e2);

        void next(T value);

        void replay(d<T> output);
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class h<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f27670a;
        public final boolean b;

        public h(int bufferSize, boolean eagerTruncate) {
        }

        @Override // i.a.e1.h.f.e.w2.b
        public g<T> call() {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class i<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        public static final d[] EMPTY = null;
        public static final d[] TERMINATED = null;
        private static final long serialVersionUID = -533785617179540163L;
        public final g<T> buffer;
        public final AtomicReference<i<T>> current;
        public boolean done;
        public final AtomicReference<d[]> observers;
        public final AtomicBoolean shouldConnect;

        public i(g<T> buffer, AtomicReference<i<T>> current) {
        }

        public boolean add(d<T> producer) {
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
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f p2) {
        }

        public void remove(d<T> producer) {
        }

        public void replay() {
        }

        public void replayFinal() {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class j<T> implements i.a.e1.c.n0<T> {
        private final AtomicReference<i<T>> b;
        private final b<T> c;

        public j(AtomicReference<i<T>> curr, b<T> bufferFactory) {
        }

        @Override // i.a.e1.c.n0
        public void subscribe(i.a.e1.c.p0<? super T> child) {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class k<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f27671a;
        private final long b;
        private final TimeUnit c;

        /* renamed from: d  reason: collision with root package name */
        private final i.a.e1.c.q0 f27672d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f27673e;

        public k(int bufferSize, long maxAge, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean eagerTruncate) {
        }

        @Override // i.a.e1.h.f.e.w2.b
        public g<T> call() {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class l<T> extends a<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        public final int limit;
        public final long maxAge;
        public final i.a.e1.c.q0 scheduler;
        public final TimeUnit unit;

        public l(int limit, long maxAge, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean eagerTruncate) {
        }

        @Override // i.a.e1.h.f.e.w2.a
        public Object enterTransform(Object value) {
        }

        @Override // i.a.e1.h.f.e.w2.a
        public f getHead() {
        }

        @Override // i.a.e1.h.f.e.w2.a
        public Object leaveTransform(Object value) {
        }

        @Override // i.a.e1.h.f.e.w2.a
        public void truncate() {
        }

        @Override // i.a.e1.h.f.e.w2.a
        public void truncateFinal() {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class m<T> extends a<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        public final int limit;

        public m(int limit, boolean eagerTruncate) {
        }

        @Override // i.a.e1.h.f.e.w2.a
        public void truncate() {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class n implements b<Object> {
        @Override // i.a.e1.h.f.e.w2.b
        public g<Object> call() {
        }
    }

    /* compiled from: ObservableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class o<T> extends ArrayList<Object> implements g<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        public volatile int size;

        public o(int capacityHint) {
        }

        @Override // i.a.e1.h.f.e.w2.g
        public void complete() {
        }

        @Override // i.a.e1.h.f.e.w2.g
        public void error(Throwable e2) {
        }

        @Override // i.a.e1.h.f.e.w2.g
        public void next(T value) {
        }

        @Override // i.a.e1.h.f.e.w2.g
        public void replay(d<T> output) {
        }
    }

    private w2(i.a.e1.c.n0<T> onSubscribe, i.a.e1.c.n0<T> source, final AtomicReference<i<T>> current, final b<T> bufferFactory) {
    }

    public static <T> i.a.e1.i.a<T> L8(i.a.e1.c.n0<T> source, final int bufferSize, boolean eagerTruncate) {
    }

    public static <T> i.a.e1.i.a<T> M8(i.a.e1.c.n0<T> source, final long maxAge, final TimeUnit unit, final i.a.e1.c.q0 scheduler, final int bufferSize, boolean eagerTruncate) {
    }

    public static <T> i.a.e1.i.a<T> N8(i.a.e1.c.n0<T> source, long maxAge, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean eagerTruncate) {
    }

    public static <T> i.a.e1.i.a<T> O8(i.a.e1.c.n0<T> source, final b<T> bufferFactory) {
    }

    public static <T> i.a.e1.i.a<T> P8(i.a.e1.c.n0<? extends T> source) {
    }

    public static <U, R> i.a.e1.c.i0<R> Q8(final i.a.e1.g.s<? extends i.a.e1.i.a<U>> connectableFactory, final i.a.e1.g.o<? super i.a.e1.c.i0<U>, ? extends i.a.e1.c.n0<R>> selector) {
    }

    @Override // i.a.e1.i.a
    public void D8(i.a.e1.g.g<? super i.a.e1.d.f> connection) {
    }

    @Override // i.a.e1.i.a
    public void K8() {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> observer) {
    }

    @Override // i.a.e1.h.c.i
    public i.a.e1.c.n0<T> source() {
    }
}
