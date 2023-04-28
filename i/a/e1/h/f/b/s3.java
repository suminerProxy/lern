package i.a.e1.h.f.b;

import i.a.e1.h.f.b.r3;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* compiled from: FlowableSequenceEqualSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class s3<T> extends i.a.e1.c.r0<Boolean> implements i.a.e1.h.c.d<Boolean> {
    public final Publisher<? extends T> b;
    public final Publisher<? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.d<? super T, ? super T> f27160d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27161e;

    /* compiled from: FlowableSequenceEqualSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.d.f, r3.b {
        private static final long serialVersionUID = -6178010334400373240L;
        public final i.a.e1.g.d<? super T, ? super T> comparer;
        public final i.a.e1.c.u0<? super Boolean> downstream;
        public final i.a.e1.h.k.c errors;
        public final r3.c<T> first;
        public final r3.c<T> second;
        public T v1;
        public T v2;

        public a(i.a.e1.c.u0<? super Boolean> actual, int prefetch, i.a.e1.g.d<? super T, ? super T> comparer) {
        }

        public void cancelAndClear() {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.h.f.b.r3.b
        public void drain() {
        }

        @Override // i.a.e1.h.f.b.r3.b
        public void innerError(Throwable t) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        public void subscribe(Publisher<? extends T> source1, Publisher<? extends T> source2) {
        }
    }

    public s3(Publisher<? extends T> first, Publisher<? extends T> second, i.a.e1.g.d<? super T, ? super T> comparer, int prefetch) {
    }

    @Override // i.a.e1.c.r0
    public void M1(i.a.e1.c.u0<? super Boolean> observer) {
    }

    @Override // i.a.e1.h.c.d
    public i.a.e1.c.s<Boolean> c() {
    }
}
