package cn.sharesdk.framework.authorize;

import android.content.Intent;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SSOAuthorizeActivity extends AbstractAuthorizeActivity {
    private static final int DEFAULT_AUTH_ACTIVITY_CODE = 32973;
    public SSOListener listener;
    private c sso;

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onNewIntent(Intent intent) {
    }

    public void setSSOListener(SSOListener sSOListener) {
    }
}
