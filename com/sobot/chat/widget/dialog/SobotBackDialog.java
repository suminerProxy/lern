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
public class SobotBackDialog extends Dialog {
    private LinearLayout coustom_pop_layout;
    private View.OnClickListener itemsOnClick;
    private final int screenHeight;
    private Button sobot_btn_cancle_conversation;
    private Button sobot_btn_temporary_leave;
    private TextView sobot_tv_will_end_conversation;

    public SobotBackDialog(Activity activity, View.OnClickListener onClickListener) {
    }

    private void initView() {
    }

    private void setParams(Context context, WindowManager.LayoutParams layoutParams) {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }
}
