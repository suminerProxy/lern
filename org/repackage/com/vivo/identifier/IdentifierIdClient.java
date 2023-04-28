package org.repackage.com.vivo.identifier;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class IdentifierIdClient {
    private static String A = null;
    private static volatile IdentifierIdClient B = null;
    private static volatile DataBaseOperation C = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f29922a = "VMS_IDLG_SDK_Client";
    private static final String b = "content://com.vivo.vms.IdProvider/IdentifierId";
    private static final String c = "persist.sys.identifierid.supported";

    /* renamed from: d  reason: collision with root package name */
    private static final String f29923d = "appid";

    /* renamed from: e  reason: collision with root package name */
    private static final String f29924e = "type";

    /* renamed from: f  reason: collision with root package name */
    private static final String f29925f = "OAID";

    /* renamed from: g  reason: collision with root package name */
    private static final String f29926g = "VAID";

    /* renamed from: h  reason: collision with root package name */
    private static final String f29927h = "AAID";

    /* renamed from: i  reason: collision with root package name */
    private static final int f29928i = 0;

    /* renamed from: j  reason: collision with root package name */
    private static final int f29929j = 1;

    /* renamed from: k  reason: collision with root package name */
    private static final int f29930k = 2;

    /* renamed from: l  reason: collision with root package name */
    private static final int f29931l = 4;

    /* renamed from: m  reason: collision with root package name */
    private static final int f29932m = 11;

    /* renamed from: n  reason: collision with root package name */
    private static final int f29933n = 2000;

    /* renamed from: o  reason: collision with root package name */
    private static Context f29934o;

    /* renamed from: p  reason: collision with root package name */
    private static boolean f29935p;
    private static IdentifierIdObserver q;
    private static IdentifierIdObserver r;
    private static IdentifierIdObserver s;
    private static Object t;
    private static HandlerThread u;
    private static Handler v;
    private static String w;
    private static String x;
    private static String y;
    private static String z;

    /* renamed from: org.repackage.com.vivo.identifier.IdentifierIdClient$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class AnonymousClass1 extends Handler {
        public AnonymousClass1(Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    private IdentifierIdClient() {
    }

    public static IdentifierIdClient a(Context context) {
    }

    public static /* synthetic */ String c(String str) {
    }

    public static void d() {
    }

    public static /* synthetic */ DataBaseOperation e() {
    }

    public static /* synthetic */ Object f() {
    }

    private static void g() {
    }

    public String b() {
    }

    public String c() {
    }

    public String b(String str) {
    }

    private void b(int i2, String str) {
    }

    public boolean a() {
    }

    public String a(String str) {
    }

    public void a(int i2, String str) {
    }

    public static String a(String str, String str2) {
    }

    private static void a(Context context, int i2, String str) {
    }
}
