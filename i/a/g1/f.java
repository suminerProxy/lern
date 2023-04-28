package i.a.g1;

import i.a.i0;
import i.a.j0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ReplaySubject.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class f<T> extends i<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final c[] f28087e = null;

    /* renamed from: f  reason: collision with root package name */
    public static final c[] f28088f = null;

    /* renamed from: g  reason: collision with root package name */
    private static final Object[] f28089g = null;
    public final b<T> b;
    public final AtomicReference<c<T>[]> c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28090d;

    /* compiled from: ReplaySubject.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final T value;

        public a(T t) {
        }
    }

    /* compiled from: ReplaySubject.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface b<T> {
        void add(T t);

        void addFinal(Object obj);

        boolean compareAndSet(Object obj, Object obj2);

        Object get();

        @i.a.t0.g
        T getValue();

        T[] getValues(T[] tArr);

        void replay(c<T> cVar);

        int size();

        void trimHead();
    }

    /* compiled from: ReplaySubject.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends AtomicInteger implements i.a.u0.c {
        private static final long serialVersionUID = 466549804534799122L;
        public volatile boolean cancelled;
        public final i0<? super T> downstream;
        public Object index;
        public final f<T> state;

        public c(i0<? super T> i0Var, f<T> fVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }
    }

    /* compiled from: ReplaySubject.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = -8056260896137901749L;
        public volatile boolean done;
        public volatile C0518f<Object> head;
        public final long maxAge;
        public final int maxSize;
        public final j0 scheduler;
        public int size;
        public C0518f<Object> tail;
        public final TimeUnit unit;

        public d(int i2, long j2, TimeUnit timeUnit, j0 j0Var) {
        }

        @Override // i.a.g1.f.b
        public void add(T t) {
        }

        @Override // i.a.g1.f.b
        public void addFinal(Object obj) {
        }

        public C0518f<Object> getHead() {
        }

        @Override // i.a.g1.f.b
        @i.a.t0.g
        public T getValue() {
        }

        @Override // i.a.g1.f.b
        public T[] getValues(T[] tArr) {
        }

        @Override // i.a.g1.f.b
        public void replay(c<T> cVar) {
        }

        @Override // i.a.g1.f.b
        public int size() {
        }

        public void trim() {
        }

        public void trimFinal() {
        }

        @Override // i.a.g1.f.b
        public void trimHead() {
        }

        public int size(C0518f<Object> c0518f) {
        }
    }

    /* compiled from: ReplaySubject.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = 1107649250281456395L;
        public volatile boolean done;
        public volatile a<Object> head;
        public final int maxSize;
        public int size;
        public a<Object> tail;

        public e(int i2) {
        }

        @Override // i.a.g1.f.b
        public void add(T t) {
        }

        @Override // i.a.g1.f.b
        public void addFinal(Object obj) {
        }

        @Override // i.a.g1.f.b
        @i.a.t0.g
        public T getValue() {
        }

        @Override // i.a.g1.f.b
        public T[] getValues(T[] tArr) {
        }

        @Override // i.a.g1.f.b
        public void replay(c<T> cVar) {
        }

        @Override // i.a.g1.f.b
        public int size() {
        }

        public void trim() {
        }

        @Override // i.a.g1.f.b
        public void trimHead() {
        }
    }

    /* compiled from: ReplaySubject.java */
    /* renamed from: i.a.g1.f$f  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class C0518f<T> extends AtomicReference<C0518f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final long time;
        public final T value;

        public C0518f(T t, long j2) {
        }
    }

    /* compiled from: ReplaySubject.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class g<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = -733876083048047795L;
        public final List<Object> buffer;
        public volatile boolean done;
        public volatile int size;

        public g(int i2) {
        }

        @Override // i.a.g1.f.b
        public void add(T t) {
        }

        @Override // i.a.g1.f.b
        public void addFinal(Object obj) {
        }

        @Override // i.a.g1.f.b
        @i.a.t0.g
        public T getValue() {
        }

        @Override // i.a.g1.f.b
        public T[] getValues(T[] tArr) {
        }

        @Override // i.a.g1.f.b
        public void replay(c<T> cVar) {
        }

        @Override // i.a.g1.f.b
        public int size() {
        }

        @Override // i.a.g1.f.b
        public void trimHead() {
        }
    }

    public f(b<T> bVar) {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> f<T> j() {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> f<T> k(int i2) {
    }

    public static <T> f<T> l() {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> f<T> m(int i2) {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> f<T> n(long j2, TimeUnit timeUnit, j0 j0Var) {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> f<T> o(long j2, TimeUnit timeUnit, j0 j0Var, int i2) {
    }

    @Override // i.a.g1.i
    @i.a.t0.g
    public Throwable b() {
    }

    @Override // i.a.g1.i
    public boolean c() {
    }

    @Override // i.a.g1.i
    public boolean d() {
    }

    @Override // i.a.g1.i
    public boolean e() {
    }

    public boolean h(c<T> cVar) {
    }

    public void i() {
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

    @i.a.t0.g
    public T p() {
    }

    public Object[] q() {
    }

    public T[] r(T[] tArr) {
    }

    public boolean s() {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super T> i0Var) {
    }

    public int t() {
    }

    public void u(c<T> cVar) {
    }

    public int v() {
    }

    public c<T>[] w(Object obj) {
    }
}
