package h.g.a;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import h.g.a.t.l.o;
import h.g.a.t.l.p;
import java.util.List;
import java.util.Queue;

/* compiled from: ListPreloader.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class e<T> implements AbsListView.OnScrollListener {
    private final int b;
    private final d c;

    /* renamed from: d  reason: collision with root package name */
    private final k f16443d;

    /* renamed from: e  reason: collision with root package name */
    private final a<T> f16444e;

    /* renamed from: f  reason: collision with root package name */
    private final b<T> f16445f;

    /* renamed from: g  reason: collision with root package name */
    private int f16446g;

    /* renamed from: h  reason: collision with root package name */
    private int f16447h;

    /* renamed from: i  reason: collision with root package name */
    private int f16448i;

    /* renamed from: j  reason: collision with root package name */
    private int f16449j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f16450k;

    /* compiled from: ListPreloader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface a<U> {
        @NonNull
        List<U> a(int i2);

        @Nullable
        j<?> b(@NonNull U u);
    }

    /* compiled from: ListPreloader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface b<T> {
        @Nullable
        int[] a(@NonNull T t, int i2, int i3);
    }

    /* compiled from: ListPreloader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class c implements p<Object> {
        public int b;
        public int c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        private h.g.a.t.e f16451d;

        @Override // h.g.a.t.l.p
        @Nullable
        public h.g.a.t.e getRequest() {
        }

        @Override // h.g.a.t.l.p
        public void getSize(@NonNull o oVar) {
        }

        @Override // h.g.a.q.m
        public void onDestroy() {
        }

        @Override // h.g.a.t.l.p
        public void onLoadCleared(@Nullable Drawable drawable) {
        }

        @Override // h.g.a.t.l.p
        public void onLoadFailed(@Nullable Drawable drawable) {
        }

        @Override // h.g.a.t.l.p
        public void onLoadStarted(@Nullable Drawable drawable) {
        }

        @Override // h.g.a.t.l.p
        public void onResourceReady(@NonNull Object obj, @Nullable h.g.a.t.m.f<? super Object> fVar) {
        }

        @Override // h.g.a.q.m
        public void onStart() {
        }

        @Override // h.g.a.q.m
        public void onStop() {
        }

        @Override // h.g.a.t.l.p
        public void removeCallback(@NonNull o oVar) {
        }

        @Override // h.g.a.t.l.p
        public void setRequest(@Nullable h.g.a.t.e eVar) {
        }
    }

    /* compiled from: ListPreloader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final Queue<c> f16452a;

        public d(int i2) {
        }

        public c a(int i2, int i3) {
        }
    }

    public e(@NonNull k kVar, @NonNull a<T> aVar, @NonNull b<T> bVar, int i2) {
    }

    private void a() {
    }

    private void b(int i2, int i3) {
    }

    private void c(int i2, boolean z) {
    }

    private void d(List<T> list, int i2, boolean z) {
    }

    private void e(@Nullable T t, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i2) {
    }
}
