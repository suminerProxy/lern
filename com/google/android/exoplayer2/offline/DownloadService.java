package com.google.android.exoplayer2.offline;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.Scheduler;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class DownloadService extends Service {
    public static final String ACTION_ADD_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD";
    public static final String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
    public static final String ACTION_PAUSE_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
    public static final String ACTION_REMOVE_ALL_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    public static final String ACTION_REMOVE_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
    private static final String ACTION_RESTART = "com.google.android.exoplayer.downloadService.action.RESTART";
    public static final String ACTION_RESUME_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS";
    public static final String ACTION_SET_REQUIREMENTS = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS";
    public static final String ACTION_SET_STOP_REASON = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON";
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final int FOREGROUND_NOTIFICATION_ID_NONE = 0;
    public static final String KEY_CONTENT_ID = "content_id";
    public static final String KEY_DOWNLOAD_REQUEST = "download_request";
    public static final String KEY_FOREGROUND = "foreground";
    public static final String KEY_REQUIREMENTS = "requirements";
    public static final String KEY_STOP_REASON = "stop_reason";
    private static final String TAG = "DownloadService";
    private static final HashMap<Class<? extends DownloadService>, DownloadManagerHelper> downloadManagerHelpers = null;
    @StringRes
    private final int channelDescriptionResourceId;
    @Nullable
    private final String channelId;
    @StringRes
    private final int channelNameResourceId;
    private DownloadManager downloadManager;
    @Nullable
    private final ForegroundNotificationUpdater foregroundNotificationUpdater;
    private boolean isDestroyed;
    private boolean isStopped;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DownloadManagerHelper implements DownloadManager.Listener {
        private final Context context;
        private final DownloadManager downloadManager;
        @Nullable
        private DownloadService downloadService;
        private final boolean foregroundAllowed;
        @Nullable
        private final Scheduler scheduler;
        private final Class<? extends DownloadService> serviceClass;

        public /* synthetic */ DownloadManagerHelper(Context context, DownloadManager downloadManager, boolean z, Scheduler scheduler, Class cls, AnonymousClass1 anonymousClass1) {
        }

        private /* synthetic */ void a(DownloadService downloadService) {
        }

        public static /* synthetic */ DownloadManager access$100(DownloadManagerHelper downloadManagerHelper) {
        }

        private void restartService() {
        }

        private boolean serviceMayNeedRestart() {
        }

        private void updateScheduler() {
        }

        public void attachService(DownloadService downloadService) {
        }

        public /* synthetic */ void b(DownloadService downloadService) {
        }

        public void detachService(DownloadService downloadService) {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onDownloadChanged(DownloadManager downloadManager, Download download, @Nullable Exception finalException) {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onDownloadRemoved(DownloadManager downloadManager, Download download) {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public /* synthetic */ void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z) {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onIdle(DownloadManager downloadManager) {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onInitialized(DownloadManager downloadManager) {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public /* synthetic */ void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i2) {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean waitingForRequirements) {
        }

        private DownloadManagerHelper(Context context, DownloadManager downloadManager, boolean foregroundAllowed, @Nullable Scheduler scheduler, Class<? extends DownloadService> serviceClass) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ForegroundNotificationUpdater {
        private final Handler handler;
        private boolean notificationDisplayed;
        private final int notificationId;
        private boolean periodicUpdatesStarted;
        public final /* synthetic */ DownloadService this$0;
        private final long updateInterval;

        public ForegroundNotificationUpdater(final DownloadService this$0, int notificationId, long updateInterval) {
        }

        public static /* synthetic */ void a(ForegroundNotificationUpdater foregroundNotificationUpdater) {
        }

        private void update() {
        }

        public void invalidate() {
        }

        public void showNotificationIfNotAlready() {
        }

        public void startPeriodicUpdates() {
        }

        public void stopPeriodicUpdates() {
        }
    }

    public DownloadService(int foregroundNotificationId) {
    }

    public static /* synthetic */ DownloadManager access$200(DownloadService downloadService) {
    }

    public static /* synthetic */ void access$300(DownloadService downloadService, List list) {
    }

    public static /* synthetic */ void access$400(DownloadService downloadService, Download download) {
    }

    public static /* synthetic */ boolean access$500(int i2) {
    }

    public static /* synthetic */ void access$600(DownloadService downloadService, Download download) {
    }

    public static /* synthetic */ void access$700(DownloadService downloadService) {
    }

    public static /* synthetic */ boolean access$800(DownloadService downloadService) {
    }

    public static /* synthetic */ Intent access$900(Context context, Class cls, String str) {
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> clazz, DownloadRequest downloadRequest, boolean foreground) {
    }

    public static Intent buildPauseDownloadsIntent(Context context, Class<? extends DownloadService> clazz, boolean foreground) {
    }

    public static Intent buildRemoveAllDownloadsIntent(Context context, Class<? extends DownloadService> clazz, boolean foreground) {
    }

    public static Intent buildRemoveDownloadIntent(Context context, Class<? extends DownloadService> clazz, String id, boolean foreground) {
    }

    public static Intent buildResumeDownloadsIntent(Context context, Class<? extends DownloadService> clazz, boolean foreground) {
    }

    public static Intent buildSetRequirementsIntent(Context context, Class<? extends DownloadService> clazz, Requirements requirements, boolean foreground) {
    }

    public static Intent buildSetStopReasonIntent(Context context, Class<? extends DownloadService> clazz, @Nullable String id, int stopReason, boolean foreground) {
    }

    private static Intent getIntent(Context context, Class<? extends DownloadService> clazz, String action, boolean foreground) {
    }

    private boolean isStopped() {
    }

    private static boolean needsStartedService(int state) {
    }

    private void notifyDownloadChanged(Download download) {
    }

    private void notifyDownloadRemoved(Download download) {
    }

    private void notifyDownloads(List<Download> downloads) {
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> clazz, DownloadRequest downloadRequest, boolean foreground) {
    }

    public static void sendPauseDownloads(Context context, Class<? extends DownloadService> clazz, boolean foreground) {
    }

    public static void sendRemoveAllDownloads(Context context, Class<? extends DownloadService> clazz, boolean foreground) {
    }

    public static void sendRemoveDownload(Context context, Class<? extends DownloadService> clazz, String id, boolean foreground) {
    }

    public static void sendResumeDownloads(Context context, Class<? extends DownloadService> clazz, boolean foreground) {
    }

    public static void sendSetRequirements(Context context, Class<? extends DownloadService> clazz, Requirements requirements, boolean foreground) {
    }

    public static void sendSetStopReason(Context context, Class<? extends DownloadService> clazz, @Nullable String id, int stopReason, boolean foreground) {
    }

    public static void start(Context context, Class<? extends DownloadService> clazz) {
    }

    public static void startForeground(Context context, Class<? extends DownloadService> clazz) {
    }

    private static void startService(Context context, Intent intent, boolean foreground) {
    }

    private void stop() {
    }

    public abstract DownloadManager getDownloadManager();

    public abstract Notification getForegroundNotification(List<Download> downloads);

    @Nullable
    public abstract Scheduler getScheduler();

    public final void invalidateForegroundNotification() {
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Deprecated
    public void onDownloadChanged(Download download) {
    }

    @Deprecated
    public void onDownloadRemoved(Download download) {
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent rootIntent) {
    }

    public DownloadService(int foregroundNotificationId, long foregroundNotificationUpdateInterval) {
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> clazz, DownloadRequest downloadRequest, int stopReason, boolean foreground) {
    }

    private static Intent getIntent(Context context, Class<? extends DownloadService> clazz, String action) {
    }

    @Deprecated
    public DownloadService(int foregroundNotificationId, long foregroundNotificationUpdateInterval, @Nullable String channelId, @StringRes int channelNameResourceId) {
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> clazz, DownloadRequest downloadRequest, int stopReason, boolean foreground) {
    }

    public DownloadService(int foregroundNotificationId, long foregroundNotificationUpdateInterval, @Nullable String channelId, @StringRes int channelNameResourceId, @StringRes int channelDescriptionResourceId) {
    }
}
