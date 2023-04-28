package i.a.e1.h.d;

import i.a.e1.c.i0;
import i.a.e1.c.p0;
import java.util.Optional;

/* compiled from: ObservableMapOptional.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class x<T, R> extends i0<R> {
    public final i0<T> b;
    public final i.a.e1.g.o<? super T, Optional<? extends R>> c;

    /* compiled from: ObservableMapOptional.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends i.a.e1.h.e.a<T, R> {

        /* renamed from: g  reason: collision with root package name */
        public final i.a.e1.g.o<? super T, Optional<? extends R>> f26808g;

        public a(p0<? super R> downstream, i.a.e1.g.o<? super T, Optional<? extends R>> mapper) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.h.c.q
        public R poll() throws Throwable {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }
    }

    public x(i0<T> source, i.a.e1.g.o<? super T, Optional<? extends R>> mapper) {
    }

    @Override // i.a.e1.c.i0
    public void c6(p0<? super R> observer) {
    }
}
