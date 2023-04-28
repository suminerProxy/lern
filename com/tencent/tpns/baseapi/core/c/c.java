package com.tencent.tpns.baseapi.core.c;

import android.os.PowerManager;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f13703a;
    private PowerManager.WakeLock b = null;

    private c() {
    }

    public static c a() {
        if (f13703a == null) {
            f13703a = new c();
        }
        return f13703a;
    }

    public PowerManager.WakeLock b() {
        return this.b;
    }

    public void a(PowerManager.WakeLock wakeLock) {
        this.b = wakeLock;
    }
}
