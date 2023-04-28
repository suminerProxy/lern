package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.lang.Thread;

/* compiled from: BUGLY */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class av implements Thread.UncaughtExceptionHandler {

    /* renamed from: h  reason: collision with root package name */
    private static String f9787h;

    /* renamed from: i  reason: collision with root package name */
    private static final Object f9788i = null;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9789a;
    public final as b;
    public final ac c;

    /* renamed from: d  reason: collision with root package name */
    public final aa f9790d;

    /* renamed from: e  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f9791e;

    /* renamed from: f  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f9792f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9793g;

    /* renamed from: j  reason: collision with root package name */
    private int f9794j;

    public av(Context context, as asVar, ac acVar, aa aaVar) {
    }

    private static void c() {
    }

    public final synchronized void a() {
    }

    public final synchronized void b() {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
    }

    private CrashDetailBean b(Thread thread, Throwable th, boolean z, String str, byte[] bArr, boolean z2) {
    }

    private static void a(CrashDetailBean crashDetailBean, Throwable th, boolean z) {
    }

    private static boolean a(Thread thread) {
    }

    public final void a(Thread thread, Throwable th, boolean z, String str, byte[] bArr, boolean z2) {
    }

    private static boolean a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
    }

    public final synchronized void a(StrategyBean strategyBean) {
    }

    private static String a(Throwable th, int i2) {
    }

    private static String a(Throwable th) {
    }
}
