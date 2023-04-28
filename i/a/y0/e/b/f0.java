package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableCreate.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class f0<T> extends i.a.l<T> {
    public final i.a.o<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.b f28269d;

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28270a = null;
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class b<T> extends AtomicLong implements i.a.n<T>, Subscription {
        private static final long serialVersionUID = 7326289992464377023L;
        public final Subscriber<? super T> downstream;
        public final i.a.y0.a.h serial;

        public b(Subscriber<? super T> subscriber) {
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }

        public void complete() {
        }

        public boolean error(Throwable th) {
        }

        @Override // i.a.n
        public final boolean isCancelled() {
        }

        @Override // i.a.k
        public void onComplete() {
        }

        @Override // i.a.k
        public final void onError(Throwable th) {
        }

        public void onRequested() {
        }

        public void onUnsubscribed() {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j2) {
        }

        @Override // i.a.n
        public final long requested() {
        }

        @Override // i.a.n
        public final i.a.n<T> serialize() {
        }

        @Override // i.a.n
        public final void setCancellable(i.a.x0.f fVar) {
        }

        @Override // i.a.n
        public final void setDisposable(i.a.u0.c cVar) {
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
        }

        @Override // i.a.n
        public boolean tryOnError(Throwable th) {
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends b<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        public volatile boolean done;
        public Throwable error;
        public final i.a.y0.f.c<T> queue;
        public final AtomicInteger wip;

        public c(Subscriber<? super T> subscriber, int i2) {
        }

        public void drain() {
        }

        @Override // i.a.y0.e.b.f0.b, i.a.k
        public void onComplete() {
        }

        @Override // i.a.k
        public void onNext(T t) {
        }

        @Override // i.a.y0.e.b.f0.b
        public void onRequested() {
        }

        @Override // i.a.y0.e.b.f0.b
        public void onUnsubscribed() {
        }

        @Override // i.a.y0.e.b.f0.b, i.a.n
        public boolean tryOnError(Throwable th) {
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d<T> extends h<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public d(Subscriber<? super T> subscriber) {
        }

        @Override // i.a.y0.e.b.f0.h
        public void onOverflow() {
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class e<T> extends h<T> {
        private static final long serialVersionUID = 338953216916120960L;

        public e(Subscriber<? super T> subscriber) {
        }

        @Override // i.a.y0.e.b.f0.h
        public void onOverflow() {
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class f<T> extends b<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        public volatile boolean done;
        public Throwable error;
        public final AtomicReference<T> queue;
        public final AtomicInteger wip;

        public f(Subscriber<? super T> subscriber) {
        }

        public void drain() {
        }

        @Override // i.a.y0.e.b.f0.b, i.a.k
        public void onComplete() {
        }

        @Override // i.a.k
        public void onNext(T t) {
        }

        @Override // i.a.y0.e.b.f0.b
        public void onRequested() {
        }

        @Override // i.a.y0.e.b.f0.b
        public void onUnsubscribed() {
        }

        @Override // i.a.y0.e.b.f0.b, i.a.n
        public boolean tryOnError(Throwable th) {
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class g<T> extends b<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public g(Subscriber<? super T> subscriber) {
        }

        @Override // i.a.k
        public void onNext(T t) {
        }
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class h<T> extends b<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public h(Subscriber<? super T> subscriber) {
        }

        @Override // i.a.k
        public final void onNext(T t) {
        }

        public abstract void onOverflow();
    }

    /* compiled from: FlowableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class i<T> extends AtomicInteger implements i.a.n<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        public volatile boolean done;
        public final b<T> emitter;
        public final i.a.y0.j.c error;
        public final i.a.y0.c.n<T> queue;

        public i(b<T> bVar) {
        }

        public void drain() {
        }

        public void drainLoop() {
        }

        @Override // i.a.n
        public boolean isCancelled() {
        }

        @Override // i.a.k
        public void onComplete() {
        }

        @Override // i.a.k
        public void onError(Throwable th) {
        }

        @Override // i.a.k
        public void onNext(T t) {
        }

        @Override // i.a.n
        public long requested() {
        }

        @Override // i.a.n
        public i.a.n<T> serialize() {
        }

        @Override // i.a.n
        public void setCancellable(i.a.x0.f fVar) {
        }

        @Override // i.a.n
        public void setDisposable(i.a.u0.c cVar) {
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
        }

        @Override // i.a.n
        public boolean tryOnError(Throwable th) {
        }
    }

    public f0(i.a.o<T> oVar, i.a.b bVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
