package i.a.y0.i;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* compiled from: AsyncSubscription.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b extends AtomicLong implements Subscription, i.a.u0.c {
    private static final long serialVersionUID = 7028635084060361255L;
    public final AtomicReference<Subscription> actual;
    public final AtomicReference<i.a.u0.c> resource;

    public b() {
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // i.a.u0.c
    public void dispose() {
    }

    @Override // i.a.u0.c
    public boolean isDisposed() {
    }

    public boolean replaceResource(i.a.u0.c cVar) {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
    }

    public boolean setResource(i.a.u0.c cVar) {
    }

    public void setSubscription(Subscription subscription) {
    }

    public b(i.a.u0.c cVar) {
    }
}
