package cn.sharesdk.tencent.qq.utils;

import android.os.Bundle;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.SSOAuthorizeActivity;
import cn.sharesdk.framework.authorize.SSOListener;
import cn.sharesdk.framework.authorize.WebAuthorizeActivity;
import cn.sharesdk.framework.authorize.b;
import cn.sharesdk.framework.authorize.c;
import cn.sharesdk.framework.e;
import com.mob.tools.utils.DH;
import java.util.HashMap;

/* compiled from: QQHelper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class a extends e {
    private static final String[] b = null;
    private static a c;

    /* renamed from: d  reason: collision with root package name */
    private String f360d;

    /* renamed from: e  reason: collision with root package name */
    private String[] f361e;

    /* renamed from: f  reason: collision with root package name */
    private String f362f;

    /* renamed from: g  reason: collision with root package name */
    private String f363g;

    /* renamed from: h  reason: collision with root package name */
    private String f364h;

    /* renamed from: i  reason: collision with root package name */
    private String f365i;

    /* compiled from: QQHelper.java */
    /* renamed from: cn.sharesdk.tencent.qq.utils.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements SSOListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AuthorizeListener f366a;
        public final /* synthetic */ a b;

        public AnonymousClass1(a aVar, AuthorizeListener authorizeListener) {
        }

        @Override // cn.sharesdk.framework.authorize.SSOListener
        public void onCancel() {
        }

        @Override // cn.sharesdk.framework.authorize.SSOListener
        public void onComplete(Bundle bundle) {
        }

        @Override // cn.sharesdk.framework.authorize.SSOListener
        public void onFailed(Throwable th) {
        }
    }

    /* compiled from: QQHelper.java */
    /* renamed from: cn.sharesdk.tencent.qq.utils.a$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareSDKCallback f367a;
        public final /* synthetic */ a b;

        public AnonymousClass2(a aVar, ShareSDKCallback shareSDKCallback) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    private a(Platform platform) {
    }

    public static /* synthetic */ String a(a aVar) {
    }

    public static /* synthetic */ Platform b(a aVar) {
    }

    public static /* synthetic */ String c(a aVar) {
    }

    public static /* synthetic */ Platform d(a aVar) {
    }

    public static /* synthetic */ Platform e(a aVar) {
    }

    public static /* synthetic */ Platform f(a aVar) {
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getAuthorizeUrl() {
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public b getAuthorizeWebviewClient(WebAuthorizeActivity webAuthorizeActivity) {
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getRedirectUri() {
    }

    @Override // cn.sharesdk.framework.e, cn.sharesdk.framework.authorize.AuthorizeHelper
    public c getSSOProcessor(SSOAuthorizeActivity sSOAuthorizeActivity) {
    }

    public static /* synthetic */ String a(a aVar, String str) {
    }

    public static /* synthetic */ String b(a aVar, String str) {
    }

    public HashMap<String, Object> c(String str) throws Throwable {
    }

    public void d(String str) {
    }

    public HashMap<String, Object> e(String str) throws Throwable {
    }

    public static a a(Platform platform) {
    }

    public void b(String str) {
    }

    public void a(String str) {
    }

    public void a(String[] strArr) {
    }

    public void a(AuthorizeListener authorizeListener, boolean z) {
    }

    public void a() {
    }

    public void a(Platform platform, Platform.ShareParams shareParams, PlatformActionListener platformActionListener) throws Throwable {
    }

    private String c() {
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, PlatformActionListener platformActionListener, boolean z, int i2, String str7, String str8, String str9, int i3, boolean z2) {
    }

    public void a(ShareSDKCallback<Boolean> shareSDKCallback) {
    }

    private void a(String str, String str2, String str3, String str4, String str5, String str6, PlatformActionListener platformActionListener) {
    }
}
