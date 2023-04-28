package com.mob.tools;

import android.os.Process;
import com.mob.commons.o;
import java.lang.Thread;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private static Thread.UncaughtExceptionHandler f4420a;
    private static volatile boolean b;

    private b() {
    }

    public static void a() {
        if (b || !o.f3668g) {
            return;
        }
        f4420a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new b());
    }

    private void b() {
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
        if (r0 != null) goto L8;
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void uncaughtException(java.lang.Thread r4, java.lang.Throwable r5) {
        /*
            r3 = this;
            com.mob.tools.log.NLog r0 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "UE handled, processing..."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L18
            r0.d(r1, r2)     // Catch: java.lang.Throwable -> L18
            com.mob.tools.log.NLog r0 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L18
            r0.crash(r5)     // Catch: java.lang.Throwable -> L18
            java.lang.Thread$UncaughtExceptionHandler r0 = com.mob.tools.b.f4420a
            if (r0 == 0) goto L28
            goto L24
        L18:
            r0 = move-exception
            com.mob.tools.log.NLog r1 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L2c
            r1.d(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Thread$UncaughtExceptionHandler r0 = com.mob.tools.b.f4420a
            if (r0 == 0) goto L28
        L24:
            r0.uncaughtException(r4, r5)
            goto L2b
        L28:
            r3.b()
        L2b:
            return
        L2c:
            r0 = move-exception
            java.lang.Thread$UncaughtExceptionHandler r1 = com.mob.tools.b.f4420a
            if (r1 == 0) goto L35
            r1.uncaughtException(r4, r5)
            goto L38
        L35:
            r3.b()
        L38:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.b.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
