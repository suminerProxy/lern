package i.a.y0.e.b;

import i.a.j0;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableDelay.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class j0<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f28312d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f28313e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.j0 f28314f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f28315g;

    /* compiled from: FlowableDelay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements i.a.q<T>, Subscription {
        public final Subscriber<? super T> b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final TimeUnit f28316d;

        /* renamed from: e  reason: collision with root package name */
        public final j0.c f28317e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f28318f;

        /* renamed from: g  reason: collision with root package name */
        public Subscription f28319g;

        /* compiled from: FlowableDelay.java */
        /* renamed from: i.a.y0.e.b.j0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class RunnableC0540a implements Runnable {
            public final /* synthetic */ a b;

            public RunnableC0540a(a aVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* compiled from: FlowableDelay.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class b implements Runnable {
            private final Throwable b;
            public final /* synthetic */ a c;

            public b(a aVar, Throwable th) {
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
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
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
            public c(a aVar, Object obj) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public a(Subscriber<? super T> subscriber, long j2, TimeUnit timeUnit, j0.c cVar, boolean z) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
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

    public j0(i.a.l<T> lVar, long j2, TimeUnit timeUnit, i.a.j0 j0Var, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
