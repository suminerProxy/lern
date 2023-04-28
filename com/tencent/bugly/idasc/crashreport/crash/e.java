package com.tencent.bugly.idasc.crashreport.crash;

import android.content.Context;
import com.tencent.bugly.idasc.crashreport.common.strategy.StrategyBean;
import java.lang.Thread;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class e implements Thread.UncaughtExceptionHandler {

    /* renamed from: h  reason: collision with root package name */
    private static String f9432h;

    /* renamed from: i  reason: collision with root package name */
    private static final Object f9433i = null;

    /* renamed from: a  reason: collision with root package name */
    private Context f9434a;
    private b b;
    private com.tencent.bugly.idasc.crashreport.common.strategy.a c;

    /* renamed from: d  reason: collision with root package name */
    private com.tencent.bugly.idasc.crashreport.common.info.a f9435d;

    /* renamed from: e  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f9436e;

    /* renamed from: f  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f9437f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9438g;

    /* renamed from: j  reason: collision with root package name */
    private int f9439j;

    public e(Context context, b bVar, com.tencent.bugly.idasc.crashreport.common.strategy.a aVar, com.tencent.bugly.idasc.crashreport.common.info.a aVar2) {
    }

    private static String a(Throwable th, int i2) {
    }

    private static boolean a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
    }

    private static boolean a(Thread thread) {
    }

    private CrashDetailBean b(Thread thread, Throwable th, boolean z, String str, byte[] bArr) {
    }

    private static String b(Throwable th, int i2) {
    }

    public final synchronized void a() {
    }

    public final synchronized void a(StrategyBean strategyBean) {
    }

    public final void a(Thread thread, Throwable th, boolean z, String str, byte[] bArr) {
    }

    public final synchronized void b() {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
    }
}
