package h.u.a.f;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: UCrop.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    public static final int f20365d = 69;

    /* renamed from: e  reason: collision with root package name */
    public static final int f20366e = 96;

    /* renamed from: f  reason: collision with root package name */
    private static final String f20367f = "com.kevin.crop";

    /* renamed from: g  reason: collision with root package name */
    public static final String f20368g = "com.kevin.crop.InputUri";

    /* renamed from: h  reason: collision with root package name */
    public static final String f20369h = "com.kevin.crop.OutputUri";

    /* renamed from: i  reason: collision with root package name */
    public static final String f20370i = "com.kevin.crop.CropAspectRatio";

    /* renamed from: j  reason: collision with root package name */
    public static final String f20371j = "com.kevin.crop.Error";

    /* renamed from: k  reason: collision with root package name */
    public static final String f20372k = "com.kevin.crop.AspectRatioSet";

    /* renamed from: l  reason: collision with root package name */
    public static final String f20373l = "com.kevin.crop.AspectRatioX";

    /* renamed from: m  reason: collision with root package name */
    public static final String f20374m = "com.kevin.crop.AspectRatioY";

    /* renamed from: n  reason: collision with root package name */
    public static final String f20375n = "com.kevin.crop.MaxSizeSet";

    /* renamed from: o  reason: collision with root package name */
    public static final String f20376o = "com.kevin.crop.MaxSizeX";

    /* renamed from: p  reason: collision with root package name */
    public static final String f20377p = "com.kevin.crop.MaxSizeY";
    public static final int q = 0;
    public static final int r = 1;
    public static final int s = 2;
    public static final int t = 3;

    /* renamed from: a  reason: collision with root package name */
    private Intent f20378a;
    private Bundle b;
    private Class<?> c;

    /* compiled from: UCrop.java */
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: h.u.a.f.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public @interface InterfaceC0357a {
    }

    /* compiled from: UCrop.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b {
        public static final String b = "com.kevin.crop.CompressionFormatName";
        public static final String c = "com.kevin.crop.CompressionQuality";

        /* renamed from: d  reason: collision with root package name */
        public static final String f20379d = "com.kevin.crop.AllowedGestures";

        /* renamed from: e  reason: collision with root package name */
        public static final String f20380e = "com.kevin.crop.MaxBitmapSize";

        /* renamed from: f  reason: collision with root package name */
        public static final String f20381f = "com.kevin.crop.MaxScaleMultiplier";

        /* renamed from: g  reason: collision with root package name */
        public static final String f20382g = "com.kevin.crop.ImageToCropBoundsAnimDuration";

        /* renamed from: h  reason: collision with root package name */
        public static final String f20383h = "com.kevin.crop.DimmedLayerColor";

        /* renamed from: i  reason: collision with root package name */
        public static final String f20384i = "com.kevin.crop.OvalDimmedLayer";

        /* renamed from: j  reason: collision with root package name */
        public static final String f20385j = "com.kevin.crop.ShowCropFrame";

        /* renamed from: k  reason: collision with root package name */
        public static final String f20386k = "com.kevin.crop.CropFrameColor";

        /* renamed from: l  reason: collision with root package name */
        public static final String f20387l = "com.kevin.crop.CropFrameStrokeWidth";

        /* renamed from: m  reason: collision with root package name */
        public static final String f20388m = "com.kevin.crop.ShowCropGrid";

        /* renamed from: n  reason: collision with root package name */
        public static final String f20389n = "com.kevin.crop.CropGridRowCount";

        /* renamed from: o  reason: collision with root package name */
        public static final String f20390o = "com.kevin.crop.CropGridColumnCount";

        /* renamed from: p  reason: collision with root package name */
        public static final String f20391p = "com.kevin.crop.CropGridColor";
        public static final String q = "com.kevin.crop.CropGridStrokeWidth";

        /* renamed from: a  reason: collision with root package name */
        private final Bundle f20392a;

        @NonNull
        public Bundle a() {
        }

        public void b(int i2, int i3, int i4) {
        }

        public void c(@NonNull Bitmap.CompressFormat compressFormat) {
        }

        public void d(@IntRange(from = 0) int i2) {
        }

        public void e(@ColorInt int i2) {
        }

        public void f(@IntRange(from = 0) int i2) {
        }

        public void g(@ColorInt int i2) {
        }

        public void h(@IntRange(from = 0) int i2) {
        }

        public void i(@IntRange(from = 0) int i2) {
        }

        public void j(@IntRange(from = 0) int i2) {
        }

        public void k(@ColorInt int i2) {
        }

        public void l(@IntRange(from = 100) long j2) {
        }

        public void m(@IntRange(from = 100) int i2) {
        }

        public void n(@FloatRange(from = 1.0d, fromInclusive = false) float f2) {
        }

        public void o(boolean z) {
        }

        public void p(boolean z) {
        }

        public void q(boolean z) {
        }
    }

    private a(@NonNull Uri uri, @NonNull Uri uri2) {
    }

    @Nullable
    public static Throwable a(@NonNull Intent intent) {
    }

    @Nullable
    public static Uri c(@NonNull Intent intent) {
    }

    public static float d(@NonNull Intent intent) {
    }

    public static a e(@NonNull Uri uri, @NonNull Uri uri2) {
    }

    public Intent b(@NonNull Context context) {
    }

    public void f(@NonNull Activity activity) {
    }

    public void g(@NonNull Activity activity, int i2) {
    }

    public void h(@NonNull Context context, @NonNull Fragment fragment) {
    }

    @TargetApi(11)
    public void i(@NonNull Context context, @NonNull Fragment fragment, int i2) {
    }

    public a j() {
    }

    public a k(float f2, float f3) {
    }

    public a l(@IntRange(from = 100) int i2, @IntRange(from = 100) int i3) {
    }

    public a m(@NonNull b bVar) {
    }

    public a n(Class cls) {
    }
}
