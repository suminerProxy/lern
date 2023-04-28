package i.a.y0.e.c;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: MaybeConcatIterable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class g<T> extends i.a.l<T> {
    public final Iterable<? extends i.a.y<? extends T>> c;

    /* compiled from: MaybeConcatIterable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.v<T>, Subscription {
        private static final long serialVersionUID = 3520831347801429610L;
        public final AtomicReference<Object> current;
        public final i.a.y0.a.h disposables;
        public final Subscriber<? super T> downstream;
        public long produced;
        public final AtomicLong requested;
        public final Iterator<? extends i.a.y<? extends T>> sources;

        public a(Subscriber<? super T> subscriber, Iterator<? extends i.a.y<? extends T>> it) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void drain() {
        }

        @Override // i.a.v
        public void onComplete() {
        }

        @Override // i.a.v
        public void onError(Throwable th) {
        }

        @Override // i.a.v
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // i.a.v, i.a.n0
        public void onSuccess(T t) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    public g(Iterable<? extends i.a.y<? extends T>> iterable) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
