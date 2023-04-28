package com.sobot.chat.widget.dialog.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.StyleRes;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class SobotActionSheet extends Dialog {
    public DialogOnClickListener listener;
    private final int screenHeight;
    public View sobot_container;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface DialogOnClickListener {
        void onSure();
    }

    public SobotActionSheet(Activity activity) {
    }

    public static int getScreenHeight(Activity activity) {
    }

    private void setParams(Context context, WindowManager.LayoutParams layoutParams) {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
    }

    public abstract View getDialogContainer();

    public abstract String getLayoutStrName();

    public int getResDrawableId(String str) {
    }

    public int getResId(String str) {
    }

    public int getResLayoutId(String str) {
    }

    public String getResString(String str) {
    }

    public int getResStringId(String str) {
    }

    public abstract void initData();

    public abstract void initView();

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setOnClickListener(DialogOnClickListener dialogOnClickListener) {
    }

    public SobotActionSheet(Activity activity, @StyleRes int i2) {
    }
}
