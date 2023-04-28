package com.tencent.tpns.baseapi.base.util;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class TTask implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public String f13667f;

    public TTask() {
        this("undefined");
    }

    public abstract void TRun();

    @Override // java.lang.Runnable
    public void run() {
        try {
            TRun();
        } catch (Throwable unused) {
        }
    }

    public TTask(String str) {
        this.f13667f = str;
    }
}
