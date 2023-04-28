package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import h.g.a.h;
import h.g.a.p.b;
import h.g.a.p.g;
import h.g.a.p.i;
import h.g.a.p.n;
import h.g.a.p.p.j;
import h.g.a.p.r.d.p;
import h.g.a.t.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RequestOptions extends a<RequestOptions> {
    @Nullable
    private static RequestOptions centerCropOptions;
    @Nullable
    private static RequestOptions centerInsideOptions;
    @Nullable
    private static RequestOptions circleCropOptions;
    @Nullable
    private static RequestOptions fitCenterOptions;
    @Nullable
    private static RequestOptions noAnimationOptions;
    @Nullable
    private static RequestOptions noTransformOptions;
    @Nullable
    private static RequestOptions skipMemoryCacheFalseOptions;
    @Nullable
    private static RequestOptions skipMemoryCacheTrueOptions;

    @NonNull
    @CheckResult
    public static RequestOptions bitmapTransform(@NonNull n<Bitmap> nVar) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions centerCropTransform() {
    }

    @NonNull
    @CheckResult
    public static RequestOptions centerInsideTransform() {
    }

    @NonNull
    @CheckResult
    public static RequestOptions circleCropTransform() {
    }

    @NonNull
    @CheckResult
    public static RequestOptions decodeTypeOf(@NonNull Class<?> cls) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions diskCacheStrategyOf(@NonNull j jVar) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions downsampleOf(@NonNull p pVar) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions encodeFormatOf(@NonNull Bitmap.CompressFormat compressFormat) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions encodeQualityOf(@IntRange(from = 0, to = 100) int i2) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions errorOf(@Nullable Drawable drawable) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions fitCenterTransform() {
    }

    @NonNull
    @CheckResult
    public static RequestOptions formatOf(@NonNull b bVar) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions frameOf(@IntRange(from = 0) long j2) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions noAnimation() {
    }

    @NonNull
    @CheckResult
    public static RequestOptions noTransformation() {
    }

    @NonNull
    @CheckResult
    public static <T> RequestOptions option(@NonNull i<T> iVar, @NonNull T t) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions overrideOf(int i2, int i3) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions placeholderOf(@Nullable Drawable drawable) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions priorityOf(@NonNull h hVar) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions signatureOf(@NonNull g gVar) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions sizeMultiplierOf(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions skipMemoryCacheOf(boolean z) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions timeoutOf(@IntRange(from = 0) int i2) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions errorOf(@DrawableRes int i2) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions overrideOf(int i2) {
    }

    @NonNull
    @CheckResult
    public static RequestOptions placeholderOf(@DrawableRes int i2) {
    }
}
