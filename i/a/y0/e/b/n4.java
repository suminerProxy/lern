package i.a.y0.e.b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableTimer.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class n4 extends i.a.l<Long> {
    public final i.a.j0 c;

    /* renamed from: d  reason: collision with root package name */
    public final long f28390d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f28391e;

    /* compiled from: FlowableTimer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends AtomicReference<i.a.u0.c> implements Subscription, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        public final Subscriber<? super Long> downstream;
        public volatile boolean requested;

        public a(Subscriber<? super Long> subscriber) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void setResource(i.a.u0.c cVar) {
        }
    }

    public n4(long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super Long> subscriber) {
    }
}
