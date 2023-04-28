package i.a.e1.h.f.b;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* compiled from: FlowableScalarXMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class o3 {

    /* compiled from: FlowableScalarXMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends i.a.e1.c.s<R> {
        public final T c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> f27074d;

        public a(T value, i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper) {
        }

        @Override // i.a.e1.c.s
        public void F6(Subscriber<? super R> s) {
        }
    }

    private o3() {
    }

    public static <T, U> i.a.e1.c.s<U> a(final T value, final i.a.e1.g.o<? super T, ? extends Publisher<? extends U>> mapper) {
    }

    public static <T, R> boolean b(Publisher<T> source, Subscriber<? super R> subscriber, i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper) {
    }
}
