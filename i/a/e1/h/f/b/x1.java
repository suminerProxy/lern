package i.a.e1.h.f.b;

import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableInternalHelper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class x1 {

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.g.s<i.a.e1.f.a<T>> {
        public final i.a.e1.c.s<T> b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f27213d;

        public a(i.a.e1.c.s<T> parent, int bufferSize, boolean eagerTruncate) {
        }

        public i.a.e1.f.a<T> a() {
        }

        @Override // i.a.e1.g.s
        public /* bridge */ /* synthetic */ Object get() throws Throwable {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> implements i.a.e1.g.s<i.a.e1.f.a<T>> {
        public final i.a.e1.c.s<T> b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final long f27214d;

        /* renamed from: e  reason: collision with root package name */
        public final TimeUnit f27215e;

        /* renamed from: f  reason: collision with root package name */
        public final i.a.e1.c.q0 f27216f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f27217g;

        public b(i.a.e1.c.s<T> parent, int bufferSize, long time, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean eagerTruncate) {
        }

        public i.a.e1.f.a<T> a() {
        }

        @Override // i.a.e1.g.s
        public /* bridge */ /* synthetic */ Object get() throws Throwable {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T, U> implements i.a.e1.g.o<T, Publisher<U>> {
        private final i.a.e1.g.o<? super T, ? extends Iterable<? extends U>> b;

        public c(i.a.e1.g.o<? super T, ? extends Iterable<? extends U>> mapper) {
        }

        public Publisher<U> a(T t) throws Throwable {
        }

        @Override // i.a.e1.g.o
        public /* bridge */ /* synthetic */ Object apply(Object t) throws Throwable {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
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

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e<T, R, U> implements i.a.e1.g.o<T, Publisher<R>> {
        private final i.a.e1.g.c<? super T, ? super U, ? extends R> b;
        private final i.a.e1.g.o<? super T, ? extends Publisher<? extends U>> c;

        public e(i.a.e1.g.c<? super T, ? super U, ? extends R> combiner, i.a.e1.g.o<? super T, ? extends Publisher<? extends U>> mapper) {
        }

        public Publisher<R> a(final T t) throws Throwable {
        }

        @Override // i.a.e1.g.o
        public /* bridge */ /* synthetic */ Object apply(final Object t) throws Throwable {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class f<T, U> implements i.a.e1.g.o<T, Publisher<T>> {
        public final i.a.e1.g.o<? super T, ? extends Publisher<U>> b;

        public f(i.a.e1.g.o<? super T, ? extends Publisher<U>> itemDelay) {
        }

        public Publisher<T> a(final T v) throws Throwable {
        }

        @Override // i.a.e1.g.o
        public /* bridge */ /* synthetic */ Object apply(final Object v) throws Throwable {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class g<T> implements i.a.e1.g.s<i.a.e1.f.a<T>> {
        public final i.a.e1.c.s<T> b;

        public g(i.a.e1.c.s<T> parent) {
        }

        public i.a.e1.f.a<T> a() {
        }

        @Override // i.a.e1.g.s
        public /* bridge */ /* synthetic */ Object get() throws Throwable {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class h implements i.a.e1.g.g<Subscription> {
        private static final /* synthetic */ h[] $VALUES = null;
        public static final h INSTANCE = null;

        private h(String $enum$name, int $enum$ordinal) {
        }

        public static h valueOf(String name) {
        }

        public static h[] values() {
        }

        @Override // i.a.e1.g.g
        public /* bridge */ /* synthetic */ void accept(Subscription t) throws Throwable {
        }

        /* renamed from: accept  reason: avoid collision after fix types in other method */
        public void accept2(Subscription t) {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class i<T, S> implements i.a.e1.g.c<S, i.a.e1.c.r<T>, S> {
        public final i.a.e1.g.b<S, i.a.e1.c.r<T>> b;

        public i(i.a.e1.g.b<S, i.a.e1.c.r<T>> consumer) {
        }

        public S a(S t1, i.a.e1.c.r<T> t2) throws Throwable {
        }

        @Override // i.a.e1.g.c
        public /* bridge */ /* synthetic */ Object apply(Object t1, Object t2) throws Throwable {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class j<T, S> implements i.a.e1.g.c<S, i.a.e1.c.r<T>, S> {
        public final i.a.e1.g.g<i.a.e1.c.r<T>> b;

        public j(i.a.e1.g.g<i.a.e1.c.r<T>> consumer) {
        }

        public S a(S t1, i.a.e1.c.r<T> t2) throws Throwable {
        }

        @Override // i.a.e1.g.c
        public /* bridge */ /* synthetic */ Object apply(Object t1, Object t2) throws Throwable {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class k<T> implements i.a.e1.g.a {
        public final Subscriber<T> b;

        public k(Subscriber<T> subscriber) {
        }

        @Override // i.a.e1.g.a
        public void run() {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class l<T> implements i.a.e1.g.g<Throwable> {
        public final Subscriber<T> b;

        public l(Subscriber<T> subscriber) {
        }

        public void a(Throwable v) {
        }

        @Override // i.a.e1.g.g
        public /* bridge */ /* synthetic */ void accept(Throwable v) throws Throwable {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class m<T> implements i.a.e1.g.g<T> {
        public final Subscriber<T> b;

        public m(Subscriber<T> subscriber) {
        }

        @Override // i.a.e1.g.g
        public void accept(T v) {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class n<T> implements i.a.e1.g.s<i.a.e1.f.a<T>> {
        private final i.a.e1.c.s<T> b;
        private final long c;

        /* renamed from: d  reason: collision with root package name */
        private final TimeUnit f27218d;

        /* renamed from: e  reason: collision with root package name */
        private final i.a.e1.c.q0 f27219e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f27220f;

        public n(i.a.e1.c.s<T> parent, long time, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean eagerTruncate) {
        }

        public i.a.e1.f.a<T> a() {
        }

        @Override // i.a.e1.g.s
        public /* bridge */ /* synthetic */ Object get() throws Throwable {
        }
    }

    private x1() {
    }

    public static <T, U> i.a.e1.g.o<T, Publisher<U>> a(final i.a.e1.g.o<? super T, ? extends Iterable<? extends U>> mapper) {
    }

    public static <T, U, R> i.a.e1.g.o<T, Publisher<R>> b(final i.a.e1.g.o<? super T, ? extends Publisher<? extends U>> mapper, final i.a.e1.g.c<? super T, ? super U, ? extends R> combiner) {
    }

    public static <T, U> i.a.e1.g.o<T, Publisher<T>> c(final i.a.e1.g.o<? super T, ? extends Publisher<U>> itemDelay) {
    }

    public static <T> i.a.e1.g.s<i.a.e1.f.a<T>> d(final i.a.e1.c.s<T> parent) {
    }

    public static <T> i.a.e1.g.s<i.a.e1.f.a<T>> e(final i.a.e1.c.s<T> parent, final int bufferSize, final long time, final TimeUnit unit, final i.a.e1.c.q0 scheduler, boolean eagerTruncate) {
    }

    public static <T> i.a.e1.g.s<i.a.e1.f.a<T>> f(final i.a.e1.c.s<T> parent, final int bufferSize, boolean eagerTruncate) {
    }

    public static <T> i.a.e1.g.s<i.a.e1.f.a<T>> g(final i.a.e1.c.s<T> parent, final long time, final TimeUnit unit, final i.a.e1.c.q0 scheduler, boolean eagerTruncate) {
    }

    public static <T, S> i.a.e1.g.c<S, i.a.e1.c.r<T>, S> h(i.a.e1.g.b<S, i.a.e1.c.r<T>> consumer) {
    }

    public static <T, S> i.a.e1.g.c<S, i.a.e1.c.r<T>, S> i(i.a.e1.g.g<i.a.e1.c.r<T>> consumer) {
    }

    public static <T> i.a.e1.g.a j(Subscriber<T> subscriber) {
    }

    public static <T> i.a.e1.g.g<Throwable> k(Subscriber<T> subscriber) {
    }

    public static <T> i.a.e1.g.g<T> l(Subscriber<T> subscriber) {
    }
}
