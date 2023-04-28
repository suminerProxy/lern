package i.a.e1.h.j;

import i.a.e1.h.c.n;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* compiled from: ScalarSubscription.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class h<T> extends AtomicInteger implements n<T> {
    public static final int CANCELLED = 2;
    public static final int NO_REQUEST = 0;
    public static final int REQUESTED = 1;
    private static final long serialVersionUID = -3830916580126663321L;
    public final Subscriber<? super T> subscriber;
    public final T value;

    public h(Subscriber<? super T> subscriber, T value) {
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // i.a.e1.h.c.q
    public void clear() {
    }

    public boolean isCancelled() {
    }

    @Override // i.a.e1.h.c.q
    public boolean isEmpty() {
    }

    @Override // i.a.e1.h.c.q
    public boolean offer(T e2) {
    }

    @Override // i.a.e1.h.c.q
    @i.a.e1.b.g
    public T poll() {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n2) {
    }

    @Override // i.a.e1.h.c.m
    public int requestFusion(int mode) {
    }

    @Override // i.a.e1.h.c.q
    public boolean offer(T v1, T v2) {
    }
}
