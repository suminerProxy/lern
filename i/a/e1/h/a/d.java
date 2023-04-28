package i.a.e1.h.a;

import i.a.e1.b.g;
import i.a.e1.c.c0;
import i.a.e1.c.m;
import i.a.e1.c.p0;
import i.a.e1.c.u0;
import i.a.e1.h.c.l;

/* compiled from: EmptyDisposable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public enum d implements l<Object> {
    INSTANCE,
    NEVER;

    public static void complete(p0<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onComplete();
    }

    public static void error(Throwable e2, p0<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(e2);
    }

    @Override // i.a.e1.h.c.q
    public void clear() {
    }

    @Override // i.a.e1.d.f
    public void dispose() {
    }

    @Override // i.a.e1.d.f
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // i.a.e1.h.c.q
    public boolean isEmpty() {
        return true;
    }

    @Override // i.a.e1.h.c.q
    public boolean offer(Object value) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // i.a.e1.h.c.q
    @g
    public Object poll() {
        return null;
    }

    @Override // i.a.e1.h.c.m
    public int requestFusion(int mode) {
        return mode & 2;
    }

    @Override // i.a.e1.h.c.q
    public boolean offer(Object v1, Object v2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(c0<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onComplete();
    }

    public static void error(Throwable e2, m observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(e2);
    }

    public static void complete(m observer) {
        observer.onSubscribe(INSTANCE);
        observer.onComplete();
    }

    public static void error(Throwable e2, u0<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(e2);
    }

    public static void error(Throwable e2, c0<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(e2);
    }
}
