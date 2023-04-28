package com.mob.tools.a;

import android.content.Context;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private static m f4418a = new m();
    private volatile Context b;
    private volatile l c;

    /* renamed from: d  reason: collision with root package name */
    private volatile l f4419d;

    public static m a(Context context) {
        if (f4418a.b == null && context != null) {
            f4418a.b = context.getApplicationContext();
        }
        return f4418a;
    }

    public l b() {
        if (this.f4419d == null) {
            this.f4419d = new e(this.b);
        }
        return this.f4419d;
    }

    public void a(l lVar) {
        this.c = lVar;
    }

    public l a() {
        if (this.c == null) {
            return b();
        }
        return this.c;
    }
}
