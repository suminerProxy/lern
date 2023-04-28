package com.sobot.chat.widget.kpswitch.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.sobot.chat.widget.kpswitch.IPanelHeightTarget;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class KeyboardUtil {
    private static int LAST_SAVE_KEYBOARD_HEIGHT;
    private static int MAX_PANEL_HEIGHT;
    private static int MIN_KEYBOARD_HEIGHT;
    private static int MIN_PANEL_HEIGHT;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class KeyboardStatusListener implements ViewTreeObserver.OnGlobalLayoutListener {
        private static final String TAG = "KeyboardStatusListener";
        private final ViewGroup contentView;
        private final boolean isFitSystemWindows;
        private final boolean isFullScreen;
        private boolean isOverlayLayoutDisplayHContainStatusBar;
        private final boolean isTranslucentStatus;
        private final OnKeyboardShowingListener keyboardShowingListener;
        private boolean lastKeyboardShowing;
        private int maxOverlayLayoutHeight;
        private final IPanelHeightTarget panelHeightTarget;
        private int previousDisplayHeight;
        private final int screenHeight;
        private final int statusBarHeight;

        public KeyboardStatusListener(boolean z, boolean z2, boolean z3, ViewGroup viewGroup, IPanelHeightTarget iPanelHeightTarget, OnKeyboardShowingListener onKeyboardShowingListener, int i2) {
        }

        private void calculateKeyboardHeight(int i2) {
        }

        private void calculateKeyboardShowing(int i2) {
        }

        private Context getContext() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @TargetApi(13)
        public void onGlobalLayout() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface OnKeyboardShowingListener {
        void onKeyboardShowing(boolean z);
    }

    public static /* synthetic */ boolean access$000(Context context, int i2) {
    }

    @TargetApi(13)
    public static ViewTreeObserver.OnGlobalLayoutListener attach(Activity activity, IPanelHeightTarget iPanelHeightTarget, OnKeyboardShowingListener onKeyboardShowingListener) {
    }

    @TargetApi(16)
    public static void detach(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    public static int getKeyboardHeight(Context context) {
    }

    public static int getMaxPanelHeight(Context context) {
    }

    public static int getMinKeyboardHeight(Context context) {
    }

    public static int getMinPanelHeight(Context context) {
    }

    public static int getValidPanelHeight(Context context) {
    }

    public static void hideKeyboard(View view) {
    }

    private static boolean saveKeyboardHeight(Context context, int i2) {
    }

    public static void showKeyboard(View view) {
    }

    public static ViewTreeObserver.OnGlobalLayoutListener attach(Activity activity, IPanelHeightTarget iPanelHeightTarget) {
    }
}
