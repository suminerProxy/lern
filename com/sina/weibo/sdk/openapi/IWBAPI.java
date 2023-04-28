package com.sina.weibo.sdk.openapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.share.WbShareCallback;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public interface IWBAPI {
    void authorize(Activity activity, WbAuthListener wbAuthListener);

    void authorizeCallback(Activity activity, int i2, int i3, Intent intent);

    void authorizeClient(Activity activity, WbAuthListener wbAuthListener);

    void authorizeWeb(Activity activity, WbAuthListener wbAuthListener);

    void doResultIntent(Intent intent, WbShareCallback wbShareCallback);

    boolean isWBAppInstalled();

    boolean isWBAppSupportMultipleImage();

    void registerApp(Context context, AuthInfo authInfo);

    void registerApp(Context context, AuthInfo authInfo, SdkListener sdkListener);

    void setLoggerEnable(boolean z);

    void shareMessage(Activity activity, WeiboMultiMessage weiboMultiMessage, boolean z);
}
