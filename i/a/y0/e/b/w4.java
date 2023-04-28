package i.a.y0.e.b;

import i.a.j0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableWindowTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class w4<T> extends i.a.y0.e.b.a<T, i.a.l<T>> {

    /* renamed from: d  reason: collision with root package name */
    public final long f28565d;

    /* renamed from: e  reason: collision with root package name */
    public final long f28566e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeUnit f28567f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.j0 f28568g;

    /* renamed from: h  reason: collision with root package name */
    public final long f28569h;

    /* renamed from: i  reason: collision with root package name */
    public final int f28570i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f28571j;

    /* compiled from: FlowableWindowTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends i.a.y0.h.n<T, Object, i.a.l<T>> implements Subscription {
        public final long D0;
        public final TimeUnit E0;
        public final i.a.j0 F0;
        public final int G0;
        public final boolean H0;
        public final long I0;
        public final j0.c J0;
        public long K0;
        public long L0;
        public Subscription M0;
        public i.a.d1.h<T> N0;
        public volatile boolean O0;
        public final i.a.y0.a.h P0;

        /* compiled from: FlowableWindowTimed.java */
        /* renamed from: i.a.y0.e.b.w4$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class RunnableC0545a implements Runnable {
            public final long b;
            public final a<?> c;

            public RunnableC0545a(long j2, a<?> aVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public a(Subscriber<? super i.a.l<T>> subscriber, long j2, TimeUnit timeUnit, i.a.j0 j0Var, int i2, long j3, boolean z) {
        }

        public static /* synthetic */ boolean l(a aVar) {
        }

        public static /* synthetic */ i.a.y0.c.n m(a aVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void dispose() {
        }

        public void n() {
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

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    /* compiled from: FlowableWindowTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends i.a.y0.h.n<T, Object, i.a.l<T>> implements i.a.q<T>, Subscription, Runnable {
        public static final Object L0 = null;
        public final long D0;
        public final TimeUnit E0;
        public final i.a.j0 F0;
        public final int G0;
        public Subscription H0;
        public i.a.d1.h<T> I0;
        public final i.a.y0.a.h J0;
        public volatile boolean K0;

        public b(Subscriber<? super i.a.l<T>> subscriber, long j2, TimeUnit timeUnit, i.a.j0 j0Var, int i2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void dispose() {
        }

        public void l() {
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

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: FlowableWindowTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends i.a.y0.h.n<T, Object, i.a.l<T>> implements Subscription, Runnable {
        public final long D0;
        public final long E0;
        public final TimeUnit F0;
        public final j0.c G0;
        public final int H0;
        public final List<i.a.d1.h<T>> I0;
        public Subscription J0;
        public volatile boolean K0;

        /* compiled from: FlowableWindowTimed.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class a implements Runnable {
            private final i.a.d1.h<T> b;
            public final /* synthetic */ c c;

            public a(c cVar, i.a.d1.h<T> hVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* compiled from: FlowableWindowTimed.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class b<T> {

            /* renamed from: a  reason: collision with root package name */
            public final i.a.d1.h<T> f28572a;
            public final boolean b;

            public b(i.a.d1.h<T> hVar, boolean z) {
            }
        }

        public c(Subscriber<? super i.a.l<T>> subscriber, long j2, long j3, TimeUnit timeUnit, j0.c cVar, int i2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void dispose() {
        }

        public void l(i.a.d1.h<T> hVar) {
        }

        public void m() {
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

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public w4(i.a.l<T> lVar, long j2, long j3, TimeUnit timeUnit, i.a.j0 j0Var, long j4, int i2, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super i.a.l<T>> subscriber) {
    }
}
