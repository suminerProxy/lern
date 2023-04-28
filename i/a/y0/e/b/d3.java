package i.a.y0.e.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableReplay.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d3<T> extends i.a.w0.a<T> implements i.a.y0.c.h<T>, i.a.y0.a.g {

    /* renamed from: g  reason: collision with root package name */
    public static final Callable f28242g = null;
    public final i.a.l<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<j<T>> f28243d;

    /* renamed from: e  reason: collision with root package name */
    public final Callable<? extends g<T>> f28244e;

    /* renamed from: f  reason: collision with root package name */
    public final Publisher<T> f28245f;

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a<T> extends AtomicReference<f> implements g<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        public long index;
        public int size;
        public f tail;

        public final void addLast(f fVar) {
        }

        public final void collect(Collection<? super T> collection) {
        }

        @Override // i.a.y0.e.b.d3.g
        public final void complete() {
        }

        public Object enterTransform(Object obj) {
        }

        @Override // i.a.y0.e.b.d3.g
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

        @Override // i.a.y0.e.b.d3.g
        public final void next(T t) {
        }

        public final void removeFirst() {
        }

        public final void removeSome(int i2) {
        }

        @Override // i.a.y0.e.b.d3.g
        public final void replay(d<T> dVar) {
        }

        public final void setFirst(f fVar) {
        }

        public final void trimHead() {
        }

        public void truncate() {
        }

        public void truncateFinal() {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends i.a.w0.a<T> {
        private final i.a.w0.a<T> c;

        /* renamed from: d  reason: collision with root package name */
        private final i.a.l<T> f28246d;

        public b(i.a.w0.a<T> aVar, i.a.l<T> lVar) {
        }

        @Override // i.a.w0.a
        public void M8(i.a.x0.g<? super i.a.u0.c> gVar) {
        }

        @Override // i.a.l
        public void g6(Subscriber<? super T> subscriber) {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d<T> extends AtomicLong implements Subscription, i.a.u0.c {
        public static final long CANCELLED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        public final Subscriber<? super T> child;
        public boolean emitting;
        public Object index;
        public boolean missed;
        public final j<T> parent;
        public final AtomicLong totalRequested;

        public d(j<T> jVar, Subscriber<? super T> subscriber) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public <U> U index() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public long produced(long j2) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class e<R, U> extends i.a.l<R> {
        private final Callable<? extends i.a.w0.a<U>> c;

        /* renamed from: d  reason: collision with root package name */
        private final i.a.x0.o<? super i.a.l<U>, ? extends Publisher<R>> f28247d;

        /* compiled from: FlowableReplay.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class a implements i.a.x0.g<i.a.u0.c> {
            private final i.a.y0.h.v<R> b;
            public final /* synthetic */ e c;

            public a(e eVar, i.a.y0.h.v<R> vVar) {
            }

            public void a(i.a.u0.c cVar) {
            }

            @Override // i.a.x0.g
            public /* bridge */ /* synthetic */ void accept(i.a.u0.c cVar) throws Exception {
            }
        }

        public e(Callable<? extends i.a.w0.a<U>> callable, i.a.x0.o<? super i.a.l<U>, ? extends Publisher<R>> oVar) {
        }

        @Override // i.a.l
        public void g6(Subscriber<? super R> subscriber) {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class f extends AtomicReference<f> {
        private static final long serialVersionUID = 245354315435971818L;
        public final long index;
        public final Object value;

        public f(Object obj, long j2) {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface g<T> {
        void complete();

        void error(Throwable th);

        void next(T t);

        void replay(d<T> dVar);
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class h<T> implements Callable<g<T>> {
        private final int b;

        public h(int i2) {
        }

        public g<T> a() {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() throws Exception {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class i<T> implements Publisher<T> {
        private final AtomicReference<j<T>> b;
        private final Callable<? extends g<T>> c;

        public i(AtomicReference<j<T>> atomicReference, Callable<? extends g<T>> callable) {
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber<? super T> subscriber) {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class j<T> extends AtomicReference<Subscription> implements i.a.q<T>, i.a.u0.c {
        public static final d[] EMPTY = null;
        public static final d[] TERMINATED = null;
        private static final long serialVersionUID = 7224554242710036740L;
        public final g<T> buffer;
        public boolean done;
        public final AtomicInteger management;
        public long maxChildRequested;
        public long maxUpstreamRequested;
        public final AtomicBoolean shouldConnect;
        public final AtomicReference<d<T>[]> subscribers;

        public j(g<T> gVar) {
        }

        public boolean add(d<T> dVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public void manageRequests() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        public void remove(d<T> dVar) {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class k<T> implements Callable<g<T>> {
        private final int b;
        private final long c;

        /* renamed from: d  reason: collision with root package name */
        private final TimeUnit f28248d;

        /* renamed from: e  reason: collision with root package name */
        private final i.a.j0 f28249e;

        public k(int i2, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
        }

        public g<T> a() {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() throws Exception {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class l<T> extends a<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        public final int limit;
        public final long maxAge;
        public final i.a.j0 scheduler;
        public final TimeUnit unit;

        public l(int i2, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
        }

        @Override // i.a.y0.e.b.d3.a
        public Object enterTransform(Object obj) {
        }

        @Override // i.a.y0.e.b.d3.a
        public f getHead() {
        }

        @Override // i.a.y0.e.b.d3.a
        public Object leaveTransform(Object obj) {
        }

        @Override // i.a.y0.e.b.d3.a
        public void truncate() {
        }

        @Override // i.a.y0.e.b.d3.a
        public void truncateFinal() {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class m<T> extends a<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        public final int limit;

        public m(int i2) {
        }

        @Override // i.a.y0.e.b.d3.a
        public void truncate() {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class n<T> extends ArrayList<Object> implements g<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        public volatile int size;

        public n(int i2) {
        }

        @Override // i.a.y0.e.b.d3.g
        public void complete() {
        }

        @Override // i.a.y0.e.b.d3.g
        public void error(Throwable th) {
        }

        @Override // i.a.y0.e.b.d3.g
        public void next(T t) {
        }

        @Override // i.a.y0.e.b.d3.g
        public void replay(d<T> dVar) {
        }
    }

    private d3(Publisher<T> publisher, i.a.l<T> lVar, AtomicReference<j<T>> atomicReference, Callable<? extends g<T>> callable) {
    }

    public static <T> i.a.w0.a<T> T8(i.a.l<T> lVar, int i2) {
    }

    public static <T> i.a.w0.a<T> U8(i.a.l<T> lVar, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
    }

    public static <T> i.a.w0.a<T> V8(i.a.l<T> lVar, long j2, TimeUnit timeUnit, i.a.j0 j0Var, int i2) {
    }

    public static <T> i.a.w0.a<T> W8(i.a.l<T> lVar, Callable<? extends g<T>> callable) {
    }

    public static <T> i.a.w0.a<T> X8(i.a.l<? extends T> lVar) {
    }

    public static <U, R> i.a.l<R> Y8(Callable<? extends i.a.w0.a<U>> callable, i.a.x0.o<? super i.a.l<U>, ? extends Publisher<R>> oVar) {
    }

    public static <T> i.a.w0.a<T> Z8(i.a.w0.a<T> aVar, i.a.j0 j0Var) {
    }

    @Override // i.a.w0.a
    public void M8(i.a.x0.g<? super i.a.u0.c> gVar) {
    }

    @Override // i.a.y0.a.g
    public void a(i.a.u0.c cVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }

    @Override // i.a.y0.c.h
    public Publisher<T> source() {
    }
}
