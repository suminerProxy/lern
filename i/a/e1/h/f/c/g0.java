package i.a.e1.h.f.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapNotification.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class g0<T, R> extends i.a.e1.h.f.c.a<T, R> {
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.f0<? extends R>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super Throwable, ? extends i.a.e1.c.f0<? extends R>> f27303d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.s<? extends i.a.e1.c.f0<? extends R>> f27304e;

    /* compiled from: MaybeFlatMapNotification.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.c0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = 4375739915521278546L;
        public final i.a.e1.c.c0<? super R> downstream;
        public final i.a.e1.g.s<? extends i.a.e1.c.f0<? extends R>> onCompleteSupplier;
        public final i.a.e1.g.o<? super Throwable, ? extends i.a.e1.c.f0<? extends R>> onErrorMapper;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.f0<? extends R>> onSuccessMapper;
        public i.a.e1.d.f upstream;

        /* compiled from: MaybeFlatMapNotification.java */
        /* renamed from: i.a.e1.h.f.c.g0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class C0457a implements i.a.e1.c.c0<R> {
            public final /* synthetic */ a b;

            public C0457a(final a this$0) {
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
            public void onSuccess(R value) {
            }
        }

        public a(i.a.e1.c.c0<? super R> actual, i.a.e1.g.o<? super T, ? extends i.a.e1.c.f0<? extends R>> onSuccessMapper, i.a.e1.g.o<? super Throwable, ? extends i.a.e1.c.f0<? extends R>> onErrorMapper, i.a.e1.g.s<? extends i.a.e1.c.f0<? extends R>> onCompleteSupplier) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
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
    }

    public g0(i.a.e1.c.f0<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.f0<? extends R>> onSuccessMapper, i.a.e1.g.o<? super Throwable, ? extends i.a.e1.c.f0<? extends R>> onErrorMapper, i.a.e1.g.s<? extends i.a.e1.c.f0<? extends R>> onCompleteSupplier) {
    }

    @Override // i.a.e1.c.z
    public void U1(i.a.e1.c.c0<? super R> observer) {
    }
}
