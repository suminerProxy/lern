package com.efs.sdk.memoryinfo;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class e {
    public final List<EfsJSONLog> B;
    public volatile boolean C;

    /* renamed from: a  reason: collision with root package name */
    private final EfsReporter f3181a;

    /* renamed from: com.efs.sdk.memoryinfo.e$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements UMImprintChangeCallback {
        public final /* synthetic */ Context D;
        public final /* synthetic */ e E;

        public AnonymousClass1(e eVar, Context context) {
        }

        @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
        public final void onImprintValueChanged(String str, String str2) {
        }
    }

    public e(Context context, EfsReporter efsReporter) {
    }

    public static /* synthetic */ EfsReporter a(e eVar) {
    }

    public static /* synthetic */ boolean b(e eVar) {
    }

    public static /* synthetic */ List c(e eVar) {
    }

    public static /* synthetic */ void a(e eVar, EfsJSONLog efsJSONLog) {
    }

    public final void a(EfsJSONLog efsJSONLog) {
    }
}
