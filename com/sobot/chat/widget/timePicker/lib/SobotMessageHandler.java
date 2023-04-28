package com.sobot.chat.widget.timePicker.lib;

import android.os.Handler;
import android.os.Message;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class SobotMessageHandler extends Handler {
    public static final int WHAT_INVALIDATE_LOOP_VIEW = 1000;
    public static final int WHAT_ITEM_SELECTED = 3000;
    public static final int WHAT_SMOOTH_SCROLL = 2000;
    public final SobotWheelView loopview;

    public SobotMessageHandler(SobotWheelView sobotWheelView) {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
    }
}
