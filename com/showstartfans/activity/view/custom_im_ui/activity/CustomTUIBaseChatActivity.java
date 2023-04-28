package com.showstartfans.activity.view.custom_im_ui.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class CustomTUIBaseChatActivity extends CustomBaseLightActivity {
    private static final String b = null;

    private void chat(Intent intent) {
    }

    private ChatInfo getChatInfo(Intent intent) {
    }

    private void startSplashActivity(Bundle bundle) {
    }

    public abstract void initChat(ChatInfo chatInfo);

    @Override // com.showstartfans.activity.view.custom_im_ui.activity.CustomBaseLightActivity, com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }
}
