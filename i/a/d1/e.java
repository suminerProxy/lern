package i.a.d1;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: PublishProcessor.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class e<T> extends c<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final a[] f26683e = null;

    /* renamed from: f  reason: collision with root package name */
    public static final a[] f26684f = null;
    public final AtomicReference<a<T>[]> c;

    /* renamed from: d  reason: collision with root package name */
    public Throwable f26685d;

    /* compiled from: PublishProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = 3562861878281475070L;
        public final Subscriber<? super T> downstream;
        public final e<T> parent;

        public a(Subscriber<? super T> subscriber, e<T> eVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public boolean isCancelled() {
        }

        public boolean isFull() {
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
        }

        public void onNext(T t) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> e<T> O8() {
    }

    @Override // i.a.d1.c
    @i.a.t0.g
    public Throwable I8() {
    }

    @Override // i.a.d1.c
    public boolean J8() {
    }

    @Override // i.a.d1.c
    public boolean K8() {
    }

    @Override // i.a.d1.c
    public boolean L8() {
    }

    public boolean N8(a<T> aVar) {
    }

    public boolean P8(T t) {
    }

    public void Q8(a<T> aVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
    }

    @Override // org.reactivestreams.Subscriber, i.a.q
    public void onSubscribe(Subscription subscription) {
    }
}
