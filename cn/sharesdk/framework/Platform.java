package cn.sharesdk.framework;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.utils.j;
import com.mob.tools.utils.DH;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class Platform {
    public static final int ACTION_AUTHORIZING = 1;
    public static final int ACTION_CUSTOMER = 655360;
    public static final int ACTION_FOLLOWING_USER = 6;
    public static final int ACTION_GETTING_BILATERAL_LIST = 10;
    public static final int ACTION_GETTING_FOLLOWER_LIST = 11;
    public static final int ACTION_GETTING_FRIEND_LIST = 2;
    public static final int ACTION_SENDING_DIRECT_MESSAGE = 5;
    public static final int ACTION_SHARE = 9;
    public static final int ACTION_TIMELINE = 7;
    public static final int ACTION_USER_INFOR = 8;
    public static final int CUSTOMER_ACTION_MASK = 65535;
    public static final int DY_MIXFILE = 23;
    public static final int GGP_REFUSE = 21;
    public static final int INSTAGRAM_FRIEND = 13;
    public static final int KAKAO_COMMERCE_TEMPLATE = 18;
    public static final int KAKAO_CUSTOM_TEMPLATE = 20;
    public static final int KAKAO_FEED_TEMPLATE = 16;
    public static final int KAKAO_TEXT_TEMPLATE = 19;
    public static final int KAKAO_URL_TEMPLATE = 17;
    public static final int OPEN_QQMINIPROGRAM = 22;
    public static final int OPEN_WXMINIPROGRAM = 12;
    public static final int QQ_MINI_PROGRAM = 15;
    public static final int SHARE_APPS = 7;
    public static final int SHARE_DYIM_IMG = 24;
    public static final int SHARE_DYIM_WEBPAGE = 25;
    public static final int SHARE_EMOJI = 9;
    public static final int SHARE_FILE = 8;
    public static final int SHARE_IMAGE = 2;
    public static final int SHARE_LINKCARD = 14;
    public static final int SHARE_MUSIC = 5;
    public static final int SHARE_TEXT = 1;
    public static final int SHARE_VIDEO = 6;
    public static final int SHARE_WEBPAGE = 4;
    public static final int SHARE_WXMINIPROGRAM = 11;
    public static final int SHARE_ZHIFUBAO = 10;

    /* renamed from: a  reason: collision with root package name */
    private f f64a;
    private final Object b;
    public final PlatformDb db;
    public volatile boolean isClientValid;
    public PlatformActionListener listener;
    public String pkgName;
    public final PlatformActionListener uIListener;

    /* renamed from: cn.sharesdk.framework.Platform$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements PlatformActionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Platform f65a;

        /* renamed from: cn.sharesdk.framework.Platform$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class C00071 implements Handler.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Platform f66a;
            public final /* synthetic */ int b;
            public final /* synthetic */ Throwable c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f67d;

            public C00071(AnonymousClass1 anonymousClass1, Platform platform, int i2, Throwable th) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        }

        /* renamed from: cn.sharesdk.framework.Platform$1$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 implements Handler.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Platform f68a;
            public final /* synthetic */ int b;
            public final /* synthetic */ HashMap c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f69d;

            public AnonymousClass2(AnonymousClass1 anonymousClass1, Platform platform, int i2, HashMap hashMap) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        }

        /* renamed from: cn.sharesdk.framework.Platform$1$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass3 implements Handler.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Platform f70a;
            public final /* synthetic */ int b;
            public final /* synthetic */ AnonymousClass1 c;

            public AnonymousClass3(AnonymousClass1 anonymousClass1, Platform platform, int i2) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        }

        public AnonymousClass1(Platform platform) {
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

    /* renamed from: cn.sharesdk.framework.Platform$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends j.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Platform f71a;

        /* renamed from: cn.sharesdk.framework.Platform$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements ShareSDKCallback<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass2 f72a;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            public void a(Boolean bool) {
            }

            @Override // cn.sharesdk.framework.ShareSDKCallback
            public /* synthetic */ void onCallback(Boolean bool) {
            }
        }

        public AnonymousClass2(Platform platform) {
        }

        @Override // cn.sharesdk.framework.utils.j.a
        public void a() throws Throwable {
        }
    }

    /* renamed from: cn.sharesdk.framework.Platform$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareSDKCallback f73a;
        public final /* synthetic */ Platform b;

        public AnonymousClass3(Platform platform, ShareSDKCallback shareSDKCallback) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* renamed from: cn.sharesdk.framework.Platform$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements ShareSDKCallback<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f74a;
        public final /* synthetic */ Platform b;

        public AnonymousClass4(Platform platform, String[] strArr) {
        }

        public void a(Boolean bool) {
        }

        @Override // cn.sharesdk.framework.ShareSDKCallback
        public /* synthetic */ void onCallback(Boolean bool) {
        }
    }

    /* renamed from: cn.sharesdk.framework.Platform$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements ShareSDKCallback<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareParams f75a;
        public final /* synthetic */ Platform b;

        public AnonymousClass5(Platform platform, ShareParams shareParams) {
        }

        public void a(Boolean bool) {
        }

        @Override // cn.sharesdk.framework.ShareSDKCallback
        public /* synthetic */ void onCallback(Boolean bool) {
        }
    }

    /* renamed from: cn.sharesdk.framework.Platform$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass6 implements ShareSDKCallback<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareParams f76a;
        public final /* synthetic */ Platform b;

        public AnonymousClass6(Platform platform, ShareParams shareParams) {
        }

        public void a(Boolean bool) {
        }

        @Override // cn.sharesdk.framework.ShareSDKCallback
        public /* synthetic */ void onCallback(Boolean bool) {
        }
    }

    /* renamed from: cn.sharesdk.framework.Platform$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass7 implements ShareSDKCallback<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f77a;
        public final /* synthetic */ Platform b;

        public AnonymousClass7(Platform platform, String str) {
        }

        public void a(Boolean bool) {
        }

        @Override // cn.sharesdk.framework.ShareSDKCallback
        public /* synthetic */ void onCallback(Boolean bool) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ShareParams extends InnerShareParams {
        public ShareParams() {
        }

        public ShareParams(HashMap<String, Object> hashMap) {
        }

        public ShareParams(String str) {
        }
    }

    public static /* synthetic */ Object a(Platform platform) {
    }

    public static /* synthetic */ f b(Platform platform) {
    }

    public void SSOSetting(boolean z) {
    }

    public void afterRegister(int i2, Object obj) {
    }

    public void authorize() {
    }

    public abstract boolean checkAuthorize(int i2, Object obj);

    public void copyDevinfo(String str, String str2) {
    }

    public void copyNetworkDevinfo(int i2, int i3) {
    }

    public void customerProtocol(String str, String str2, short s, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
    }

    public abstract void doAuthorize(String[] strArr);

    public abstract void doCustomerProtocol(String str, String str2, int i2, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2);

    public abstract void doShare(ShareParams shareParams);

    public abstract HashMap<String, Object> filterFriendshipInfo(int i2, HashMap<String, Object> hashMap);

    public abstract f.a filterShareContent(ShareParams shareParams, HashMap<String, Object> hashMap);

    public abstract void follow(String str);

    public void followFriend(String str) {
    }

    public abstract HashMap<String, Object> getBilaterals(int i2, int i3, String str);

    public PlatformDb getDb() {
    }

    public String getDevinfo(String str) {
    }

    public abstract HashMap<String, Object> getFollowers(int i2, int i3, String str);

    public abstract HashMap<String, Object> getFollowings(int i2, int i3, String str);

    public abstract void getFriendList(int i2, int i3, String str);

    public int getId() {
    }

    public abstract String getName();

    public String getNetworkDevinfo(String str, String str2) {
    }

    public PlatformActionListener getPlatformActionListener() {
    }

    public abstract int getPlatformId();

    public void getShortLintk(String str, boolean z, ShareSDKCallback<String> shareSDKCallback) {
    }

    public int getSortId() {
    }

    public void getTimeLine(String str, int i2, int i3) {
    }

    public abstract int getVersion();

    public abstract boolean hasShareCallback();

    public abstract void initDevInfo(String str);

    public void innerAuthorize(int i2, Object obj) {
    }

    public boolean isAuthValid() {
    }

    @Deprecated
    public boolean isClientValid() {
    }

    public boolean isSSODisable() {
    }

    public void listFriend(int i2, int i3, String str) {
    }

    public void removeAccount(boolean z) {
    }

    public abstract void setNetworkDevinfo();

    public void setPlatformActionListener(PlatformActionListener platformActionListener) {
    }

    public void share(ShareParams shareParams) {
    }

    public void showUser(String str) {
    }

    public void subscribeAuth(ShareParams shareParams) {
    }

    public abstract void timeline(int i2, int i3, String str);

    public String uploadImageToFileServer(String str) {
    }

    public abstract void userInfor(String str);

    public void a() {
    }

    public void authorize(String[] strArr) {
    }

    public boolean b() {
    }

    public String getDevinfo(String str, String str2) {
    }

    public String getNetworkDevinfo(int i2, String str, String str2) {
    }

    public String getShortLintk(String str, boolean z, HashMap<String, String> hashMap) {
    }

    public String uploadImageToFileServer(Bitmap bitmap) {
    }

    public void isClientValid(ShareSDKCallback<Boolean> shareSDKCallback) {
    }
}
