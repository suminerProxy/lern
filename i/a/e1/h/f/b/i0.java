package i.a.e1.h.f.b;

import i.a.e1.c.q0;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableDelay.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class i0<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f26980d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f26981e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.c.q0 f26982f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f26983g;

    /* compiled from: FlowableDelay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.c.x<T>, Subscription {
        public final Subscriber<? super T> b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final TimeUnit f26984d;

        /* renamed from: e  reason: collision with root package name */
        public final q0.c f26985e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f26986f;

        /* renamed from: g  reason: collision with root package name */
        public Subscription f26987g;

        /* compiled from: FlowableDelay.java */
        /* renamed from: i.a.e1.h.f.b.i0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class RunnableC0446a implements Runnable {
            public final /* synthetic */ a b;

            public RunnableC0446a(final a this$0) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* compiled from: FlowableDelay.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class b implements Runnable {
            private final Throwable b;
            public final /* synthetic */ a c;

            public b(final a this$0, Throwable t) {
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
        /* compiled from: FlowableDelay.java */
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

        public a(Subscriber<? super T> actual, long delay, TimeUnit unit, q0.c w, boolean delayError) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(final Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(final T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public i0(i.a.e1.c.s<T> source, long delay, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean delayError) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> t) {
    }
}
