package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    @GuardedBy("sEnabledNotificationListenersLock")
    private static Set<String> sEnabledNotificationListenerPackages;
    @GuardedBy("sEnabledNotificationListenersLock")
    private static String sEnabledNotificationListeners;
    private static final Object sEnabledNotificationListenersLock = null;
    private static final Object sLock = null;
    @GuardedBy("sLock")
    private static SideChannelManager sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class NotifyTask implements Task {
        public final int id;
        public final Notification notif;
        public final String packageName;
        public final String tag;

        public NotifyTask(String str, int i2, String str2, Notification notification) {
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
        }

        @NonNull
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ServiceConnectedEvent {
        public final ComponentName componentName;
        public final IBinder iBinder;

        public ServiceConnectedEvent(ComponentName componentName, IBinder iBinder) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SideChannelManager implements Handler.Callback, ServiceConnection {
        private static final int MSG_QUEUE_TASK = 0;
        private static final int MSG_RETRY_LISTENER_QUEUE = 3;
        private static final int MSG_SERVICE_CONNECTED = 1;
        private static final int MSG_SERVICE_DISCONNECTED = 2;
        private Set<String> mCachedEnabledPackages;
        private final Context mContext;
        private final Handler mHandler;
        private final HandlerThread mHandlerThread;
        private final Map<ComponentName, ListenerRecord> mRecordMap;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class ListenerRecord {
            public boolean bound;
            public final ComponentName componentName;
            public int retryCount;
            public INotificationSideChannel service;
            public ArrayDeque<Task> taskQueue;

            public ListenerRecord(ComponentName componentName) {
            }
        }

        public SideChannelManager(Context context) {
        }

        private boolean ensureServiceBound(ListenerRecord listenerRecord) {
        }

        private void ensureServiceUnbound(ListenerRecord listenerRecord) {
        }

        private void handleQueueTask(Task task) {
        }

        private void handleRetryListenerQueue(ComponentName componentName) {
        }

        private void handleServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        private void handleServiceDisconnected(ComponentName componentName) {
        }

        private void processListenerQueue(ListenerRecord listenerRecord) {
        }

        private void scheduleListenerRetry(ListenerRecord listenerRecord) {
        }

        private void updateListenerMap() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public void queueTask(Task task) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface Task {
        void send(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    private NotificationManagerCompat(Context context) {
    }

    @NonNull
    public static NotificationManagerCompat from(@NonNull Context context) {
    }

    @NonNull
    public static Set<String> getEnabledListenerPackages(@NonNull Context context) {
    }

    private void pushSideChannelQueue(Task task) {
    }

    private static boolean useSideChannelForNotification(Notification notification) {
    }

    public boolean areNotificationsEnabled() {
    }

    public void cancel(int i2) {
    }

    public void cancelAll() {
    }

    public void createNotificationChannel(@NonNull NotificationChannel notificationChannel) {
    }

    public void createNotificationChannelGroup(@NonNull NotificationChannelGroup notificationChannelGroup) {
    }

    public void createNotificationChannelGroups(@NonNull List<NotificationChannelGroup> list) {
    }

    public void createNotificationChannels(@NonNull List<NotificationChannel> list) {
    }

    public void deleteNotificationChannel(@NonNull String str) {
    }

    public void deleteNotificationChannelGroup(@NonNull String str) {
    }

    public int getImportance() {
    }

    @Nullable
    public NotificationChannel getNotificationChannel(@NonNull String str) {
    }

    @Nullable
    public NotificationChannelGroup getNotificationChannelGroup(@NonNull String str) {
    }

    @NonNull
    public List<NotificationChannelGroup> getNotificationChannelGroups() {
    }

    @NonNull
    public List<NotificationChannel> getNotificationChannels() {
    }

    public void notify(int i2, @NonNull Notification notification) {
    }

    public void cancel(@Nullable String str, int i2) {
    }

    public void notify(@Nullable String str, int i2, @NonNull Notification notification) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class CancelTask implements Task {
        public final boolean all;
        public final int id;
        public final String packageName;
        public final String tag;

        public CancelTask(String str) {
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
        }

        @NonNull
        public String toString() {
        }

        public CancelTask(String str, int i2, String str2) {
        }
    }
}
