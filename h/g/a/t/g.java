package h.g.a.t;

import android.graphics.drawable.Drawable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import h.g.a.p.p.q;
import h.g.a.t.l.o;
import h.g.a.t.l.p;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestFutureTarget.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class g<R> implements d<R>, h<R> {

    /* renamed from: l  reason: collision with root package name */
    private static final a f17179l = null;
    private final int b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f17180d;

    /* renamed from: e  reason: collision with root package name */
    private final a f17181e;
    @Nullable
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    private R f17182f;
    @Nullable
    @GuardedBy("this")

    /* renamed from: g  reason: collision with root package name */
    private e f17183g;
    @GuardedBy("this")

    /* renamed from: h  reason: collision with root package name */
    private boolean f17184h;
    @GuardedBy("this")

    /* renamed from: i  reason: collision with root package name */
    private boolean f17185i;
    @GuardedBy("this")

    /* renamed from: j  reason: collision with root package name */
    private boolean f17186j;
    @Nullable
    @GuardedBy("this")

    /* renamed from: k  reason: collision with root package name */
    private q f17187k;

    /* compiled from: RequestFutureTarget.java */
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a {
        public void a(Object obj) {
        }

        public void b(Object obj, long j2) throws InterruptedException {
        }
    }

    public g(int i2, int i3) {
    }

    private synchronized R a(Long l2) throws ExecutionException, InterruptedException, TimeoutException {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
    }

    @Override // h.g.a.t.l.p
    @Nullable
    public synchronized e getRequest() {
    }

    @Override // h.g.a.t.l.p
    public void getSize(@NonNull o oVar) {
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
    }

    @Override // h.g.a.q.m
    public void onDestroy() {
    }

    @Override // h.g.a.t.l.p
    public void onLoadCleared(@Nullable Drawable drawable) {
    }

    @Override // h.g.a.t.l.p
    public synchronized void onLoadFailed(@Nullable Drawable drawable) {
    }

    @Override // h.g.a.t.l.p
    public void onLoadStarted(@Nullable Drawable drawable) {
    }

    @Override // h.g.a.t.l.p
    public synchronized void onResourceReady(@NonNull R r, @Nullable h.g.a.t.m.f<? super R> fVar) {
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
    public synchronized void setRequest(@Nullable e eVar) {
    }

    public g(int i2, int i3, boolean z, a aVar) {
    }

    @Override // h.g.a.t.h
    public synchronized boolean onLoadFailed(@Nullable q qVar, Object obj, p<R> pVar, boolean z) {
    }

    @Override // h.g.a.t.h
    public synchronized boolean onResourceReady(R r, Object obj, p<R> pVar, h.g.a.p.a aVar, boolean z) {
    }

    @Override // java.util.concurrent.Future
    public R get(long j2, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
    }
}
