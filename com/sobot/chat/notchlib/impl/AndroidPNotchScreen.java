package com.sobot.chat.notchlib.impl;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.View;
import com.sobot.chat.notchlib.INotchScreen;

@TargetApi(28)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class AndroidPNotchScreen implements INotchScreen {

    /* renamed from: com.sobot.chat.notchlib.impl.AndroidPNotchScreen$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ AndroidPNotchScreen this$0;
        public final /* synthetic */ INotchScreen.NotchSizeCallback val$callback;
        public final /* synthetic */ View val$contentView;

        public AnonymousClass1(AndroidPNotchScreen androidPNotchScreen, View view, INotchScreen.NotchSizeCallback notchSizeCallback) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
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
