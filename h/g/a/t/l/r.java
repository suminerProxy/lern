package h.g.a.t.l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: ViewTarget.java */
@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class r<T extends View, Z> extends h.g.a.t.l.b<Z> {

    /* renamed from: h  reason: collision with root package name */
    private static final String f17231h = "ViewTarget";

    /* renamed from: i  reason: collision with root package name */
    private static boolean f17232i;

    /* renamed from: j  reason: collision with root package name */
    private static int f17233j;
    public final T c;

    /* renamed from: d  reason: collision with root package name */
    private final b f17234d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private View.OnAttachStateChangeListener f17235e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17236f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f17237g;

    /* compiled from: ViewTarget.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ r b;

        public a(r rVar) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewTarget.java */
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        private static final int f17238e = 0;
        @Nullable
        @VisibleForTesting

        /* renamed from: f  reason: collision with root package name */
        public static Integer f17239f;

        /* renamed from: a  reason: collision with root package name */
        private final View f17240a;
        private final List<o> b;
        public boolean c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        private a f17241d;

        /* compiled from: ViewTarget.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<b> b;

            public a(@NonNull b bVar) {
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
            }
        }

        public b(@NonNull View view) {
        }

        private static int c(@NonNull Context context) {
        }

        private int e(int i2, int i3, int i4) {
        }

        private int f() {
        }

        private int g() {
        }

        private boolean h(int i2) {
        }

        private boolean i(int i2, int i3) {
        }

        private void j(int i2, int i3) {
        }

        public void a() {
        }

        public void b() {
        }

        public void d(@NonNull o oVar) {
        }

        public void k(@NonNull o oVar) {
        }
    }

    public r(@NonNull T t) {
    }

    @Nullable
    private Object c() {
    }

    private void d() {
    }

    private void e() {
    }

    private void h(@Nullable Object obj) {
    }

    @Deprecated
    public static void i(int i2) {
    }

    @NonNull
    public final r<T, Z> b() {
    }

    public void f() {
    }

    public void g() {
    }

    @Override // h.g.a.t.l.b, h.g.a.t.l.p
    @Nullable
    public h.g.a.t.e getRequest() {
    }

    @Override // h.g.a.t.l.p
    @CallSuper
    public void getSize(@NonNull o oVar) {
    }

    @NonNull
    public T getView() {
    }

    @NonNull
    public final r<T, Z> j() {
    }

    @Override // h.g.a.t.l.b, h.g.a.t.l.p
    @CallSuper
    public void onLoadCleared(@Nullable Drawable drawable) {
    }

    @Override // h.g.a.t.l.b, h.g.a.t.l.p
    @CallSuper
    public void onLoadStarted(@Nullable Drawable drawable) {
    }

    @Override // h.g.a.t.l.p
    @CallSuper
    public void removeCallback(@NonNull o oVar) {
    }

    @Override // h.g.a.t.l.b, h.g.a.t.l.p
    public void setRequest(@Nullable h.g.a.t.e eVar) {
    }

    public String toString() {
    }

    @Deprecated
    public r(@NonNull T t, boolean z) {
    }
}
