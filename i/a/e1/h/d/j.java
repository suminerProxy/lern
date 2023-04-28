package i.a.e1.h.d;

import java.util.Optional;
import org.reactivestreams.Subscriber;

/* compiled from: FlowableMapOptional.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class j<T, R> extends i.a.e1.c.s<R> {
    public final i.a.e1.c.s<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, Optional<? extends R>> f26789d;

    /* compiled from: FlowableMapOptional.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends i.a.e1.h.i.a<T, R> {

        /* renamed from: g  reason: collision with root package name */
        public final i.a.e1.g.o<? super T, Optional<? extends R>> f26790g;

        public a(i.a.e1.h.c.c<? super R> downstream, i.a.e1.g.o<? super T, Optional<? extends R>> mapper) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.h.c.q
        public R poll() throws Throwable {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }

        @Override // i.a.e1.h.c.c
        public boolean tryOnNext(T t) {
        }
    }

    /* compiled from: FlowableMapOptional.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, R> extends i.a.e1.h.i.b<T, R> implements i.a.e1.h.c.c<T> {

        /* renamed from: g  reason: collision with root package name */
        public final i.a.e1.g.o<? super T, Optional<? extends R>> f26791g;

        public b(Subscriber<? super R> downstream, i.a.e1.g.o<? super T, Optional<? extends R>> mapper) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.h.c.q
        public R poll() throws Throwable {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }

        @Override // i.a.e1.h.c.c
        public boolean tryOnNext(T t) {
        }
    }

    public j(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, Optional<? extends R>> mapper) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
