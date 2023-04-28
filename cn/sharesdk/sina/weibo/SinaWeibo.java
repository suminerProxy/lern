package cn.sharesdk.sina.weibo;

import android.os.Bundle;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.PlatformDb;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SinaWeibo extends Platform {
    public static final String NAME = "SinaWeibo";
    public static volatile boolean initFlag;

    /* renamed from: a  reason: collision with root package name */
    private String f270a;
    private String b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f271d;

    /* renamed from: cn.sharesdk.sina.weibo.SinaWeibo$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements AuthorizeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f272a;
        public final /* synthetic */ SinaWeibo b;

        public AnonymousClass1(SinaWeibo sinaWeibo, a aVar) {
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

    public static /* synthetic */ PlatformDb a(SinaWeibo sinaWeibo) {
    }

    public static /* synthetic */ PlatformDb b(SinaWeibo sinaWeibo) {
    }

    public static /* synthetic */ PlatformDb c(SinaWeibo sinaWeibo) {
    }

    public static /* synthetic */ PlatformDb d(SinaWeibo sinaWeibo) {
    }

    public static /* synthetic */ PlatformDb e(SinaWeibo sinaWeibo) {
    }

    public static /* synthetic */ PlatformActionListener f(SinaWeibo sinaWeibo) {
    }

    public static /* synthetic */ PlatformActionListener g(SinaWeibo sinaWeibo) {
    }

    public static /* synthetic */ PlatformActionListener h(SinaWeibo sinaWeibo) {
    }

    public static /* synthetic */ PlatformActionListener i(SinaWeibo sinaWeibo) {
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

    public static /* synthetic */ void a(SinaWeibo sinaWeibo, int i2, Object obj) {
    }

    private boolean c() {
    }
}
