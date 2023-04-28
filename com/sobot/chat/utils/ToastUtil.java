package com.sobot.chat.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.Toast;
import java.util.TimerTask;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ToastUtil {
    private static Handler mHandler;
    private static Toast toast;

    /* renamed from: com.sobot.chat.utils.ToastUtil$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* renamed from: com.sobot.chat.utils.ToastUtil$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass2 extends TimerTask {
        public final /* synthetic */ OnAfterShowListener val$onAfterShowListener;

        public AnonymousClass2(OnAfterShowListener onAfterShowListener) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.utils.ToastUtil$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ PopupWindow val$mPopWindow;
        public final /* synthetic */ String val$str;

        public AnonymousClass3(Context context, String str, PopupWindow popupWindow) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface OnAfterShowListener {
        void doAfter();
    }

    public static void doListener(OnAfterShowListener onAfterShowListener) {
    }

    public static void showCopyPopWindows(Context context, View view, String str, int i2, int i3) {
    }

    public static void showCustomLongToast(Context context, String str) {
    }

    public static void showCustomToast(Context context, String str) {
    }

    public static void showCustomToastWithListenr(Context context, String str, long j2, OnAfterShowListener onAfterShowListener) {
    }

    public static void showLongToast(Context context, String str) {
    }

    public static void showToast(Context context, String str) {
    }

    public static void showCustomToast(Context context, String str, int i2) {
    }
}
