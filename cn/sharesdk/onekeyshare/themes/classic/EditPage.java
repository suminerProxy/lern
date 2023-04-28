package cn.sharesdk.onekeyshare.themes.classic;

import android.graphics.Bitmap;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.onekeyshare.OnekeySharePage;
import cn.sharesdk.onekeyshare.OnekeyShareThemeImpl;
import com.mob.tools.gui.AsyncImageView;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class EditPage extends OnekeySharePage implements View.OnClickListener, TextWatcher, Runnable {
    public AsyncImageView aivThumb;
    public EditText etContent;
    private OnekeyShareThemeImpl impl;
    public LinearLayout llBottom;
    public LinearLayout llPage;
    public int maxBodyHeight;
    public Platform platform;
    public RelativeLayout rlThumb;
    public RelativeLayout rlTitle;
    public Platform.ShareParams sp;
    public ScrollView svContent;
    public Bitmap thumb;
    public TextView tvAt;
    public TextView tvCancel;
    public TextView tvShare;
    public TextView tvTextCouter;
    public XView xvRemove;

    public EditPage(OnekeyShareThemeImpl onekeyShareThemeImpl) {
    }

    private void cancelAndFinish() {
    }

    private String getJoinSelectedUser(HashMap<String, Object> hashMap) {
    }

    private void removeThumb() {
    }

    private void shareAndFinish() {
    }

    private void showFriendList() {
    }

    private void showThumb(Bitmap bitmap) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void hideSoftInput(View view) {
    }

    public boolean isShowAtUserLayout(String str) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onPause() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onResult(HashMap<String, Object> hashMap) {
    }

    @Override // com.mob.tools.FakeActivity
    public int onSetTheme(int i2, boolean z) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public void setPlatform(Platform platform) {
    }

    public void setShareParams(Platform.ShareParams shareParams) {
    }
}
