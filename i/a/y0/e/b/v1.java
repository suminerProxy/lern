package i.a.y0.e.b;

import i.a.y0.e.b.o1;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableJoin.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class v1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends i.a.y0.e.b.a<TLeft, R> {

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<? extends TRight> f28545d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.o<? super TLeft, ? extends Publisher<TLeftEnd>> f28546e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.x0.o<? super TRight, ? extends Publisher<TRightEnd>> f28547f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.x0.c<? super TLeft, ? super TRight, ? extends R> f28548g;

    /* compiled from: FlowableJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Subscription, o1.b {
        public static final Integer LEFT_CLOSE = null;
        public static final Integer LEFT_VALUE = null;
        public static final Integer RIGHT_CLOSE = null;
        public static final Integer RIGHT_VALUE = null;
        private static final long serialVersionUID = -6071216598687999801L;
        public final AtomicInteger active;
        public volatile boolean cancelled;
        public final i.a.u0.b disposables;
        public final Subscriber<? super R> downstream;
        public final AtomicReference<Throwable> error;
        public final i.a.x0.o<? super TLeft, ? extends Publisher<TLeftEnd>> leftEnd;
        public int leftIndex;
        public final Map<Integer, TLeft> lefts;
        public final i.a.y0.f.c<Object> queue;
        public final AtomicLong requested;
        public final i.a.x0.c<? super TLeft, ? super TRight, ? extends R> resultSelector;
        public final i.a.x0.o<? super TRight, ? extends Publisher<TRightEnd>> rightEnd;
        public int rightIndex;
        public final Map<Integer, TRight> rights;

        public a(Subscriber<? super R> subscriber, i.a.x0.o<? super TLeft, ? extends Publisher<TLeftEnd>> oVar, i.a.x0.o<? super TRight, ? extends Publisher<TRightEnd>> oVar2, i.a.x0.c<? super TLeft, ? super TRight, ? extends R> cVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelAll() {
        }

        public void drain() {
        }

        public void errorAll(Subscriber<?> subscriber) {
        }

        public void fail(Throwable th, Subscriber<?> subscriber, i.a.y0.c.o<?> oVar) {
        }

        @Override // i.a.y0.e.b.o1.b
        public void innerClose(boolean z, o1.c cVar) {
        }

        @Override // i.a.y0.e.b.o1.b
        public void innerCloseError(Throwable th) {
        }

        @Override // i.a.y0.e.b.o1.b
        public void innerComplete(o1.d dVar) {
        }

        @Override // i.a.y0.e.b.o1.b
        public void innerError(Throwable th) {
        }

        @Override // i.a.y0.e.b.o1.b
        public void innerValue(boolean z, Object obj) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    public v1(i.a.l<TLeft> lVar, Publisher<? extends TRight> publisher, i.a.x0.o<? super TLeft, ? extends Publisher<TLeftEnd>> oVar, i.a.x0.o<? super TRight, ? extends Publisher<TRightEnd>> oVar2, i.a.x0.c<? super TLeft, ? super TRight, ? extends R> cVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }
}
