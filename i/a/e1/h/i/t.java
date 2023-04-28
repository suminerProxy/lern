package i.a.e1.h.i;

import i.a.e1.c.x;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: SinglePostCompleteSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class t<T, R> extends AtomicLong implements x<T>, Subscription {
    public static final long COMPLETE_MASK = Long.MIN_VALUE;
    public static final long REQUEST_MASK = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;
    public final Subscriber<? super R> downstream;
    public long produced;
    public Subscription upstream;
    public R value;

    public t(Subscriber<? super R> downstream) {
    }

    public void cancel() {
    }

    public final void complete(R n2) {
    }

    public void onDrop(R n2) {
    }

    @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
    public void onSubscribe(Subscription s) {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long n2) {
    }
}
