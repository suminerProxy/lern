package com.taihebase.activity.base;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.taihebase.activity.base.BaseApplication;
import com.tencent.mmkv.MMKV;
import h.y.a.f.k;
import h.y.a.n.c0;
import h.y.a.n.i0;
import h.y.a.n.q0;
import i.a.c1.a;
import i.a.x0.g;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import skin.support.SkinCompatManager;
import skin.support.app.SkinAppCompatViewInflater;
import skin.support.app.SkinCardViewInflater;
import skin.support.constraint.app.SkinConstraintViewInflater;
import skin.support.design.app.SkinMaterialViewInflater;
import skin.support.svg.SkinCustomViewLayoutInflater;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class BaseApplication extends Application {
    private void b() {
        try {
            String str = Build.MODEL;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains("oppo")) {
                return;
            }
            Field declaredField = Class.forName("java.lang.Daemons").getDeclaredField("MAX_FINALIZE_NANOS");
            declaredField.setAccessible(true);
            declaredField.set(null, Integer.MAX_VALUE);
            Class<?> cls = Class.forName("java.lang.Daemons$FinalizerWatchdogDaemon");
            Method declaredMethod = cls.getSuperclass().getDeclaredMethod("stop", new Class[0]);
            declaredMethod.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("INSTANCE");
            declaredField2.setAccessible(true);
            declaredMethod.invoke(declaredField2.get(null), new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void d() {
        q0 q0Var = q0.f26355a;
        String a2 = q0Var.a(this);
        j(a2);
        i0.d("当前运行的进程", a2);
        if (q0Var.d().equals(a2)) {
            c();
        }
    }

    public static /* synthetic */ void g(Throwable th) throws Exception {
    }

    private void i() {
        a.k0(new g() { // from class: h.y.a.f.a
            @Override // i.a.x0.g
            public final void accept(Object obj) {
                BaseApplication.g((Throwable) obj);
            }
        });
    }

    private void j(String str) {
        if (Build.VERSION.SDK_INT < 28 || str.equals(getPackageName())) {
            return;
        }
        WebView.setDataDirectorySuffix(str);
    }

    public abstract void a();

    public void c() {
        e();
        i();
    }

    public void e() {
        SkinCompatManager.withoutActivity(this).addInflater(new SkinAppCompatViewInflater()).addInflater(new SkinMaterialViewInflater()).addInflater(new SkinConstraintViewInflater()).addInflater(new SkinCardViewInflater()).addInflater(new SkinCustomViewLayoutInflater()).setSkinWindowBackgroundEnable(false).loadSkin();
    }

    public abstract void f(Context context);

    public abstract void h(Activity activity);

    @Override // android.app.Application
    public void onCreate() {
        b();
        super.onCreate();
        MMKV.initialize(this);
        k.c(this);
        a();
        c0.a(this);
        d();
    }
}
