package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableMergeWithCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class d2<T> extends i.a.e1.h.f.e.a<T, T> {
    public final i.a.e1.c.p c;

    /* compiled from: ObservableMergeWithCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -4592979584110982903L;
        public final i.a.e1.c.p0<? super T> downstream;
        public final i.a.e1.h.k.c errors;
        public final AtomicReference<i.a.e1.d.f> mainDisposable;
        public volatile boolean mainDone;
        public volatile boolean otherDone;
        public final C0479a otherObserver;

        /* compiled from: ObservableMergeWithCompletable.java */
        /* renamed from: i.a.e1.h.f.e.d2$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0479a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.m {
            private static final long serialVersionUID = -2935427570954647017L;
            public final a<?> parent;

            public C0479a(a<?> parent) {
            }

            @Override // i.a.e1.c.m
            public void onComplete() {
            }

            @Override // i.a.e1.c.m
            public void onError(Throwable e2) {
            }

            @Override // i.a.e1.c.m
            public void onSubscribe(i.a.e1.d.f d2) {
            }
        }

        public a(i.a.e1.c.p0<? super T> downstream) {
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
        public void onError(Throwable ex) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        public void otherComplete() {
        }

        public void otherError(Throwable ex) {
        }
    }

    public d2(i.a.e1.c.i0<T> source, i.a.e1.c.p other) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> observer) {
    }
}
