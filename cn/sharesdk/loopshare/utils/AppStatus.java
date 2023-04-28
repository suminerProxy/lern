package cn.sharesdk.loopshare.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.mob.tools.utils.ActivityTracker;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AppStatus {
    private static volatile AppStatus b;

    /* renamed from: a  reason: collision with root package name */
    public int f236a;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f237d;

    /* renamed from: e  reason: collision with root package name */
    private ActivityTracker.Tracker f238e;

    /* renamed from: f  reason: collision with root package name */
    private OnAppStatusListener f239f;

    /* renamed from: cn.sharesdk.loopshare.utils.AppStatus$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ActivityTracker.Tracker {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AppStatus f240a;

        public AnonymousClass1(AppStatus appStatus) {
        }

        @Override // com.mob.tools.utils.ActivityTracker.Tracker
        public void onCreated(Activity activity, Bundle bundle) {
        }

        @Override // com.mob.tools.utils.ActivityTracker.Tracker
        public void onDestroyed(Activity activity) {
        }

        @Override // com.mob.tools.utils.ActivityTracker.Tracker
        public void onPaused(Activity activity) {
        }

        @Override // com.mob.tools.utils.ActivityTracker.Tracker
        public void onResumed(Activity activity) {
        }

        @Override // com.mob.tools.utils.ActivityTracker.Tracker
        public void onSaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // com.mob.tools.utils.ActivityTracker.Tracker
        public void onStarted(Activity activity) {
        }

        @Override // com.mob.tools.utils.ActivityTracker.Tracker
        public void onStopped(Activity activity) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class OnAppStatusListener implements ActivityTracker.Tracker {
        public abstract void onAppStatusChanged(boolean z);

        @Override // com.mob.tools.utils.ActivityTracker.Tracker
        public void onDestroyed(Activity activity) {
        }

        @Override // com.mob.tools.utils.ActivityTracker.Tracker
        public void onPaused(Activity activity) {
        }

        @Override // com.mob.tools.utils.ActivityTracker.Tracker
        public void onResumed(Activity activity) {
        }

        @Override // com.mob.tools.utils.ActivityTracker.Tracker
        public void onSaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // com.mob.tools.utils.ActivityTracker.Tracker
        public void onStarted(Activity activity) {
        }

        @Override // com.mob.tools.utils.ActivityTracker.Tracker
        public void onStopped(Activity activity) {
        }
    }

    private AppStatus() {
    }

    public static /* synthetic */ OnAppStatusListener a(AppStatus appStatus) {
    }

    private void d() {
    }

    public boolean b() {
    }

    public int c() {
    }

    public static /* synthetic */ void a(AppStatus appStatus, boolean z) {
    }

    public static AppStatus a() {
    }

    private void b(boolean z) {
    }

    public void a(boolean z) {
    }

    private boolean a(Context context) {
    }

    public void a(OnAppStatusListener onAppStatusListener) {
    }
}
