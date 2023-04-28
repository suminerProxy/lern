package i.a.e1.h.d;

import i.a.e1.c.i0;
import i.a.e1.c.p0;
import java.util.Iterator;
import java.util.stream.Stream;

/* compiled from: ObservableFromStream.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class v<T> extends i0<T> {
    public final Stream<T> b;

    /* compiled from: ObservableFromStream.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements i.a.e1.h.c.l<T> {
        public final p0<? super T> b;
        public Iterator<T> c;

        /* renamed from: d  reason: collision with root package name */
        public AutoCloseable f26802d;

        /* renamed from: e  reason: collision with root package name */
        public volatile boolean f26803e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f26804f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f26805g;

        public a(p0<? super T> downstream, Iterator<T> iterator, AutoCloseable closeable) {
        }

        public void a() {
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
        public boolean offer(@i.a.e1.b.f T value) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }

        @Override // i.a.e1.h.c.q
        public boolean offer(@i.a.e1.b.f T v1, @i.a.e1.b.f T v2) {
        }
    }

    public v(Stream<T> stream) {
    }

    public static <T> void A8(p0<? super T> observer, Stream<T> stream) {
    }

    public static void z8(AutoCloseable c) {
    }

    @Override // i.a.e1.c.i0
    public void c6(p0<? super T> observer) {
    }
}
