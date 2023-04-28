package i.a.e1.h.g;

import i.a.e1.b.g;
import i.a.e1.h.c.p;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MpscLinkedQueue.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class a<T> implements p<T> {
    private final AtomicReference<C0504a<T>> b;
    private final AtomicReference<C0504a<T>> c;

    /* compiled from: MpscLinkedQueue.java */
    /* renamed from: i.a.e1.h.g.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class C0504a<E> extends AtomicReference<C0504a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        public C0504a() {
        }

        public E getAndNullValue() {
        }

        public E lpValue() {
        }

        public C0504a<E> lvNext() {
        }

        public void soNext(C0504a<E> n2) {
        }

        public void spValue(E newValue) {
        }

        public C0504a(E val) {
        }
    }

    public C0504a<T> a() {
    }

    public C0504a<T> b() {
    }

    public C0504a<T> c() {
    }

    @Override // i.a.e1.h.c.q
    public void clear() {
    }

    public void d(C0504a<T> node) {
    }

    public C0504a<T> e(C0504a<T> node) {
    }

    @Override // i.a.e1.h.c.q
    public boolean isEmpty() {
    }

    @Override // i.a.e1.h.c.q
    public boolean offer(final T e2) {
    }

    @Override // i.a.e1.h.c.p, i.a.e1.h.c.q
    @g
    public T poll() {
    }

    @Override // i.a.e1.h.c.q
    public boolean offer(T v1, T v2) {
    }
}
