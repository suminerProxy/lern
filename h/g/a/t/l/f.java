package h.g.a.t.l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: CustomViewTarget.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class f<T extends View, Z> implements p<Z> {

    /* renamed from: g  reason: collision with root package name */
    private static final String f17210g = "CustomViewTarget";
    @IdRes

    /* renamed from: h  reason: collision with root package name */
    private static final int f17211h = 0;
    private final b b;
    public final T c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private View.OnAttachStateChangeListener f17212d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f17213e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17214f;

    /* compiled from: CustomViewTarget.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ f b;

        public a(f fVar) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: CustomViewTarget.java */
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        private static final int f17215e = 0;
        @Nullable
        @VisibleForTesting

        /* renamed from: f  reason: collision with root package name */
        public static Integer f17216f;

        /* renamed from: a  reason: collision with root package name */
        private final View f17217a;
        private final List<o> b;
        public boolean c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        private a f17218d;

        /* compiled from: CustomViewTarget.java */
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

    public f(@NonNull T t) {
    }

    @Nullable
    private Object b() {
    }

    private void d() {
    }

    private void e() {
    }

    private void j(@Nullable Object obj) {
    }

    @NonNull
    public final f<T, Z> a() {
    }

    @NonNull
    public final T c() {
    }

    public abstract void f(@Nullable Drawable drawable);

    public void g(@Nullable Drawable drawable) {
    }

    @Override // h.g.a.t.l.p
    @Nullable
    public final h.g.a.t.e getRequest() {
    }

    @Override // h.g.a.t.l.p
    public final void getSize(@NonNull o oVar) {
    }

    public final void h() {
    }

    public final void i() {
    }

    @Deprecated
    public final f<T, Z> k(@IdRes int i2) {
    }

    @NonNull
    public final f<T, Z> l() {
    }

    @Override // h.g.a.q.m
    public void onDestroy() {
    }

    @Override // h.g.a.t.l.p
    public final void onLoadCleared(@Nullable Drawable drawable) {
    }

    @Override // h.g.a.t.l.p
    public final void onLoadStarted(@Nullable Drawable drawable) {
    }

    @Override // h.g.a.q.m
    public void onStart() {
    }

    @Override // h.g.a.q.m
    public void onStop() {
    }

    @Override // h.g.a.t.l.p
    public final void removeCallback(@NonNull o oVar) {
    }

    @Override // h.g.a.t.l.p
    public final void setRequest(@Nullable h.g.a.t.e eVar) {
    }

    public String toString() {
    }
}
