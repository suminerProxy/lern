package com.efs.sdk.launch;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LaunchConfigManager {

    /* renamed from: a  reason: collision with root package name */
    private final String f3142a;
    private final int b;
    private EfsReporter c;

    /* renamed from: d  reason: collision with root package name */
    private int f3143d;

    /* renamed from: e  reason: collision with root package name */
    private int f3144e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3145f;

    /* renamed from: g  reason: collision with root package name */
    private Context f3146g;

    /* renamed from: com.efs.sdk.launch.LaunchConfigManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements IConfigCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LaunchConfigManager f3147a;

        public AnonymousClass1(LaunchConfigManager launchConfigManager) {
        }

        @Override // com.efs.sdk.base.observer.IConfigCallback
        public final void onChange(Map<String, Object> map) {
        }
    }

    public LaunchConfigManager(Context context, EfsReporter efsReporter) {
    }

    public static /* synthetic */ Context a(LaunchConfigManager launchConfigManager) {
    }

    public boolean enableTracer() {
    }
}
