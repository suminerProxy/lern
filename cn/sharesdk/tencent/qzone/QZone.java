package cn.sharesdk.tencent.qzone;

import android.os.Bundle;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.PlatformDb;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.tencent.qzone.utils.b;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class QZone extends Platform {
    public static final String NAME = "QZone";

    /* renamed from: a  reason: collision with root package name */
    private String f368a;
    private boolean b;

    /* renamed from: cn.sharesdk.tencent.qzone.QZone$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements AuthorizeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f369a;
        public final /* synthetic */ QZone b;

        public AnonymousClass1(QZone qZone, b bVar) {
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

    /* renamed from: cn.sharesdk.tencent.qzone.QZone$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements PlatformActionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PlatformActionListener f370a;
        public final /* synthetic */ Platform.ShareParams b;
        public final /* synthetic */ QZone c;

        public AnonymousClass2(QZone qZone, PlatformActionListener platformActionListener, Platform.ShareParams shareParams) {
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

    /* renamed from: cn.sharesdk.tencent.qzone.QZone$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements ShareSDKCallback<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Platform.ShareParams f371a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ QZone f372d;

        public AnonymousClass3(QZone qZone, Platform.ShareParams shareParams, boolean z, String str) {
        }

        public void a(String str) {
        }

        @Override // cn.sharesdk.framework.ShareSDKCallback
        public /* synthetic */ void onCallback(String str) {
        }
    }

    /* renamed from: cn.sharesdk.tencent.qzone.QZone$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements PlatformActionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Platform.ShareParams f373a;
        public final /* synthetic */ QZone b;

        public AnonymousClass4(QZone qZone, Platform.ShareParams shareParams) {
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

    public static /* synthetic */ PlatformActionListener a(QZone qZone) {
    }

    public static /* synthetic */ PlatformActionListener b(QZone qZone) {
    }

    public static /* synthetic */ PlatformDb c(QZone qZone) {
    }

    public static /* synthetic */ PlatformDb d(QZone qZone) {
    }

    public static /* synthetic */ PlatformDb e(QZone qZone) {
    }

    public static /* synthetic */ PlatformDb f(QZone qZone) {
    }

    public static /* synthetic */ PlatformDb g(QZone qZone) {
    }

    public static /* synthetic */ PlatformDb h(QZone qZone) {
    }

    public static /* synthetic */ PlatformDb i(QZone qZone) {
    }

    public static /* synthetic */ PlatformActionListener j(QZone qZone) {
    }

    public static /* synthetic */ PlatformActionListener k(QZone qZone) {
    }

    public static /* synthetic */ PlatformActionListener l(QZone qZone) {
    }

    public static /* synthetic */ PlatformActionListener m(QZone qZone) {
    }

    public static /* synthetic */ PlatformActionListener n(QZone qZone) {
    }

    public static /* synthetic */ PlatformActionListener o(QZone qZone) {
    }

    public static /* synthetic */ PlatformActionListener p(QZone qZone) {
    }

    public static /* synthetic */ PlatformActionListener q(QZone qZone) {
    }

    public static /* synthetic */ PlatformActionListener r(QZone qZone) {
    }

    public static /* synthetic */ PlatformActionListener s(QZone qZone) {
    }

    public static /* synthetic */ PlatformActionListener t(QZone qZone) {
    }

    public static /* synthetic */ PlatformActionListener u(QZone qZone) {
    }

    public static /* synthetic */ PlatformActionListener v(QZone qZone) {
    }

    public static /* synthetic */ PlatformActionListener w(QZone qZone) {
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
    public void userInfor(String str) {
    }

    public static /* synthetic */ void a(QZone qZone, int i2, Object obj) {
    }

    private void b(Platform.ShareParams shareParams) {
    }

    private void c(Platform.ShareParams shareParams) {
    }

    private void a(Platform.ShareParams shareParams) throws Throwable {
    }
}
