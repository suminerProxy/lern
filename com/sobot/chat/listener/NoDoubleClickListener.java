package com.sobot.chat.listener;

import android.view.View;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class NoDoubleClickListener implements View.OnClickListener {
    public static final int MIN_CLICK_DELAY_TIME = 1000;
    private long lastClickTime;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public abstract void onNoDoubleClick(View view);
}
