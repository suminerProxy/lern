package com.tencent.android.tpush.stat.b;

import com.tencent.android.tpush.logging.TLogger;
import net.sourceforge.pinyin4j.ChineseToPinyinResource;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private String f9116a;
    private boolean b;
    private int c;

    public c() {
        this.f9116a = "default";
        this.b = true;
        this.c = 2;
    }

    private String b() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(c.class.getName())) {
                return "[" + Thread.currentThread().getName() + ChineseToPinyinResource.Field.LEFT_BRACKET + Thread.currentThread().getId() + "): " + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + "]";
            }
        }
        return null;
    }

    public boolean a() {
        return this.b;
    }

    public void c(Object obj) {
        String str;
        if (this.c <= 5) {
            String b = b();
            if (b == null) {
                str = obj.toString();
            } else {
                str = b + " - " + obj;
            }
            TLogger.w(this.f9116a, str);
        }
    }

    public void d(Object obj) {
        if (a()) {
            c(obj);
        }
    }

    public void e(Object obj) {
        String str;
        if (this.c <= 6) {
            String b = b();
            if (b == null) {
                str = obj.toString();
            } else {
                str = b + " - " + obj;
            }
            TLogger.e(this.f9116a, str);
        }
    }

    public void f(Object obj) {
        if (a()) {
            e(obj);
        }
    }

    public void g(Object obj) {
        String str;
        if (this.c <= 3) {
            String b = b();
            if (b == null) {
                str = obj.toString();
            } else {
                str = b + " - " + obj;
            }
            TLogger.d(this.f9116a, str);
        }
    }

    public void h(Object obj) {
        if (a()) {
            g(obj);
        }
    }

    public void a(boolean z) {
        this.b = z;
    }

    public void a(Object obj) {
        String str;
        if (this.c <= 4) {
            String b = b();
            if (b == null) {
                str = obj.toString();
            } else {
                str = b + " - " + obj;
            }
            TLogger.i(this.f9116a, str);
        }
    }

    public c(String str) {
        this.f9116a = "default";
        this.b = true;
        this.c = 2;
        this.f9116a = str;
    }

    public void a(Throwable th) {
        if (this.c <= 6) {
            TLogger.e(this.f9116a, "", th);
        }
    }

    public void b(Object obj) {
        if (a()) {
            a(obj);
        }
    }

    public void b(Throwable th) {
        if (a()) {
            a(th);
        }
    }
}
