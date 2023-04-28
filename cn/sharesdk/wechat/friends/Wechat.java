package cn.sharesdk.wechat.friends;

import android.os.Bundle;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Wechat extends Platform {
    public static final String NAME = "Wechat";

    /* renamed from: a  reason: collision with root package name */
    private String f404a;
    private String b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private String f405d;

    /* renamed from: e  reason: collision with root package name */
    private String f406e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f407f;

    /* renamed from: g  reason: collision with root package name */
    private int f408g;

    /* renamed from: cn.sharesdk.wechat.friends.Wechat$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements AuthorizeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Wechat f409a;

        public AnonymousClass1(Wechat wechat) {
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

    public static /* synthetic */ PlatformActionListener a(Wechat wechat) {
    }

    public static /* synthetic */ PlatformActionListener b(Wechat wechat) {
    }

    public static /* synthetic */ PlatformActionListener c(Wechat wechat) {
    }

    public static /* synthetic */ PlatformActionListener d(Wechat wechat) {
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
    public void subscribeAuth(Platform.ShareParams shareParams) {
    }

    @Override // cn.sharesdk.framework.Platform
    public void timeline(int i2, int i3, String str) {
    }

    @Override // cn.sharesdk.framework.Platform
    public void userInfor(String str) {
    }

    public static /* synthetic */ void a(Wechat wechat, int i2, Object obj) {
    }

    private boolean c() {
    }
}
