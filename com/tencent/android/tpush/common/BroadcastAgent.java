package com.tencent.android.tpush.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class BroadcastAgent {
    private static String a(Context context) {
        return context.getPackageName() + Constants.RECEIVER_PERMISSION_SUFFIX;
    }

    public static void registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i2) {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.getApplicationContext().registerReceiver(broadcastReceiver, intentFilter, a(context), null, (i2 == 2 || i2 == 4 || i2 == 1) ? i2 : 4);
            } else {
                context.getApplicationContext().registerReceiver(broadcastReceiver, intentFilter, a(context), null);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void sendBroadcast(Context context, Intent intent) {
        try {
            context.sendBroadcast(intent, a(context));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void unregisterReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.getApplicationContext().unregisterReceiver(broadcastReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
