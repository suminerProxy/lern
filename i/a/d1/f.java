package i.a.d1;

import i.a.j0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ReplayProcessor.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class f<T> extends i.a.d1.c<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final Object[] f26686f = null;

    /* renamed from: g  reason: collision with root package name */
    public static final c[] f26687g = null;

    /* renamed from: h  reason: collision with root package name */
    public static final c[] f26688h = null;
    public final b<T> c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f26689d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<c<T>[]> f26690e;

    /* compiled from: ReplayProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final T value;

        public a(T t) {
        }
    }

    /* compiled from: ReplayProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface b<T> {
        void a(c<T> cVar);

        void complete();

        void error(Throwable th);

        Throwable getError();

        @i.a.t0.g
        T getValue();

        T[] getValues(T[] tArr);

        boolean isDone();

        void next(T t);

        int size();

        void trimHead();
    }

    /* compiled from: ReplayProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 466549804534799122L;
        public volatile boolean cancelled;
        public final Subscriber<? super T> downstream;
        public long emitted;
        public Object index;
        public final AtomicLong requested;
        public final f<T> state;

        public c(Subscriber<? super T> subscriber, f<T> fVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    /* compiled from: ReplayProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f26691a;
        public final long b;
        public final TimeUnit c;

        /* renamed from: d  reason: collision with root package name */
        public final j0 f26692d;

        /* renamed from: e  reason: collision with root package name */
        public int f26693e;

        /* renamed from: f  reason: collision with root package name */
        public volatile C0428f<T> f26694f;

        /* renamed from: g  reason: collision with root package name */
        public C0428f<T> f26695g;

        /* renamed from: h  reason: collision with root package name */
        public Throwable f26696h;

        /* renamed from: i  reason: collision with root package name */
        public volatile boolean f26697i;

        public d(int i2, long j2, TimeUnit timeUnit, j0 j0Var) {
        }

        @Override // i.a.d1.f.b
        public void a(c<T> cVar) {
        }

        public C0428f<T> b() {
        }

        public int c(C0428f<T> c0428f) {
        }

        @Override // i.a.d1.f.b
        public void complete() {
        }

        public void d() {
        }

        public void e() {
        }

        @Override // i.a.d1.f.b
        public void error(Throwable th) {
        }

        @Override // i.a.d1.f.b
        public Throwable getError() {
        }

        @Override // i.a.d1.f.b
        @i.a.t0.g
        public T getValue() {
        }

        @Override // i.a.d1.f.b
        public T[] getValues(T[] tArr) {
        }

        @Override // i.a.d1.f.b
        public boolean isDone() {
        }

        @Override // i.a.d1.f.b
        public void next(T t) {
        }

        @Override // i.a.d1.f.b
        public int size() {
        }

        @Override // i.a.d1.f.b
        public void trimHead() {
        }
    }

    /* compiled from: ReplayProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class e<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f26698a;
        public int b;
        public volatile a<T> c;

        /* renamed from: d  reason: collision with root package name */
        public a<T> f26699d;

        /* renamed from: e  reason: collision with root package name */
        public Throwable f26700e;

        /* renamed from: f  reason: collision with root package name */
        public volatile boolean f26701f;

        public e(int i2) {
        }

        @Override // i.a.d1.f.b
        public void a(c<T> cVar) {
        }

        public void b() {
        }

        @Override // i.a.d1.f.b
        public void complete() {
        }

        @Override // i.a.d1.f.b
        public void error(Throwable th) {
        }

        @Override // i.a.d1.f.b
        public Throwable getError() {
        }

        @Override // i.a.d1.f.b
        public T getValue() {
        }

        @Override // i.a.d1.f.b
        public T[] getValues(T[] tArr) {
        }

        @Override // i.a.d1.f.b
        public boolean isDone() {
        }

        @Override // i.a.d1.f.b
        public void next(T t) {
        }

        @Override // i.a.d1.f.b
        public int size() {
        }

        @Override // i.a.d1.f.b
        public void trimHead() {
        }
    }

    /* compiled from: ReplayProcessor.java */
    /* renamed from: i.a.d1.f$f  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class C0428f<T> extends AtomicReference<C0428f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final long time;
        public final T value;

        public C0428f(T t, long j2) {
        }
    }

    /* compiled from: ReplayProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class g<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<T> f26702a;
        public Throwable b;
        public volatile boolean c;

        /* renamed from: d  reason: collision with root package name */
        public volatile int f26703d;

        public g(int i2) {
        }

        @Override // i.a.d1.f.b
        public void a(c<T> cVar) {
        }

        @Override // i.a.d1.f.b
        public void complete() {
        }

        @Override // i.a.d1.f.b
        public void error(Throwable th) {
        }

        @Override // i.a.d1.f.b
        public Throwable getError() {
        }

        @Override // i.a.d1.f.b
        @i.a.t0.g
        public T getValue() {
        }

        @Override // i.a.d1.f.b
        public T[] getValues(T[] tArr) {
        }

        @Override // i.a.d1.f.b
        public boolean isDone() {
        }

        @Override // i.a.d1.f.b
        public void next(T t) {
        }

        @Override // i.a.d1.f.b
        public int size() {
        }

        @Override // i.a.d1.f.b
        public void trimHead() {
        }
    }

    public f(b<T> bVar) {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> f<T> P8() {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> f<T> Q8(int i2) {
    }

    public static <T> f<T> R8() {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> f<T> S8(int i2) {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> f<T> T8(long j2, TimeUnit timeUnit, j0 j0Var) {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> f<T> U8(long j2, TimeUnit timeUnit, j0 j0Var, int i2) {
    }

    @Override // i.a.d1.c
    @i.a.t0.g
    public Throwable I8() {
    }

    @Override // i.a.d1.c
    public boolean J8() {
    }

    @Override // i.a.d1.c
    public boolean K8() {
    }

    @Override // i.a.d1.c
    public boolean L8() {
    }

    public boolean N8(c<T> cVar) {
    }

    public void O8() {
    }

    public T V8() {
    }

    public Object[] W8() {
    }

    public T[] X8(T[] tArr) {
    }

    public boolean Y8() {
    }

    public void Z8(c<T> cVar) {
    }

    public int a9() {
    }

    public int b9() {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
    }

    @Override // org.reactivestreams.Subscriber, i.a.q
    public void onSubscribe(Subscription subscription) {
    }
}
