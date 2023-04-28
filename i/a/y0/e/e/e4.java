package i.a.y0.e.e;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableWindow.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class e4<T> extends i.a.y0.e.e.a<T, i.a.b0<T>> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f28756d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28757e;

    /* compiled from: ObservableWindow.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.i0<T>, i.a.u0.c, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;
        public volatile boolean cancelled;
        public final int capacityHint;
        public final long count;
        public final i.a.i0<? super i.a.b0<T>> downstream;
        public long size;
        public i.a.u0.c upstream;
        public i.a.g1.j<T> window;

        public a(i.a.i0<? super i.a.b0<T>> i0Var, long j2, int i2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(T t) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ObservableWindow.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicBoolean implements i.a.i0<T>, i.a.u0.c, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;
        public volatile boolean cancelled;
        public final int capacityHint;
        public final long count;
        public final i.a.i0<? super i.a.b0<T>> downstream;
        public long firstEmission;
        public long index;
        public final long skip;
        public i.a.u0.c upstream;
        public final ArrayDeque<i.a.g1.j<T>> windows;
        public final AtomicInteger wip;

        public b(i.a.i0<? super i.a.b0<T>> i0Var, long j2, long j3, int i2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(T t) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public e4(i.a.g0<T> g0Var, long j2, long j3, int i2) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super i.a.b0<T>> i0Var) {
    }
}
