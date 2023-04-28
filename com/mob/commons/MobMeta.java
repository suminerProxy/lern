package com.mob.commons;

import android.os.Looper;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.proguard.PublicMemberKeeper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MobMeta implements PublicMemberKeeper {
    public static <T> T get(MobProduct mobProduct, String str, Class<T> cls, T t) {
        T t2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            NLog mobLog = MobLog.getInstance();
            mobLog.w("WARNING: gt mta in main: key = " + str);
            return t;
        }
        try {
            Object a2 = o.a(str, cls, mobProduct);
            if (a2 == null) {
                try {
                    a2 = o.a(str);
                } catch (Throwable th) {
                    th = th;
                    t = t2;
                    MobLog.getInstance().d(th);
                    return t;
                }
            }
            return a2 == null ? t : (T) a2;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
