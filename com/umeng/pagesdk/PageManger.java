package com.umeng.pagesdk;

import android.app.Activity;
import android.content.Context;
import com.efs.sdk.base.EfsReporter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class PageManger {
    public static final String TAG = "PageManger";

    /* renamed from: a  reason: collision with root package name */
    private static Context f15487a = null;
    private static boolean b = false;
    private static EfsReporter c = null;

    /* renamed from: d  reason: collision with root package name */
    private static PageConfigManger f15488d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f15489e = true;
    public static boolean isDebug = true;

    public static Context getApplicationContext() {
    }

    public static PageConfigManger getPageConfigManger() {
    }

    public static EfsReporter getReporter() {
    }

    public static void init(Context context, EfsReporter efsReporter) {
    }

    public static boolean isControlMainThread() {
    }

    public static boolean isInit() {
    }

    public static void onTracePageBegin(Activity activity, String str) {
    }

    public static void onTracePageBegin(Activity activity, String str, boolean z) {
    }

    public static void onTracePageEnd(Activity activity, String str) {
    }

    public static void onTracePageEnd(Activity activity, String str, boolean z) {
    }

    public static void setControlMainThread(boolean z) {
    }
}
