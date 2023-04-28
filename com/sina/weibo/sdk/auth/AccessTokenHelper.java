package com.sina.weibo.sdk.auth;

import android.content.Context;
import com.sina.weibo.sdk.net.c;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class AccessTokenHelper {
    private static final String PREFERENCES_NAME = "com_weibo_sdk_android";

    /* renamed from: com.sina.weibo.sdk.auth.AccessTokenHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements c<String> {
        public final /* synthetic */ Context c;

        public AnonymousClass1(Context context) {
        }

        @Override // com.sina.weibo.sdk.net.c
        public final /* synthetic */ void a(String str) {
        }

        @Override // com.sina.weibo.sdk.net.c
        public final void onError(Throwable th) {
        }
    }

    public static void clearAccessToken(Context context) {
    }

    public static Oauth2AccessToken readAccessToken(Context context) {
    }

    public static void refreshAccessToken(Context context, String str) {
    }

    public static void writeAccessToken(Context context, Oauth2AccessToken oauth2AccessToken) {
    }
}
