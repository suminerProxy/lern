package i.a.e1.h.f.g;

import java.util.concurrent.TimeUnit;

/* compiled from: SingleDelay.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class f<T> extends i.a.e1.c.r0<T> {
    public final i.a.e1.c.x0<? extends T> b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f27756d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.c.q0 f27757e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27758f;

    /* compiled from: SingleDelay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class a implements i.a.e1.c.u0<T> {
        private final i.a.e1.h.a.f b;
        public final i.a.e1.c.u0<? super T> c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ f f27759d;

        /* compiled from: SingleDelay.java */
        /* renamed from: i.a.e1.h.f.g.f$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class RunnableC0500a implements Runnable {
            private final Throwable b;
            public final /* synthetic */ a c;

            public RunnableC0500a(final a this$1, Throwable e2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Field signature parse error: b
        jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TT at position 1 ('T'), unexpected: T
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
        	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
        	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
         */
        /* compiled from: SingleDelay.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class b implements Runnable {
            private final Object b;
            public final /* synthetic */ a c;

            /* JADX WARN: Failed to parse method signature: (TT)V
            jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: (TT)V at position 2 ('T'), unexpected: T
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeMethodArgs(SignatureParser.java:318)
            	at jadx.core.dex.visitors.SignatureProcessor.parseMethodSignature(SignatureProcessor.java:154)
            	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:39)
             */
            public b(final a this$1, Object value) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public a(final f this$0, i.a.e1.h.a.f sd, i.a.e1.c.u0<? super T> observer) {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onError(final Throwable e2) {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.u0
        public void onSuccess(final T value) {
        }
    }

    public f(i.a.e1.c.x0<? extends T> source, long time, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean delayError) {
    }

    @Override // i.a.e1.c.r0
    public void M1(final i.a.e1.c.u0<? super T> observer) {
    }
}
