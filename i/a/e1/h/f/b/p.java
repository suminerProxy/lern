package i.a.e1.h.f.b;

import i.a.e1.c.q0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableBufferTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class p<T, U extends Collection<? super T>> extends i.a.e1.h.f.b.a<T, U> {

    /* renamed from: d  reason: collision with root package name */
    public final long f27079d;

    /* renamed from: e  reason: collision with root package name */
    public final long f27080e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeUnit f27081f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.e1.c.q0 f27082g;

    /* renamed from: h  reason: collision with root package name */
    public final i.a.e1.g.s<U> f27083h;

    /* renamed from: i  reason: collision with root package name */
    public final int f27084i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f27085j;

    /* compiled from: FlowableBufferTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U extends Collection<? super T>> extends i.a.e1.h.i.n<T, U, U> implements Subscription, Runnable, i.a.e1.d.f {
        public final i.a.e1.g.s<U> D0;
        public final long E0;
        public final TimeUnit F0;
        public final int G0;
        public final boolean H0;
        public final q0.c I0;
        public U J0;
        public i.a.e1.d.f K0;
        public Subscription L0;
        public long M0;
        public long N0;

        public a(Subscriber<? super U> actual, i.a.e1.g.s<U> bufferSupplier, long timespan, TimeUnit unit, int maxSize, boolean restartOnMaxSize, q0.c w) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.h.i.n, i.a.e1.h.k.u
        public /* bridge */ /* synthetic */ boolean f(Subscriber a2, Object v) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        public boolean l(Subscriber<? super U> a2, U v) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: FlowableBufferTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, U extends Collection<? super T>> extends i.a.e1.h.i.n<T, U, U> implements Subscription, Runnable, i.a.e1.d.f {
        public final i.a.e1.g.s<U> D0;
        public final long E0;
        public final TimeUnit F0;
        public final i.a.e1.c.q0 G0;
        public Subscription H0;
        public U I0;
        public final AtomicReference<i.a.e1.d.f> J0;

        public b(Subscriber<? super U> actual, i.a.e1.g.s<U> bufferSupplier, long timespan, TimeUnit unit, i.a.e1.c.q0 scheduler) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.h.i.n, i.a.e1.h.k.u
        public /* bridge */ /* synthetic */ boolean f(Subscriber a2, Object v) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        public boolean l(Subscriber<? super U> a2, U v) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: FlowableBufferTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T, U extends Collection<? super T>> extends i.a.e1.h.i.n<T, U, U> implements Subscription, Runnable {
        public final i.a.e1.g.s<U> D0;
        public final long E0;
        public final long F0;
        public final TimeUnit G0;
        public final q0.c H0;
        public final List<U> I0;
        public Subscription J0;

        /* JADX WARN: Field signature parse error: b
        jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TU at position 1 ('U'), unexpected: T
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
        	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
        	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
         */
        /* compiled from: FlowableBufferTimed.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class a implements Runnable {
            private final Collection b;
            public final /* synthetic */ c c;

            /* JADX WARN: Failed to parse method signature: (TU)V
            jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: (TU)V at position 2 ('U'), unexpected: T
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeMethodArgs(SignatureParser.java:318)
            	at jadx.core.dex.visitors.SignatureProcessor.parseMethodSignature(SignatureProcessor.java:154)
            	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:39)
             */
            public a(final c this$0, Collection buffer) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public c(Subscriber<? super U> actual, i.a.e1.g.s<U> bufferSupplier, long timespan, long timeskip, TimeUnit unit, q0.c w) {
        }

        public static /* synthetic */ void m(c cVar, Object obj, boolean z, i.a.e1.d.f fVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.h.i.n, i.a.e1.h.k.u
        public /* bridge */ /* synthetic */ boolean f(Subscriber a2, Object v) {
        }

        public boolean l(Subscriber<? super U> a2, U v) {
        }

        public void n() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public p(i.a.e1.c.s<T> source, long timespan, long timeskip, TimeUnit unit, i.a.e1.c.q0 scheduler, i.a.e1.g.s<U> bufferSupplier, int maxSize, boolean restartTimerOnMaxSize) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super U> s) {
    }
}
