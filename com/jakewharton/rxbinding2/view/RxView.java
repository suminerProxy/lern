package com.jakewharton.rxbinding2.view;

import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.jakewharton.rxbinding2.InitialValueObservable;
import i.a.b0;
import i.a.x0.g;
import i.a.x0.r;
import java.util.concurrent.Callable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RxView {
    private RxView() {
    }

    public static /* synthetic */ void a(@NonNull View view, int i2, Boolean bool) throws Exception {
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static g<? super Boolean> activated(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static b0<ViewAttachEvent> attachEvents(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static b0<Object> attaches(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static g<? super Boolean> clickable(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static b0<Object> clicks(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static b0<Object> detaches(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static b0<DragEvent> drags(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    @RequiresApi(16)
    public static b0<Object> draws(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static g<? super Boolean> enabled(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<Boolean> focusChanges(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static b0<Object> globalLayouts(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static b0<MotionEvent> hovers(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static b0<KeyEvent> keys(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static b0<ViewLayoutChangeEvent> layoutChangeEvents(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static b0<Object> layoutChanges(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static b0<Object> longClicks(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static b0<Object> preDraws(@NonNull View view, @NonNull Callable<Boolean> callable) {
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static g<? super Boolean> pressed(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    @RequiresApi(23)
    public static b0<ViewScrollChangeEvent> scrollChangeEvents(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static g<? super Boolean> selected(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static b0<Integer> systemUiVisibilityChanges(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static b0<MotionEvent> touches(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static g<? super Boolean> visibility(@NonNull View view) {
    }

    @NonNull
    @CheckResult
    public static b0<DragEvent> drags(@NonNull View view, @NonNull r<? super DragEvent> rVar) {
    }

    @NonNull
    @CheckResult
    public static b0<MotionEvent> hovers(@NonNull View view, @NonNull r<? super MotionEvent> rVar) {
    }

    @NonNull
    @CheckResult
    public static b0<KeyEvent> keys(@NonNull View view, @NonNull r<? super KeyEvent> rVar) {
    }

    @NonNull
    @CheckResult
    public static b0<Object> longClicks(@NonNull View view, @NonNull Callable<Boolean> callable) {
    }

    @NonNull
    @CheckResult
    public static b0<MotionEvent> touches(@NonNull View view, @NonNull r<? super MotionEvent> rVar) {
    }

    @NonNull
    @CheckResult
    public static g<? super Boolean> visibility(@NonNull View view, int i2) {
    }
}
