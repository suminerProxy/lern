package com.tencent.bugly.proguard;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;

/* compiled from: BUGLY */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f9952a = false;
    public static r b = null;
    private static int c = 10;

    /* renamed from: d  reason: collision with root package name */
    private static long f9953d = 300000;

    /* renamed from: e  reason: collision with root package name */
    private static long f9954e = 30000;

    /* renamed from: f  reason: collision with root package name */
    private static long f9955f = 0;

    /* renamed from: g  reason: collision with root package name */
    private static int f9956g = 0;

    /* renamed from: h  reason: collision with root package name */
    private static long f9957h = 0;

    /* renamed from: i  reason: collision with root package name */
    private static long f9958i = 0;

    /* renamed from: j  reason: collision with root package name */
    private static long f9959j = 0;

    /* renamed from: k  reason: collision with root package name */
    private static Application.ActivityLifecycleCallbacks f9960k = null;

    /* renamed from: l  reason: collision with root package name */
    private static Class<?> f9961l = null;

    /* renamed from: m  reason: collision with root package name */
    private static boolean f9962m = true;

    /* compiled from: BUGLY */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    public static void a(Context context, BuglyStrategy buglyStrategy) {
        long j2;
        if (f9952a) {
            return;
        }
        f9962m = aa.a(context).f9654f;
        b = new r(context, f9962m);
        f9952a = true;
        if (buglyStrategy != null) {
            f9961l = buglyStrategy.getUserInfoActivity();
            j2 = buglyStrategy.getAppReportDelay();
        } else {
            j2 = 0;
        }
        if (j2 <= 0) {
            c(context, buglyStrategy);
        } else {
            ak.a().a(new Runnable(context, buglyStrategy) { // from class: com.tencent.bugly.proguard.s.1

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Context f9963a;
                public final /* synthetic */ BuglyStrategy b;

                @Override // java.lang.Runnable
                public final void run() {
                }
            }, j2);
        }
    }

    public static /* synthetic */ int g() {
        int i2 = f9956g;
        f9956g = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r11, com.tencent.bugly.BuglyStrategy r12) {
        /*
            r0 = 1
            r1 = 0
            if (r12 == 0) goto Ld
            boolean r2 = r12.recordUserInfoOnceADay()
            boolean r12 = r12.isEnableUserInfo()
            goto Lf
        Ld:
            r12 = r0
            r2 = r1
        Lf:
            if (r2 == 0) goto L5d
            com.tencent.bugly.proguard.aa r12 = com.tencent.bugly.proguard.aa.a(r11)
            java.lang.String r2 = r12.f9652d
            java.util.List r2 = com.tencent.bugly.proguard.r.a(r2)
            if (r2 == 0) goto L58
            r3 = r1
        L1e:
            int r4 = r2.size()
            if (r3 >= r4) goto L58
            java.lang.Object r4 = r2.get(r3)
            com.tencent.bugly.crashreport.biz.UserInfoBean r4 = (com.tencent.bugly.crashreport.biz.UserInfoBean) r4
            java.lang.String r5 = r4.f9203n
            java.lang.String r6 = r12.f9663o
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L55
            int r5 = r4.b
            if (r5 != r0) goto L55
            long r5 = com.tencent.bugly.proguard.ap.b()
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L58
            long r9 = r4.f9194e
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 < 0) goto L55
            long r2 = r4.f9195f
            int r12 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r12 > 0) goto L53
            com.tencent.bugly.proguard.r r12 = com.tencent.bugly.proguard.s.b
            r12.b()
        L53:
            r12 = r1
            goto L59
        L55:
            int r3 = r3 + 1
            goto L1e
        L58:
            r12 = r0
        L59:
            if (r12 != 0) goto L5c
            return
        L5c:
            r12 = r1
        L5d:
            com.tencent.bugly.proguard.aa r2 = com.tencent.bugly.proguard.aa.b()
            if (r2 == 0) goto L6c
            boolean r3 = com.tencent.bugly.proguard.z.a()
            if (r3 == 0) goto L6c
            r2.a(r1, r0)
        L6c:
            if (r12 == 0) goto La1
            r12 = 0
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 14
            if (r2 < r3) goto La1
            android.content.Context r2 = r11.getApplicationContext()
            boolean r2 = r2 instanceof android.app.Application
            if (r2 == 0) goto L84
            android.content.Context r11 = r11.getApplicationContext()
            r12 = r11
            android.app.Application r12 = (android.app.Application) r12
        L84:
            if (r12 == 0) goto La1
            android.app.Application$ActivityLifecycleCallbacks r11 = com.tencent.bugly.proguard.s.f9960k     // Catch: java.lang.Exception -> L97
            if (r11 != 0) goto L91
            com.tencent.bugly.proguard.s$a r11 = new com.tencent.bugly.proguard.s$a     // Catch: java.lang.Exception -> L97
            r11.<init>()     // Catch: java.lang.Exception -> L97
            com.tencent.bugly.proguard.s.f9960k = r11     // Catch: java.lang.Exception -> L97
        L91:
            android.app.Application$ActivityLifecycleCallbacks r11 = com.tencent.bugly.proguard.s.f9960k     // Catch: java.lang.Exception -> L97
            r12.registerActivityLifecycleCallbacks(r11)     // Catch: java.lang.Exception -> L97
            goto La1
        L97:
            r11 = move-exception
            boolean r12 = com.tencent.bugly.proguard.al.a(r11)
            if (r12 != 0) goto La1
            r11.printStackTrace()
        La1:
            boolean r11 = com.tencent.bugly.proguard.s.f9962m
            if (r11 == 0) goto Lc4
            long r11 = java.lang.System.currentTimeMillis()
            com.tencent.bugly.proguard.s.f9958i = r11
            com.tencent.bugly.proguard.r r11 = com.tencent.bugly.proguard.s.b
            r11.a(r0, r1)
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.String r12 = "[session] launch app, new start"
            com.tencent.bugly.proguard.al.a(r12, r11)
            com.tencent.bugly.proguard.r r11 = com.tencent.bugly.proguard.s.b
            r11.a()
            com.tencent.bugly.proguard.r r11 = com.tencent.bugly.proguard.s.b
            r0 = 21600000(0x1499700, double:1.0671818E-316)
            r11.a(r0)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.s.c(android.content.Context, com.tencent.bugly.BuglyStrategy):void");
    }

    public static void a(long j2) {
        if (j2 < 0) {
            j2 = ac.a().c().f9220p;
        }
        f9955f = j2;
    }

    public static void a(StrategyBean strategyBean, boolean z) {
        r rVar = b;
        if (rVar != null && !z) {
            rVar.b();
        }
        if (strategyBean == null) {
            return;
        }
        long j2 = strategyBean.f9220p;
        if (j2 > 0) {
            f9954e = j2;
        }
        int i2 = strategyBean.u;
        if (i2 > 0) {
            c = i2;
        }
        long j3 = strategyBean.v;
        if (j3 > 0) {
            f9953d = j3;
        }
    }

    public static void a() {
        r rVar = b;
        if (rVar != null) {
            rVar.a(2, false);
        }
    }

    public static void a(Context context) {
        if (!f9952a || context == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
            if (application != null) {
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f9960k;
                    if (activityLifecycleCallbacks != null) {
                        application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                    }
                } catch (Exception e2) {
                    if (!al.a(e2)) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        f9952a = false;
    }

    public static /* synthetic */ String a(String str, String str2) {
        return ap.a() + "  " + str + "  " + str2 + "\n";
    }
}
