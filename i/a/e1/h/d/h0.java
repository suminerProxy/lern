package i.a.e1.h.d;

import i.a.e1.c.r0;
import i.a.e1.c.u0;
import java.util.Optional;

/* compiled from: SingleMapOptional.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h0<T, R> extends i.a.e1.c.z<R> {
    public final r0<T> b;
    public final i.a.e1.g.o<? super T, Optional<? extends R>> c;

    /* compiled from: SingleMapOptional.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> implements u0<T>, i.a.e1.d.f {
        public final i.a.e1.c.c0<? super R> b;
        public final i.a.e1.g.o<? super T, Optional<? extends R>> c;

        /* renamed from: d  reason: collision with root package name */
        public i.a.e1.d.f f26786d;

        public a(i.a.e1.c.c0<? super R> downstream, i.a.e1.g.o<? super T, Optional<? extends R>> mapper) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.u0
        public void onSuccess(T value) {
        }
    }

    public h0(r0<T> source, i.a.e1.g.o<? super T, Optional<? extends R>> mapper) {
    }

    @Override // i.a.e1.c.z
    public void U1(i.a.e1.c.c0<? super R> observer) {
    }
}
