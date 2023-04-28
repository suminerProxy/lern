package h.g.a.t;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import h.g.a.p.p.k;
import h.g.a.p.p.q;
import h.g.a.p.p.v;
import h.g.a.t.l.o;
import h.g.a.t.l.p;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: SingleRequest.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class j<R> implements e, o, i {
    private static final String D = "Request";
    private static final String E = "Glide";
    private static final boolean F = false;
    @GuardedBy("requestLock")
    private int A;
    @GuardedBy("requestLock")
    private boolean B;
    @Nullable
    private RuntimeException C;
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final String f17188a;
    private final h.g.a.v.p.c b;
    private final Object c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private final h<R> f17189d;

    /* renamed from: e  reason: collision with root package name */
    private final f f17190e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f17191f;

    /* renamed from: g  reason: collision with root package name */
    private final h.g.a.c f17192g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private final Object f17193h;

    /* renamed from: i  reason: collision with root package name */
    private final Class<R> f17194i;

    /* renamed from: j  reason: collision with root package name */
    private final h.g.a.t.a<?> f17195j;

    /* renamed from: k  reason: collision with root package name */
    private final int f17196k;

    /* renamed from: l  reason: collision with root package name */
    private final int f17197l;

    /* renamed from: m  reason: collision with root package name */
    private final h.g.a.h f17198m;

    /* renamed from: n  reason: collision with root package name */
    private final p<R> f17199n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private final List<h<R>> f17200o;

    /* renamed from: p  reason: collision with root package name */
    private final h.g.a.t.m.g<? super R> f17201p;
    private final Executor q;
    @GuardedBy("requestLock")
    private v<R> r;
    @GuardedBy("requestLock")
    private k.d s;
    @GuardedBy("requestLock")
    private long t;
    private volatile h.g.a.p.p.k u;
    @GuardedBy("requestLock")
    private a v;
    @Nullable
    @GuardedBy("requestLock")
    private Drawable w;
    @Nullable
    @GuardedBy("requestLock")
    private Drawable x;
    @Nullable
    @GuardedBy("requestLock")
    private Drawable y;
    @GuardedBy("requestLock")
    private int z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: SingleRequest.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a CLEARED = null;
        public static final a COMPLETE = null;
        public static final a FAILED = null;
        public static final a PENDING = null;
        public static final a RUNNING = null;
        public static final a WAITING_FOR_SIZE = null;

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    private j(Context context, h.g.a.c cVar, @NonNull Object obj, @Nullable Object obj2, Class<R> cls, h.g.a.t.a<?> aVar, int i2, int i3, h.g.a.h hVar, p<R> pVar, @Nullable h<R> hVar2, @Nullable List<h<R>> list, f fVar, h.g.a.p.p.k kVar, h.g.a.t.m.g<? super R> gVar, Executor executor) {
    }

    @GuardedBy("requestLock")
    private void i() {
    }

    @GuardedBy("requestLock")
    private boolean j() {
    }

    @GuardedBy("requestLock")
    private boolean k() {
    }

    @GuardedBy("requestLock")
    private boolean l() {
    }

    @GuardedBy("requestLock")
    private void m() {
    }

    @GuardedBy("requestLock")
    private Drawable n() {
    }

    @GuardedBy("requestLock")
    private Drawable o() {
    }

    @GuardedBy("requestLock")
    private Drawable p() {
    }

    @GuardedBy("requestLock")
    private boolean q() {
    }

    @GuardedBy("requestLock")
    private Drawable r(@DrawableRes int i2) {
    }

    private void s(String str) {
    }

    private static int t(int i2, float f2) {
    }

    @GuardedBy("requestLock")
    private void u() {
    }

    @GuardedBy("requestLock")
    private void v() {
    }

    public static <R> j<R> w(Context context, h.g.a.c cVar, Object obj, Object obj2, Class<R> cls, h.g.a.t.a<?> aVar, int i2, int i3, h.g.a.h hVar, p<R> pVar, h<R> hVar2, @Nullable List<h<R>> list, f fVar, h.g.a.p.p.k kVar, h.g.a.t.m.g<? super R> gVar, Executor executor) {
    }

    private void x(q qVar, int i2) {
    }

    @GuardedBy("requestLock")
    private void y(v<R> vVar, R r, h.g.a.p.a aVar, boolean z) {
    }

    @GuardedBy("requestLock")
    private void z() {
    }

    @Override // h.g.a.t.e
    public boolean a() {
    }

    @Override // h.g.a.t.i
    public void b(v<?> vVar, h.g.a.p.a aVar, boolean z) {
    }

    @Override // h.g.a.t.i
    public void c(q qVar) {
    }

    @Override // h.g.a.t.e
    public void clear() {
    }

    @Override // h.g.a.t.l.o
    public void d(int i2, int i3) {
    }

    @Override // h.g.a.t.e
    public boolean e() {
    }

    @Override // h.g.a.t.i
    public Object f() {
    }

    @Override // h.g.a.t.e
    public boolean g(e eVar) {
    }

    @Override // h.g.a.t.e
    public void h() {
    }

    @Override // h.g.a.t.e
    public boolean isComplete() {
    }

    @Override // h.g.a.t.e
    public boolean isRunning() {
    }

    @Override // h.g.a.t.e
    public void pause() {
    }
}
