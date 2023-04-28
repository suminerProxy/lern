package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ViewUtils {
    public static final Property<View, Rect> CLIP_BOUNDS = null;
    private static final ViewUtilsBase IMPL = null;
    private static final String TAG = "ViewUtils";
    public static final Property<View, Float> TRANSITION_ALPHA = null;

    /* renamed from: androidx.transition.ViewUtils$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 extends Property<View, Float> {
        public AnonymousClass1(Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f2) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Float get2(View view) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(View view, Float f2) {
        }
    }

    /* renamed from: androidx.transition.ViewUtils$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2 extends Property<View, Rect> {
        public AnonymousClass2(Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Rect get(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Rect rect) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Rect get2(View view) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(View view, Rect rect) {
        }
    }

    private ViewUtils() {
    }

    public static void clearNonTransitionAlpha(@NonNull View view) {
    }

    public static ViewOverlayImpl getOverlay(@NonNull View view) {
    }

    public static float getTransitionAlpha(@NonNull View view) {
    }

    public static WindowIdImpl getWindowId(@NonNull View view) {
    }

    public static void saveNonTransitionAlpha(@NonNull View view) {
    }

    public static void setAnimationMatrix(@NonNull View view, @Nullable Matrix matrix) {
    }

    public static void setLeftTopRightBottom(@NonNull View view, int i2, int i3, int i4, int i5) {
    }

    public static void setTransitionAlpha(@NonNull View view, float f2) {
    }

    public static void setTransitionVisibility(@NonNull View view, int i2) {
    }

    public static void transformMatrixToGlobal(@NonNull View view, @NonNull Matrix matrix) {
    }

    public static void transformMatrixToLocal(@NonNull View view, @NonNull Matrix matrix) {
    }
}
