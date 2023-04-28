package i.a.e1.h.f.b;

import i.a.e1.c.q0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableWindowTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class b5<T> extends i.a.e1.h.f.b.a<T, i.a.e1.c.s<T>> {

    /* renamed from: d  reason: collision with root package name */
    public final long f26887d;

    /* renamed from: e  reason: collision with root package name */
    public final long f26888e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeUnit f26889f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.e1.c.q0 f26890g;

    /* renamed from: h  reason: collision with root package name */
    public final long f26891h;

    /* renamed from: i  reason: collision with root package name */
    public final int f26892i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f26893j;

    /* compiled from: FlowableWindowTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class a<T> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = 5724293814035355511L;
        public final int bufferSize;
        public volatile boolean done;
        public final Subscriber<? super i.a.e1.c.s<T>> downstream;
        public final AtomicBoolean downstreamCancelled;
        public long emitted;
        public Throwable error;
        public final i.a.e1.h.c.p<Object> queue;
        public final AtomicLong requested;
        public final long timespan;
        public final TimeUnit unit;
        public Subscription upstream;
        public volatile boolean upstreamCancelled;
        public final AtomicInteger windowCount;

        public a(Subscriber<? super i.a.e1.c.s<T>> downstream, long timespan, TimeUnit unit, int bufferSize) {
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }

        public abstract void cleanupResources();

        public abstract void createFirstWindow();

        public abstract void drain();

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public final void onSubscribe(Subscription s) {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long n2) {
        }

        public final void windowDone() {
        }
    }

    /* compiled from: FlowableWindowTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends a<T> implements Runnable {
        private static final long serialVersionUID = -6130475889925953722L;
        public long count;
        public final long maxSize;
        public final boolean restartTimerOnMaxSize;
        public final i.a.e1.c.q0 scheduler;
        public final i.a.e1.h.a.f timer;
        public i.a.e1.m.h<T> window;
        public final q0.c worker;

        /* compiled from: FlowableWindowTimed.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class a implements Runnable {
            public final b<?> b;
            public final long c;

            public a(b<?> parent, long index) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public b(Subscriber<? super i.a.e1.c.s<T>> actual, long timespan, TimeUnit unit, i.a.e1.c.q0 scheduler, int bufferSize, long maxSize, boolean restartTimerOnMaxSize) {
        }

        public void boundary(a sender) {
        }

        @Override // i.a.e1.h.f.b.b5.a
        public void cleanupResources() {
        }

        @Override // i.a.e1.h.f.b.b5.a
        public void createFirstWindow() {
        }

        public i.a.e1.m.h<T> createNewWindow(i.a.e1.m.h<T> window) {
        }

        @Override // i.a.e1.h.f.b.b5.a
        public void drain() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: FlowableWindowTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends a<T> implements Runnable {
        public static final Object NEXT_WINDOW = null;
        private static final long serialVersionUID = 1155822639622580836L;
        public final i.a.e1.c.q0 scheduler;
        public final i.a.e1.h.a.f timer;
        public i.a.e1.m.h<T> window;
        public final Runnable windowRunnable;

        /* compiled from: FlowableWindowTimed.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class a implements Runnable {
            public final /* synthetic */ c b;

            public a(final c this$0) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public c(Subscriber<? super i.a.e1.c.s<T>> actual, long timespan, TimeUnit unit, i.a.e1.c.q0 scheduler, int bufferSize) {
        }

        @Override // i.a.e1.h.f.b.b5.a
        public void cleanupResources() {
        }

        @Override // i.a.e1.h.f.b.b5.a
        public void createFirstWindow() {
        }

        @Override // i.a.e1.h.f.b.b5.a
        public void drain() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: FlowableWindowTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<T> extends a<T> implements Runnable {
        public static final Object WINDOW_CLOSE = null;
        public static final Object WINDOW_OPEN = null;
        private static final long serialVersionUID = -7852870764194095894L;
        public final long timeskip;
        public final List<i.a.e1.m.h<T>> windows;
        public final q0.c worker;

        /* compiled from: FlowableWindowTimed.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class a implements Runnable {
            public final d<?> b;
            public final boolean c;

            public a(d<?> parent, boolean isOpen) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public d(Subscriber<? super i.a.e1.c.s<T>> actual, long timespan, long timeskip, TimeUnit unit, q0.c worker, int bufferSize) {
        }

        public void boundary(boolean isOpen) {
        }

        @Override // i.a.e1.h.f.b.b5.a
        public void cleanupResources() {
        }

        @Override // i.a.e1.h.f.b.b5.a
        public void createFirstWindow() {
        }

        @Override // i.a.e1.h.f.b.b5.a
        public void drain() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public b5(i.a.e1.c.s<T> source, long timespan, long timeskip, TimeUnit unit, i.a.e1.c.q0 scheduler, long maxSize, int bufferSize, boolean restartTimerOnMaxSize) {
    }

    public static String e9(long index) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super i.a.e1.c.s<T>> downstream) {
    }
}
