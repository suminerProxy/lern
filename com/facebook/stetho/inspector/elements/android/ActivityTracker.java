package com.facebook.stetho.inspector.elements.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ActivityTracker {
    private static final ActivityTracker sInstance = null;
    @GuardedBy("Looper.getMainLooper()")
    private final ArrayList<WeakReference<Activity>> mActivities;
    private final List<WeakReference<Activity>> mActivitiesUnmodifiable;
    @Nullable
    private AutomaticTracker mAutomaticTracker;
    private final List<Listener> mListeners;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class AutomaticTracker {

        @TargetApi(14)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AutomaticTrackerICSAndBeyond extends AutomaticTracker {
            private final Application mApplication;
            private final Application.ActivityLifecycleCallbacks mLifecycleCallbacks;
            private final ActivityTracker mTracker;

            /* renamed from: com.facebook.stetho.inspector.elements.android.ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class AnonymousClass1 implements Application.ActivityLifecycleCallbacks {
                public final /* synthetic */ AutomaticTrackerICSAndBeyond this$0;

                public AnonymousClass1(AutomaticTrackerICSAndBeyond automaticTrackerICSAndBeyond) {
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

            public AutomaticTrackerICSAndBeyond(Application application, ActivityTracker activityTracker) {
            }

            public static /* synthetic */ ActivityTracker access$100(AutomaticTrackerICSAndBeyond automaticTrackerICSAndBeyond) {
            }

            @Override // com.facebook.stetho.inspector.elements.android.ActivityTracker.AutomaticTracker
            public void register() {
            }

            @Override // com.facebook.stetho.inspector.elements.android.ActivityTracker.AutomaticTracker
            public void unregister() {
            }
        }

        private AutomaticTracker() {
        }

        @Nullable
        public static AutomaticTracker newInstanceIfPossible(Application application, ActivityTracker activityTracker) {
        }

        public abstract void register();

        public abstract void unregister();

        public /* synthetic */ AutomaticTracker(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Listener {
        void onActivityAdded(Activity activity);

        void onActivityRemoved(Activity activity);
    }

    public static ActivityTracker get() {
    }

    private static <T> boolean removeFromWeakList(ArrayList<WeakReference<T>> arrayList, T t) {
    }

    public void add(Activity activity) {
    }

    public boolean beginTrackingIfPossible(Application application) {
    }

    public boolean endTracking() {
    }

    public List<WeakReference<Activity>> getActivitiesView() {
    }

    public void registerListener(Listener listener) {
    }

    public void remove(Activity activity) {
    }

    @Nullable
    public Activity tryGetTopActivity() {
    }

    public void unregisterListener(Listener listener) {
    }
}
