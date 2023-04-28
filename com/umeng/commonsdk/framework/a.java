package com.umeng.commonsdk.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: UMNetWorkSender.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class a implements UMImprintChangeCallback {

    /* renamed from: a  reason: collision with root package name */
    private static HandlerThread f15170a = null;
    private static Handler b = null;
    private static Handler c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final int f15171d = 200;

    /* renamed from: e  reason: collision with root package name */
    private static final int f15172e = 273;

    /* renamed from: f  reason: collision with root package name */
    private static final int f15173f = 274;

    /* renamed from: g  reason: collision with root package name */
    private static final int f15174g = 512;

    /* renamed from: h  reason: collision with root package name */
    private static final int f15175h = 769;

    /* renamed from: i  reason: collision with root package name */
    private static FileObserverC0279a f15176i = null;

    /* renamed from: j  reason: collision with root package name */
    private static ConnectivityManager f15177j = null;

    /* renamed from: k  reason: collision with root package name */
    private static IntentFilter f15178k = null;

    /* renamed from: l  reason: collision with root package name */
    private static volatile boolean f15179l = false;

    /* renamed from: m  reason: collision with root package name */
    private static ArrayList<UMSenderStateNotify> f15180m = null;

    /* renamed from: n  reason: collision with root package name */
    private static Object f15181n = null;

    /* renamed from: o  reason: collision with root package name */
    private static ReentrantLock f15182o = null;

    /* renamed from: p  reason: collision with root package name */
    private static final String f15183p = "report_policy";
    private static final String q = "report_interval";
    private static boolean r = false;
    private static final int s = 15;
    private static final int t = 3;
    private static final int u = 90;
    private static int v;
    private static Object w;
    private static BroadcastReceiver x;

    /* compiled from: UMNetWorkSender.java */
    /* renamed from: com.umeng.commonsdk.framework.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* compiled from: UMNetWorkSender.java */
    /* renamed from: com.umeng.commonsdk.framework.a$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f15184a;

        public AnonymousClass2(a aVar, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* compiled from: UMNetWorkSender.java */
    /* renamed from: com.umeng.commonsdk.framework.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class FileObserverC0279a extends FileObserver {
        public FileObserverC0279a(String str) {
        }

        @Override // android.os.FileObserver
        public void onEvent(int i2, String str) {
        }
    }

    public a(Context context, Handler handler) {
    }

    public static /* synthetic */ void a(int i2) {
    }

    public static int b() {
    }

    public static void c() {
    }

    private static void c(int i2) {
    }

    public static void d() {
    }

    public static void e() {
    }

    public static /* synthetic */ ReentrantLock f() {
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void i() {
    }

    private void j() {
    }

    private static void k() {
    }

    private static void l() {
    }

    private static void m() {
    }

    private static void n() {
    }

    @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
    public void onImprintValueChanged(String str, String str2) {
    }

    public static void a(Context context) {
    }

    public static void b(Context context) {
    }

    public static void a(UMSenderStateNotify uMSenderStateNotify) {
    }

    private static void b(int i2) {
    }

    public static boolean a() {
    }

    public static void a(boolean z) {
    }

    private static void a(int i2, long j2) {
    }

    private static void a(int i2, int i3) {
    }
}
