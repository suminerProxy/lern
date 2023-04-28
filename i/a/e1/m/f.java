package i.a.e1.m;

import i.a.e1.c.q0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ReplayProcessor.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class f<T> extends i.a.e1.m.c<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final Object[] f27952f = null;

    /* renamed from: g  reason: collision with root package name */
    public static final c[] f27953g = null;

    /* renamed from: h  reason: collision with root package name */
    public static final c[] f27954h = null;
    public final b<T> c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f27955d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<c<T>[]> f27956e;

    /* compiled from: ReplayProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final T value;

        public a(T value) {
        }
    }

    /* compiled from: ReplayProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface b<T> {
        void a(c<T> rs);

        void complete();

        void error(Throwable ex);

        Throwable getError();

        @i.a.e1.b.g
        T getValue();

        T[] getValues(T[] array);

        boolean isDone();

        void next(T value);

        int size();

        void trimHead();
    }

    /* compiled from: ReplayProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 466549804534799122L;
        public volatile boolean cancelled;
        public final Subscriber<? super T> downstream;
        public long emitted;
        public Object index;
        public final AtomicLong requested;
        public final f<T> state;

        public c(Subscriber<? super T> actual, f<T> state) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    /* compiled from: ReplayProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f27957a;
        public final long b;
        public final TimeUnit c;

        /* renamed from: d  reason: collision with root package name */
        public final q0 f27958d;

        /* renamed from: e  reason: collision with root package name */
        public int f27959e;

        /* renamed from: f  reason: collision with root package name */
        public volatile C0510f<T> f27960f;

        /* renamed from: g  reason: collision with root package name */
        public C0510f<T> f27961g;

        /* renamed from: h  reason: collision with root package name */
        public Throwable f27962h;

        /* renamed from: i  reason: collision with root package name */
        public volatile boolean f27963i;

        public d(int maxSize, long maxAge, TimeUnit unit, q0 scheduler) {
        }

        @Override // i.a.e1.m.f.b
        public void a(c<T> rs) {
        }

        public C0510f<T> b() {
        }

        public int c(C0510f<T> h2) {
        }

        @Override // i.a.e1.m.f.b
        public void complete() {
        }

        public void d() {
        }

        public void e() {
        }

        @Override // i.a.e1.m.f.b
        public void error(Throwable ex) {
        }

        @Override // i.a.e1.m.f.b
        public Throwable getError() {
        }

        @Override // i.a.e1.m.f.b
        @i.a.e1.b.g
        public T getValue() {
        }

        @Override // i.a.e1.m.f.b
        public T[] getValues(T[] array) {
        }

        @Override // i.a.e1.m.f.b
        public boolean isDone() {
        }

        @Override // i.a.e1.m.f.b
        public void next(T value) {
        }

        @Override // i.a.e1.m.f.b
        public int size() {
        }

        @Override // i.a.e1.m.f.b
        public void trimHead() {
        }
    }

    /* compiled from: ReplayProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f27964a;
        public int b;
        public volatile a<T> c;

        /* renamed from: d  reason: collision with root package name */
        public a<T> f27965d;

        /* renamed from: e  reason: collision with root package name */
        public Throwable f27966e;

        /* renamed from: f  reason: collision with root package name */
        public volatile boolean f27967f;

        public e(int maxSize) {
        }

        @Override // i.a.e1.m.f.b
        public void a(c<T> rs) {
        }

        public void b() {
        }

        @Override // i.a.e1.m.f.b
        public void complete() {
        }

        @Override // i.a.e1.m.f.b
        public void error(Throwable ex) {
        }

        @Override // i.a.e1.m.f.b
        public Throwable getError() {
        }

        @Override // i.a.e1.m.f.b
        public T getValue() {
        }

        @Override // i.a.e1.m.f.b
        public T[] getValues(T[] array) {
        }

        @Override // i.a.e1.m.f.b
        public boolean isDone() {
        }

        @Override // i.a.e1.m.f.b
        public void next(T value) {
        }

        @Override // i.a.e1.m.f.b
        public int size() {
        }

        @Override // i.a.e1.m.f.b
        public void trimHead() {
        }
    }

    /* compiled from: ReplayProcessor.java */
    /* renamed from: i.a.e1.m.f$f  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class C0510f<T> extends AtomicReference<C0510f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final long time;
        public final T value;

        public C0510f(T value, long time) {
        }
    }

    /* compiled from: ReplayProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class g<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<T> f27968a;
        public Throwable b;
        public volatile boolean c;

        /* renamed from: d  reason: collision with root package name */
        public volatile int f27969d;

        public g(int capacityHint) {
        }

        @Override // i.a.e1.m.f.b
        public void a(c<T> rs) {
        }

        @Override // i.a.e1.m.f.b
        public void complete() {
        }

        @Override // i.a.e1.m.f.b
        public void error(Throwable ex) {
        }

        @Override // i.a.e1.m.f.b
        public Throwable getError() {
        }

        @Override // i.a.e1.m.f.b
        @i.a.e1.b.g
        public T getValue() {
        }

        @Override // i.a.e1.m.f.b
        public T[] getValues(T[] array) {
        }

        @Override // i.a.e1.m.f.b
        public boolean isDone() {
        }

        @Override // i.a.e1.m.f.b
        public void next(T value) {
        }

        @Override // i.a.e1.m.f.b
        public int size() {
        }

        @Override // i.a.e1.m.f.b
        public void trimHead() {
        }
    }

    public f(b<T> buffer) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> f<T> l9() {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> f<T> m9(int capacityHint) {
    }

    @i.a.e1.b.d
    public static <T> f<T> n9() {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> f<T> o9(int maxSize) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> f<T> p9(long maxAge, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> f<T> q9(long maxAge, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler, int maxSize) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }

    @Override // i.a.e1.m.c
    @i.a.e1.b.g
    @i.a.e1.b.d
    public Throwable e9() {
    }

    @Override // i.a.e1.m.c
    @i.a.e1.b.d
    public boolean f9() {
    }

    @Override // i.a.e1.m.c
    @i.a.e1.b.d
    public boolean g9() {
    }

    @Override // i.a.e1.m.c
    @i.a.e1.b.d
    public boolean h9() {
    }

    public boolean j9(c<T> rs) {
    }

    public void k9() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t) {
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
    }

    @Override // org.reactivestreams.Subscriber, i.a.q
    public void onSubscribe(Subscription s) {
    }

    @i.a.e1.b.d
    public T r9() {
    }

    @i.a.e1.b.d
    public Object[] s9() {
    }

    @i.a.e1.b.d
    public T[] t9(T[] array) {
    }

    @i.a.e1.b.d
    public boolean u9() {
    }

    public void v9(c<T> rs) {
    }

    @i.a.e1.b.d
    public int w9() {
    }

    @i.a.e1.b.d
    public int x9() {
    }
}
