package i.a.y0.f;

import i.a.t0.g;
import i.a.y0.c.n;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MpscLinkedQueue.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a<T> implements n<T> {
    private final AtomicReference<C0593a<T>> b;
    private final AtomicReference<C0593a<T>> c;

    /* compiled from: MpscLinkedQueue.java */
    /* renamed from: i.a.y0.f.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class C0593a<E> extends AtomicReference<C0593a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        public C0593a() {
        }

        public E getAndNullValue() {
        }

        public E lpValue() {
        }

        public C0593a<E> lvNext() {
        }

        public void soNext(C0593a<E> c0593a) {
        }

        public void spValue(E e2) {
        }

        public C0593a(E e2) {
        }
    }

    public C0593a<T> a() {
    }

    public C0593a<T> b() {
    }

    public C0593a<T> c() {
    }

    @Override // i.a.y0.c.o
    public void clear() {
    }

    public void d(C0593a<T> c0593a) {
    }

    public C0593a<T> e(C0593a<T> c0593a) {
    }

    @Override // i.a.y0.c.o
    public boolean isEmpty() {
    }

    @Override // i.a.y0.c.o
    public boolean offer(T t) {
    }

    @Override // i.a.y0.c.n, i.a.y0.c.o
    @g
    public T poll() {
    }

    @Override // i.a.y0.c.o
    public boolean offer(T t, T t2) {
    }
}
