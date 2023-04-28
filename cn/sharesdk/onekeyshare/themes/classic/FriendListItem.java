package cn.sharesdk.onekeyshare.themes.classic;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.sharesdk.onekeyshare.themes.classic.FriendAdapter;
import com.mob.tools.gui.AsyncImageView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FriendListItem extends LinearLayout {
    private static final int DESIGN_AVATAR_PADDING = 24;
    private static final int DESIGN_AVATAR_WIDTH = 64;
    private static final int DESIGN_ITEM_HEIGHT = 96;
    private static final int DESIGN_ITEM_PADDING = 20;
    private AsyncImageView aivIcon;
    private Bitmap bmChd;
    private Bitmap bmUnch;
    private ImageView ivCheck;
    private TextView tvName;

    public FriendListItem(Context context, float f2) {
    }

    public void update(FriendAdapter.Following following, boolean z) {
    }
}
