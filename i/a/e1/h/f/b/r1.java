package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableGenerate.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class r1<T, S> extends i.a.e1.c.s<T> {
    public final i.a.e1.g.s<S> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.c<S, i.a.e1.c.r<T>, S> f27138d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.g<? super S> f27139e;

    /* compiled from: FlowableGenerate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, S> extends AtomicLong implements i.a.e1.c.r<T>, Subscription {
        private static final long serialVersionUID = 7565982551505011832L;
        public volatile boolean cancelled;
        public final i.a.e1.g.g<? super S> disposeState;
        public final Subscriber<? super T> downstream;
        public final i.a.e1.g.c<S, ? super i.a.e1.c.r<T>, S> generator;
        public boolean hasNext;
        public S state;
        public boolean terminate;

        public a(Subscriber<? super T> actual, i.a.e1.g.c<S, ? super i.a.e1.c.r<T>, S> generator, i.a.e1.g.g<? super S> disposeState, S initialState) {
        }

        private void dispose(S s) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
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

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public r1(i.a.e1.g.s<S> stateSupplier, i.a.e1.g.c<S, i.a.e1.c.r<T>, S> generator, i.a.e1.g.g<? super S> disposeState) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
