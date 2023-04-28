package i.a.e1.h.f.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableReplay.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class i3<T> extends i.a.e1.f.a<T> implements i.a.e1.h.c.j<T> {

    /* renamed from: g  reason: collision with root package name */
    public static final i.a.e1.g.s f26988g = null;
    public final i.a.e1.c.s<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<i<T>> f26989d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.s<? extends f<T>> f26990e;

    /* renamed from: f  reason: collision with root package name */
    public final Publisher<T> f26991f;

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class a<T> extends AtomicReference<e> implements f<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        public final boolean eagerTruncate;
        public long index;
        public int size;
        public e tail;

        public a(boolean eagerTruncate) {
        }

        public final void addLast(e n2) {
        }

        public final void collect(Collection<? super T> output) {
        }

        @Override // i.a.e1.h.f.b.i3.f
        public final void complete() {
        }

        public Object enterTransform(Object value, boolean terminal) {
        }

        @Override // i.a.e1.h.f.b.i3.f
        public final void error(Throwable e2) {
        }

        public e getHead() {
        }

        public boolean hasCompleted() {
        }

        public boolean hasError() {
        }

        public Object leaveTransform(Object value) {
        }

        @Override // i.a.e1.h.f.b.i3.f
        public final void next(T value) {
        }

        public final void removeFirst() {
        }

        public final void removeSome(int n2) {
        }

        @Override // i.a.e1.h.f.b.i3.f
        public final void replay(c<T> output) {
        }

        public final void setFirst(e n2) {
        }

        public final void trimHead() {
        }

        public abstract void truncate();

        public void truncateFinal() {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b implements i.a.e1.g.s<Object> {
        @Override // i.a.e1.g.s
        public Object get() {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends AtomicLong implements Subscription, i.a.e1.d.f {
        public static final long CANCELLED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        public final Subscriber<? super T> child;
        public boolean emitting;
        public Object index;
        public boolean missed;
        public final i<T> parent;
        public final AtomicLong totalRequested;

        public c(i<T> parent, Subscriber<? super T> child) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public <U> U index() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        public long produced(long n2) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<R, U> extends i.a.e1.c.s<R> {
        private final i.a.e1.g.s<? extends i.a.e1.f.a<U>> c;

        /* renamed from: d  reason: collision with root package name */
        private final i.a.e1.g.o<? super i.a.e1.c.s<U>, ? extends Publisher<R>> f26992d;

        /* compiled from: FlowableReplay.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class a implements i.a.e1.g.g<i.a.e1.d.f> {
            private final i.a.e1.h.i.v<R> b;
            public final /* synthetic */ d c;

            public a(final d this$0, i.a.e1.h.i.v<R> srw) {
            }

            public void a(i.a.e1.d.f r) {
            }

            @Override // i.a.e1.g.g
            public /* bridge */ /* synthetic */ void accept(i.a.e1.d.f r) throws Throwable {
            }
        }

        public d(i.a.e1.g.s<? extends i.a.e1.f.a<U>> connectableFactory, i.a.e1.g.o<? super i.a.e1.c.s<U>, ? extends Publisher<R>> selector) {
        }

        @Override // i.a.e1.c.s
        public void F6(Subscriber<? super R> child) {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e extends AtomicReference<e> {
        private static final long serialVersionUID = 245354315435971818L;
        public final long index;
        public final Object value;

        public e(Object value, long index) {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface f<T> {
        void complete();

        void error(Throwable e2);

        void next(T value);

        void replay(c<T> output);
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class g<T> implements i.a.e1.g.s<f<T>> {
        public final int b;
        public final boolean c;

        public g(int bufferSize, boolean eagerTruncate) {
        }

        public f<T> a() {
        }

        @Override // i.a.e1.g.s
        public /* bridge */ /* synthetic */ Object get() throws Throwable {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class h<T> implements Publisher<T> {
        private final AtomicReference<i<T>> b;
        private final i.a.e1.g.s<? extends f<T>> c;

        public h(AtomicReference<i<T>> curr, i.a.e1.g.s<? extends f<T>> bufferFactory) {
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber<? super T> child) {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class i<T> extends AtomicReference<Subscription> implements i.a.e1.c.x<T>, i.a.e1.d.f {
        public static final c[] EMPTY = null;
        public static final c[] TERMINATED = null;
        private static final long serialVersionUID = 7224554242710036740L;
        public final f<T> buffer;
        public final AtomicReference<i<T>> current;
        public boolean done;
        public final AtomicInteger management;
        public long requestedFromUpstream;
        public final AtomicBoolean shouldConnect;
        public final AtomicReference<c<T>[]> subscribers;

        public i(f<T> buffer, AtomicReference<i<T>> current) {
        }

        public boolean add(c<T> producer) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        public void manageRequests() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable e2) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription p2) {
        }

        public void remove(c<T> p2) {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class j<T> implements i.a.e1.g.s<f<T>> {
        private final int b;
        private final long c;

        /* renamed from: d  reason: collision with root package name */
        private final TimeUnit f26993d;

        /* renamed from: e  reason: collision with root package name */
        private final i.a.e1.c.q0 f26994e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f26995f;

        public j(int bufferSize, long maxAge, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean eagerTruncate) {
        }

        public f<T> a() {
        }

        @Override // i.a.e1.g.s
        public /* bridge */ /* synthetic */ Object get() throws Throwable {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class k<T> extends a<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        public final int limit;
        public final long maxAge;
        public final i.a.e1.c.q0 scheduler;
        public final TimeUnit unit;

        public k(int limit, long maxAge, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean eagerTruncate) {
        }

        @Override // i.a.e1.h.f.b.i3.a
        public Object enterTransform(Object value, boolean terminal) {
        }

        @Override // i.a.e1.h.f.b.i3.a
        public e getHead() {
        }

        @Override // i.a.e1.h.f.b.i3.a
        public Object leaveTransform(Object value) {
        }

        @Override // i.a.e1.h.f.b.i3.a
        public void truncate() {
        }

        @Override // i.a.e1.h.f.b.i3.a
        public void truncateFinal() {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class l<T> extends a<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        public final int limit;

        public l(int limit, boolean eagerTruncate) {
        }

        @Override // i.a.e1.h.f.b.i3.a
        public void truncate() {
        }
    }

    /* compiled from: FlowableReplay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class m<T> extends ArrayList<Object> implements f<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        public volatile int size;

        public m(int capacityHint) {
        }

        @Override // i.a.e1.h.f.b.i3.f
        public void complete() {
        }

        @Override // i.a.e1.h.f.b.i3.f
        public void error(Throwable e2) {
        }

        @Override // i.a.e1.h.f.b.i3.f
        public void next(T value) {
        }

        @Override // i.a.e1.h.f.b.i3.f
        public void replay(c<T> output) {
        }
    }

    private i3(Publisher<T> onSubscribe, i.a.e1.c.s<T> source, final AtomicReference<i<T>> current, final i.a.e1.g.s<? extends f<T>> bufferFactory) {
    }

    public static <T> i.a.e1.f.a<T> q9(i.a.e1.c.s<T> source, final int bufferSize, boolean eagerTruncate) {
    }

    public static <T> i.a.e1.f.a<T> r9(i.a.e1.c.s<T> source, final long maxAge, final TimeUnit unit, final i.a.e1.c.q0 scheduler, final int bufferSize, boolean eagerTruncate) {
    }

    public static <T> i.a.e1.f.a<T> s9(i.a.e1.c.s<T> source, long maxAge, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean eagerTruncate) {
    }

    public static <T> i.a.e1.f.a<T> t9(i.a.e1.c.s<T> source, final i.a.e1.g.s<? extends f<T>> bufferFactory) {
    }

    public static <T> i.a.e1.f.a<T> u9(i.a.e1.c.s<? extends T> source) {
    }

    public static <U, R> i.a.e1.c.s<R> v9(final i.a.e1.g.s<? extends i.a.e1.f.a<U>> connectableFactory, final i.a.e1.g.o<? super i.a.e1.c.s<U>, ? extends Publisher<R>> selector) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }

    @Override // i.a.e1.f.a
    public void i9(i.a.e1.g.g<? super i.a.e1.d.f> connection) {
    }

    @Override // i.a.e1.f.a
    public void p9() {
    }

    @Override // i.a.e1.h.c.j
    public Publisher<T> source() {
    }
}
