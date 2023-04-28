package i.a.e1.h.f.e;

import i.a.e1.c.q0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableBufferTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class p<T, U extends Collection<? super T>> extends i.a.e1.h.f.e.a<T, U> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27559d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f27560e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.c.q0 f27561f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.e1.g.s<U> f27562g;

    /* renamed from: h  reason: collision with root package name */
    public final int f27563h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f27564i;

    /* compiled from: ObservableBufferTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U extends Collection<? super T>> extends i.a.e1.h.e.w<T, U, U> implements Runnable, i.a.e1.d.f {
        public final i.a.e1.g.s<U> L;
        public final long M;
        public final TimeUnit N;
        public final int O;
        public final boolean P;
        public final q0.c Q;
        public U R;
        public i.a.e1.d.f S;
        public i.a.e1.d.f T;
        public long U;
        public long V;

        public a(i.a.e1.c.p0<? super U> actual, i.a.e1.g.s<U> bufferSupplier, long timespan, TimeUnit unit, int maxSize, boolean restartOnMaxSize, q0.c w) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.h.e.w, i.a.e1.h.k.r
        public /* bridge */ /* synthetic */ void f(i.a.e1.c.p0 a2, Object v) {
        }

        public void i(i.a.e1.c.p0<? super U> a2, U v) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ObservableBufferTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, U extends Collection<? super T>> extends i.a.e1.h.e.w<T, U, U> implements Runnable, i.a.e1.d.f {
        public final i.a.e1.g.s<U> L;
        public final long M;
        public final TimeUnit N;
        public final i.a.e1.c.q0 O;
        public i.a.e1.d.f P;
        public U Q;
        public final AtomicReference<i.a.e1.d.f> R;

        public b(i.a.e1.c.p0<? super U> actual, i.a.e1.g.s<U> bufferSupplier, long timespan, TimeUnit unit, i.a.e1.c.q0 scheduler) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.h.e.w, i.a.e1.h.k.r
        public /* bridge */ /* synthetic */ void f(i.a.e1.c.p0 a2, Object v) {
        }

        public void i(i.a.e1.c.p0<? super U> a2, U v) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ObservableBufferTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T, U extends Collection<? super T>> extends i.a.e1.h.e.w<T, U, U> implements Runnable, i.a.e1.d.f {
        public final i.a.e1.g.s<U> L;
        public final long M;
        public final long N;
        public final TimeUnit O;
        public final q0.c P;
        public final List<U> Q;
        public i.a.e1.d.f R;

        /* JADX WARN: Field signature parse error: b
        jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TU at position 1 ('U'), unexpected: T
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
        	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
        	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
         */
        /* compiled from: ObservableBufferTimed.java */
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
            public a(final c this$0, Collection b) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Field signature parse error: b
        jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TU at position 1 ('U'), unexpected: T
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
        	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
        	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
         */
        /* compiled from: ObservableBufferTimed.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class b implements Runnable {
            private final Collection b;
            public final /* synthetic */ c c;

            /* JADX WARN: Failed to parse method signature: (TU)V
            jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: (TU)V at position 2 ('U'), unexpected: T
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeMethodArgs(SignatureParser.java:318)
            	at jadx.core.dex.visitors.SignatureProcessor.parseMethodSignature(SignatureProcessor.java:154)
            	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:39)
             */
            public b(final c this$0, Collection buffer) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public c(i.a.e1.c.p0<? super U> actual, i.a.e1.g.s<U> bufferSupplier, long timespan, long timeskip, TimeUnit unit, q0.c w) {
        }

        public static /* synthetic */ void j(c cVar, Object obj, boolean z, i.a.e1.d.f fVar) {
        }

        public static /* synthetic */ void k(c cVar, Object obj, boolean z, i.a.e1.d.f fVar) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.h.e.w, i.a.e1.h.k.r
        public /* bridge */ /* synthetic */ void f(i.a.e1.c.p0 a2, Object v) {
        }

        public void i(i.a.e1.c.p0<? super U> a2, U v) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        public void l() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public p(i.a.e1.c.n0<T> source, long timespan, long timeskip, TimeUnit unit, i.a.e1.c.q0 scheduler, i.a.e1.g.s<U> bufferSupplier, int maxSize, boolean restartTimerOnMaxSize) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super U> t) {
    }
}
