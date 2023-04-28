package i.a.y0.e.c;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Subscriber;

/* compiled from: MaybeMergeArray.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class x0<T> extends i.a.l<T> {
    public final i.a.y<? extends T>[] c;

    /* compiled from: MaybeMergeArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends ConcurrentLinkedQueue<T> implements d<T> {
        private static final long serialVersionUID = -4025173261791142821L;
        public int consumerIndex;
        public final AtomicInteger producerIndex;

        @Override // i.a.y0.e.c.x0.d
        public int consumerIndex() {
        }

        @Override // i.a.y0.e.c.x0.d
        public void drop() {
        }

        @Override // i.a.y0.c.o
        public boolean offer(T t, T t2) {
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, i.a.y0.e.c.x0.d, i.a.y0.c.o
        @i.a.t0.g
        public T poll() {
        }

        @Override // i.a.y0.e.c.x0.d
        public int producerIndex() {
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, i.a.y0.c.o
        public boolean offer(T t) {
        }
    }

    /* compiled from: MaybeMergeArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends i.a.y0.i.c<T> implements i.a.v<T> {
        private static final long serialVersionUID = -660395290758764731L;
        public volatile boolean cancelled;
        public long consumed;
        public final Subscriber<? super T> downstream;
        public final i.a.y0.j.c error;
        public boolean outputFused;
        public final d<Object> queue;
        public final AtomicLong requested;
        public final i.a.u0.b set;
        public final int sourceCount;

        public b(Subscriber<? super T> subscriber, int i2, d<Object> dVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.y0.c.o
        public void clear() {
        }

        public void drain() {
        }

        public void drainFused() {
        }

        public void drainNormal() {
        }

        public boolean isCancelled() {
        }

        @Override // i.a.y0.c.o
        public boolean isEmpty() {
        }

        @Override // i.a.v
        public void onComplete() {
        }

        @Override // i.a.v
        public void onError(Throwable th) {
        }

        @Override // i.a.v
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // i.a.v, i.a.n0
        public void onSuccess(T t) {
        }

        @Override // i.a.y0.c.o
        @i.a.t0.g
        public T poll() throws Exception {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        @Override // i.a.y0.c.k
        public int requestFusion(int i2) {
        }
    }

    /* compiled from: MaybeMergeArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface d<T> extends i.a.y0.c.o<T> {
        int consumerIndex();

        void drop();

        T peek();

        @Override // java.util.Queue, i.a.y0.e.c.x0.d, i.a.y0.c.o
        @i.a.t0.g
        T poll();

        int producerIndex();
    }

    public x0(i.a.y<? extends T>[] yVarArr) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }

    /* compiled from: MaybeMergeArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends AtomicReferenceArray<T> implements d<T> {
        private static final long serialVersionUID = -7969063454040569579L;
        public int consumerIndex;
        public final AtomicInteger producerIndex;

        public c(int i2) {
        }

        @Override // i.a.y0.c.o
        public void clear() {
        }

        @Override // i.a.y0.e.c.x0.d
        public int consumerIndex() {
        }

        @Override // i.a.y0.e.c.x0.d
        public void drop() {
        }

        @Override // i.a.y0.c.o
        public boolean isEmpty() {
        }

        @Override // i.a.y0.c.o
        public boolean offer(T t) {
        }

        @Override // i.a.y0.e.c.x0.d
        public T peek() {
        }

        @Override // i.a.y0.e.c.x0.d, java.util.Queue, i.a.y0.c.o
        @i.a.t0.g
        public T poll() {
        }

        @Override // i.a.y0.e.c.x0.d
        public int producerIndex() {
        }

        @Override // i.a.y0.c.o
        public boolean offer(T t, T t2) {
        }
    }
}
