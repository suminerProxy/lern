package i.a.y0.e.c;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeUsing.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class s1<T, D> extends i.a.s<T> {
    public final Callable<? extends D> b;
    public final i.a.x0.o<? super D, ? extends i.a.y<? extends T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.g<? super D> f28656d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28657e;

    /* compiled from: MaybeUsing.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, D> extends AtomicReference<Object> implements i.a.v<T>, i.a.u0.c {
        private static final long serialVersionUID = -674404550052917487L;
        public final i.a.x0.g<? super D> disposer;
        public final i.a.v<? super T> downstream;
        public final boolean eager;
        public i.a.u0.c upstream;

        public a(i.a.v<? super T> vVar, D d2, i.a.x0.g<? super D> gVar, boolean z) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void disposeResourceAfter() {
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

    public s1(Callable<? extends D> callable, i.a.x0.o<? super D, ? extends i.a.y<? extends T>> oVar, i.a.x0.g<? super D> gVar, boolean z) {
    }

    @Override // i.a.s
    public void q1(i.a.v<? super T> vVar) {
    }
}
