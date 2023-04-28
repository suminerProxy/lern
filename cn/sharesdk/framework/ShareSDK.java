package cn.sharesdk.framework;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import cn.sharesdk.framework.loopshare.LoopSharePasswordListener;
import cn.sharesdk.framework.loopshare.LoopShareResultListener;
import cn.sharesdk.framework.loopshare.MoblinkActionListener;
import cn.sharesdk.framework.loopshare.watermark.ReadQrImageListener;
import cn.sharesdk.framework.loopshare.watermark.WaterMarkListener;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ShareSDK {
    public static final String SDK_TAG = "SHARESDK";
    public static final int SDK_VERSION_CODE = 0;
    public static final String SDK_VERSION_NAME = "3.10.7";
    public static final String SHARESDK_MOBLINK_RESTORE = "sharesdk_moblink_restore";

    /* renamed from: a  reason: collision with root package name */
    private static i f86a = null;
    private static boolean b = true;
    private static String c;

    /* renamed from: d  reason: collision with root package name */
    private static HashMap<String, Object> f87d;

    /* renamed from: e  reason: collision with root package name */
    private static List<HashMap<String, Object>> f88e;

    /* renamed from: f  reason: collision with root package name */
    private static int f89f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile boolean f90g;

    /* renamed from: cn.sharesdk.framework.ShareSDK$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements Runnable {

        /* renamed from: cn.sharesdk.framework.ShareSDK$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class HandlerC00081 extends Handler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f91a;

            public HandlerC00081(AnonymousClass1 anonymousClass1, Looper looper) {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
            }
        }

        /* renamed from: cn.sharesdk.framework.ShareSDK$1$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Handler f92a;
            public final /* synthetic */ AnonymousClass1 b;

            public AnonymousClass2(AnonymousClass1 anonymousClass1, Handler handler) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    @Deprecated
    public static String a(Bitmap bitmap) {
    }

    @Deprecated
    public static String a(String str) {
    }

    public static void a(String str, String str2) {
    }

    @Deprecated
    public static boolean b() throws Throwable {
    }

    public static /* synthetic */ void c() throws Throwable {
    }

    public static void closeDebug() {
    }

    public static /* synthetic */ i d() {
    }

    public static void deleteCache() {
    }

    public static /* synthetic */ HashMap e() {
    }

    public static /* synthetic */ String f() {
    }

    public static /* synthetic */ List g() {
    }

    public static Activity getAuthActivity() {
    }

    @Deprecated
    public static HashMap<String, Object> getCustomDataFromLoopShare() {
    }

    public static String getDevinfo(String str, String str2) {
    }

    @Deprecated
    public static boolean getEnableAuthTag() {
    }

    @Deprecated
    public static void getFirstQrImage(Context context, ReadQrImageListener readQrImageListener) {
    }

    public static Platform getPlatform(String str) {
    }

    public static Platform[] getPlatformList() {
    }

    @Deprecated
    public static Bitmap getQRCodeBitmap(String str, int i2, int i3) throws Throwable {
    }

    public static <T extends Service> T getService(Class<T> cls) throws Throwable {
    }

    public static /* synthetic */ int h() {
    }

    public static /* synthetic */ int i() {
    }

    public static boolean isDebug() {
    }

    public static boolean isFBInstagram() {
    }

    public static boolean isRemoveCookieOnAuthorize() {
    }

    private static boolean j() throws Throwable {
    }

    private static synchronized void k() throws Throwable {
    }

    private static void l() {
    }

    public static void logApiEvent(String str, int i2) {
    }

    public static void logDemoEvent(int i2, Platform platform) {
    }

    @Deprecated
    public static void makeVideoWaterMark(String str, String str2, String str3, String str4, WaterMarkListener waterMarkListener) {
    }

    @Deprecated
    public static void mobLinkGetMobID(HashMap<String, Object> hashMap, MoblinkActionListener moblinkActionListener) {
    }

    public static String platformIdToName(int i2) {
    }

    public static int platformNameToId(String str) {
    }

    @Deprecated
    public static void prepareLoopShare(LoopShareResultListener loopShareResultListener) {
    }

    @Deprecated
    public static void preparePassWord(HashMap<String, Object> hashMap, String str, LoopSharePasswordListener loopSharePasswordListener) {
    }

    @Deprecated
    public static void readPassWord(boolean z, LoopSharePasswordListener loopSharePasswordListener) {
    }

    public static void registerPlatform(Class<? extends CustomPlatform> cls) throws Throwable {
    }

    public static void registerService(Class<? extends Service> cls) {
    }

    public static void removeCookieOnAuthorize(boolean z) {
    }

    public static void setActivity(Activity activity) {
    }

    public static void setCloseGppService(boolean z) {
    }

    public static void setConnTimeout(int i2) {
    }

    @Deprecated
    public static void setEnableAuthTag(boolean z) {
    }

    public static void setFBInstagram(boolean z) {
    }

    public static void setPlatformDevInfo(String str, HashMap<String, Object> hashMap) {
    }

    public static void setPlatformDevInfos(List<HashMap<String, Object>> list) {
    }

    public static void setReadTimeout(int i2) {
    }

    public static void unregisterPlatform(Class<? extends CustomPlatform> cls) throws Throwable {
    }

    public static void unregisterService(Class<? extends Service> cls) {
    }

    public static void a(int i2, int i3) {
    }

    public static String a(int i2, String str) {
    }

    public static boolean a() {
    }

    public static void a(String str, boolean z, int i2, String str2, ShareSDKCallback<String> shareSDKCallback) {
    }
}
