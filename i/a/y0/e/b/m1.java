package i.a.y0.e.b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableGenerate.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class m1<T, S> extends i.a.l<T> {
    public final Callable<S> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.c<S, i.a.k<T>, S> f28365d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.g<? super S> f28366e;

    /* compiled from: FlowableGenerate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, S> extends AtomicLong implements i.a.k<T>, Subscription {
        private static final long serialVersionUID = 7565982551505011832L;
        public volatile boolean cancelled;
        public final i.a.x0.g<? super S> disposeState;
        public final Subscriber<? super T> downstream;
        public final i.a.x0.c<S, ? super i.a.k<T>, S> generator;
        public boolean hasNext;
        public S state;
        public boolean terminate;

        public a(Subscriber<? super T> subscriber, i.a.x0.c<S, ? super i.a.k<T>, S> cVar, i.a.x0.g<? super S> gVar, S s) {
        }

        private void dispose(S s) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
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

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    public m1(Callable<S> callable, i.a.x0.c<S, i.a.k<T>, S> cVar, i.a.x0.g<? super S> gVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
