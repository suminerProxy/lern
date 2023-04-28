package i.a.y0.i;

import i.a.y0.c.l;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* compiled from: ScalarSubscription.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h<T> extends AtomicInteger implements l<T> {
    public static final int CANCELLED = 2;
    public static final int NO_REQUEST = 0;
    public static final int REQUESTED = 1;
    private static final long serialVersionUID = -3830916580126663321L;
    public final Subscriber<? super T> subscriber;
    public final T value;

    public h(Subscriber<? super T> subscriber, T t) {
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // i.a.y0.c.o
    public void clear() {
    }

    public boolean isCancelled() {
    }

    @Override // i.a.y0.c.o
    public boolean isEmpty() {
    }

    @Override // i.a.y0.c.o
    public boolean offer(T t) {
    }

    @Override // i.a.y0.c.o
    @i.a.t0.g
    public T poll() {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
    }

    @Override // i.a.y0.c.k
    public int requestFusion(int i2) {
    }

    @Override // i.a.y0.c.o
    public boolean offer(T t, T t2) {
    }
}
