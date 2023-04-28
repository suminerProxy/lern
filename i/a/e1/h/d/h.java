package i.a.e1.h.d;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import org.reactivestreams.Subscriber;

/* compiled from: FlowableFromStream.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h<T> extends i.a.e1.c.s<T> {
    public final Stream<T> c;

    /* compiled from: FlowableFromStream.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class a<T> extends AtomicLong implements i.a.e1.h.c.n<T> {
        private static final long serialVersionUID = -9082954702547571853L;
        public volatile boolean cancelled;
        public AutoCloseable closeable;
        public Iterator<T> iterator;
        public boolean once;

        public a(Iterator<T> iterator, AutoCloseable closeable) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
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

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }

        public abstract void run(long n2);

        @Override // i.a.e1.h.c.q
        public boolean offer(@i.a.e1.b.f T v1, @i.a.e1.b.f T v2) {
        }
    }

    /* compiled from: FlowableFromStream.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends a<T> {
        private static final long serialVersionUID = -9082954702547571853L;
        public final i.a.e1.h.c.c<? super T> downstream;

        public b(i.a.e1.h.c.c<? super T> downstream, Iterator<T> iterator, AutoCloseable closeable) {
        }

        @Override // i.a.e1.h.d.h.a
        public void run(long n2) {
        }
    }

    /* compiled from: FlowableFromStream.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends a<T> {
        private static final long serialVersionUID = -9082954702547571853L;
        public final Subscriber<? super T> downstream;

        public c(Subscriber<? super T> downstream, Iterator<T> iterator, AutoCloseable closeable) {
        }

        @Override // i.a.e1.h.d.h.a
        public void run(long n2) {
        }
    }

    public h(Stream<T> stream) {
    }

    public static void e9(AutoCloseable c2) {
    }

    public static <T> void f9(Subscriber<? super T> s, Stream<T> stream) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
