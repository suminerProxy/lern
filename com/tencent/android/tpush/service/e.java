package com.tencent.android.tpush.service;

import android.os.PowerManager;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static e f8924a;
    private PowerManager.WakeLock b = null;

    private e() {
    }

    public static e a() {
        if (f8924a == null) {
            f8924a = new e();
        }
        return f8924a;
    }

    public PowerManager.WakeLock b() {
        return this.b;
    }
}
