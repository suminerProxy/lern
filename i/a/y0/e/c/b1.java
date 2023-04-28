package i.a.y0.e.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeOnErrorNext.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b1<T> extends i.a.y0.e.c.a<T, T> {
    public final i.a.x0.o<? super Throwable, ? extends i.a.y<? extends T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f28625d;

    /* compiled from: MaybeOnErrorNext.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<i.a.u0.c> implements i.a.v<T>, i.a.u0.c {
        private static final long serialVersionUID = 2026620218879969836L;
        public final boolean allowFatal;
        public final i.a.v<? super T> downstream;
        public final i.a.x0.o<? super Throwable, ? extends i.a.y<? extends T>> resumeFunction;

        /* compiled from: MaybeOnErrorNext.java */
        /* renamed from: i.a.y0.e.c.b1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0548a<T> implements i.a.v<T> {
            public final i.a.v<? super T> b;
            public final AtomicReference<i.a.u0.c> c;

            public C0548a(i.a.v<? super T> vVar, AtomicReference<i.a.u0.c> atomicReference) {
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
        }

        public a(i.a.v<? super T> vVar, i.a.x0.o<? super Throwable, ? extends i.a.y<? extends T>> oVar, boolean z) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
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
    }

    public b1(i.a.y<T> yVar, i.a.x0.o<? super Throwable, ? extends i.a.y<? extends T>> oVar, boolean z) {
    }

    @Override // i.a.s
    public void q1(i.a.v<? super T> vVar) {
    }
}
