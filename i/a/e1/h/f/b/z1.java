package i.a.e1.h.f.b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableIntervalRange.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class z1 extends i.a.e1.c.s<Long> {
    public final i.a.e1.c.q0 c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27263d;

    /* renamed from: e  reason: collision with root package name */
    public final long f27264e;

    /* renamed from: f  reason: collision with root package name */
    public final long f27265f;

    /* renamed from: g  reason: collision with root package name */
    public final long f27266g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeUnit f27267h;

    /* compiled from: FlowableIntervalRange.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a extends AtomicLong implements Subscription, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        public long count;
        public final Subscriber<? super Long> downstream;
        public final long end;
        public final AtomicReference<i.a.e1.d.f> resource;

        public a(Subscriber<? super Long> actual, long start, long end) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void setResource(i.a.e1.d.f d2) {
        }
    }

    public z1(long start, long end, long initialDelay, long period, TimeUnit unit, i.a.e1.c.q0 scheduler) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super Long> s) {
    }
}
