package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DescendantOffsetUtils {
    private static final ThreadLocal<Matrix> matrix = null;
    private static final ThreadLocal<RectF> rectF = null;

    public static void getDescendantRect(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull Rect rect) {
    }

    private static void offsetDescendantMatrix(ViewParent viewParent, @NonNull View view, @NonNull Matrix matrix2) {
    }

    public static void offsetDescendantRect(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull Rect rect) {
    }
}
