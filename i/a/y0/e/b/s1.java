package i.a.y0.e.b;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableInternalHelper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class s1 {

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements Callable<i.a.w0.a<T>> {
        private final i.a.l<T> b;
        private final int c;

        public a(i.a.l<T> lVar, int i2) {
        }

        public i.a.w0.a<T> a() {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() throws Exception {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> implements Callable<i.a.w0.a<T>> {
        private final i.a.l<T> b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private final long f28474d;

        /* renamed from: e  reason: collision with root package name */
        private final TimeUnit f28475e;

        /* renamed from: f  reason: collision with root package name */
        private final i.a.j0 f28476f;

        public b(i.a.l<T> lVar, int i2, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
        }

        public i.a.w0.a<T> a() {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() throws Exception {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T, U> implements i.a.x0.o<T, Publisher<U>> {
        private final i.a.x0.o<? super T, ? extends Iterable<? extends U>> b;

        public c(i.a.x0.o<? super T, ? extends Iterable<? extends U>> oVar) {
        }

        public Publisher<U> a(T t) throws Exception {
        }

        @Override // i.a.x0.o
        public /* bridge */ /* synthetic */ Object apply(Object obj) throws Exception {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d<U, R, T> implements i.a.x0.o<U, R> {
        private final i.a.x0.c<? super T, ? super U, ? extends R> b;
        private final T c;

        public d(i.a.x0.c<? super T, ? super U, ? extends R> cVar, T t) {
        }

        @Override // i.a.x0.o
        public R apply(U u) throws Exception {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class e<T, R, U> implements i.a.x0.o<T, Publisher<R>> {
        private final i.a.x0.c<? super T, ? super U, ? extends R> b;
        private final i.a.x0.o<? super T, ? extends Publisher<? extends U>> c;

        public e(i.a.x0.c<? super T, ? super U, ? extends R> cVar, i.a.x0.o<? super T, ? extends Publisher<? extends U>> oVar) {
        }

        public Publisher<R> a(T t) throws Exception {
        }

        @Override // i.a.x0.o
        public /* bridge */ /* synthetic */ Object apply(Object obj) throws Exception {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class f<T, U> implements i.a.x0.o<T, Publisher<T>> {
        public final i.a.x0.o<? super T, ? extends Publisher<U>> b;

        public f(i.a.x0.o<? super T, ? extends Publisher<U>> oVar) {
        }

        public Publisher<T> a(T t) throws Exception {
        }

        @Override // i.a.x0.o
        public /* bridge */ /* synthetic */ Object apply(Object obj) throws Exception {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class g<T> implements Callable<i.a.w0.a<T>> {
        private final i.a.l<T> b;

        public g(i.a.l<T> lVar) {
        }

        public i.a.w0.a<T> a() {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() throws Exception {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class h<T, R> implements i.a.x0.o<i.a.l<T>, Publisher<R>> {
        private final i.a.x0.o<? super i.a.l<T>, ? extends Publisher<R>> b;
        private final i.a.j0 c;

        public h(i.a.x0.o<? super i.a.l<T>, ? extends Publisher<R>> oVar, i.a.j0 j0Var) {
        }

        public Publisher<R> a(i.a.l<T> lVar) throws Exception {
        }

        @Override // i.a.x0.o
        public /* bridge */ /* synthetic */ Object apply(Object obj) throws Exception {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class i implements i.a.x0.g<Subscription> {
        private static final /* synthetic */ i[] $VALUES = null;
        public static final i INSTANCE = null;

        private i(String str, int i2) {
        }

        public static i valueOf(String str) {
        }

        public static i[] values() {
        }

        @Override // i.a.x0.g
        public /* bridge */ /* synthetic */ void accept(Subscription subscription) throws Exception {
        }

        /* renamed from: accept  reason: avoid collision after fix types in other method */
        public void accept2(Subscription subscription) throws Exception {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class j<T, S> implements i.a.x0.c<S, i.a.k<T>, S> {
        public final i.a.x0.b<S, i.a.k<T>> b;

        public j(i.a.x0.b<S, i.a.k<T>> bVar) {
        }

        public S a(S s, i.a.k<T> kVar) throws Exception {
        }

        @Override // i.a.x0.c
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) throws Exception {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class k<T, S> implements i.a.x0.c<S, i.a.k<T>, S> {
        public final i.a.x0.g<i.a.k<T>> b;

        public k(i.a.x0.g<i.a.k<T>> gVar) {
        }

        public S a(S s, i.a.k<T> kVar) throws Exception {
        }

        @Override // i.a.x0.c
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) throws Exception {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class l<T> implements i.a.x0.a {
        public final Subscriber<T> b;

        public l(Subscriber<T> subscriber) {
        }

        @Override // i.a.x0.a
        public void run() throws Exception {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class m<T> implements i.a.x0.g<Throwable> {
        public final Subscriber<T> b;

        public m(Subscriber<T> subscriber) {
        }

        public void a(Throwable th) throws Exception {
        }

        @Override // i.a.x0.g
        public /* bridge */ /* synthetic */ void accept(Throwable th) throws Exception {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class n<T> implements i.a.x0.g<T> {
        public final Subscriber<T> b;

        public n(Subscriber<T> subscriber) {
        }

        @Override // i.a.x0.g
        public void accept(T t) throws Exception {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class o<T> implements Callable<i.a.w0.a<T>> {
        private final i.a.l<T> b;
        private final long c;

        /* renamed from: d  reason: collision with root package name */
        private final TimeUnit f28477d;

        /* renamed from: e  reason: collision with root package name */
        private final i.a.j0 f28478e;

        public o(i.a.l<T> lVar, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
        }

        public i.a.w0.a<T> a() {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() throws Exception {
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class p<T, R> implements i.a.x0.o<List<Publisher<? extends T>>, Publisher<? extends R>> {
        private final i.a.x0.o<? super Object[], ? extends R> b;

        public p(i.a.x0.o<? super Object[], ? extends R> oVar) {
        }

        public Publisher<? extends R> a(List<Publisher<? extends T>> list) {
        }

        @Override // i.a.x0.o
        public /* bridge */ /* synthetic */ Object apply(Object obj) throws Exception {
        }
    }

    private s1() {
    }

    public static <T, U> i.a.x0.o<T, Publisher<U>> a(i.a.x0.o<? super T, ? extends Iterable<? extends U>> oVar) {
    }

    public static <T, U, R> i.a.x0.o<T, Publisher<R>> b(i.a.x0.o<? super T, ? extends Publisher<? extends U>> oVar, i.a.x0.c<? super T, ? super U, ? extends R> cVar) {
    }

    public static <T, U> i.a.x0.o<T, Publisher<T>> c(i.a.x0.o<? super T, ? extends Publisher<U>> oVar) {
    }

    public static <T> Callable<i.a.w0.a<T>> d(i.a.l<T> lVar) {
    }

    public static <T> Callable<i.a.w0.a<T>> e(i.a.l<T> lVar, int i2) {
    }

    public static <T> Callable<i.a.w0.a<T>> f(i.a.l<T> lVar, int i2, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
    }

    public static <T> Callable<i.a.w0.a<T>> g(i.a.l<T> lVar, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
    }

    public static <T, R> i.a.x0.o<i.a.l<T>, Publisher<R>> h(i.a.x0.o<? super i.a.l<T>, ? extends Publisher<R>> oVar, i.a.j0 j0Var) {
    }

    public static <T, S> i.a.x0.c<S, i.a.k<T>, S> i(i.a.x0.b<S, i.a.k<T>> bVar) {
    }

    public static <T, S> i.a.x0.c<S, i.a.k<T>, S> j(i.a.x0.g<i.a.k<T>> gVar) {
    }

    public static <T> i.a.x0.a k(Subscriber<T> subscriber) {
    }

    public static <T> i.a.x0.g<Throwable> l(Subscriber<T> subscriber) {
    }

    public static <T> i.a.x0.g<T> m(Subscriber<T> subscriber) {
    }

    public static <T, R> i.a.x0.o<List<Publisher<? extends T>>, Publisher<? extends R>> n(i.a.x0.o<? super Object[], ? extends R> oVar) {
    }
}
