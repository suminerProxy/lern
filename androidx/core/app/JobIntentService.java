package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class JobIntentService extends Service {
    public static final boolean DEBUG = false;
    public static final String TAG = "JobIntentService";
    public static final HashMap<ComponentName, WorkEnqueuer> sClassWorkEnqueuer = null;
    public static final Object sLock = null;
    public final ArrayList<CompatWorkItem> mCompatQueue;
    public WorkEnqueuer mCompatWorkEnqueuer;
    public CommandProcessor mCurProcessor;
    public boolean mDestroyed;
    public boolean mInterruptIfStopped;
    public CompatJobEngine mJobImpl;
    public boolean mStopped;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        public final /* synthetic */ JobIntentService this$0;

        public CommandProcessor(JobIntentService jobIntentService) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onCancelled(Void r1) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Void r1) {
        }

        /* renamed from: doInBackground  reason: avoid collision after fix types in other method */
        public Void doInBackground2(Void... voidArr) {
        }

        /* renamed from: onCancelled  reason: avoid collision after fix types in other method */
        public void onCancelled2(Void r1) {
        }

        /* renamed from: onPostExecute  reason: avoid collision after fix types in other method */
        public void onPostExecute2(Void r1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final Context mContext;
        private final PowerManager.WakeLock mLaunchWakeLock;
        public boolean mLaunchingService;
        private final PowerManager.WakeLock mRunWakeLock;
        public boolean mServiceProcessing;

        public CompatWorkEnqueuer(Context context, ComponentName componentName) {
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void enqueueWork(Intent intent) {
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void serviceProcessingFinished() {
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void serviceProcessingStarted() {
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void serviceStartReceived() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public final class CompatWorkItem implements GenericWorkItem {
        public final Intent mIntent;
        public final int mStartId;
        public final /* synthetic */ JobIntentService this$0;

        public CompatWorkItem(JobIntentService jobIntentService, Intent intent, int i2) {
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public void complete() {
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public Intent getIntent() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    @RequiresApi(26)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        public static final boolean DEBUG = false;
        public static final String TAG = "JobServiceEngineImpl";
        public final Object mLock;
        public JobParameters mParams;
        public final JobIntentService mService;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public final class WrapperWorkItem implements GenericWorkItem {
            public final JobWorkItem mJobWork;
            public final /* synthetic */ JobServiceEngineImpl this$0;

            public WrapperWorkItem(JobServiceEngineImpl jobServiceEngineImpl, JobWorkItem jobWorkItem) {
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public void complete() {
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public Intent getIntent() {
            }
        }

        public JobServiceEngineImpl(JobIntentService jobIntentService) {
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public IBinder compatGetBinder() {
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public GenericWorkItem dequeueWork() {
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
        }
    }

    @RequiresApi(26)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class JobWorkEnqueuer extends WorkEnqueuer {
        private final JobInfo mJobInfo;
        private final JobScheduler mJobScheduler;

        public JobWorkEnqueuer(Context context, ComponentName componentName, int i2) {
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void enqueueWork(Intent intent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class WorkEnqueuer {
        public final ComponentName mComponentName;
        public boolean mHasJobId;
        public int mJobId;

        public WorkEnqueuer(ComponentName componentName) {
        }

        public abstract void enqueueWork(Intent intent);

        public void ensureJobId(int i2) {
        }

        public void serviceProcessingFinished() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceStartReceived() {
        }
    }

    public static void enqueueWork(@NonNull Context context, @NonNull Class<?> cls, int i2, @NonNull Intent intent) {
    }

    public static WorkEnqueuer getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i2) {
    }

    public GenericWorkItem dequeueWork() {
    }

    public boolean doStopCurrentWork() {
    }

    public void ensureProcessorRunningLocked(boolean z) {
    }

    public boolean isStopped() {
    }

    @Override // android.app.Service
    public IBinder onBind(@NonNull Intent intent) {
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    public abstract void onHandleWork(@NonNull Intent intent);

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i2, int i3) {
    }

    public boolean onStopCurrentWork() {
    }

    public void processorFinished() {
    }

    public void setInterruptIfStopped(boolean z) {
    }

    public static void enqueueWork(@NonNull Context context, @NonNull ComponentName componentName, int i2, @NonNull Intent intent) {
    }
}
