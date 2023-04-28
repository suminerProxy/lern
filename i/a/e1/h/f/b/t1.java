package i.a.e1.h.f.b;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableGroupJoin.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class t1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends i.a.e1.h.f.b.a<TLeft, R> {

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<? extends TRight> f27171d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.o<? super TLeft, ? extends Publisher<TLeftEnd>> f27172e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.g.o<? super TRight, ? extends Publisher<TRightEnd>> f27173f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.e1.g.c<? super TLeft, ? super i.a.e1.c.s<TRight>, ? extends R> f27174g;

    /* compiled from: FlowableGroupJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Subscription, b {
        public static final Integer LEFT_CLOSE = null;
        public static final Integer LEFT_VALUE = null;
        public static final Integer RIGHT_CLOSE = null;
        public static final Integer RIGHT_VALUE = null;
        private static final long serialVersionUID = -6071216598687999801L;
        public final AtomicInteger active;
        public volatile boolean cancelled;
        public final i.a.e1.d.d disposables;
        public final Subscriber<? super R> downstream;
        public final AtomicReference<Throwable> error;
        public final i.a.e1.g.o<? super TLeft, ? extends Publisher<TLeftEnd>> leftEnd;
        public int leftIndex;
        public final Map<Integer, i.a.e1.m.h<TRight>> lefts;
        public final i.a.e1.h.g.c<Object> queue;
        public final AtomicLong requested;
        public final i.a.e1.g.c<? super TLeft, ? super i.a.e1.c.s<TRight>, ? extends R> resultSelector;
        public final i.a.e1.g.o<? super TRight, ? extends Publisher<TRightEnd>> rightEnd;
        public int rightIndex;
        public final Map<Integer, TRight> rights;

        public a(Subscriber<? super R> actual, i.a.e1.g.o<? super TLeft, ? extends Publisher<TLeftEnd>> leftEnd, i.a.e1.g.o<? super TRight, ? extends Publisher<TRightEnd>> rightEnd, i.a.e1.g.c<? super TLeft, ? super i.a.e1.c.s<TRight>, ? extends R> resultSelector) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelAll() {
        }

        public void drain() {
        }

        public void errorAll(Subscriber<?> a2) {
        }

        public void fail(Throwable exc, Subscriber<?> a2, i.a.e1.h.c.q<?> q) {
        }

        @Override // i.a.e1.h.f.b.t1.b
        public void innerClose(boolean isLeft, c index) {
        }

        @Override // i.a.e1.h.f.b.t1.b
        public void innerCloseError(Throwable ex) {
        }

        @Override // i.a.e1.h.f.b.t1.b
        public void innerComplete(d sender) {
        }

        @Override // i.a.e1.h.f.b.t1.b
        public void innerError(Throwable ex) {
        }

        @Override // i.a.e1.h.f.b.t1.b
        public void innerValue(boolean isLeft, Object o2) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    /* compiled from: FlowableGroupJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface b {
        void innerClose(boolean isLeft, c index);

        void innerCloseError(Throwable ex);

        void innerComplete(d sender);

        void innerError(Throwable ex);

        void innerValue(boolean isLeft, Object o2);
    }

    /* compiled from: FlowableGroupJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c extends AtomicReference<Subscription> implements i.a.e1.c.x<Object>, i.a.e1.d.f {
        private static final long serialVersionUID = 1883890389173668373L;
        public final int index;
        public final boolean isLeft;
        public final b parent;

        public c(b parent, boolean isLeft, int index) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    /* compiled from: FlowableGroupJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d extends AtomicReference<Subscription> implements i.a.e1.c.x<Object>, i.a.e1.d.f {
        private static final long serialVersionUID = 1883890389173668373L;
        public final boolean isLeft;
        public final b parent;

        public d(b parent, boolean isLeft) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    public t1(i.a.e1.c.s<TLeft> source, Publisher<? extends TRight> other, i.a.e1.g.o<? super TLeft, ? extends Publisher<TLeftEnd>> leftEnd, i.a.e1.g.o<? super TRight, ? extends Publisher<TRightEnd>> rightEnd, i.a.e1.g.c<? super TLeft, ? super i.a.e1.c.s<TRight>, ? extends R> resultSelector) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
