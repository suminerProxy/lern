package com.tencent.android.tpush.stat.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MtaActivityLifeCycle {

    /* renamed from: a  reason: collision with root package name */
    private static int f9171a;
    private static long b;
    private static Activity c;

    public static /* synthetic */ int b(int i2) {
        int i3 = f9171a + i2;
        f9171a = i3;
        return i3;
    }

    public static long getAppOnForegroundTime() {
        return b;
    }

    public static Activity getCurrentTopActivity() {
        return c;
    }

    public static Boolean registerActivityLifecycleCallbacks(Application application, final a aVar) {
        if (application != null && aVar != null && Build.VERSION.SDK_INT >= 14) {
            try {
                application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.tencent.android.tpush.stat.lifecycle.MtaActivityLifeCycle.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        a.this.b(activity, bundle);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        a.this.e(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
                        Activity unused = MtaActivityLifeCycle.c = null;
                        a.this.d(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
                        Activity unused = MtaActivityLifeCycle.c = activity;
                        a.this.c(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        a.this.a(activity, bundle);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
                        if (MtaActivityLifeCycle.f9171a == 0) {
                            long unused = MtaActivityLifeCycle.b = System.currentTimeMillis();
                        }
                        MtaActivityLifeCycle.b(1);
                        a.this.b(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
                        MtaActivityLifeCycle.a(1);
                        a.this.a(activity);
                    }
                });
                return Boolean.TRUE;
            } catch (Throwable th) {
                th.printStackTrace();
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    public static /* synthetic */ int a(int i2) {
        int i3 = f9171a - i2;
        f9171a = i3;
        return i3;
    }
}
