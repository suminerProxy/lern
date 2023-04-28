package i.a.y0.e.f;

import i.a.q;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelSortedJoin.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class p<T> extends i.a.l<T> {
    public final i.a.b1.b<List<T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final Comparator<? super T> f29066d;

    /* compiled from: ParallelSortedJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<Subscription> implements q<List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;
        public final int index;
        public final b<T> parent;

        public a(b<T> bVar, int i2) {
        }

        public void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        public void onNext(List<T> list) {
        }
    }

    /* compiled from: ParallelSortedJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 3481980673745556697L;
        public volatile boolean cancelled;
        public final Comparator<? super T> comparator;
        public final Subscriber<? super T> downstream;
        public final AtomicReference<Throwable> error;
        public final int[] indexes;
        public final List<T>[] lists;
        public final AtomicInteger remaining;
        public final AtomicLong requested;
        public final a<T>[] subscribers;

        public b(Subscriber<? super T> subscriber, int i2, Comparator<? super T> comparator) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelAll() {
        }

        public void drain() {
        }

        public void innerError(Throwable th) {
        }

        public void innerNext(List<T> list, int i2) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    public p(i.a.b1.b<List<T>> bVar, Comparator<? super T> comparator) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
