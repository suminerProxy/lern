package com.umeng.pagesdk;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class PageConfigManger {
    public static final String APM_FPSPERF_COLLECT_INTERVAL = "apm_pageperf_collect_interval";
    public static final String APM_FPSPERF_COLLECT_INTERVAL_TOGETHER = "apm_pageperf_collect_interval_together";
    public static final String APM_FPSPERF_COLLECT_MAX_PERIOD_SEC = "apm_pageperf_collect_max_period_sec";

    /* renamed from: a  reason: collision with root package name */
    private final String f15481a;
    private Context b;
    private EfsReporter c;

    /* renamed from: d  reason: collision with root package name */
    private int f15482d;

    /* renamed from: e  reason: collision with root package name */
    private final int f15483e;

    /* renamed from: f  reason: collision with root package name */
    private int f15484f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15485g;

    /* renamed from: com.umeng.pagesdk.PageConfigManger$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements IConfigCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PageConfigManger f15486a;

        public AnonymousClass1(PageConfigManger pageConfigManger) {
        }

        @Override // com.efs.sdk.base.observer.IConfigCallback
        public final void onChange(Map<String, Object> map) {
        }
    }

    public PageConfigManger(Context context, EfsReporter efsReporter) {
    }

    public static /* synthetic */ Context a(PageConfigManger pageConfigManger) {
    }

    public boolean enableTracer() {
    }
}
