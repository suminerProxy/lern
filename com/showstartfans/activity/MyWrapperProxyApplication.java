package com.showstartfans.activity;

import android.content.Context;
import android.os.Process;
import com.wrapper.proxyapplication.Util;
import com.wrapper.proxyapplication.WrapperProxyApplication;
import java.io.IOException;
import java.util.zip.ZipFile;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_app_com.showstartfans.activity-1_base.apk_68136.dex */
public class MyWrapperProxyApplication extends WrapperProxyApplication {
    @Override // com.wrapper.proxyapplication.WrapperProxyApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
    }

    @Override // com.wrapper.proxyapplication.WrapperProxyApplication
    protected void initProxyApplication(Context ctx) {
        String apkdir = ctx.getApplicationInfo().sourceDir;
        ZipFile apkzf = null;
        try {
            apkzf = new ZipFile(apkdir);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        if (apkzf == null) {
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
        Util.PrepareSecurefiles(ctx, apkzf);
        try {
            apkzf.close();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        if (Util.CPUABI == "86" || Util.CPUABI == "86_64") {
            System.load(ctx.getFilesDir().getAbsolutePath() + "/prodexdir/" + Util.libname);
            return;
        }
        System.loadLibrary(Util.simplelibname);
    }
}
