package com.tencent.bugly.idasc.crashreport.crash.h5;

import android.webkit.JavascriptInterface;
import com.tencent.bugly.idasc.crashreport.CrashReport;
import java.util.HashSet;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class H5JavaScriptInterface {

    /* renamed from: a  reason: collision with root package name */
    private static HashSet<Integer> f9440a;
    private String b;
    private Thread c;

    /* renamed from: d  reason: collision with root package name */
    private String f9441d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f9442e;

    private H5JavaScriptInterface() {
    }

    private static a a(String str) {
    }

    public static H5JavaScriptInterface getInstance(CrashReport.WebViewInterface webViewInterface) {
    }

    @JavascriptInterface
    public void printLog(String str) {
    }

    @JavascriptInterface
    public void reportJSException(String str) {
    }
}
