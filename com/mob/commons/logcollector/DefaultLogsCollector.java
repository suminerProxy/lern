package com.mob.commons.logcollector;

import com.mob.tools.log.LogCollector;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.HashMap;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DefaultLogsCollector implements LogCollector, PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static DefaultLogsCollector f3640a;
    private final HashMap<String, Integer> b;

    private DefaultLogsCollector() {
    }

    public static synchronized DefaultLogsCollector get() {
    }

    public void addSDK(String str, int i2) {
    }

    @Override // com.mob.tools.log.LogCollector
    public final void log(String str, int i2, int i3, String str2, String str3) {
    }
}
