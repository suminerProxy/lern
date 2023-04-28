package com.mob.commons.logcollector;

import com.mob.tools.log.LogCollector;
import com.mob.tools.proguard.ProtectedMemberKeeper;
import com.mob.tools.proguard.PublicMemberKeeper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class LogsCollector implements LogCollector, ProtectedMemberKeeper, PublicMemberKeeper {
    public abstract String getSDKTag();

    public abstract int getSDKVersion();

    @Override // com.mob.tools.log.LogCollector
    public final void log(String str, int i2, int i3, String str2, String str3) {
    }
}
