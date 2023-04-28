package com.tencent.bugly;

import android.content.Context;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.o;

/* compiled from: BUGLY */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CrashModule extends o {
    public static final int MODULE_ID = 1004;
    private static int c;

    /* renamed from: e  reason: collision with root package name */
    private static CrashModule f9187e;

    /* renamed from: a  reason: collision with root package name */
    private long f9188a;
    private BuglyStrategy.a b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9189d;

    private synchronized void a(Context context, BuglyStrategy buglyStrategy) {
    }

    public static CrashModule getInstance() {
    }

    @Override // com.tencent.bugly.proguard.o
    public String[] getTables() {
    }

    public synchronized boolean hasInitialized() {
    }

    @Override // com.tencent.bugly.proguard.o
    public synchronized void init(Context context, boolean z, BuglyStrategy buglyStrategy) {
    }

    @Override // com.tencent.bugly.proguard.o
    public void onServerStrategyChanged(StrategyBean strategyBean) {
    }
}
