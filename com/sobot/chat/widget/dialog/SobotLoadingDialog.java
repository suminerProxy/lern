package com.sobot.chat.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotLoadingDialog extends Dialog {
    private static final String TAG = "SobotLoadingDialog";
    private boolean mCancelable;
    private String mMessage;
    private TextView tv_loading;

    public SobotLoadingDialog(@NonNull Context context, String str) {
    }

    private void initView() {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
    }

    public String getmMessage() {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, @NonNull KeyEvent keyEvent) {
    }

    public void setmMessage(String str) {
    }

    public SobotLoadingDialog(@NonNull Context context, int i2, String str, boolean z) {
    }
}
