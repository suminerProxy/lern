package cn.sharesdk.sina.weibo;

import android.os.Bundle;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.SSOAuthorizeActivity;
import cn.sharesdk.framework.authorize.WebAuthorizeActivity;
import cn.sharesdk.framework.authorize.b;
import cn.sharesdk.framework.authorize.c;
import cn.sharesdk.framework.e;
import cn.sharesdk.framework.network.SSDKNetworkHelper;
import com.mob.tools.utils.DH;
import java.util.HashMap;

/* compiled from: Weibo.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class a extends e {
    private static a b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private String f284d;

    /* renamed from: e  reason: collision with root package name */
    private String f285e;

    /* renamed from: f  reason: collision with root package name */
    private String f286f;

    /* renamed from: g  reason: collision with root package name */
    private String[] f287g;

    /* renamed from: h  reason: collision with root package name */
    private SSDKNetworkHelper f288h;

    /* compiled from: Weibo.java */
    /* renamed from: cn.sharesdk.sina.weibo.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareSDKCallback f289a;
        public final /* synthetic */ a b;

        public AnonymousClass1(a aVar, ShareSDKCallback shareSDKCallback) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* compiled from: Weibo.java */
    /* renamed from: cn.sharesdk.sina.weibo.a$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements AuthorizeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PlatformActionListener f290a;
        public final /* synthetic */ Platform.ShareParams b;
        public final /* synthetic */ a c;

        public AnonymousClass2(a aVar, PlatformActionListener platformActionListener, Platform.ShareParams shareParams) {
        }

        @Override // cn.sharesdk.framework.authorize.AuthorizeListener
        public void onCancel() {
        }

        @Override // cn.sharesdk.framework.authorize.AuthorizeListener
        public void onComplete(Bundle bundle) {
        }

        @Override // cn.sharesdk.framework.authorize.AuthorizeListener
        public void onError(Throwable th) {
        }
    }

    /* compiled from: Weibo.java */
    /* renamed from: cn.sharesdk.sina.weibo.a$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Platform.ShareParams f291a;
        public final /* synthetic */ PlatformActionListener b;
        public final /* synthetic */ a c;

        /* compiled from: Weibo.java */
        /* renamed from: cn.sharesdk.sina.weibo.a$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements AuthorizeListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Platform.ShareParams f292a;
            public final /* synthetic */ AnonymousClass3 b;

            public AnonymousClass1(AnonymousClass3 anonymousClass3, Platform.ShareParams shareParams) {
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onCancel() {
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onComplete(Bundle bundle) {
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onError(Throwable th) {
            }
        }

        public AnonymousClass3(a aVar, Platform.ShareParams shareParams, PlatformActionListener platformActionListener) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* compiled from: Weibo.java */
    /* renamed from: cn.sharesdk.sina.weibo.a$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements ShareSDKCallback<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f293a;

        public AnonymousClass4(a aVar) {
        }

        public void a(String str) {
        }

        @Override // cn.sharesdk.framework.ShareSDKCallback
        public /* synthetic */ void onCallback(String str) {
        }
    }

    private a(Platform platform) {
    }

    public static /* synthetic */ Platform a(a aVar) {
    }

    public static /* synthetic */ Platform b(a aVar) {
    }

    public static /* synthetic */ Platform c(a aVar) {
    }

    public static /* synthetic */ Platform d(a aVar) {
    }

    public static /* synthetic */ Platform e(a aVar) {
    }

    public static /* synthetic */ Platform f(a aVar) {
    }

    public static /* synthetic */ String g(a aVar) {
    }

    public static /* synthetic */ Platform h(a aVar) {
    }

    public static /* synthetic */ Platform i(a aVar) {
    }

    public static /* synthetic */ Platform j(a aVar) {
    }

    public static /* synthetic */ Platform k(a aVar) {
    }

    public static /* synthetic */ String l(a aVar) {
    }

    public static /* synthetic */ Platform m(a aVar) {
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

    public String b(String str) throws Throwable {
    }

    public void c(String str) {
    }

    public HashMap<String, Object> d(String str) throws Throwable {
    }

    public HashMap<String, Object> e(String str) throws Throwable {
    }

    public static synchronized a a(Platform platform) {
    }

    public HashMap<String, Object> c(int i2, int i3, String str) throws Throwable {
    }

    public void a(String str, String str2) {
    }

    public void a(String str) {
    }

    public void a(String[] strArr) {
    }

    public void b(Platform.ShareParams shareParams, PlatformActionListener platformActionListener) {
    }

    private String a(Object[] objArr, String str) {
    }

    public HashMap<String, Object> d(int i2, int i3, String str) throws Throwable {
    }

    private String a(Object[] objArr, String str, int i2, int i3) {
    }

    public void c() {
    }

    public HashMap<String, Object> b(int i2, int i3, String str) throws Throwable {
    }

    public void a(AuthorizeListener authorizeListener, boolean z) {
    }

    public boolean a() {
    }

    public void a(ShareSDKCallback<Boolean> shareSDKCallback) {
    }

    private void a(AuthorizeListener authorizeListener) {
    }

    public void a(Platform.ShareParams shareParams, PlatformActionListener platformActionListener) {
    }

    public HashMap<String, Object> a(int i2, int i3, String str) throws Throwable {
    }

    public HashMap<String, Object> a(String str, String str2, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
    }
}
