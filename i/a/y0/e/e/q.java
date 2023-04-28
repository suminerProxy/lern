package i.a.y0.e.e;

import i.a.j0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableBufferTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class q<T, U extends Collection<? super T>> extends i.a.y0.e.e.a<T, U> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f28898d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f28899e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.j0 f28900f;

    /* renamed from: g  reason: collision with root package name */
    public final Callable<U> f28901g;

    /* renamed from: h  reason: collision with root package name */
    public final int f28902h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f28903i;

    /* compiled from: ObservableBufferTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U extends Collection<? super T>> extends i.a.y0.d.v<T, U, U> implements Runnable, i.a.u0.c {
        public final Callable<U> L;
        public final long M;
        public final TimeUnit N;
        public final int O;
        public final boolean P;
        public final j0.c Q;
        public U R;
        public i.a.u0.c S;
        public i.a.u0.c T;
        public long U;
        public long V;

        public a(i.a.i0<? super U> i0Var, Callable<U> callable, long j2, TimeUnit timeUnit, int i2, boolean z, j0.c cVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.y0.d.v, i.a.y0.j.r
        public /* bridge */ /* synthetic */ void f(i.a.i0 i0Var, Object obj) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public void j(i.a.i0<? super U> i0Var, U u) {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ObservableBufferTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, U extends Collection<? super T>> extends i.a.y0.d.v<T, U, U> implements Runnable, i.a.u0.c {
        public final Callable<U> L;
        public final long M;
        public final TimeUnit N;
        public final i.a.j0 O;
        public i.a.u0.c P;
        public U Q;
        public final AtomicReference<i.a.u0.c> R;

        public b(i.a.i0<? super U> i0Var, Callable<U> callable, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.y0.d.v, i.a.y0.j.r
        public /* bridge */ /* synthetic */ void f(i.a.i0 i0Var, Object obj) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public void j(i.a.i0<? super U> i0Var, U u) {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ObservableBufferTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T, U extends Collection<? super T>> extends i.a.y0.d.v<T, U, U> implements Runnable, i.a.u0.c {
        public final Callable<U> L;
        public final long M;
        public final long N;
        public final TimeUnit O;
        public final j0.c P;
        public final List<U> Q;
        public i.a.u0.c R;

        /* JADX WARN: Field signature parse error: b
        jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TU at position 1 ('U'), unexpected: T
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
        	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
        	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
         */
        /* compiled from: ObservableBufferTimed.java */
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

        /* JADX WARN: Field signature parse error: b
        jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TU at position 1 ('U'), unexpected: T
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
        	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
        	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
         */
        /* compiled from: ObservableBufferTimed.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
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
            public b(c cVar, Collection collection) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public c(i.a.i0<? super U> i0Var, Callable<U> callable, long j2, long j3, TimeUnit timeUnit, j0.c cVar) {
        }

        public static /* synthetic */ void k(c cVar, Object obj, boolean z, i.a.u0.c cVar2) {
        }

        public static /* synthetic */ void l(c cVar, Object obj, boolean z, i.a.u0.c cVar2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.y0.d.v, i.a.y0.j.r
        public /* bridge */ /* synthetic */ void f(i.a.i0 i0Var, Object obj) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public void j(i.a.i0<? super U> i0Var, U u) {
        }

        public void m() {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public q(i.a.g0<T> g0Var, long j2, long j3, TimeUnit timeUnit, i.a.j0 j0Var, Callable<U> callable, int i2, boolean z) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super U> i0Var) {
    }
}
