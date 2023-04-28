package cn.sharesdk.tencent.qzone.utils;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.SSOAuthorizeActivity;
import cn.sharesdk.framework.authorize.SSOListener;
import cn.sharesdk.framework.authorize.WebAuthorizeActivity;
import cn.sharesdk.framework.e;
import cn.sharesdk.framework.network.SSDKNetworkHelper;
import com.mob.tools.utils.DH;
import java.util.HashMap;

/* compiled from: QZoneHelper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class b extends e {
    private static final String[] b = null;
    private static b c;

    /* renamed from: d  reason: collision with root package name */
    private String f381d;

    /* renamed from: e  reason: collision with root package name */
    private String f382e;

    /* renamed from: f  reason: collision with root package name */
    private String f383f;

    /* renamed from: g  reason: collision with root package name */
    private String f384g;

    /* renamed from: h  reason: collision with root package name */
    private SSDKNetworkHelper f385h;

    /* renamed from: i  reason: collision with root package name */
    private String[] f386i;

    /* compiled from: QZoneHelper.java */
    /* renamed from: cn.sharesdk.tencent.qzone.utils.b$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements SSOListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AuthorizeListener f387a;
        public final /* synthetic */ b b;

        public AnonymousClass1(b bVar, AuthorizeListener authorizeListener) {
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

    /* compiled from: QZoneHelper.java */
    /* renamed from: cn.sharesdk.tencent.qzone.utils.b$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f388a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f389d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f390e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f391f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ String f392g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ PlatformActionListener f393h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ b f394i;

        public AnonymousClass2(b bVar, String str, String str2, int i2, String str3, String str4, String str5, String str6, PlatformActionListener platformActionListener) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* compiled from: QZoneHelper.java */
    /* renamed from: cn.sharesdk.tencent.qzone.utils.b$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareSDKCallback f395a;
        public final /* synthetic */ b b;

        public AnonymousClass3(b bVar, ShareSDKCallback shareSDKCallback) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* compiled from: QZoneHelper.java */
    /* renamed from: cn.sharesdk.tencent.qzone.utils.b$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringBuilder f396a;
        public final /* synthetic */ StringBuilder b;
        public final /* synthetic */ Bundle c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ PlatformActionListener f397d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ b f398e;

        public AnonymousClass4(b bVar, StringBuilder sb, StringBuilder sb2, Bundle bundle, PlatformActionListener platformActionListener) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    private b(Platform platform) {
    }

    public static /* synthetic */ String a(b bVar) {
    }

    public static /* synthetic */ PendingIntent b(b bVar, Intent intent) {
    }

    public static /* synthetic */ String c(b bVar) {
    }

    public static /* synthetic */ Platform d(b bVar) {
    }

    public static /* synthetic */ Platform e(b bVar) {
    }

    public static /* synthetic */ Platform f(b bVar) {
    }

    public static /* synthetic */ String g(b bVar) {
    }

    private String h(String str) {
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getAuthorizeUrl() {
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public cn.sharesdk.framework.authorize.b getAuthorizeWebviewClient(WebAuthorizeActivity webAuthorizeActivity) {
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getRedirectUri() {
    }

    @Override // cn.sharesdk.framework.e, cn.sharesdk.framework.authorize.AuthorizeHelper
    public cn.sharesdk.framework.authorize.c getSSOProcessor(SSOAuthorizeActivity sSOAuthorizeActivity) {
    }

    public static /* synthetic */ String a(b bVar, String str) {
    }

    public static /* synthetic */ Platform b(b bVar) {
    }

    private String c() {
    }

    public static byte[] f(String str) {
    }

    private String g(String str) {
    }

    public HashMap<String, Object> d(String str) throws Throwable {
    }

    public HashMap<String, Object> e(String str) throws Throwable {
    }

    public static /* synthetic */ void a(b bVar, Intent intent) {
    }

    public void b(String str) {
    }

    public static b a(Platform platform) {
    }

    public HashMap<String, Object> b(String str, String str2) throws Throwable {
    }

    public void a(String str) {
    }

    public void a(String[] strArr) {
    }

    public void c(String str) {
    }

    public void a(AuthorizeListener authorizeListener, boolean z) {
    }

    public void a() {
    }

    public void a(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, PlatformActionListener platformActionListener) throws Throwable {
    }

    public void a(int i2, String str, String str2, String str3, String str4, String str5, String str6, PlatformActionListener platformActionListener) throws Throwable {
    }

    @SuppressLint({"WrongConstant"})
    private void b(Intent intent) {
    }

    private void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, PlatformActionListener platformActionListener) {
    }

    public void a(ShareSDKCallback<Boolean> shareSDKCallback) {
    }

    public HashMap<String, Object> a(String str, String str2) throws Throwable {
    }

    public HashMap<String, Object> a(String str, String str2, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
    }

    public void a(String[] strArr, PlatformActionListener platformActionListener) {
    }

    private PendingIntent a(Intent intent) {
    }
}
