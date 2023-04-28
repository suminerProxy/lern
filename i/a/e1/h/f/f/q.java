package i.a.e1.h.f.f;

import i.a.e1.c.s;
import i.a.e1.c.x;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelSortedJoin.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class q<T> extends s<T> {
    public final i.a.e1.k.b<List<T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final Comparator<? super T> f27743d;

    /* compiled from: ParallelSortedJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<Subscription> implements x<List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;
        public final int index;
        public final b<T> parent;

        public a(b<T> parent, int index) {
        }

        public void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public /* bridge */ /* synthetic */ void onNext(Object t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        public void onNext(List<T> t) {
        }
    }

    /* compiled from: ParallelSortedJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
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

        public b(Subscriber<? super T> actual, int n2, Comparator<? super T> comparator) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelAll() {
        }

        public void drain() {
        }

        public void innerError(Throwable e2) {
        }

        public void innerNext(List<T> value, int index) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public q(i.a.e1.k.b<List<T>> source, Comparator<? super T> comparator) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
