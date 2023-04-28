package cn.sharesdk.onekeyshare.themes.classic;

import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.onekeyshare.OnekeySharePage;
import cn.sharesdk.onekeyshare.OnekeyShareThemeImpl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class FriendListPage extends OnekeySharePage implements View.OnClickListener, AdapterView.OnItemClickListener {
    private static final int DESIGN_LEFT_PADDING = 40;
    private FriendAdapter adapter;
    private int checkNum;
    private int lastPosition;
    private LinearLayout llPage;
    private Platform platform;
    private RelativeLayout rlTitle;
    private TextView tvCancel;
    private TextView tvConfirm;

    public FriendListPage(OnekeyShareThemeImpl onekeyShareThemeImpl) {
    }

    private void initTitle(RelativeLayout relativeLayout, float f2) {
    }

    private void updateConfirmView() {
    }

    public abstract int getDesignTitleHeight();

    public abstract float getRatio();

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
    }

    public void setPlatform(Platform platform) {
    }
}
