package i.a.e1.h.f.c;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: MaybeConcatArrayDelayError.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class f<T> extends i.a.e1.c.s<T> {
    public final i.a.e1.c.f0<? extends T>[] c;

    /* compiled from: MaybeConcatArrayDelayError.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.c.c0<T>, Subscription {
        private static final long serialVersionUID = 3520831347801429610L;
        public final AtomicReference<Object> current;
        public final i.a.e1.h.a.f disposables;
        public final Subscriber<? super T> downstream;
        public final i.a.e1.h.k.c errors;
        public int index;
        public long produced;
        public final AtomicLong requested;
        public final i.a.e1.c.f0<? extends T>[] sources;

        public a(Subscriber<? super T> actual, i.a.e1.c.f0<? extends T>[] sources) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void drain() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.m
        public void onComplete() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0
        public void onSuccess(T value) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public f(i.a.e1.c.f0<? extends T>[] sources) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
