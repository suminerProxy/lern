package i.a.e1.h.f.e;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableWindow.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class j4<T> extends i.a.e1.h.f.e.a<T, i.a.e1.c.i0<T>> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27489d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27490e;

    /* compiled from: ObservableWindow.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.c.p0<T>, i.a.e1.d.f, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;
        public volatile boolean cancelled;
        public final int capacityHint;
        public final long count;
        public final i.a.e1.c.p0<? super i.a.e1.c.i0<T>> downstream;
        public long size;
        public i.a.e1.d.f upstream;
        public i.a.e1.o.j<T> window;

        public a(i.a.e1.c.p0<? super i.a.e1.c.i0<T>> actual, long count, int capacityHint) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ObservableWindow.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicBoolean implements i.a.e1.c.p0<T>, i.a.e1.d.f, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;
        public volatile boolean cancelled;
        public final int capacityHint;
        public final long count;
        public final i.a.e1.c.p0<? super i.a.e1.c.i0<T>> downstream;
        public long firstEmission;
        public long index;
        public final long skip;
        public i.a.e1.d.f upstream;
        public final ArrayDeque<i.a.e1.o.j<T>> windows;
        public final AtomicInteger wip;

        public b(i.a.e1.c.p0<? super i.a.e1.c.i0<T>> actual, long count, long skip, int capacityHint) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public j4(i.a.e1.c.n0<T> source, long count, long skip, int capacityHint) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super i.a.e1.c.i0<T>> t) {
    }
}
