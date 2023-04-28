package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ViewUtilsBase {
    private static final String TAG = "ViewUtilsBase";
    private static final int VISIBILITY_MASK = 12;
    private static boolean sSetFrameFetched;
    private static Method sSetFrameMethod;
    private static Field sViewFlagsField;
    private static boolean sViewFlagsFieldFetched;
    private float[] mMatrixValues;

    @SuppressLint({"PrivateApi"})
    private void fetchSetFrame() {
    }

    public void clearNonTransitionAlpha(@NonNull View view) {
    }

    public float getTransitionAlpha(@NonNull View view) {
    }

    public void saveNonTransitionAlpha(@NonNull View view) {
    }

    public void setAnimationMatrix(@NonNull View view, @Nullable Matrix matrix) {
    }

    public void setLeftTopRightBottom(@NonNull View view, int i2, int i3, int i4, int i5) {
    }

    public void setTransitionAlpha(@NonNull View view, float f2) {
    }

    public void setTransitionVisibility(@NonNull View view, int i2) {
    }

    public void transformMatrixToGlobal(@NonNull View view, @NonNull Matrix matrix) {
    }

    public void transformMatrixToLocal(@NonNull View view, @NonNull Matrix matrix) {
    }
}
