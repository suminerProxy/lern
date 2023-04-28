package i.a.y0.e.b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableIntervalRange.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class u1 extends i.a.l<Long> {
    public final i.a.j0 c;

    /* renamed from: d  reason: collision with root package name */
    public final long f28522d;

    /* renamed from: e  reason: collision with root package name */
    public final long f28523e;

    /* renamed from: f  reason: collision with root package name */
    public final long f28524f;

    /* renamed from: g  reason: collision with root package name */
    public final long f28525g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeUnit f28526h;

    /* compiled from: FlowableIntervalRange.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends AtomicLong implements Subscription, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        public long count;
        public final Subscriber<? super Long> downstream;
        public final long end;
        public final AtomicReference<i.a.u0.c> resource;

        public a(Subscriber<? super Long> subscriber, long j2, long j3) {
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

    public u1(long j2, long j3, long j4, long j5, TimeUnit timeUnit, i.a.j0 j0Var) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super Long> subscriber) {
    }
}
