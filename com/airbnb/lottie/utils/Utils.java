package com.airbnb.lottie.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.content.TrimPathContent;
import java.io.Closeable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Utils {
    private static final float INV_SQRT_2 = 0.0f;
    public static final int SECOND_IN_NANOS = 1000000000;
    private static float dpScale;
    private static final ThreadLocal<PathMeasure> threadLocalPathMeasure = null;
    private static final ThreadLocal<float[]> threadLocalPoints = null;
    private static final ThreadLocal<Path> threadLocalTempPath = null;
    private static final ThreadLocal<Path> threadLocalTempPath2 = null;

    /* renamed from: com.airbnb.lottie.utils.Utils$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ PathMeasure initialValue() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public PathMeasure initialValue() {
        }
    }

    /* renamed from: com.airbnb.lottie.utils.Utils$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ Path initialValue() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Path initialValue() {
        }
    }

    /* renamed from: com.airbnb.lottie.utils.Utils$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ Path initialValue() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Path initialValue() {
        }
    }

    /* renamed from: com.airbnb.lottie.utils.Utils$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ float[] initialValue() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: initialValue  reason: avoid collision after fix types in other method */
        public float[] initialValue2() {
        }
    }

    private Utils() {
    }

    public static void applyTrimPathIfNeeded(Path path, @Nullable TrimPathContent trimPathContent) {
    }

    public static void closeQuietly(Closeable closeable) {
    }

    public static Path createPath(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
    }

    public static float dpScale() {
    }

    public static float getAnimationScale(Context context) {
    }

    public static float getScale(Matrix matrix) {
    }

    public static boolean hasZeroScaleAxis(Matrix matrix) {
    }

    public static int hashFor(float f2, float f3, float f4, float f5) {
    }

    public static boolean isAtLeastVersion(int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    public static boolean isNetworkException(Throwable th) {
    }

    public static Bitmap renderPath(Path path) {
    }

    public static Bitmap resizeBitmapIfNeeded(Bitmap bitmap, int i2, int i3) {
    }

    public static void saveLayerCompat(Canvas canvas, RectF rectF, Paint paint) {
    }

    public static void saveLayerCompat(Canvas canvas, RectF rectF, Paint paint, int i2) {
    }

    public static void applyTrimPathIfNeeded(Path path, float f2, float f3, float f4) {
    }
}
