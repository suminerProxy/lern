package i.a.y0.i;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* compiled from: SubscriptionArbiter.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class i extends AtomicInteger implements Subscription {
    private static final long serialVersionUID = -2189523197179400958L;
    public Subscription actual;
    public final boolean cancelOnReplace;
    public volatile boolean cancelled;
    public final AtomicLong missedProduced;
    public final AtomicLong missedRequested;
    public final AtomicReference<Subscription> missedSubscription;
    public long requested;
    public boolean unbounded;

    public i(boolean z) {
    }

    public void cancel() {
    }

    public final void drain() {
    }

    public final void drainLoop() {
    }

    public final boolean isCancelled() {
    }

    public final boolean isUnbounded() {
    }

    public final void produced(long j2) {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j2) {
    }

    public final void setSubscription(Subscription subscription) {
    }
}
