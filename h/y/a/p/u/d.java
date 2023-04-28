package h.y.a.p.u;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* compiled from: HandlerBanner.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Handler.Callback f26505a;
    private final b b;
    private Lock c;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    public final a f26506d;

    /* compiled from: HandlerBanner.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public a f26507a;
        @Nullable
        public a b;
        @NonNull
        public final Runnable c;
        @NonNull

        /* renamed from: d  reason: collision with root package name */
        public final c f26508d;
        @NonNull

        /* renamed from: e  reason: collision with root package name */
        public Lock f26509e;

        public a(@NonNull Lock lock, @NonNull Runnable runnable) {
        }

        public void a(@NonNull a aVar) {
        }

        public c b() {
        }

        @Nullable
        public c c(Runnable runnable) {
        }
    }

    /* compiled from: HandlerBanner.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class c implements Runnable {
        private final WeakReference<Runnable> b;
        private final WeakReference<a> c;

        public c(WeakReference<Runnable> weakReference, WeakReference<a> weakReference2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public d() {
    }

    private c u(@NonNull Runnable runnable) {
    }

    public final Looper a() {
    }

    public final boolean b(int i2) {
    }

    public final boolean c(int i2, Object obj) {
    }

    public final boolean d(@NonNull Runnable runnable) {
    }

    public final boolean e(Runnable runnable) {
    }

    public final boolean f(@NonNull Runnable runnable, long j2) {
    }

    public final boolean g(Runnable runnable, Object obj, long j2) {
    }

    public final boolean h(Runnable runnable, long j2) {
    }

    public final void i(Runnable runnable) {
    }

    public final void j(Runnable runnable, Object obj) {
    }

    public final void k(Object obj) {
    }

    public final void l(int i2) {
    }

    public final void m(int i2, Object obj) {
    }

    public final boolean n(int i2) {
    }

    public final boolean o(int i2, long j2) {
    }

    public final boolean p(int i2, long j2) {
    }

    public final boolean q(Message message) {
    }

    public final boolean r(Message message) {
    }

    public boolean s(Message message, long j2) {
    }

    public final boolean t(Message message, long j2) {
    }

    /* compiled from: HandlerBanner.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<Handler.Callback> f26510a;

        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
        }

        public b(WeakReference<Handler.Callback> weakReference) {
        }

        public b(Looper looper) {
        }

        public b(Looper looper, WeakReference<Handler.Callback> weakReference) {
        }
    }

    public d(@Nullable Handler.Callback callback) {
    }

    public d(@NonNull Looper looper) {
    }

    public d(@NonNull Looper looper, @NonNull Handler.Callback callback) {
    }
}
