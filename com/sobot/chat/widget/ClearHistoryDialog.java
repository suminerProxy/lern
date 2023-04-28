package com.sobot.chat.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ClearHistoryDialog extends Dialog implements View.OnClickListener {
    private DialogOnClickListener listener;
    private final int screenHeight;
    private Button sobot_btn_cancel;
    private Button sobot_btn_take_photo;
    private LinearLayout sobot_pop_layout;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface DialogOnClickListener {
        void onSure();
    }

    public ClearHistoryDialog(Activity activity) {
    }

    public static int getScreenHeight(Activity activity) {
    }

    private void initData() {
    }

    private void initView() {
    }

    private void setParams(Context context, WindowManager.LayoutParams layoutParams) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setOnClickListener(DialogOnClickListener dialogOnClickListener) {
    }
}
