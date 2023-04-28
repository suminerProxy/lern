package com.sobot.chat.widget.statusbar;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.IdRes;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class StatusBarCompat {
    public static final IStatusBar IMPL = null;

    /* renamed from: com.sobot.chat.widget.statusbar.StatusBarCompat$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements IStatusBar {
        @Override // com.sobot.chat.widget.statusbar.IStatusBar
        public void setStatusBarColor(Window window, @ColorInt int i2) {
        }
    }

    private static void internalResetActionBarContainer(View view) {
    }

    @TargetApi(14)
    public static void internalSetFitsSystemWindows(Window window, boolean z) {
    }

    private static boolean isEMUI() {
    }

    private static boolean isMeizu() {
    }

    public static void resetActionBarContainerTopMargin(Window window) {
    }

    public static void setFitsSystemWindows(Window window, boolean z) {
    }

    public static void setLightStatusBar(Window window, boolean z) {
    }

    public static void setNavigationBarColor(Activity activity, int i2) {
    }

    public static void setStatusBarColor(Activity activity, @ColorInt int i2) {
    }

    public static void setStatusNavBarColor(Activity activity, int i2, int i3) {
    }

    public static void setTranslucent(Window window, boolean z) {
    }

    public static int toGrey(@ColorInt int i2) {
    }

    public static void setStatusBarColor(Activity activity, @ColorInt int i2, boolean z) {
    }

    public static void setStatusBarColor(Window window, @ColorInt int i2, boolean z) {
    }

    public static void resetActionBarContainerTopMargin(Window window, @IdRes int i2) {
    }
}
