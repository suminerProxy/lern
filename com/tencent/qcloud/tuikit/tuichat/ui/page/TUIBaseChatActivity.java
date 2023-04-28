package com.tencent.qcloud.tuikit.tuichat.ui.page;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class TUIBaseChatActivity extends BaseLightActivity {
    private static final String TAG = null;

    private void chat(Intent intent) {
    }

    private ChatInfo getChatInfo(Intent intent) {
    }

    private void startSplashActivity(Bundle bundle) {
    }

    public abstract void initChat(ChatInfo chatInfo);

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }
}
