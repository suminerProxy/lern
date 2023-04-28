package cn.sharesdk.sina.weibo.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import com.mob.tools.FakeActivity;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.TextObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SinaActivity extends FakeActivity implements Handler.Callback {
    private static final int ERR_CANCEL = 1;
    private static final int ERR_FAIL = 2;
    private static final int ERR_OK = 0;
    private static final String SDK_VERSION = "0031405000";
    private String appKey;
    private AuthorizeListener authListener;
    private boolean isCallback;
    private Platform.ShareParams params;
    private long thumbSize;

    private byte[] bitmapTByte(Context context, Bitmap bitmap) throws Throwable {
    }

    private String generateGUID() {
    }

    private ImageObject getImageObj() {
    }

    private Bitmap getResizedBitmap(Bitmap bitmap, double d2) {
    }

    private TextObject getTextObj() {
    }

    private byte[] getThumb(Context context, Bitmap bitmap) throws Throwable {
    }

    private void onResponse(int i2, String str) {
    }

    private void sendMessage() {
    }

    private boolean startClientShare(Activity activity, String str, String str2, Bundle bundle) {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
    }

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onNewIntent(Intent intent) {
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
    }

    public void setAppKey(String str) {
    }

    public void setShareParams(Platform.ShareParams shareParams) {
    }

    public void setSinaAuthListener(AuthorizeListener authorizeListener) {
    }

    private byte[] getThumb(Context context, String str) throws Throwable {
    }
}
