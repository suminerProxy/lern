package com.sobot.chat.widget;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LinkMovementClickMethod extends LinkMovementMethod {
    private static final long CLICK_DELAY = 500;
    private static LinkMovementClickMethod sInstance;
    private long lastClickTime;

    public static LinkMovementClickMethod getInstance() {
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
    }
}
