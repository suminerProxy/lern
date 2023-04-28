package com.baidu.lbsapi.auth;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.io.IOException;
import java.util.Hashtable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LBSAuthManager {
    public static final int CODE_AUTHENTICATE_SUCC = 0;
    public static final int CODE_AUTHENTICATING = 602;
    public static final int CODE_INNER_ERROR = -1;
    public static final int CODE_KEY_NOT_EXIST = 101;
    public static final int CODE_NETWORK_FAILED = -11;
    public static final int CODE_NETWORK_INVALID = -10;
    public static final int CODE_UNAUTHENTICATE = 601;
    public static final String VERSION = "1.0.25";

    /* renamed from: a  reason: collision with root package name */
    private static Context f1065a;

    /* renamed from: d  reason: collision with root package name */
    private static m f1066d;

    /* renamed from: e  reason: collision with root package name */
    private static int f1067e;

    /* renamed from: f  reason: collision with root package name */
    private static Hashtable<String, LBSAuthManagerListener> f1068f;

    /* renamed from: g  reason: collision with root package name */
    private static LBSAuthManager f1069g;

    /* renamed from: i  reason: collision with root package name */
    private static String f1070i;

    /* renamed from: j  reason: collision with root package name */
    private static String f1071j;

    /* renamed from: k  reason: collision with root package name */
    private static String f1072k;

    /* renamed from: l  reason: collision with root package name */
    private static String[] f1073l;
    private c b;
    private e c;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1074h;

    /* renamed from: m  reason: collision with root package name */
    private final Handler f1075m;

    private LBSAuthManager(Context context) {
    }

    private int a(String str) {
    }

    private String a(int i2) throws IOException {
    }

    private String a(Context context) {
    }

    private String a(Context context, String str) {
    }

    public static /* synthetic */ Hashtable a() {
    }

    public static /* synthetic */ void a(LBSAuthManager lBSAuthManager, String str, String str2) {
    }

    public static /* synthetic */ void a(LBSAuthManager lBSAuthManager, boolean z, String str, Hashtable hashtable, String str2) {
    }

    public static /* synthetic */ void a(LBSAuthManager lBSAuthManager, boolean z, String str, Hashtable hashtable, String[] strArr, String str2) {
    }

    private synchronized void a(String str, String str2) {
    }

    private void a(boolean z, String str, Hashtable<String, String> hashtable, String str2) {
    }

    private void a(boolean z, String str, Hashtable<String, String> hashtable, String[] strArr, String str2) {
    }

    public static /* synthetic */ boolean a(LBSAuthManager lBSAuthManager, String str) {
    }

    private boolean b(String str) {
    }

    public static /* synthetic */ String[] b() {
    }

    public static /* synthetic */ Context c() {
    }

    private void c(String str) {
    }

    public static /* synthetic */ m d() {
    }

    private void e() {
    }

    private String f() {
    }

    private String g() {
    }

    public static LBSAuthManager getInstance(Context context) {
    }

    public int authenticate(boolean z, String str, Hashtable<String, String> hashtable, LBSAuthManagerListener lBSAuthManagerListener) {
    }

    public String getCUID() {
    }

    public String getKey() {
    }

    public String getMCode() {
    }

    public String getPublicKey(Context context) throws PackageManager.NameNotFoundException {
    }

    public void setKey(String str) {
    }

    public void setMCode(String str) {
    }

    public void setMCodes(String[] strArr) {
    }

    public void setPackageName(String str) {
    }
}
