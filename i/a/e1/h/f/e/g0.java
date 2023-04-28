package i.a.e1.h.f.e;

import i.a.e1.c.q0;
import java.util.concurrent.TimeUnit;

/* compiled from: ObservableDelay.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class g0<T> extends i.a.e1.h.f.e.a<T, T> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f27449d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.c.q0 f27450e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27451f;

    /* compiled from: ObservableDelay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        public final i.a.e1.c.p0<? super T> b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final TimeUnit f27452d;

        /* renamed from: e  reason: collision with root package name */
        public final q0.c f27453e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f27454f;

        /* renamed from: g  reason: collision with root package name */
        public i.a.e1.d.f f27455g;

        /* compiled from: ObservableDelay.java */
        /* renamed from: i.a.e1.h.f.e.g0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class RunnableC0482a implements Runnable {
            public final /* synthetic */ a b;

            public RunnableC0482a(final a this$0) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* compiled from: ObservableDelay.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class b implements Runnable {
            private final Throwable b;
            public final /* synthetic */ a c;

            public b(final a this$0, Throwable throwable) {
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
        /* compiled from: ObservableDelay.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class c implements Runnable {
            private final Object b;
            public final /* synthetic */ a c;

            /* JADX WARN: Failed to parse method signature: (TT)V
            jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: (TT)V at position 2 ('T'), unexpected: T
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeMethodArgs(SignatureParser.java:318)
            	at jadx.core.dex.visitors.SignatureProcessor.parseMethodSignature(SignatureProcessor.java:154)
            	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:39)
             */
            public c(final a this$0, Object t) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public a(i.a.e1.c.p0<? super T> actual, long delay, TimeUnit unit, q0.c w, boolean delayError) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(final Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(final T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    public g0(i.a.e1.c.n0<T> source, long delay, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean delayError) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> t) {
    }
}
