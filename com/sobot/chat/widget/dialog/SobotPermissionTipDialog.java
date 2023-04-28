package com.sobot.chat.widget.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotPermissionTipDialog extends Dialog implements View.OnClickListener {
    private TextView contentTV;
    private LinearLayout coustom_pop_layout;
    private String mContent;
    private final int screenHeight;
    private Button sobot_btn_cancle_conversation;
    private Button sobot_btn_temporary_leave;
    private String title;
    private TextView titleView;
    private ClickViewListener viewListenern;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface ClickViewListener {
        void clickLeftView(Context context, SobotPermissionTipDialog sobotPermissionTipDialog);

        void clickRightView(Context context, SobotPermissionTipDialog sobotPermissionTipDialog);
    }

    public SobotPermissionTipDialog(Activity activity, ClickViewListener clickViewListener) {
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

    public SobotPermissionTipDialog(Activity activity, String str, String str2, ClickViewListener clickViewListener) {
    }
}
