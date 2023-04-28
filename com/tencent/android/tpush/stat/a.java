package com.tencent.android.tpush.stat;

import android.content.Context;
import java.lang.Thread;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private static com.tencent.android.tpush.stat.b.c f9075a = com.tencent.android.tpush.stat.b.b.b();
    private static volatile a b = null;
    private static Thread.UncaughtExceptionHandler c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9076d = false;

    /* renamed from: e  reason: collision with root package name */
    private Context f9077e;

    private a(Context context) {
        this.f9077e = null;
        this.f9077e = context;
    }

    public static a a(Context context) {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a(context);
                }
            }
        }
        return b;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (this.f9076d) {
            com.tencent.android.tpush.stat.b.c cVar = f9075a;
            cVar.f("already handle the uncaugth exception:" + th);
            return;
        }
        this.f9076d = true;
        f9075a.h("catch app crash");
        StatServiceImpl.a(this.f9077e, th);
        if (c != null) {
            f9075a.h("Call the original uncaught exception handler.");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = c;
            if (uncaughtExceptionHandler instanceof a) {
                return;
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public void a() {
        if (c != null) {
            return;
        }
        c = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(b);
        com.tencent.android.tpush.stat.b.c cVar = f9075a;
        cVar.h("set up java crash handler:" + b);
    }
}
