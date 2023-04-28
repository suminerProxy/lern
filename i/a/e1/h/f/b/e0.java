package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableCreate.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class e0<T> extends i.a.e1.c.s<T> {
    public final i.a.e1.c.v<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.c.i f26926d;

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26927a = null;
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class b<T> extends AtomicLong implements i.a.e1.c.u<T>, Subscription {
        private static final long serialVersionUID = 7326289992464377023L;
        public final Subscriber<? super T> downstream;
        public final i.a.e1.h.a.f serial;

        public b(Subscriber<? super T> downstream) {
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }

        public void completeDownstream() {
        }

        public boolean errorDownstream(Throwable e2) {
        }

        @Override // i.a.e1.c.u
        public final boolean isCancelled() {
        }

        @Override // i.a.e1.c.r
        public void onComplete() {
        }

        @Override // i.a.e1.c.r
        public final void onError(Throwable e2) {
        }

        public void onRequested() {
        }

        public void onUnsubscribed() {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long n2) {
        }

        @Override // i.a.e1.c.u
        public final long requested() {
        }

        @Override // i.a.e1.c.u
        public final i.a.e1.c.u<T> serialize() {
        }

        @Override // i.a.e1.c.u
        public final void setCancellable(i.a.e1.g.f c) {
        }

        @Override // i.a.e1.c.u
        public final void setDisposable(i.a.e1.d.f d2) {
        }

        public boolean signalError(Throwable e2) {
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
        }

        @Override // i.a.e1.c.u
        public final boolean tryOnError(Throwable e2) {
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends b<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        public volatile boolean done;
        public Throwable error;
        public final i.a.e1.h.g.c<T> queue;
        public final AtomicInteger wip;

        public c(Subscriber<? super T> actual, int capacityHint) {
        }

        public void drain() {
        }

        @Override // i.a.e1.h.f.b.e0.b, i.a.e1.c.r
        public void onComplete() {
        }

        @Override // i.a.e1.c.r
        public void onNext(T t) {
        }

        @Override // i.a.e1.h.f.b.e0.b
        public void onRequested() {
        }

        @Override // i.a.e1.h.f.b.e0.b
        public void onUnsubscribed() {
        }

        @Override // i.a.e1.h.f.b.e0.b
        public boolean signalError(Throwable e2) {
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<T> extends h<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public d(Subscriber<? super T> downstream) {
        }

        @Override // i.a.e1.h.f.b.e0.h
        public void onOverflow() {
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e<T> extends h<T> {
        private static final long serialVersionUID = 338953216916120960L;

        public e(Subscriber<? super T> downstream) {
        }

        @Override // i.a.e1.h.f.b.e0.h
        public void onOverflow() {
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class f<T> extends b<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        public volatile boolean done;
        public Throwable error;
        public final AtomicReference<T> queue;
        public final AtomicInteger wip;

        public f(Subscriber<? super T> downstream) {
        }

        public void drain() {
        }

        @Override // i.a.e1.h.f.b.e0.b, i.a.e1.c.r
        public void onComplete() {
        }

        @Override // i.a.e1.c.r
        public void onNext(T t) {
        }

        @Override // i.a.e1.h.f.b.e0.b
        public void onRequested() {
        }

        @Override // i.a.e1.h.f.b.e0.b
        public void onUnsubscribed() {
        }

        @Override // i.a.e1.h.f.b.e0.b
        public boolean signalError(Throwable e2) {
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class g<T> extends b<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public g(Subscriber<? super T> downstream) {
        }

        @Override // i.a.e1.c.r
        public void onNext(T t) {
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class h<T> extends b<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public h(Subscriber<? super T> downstream) {
        }

        @Override // i.a.e1.c.r
        public final void onNext(T t) {
        }

        public abstract void onOverflow();
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class i<T> extends AtomicInteger implements i.a.e1.c.u<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        public volatile boolean done;
        public final b<T> emitter;
        public final i.a.e1.h.k.c errors;
        public final i.a.e1.h.c.p<T> queue;

        public i(b<T> emitter) {
        }

        public void drain() {
        }

        public void drainLoop() {
        }

        @Override // i.a.e1.c.u
        public boolean isCancelled() {
        }

        @Override // i.a.e1.c.r
        public void onComplete() {
        }

        @Override // i.a.e1.c.r
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.r
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.u
        public long requested() {
        }

        @Override // i.a.e1.c.u
        public i.a.e1.c.u<T> serialize() {
        }

        @Override // i.a.e1.c.u
        public void setCancellable(i.a.e1.g.f c) {
        }

        @Override // i.a.e1.c.u
        public void setDisposable(i.a.e1.d.f d2) {
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
        }

        @Override // i.a.e1.c.u
        public boolean tryOnError(Throwable t) {
        }
    }

    public e0(i.a.e1.c.v<T> source, i.a.e1.c.i backpressure) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> t) {
    }
}
