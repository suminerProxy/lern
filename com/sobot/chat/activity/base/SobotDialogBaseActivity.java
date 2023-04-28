package com.sobot.chat.activity.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.sobot.chat.notchlib.INotchScreen;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class SobotDialogBaseActivity extends SobotBaseActivity {

    /* renamed from: com.sobot.chat.activity.base.SobotDialogBaseActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements INotchScreen.NotchScreenCallback {
        public final /* synthetic */ View val$view;

        public AnonymousClass1(View view) {
        }

        @Override // com.sobot.chat.notchlib.INotchScreen.NotchScreenCallback
        public void onResult(INotchScreen.NotchScreenInfo notchScreenInfo) {
        }
    }

    public static void displayInNotch(Activity activity, View view) {
    }

    private void overridePending() {
    }

    @Override // android.app.Activity
    public void finish() {
    }

    public Activity getContext() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }
}
