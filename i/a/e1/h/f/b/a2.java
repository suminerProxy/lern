package i.a.e1.h.f.b;

import i.a.e1.h.f.b.t1;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableJoin.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class a2<TLeft, TRight, TLeftEnd, TRightEnd, R> extends i.a.e1.h.f.b.a<TLeft, R> {

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<? extends TRight> f26871d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.o<? super TLeft, ? extends Publisher<TLeftEnd>> f26872e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.g.o<? super TRight, ? extends Publisher<TRightEnd>> f26873f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.e1.g.c<? super TLeft, ? super TRight, ? extends R> f26874g;

    /* compiled from: FlowableJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Subscription, t1.b {
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
        public final Map<Integer, TLeft> lefts;
        public final i.a.e1.h.g.c<Object> queue;
        public final AtomicLong requested;
        public final i.a.e1.g.c<? super TLeft, ? super TRight, ? extends R> resultSelector;
        public final i.a.e1.g.o<? super TRight, ? extends Publisher<TRightEnd>> rightEnd;
        public int rightIndex;
        public final Map<Integer, TRight> rights;

        public a(Subscriber<? super R> actual, i.a.e1.g.o<? super TLeft, ? extends Publisher<TLeftEnd>> leftEnd, i.a.e1.g.o<? super TRight, ? extends Publisher<TRightEnd>> rightEnd, i.a.e1.g.c<? super TLeft, ? super TRight, ? extends R> resultSelector) {
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
        public void innerClose(boolean isLeft, t1.c index) {
        }

        @Override // i.a.e1.h.f.b.t1.b
        public void innerCloseError(Throwable ex) {
        }

        @Override // i.a.e1.h.f.b.t1.b
        public void innerComplete(t1.d sender) {
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

    public a2(i.a.e1.c.s<TLeft> source, Publisher<? extends TRight> other, i.a.e1.g.o<? super TLeft, ? extends Publisher<TLeftEnd>> leftEnd, i.a.e1.g.o<? super TRight, ? extends Publisher<TRightEnd>> rightEnd, i.a.e1.g.c<? super TLeft, ? super TRight, ? extends R> resultSelector) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
