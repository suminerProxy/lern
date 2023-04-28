package com.umeng.analytics.vshelper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class PageNameMonitor implements com.umeng.analytics.vshelper.a {
    private static String currentActivity;
    private static String currentCustomPage;
    private static Object lock;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final PageNameMonitor f15075a = null;

        private a() {
        }

        public static /* synthetic */ PageNameMonitor a() {
        }
    }

    public /* synthetic */ PageNameMonitor(AnonymousClass1 anonymousClass1) {
    }

    public static PageNameMonitor getInstance() {
    }

    @Override // com.umeng.analytics.vshelper.a
    public void activityPause(String str) {
    }

    @Override // com.umeng.analytics.vshelper.a
    public void activityResume(String str) {
    }

    @Override // com.umeng.analytics.vshelper.a
    public void customPageBegin(String str) {
    }

    @Override // com.umeng.analytics.vshelper.a
    public void customPageEnd(String str) {
    }

    public String getCurrenPageName() {
    }

    private PageNameMonitor() {
    }
}
