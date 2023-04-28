package h.g.a.p.p;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import h.g.a.p.p.p;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* compiled from: ActiveResources.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16627a;
    private final Executor b;
    @VisibleForTesting
    public final Map<h.g.a.p.g, d> c;

    /* renamed from: d  reason: collision with root package name */
    private final ReferenceQueue<p<?>> f16628d;

    /* renamed from: e  reason: collision with root package name */
    private p.a f16629e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f16630f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private volatile c f16631g;

    /* compiled from: ActiveResources.java */
    /* renamed from: h.g.a.p.p.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ThreadFactoryC0309a implements ThreadFactory {

        /* compiled from: ActiveResources.java */
        /* renamed from: h.g.a.p.p.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class RunnableC0310a implements Runnable {
            public final /* synthetic */ Runnable b;
            public final /* synthetic */ ThreadFactoryC0309a c;

            public RunnableC0310a(ThreadFactoryC0309a threadFactoryC0309a, Runnable runnable) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
        }
    }

    /* compiled from: ActiveResources.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b implements Runnable {
        public final /* synthetic */ a b;

        public b(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ActiveResources.java */
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface c {
        void a();
    }

    /* compiled from: ActiveResources.java */
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class d extends WeakReference<p<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final h.g.a.p.g f16632a;
        public final boolean b;
        @Nullable
        public v<?> c;

        public d(@NonNull h.g.a.p.g gVar, @NonNull p<?> pVar, @NonNull ReferenceQueue<? super p<?>> referenceQueue, boolean z) {
        }

        public void a() {
        }
    }

    public a(boolean z) {
    }

    public synchronized void a(h.g.a.p.g gVar, p<?> pVar) {
    }

    public void b() {
    }

    public void c(@NonNull d dVar) {
    }

    public synchronized void d(h.g.a.p.g gVar) {
    }

    @Nullable
    public synchronized p<?> e(h.g.a.p.g gVar) {
    }

    @VisibleForTesting
    public void f(c cVar) {
    }

    public void g(p.a aVar) {
    }

    @VisibleForTesting
    public void h() {
    }

    @VisibleForTesting
    public a(boolean z, Executor executor) {
    }
}
