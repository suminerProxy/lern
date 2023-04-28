package com.tencent.thumbplayer.core.common;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.List;

@RequiresApi(api = 17)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPScreenRefreshRateDetector {
    public static final int DISPLAY_CHANGE = 10001;
    private static String TAG = "TPScreenRefreshRateDetector";
    private static boolean isInitted;
    private static List<ScreenRefreshRateChangedListener> listeners;
    private static WeakReference<Context> mContext;
    private static float mCurScreenRefreshRate;
    private static DisplayManager.DisplayListener mDisplayListener;
    private static DisplayManager mDisplayManager;
    private static Handler mHandler;
    private static WindowManager mWindowManager;

    /* renamed from: com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 extends Handler {
        public AnonymousClass1(Looper looper) {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass2 implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface ScreenRefreshRateChangedListener {
        void onScreenRefreshRateChanged(float f2);
    }

    public static /* synthetic */ DisplayManager access$000() {
    }

    public static /* synthetic */ String access$100() {
    }

    public static /* synthetic */ void access$200(float f2) {
    }

    public static /* synthetic */ Handler access$300() {
    }

    public static void addListener(ScreenRefreshRateChangedListener screenRefreshRateChangedListener) {
    }

    public static void deinit() {
    }

    private static Looper getLooper() {
    }

    public static float getScreenRefreshRate() {
    }

    public static void init(Context context) {
    }

    public static void initHandleMsg() {
    }

    private static void notifyScreenRefreshRateChange(float f2) {
    }

    public static void removeListener(ScreenRefreshRateChangedListener screenRefreshRateChangedListener) {
    }
}
