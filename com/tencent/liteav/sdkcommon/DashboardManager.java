package com.tencent.liteav.sdkcommon;

import android.content.Context;
import android.os.Handler;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.sdkcommon.g;
import java.util.ArrayList;
import java.util.Map;

@JNINamespace("liteav::dashboard")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class DashboardManager {
    private static final int LOG_MAX_SIZE = 15000;
    private static final String TAG = "DashboardManager";
    private final Context mAppContext;
    private final Map<String, StringBuilder> mDashboardLogs;
    private final g mDashboardManagerView;
    private final Map<String, String> mDashboardStatus;
    private final ArrayList<String> mDashboards;
    private boolean mIsInit;
    private final g.a mSelectedDashboardChangeListener;
    private String mSelectedDashboardId;
    private final Handler mUIHandler;

    /* renamed from: com.tencent.liteav.sdkcommon.DashboardManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements g.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DashboardManager f11619a;

        public AnonymousClass1(DashboardManager dashboardManager) {
        }

        @Override // com.tencent.liteav.sdkcommon.g.a
        public final void a(int i2) {
        }
    }

    public static /* synthetic */ ArrayList access$000(DashboardManager dashboardManager) {
    }

    public static /* synthetic */ String access$100(DashboardManager dashboardManager) {
    }

    public static /* synthetic */ String access$102(DashboardManager dashboardManager, String str) {
    }

    public static /* synthetic */ Map access$200(DashboardManager dashboardManager) {
    }

    public static /* synthetic */ g access$300(DashboardManager dashboardManager) {
    }

    public static /* synthetic */ Map access$400(DashboardManager dashboardManager) {
    }

    private void addDashboardInternal(String str) {
    }

    private void appendLogInternal(String str, String str2) {
    }

    private boolean checkPermission(boolean z) {
    }

    private boolean init() {
    }

    public static /* synthetic */ void lambda$addDashboard$1(DashboardManager dashboardManager, String str) {
    }

    public static /* synthetic */ void lambda$appendLog$5(DashboardManager dashboardManager, String str, String str2) {
    }

    public static /* synthetic */ void lambda$removeAllDashboard$3(DashboardManager dashboardManager) {
    }

    public static /* synthetic */ void lambda$removeDashboard$2(DashboardManager dashboardManager, String str) {
    }

    public static /* synthetic */ void lambda$setStatus$4(DashboardManager dashboardManager, String str, String str2) {
    }

    public static /* synthetic */ void lambda$showDashboard$0(DashboardManager dashboardManager, boolean z) {
    }

    private void removeAllDashboardInternal() {
    }

    private void removeDashboardInternal(String str) {
    }

    private void setStatusInternal(String str, String str2) {
    }

    private void showDashboardInternal(boolean z) {
    }

    @CalledByNative
    public int addDashboard(String str) {
    }

    @CalledByNative
    public int appendLog(String str, String str2) {
    }

    @CalledByNative
    public int removeAllDashboard() {
    }

    @CalledByNative
    public int removeDashboard(String str) {
    }

    @CalledByNative
    public int setStatus(String str, String str2) {
    }

    @CalledByNative
    public int showDashboard(boolean z) {
    }
}
