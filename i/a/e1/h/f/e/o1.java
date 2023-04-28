package i.a.e1.h.f.e;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableGroupJoin.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class o1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends i.a.e1.h.f.e.a<TLeft, R> {
    public final i.a.e1.c.n0<? extends TRight> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super TLeft, ? extends i.a.e1.c.n0<TLeftEnd>> f27553d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.o<? super TRight, ? extends i.a.e1.c.n0<TRightEnd>> f27554e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.g.c<? super TLeft, ? super i.a.e1.c.i0<TRight>, ? extends R> f27555f;

    /* compiled from: ObservableGroupJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements i.a.e1.d.f, b {
        public static final Integer LEFT_CLOSE = null;
        public static final Integer LEFT_VALUE = null;
        public static final Integer RIGHT_CLOSE = null;
        public static final Integer RIGHT_VALUE = null;
        private static final long serialVersionUID = -6071216598687999801L;
        public final AtomicInteger active;
        public volatile boolean cancelled;
        public final i.a.e1.d.d disposables;
        public final i.a.e1.c.p0<? super R> downstream;
        public final AtomicReference<Throwable> error;
        public final i.a.e1.g.o<? super TLeft, ? extends i.a.e1.c.n0<TLeftEnd>> leftEnd;
        public int leftIndex;
        public final Map<Integer, i.a.e1.o.j<TRight>> lefts;
        public final i.a.e1.h.g.c<Object> queue;
        public final i.a.e1.g.c<? super TLeft, ? super i.a.e1.c.i0<TRight>, ? extends R> resultSelector;
        public final i.a.e1.g.o<? super TRight, ? extends i.a.e1.c.n0<TRightEnd>> rightEnd;
        public int rightIndex;
        public final Map<Integer, TRight> rights;

        public a(i.a.e1.c.p0<? super R> actual, i.a.e1.g.o<? super TLeft, ? extends i.a.e1.c.n0<TLeftEnd>> leftEnd, i.a.e1.g.o<? super TRight, ? extends i.a.e1.c.n0<TRightEnd>> rightEnd, i.a.e1.g.c<? super TLeft, ? super i.a.e1.c.i0<TRight>, ? extends R> resultSelector) {
        }

        public void cancelAll() {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        public void errorAll(i.a.e1.c.p0<?> a2) {
        }

        public void fail(Throwable exc, i.a.e1.c.p0<?> a2, i.a.e1.h.g.c<?> q) {
        }

        @Override // i.a.e1.h.f.e.o1.b
        public void innerClose(boolean isLeft, c index) {
        }

        @Override // i.a.e1.h.f.e.o1.b
        public void innerCloseError(Throwable ex) {
        }

        @Override // i.a.e1.h.f.e.o1.b
        public void innerComplete(d sender) {
        }

        @Override // i.a.e1.h.f.e.o1.b
        public void innerError(Throwable ex) {
        }

        @Override // i.a.e1.h.f.e.o1.b
        public void innerValue(boolean isLeft, Object o2) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }
    }

    /* compiled from: ObservableGroupJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface b {
        void innerClose(boolean isLeft, c index);

        void innerCloseError(Throwable ex);

        void innerComplete(d sender);

        void innerError(Throwable ex);

        void innerValue(boolean isLeft, Object o2);
    }

    /* compiled from: ObservableGroupJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<Object>, i.a.e1.d.f {
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

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(Object t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    /* compiled from: ObservableGroupJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<Object>, i.a.e1.d.f {
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

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(Object t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    public o1(i.a.e1.c.n0<TLeft> source, i.a.e1.c.n0<? extends TRight> other, i.a.e1.g.o<? super TLeft, ? extends i.a.e1.c.n0<TLeftEnd>> leftEnd, i.a.e1.g.o<? super TRight, ? extends i.a.e1.c.n0<TRightEnd>> rightEnd, i.a.e1.g.c<? super TLeft, ? super i.a.e1.c.i0<TRight>, ? extends R> resultSelector) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super R> observer) {
    }
}
