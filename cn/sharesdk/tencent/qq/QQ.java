package cn.sharesdk.tencent.qq;

import android.os.Bundle;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.PlatformDb;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.j;
import com.mob.tools.utils.DH;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class QQ extends Platform {
    public static final String NAME = "QQ";

    /* renamed from: a  reason: collision with root package name */
    private String f321a;
    private boolean b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private String f322d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f323e;

    /* renamed from: cn.sharesdk.tencent.qq.QQ$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements AuthorizeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cn.sharesdk.tencent.qq.utils.a f324a;
        public final /* synthetic */ QQ b;

        public AnonymousClass1(QQ qq, cn.sharesdk.tencent.qq.utils.a aVar) {
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

    /* renamed from: cn.sharesdk.tencent.qq.QQ$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements ShareSDKCallback<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Platform.ShareParams f325a;
        public final /* synthetic */ cn.sharesdk.tencent.qq.utils.a b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f326d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f327e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f328f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ String f329g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ boolean f330h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ int f331i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f332j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ String f333k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ String f334l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ int f335m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ QQ f336n;

        public AnonymousClass2(QQ qq, Platform.ShareParams shareParams, cn.sharesdk.tencent.qq.utils.a aVar, String str, String str2, String str3, String str4, String str5, boolean z, int i2, String str6, String str7, String str8, int i3) {
        }

        public void a(String str) {
        }

        @Override // cn.sharesdk.framework.ShareSDKCallback
        public /* synthetic */ void onCallback(String str) {
        }
    }

    /* renamed from: cn.sharesdk.tencent.qq.QQ$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements PlatformActionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Platform.ShareParams f337a;
        public final /* synthetic */ QQ b;

        public AnonymousClass3(QQ qq, Platform.ShareParams shareParams) {
        }

        @Override // cn.sharesdk.framework.PlatformActionListener
        public void onCancel(Platform platform, int i2) {
        }

        @Override // cn.sharesdk.framework.PlatformActionListener
        public void onComplete(Platform platform, int i2, HashMap<String, Object> hashMap) {
        }

        @Override // cn.sharesdk.framework.PlatformActionListener
        public void onError(Platform platform, int i2, Throwable th) {
        }
    }

    /* renamed from: cn.sharesdk.tencent.qq.QQ$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 extends j.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ QQ f338a;

        /* renamed from: cn.sharesdk.tencent.qq.QQ$4$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements DH.DHResponder {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass4 f339a;

            public AnonymousClass1(AnonymousClass4 anonymousClass4) {
            }

            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
            }
        }

        public AnonymousClass4(QQ qq) {
        }

        @Override // cn.sharesdk.framework.utils.j.a
        public void a() throws Throwable {
        }
    }

    public static /* synthetic */ PlatformActionListener a(QQ qq) {
    }

    public static /* synthetic */ PlatformActionListener b(QQ qq) {
    }

    public static /* synthetic */ PlatformDb c(QQ qq) {
    }

    public static /* synthetic */ PlatformDb d(QQ qq) {
    }

    public static /* synthetic */ PlatformDb e(QQ qq) {
    }

    public static /* synthetic */ PlatformDb f(QQ qq) {
    }

    public static /* synthetic */ PlatformDb g(QQ qq) {
    }

    public static /* synthetic */ PlatformDb h(QQ qq) {
    }

    public static /* synthetic */ PlatformDb i(QQ qq) {
    }

    public static /* synthetic */ PlatformActionListener j(QQ qq) {
    }

    public static /* synthetic */ PlatformActionListener k(QQ qq) {
    }

    public static /* synthetic */ PlatformActionListener l(QQ qq) {
    }

    public static /* synthetic */ PlatformActionListener m(QQ qq) {
    }

    public static /* synthetic */ PlatformActionListener n(QQ qq) {
    }

    public static /* synthetic */ PlatformActionListener o(QQ qq) {
    }

    public static /* synthetic */ PlatformActionListener p(QQ qq) {
    }

    public static /* synthetic */ PlatformActionListener q(QQ qq) {
    }

    public static /* synthetic */ Object r(QQ qq) {
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean checkAuthorize(int i2, Object obj) {
    }

    @Override // cn.sharesdk.framework.Platform
    public void doAuthorize(String[] strArr) {
    }

    @Override // cn.sharesdk.framework.Platform
    public void doCustomerProtocol(String str, String str2, int i2, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
    }

    @Override // cn.sharesdk.framework.Platform
    public void doShare(Platform.ShareParams shareParams) {
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> filterFriendshipInfo(int i2, HashMap<String, Object> hashMap) {
    }

    @Override // cn.sharesdk.framework.Platform
    public f.a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
    }

    @Override // cn.sharesdk.framework.Platform
    public void follow(String str) {
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getBilaterals(int i2, int i3, String str) {
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getFollowers(int i2, int i3, String str) {
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getFollowings(int i2, int i3, String str) {
    }

    @Override // cn.sharesdk.framework.Platform
    public void getFriendList(int i2, int i3, String str) {
    }

    @Override // cn.sharesdk.framework.Platform
    public String getName() {
    }

    @Override // cn.sharesdk.framework.Platform
    public int getPlatformId() {
    }

    @Override // cn.sharesdk.framework.Platform
    public int getVersion() {
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean hasShareCallback() {
    }

    @Override // cn.sharesdk.framework.Platform
    public void initDevInfo(String str) {
    }

    @Override // cn.sharesdk.framework.Platform
    public void isClientValid(ShareSDKCallback<Boolean> shareSDKCallback) {
    }

    @Override // cn.sharesdk.framework.Platform
    public void setNetworkDevinfo() {
    }

    @Override // cn.sharesdk.framework.Platform
    public void timeline(int i2, int i3, String str) {
    }

    @Override // cn.sharesdk.framework.Platform
    public String uploadImageToFileServer(String str) {
    }

    @Override // cn.sharesdk.framework.Platform
    public void userInfor(String str) {
    }

    public static /* synthetic */ String a(QQ qq, String str) {
    }

    public static /* synthetic */ void a(QQ qq, int i2, Object obj) {
    }

    public static /* synthetic */ void a(QQ qq, cn.sharesdk.tencent.qq.utils.a aVar, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i2, String str7, String str8, String str9, int i3, Platform.ShareParams shareParams) {
    }

    private void a(cn.sharesdk.tencent.qq.utils.a aVar, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i2, String str7, String str8, String str9, int i3, Platform.ShareParams shareParams) {
    }
}
