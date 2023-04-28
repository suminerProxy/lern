package i.a.y0.e.c;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: MaybeConcatArrayDelayError.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class f<T> extends i.a.l<T> {
    public final i.a.y<? extends T>[] c;

    /* compiled from: MaybeConcatArrayDelayError.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.v<T>, Subscription {
        private static final long serialVersionUID = 3520831347801429610L;
        public final AtomicReference<Object> current;
        public final i.a.y0.a.h disposables;
        public final Subscriber<? super T> downstream;
        public final i.a.y0.j.c errors;
        public int index;
        public long produced;
        public final AtomicLong requested;
        public final i.a.y<? extends T>[] sources;

        public a(Subscriber<? super T> subscriber, i.a.y<? extends T>[] yVarArr) {
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

    public f(i.a.y<? extends T>[] yVarArr) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
