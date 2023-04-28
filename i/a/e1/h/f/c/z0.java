package i.a.e1.h.f.c;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Subscriber;

/* compiled from: MaybeMergeArray.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class z0<T> extends i.a.e1.c.s<T> {
    public final i.a.e1.c.f0<? extends T>[] c;

    /* compiled from: MaybeMergeArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends ConcurrentLinkedQueue<T> implements d<T> {
        private static final long serialVersionUID = -4025173261791142821L;
        public int consumerIndex;
        public final AtomicInteger producerIndex;

        @Override // i.a.e1.h.f.c.z0.d
        public int consumerIndex() {
        }

        @Override // i.a.e1.h.f.c.z0.d
        public void drop() {
        }

        @Override // i.a.e1.h.c.q
        public boolean offer(T v1, T v2) {
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, i.a.e1.h.f.c.z0.d, i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() {
        }

        @Override // i.a.e1.h.f.c.z0.d
        public int producerIndex() {
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, i.a.e1.h.c.q
        public boolean offer(T e2) {
        }
    }

    /* compiled from: MaybeMergeArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends i.a.e1.h.j.c<T> implements i.a.e1.c.c0<T> {
        private static final long serialVersionUID = -660395290758764731L;
        public volatile boolean cancelled;
        public long consumed;
        public final Subscriber<? super T> downstream;
        public final i.a.e1.h.k.c errors;
        public boolean outputFused;
        public final d<Object> queue;
        public final AtomicLong requested;
        public final i.a.e1.d.d set;
        public final int sourceCount;

        public b(Subscriber<? super T> actual, int sourceCount, d<Object> queue) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.h.c.q
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

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.m
        public void onComplete() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0
        public void onSuccess(T value) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }
    }

    /* compiled from: MaybeMergeArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface d<T> extends i.a.e1.h.c.q<T> {
        int consumerIndex();

        void drop();

        T peek();

        @Override // java.util.Queue, i.a.e1.h.f.c.z0.d, i.a.e1.h.c.q
        @i.a.e1.b.g
        T poll();

        int producerIndex();
    }

    public z0(i.a.e1.c.f0<? extends T>[] sources) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }

    /* compiled from: MaybeMergeArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends AtomicReferenceArray<T> implements d<T> {
        private static final long serialVersionUID = -7969063454040569579L;
        public int consumerIndex;
        public final AtomicInteger producerIndex;

        public c(int length) {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
        }

        @Override // i.a.e1.h.f.c.z0.d
        public int consumerIndex() {
        }

        @Override // i.a.e1.h.f.c.z0.d
        public void drop() {
        }

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
        }

        @Override // i.a.e1.h.c.q
        public boolean offer(T value) {
        }

        @Override // i.a.e1.h.f.c.z0.d
        public T peek() {
        }

        @Override // i.a.e1.h.f.c.z0.d, java.util.Queue, i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() {
        }

        @Override // i.a.e1.h.f.c.z0.d
        public int producerIndex() {
        }

        @Override // i.a.e1.h.c.q
        public boolean offer(T v1, T v2) {
        }
    }
}
