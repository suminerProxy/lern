package i.a.y0.i;

import org.reactivestreams.Subscriber;

/* compiled from: DeferredScalarSubscription.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class f<T> extends c<T> {
    public static final int CANCELLED = 4;
    public static final int FUSED_CONSUMED = 32;
    public static final int FUSED_EMPTY = 8;
    public static final int FUSED_READY = 16;
    public static final int HAS_REQUEST_HAS_VALUE = 3;
    public static final int HAS_REQUEST_NO_VALUE = 2;
    public static final int NO_REQUEST_HAS_VALUE = 1;
    public static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2151279923272604993L;
    public final Subscriber<? super T> downstream;
    public T value;

    public f(Subscriber<? super T> subscriber) {
    }

    public void cancel() {
    }

    @Override // i.a.y0.c.o
    public final void clear() {
    }

    public final void complete(T t) {
    }

    public final boolean isCancelled() {
    }

    @Override // i.a.y0.c.o
    public final boolean isEmpty() {
    }

    @Override // i.a.y0.c.o
    @i.a.t0.g
    public final T poll() {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j2) {
    }

    @Override // i.a.y0.c.k
    public final int requestFusion(int i2) {
    }

    public final boolean tryCancel() {
    }
}
