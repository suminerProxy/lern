package i.a.e1.h.j;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* compiled from: AsyncSubscription.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class b extends AtomicLong implements Subscription, i.a.e1.d.f {
    private static final long serialVersionUID = 7028635084060361255L;
    public final AtomicReference<Subscription> actual;
    public final AtomicReference<i.a.e1.d.f> resource;

    public b() {
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // i.a.e1.d.f
    public void dispose() {
    }

    @Override // i.a.e1.d.f
    public boolean isDisposed() {
    }

    public boolean replaceResource(i.a.e1.d.f r) {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n2) {
    }

    public boolean setResource(i.a.e1.d.f r) {
    }

    public void setSubscription(Subscription s) {
    }

    public b(i.a.e1.d.f resource) {
    }
}
