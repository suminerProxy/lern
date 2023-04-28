package i.a.y0.e.b;

import i.a.y0.e.b.m3;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* compiled from: FlowableSequenceEqualSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class n3<T> extends i.a.k0<Boolean> implements i.a.y0.c.b<Boolean> {
    public final Publisher<? extends T> b;
    public final Publisher<? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.d<? super T, ? super T> f28388d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28389e;

    /* compiled from: FlowableSequenceEqualSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.u0.c, m3.b {
        private static final long serialVersionUID = -6178010334400373240L;
        public final i.a.x0.d<? super T, ? super T> comparer;
        public final i.a.n0<? super Boolean> downstream;
        public final i.a.y0.j.c error;
        public final m3.c<T> first;
        public final m3.c<T> second;
        public T v1;
        public T v2;

        public a(i.a.n0<? super Boolean> n0Var, int i2, i.a.x0.d<? super T, ? super T> dVar) {
        }

        public void cancelAndClear() {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.y0.e.b.m3.b
        public void drain() {
        }

        @Override // i.a.y0.e.b.m3.b
        public void innerError(Throwable th) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public void subscribe(Publisher<? extends T> publisher, Publisher<? extends T> publisher2) {
        }
    }

    public n3(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, i.a.x0.d<? super T, ? super T> dVar, int i2) {
    }

    @Override // i.a.k0
    public void b1(i.a.n0<? super Boolean> n0Var) {
    }

    @Override // i.a.y0.c.b
    public i.a.l<Boolean> c() {
    }
}
