package cn.sharesdk.tencent.qq;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import com.mob.tools.FakeActivity;
import com.mob.tools.utils.DH;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ShareActivity extends FakeActivity {
    private static final List<String> OPEN_MINI_APP_TYPES = null;
    private static final String QQ_PACKAGE_NAME = "com.tencent.mobileqq";
    private static final int START_ACTIVITY_CODE = 256;
    private String appId;
    private PlatformActionListener listener;
    private Platform platform;
    private String uriScheme;

    /* renamed from: cn.sharesdk.tencent.qq.ShareActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f340a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f341d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f342e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f343f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ String f344g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ String f345h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ int f346i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f347j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ String f348k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ String f349l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ ShareActivity f350m;

        /* renamed from: cn.sharesdk.tencent.qq.ShareActivity$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class C00171 extends Thread {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f351a;
            public final /* synthetic */ AnonymousClass1 b;

            public C00171(AnonymousClass1 anonymousClass1, String str) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(ShareActivity shareActivity, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i3, String str8, String str9, String str10) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* renamed from: cn.sharesdk.tencent.qq.ShareActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f352a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ShareActivity f353d;

        public AnonymousClass2(ShareActivity shareActivity, String str, String str2, String str3) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    public static /* synthetic */ PlatformActionListener access$000(ShareActivity shareActivity) {
    }

    public static /* synthetic */ Platform access$100(ShareActivity shareActivity) {
    }

    public static /* synthetic */ Activity access$1000(ShareActivity shareActivity) {
    }

    public static /* synthetic */ void access$200(ShareActivity shareActivity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, int i3) {
    }

    public static /* synthetic */ List access$300() {
    }

    public static /* synthetic */ void access$400(ShareActivity shareActivity, String str, String str2, String str3) {
    }

    public static /* synthetic */ Activity access$500(ShareActivity shareActivity) {
    }

    public static /* synthetic */ void access$600(ShareActivity shareActivity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, int i3) {
    }

    public static /* synthetic */ String access$700(ShareActivity shareActivity) {
    }

    public static /* synthetic */ Activity access$800(ShareActivity shareActivity) {
    }

    public static /* synthetic */ Activity access$900(ShareActivity shareActivity) {
    }

    private void advancedShare(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, int i3) {
    }

    public static int compareVersion(String str, String str2) {
    }

    public static String encodeToString(String str) {
    }

    public static String getPackageName(String str) {
    }

    private int[] getQQClientVersion() {
    }

    @SuppressLint({"WrongConstant"})
    private String getShareScheme(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, int i3) {
    }

    private void openMiniProgram(String str, String str2, String str3) {
    }

    public static int resultCompareVersion(String str) {
    }

    private void shareMiniProgram(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, int i3) {
    }

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
    }

    public void setAppId(String str) {
    }

    public void setPlatformActionListener(Platform platform, PlatformActionListener platformActionListener) {
    }
}
