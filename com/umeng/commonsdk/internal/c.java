package com.umeng.commonsdk.internal;

import android.content.Context;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import com.umeng.commonsdk.utils.onMessageSendListener;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* compiled from: UMInternalDataProtocol.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class c implements UMLogDataProtocol {

    /* renamed from: a  reason: collision with root package name */
    public static final String f15200a = "um_policy_grant";
    public static final String b = "preInitInvokedFlag";
    public static final String c = "policyGrantInvokedFlag";

    /* renamed from: d  reason: collision with root package name */
    public static final String f15201d = "policyGrantResult";

    /* renamed from: f  reason: collision with root package name */
    private static int f15202f = 1;

    /* renamed from: g  reason: collision with root package name */
    private static final String f15203g = "info";

    /* renamed from: h  reason: collision with root package name */
    private static final String f15204h = "stat";

    /* renamed from: i  reason: collision with root package name */
    private static Class<?> f15205i;

    /* renamed from: j  reason: collision with root package name */
    private static Method f15206j;

    /* renamed from: k  reason: collision with root package name */
    private static Method f15207k;

    /* renamed from: l  reason: collision with root package name */
    private static Method f15208l;

    /* renamed from: m  reason: collision with root package name */
    private static boolean f15209m;

    /* renamed from: e  reason: collision with root package name */
    private Context f15210e;

    /* compiled from: UMInternalDataProtocol.java */
    /* renamed from: com.umeng.commonsdk.internal.c$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15211a;

        public AnonymousClass1(Context context) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: UMInternalDataProtocol.java */
    /* renamed from: com.umeng.commonsdk.internal.c$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass2 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15212a;
        public final /* synthetic */ OnGetOaidListener b;

        public AnonymousClass2(Context context, OnGetOaidListener onGetOaidListener) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: UMInternalDataProtocol.java */
    /* renamed from: com.umeng.commonsdk.internal.c$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass3 implements OnGetOaidListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15213a;

        public AnonymousClass3(Context context) {
        }

        @Override // com.umeng.commonsdk.listener.OnGetOaidListener
        public void onGetOaid(String str) {
        }
    }

    /* compiled from: UMInternalDataProtocol.java */
    /* renamed from: com.umeng.commonsdk.internal.c$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements OnGetOaidListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f15214a;

        public AnonymousClass4(c cVar) {
        }

        @Override // com.umeng.commonsdk.listener.OnGetOaidListener
        public void onGetOaid(String str) {
        }
    }

    /* compiled from: UMInternalDataProtocol.java */
    /* renamed from: com.umeng.commonsdk.internal.c$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements onMessageSendListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f15215a;

        public AnonymousClass5(c cVar) {
        }

        @Override // com.umeng.commonsdk.utils.onMessageSendListener
        public void onMessageSend() {
        }
    }

    public c(Context context) {
    }

    public static /* synthetic */ Context a(c cVar) {
    }

    public static String b() {
    }

    private static void c() {
    }

    private void d() {
    }

    private void e() {
    }

    private void f() {
    }

    private void g() {
    }

    private void h() {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j2) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i2) {
    }

    public String a() {
    }

    private void b(Context context) {
    }

    private static void g(Context context) {
    }

    private void a(Context context) {
    }

    private void e(Context context) {
    }

    private static void c(Context context) {
    }

    private void f(Context context) {
    }

    private static void a(Context context, OnGetOaidListener onGetOaidListener) {
    }

    private static Class<?> a(String str) {
    }

    private static void d(Context context) {
    }
}
