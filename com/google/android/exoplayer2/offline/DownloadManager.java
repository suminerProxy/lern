package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DownloadManager {
    public static final int DEFAULT_MAX_PARALLEL_DOWNLOADS = 3;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    public static final Requirements DEFAULT_REQUIREMENTS = null;
    private static final int MSG_ADD_DOWNLOAD = 6;
    private static final int MSG_CONTENT_LENGTH_CHANGED = 10;
    private static final int MSG_DOWNLOAD_UPDATE = 2;
    private static final int MSG_INITIALIZE = 0;
    private static final int MSG_INITIALIZED = 0;
    private static final int MSG_PROCESSED = 1;
    private static final int MSG_RELEASE = 12;
    private static final int MSG_REMOVE_ALL_DOWNLOADS = 8;
    private static final int MSG_REMOVE_DOWNLOAD = 7;
    private static final int MSG_SET_DOWNLOADS_PAUSED = 1;
    private static final int MSG_SET_MAX_PARALLEL_DOWNLOADS = 4;
    private static final int MSG_SET_MIN_RETRY_COUNT = 5;
    private static final int MSG_SET_NOT_MET_REQUIREMENTS = 2;
    private static final int MSG_SET_STOP_REASON = 3;
    private static final int MSG_TASK_STOPPED = 9;
    private static final int MSG_UPDATE_PROGRESS = 11;
    private static final String TAG = "DownloadManager";
    private int activeTaskCount;
    private final Handler applicationHandler;
    private final Context context;
    private final WritableDownloadIndex downloadIndex;
    private List<Download> downloads;
    private boolean downloadsPaused;
    private boolean initialized;
    private final InternalHandler internalHandler;
    private final CopyOnWriteArraySet<Listener> listeners;
    private int maxParallelDownloads;
    private int minRetryCount;
    private int notMetRequirements;
    private int pendingMessages;
    private final RequirementsWatcher.Listener requirementsListener;
    private RequirementsWatcher requirementsWatcher;
    private boolean waitingForRequirements;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DownloadUpdate {
        public final Download download;
        public final List<Download> downloads;
        @Nullable
        public final Exception finalException;
        public final boolean isRemove;

        public DownloadUpdate(Download download, boolean isRemove, List<Download> downloads, @Nullable Exception finalException) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Listener {
        void onDownloadChanged(DownloadManager downloadManager, Download download, @Nullable Exception finalException);

        void onDownloadRemoved(DownloadManager downloadManager, Download download);

        void onDownloadsPausedChanged(DownloadManager downloadManager, boolean downloadsPaused);

        void onIdle(DownloadManager downloadManager);

        void onInitialized(DownloadManager downloadManager);

        void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int notMetRequirements);

        void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean waitingForRequirements);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Task extends Thread implements Downloader.ProgressListener {
        private long contentLength;
        private final DownloadProgress downloadProgress;
        private final Downloader downloader;
        @Nullable
        private Exception finalException;
        @Nullable
        private volatile InternalHandler internalHandler;
        private volatile boolean isCanceled;
        private final boolean isRemove;
        private final int minRetryCount;
        private final DownloadRequest request;

        public /* synthetic */ Task(DownloadRequest downloadRequest, Downloader downloader, DownloadProgress downloadProgress, boolean z, int i2, InternalHandler internalHandler, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ boolean access$000(Task task) {
        }

        public static /* synthetic */ DownloadRequest access$200(Task task) {
        }

        public static /* synthetic */ boolean access$300(Task task) {
        }

        public static /* synthetic */ Exception access$400(Task task) {
        }

        private static int getRetryDelayMillis(int errorCount) {
        }

        public void cancel(boolean released) {
        }

        @Override // com.google.android.exoplayer2.offline.Downloader.ProgressListener
        public void onProgress(long contentLength, long bytesDownloaded, float percentDownloaded) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }

        private Task(DownloadRequest request, Downloader downloader, DownloadProgress downloadProgress, boolean isRemove, int minRetryCount, InternalHandler internalHandler) {
        }
    }

    @Deprecated
    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory upstreamFactory) {
    }

    public static /* synthetic */ void a(DownloadManager downloadManager, RequirementsWatcher requirementsWatcher, int i2) {
    }

    public static /* synthetic */ boolean b(DownloadManager downloadManager, Message message) {
    }

    private boolean handleMainMessage(Message message) {
    }

    public static Download mergeRequest(Download download, DownloadRequest request, int stopReason, long nowMs) {
    }

    private void notifyWaitingForRequirementsChanged() {
    }

    private void onDownloadUpdate(DownloadUpdate update) {
    }

    private void onInitialized(List<Download> downloads) {
    }

    private void onMessageProcessed(int processedMessageCount, int activeTaskCount) {
    }

    private void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int notMetRequirements) {
    }

    private void setDownloadsPaused(boolean downloadsPaused) {
    }

    private boolean updateWaitingForRequirements() {
    }

    public void addDownload(DownloadRequest request) {
    }

    public void addListener(Listener listener) {
    }

    public Looper getApplicationLooper() {
    }

    public List<Download> getCurrentDownloads() {
    }

    public DownloadIndex getDownloadIndex() {
    }

    public boolean getDownloadsPaused() {
    }

    public int getMaxParallelDownloads() {
    }

    public int getMinRetryCount() {
    }

    public int getNotMetRequirements() {
    }

    public Requirements getRequirements() {
    }

    public boolean isIdle() {
    }

    public boolean isInitialized() {
    }

    public boolean isWaitingForRequirements() {
    }

    public void pauseDownloads() {
    }

    public void release() {
    }

    public void removeAllDownloads() {
    }

    public void removeDownload(String id) {
    }

    public void removeListener(Listener listener) {
    }

    public void resumeDownloads() {
    }

    public void setMaxParallelDownloads(int maxParallelDownloads) {
    }

    public void setMinRetryCount(int minRetryCount) {
    }

    public void setRequirements(Requirements requirements) {
    }

    public void setStopReason(@Nullable String id, int stopReason) {
    }

    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory upstreamFactory, Executor executor) {
    }

    public void addDownload(DownloadRequest request, int stopReason) {
    }

    public DownloadManager(Context context, WritableDownloadIndex downloadIndex, DownloaderFactory downloaderFactory) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class InternalHandler extends Handler {
        private static final int UPDATE_PROGRESS_INTERVAL_MS = 5000;
        private int activeDownloadTaskCount;
        private final HashMap<String, Task> activeTasks;
        private final WritableDownloadIndex downloadIndex;
        private final DownloaderFactory downloaderFactory;
        private final ArrayList<Download> downloads;
        private boolean downloadsPaused;
        private final Handler mainHandler;
        private int maxParallelDownloads;
        private int minRetryCount;
        private int notMetRequirements;
        public boolean released;
        private final HandlerThread thread;

        public InternalHandler(HandlerThread thread, WritableDownloadIndex downloadIndex, DownloaderFactory downloaderFactory, Handler mainHandler, int maxParallelDownloads, int minRetryCount, boolean downloadsPaused) {
        }

        public static /* synthetic */ int a(Download download, Download download2) {
        }

        private void addDownload(DownloadRequest request, int stopReason) {
        }

        private boolean canDownloadsRun() {
        }

        private static int compareStartTimes(Download first, Download second) {
        }

        private static Download copyDownloadWithState(Download download, int state, int stopReason) {
        }

        @Nullable
        private Download getDownload(String id, boolean loadFromIndex) {
        }

        private int getDownloadIndex(String id) {
        }

        private void initialize(int notMetRequirements) {
        }

        private void onContentLengthChanged(Task task, long contentLength) {
        }

        private void onDownloadTaskStopped(Download download, @Nullable Exception finalException) {
        }

        private void onRemoveTaskStopped(Download download) {
        }

        private void onTaskStopped(Task task) {
        }

        private Download putDownload(Download download) {
        }

        private Download putDownloadWithState(Download download, int state, int stopReason) {
        }

        private void release() {
        }

        private void removeAllDownloads() {
        }

        private void removeDownload(String id) {
        }

        private void setDownloadsPaused(boolean downloadsPaused) {
        }

        private void setMaxParallelDownloads(int maxParallelDownloads) {
        }

        private void setMinRetryCount(int minRetryCount) {
        }

        private void setNotMetRequirements(int notMetRequirements) {
        }

        private void setStopReason(@Nullable String id, int stopReason) {
        }

        private void syncDownloadingDownload(Task activeTask, Download download, int accumulatingDownloadTaskCount) {
        }

        @Nullable
        @CheckResult
        private Task syncQueuedDownload(@Nullable Task activeTask, Download download) {
        }

        private void syncRemovingDownload(@Nullable Task activeTask, Download download) {
        }

        private void syncStoppedDownload(@Nullable Task activeTask) {
        }

        private void syncTasks() {
        }

        private void updateProgress() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }

        private void setStopReason(Download download, int stopReason) {
        }
    }
}
