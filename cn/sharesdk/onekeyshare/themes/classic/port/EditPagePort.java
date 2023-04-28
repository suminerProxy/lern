package cn.sharesdk.onekeyshare.themes.classic.port;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import cn.sharesdk.onekeyshare.OnekeyShareThemeImpl;
import cn.sharesdk.onekeyshare.themes.classic.EditPage;
import com.mob.tools.gui.AsyncImageView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class EditPagePort extends EditPage {
    private static final int DESIGN_BOTTOM_HEIGHT = 75;
    private static final int DESIGN_LEFT_PADDING = 40;
    private static final int DESIGN_REMOVE_THUMB_HEIGHT = 70;
    private static final int DESIGN_SCREEN_HEIGHT = 1280;
    private static final int DESIGN_THUMB_HEIGHT = 300;
    private static final int DESIGN_TITLE_HEIGHT = 96;

    /* renamed from: cn.sharesdk.onekeyshare.themes.classic.port.EditPagePort$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends AsyncImageView {
        public final /* synthetic */ EditPagePort this$0;

        public AnonymousClass1(EditPagePort editPagePort, Context context) {
        }

        @Override // com.mob.tools.gui.AsyncImageView, com.mob.tools.gui.BitmapProcessor.BitmapCallback
        public void onImageGot(String str, Bitmap bitmap) {
        }
    }

    public EditPagePort(OnekeyShareThemeImpl onekeyShareThemeImpl) {
    }

    public static /* synthetic */ Bitmap access$002(EditPagePort editPagePort, Bitmap bitmap) {
    }

    private void initBody(RelativeLayout relativeLayout, float f2) {
    }

    private void initBottom(LinearLayout linearLayout, float f2) {
    }

    private void initShadow(LinearLayout linearLayout, float f2) {
    }

    private void initThumb(AsyncImageView asyncImageView) {
    }

    private void initTitle(RelativeLayout relativeLayout, float f2) {
    }

    @Override // cn.sharesdk.onekeyshare.themes.classic.EditPage, com.mob.tools.FakeActivity
    public void onCreate() {
    }
}
