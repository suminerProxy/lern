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
public class SobotDeleteWorkOrderDialog extends Dialog {
    private Button btn_cancel;
    private Button btn_pick_photo;
    private LinearLayout coustom_pop_layout;
    private View.OnClickListener itemsOnClick;
    private int position;
    private final int screenHeight;
    private String title;
    private TextView tv_photo_hint;

    public SobotDeleteWorkOrderDialog(Activity activity, String str, View.OnClickListener onClickListener) {
    }

    private void initView() {
    }

    private void setParams(Context context, WindowManager.LayoutParams layoutParams) {
    }

    public int getPosition() {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setPosition(int i2) {
    }
}
