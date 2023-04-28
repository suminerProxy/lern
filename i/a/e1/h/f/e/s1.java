package i.a.e1.h.f.e;

import java.util.concurrent.TimeUnit;

/* compiled from: ObservableInternalHelper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class s1 {

    /* compiled from: ObservableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.g.s<i.a.e1.i.a<T>> {
        public final i.a.e1.c.i0<T> b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f27623d;

        public a(i.a.e1.c.i0<T> parent, int bufferSize, boolean eagerTruncate) {
        }

        public i.a.e1.i.a<T> a() {
        }

        @Override // i.a.e1.g.s
        public /* bridge */ /* synthetic */ Object get() throws Throwable {
        }
    }

    /* compiled from: ObservableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> implements i.a.e1.g.s<i.a.e1.i.a<T>> {
        public final i.a.e1.c.i0<T> b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final long f27624d;

        /* renamed from: e  reason: collision with root package name */
        public final TimeUnit f27625e;

        /* renamed from: f  reason: collision with root package name */
        public final i.a.e1.c.q0 f27626f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f27627g;

        public b(i.a.e1.c.i0<T> parent, int bufferSize, long time, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean eagerTruncate) {
        }

        public i.a.e1.i.a<T> a() {
        }

        @Override // i.a.e1.g.s
        public /* bridge */ /* synthetic */ Object get() throws Throwable {
        }
    }

    /* compiled from: ObservableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T, U> implements i.a.e1.g.o<T, i.a.e1.c.n0<U>> {
        private final i.a.e1.g.o<? super T, ? extends Iterable<? extends U>> b;

        public c(i.a.e1.g.o<? super T, ? extends Iterable<? extends U>> mapper) {
        }

        public i.a.e1.c.n0<U> a(T t) throws Throwable {
        }

        @Override // i.a.e1.g.o
        public /* bridge */ /* synthetic */ Object apply(Object t) throws Throwable {
        }
    }

    /* compiled from: ObservableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<U, R, T> implements i.a.e1.g.o<U, R> {
        private final i.a.e1.g.c<? super T, ? super U, ? extends R> b;
        private final T c;

        public d(i.a.e1.g.c<? super T, ? super U, ? extends R> combiner, T t) {
        }

        @Override // i.a.e1.g.o
        public R apply(U w) throws Throwable {
        }
    }

    /* compiled from: ObservableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e<T, R, U> implements i.a.e1.g.o<T, i.a.e1.c.n0<R>> {
        private final i.a.e1.g.c<? super T, ? super U, ? extends R> b;
        private final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends U>> c;

        public e(i.a.e1.g.c<? super T, ? super U, ? extends R> combiner, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends U>> mapper) {
        }

        public i.a.e1.c.n0<R> a(final T t) throws Throwable {
        }

        @Override // i.a.e1.g.o
        public /* bridge */ /* synthetic */ Object apply(final Object t) throws Throwable {
        }
    }

    /* compiled from: ObservableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class f<T, U> implements i.a.e1.g.o<T, i.a.e1.c.n0<T>> {
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<U>> b;

        public f(i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<U>> itemDelay) {
        }

        public i.a.e1.c.n0<T> a(final T v) throws Throwable {
        }

        @Override // i.a.e1.g.o
        public /* bridge */ /* synthetic */ Object apply(final Object v) throws Throwable {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: ObservableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class g implements i.a.e1.g.o<Object, Object> {
        private static final /* synthetic */ g[] $VALUES = null;
        public static final g INSTANCE = null;

        private g(String $enum$name, int $enum$ordinal) {
        }

        public static g valueOf(String name) {
        }

        public static g[] values() {
        }

        @Override // i.a.e1.g.o
        public Object apply(Object t) {
        }
    }

    /* compiled from: ObservableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class h<T> implements i.a.e1.g.a {
        public final i.a.e1.c.p0<T> b;

        public h(i.a.e1.c.p0<T> observer) {
        }

        @Override // i.a.e1.g.a
        public void run() {
        }
    }

    /* compiled from: ObservableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class i<T> implements i.a.e1.g.g<Throwable> {
        public final i.a.e1.c.p0<T> b;

        public i(i.a.e1.c.p0<T> observer) {
        }

        public void a(Throwable v) {
        }

        @Override // i.a.e1.g.g
        public /* bridge */ /* synthetic */ void accept(Throwable v) throws Throwable {
        }
    }

    /* compiled from: ObservableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class j<T> implements i.a.e1.g.g<T> {
        public final i.a.e1.c.p0<T> b;

        public j(i.a.e1.c.p0<T> observer) {
        }

        @Override // i.a.e1.g.g
        public void accept(T v) {
        }
    }

    /* compiled from: ObservableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class k<T> implements i.a.e1.g.s<i.a.e1.i.a<T>> {
        private final i.a.e1.c.i0<T> b;

        public k(i.a.e1.c.i0<T> parent) {
        }

        public i.a.e1.i.a<T> a() {
        }

        @Override // i.a.e1.g.s
        public /* bridge */ /* synthetic */ Object get() throws Throwable {
        }
    }

    /* compiled from: ObservableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class l<T, S> implements i.a.e1.g.c<S, i.a.e1.c.r<T>, S> {
        public final i.a.e1.g.b<S, i.a.e1.c.r<T>> b;

        public l(i.a.e1.g.b<S, i.a.e1.c.r<T>> consumer) {
        }

        public S a(S t1, i.a.e1.c.r<T> t2) throws Throwable {
        }

        @Override // i.a.e1.g.c
        public /* bridge */ /* synthetic */ Object apply(Object t1, Object t2) throws Throwable {
        }
    }

    /* compiled from: ObservableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class m<T, S> implements i.a.e1.g.c<S, i.a.e1.c.r<T>, S> {
        public final i.a.e1.g.g<i.a.e1.c.r<T>> b;

        public m(i.a.e1.g.g<i.a.e1.c.r<T>> consumer) {
        }

        public S a(S t1, i.a.e1.c.r<T> t2) throws Throwable {
        }

        @Override // i.a.e1.g.c
        public /* bridge */ /* synthetic */ Object apply(Object t1, Object t2) throws Throwable {
        }
    }

    /* compiled from: ObservableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class n<T> implements i.a.e1.g.s<i.a.e1.i.a<T>> {
        public final i.a.e1.c.i0<T> b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final TimeUnit f27628d;

        /* renamed from: e  reason: collision with root package name */
        public final i.a.e1.c.q0 f27629e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f27630f;

        public n(i.a.e1.c.i0<T> parent, long time, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean eagerTruncate) {
        }

        public i.a.e1.i.a<T> a() {
        }

        @Override // i.a.e1.g.s
        public /* bridge */ /* synthetic */ Object get() throws Throwable {
        }
    }

    private s1() {
    }

    public static <T, U> i.a.e1.g.o<T, i.a.e1.c.n0<U>> a(final i.a.e1.g.o<? super T, ? extends Iterable<? extends U>> mapper) {
    }

    public static <T, U, R> i.a.e1.g.o<T, i.a.e1.c.n0<R>> b(final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends U>> mapper, final i.a.e1.g.c<? super T, ? super U, ? extends R> combiner) {
    }

    public static <T, U> i.a.e1.g.o<T, i.a.e1.c.n0<T>> c(final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<U>> itemDelay) {
    }

    public static <T> i.a.e1.g.a d(i.a.e1.c.p0<T> observer) {
    }

    public static <T> i.a.e1.g.g<Throwable> e(i.a.e1.c.p0<T> observer) {
    }

    public static <T> i.a.e1.g.g<T> f(i.a.e1.c.p0<T> observer) {
    }

    public static <T> i.a.e1.g.s<i.a.e1.i.a<T>> g(final i.a.e1.c.i0<T> parent) {
    }

    public static <T> i.a.e1.g.s<i.a.e1.i.a<T>> h(final i.a.e1.c.i0<T> parent, final int bufferSize, final long time, final TimeUnit unit, final i.a.e1.c.q0 scheduler, boolean eagerTruncate) {
    }

    public static <T> i.a.e1.g.s<i.a.e1.i.a<T>> i(final i.a.e1.c.i0<T> parent, final int bufferSize, boolean eagerTruncate) {
    }

    public static <T> i.a.e1.g.s<i.a.e1.i.a<T>> j(final i.a.e1.c.i0<T> parent, final long time, final TimeUnit unit, final i.a.e1.c.q0 scheduler, boolean eagerTruncate) {
    }

    public static <T, S> i.a.e1.g.c<S, i.a.e1.c.r<T>, S> k(i.a.e1.g.b<S, i.a.e1.c.r<T>> consumer) {
    }

    public static <T, S> i.a.e1.g.c<S, i.a.e1.c.r<T>, S> l(i.a.e1.g.g<i.a.e1.c.r<T>> consumer) {
    }
}
