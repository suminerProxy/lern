package com.tencent.bugly.idasc;

import android.content.Context;
import com.tencent.bugly.idasc.BuglyStrategy;
import com.tencent.bugly.idasc.crashreport.common.strategy.StrategyBean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CrashModule extends a {
    public static final int MODULE_ID = 1004;
    private static int c;

    /* renamed from: e  reason: collision with root package name */
    private static CrashModule f9271e;

    /* renamed from: a  reason: collision with root package name */
    private long f9272a;
    private BuglyStrategy.a b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9273d;

    private synchronized void a(Context context, BuglyStrategy buglyStrategy) {
    }

    public static CrashModule getInstance() {
    }

    @Override // com.tencent.bugly.idasc.a
    public String[] getTables() {
    }

    public synchronized boolean hasInitialized() {
    }

    @Override // com.tencent.bugly.idasc.a
    public synchronized void init(Context context, boolean z, BuglyStrategy buglyStrategy) {
    }

    @Override // com.tencent.bugly.idasc.a
    public void onServerStrategyChanged(StrategyBean strategyBean) {
    }
}
