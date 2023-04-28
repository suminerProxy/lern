package com.efs.sdk.net;

import android.content.Context;
import android.content.SharedPreferences;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NetConfigManager {

    /* renamed from: a  reason: collision with root package name */
    private final String f3182a;
    private final int b;
    private EfsReporter c;

    /* renamed from: d  reason: collision with root package name */
    private int f3183d;

    /* renamed from: e  reason: collision with root package name */
    private int f3184e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3185f;

    /* renamed from: g  reason: collision with root package name */
    private Context f3186g;

    /* renamed from: com.efs.sdk.net.NetConfigManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements IConfigCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NetConfigManager f3187a;

        /* renamed from: com.efs.sdk.net.NetConfigManager$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class RunnableC00541 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SharedPreferences.Editor f3188a;
            public final /* synthetic */ Object b;
            public final /* synthetic */ AnonymousClass1 c;

            public RunnableC00541(AnonymousClass1 anonymousClass1, SharedPreferences.Editor editor, Object obj) {
            }

            @Override // java.lang.Runnable
            public final void run() {
            }
        }

        public AnonymousClass1(NetConfigManager netConfigManager) {
        }

        @Override // com.efs.sdk.base.observer.IConfigCallback
        public final void onChange(Map<String, Object> map) {
        }
    }

    public NetConfigManager(Context context, EfsReporter efsReporter) {
    }

    public static /* synthetic */ Context a(NetConfigManager netConfigManager) {
    }

    public boolean enableTracer() {
    }
}
