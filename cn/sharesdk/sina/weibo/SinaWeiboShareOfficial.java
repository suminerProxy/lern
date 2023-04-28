package cn.sharesdk.sina.weibo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.j;
import com.mob.tools.FakeActivity;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.MultiImageObject;
import com.sina.weibo.sdk.api.VideoSourceObject;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.openapi.IWBAPI;
import com.sina.weibo.sdk.openapi.SdkListener;
import com.sina.weibo.sdk.share.WbShareCallback;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SinaWeiboShareOfficial extends FakeActivity implements WbShareCallback {
    private String appkey;
    private IWBAPI iwbapi;
    private AuthorizeListener listener;
    private Platform.ShareParams params;
    private String permissions;
    private String redirectUrl;
    private long thumbSize;

    /* renamed from: cn.sharesdk.sina.weibo.SinaWeiboShareOfficial$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends j.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SinaWeiboShareOfficial f277a;

        /* renamed from: cn.sharesdk.sina.weibo.SinaWeiboShareOfficial$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class C00151 implements SdkListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f278a;

            public C00151(AnonymousClass1 anonymousClass1) {
            }

            @Override // com.sina.weibo.sdk.openapi.SdkListener
            public void onInitFailure(Exception exc) {
            }

            @Override // com.sina.weibo.sdk.openapi.SdkListener
            public void onInitSuccess() {
            }
        }

        public AnonymousClass1(SinaWeiboShareOfficial sinaWeiboShareOfficial) {
        }

        @Override // cn.sharesdk.framework.utils.j.a
        public void a() throws Throwable {
        }
    }

    /* renamed from: cn.sharesdk.sina.weibo.SinaWeiboShareOfficial$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends j.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SinaWeiboShareOfficial f279a;

        public AnonymousClass2(SinaWeiboShareOfficial sinaWeiboShareOfficial) {
        }

        @Override // cn.sharesdk.framework.utils.j.a
        public void a() throws Throwable {
        }
    }

    public SinaWeiboShareOfficial(String str, String str2, String str3, Platform.ShareParams shareParams, AuthorizeListener authorizeListener) {
    }

    public static /* synthetic */ Activity access$000(SinaWeiboShareOfficial sinaWeiboShareOfficial) {
    }

    public static /* synthetic */ String access$100(SinaWeiboShareOfficial sinaWeiboShareOfficial) {
    }

    public static /* synthetic */ String access$200(SinaWeiboShareOfficial sinaWeiboShareOfficial) {
    }

    public static /* synthetic */ String access$300(SinaWeiboShareOfficial sinaWeiboShareOfficial) {
    }

    public static /* synthetic */ IWBAPI access$400(SinaWeiboShareOfficial sinaWeiboShareOfficial) {
    }

    public static /* synthetic */ IWBAPI access$402(SinaWeiboShareOfficial sinaWeiboShareOfficial, IWBAPI iwbapi) {
    }

    public static /* synthetic */ Activity access$500(SinaWeiboShareOfficial sinaWeiboShareOfficial) {
    }

    public static /* synthetic */ Activity access$600(SinaWeiboShareOfficial sinaWeiboShareOfficial) {
    }

    public static /* synthetic */ void access$700(SinaWeiboShareOfficial sinaWeiboShareOfficial) {
    }

    public static /* synthetic */ AuthorizeListener access$800(SinaWeiboShareOfficial sinaWeiboShareOfficial) {
    }

    private void actionShare() {
    }

    private byte[] bitmapTByte(Context context, Bitmap bitmap) throws Throwable {
    }

    private String generateGUID() {
    }

    private ImageObject getImageObj() {
    }

    private MultiImageObject getMultiImageObject() {
    }

    private MultiImageObject getOneImage() {
    }

    private Bitmap getResizedBitmap(Bitmap bitmap, double d2) {
    }

    private byte[] getThumb(Context context, Bitmap bitmap) throws Throwable {
    }

    private VideoSourceObject getVideoSourceObject() {
    }

    private WebpageObject getWebpageObj() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.sina.weibo.sdk.share.WbShareCallback
    public void onCancel() {
    }

    @Override // com.sina.weibo.sdk.share.WbShareCallback
    public void onComplete() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onDestroy() {
    }

    @Override // com.sina.weibo.sdk.share.WbShareCallback
    public void onError(UiError uiError) {
    }

    @Override // com.mob.tools.FakeActivity
    public void onPause() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onResume() {
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
    }

    public final void setThumbImage(MultiImageObject multiImageObject, Bitmap bitmap) {
    }

    private byte[] getThumb(Context context, String str) throws Throwable {
    }
}
