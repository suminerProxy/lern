package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.request.RequestOptions;
import h.g.a.c;
import h.g.a.f;
import h.g.a.i;
import h.g.a.l;
import h.g.a.p.p.a0.b;
import h.g.a.p.p.a0.e;
import h.g.a.p.p.b0.j;
import h.g.a.p.p.d0.d;
import h.g.a.p.p.k;
import h.g.a.q.d;
import h.g.a.q.p;
import h.g.a.t.h;
import java.io.File;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Glide implements ComponentCallbacks2 {
    private static final String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
    private static final String TAG = "Glide";
    @GuardedBy("Glide.class")
    private static volatile Glide glide;
    private static volatile boolean isInitializing;
    private final b arrayPool;
    private final e bitmapPool;
    @Nullable
    @GuardedBy("this")
    private h.g.a.p.p.d0.b bitmapPreFiller;
    private final d connectivityMonitorFactory;
    private final a defaultRequestOptionsFactory;
    private final k engine;
    private final c glideContext;
    @GuardedBy("managers")
    private final List<h.g.a.k> managers;
    private final j memoryCache;
    private f memoryCategory;
    private final i registry;
    private final p requestManagerRetriever;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface a {
        @NonNull
        RequestOptions build();
    }

    public Glide(@NonNull Context context, @NonNull k kVar, @NonNull j jVar, @NonNull e eVar, @NonNull b bVar, @NonNull p pVar, @NonNull d dVar, int i2, @NonNull a aVar, @NonNull Map<Class<?>, l<?, ?>> map, @NonNull List<h<Object>> list, h.g.a.d dVar2) {
    }

    @GuardedBy("Glide.class")
    private static void checkAndInitializeGlide(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
    }

    @VisibleForTesting
    public static void enableHardwareBitmaps() {
    }

    @NonNull
    public static Glide get(@NonNull Context context) {
    }

    @Nullable
    private static GeneratedAppGlideModule getAnnotationGeneratedGlideModules(Context context) {
    }

    @Nullable
    public static File getPhotoCacheDir(@NonNull Context context) {
    }

    @NonNull
    private static p getRetriever(@Nullable Context context) {
    }

    @VisibleForTesting
    @Deprecated
    public static synchronized void init(Glide glide2) {
    }

    @GuardedBy("Glide.class")
    private static void initializeGlide(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
    }

    @VisibleForTesting
    public static void tearDown() {
    }

    private static void throwIncorrectGlideModule(Exception exc) {
    }

    @NonNull
    public static h.g.a.k with(@NonNull Context context) {
    }

    public void clearDiskCache() {
    }

    public void clearMemory() {
    }

    @NonNull
    public b getArrayPool() {
    }

    @NonNull
    public e getBitmapPool() {
    }

    public d getConnectivityMonitorFactory() {
    }

    @NonNull
    public Context getContext() {
    }

    @NonNull
    public c getGlideContext() {
    }

    @NonNull
    public i getRegistry() {
    }

    @NonNull
    public p getRequestManagerRetriever() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
    }

    public synchronized void preFillBitmapPool(@NonNull d.a... aVarArr) {
    }

    public void registerRequestManager(h.g.a.k kVar) {
    }

    public boolean removeFromManagers(@NonNull h.g.a.t.l.p<?> pVar) {
    }

    @NonNull
    public f setMemoryCategory(@NonNull f fVar) {
    }

    public void trimMemory(int i2) {
    }

    public void unregisterRequestManager(h.g.a.k kVar) {
    }

    @Nullable
    public static File getPhotoCacheDir(@NonNull Context context, @NonNull String str) {
    }

    @GuardedBy("Glide.class")
    private static void initializeGlide(@NonNull Context context, @NonNull h.g.a.b bVar, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
    }

    @NonNull
    public static h.g.a.k with(@NonNull Activity activity) {
    }

    @NonNull
    public static h.g.a.k with(@NonNull FragmentActivity fragmentActivity) {
    }

    @NonNull
    public static h.g.a.k with(@NonNull Fragment fragment) {
    }

    @VisibleForTesting
    public static void init(@NonNull Context context, @NonNull h.g.a.b bVar) {
    }

    @NonNull
    @Deprecated
    public static h.g.a.k with(@NonNull android.app.Fragment fragment) {
    }

    @NonNull
    public static h.g.a.k with(@NonNull View view) {
    }
}
