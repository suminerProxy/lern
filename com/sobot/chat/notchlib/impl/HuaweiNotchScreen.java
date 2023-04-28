package com.sobot.chat.notchlib.impl;

import android.annotation.TargetApi;
import android.app.Activity;
import com.sobot.chat.notchlib.INotchScreen;

@TargetApi(26)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class HuaweiNotchScreen implements INotchScreen {
    public static final int FLAG_NOTCH_SUPPORT = 65536;

    public static void setNotDisplayInNotch(Activity activity) {
    }

    @Override // com.sobot.chat.notchlib.INotchScreen
    public void getNotchRect(Activity activity, INotchScreen.NotchSizeCallback notchSizeCallback) {
    }

    @Override // com.sobot.chat.notchlib.INotchScreen
    public boolean hasNotch(Activity activity) {
    }

    @Override // com.sobot.chat.notchlib.INotchScreen
    public void setDisplayInNotch(Activity activity) {
    }
}
