package com.mob.tools;

import com.mob.MobSDK;
import com.mob.commons.j;
import com.mob.tools.log.NLog;
import com.mob.tools.proguard.EverythingKeeper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MobLog implements EverythingKeeper {
    public static synchronized NLog getInstance() {
        NLog nLog;
        synchronized (MobLog.class) {
            nLog = NLog.getInstance("MobSDK", MobSDK.SDK_VERSION_CODE, j.a("009n1gehegn$fRgegegfhi"));
        }
        return nLog;
    }
}
