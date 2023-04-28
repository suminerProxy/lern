package com.mob.mcl;

import android.content.Context;
import android.os.Bundle;
import com.mob.mgs.OnIdChangeListener;
import com.mob.tools.proguard.EverythingKeeper;
import com.mob.tools.utils.b;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MobMCL implements EverythingKeeper {
    public static final String SDK_TAG = "MobMCL";

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface ELPMessageListener extends EverythingKeeper {
        boolean messageReceived(Bundle bundle);
    }

    public static void addBusinessMessageListener(int i2, BusinessMessageListener businessMessageListener) {
    }

    public static void addELPMessageListener(ELPMessageListener eLPMessageListener) {
    }

    public static void deleteMsg(String str) {
    }

    public static void getClientTcpStatus(BusinessCallBack<Boolean> businessCallBack) {
    }

    public static long getCreateSuidTime() {
    }

    public static String getSuid() {
    }

    public static void getTcpStatus(BusinessCallBack<Boolean> businessCallBack) {
    }

    public static void initMCLink(Context context, String str, String str2) {
    }

    public static void syncSuid(String str, long j2, b<Boolean> bVar) {
    }

    public static void getSuid(OnIdChangeListener onIdChangeListener) {
    }
}
