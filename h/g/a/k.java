package h.g.a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import h.g.a.q.c;
import h.g.a.q.m;
import h.g.a.q.q;
import h.g.a.q.r;
import h.g.a.q.t;
import h.g.a.t.l.p;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: RequestManager.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class k implements ComponentCallbacks2, m, g<j<Drawable>> {

    /* renamed from: m  reason: collision with root package name */
    private static final RequestOptions f16480m = null;

    /* renamed from: n  reason: collision with root package name */
    private static final RequestOptions f16481n = null;

    /* renamed from: o  reason: collision with root package name */
    private static final RequestOptions f16482o = null;
    public final Glide b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final h.g.a.q.l f16483d;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    private final r f16484e;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    private final q f16485f;
    @GuardedBy("this")

    /* renamed from: g  reason: collision with root package name */
    private final t f16486g;

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f16487h;

    /* renamed from: i  reason: collision with root package name */
    private final h.g.a.q.c f16488i;

    /* renamed from: j  reason: collision with root package name */
    private final CopyOnWriteArrayList<h.g.a.t.h<Object>> f16489j;
    @GuardedBy("this")

    /* renamed from: k  reason: collision with root package name */
    private RequestOptions f16490k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f16491l;

    /* compiled from: RequestManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements Runnable {
        public final /* synthetic */ k b;

        public a(k kVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: RequestManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class b extends h.g.a.t.l.f<View, Object> {
        public b(@NonNull View view) {
        }

        @Override // h.g.a.t.l.f
        public void f(@Nullable Drawable drawable) {
        }

        @Override // h.g.a.t.l.p
        public void onLoadFailed(@Nullable Drawable drawable) {
        }

        @Override // h.g.a.t.l.p
        public void onResourceReady(@NonNull Object obj, @Nullable h.g.a.t.m.f<? super Object> fVar) {
        }
    }

    /* compiled from: RequestManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class c implements c.a {
        @GuardedBy("RequestManager.this")

        /* renamed from: a  reason: collision with root package name */
        private final r f16492a;
        public final /* synthetic */ k b;

        public c(@NonNull k kVar, r rVar) {
        }

        @Override // h.g.a.q.c.a
        public void a(boolean z) {
        }
    }

    public k(@NonNull Glide glide, @NonNull h.g.a.q.l lVar, @NonNull q qVar, @NonNull Context context) {
    }

    private void S(@NonNull p<?> pVar) {
    }

    private synchronized void T(@NonNull RequestOptions requestOptions) {
    }

    @NonNull
    @CheckResult
    public j<Drawable> A(@Nullable Uri uri) {
    }

    @NonNull
    @CheckResult
    public j<Drawable> B(@Nullable File file) {
    }

    @NonNull
    @CheckResult
    public j<Drawable> C(@Nullable @DrawableRes @RawRes Integer num) {
    }

    @NonNull
    @CheckResult
    public j<Drawable> D(@Nullable Object obj) {
    }

    @NonNull
    @CheckResult
    public j<Drawable> E(@Nullable String str) {
    }

    @CheckResult
    @Deprecated
    public j<Drawable> F(@Nullable URL url) {
    }

    @NonNull
    @CheckResult
    public j<Drawable> G(@Nullable byte[] bArr) {
    }

    public synchronized void H() {
    }

    public synchronized void I() {
    }

    public synchronized void J() {
    }

    public synchronized void K() {
    }

    public synchronized void L() {
    }

    public synchronized void M() {
    }

    @NonNull
    public synchronized k N(@NonNull RequestOptions requestOptions) {
    }

    public void O(boolean z) {
    }

    public synchronized void P(@NonNull RequestOptions requestOptions) {
    }

    public synchronized void Q(@NonNull p<?> pVar, @NonNull h.g.a.t.e eVar) {
    }

    public synchronized boolean R(@NonNull p<?> pVar) {
    }

    @Override // h.g.a.g
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ j<Drawable> a(@Nullable String str) {
    }

    @Override // h.g.a.g
    @CheckResult
    @Deprecated
    public /* bridge */ /* synthetic */ j<Drawable> b(@Nullable URL url) {
    }

    @Override // h.g.a.g
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ j<Drawable> c(@Nullable Uri uri) {
    }

    @Override // h.g.a.g
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ j<Drawable> d(@Nullable byte[] bArr) {
    }

    @Override // h.g.a.g
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ j<Drawable> e(@Nullable File file) {
    }

    @Override // h.g.a.g
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ j<Drawable> f(@Nullable Drawable drawable) {
    }

    @Override // h.g.a.g
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ j<Drawable> g(@Nullable Bitmap bitmap) {
    }

    @Override // h.g.a.g
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ j<Drawable> h(@Nullable Object obj) {
    }

    @Override // h.g.a.g
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ j<Drawable> i(@Nullable @DrawableRes @RawRes Integer num) {
    }

    public k j(h.g.a.t.h<Object> hVar) {
    }

    @NonNull
    public synchronized k k(@NonNull RequestOptions requestOptions) {
    }

    @NonNull
    @CheckResult
    public <ResourceType> j<ResourceType> l(@NonNull Class<ResourceType> cls) {
    }

    @NonNull
    @CheckResult
    public j<Bitmap> m() {
    }

    @NonNull
    @CheckResult
    public j<Drawable> n() {
    }

    @NonNull
    @CheckResult
    public j<File> o() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // h.g.a.q.m
    public synchronized void onDestroy() {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // h.g.a.q.m
    public synchronized void onStart() {
    }

    @Override // h.g.a.q.m
    public synchronized void onStop() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
    }

    @NonNull
    @CheckResult
    public j<h.g.a.p.r.h.c> p() {
    }

    public void q(@NonNull View view) {
    }

    public void r(@Nullable p<?> pVar) {
    }

    @NonNull
    @CheckResult
    public j<File> s(@Nullable Object obj) {
    }

    @NonNull
    @CheckResult
    public j<File> t() {
    }

    public synchronized String toString() {
    }

    public List<h.g.a.t.h<Object>> u() {
    }

    public synchronized RequestOptions v() {
    }

    @NonNull
    public <T> l<?, T> w(Class<T> cls) {
    }

    public synchronized boolean x() {
    }

    @NonNull
    @CheckResult
    public j<Drawable> y(@Nullable Bitmap bitmap) {
    }

    @NonNull
    @CheckResult
    public j<Drawable> z(@Nullable Drawable drawable) {
    }

    public k(Glide glide, h.g.a.q.l lVar, q qVar, r rVar, h.g.a.q.d dVar, Context context) {
    }
}
