package h.g.a.t;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import h.g.a.p.n;
import h.g.a.p.r.d.p;
import h.g.a.t.a;
import java.util.Map;

/* compiled from: BaseRequestOptions.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    private static final int DISK_CACHE_STRATEGY = 4;
    private static final int ERROR_ID = 32;
    private static final int ERROR_PLACEHOLDER = 16;
    private static final int FALLBACK = 8192;
    private static final int FALLBACK_ID = 16384;
    private static final int IS_CACHEABLE = 256;
    private static final int ONLY_RETRIEVE_FROM_CACHE = 524288;
    private static final int OVERRIDE = 512;
    private static final int PLACEHOLDER = 64;
    private static final int PLACEHOLDER_ID = 128;
    private static final int PRIORITY = 8;
    private static final int RESOURCE_CLASS = 4096;
    private static final int SIGNATURE = 1024;
    private static final int SIZE_MULTIPLIER = 2;
    private static final int THEME = 32768;
    private static final int TRANSFORMATION = 2048;
    private static final int TRANSFORMATION_ALLOWED = 65536;
    private static final int TRANSFORMATION_REQUIRED = 131072;
    private static final int UNSET = -1;
    private static final int USE_ANIMATION_POOL = 1048576;
    private static final int USE_UNLIMITED_SOURCE_GENERATORS_POOL = 262144;
    @NonNull
    private h.g.a.p.p.j diskCacheStrategy;
    private int errorId;
    @Nullable
    private Drawable errorPlaceholder;
    @Nullable
    private Drawable fallbackDrawable;
    private int fallbackId;
    private int fields;
    private boolean isAutoCloneEnabled;
    private boolean isCacheable;
    private boolean isLocked;
    private boolean isScaleOnlyOrNoTransform;
    private boolean isTransformationAllowed;
    private boolean isTransformationRequired;
    private boolean onlyRetrieveFromCache;
    @NonNull
    private h.g.a.p.j options;
    private int overrideHeight;
    private int overrideWidth;
    @Nullable
    private Drawable placeholderDrawable;
    private int placeholderId;
    @NonNull
    private h.g.a.h priority;
    @NonNull
    private Class<?> resourceClass;
    @NonNull
    private h.g.a.p.g signature;
    private float sizeMultiplier;
    @Nullable
    private Resources.Theme theme;
    @NonNull
    private Map<Class<?>, n<?>> transformations;
    private boolean useAnimationPool;
    private boolean useUnlimitedSourceGeneratorsPool;

    private boolean isSet(int i2) {
    }

    private static boolean isSet(int i2, int i3) {
    }

    @NonNull
    private T optionalScaleOnlyTransform(@NonNull p pVar, @NonNull n<Bitmap> nVar) {
    }

    @NonNull
    private T scaleOnlyTransform(@NonNull p pVar, @NonNull n<Bitmap> nVar) {
    }

    private T self() {
    }

    @NonNull
    @CheckResult
    public T apply(@NonNull a<?> aVar) {
    }

    @NonNull
    public T autoClone() {
    }

    @NonNull
    @CheckResult
    public T centerCrop() {
    }

    @NonNull
    @CheckResult
    public T centerInside() {
    }

    @NonNull
    @CheckResult
    public T circleCrop() {
    }

    @CheckResult
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo36clone() throws CloneNotSupportedException {
    }

    @NonNull
    @CheckResult
    public T decode(@NonNull Class<?> cls) {
    }

    @NonNull
    @CheckResult
    public T disallowHardwareConfig() {
    }

    @NonNull
    @CheckResult
    public T diskCacheStrategy(@NonNull h.g.a.p.p.j jVar) {
    }

    @NonNull
    @CheckResult
    public T dontAnimate() {
    }

    @NonNull
    @CheckResult
    public T dontTransform() {
    }

    @NonNull
    @CheckResult
    public T downsample(@NonNull p pVar) {
    }

    @NonNull
    @CheckResult
    public T encodeFormat(@NonNull Bitmap.CompressFormat compressFormat) {
    }

    @NonNull
    @CheckResult
    public T encodeQuality(@IntRange(from = 0, to = 100) int i2) {
    }

    public boolean equals(Object obj) {
    }

    @NonNull
    @CheckResult
    public T error(@Nullable Drawable drawable) {
    }

    @NonNull
    @CheckResult
    public T fallback(@Nullable Drawable drawable) {
    }

    @NonNull
    @CheckResult
    public T fitCenter() {
    }

    @NonNull
    @CheckResult
    public T format(@NonNull h.g.a.p.b bVar) {
    }

    @NonNull
    @CheckResult
    public T frame(@IntRange(from = 0) long j2) {
    }

    @NonNull
    public final h.g.a.p.p.j getDiskCacheStrategy() {
    }

    public final int getErrorId() {
    }

    @Nullable
    public final Drawable getErrorPlaceholder() {
    }

    @Nullable
    public final Drawable getFallbackDrawable() {
    }

    public final int getFallbackId() {
    }

    public final boolean getOnlyRetrieveFromCache() {
    }

    @NonNull
    public final h.g.a.p.j getOptions() {
    }

    public final int getOverrideHeight() {
    }

    public final int getOverrideWidth() {
    }

    @Nullable
    public final Drawable getPlaceholderDrawable() {
    }

    public final int getPlaceholderId() {
    }

    @NonNull
    public final h.g.a.h getPriority() {
    }

    @NonNull
    public final Class<?> getResourceClass() {
    }

    @NonNull
    public final h.g.a.p.g getSignature() {
    }

    public final float getSizeMultiplier() {
    }

    @Nullable
    public final Resources.Theme getTheme() {
    }

    @NonNull
    public final Map<Class<?>, n<?>> getTransformations() {
    }

    public final boolean getUseAnimationPool() {
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
    }

    public int hashCode() {
    }

    public final boolean isAutoCloneEnabled() {
    }

    public final boolean isDiskCacheStrategySet() {
    }

    public final boolean isLocked() {
    }

    public final boolean isMemoryCacheable() {
    }

    public final boolean isPrioritySet() {
    }

    public boolean isScaleOnlyOrNoTransform() {
    }

    public final boolean isSkipMemoryCacheSet() {
    }

    public final boolean isTransformationAllowed() {
    }

    public final boolean isTransformationRequired() {
    }

    public final boolean isTransformationSet() {
    }

    public final boolean isValidOverride() {
    }

    @NonNull
    public T lock() {
    }

    @NonNull
    @CheckResult
    public T onlyRetrieveFromCache(boolean z) {
    }

    @NonNull
    @CheckResult
    public T optionalCenterCrop() {
    }

    @NonNull
    @CheckResult
    public T optionalCenterInside() {
    }

    @NonNull
    @CheckResult
    public T optionalCircleCrop() {
    }

    @NonNull
    @CheckResult
    public T optionalFitCenter() {
    }

    @NonNull
    public final T optionalTransform(@NonNull p pVar, @NonNull n<Bitmap> nVar) {
    }

    @NonNull
    @CheckResult
    public T override(int i2, int i3) {
    }

    @NonNull
    @CheckResult
    public T placeholder(@Nullable Drawable drawable) {
    }

    @NonNull
    @CheckResult
    public T priority(@NonNull h.g.a.h hVar) {
    }

    @NonNull
    public final T selfOrThrowIfLocked() {
    }

    @NonNull
    @CheckResult
    public <Y> T set(@NonNull h.g.a.p.i<Y> iVar, @NonNull Y y) {
    }

    @NonNull
    @CheckResult
    public T signature(@NonNull h.g.a.p.g gVar) {
    }

    @NonNull
    @CheckResult
    public T sizeMultiplier(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    @NonNull
    @CheckResult
    public T skipMemoryCache(boolean z) {
    }

    @NonNull
    @CheckResult
    public T theme(@Nullable Resources.Theme theme) {
    }

    @NonNull
    @CheckResult
    public T timeout(@IntRange(from = 0) int i2) {
    }

    @NonNull
    @CheckResult
    public final T transform(@NonNull p pVar, @NonNull n<Bitmap> nVar) {
    }

    @NonNull
    @CheckResult
    @Deprecated
    public T transforms(@NonNull n<Bitmap>... nVarArr) {
    }

    @NonNull
    @CheckResult
    public T useAnimationPool(boolean z) {
    }

    @NonNull
    @CheckResult
    public T useUnlimitedSourceGeneratorsPool(boolean z) {
    }

    @NonNull
    private T scaleOnlyTransform(@NonNull p pVar, @NonNull n<Bitmap> nVar, boolean z) {
    }

    @CheckResult
    public T clone() {
    }

    @NonNull
    @CheckResult
    public T optionalTransform(@NonNull n<Bitmap> nVar) {
    }

    @NonNull
    @CheckResult
    public T transform(@NonNull n<Bitmap> nVar) {
    }

    @NonNull
    @CheckResult
    public <Y> T optionalTransform(@NonNull Class<Y> cls, @NonNull n<Y> nVar) {
    }

    @NonNull
    @CheckResult
    public T transform(@NonNull n<Bitmap>... nVarArr) {
    }

    @NonNull
    @CheckResult
    public T override(int i2) {
    }

    @NonNull
    @CheckResult
    public T error(@DrawableRes int i2) {
    }

    @NonNull
    @CheckResult
    public T fallback(@DrawableRes int i2) {
    }

    @NonNull
    @CheckResult
    public T placeholder(@DrawableRes int i2) {
    }

    @NonNull
    public T transform(@NonNull n<Bitmap> nVar, boolean z) {
    }

    @NonNull
    public <Y> T transform(@NonNull Class<Y> cls, @NonNull n<Y> nVar, boolean z) {
    }

    @NonNull
    @CheckResult
    public <Y> T transform(@NonNull Class<Y> cls, @NonNull n<Y> nVar) {
    }
}
