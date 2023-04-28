package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class ActivityRecreator {
    private static final String LOG_TAG = "ActivityRecreator";
    public static final Class<?> activityThreadClass = null;
    private static final Handler mainHandler = null;
    public static final Field mainThreadField = null;
    public static final Method performStopActivity2ParamsMethod = null;
    public static final Method performStopActivity3ParamsMethod = null;
    public static final Method requestRelaunchActivityMethod = null;
    public static final Field tokenField = null;

    /* renamed from: androidx.core.app.ActivityRecreator$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ LifecycleCheckCallbacks val$callbacks;
        public final /* synthetic */ Object val$token;

        public AnonymousClass1(LifecycleCheckCallbacks lifecycleCheckCallbacks, Object obj) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.core.app.ActivityRecreator$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ Application val$application;
        public final /* synthetic */ LifecycleCheckCallbacks val$callbacks;

        public AnonymousClass2(Application application, LifecycleCheckCallbacks lifecycleCheckCallbacks) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.core.app.ActivityRecreator$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ Object val$activityThread;
        public final /* synthetic */ Object val$token;

        public AnonymousClass3(Object obj, Object obj2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class LifecycleCheckCallbacks implements Application.ActivityLifecycleCallbacks {
        public Object currentlyRecreatingToken;
        private Activity mActivity;
        private boolean mDestroyed;
        private final int mRecreatingHashCode;
        private boolean mStarted;
        private boolean mStopQueued;

        public LifecycleCheckCallbacks(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    private ActivityRecreator() {
    }

    private static Class<?> getActivityThreadClass() {
    }

    private static Field getMainThreadField() {
    }

    private static Method getPerformStopActivity2Params(Class<?> cls) {
    }

    private static Method getPerformStopActivity3Params(Class<?> cls) {
    }

    private static Method getRequestRelaunchActivityMethod(Class<?> cls) {
    }

    private static Field getTokenField() {
    }

    private static boolean needsRelaunchCall() {
    }

    public static boolean queueOnStopIfNecessary(Object obj, int i2, Activity activity) {
    }

    public static boolean recreate(@NonNull Activity activity) {
    }
}
