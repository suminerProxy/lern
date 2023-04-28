package h.u.a.u.f4;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: BackgroundExecutor.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f24659a = "BackgroundExecutor";
    public static final Executor b = null;
    private static Executor c;

    /* renamed from: d  reason: collision with root package name */
    private static final List<a> f24660d = null;

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadLocal<String> f24661e = null;

    /* compiled from: BackgroundExecutor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static abstract class a implements Runnable {
        private String b;
        private long c;

        /* renamed from: d  reason: collision with root package name */
        private long f24662d;

        /* renamed from: e  reason: collision with root package name */
        private String f24663e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f24664f;

        /* renamed from: g  reason: collision with root package name */
        private Future<?> f24665g;

        /* renamed from: h  reason: collision with root package name */
        private AtomicBoolean f24666h;

        public a(String str, long j2, String str2) {
        }

        public static /* synthetic */ String a(a aVar) {
        }

        public static /* synthetic */ boolean b(a aVar) {
        }

        public static /* synthetic */ boolean c(a aVar, boolean z) {
        }

        public static /* synthetic */ long d(a aVar) {
        }

        public static /* synthetic */ String e(a aVar) {
        }

        public static /* synthetic */ AtomicBoolean f(a aVar) {
        }

        public static /* synthetic */ Future g(a aVar) {
        }

        public static /* synthetic */ Future h(a aVar, Future future) {
        }

        public static /* synthetic */ void i(a aVar) {
        }

        private void k() {
        }

        public abstract void j();

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private d() {
    }

    public static /* synthetic */ ThreadLocal a() {
    }

    public static /* synthetic */ List b() {
    }

    public static /* synthetic */ a c(String str) {
    }

    public static synchronized void d(String str, boolean z) {
    }

    private static Future<?> e(Runnable runnable, long j2) {
    }

    public static synchronized void f(a aVar) {
    }

    private static boolean g(String str) {
    }

    private static a h(String str) {
    }
}
