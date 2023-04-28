package i.a.e1.o;

import i.a.e1.c.p0;
import i.a.e1.h.c.q;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UnicastSubject.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class j<T> extends i<T> {
    public final i.a.e1.h.g.c<T> b;
    public final AtomicReference<p0<? super T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<Runnable> f28030d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28031e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f28032f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f28033g;

    /* renamed from: h  reason: collision with root package name */
    public Throwable f28034h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f28035i;

    /* renamed from: j  reason: collision with root package name */
    public final i.a.e1.h.e.b<T> f28036j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f28037k;

    /* compiled from: UnicastSubject.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class a extends i.a.e1.h.e.b<T> {
        private static final long serialVersionUID = 7926949470189395511L;
        public final /* synthetic */ j this$0;

        public a(final j this$0) {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }
    }

    public j(int capacityHint, Runnable onTerminate, boolean delayError) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> j<T> E8() {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> j<T> F8(int capacityHint) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> j<T> G8(int capacityHint, @i.a.e1.b.f Runnable onTerminate) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> j<T> H8(int capacityHint, @i.a.e1.b.f Runnable onTerminate, boolean delayError) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> j<T> I8(boolean delayError) {
    }

    @Override // i.a.e1.o.i
    @i.a.e1.b.d
    public boolean A8() {
    }

    @Override // i.a.e1.o.i
    @i.a.e1.b.d
    public boolean B8() {
    }

    @Override // i.a.e1.o.i
    @i.a.e1.b.d
    public boolean C8() {
    }

    public void J8() {
    }

    public void K8() {
    }

    public void L8(p0<? super T> a2) {
    }

    public void M8(p0<? super T> a2) {
    }

    public void N8(p0<? super T> a2) {
    }

    public boolean O8(final q<T> q, p0<? super T> a2) {
    }

    @Override // i.a.e1.c.i0
    public void c6(p0<? super T> observer) {
    }

    @Override // i.a.e1.c.p0
    public void onComplete() {
    }

    @Override // i.a.e1.c.p0
    public void onError(Throwable t) {
    }

    @Override // i.a.e1.c.p0
    public void onNext(T t) {
    }

    @Override // i.a.e1.c.p0
    public void onSubscribe(i.a.e1.d.f d2) {
    }

    @Override // i.a.e1.o.i
    @i.a.e1.b.g
    @i.a.e1.b.d
    public Throwable z8() {
    }
}
