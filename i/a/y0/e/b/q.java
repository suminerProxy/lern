package i.a.y0.e.b;

import i.a.j0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableBufferTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class q<T, U extends Collection<? super T>> extends i.a.y0.e.b.a<T, U> {

    /* renamed from: d  reason: collision with root package name */
    public final long f28420d;

    /* renamed from: e  reason: collision with root package name */
    public final long f28421e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeUnit f28422f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.j0 f28423g;

    /* renamed from: h  reason: collision with root package name */
    public final Callable<U> f28424h;

    /* renamed from: i  reason: collision with root package name */
    public final int f28425i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f28426j;

    /* compiled from: FlowableBufferTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U extends Collection<? super T>> extends i.a.y0.h.n<T, U, U> implements Subscription, Runnable, i.a.u0.c {
        public final Callable<U> D0;
        public final long E0;
        public final TimeUnit F0;
        public final int G0;
        public final boolean H0;
        public final j0.c I0;
        public U J0;
        public i.a.u0.c K0;
        public Subscription L0;
        public long M0;
        public long N0;

        public a(Subscriber<? super U> subscriber, Callable<U> callable, long j2, TimeUnit timeUnit, int i2, boolean z, j0.c cVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.y0.h.n, i.a.y0.j.u
        public /* bridge */ /* synthetic */ boolean f(Subscriber subscriber, Object obj) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public boolean l(Subscriber<? super U> subscriber, U u) {
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

    /* compiled from: FlowableBufferTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, U extends Collection<? super T>> extends i.a.y0.h.n<T, U, U> implements Subscription, Runnable, i.a.u0.c {
        public final Callable<U> D0;
        public final long E0;
        public final TimeUnit F0;
        public final i.a.j0 G0;
        public Subscription H0;
        public U I0;
        public final AtomicReference<i.a.u0.c> J0;

        public b(Subscriber<? super U> subscriber, Callable<U> callable, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.y0.h.n, i.a.y0.j.u
        public /* bridge */ /* synthetic */ boolean f(Subscriber subscriber, Object obj) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public boolean l(Subscriber<? super U> subscriber, U u) {
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

    /* compiled from: FlowableBufferTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T, U extends Collection<? super T>> extends i.a.y0.h.n<T, U, U> implements Subscription, Runnable {
        public final Callable<U> D0;
        public final long E0;
        public final long F0;
        public final TimeUnit G0;
        public final j0.c H0;
        public final List<U> I0;
        public Subscription J0;

        /* JADX WARN: Field signature parse error: b
        jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TU at position 1 ('U'), unexpected: T
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
        	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
        	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
         */
        /* compiled from: FlowableBufferTimed.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
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
            public a(c cVar, Collection collection) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public c(Subscriber<? super U> subscriber, Callable<U> callable, long j2, long j3, TimeUnit timeUnit, j0.c cVar) {
        }

        public static /* synthetic */ void m(c cVar, Object obj, boolean z, i.a.u0.c cVar2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.y0.h.n, i.a.y0.j.u
        public /* bridge */ /* synthetic */ boolean f(Subscriber subscriber, Object obj) {
        }

        public boolean l(Subscriber<? super U> subscriber, U u) {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public q(i.a.l<T> lVar, long j2, long j3, TimeUnit timeUnit, i.a.j0 j0Var, Callable<U> callable, int i2, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super U> subscriber) {
    }
}
