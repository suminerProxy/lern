package com.tencent.bugly.idasc.crashreport.crash.anr;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import com.tencent.bugly.idasc.BuglyStrategy;
import com.tencent.bugly.idasc.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.idasc.proguard.aa;
import com.tencent.bugly.idasc.proguard.ab;
import com.tencent.bugly.idasc.proguard.ac;
import com.tencent.bugly.idasc.proguard.p;
import com.tencent.bugly.idasc.proguard.w;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b implements ac {

    /* renamed from: m  reason: collision with root package name */
    private static b f9381m;

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f9382a;
    private long b;
    private final Context c;

    /* renamed from: d  reason: collision with root package name */
    private final com.tencent.bugly.idasc.crashreport.common.info.a f9383d;

    /* renamed from: e  reason: collision with root package name */
    private final w f9384e;

    /* renamed from: f  reason: collision with root package name */
    private String f9385f;

    /* renamed from: g  reason: collision with root package name */
    private final com.tencent.bugly.idasc.crashreport.crash.b f9386g;

    /* renamed from: h  reason: collision with root package name */
    private FileObserver f9387h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9388i;

    /* renamed from: j  reason: collision with root package name */
    private ab f9389j;

    /* renamed from: k  reason: collision with root package name */
    private int f9390k;

    /* renamed from: l  reason: collision with root package name */
    private ActivityManager.ProcessErrorStateInfo f9391l;

    /* renamed from: com.tencent.bugly.idasc.crashreport.crash.anr.b$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 extends FileObserver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f9392a;

        /* renamed from: com.tencent.bugly.idasc.crashreport.crash.anr.b$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class RunnableC01641 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f9393a;
            private /* synthetic */ AnonymousClass1 b;

            public RunnableC01641(AnonymousClass1 anonymousClass1, String str) {
            }

            @Override // java.lang.Runnable
            public final void run() {
            }
        }

        public AnonymousClass1(b bVar, String str, int i2) {
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i2, String str) {
        }
    }

    /* renamed from: com.tencent.bugly.idasc.crashreport.crash.anr.b$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass2 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ b f9394a;

        public AnonymousClass2(b bVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* renamed from: com.tencent.bugly.idasc.crashreport.crash.anr.b$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass3 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ b f9395a;

        public AnonymousClass3(b bVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* renamed from: com.tencent.bugly.idasc.crashreport.crash.anr.b$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass4 extends FileObserver {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ b f9396a;

        public AnonymousClass4(b bVar, String str, int i2) {
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i2, String str) {
        }
    }

    /* renamed from: com.tencent.bugly.idasc.crashreport.crash.anr.b$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass5 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ b f9397a;

        public AnonymousClass5(b bVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    private b(Context context, com.tencent.bugly.idasc.crashreport.common.strategy.a aVar, com.tencent.bugly.idasc.crashreport.common.info.a aVar2, w wVar, com.tencent.bugly.idasc.crashreport.crash.b bVar) {
    }

    private ActivityManager.ProcessErrorStateInfo a(Context context, long j2) {
    }

    private CrashDetailBean a(a aVar) {
    }

    public static b a(Context context, com.tencent.bugly.idasc.crashreport.common.strategy.a aVar, com.tencent.bugly.idasc.crashreport.common.info.a aVar2, w wVar, p pVar, com.tencent.bugly.idasc.crashreport.crash.b bVar, BuglyStrategy.a aVar3) {
    }

    public static /* synthetic */ w a(b bVar) {
    }

    private boolean a(Context context, String str, ActivityManager.ProcessErrorStateInfo processErrorStateInfo, long j2, Map<String, String> map) {
    }

    public static /* synthetic */ boolean a(b bVar, String str) {
    }

    private static boolean a(String str, String str2, String str3) {
    }

    public static /* synthetic */ ab b(b bVar) {
    }

    private synchronized void b(boolean z) {
    }

    private synchronized void c(boolean z) {
    }

    private synchronized void d() {
    }

    private synchronized void e() {
    }

    private synchronized boolean f() {
    }

    private synchronized boolean g() {
    }

    private File h() {
    }

    private synchronized void i() {
    }

    private synchronized void j() {
    }

    public final void a(String str) {
    }

    public final void a(boolean z) {
    }

    public final boolean a() {
    }

    @Override // com.tencent.bugly.idasc.proguard.ac
    public final boolean a(aa aaVar) {
    }

    public final void b() {
    }

    public final synchronized void c() {
    }
}
