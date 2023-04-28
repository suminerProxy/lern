package i.a.e1.o;

import i.a.e1.c.p0;
import i.a.e1.c.q0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ReplaySubject.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class f<T> extends i<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final c[] f28020e = null;

    /* renamed from: f  reason: collision with root package name */
    public static final c[] f28021f = null;

    /* renamed from: g  reason: collision with root package name */
    private static final Object[] f28022g = null;
    public final b<T> b;
    public final AtomicReference<c<T>[]> c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28023d;

    /* compiled from: ReplaySubject.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final T value;

        public a(T value) {
        }
    }

    /* compiled from: ReplaySubject.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface b<T> {
        void add(T value);

        void addFinal(Object notificationLite);

        boolean compareAndSet(Object expected, Object next);

        Object get();

        @i.a.e1.b.g
        T getValue();

        T[] getValues(T[] array);

        void replay(c<T> rs);

        int size();

        void trimHead();
    }

    /* compiled from: ReplaySubject.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends AtomicInteger implements i.a.e1.d.f {
        private static final long serialVersionUID = 466549804534799122L;
        public volatile boolean cancelled;
        public final p0<? super T> downstream;
        public Object index;
        public final f<T> state;

        public c(p0<? super T> actual, f<T> state) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }
    }

    /* compiled from: ReplaySubject.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = -8056260896137901749L;
        public volatile boolean done;
        public volatile C0514f<Object> head;
        public final long maxAge;
        public final int maxSize;
        public final q0 scheduler;
        public int size;
        public C0514f<Object> tail;
        public final TimeUnit unit;

        public d(int maxSize, long maxAge, TimeUnit unit, q0 scheduler) {
        }

        @Override // i.a.e1.o.f.b
        public void add(T value) {
        }

        @Override // i.a.e1.o.f.b
        public void addFinal(Object notificationLite) {
        }

        public C0514f<Object> getHead() {
        }

        @Override // i.a.e1.o.f.b
        @i.a.e1.b.g
        public T getValue() {
        }

        @Override // i.a.e1.o.f.b
        public T[] getValues(T[] array) {
        }

        @Override // i.a.e1.o.f.b
        public void replay(c<T> rs) {
        }

        @Override // i.a.e1.o.f.b
        public int size() {
        }

        public void trim() {
        }

        public void trimFinal() {
        }

        @Override // i.a.e1.o.f.b
        public void trimHead() {
        }

        public int size(C0514f<Object> h2) {
        }
    }

    /* compiled from: ReplaySubject.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = 1107649250281456395L;
        public volatile boolean done;
        public volatile a<Object> head;
        public final int maxSize;
        public int size;
        public a<Object> tail;

        public e(int maxSize) {
        }

        @Override // i.a.e1.o.f.b
        public void add(T value) {
        }

        @Override // i.a.e1.o.f.b
        public void addFinal(Object notificationLite) {
        }

        @Override // i.a.e1.o.f.b
        @i.a.e1.b.g
        public T getValue() {
        }

        @Override // i.a.e1.o.f.b
        public T[] getValues(T[] array) {
        }

        @Override // i.a.e1.o.f.b
        public void replay(c<T> rs) {
        }

        @Override // i.a.e1.o.f.b
        public int size() {
        }

        public void trim() {
        }

        @Override // i.a.e1.o.f.b
        public void trimHead() {
        }
    }

    /* compiled from: ReplaySubject.java */
    /* renamed from: i.a.e1.o.f$f  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class C0514f<T> extends AtomicReference<C0514f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final long time;
        public final T value;

        public C0514f(T value, long time) {
        }
    }

    /* compiled from: ReplaySubject.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class g<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = -733876083048047795L;
        public final List<Object> buffer;
        public volatile boolean done;
        public volatile int size;

        public g(int capacityHint) {
        }

        @Override // i.a.e1.o.f.b
        public void add(T value) {
        }

        @Override // i.a.e1.o.f.b
        public void addFinal(Object notificationLite) {
        }

        @Override // i.a.e1.o.f.b
        @i.a.e1.b.g
        public T getValue() {
        }

        @Override // i.a.e1.o.f.b
        public T[] getValues(T[] array) {
        }

        @Override // i.a.e1.o.f.b
        public void replay(c<T> rs) {
        }

        @Override // i.a.e1.o.f.b
        public int size() {
        }

        @Override // i.a.e1.o.f.b
        public void trimHead() {
        }
    }

    public f(b<T> buffer) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> f<T> G8() {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> f<T> H8(int capacityHint) {
    }

    public static <T> f<T> I8() {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> f<T> J8(int maxSize) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> f<T> K8(long maxAge, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> f<T> L8(long maxAge, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler, int maxSize) {
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

    public boolean E8(c<T> rs) {
    }

    public void F8() {
    }

    @i.a.e1.b.g
    @i.a.e1.b.d
    public T M8() {
    }

    @i.a.e1.b.d
    public Object[] N8() {
    }

    @i.a.e1.b.d
    public T[] O8(T[] array) {
    }

    @i.a.e1.b.d
    public boolean P8() {
    }

    @i.a.e1.b.d
    public int Q8() {
    }

    public void R8(c<T> rs) {
    }

    @i.a.e1.b.d
    public int S8() {
    }

    public c<T>[] T8(Object terminalValue) {
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
