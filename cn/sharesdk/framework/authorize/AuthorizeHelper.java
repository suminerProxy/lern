package cn.sharesdk.framework.authorize;

import cn.sharesdk.framework.Platform;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface AuthorizeHelper {
    AuthorizeListener getAuthorizeListener();

    String getAuthorizeUrl();

    b getAuthorizeWebviewClient(WebAuthorizeActivity webAuthorizeActivity);

    Platform getPlatform();

    String getRedirectUri();

    SSOListener getSSOListener();

    c getSSOProcessor(SSOAuthorizeActivity sSOAuthorizeActivity);
}
