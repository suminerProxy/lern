package com.mob.tools.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.HashSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ActivityTracker implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static ActivityTracker f4456a;
    private HashSet<Tracker> b = new HashSet<>();

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface EachTracker extends PublicMemberKeeper {
        void each(Tracker tracker);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Tracker extends PublicMemberKeeper {
        void onCreated(Activity activity, Bundle bundle);

        void onDestroyed(Activity activity);

        void onPaused(Activity activity);

        void onResumed(Activity activity);

        void onSaveInstanceState(Activity activity, Bundle bundle);

        void onStarted(Activity activity);

        void onStopped(Activity activity);
    }

    private ActivityTracker(Context context) {
        a(context);
    }

    public static synchronized ActivityTracker getInstance(Context context) {
        ActivityTracker activityTracker;
        synchronized (ActivityTracker.class) {
            if (f4456a == null) {
                f4456a = new ActivityTracker(context);
            }
            activityTracker = f4456a;
        }
        return activityTracker;
    }

    public void addTracker(Tracker tracker) {
        synchronized (this.b) {
            this.b.add(tracker);
        }
    }

    public void removeTracker(Tracker tracker) {
        synchronized (this.b) {
            this.b.remove(tracker);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Activity activity) {
        a(new EachTracker(this, activity) { // from class: com.mob.tools.utils.ActivityTracker.5

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Activity f4461a;
            public final /* synthetic */ ActivityTracker b;

            @Override // com.mob.tools.utils.ActivityTracker.EachTracker
            public void each(Tracker tracker) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Activity activity) {
        a(new EachTracker(this, activity) { // from class: com.mob.tools.utils.ActivityTracker.6

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Activity f4462a;
            public final /* synthetic */ ActivityTracker b;

            @Override // com.mob.tools.utils.ActivityTracker.EachTracker
            public void each(Tracker tracker) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Activity activity) {
        a(new EachTracker(this, activity) { // from class: com.mob.tools.utils.ActivityTracker.7

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Activity f4463a;
            public final /* synthetic */ ActivityTracker b;

            @Override // com.mob.tools.utils.ActivityTracker.EachTracker
            public void each(Tracker tracker) {
            }
        });
    }

    private void a(Context context) {
        try {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks(this) { // from class: com.mob.tools.utils.ActivityTracker.1

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ ActivityTracker f4457a;

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
            });
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Activity activity) {
        a(new EachTracker(this, activity) { // from class: com.mob.tools.utils.ActivityTracker.4

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Activity f4460a;
            public final /* synthetic */ ActivityTracker b;

            @Override // com.mob.tools.utils.ActivityTracker.EachTracker
            public void each(Tracker tracker) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Activity activity, Bundle bundle) {
        a(new EachTracker(this, activity, bundle) { // from class: com.mob.tools.utils.ActivityTracker.8

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Activity f4464a;
            public final /* synthetic */ Bundle b;
            public final /* synthetic */ ActivityTracker c;

            @Override // com.mob.tools.utils.ActivityTracker.EachTracker
            public void each(Tracker tracker) {
            }
        });
    }

    private void a(EachTracker eachTracker) {
        Tracker[] trackerArr;
        try {
            synchronized (this.b) {
                HashSet<Tracker> hashSet = this.b;
                trackerArr = (Tracker[]) hashSet.toArray(new Tracker[hashSet.size()]);
            }
            for (Tracker tracker : trackerArr) {
                if (tracker != null) {
                    eachTracker.each(tracker);
                }
            }
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, Bundle bundle) {
        a(new EachTracker(this, activity, bundle) { // from class: com.mob.tools.utils.ActivityTracker.2

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Activity f4458a;
            public final /* synthetic */ Bundle b;
            public final /* synthetic */ ActivityTracker c;

            @Override // com.mob.tools.utils.ActivityTracker.EachTracker
            public void each(Tracker tracker) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        a(new EachTracker(this, activity) { // from class: com.mob.tools.utils.ActivityTracker.3

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Activity f4459a;
            public final /* synthetic */ ActivityTracker b;

            @Override // com.mob.tools.utils.ActivityTracker.EachTracker
            public void each(Tracker tracker) {
            }
        });
    }
}
