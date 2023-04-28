package com.facebook.imagepipeline.producers;

import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.infer.annotation.FalseOnNull;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class JobScheduler {
    public static final String QUEUE_TIME_KEY = "queueTime";
    private final Runnable mDoJobRunnable;
    @GuardedBy("this")
    @Nullable
    @VisibleForTesting
    public EncodedImage mEncodedImage;
    private final Executor mExecutor;
    private final JobRunnable mJobRunnable;
    @GuardedBy("this")
    @VisibleForTesting
    public long mJobStartTime;
    @GuardedBy("this")
    @VisibleForTesting
    public JobState mJobState;
    @GuardedBy("this")
    @VisibleForTesting
    public long mJobSubmitTime;
    private final int mMinimumJobIntervalMs;
    @GuardedBy("this")
    @VisibleForTesting
    public int mStatus;
    private final Runnable mSubmitJobRunnable;

    /* renamed from: com.facebook.imagepipeline.producers.JobScheduler$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ JobScheduler this$0;

        public AnonymousClass1(final JobScheduler this$0) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.JobScheduler$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ JobScheduler this$0;

        public AnonymousClass2(final JobScheduler this$0) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.JobScheduler$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$imagepipeline$producers$JobScheduler$JobState = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface JobRunnable {
        void run(EncodedImage encodedImage, int status);
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class JobStartExecutorSupplier {
        private static ScheduledExecutorService sJobStarterExecutor;

        public static ScheduledExecutorService get() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class JobState {
        private static final /* synthetic */ JobState[] $VALUES = null;
        public static final JobState IDLE = null;
        public static final JobState QUEUED = null;
        public static final JobState RUNNING = null;
        public static final JobState RUNNING_AND_PENDING = null;

        private JobState(String $enum$name, int $enum$ordinal) {
        }

        public static JobState valueOf(String name) {
        }

        public static JobState[] values() {
        }
    }

    public JobScheduler(Executor executor, JobRunnable jobRunnable, int minimumJobIntervalMs) {
    }

    public static /* synthetic */ void access$000(JobScheduler jobScheduler) {
    }

    public static /* synthetic */ void access$100(JobScheduler jobScheduler) {
    }

    private void doJob() {
    }

    private void enqueueJob(long delay) {
    }

    private void onJobFinished() {
    }

    @FalseOnNull
    private static boolean shouldProcess(@Nullable EncodedImage encodedImage, int status) {
    }

    private void submitJob() {
    }

    public void clearJob() {
    }

    public synchronized long getQueuedTime() {
    }

    public boolean scheduleJob() {
    }

    public boolean updateJob(@Nullable EncodedImage encodedImage, int status) {
    }
}
