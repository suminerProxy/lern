package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class MediaBrowserCompat {
    public static final String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
    public static final String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    public static final boolean DEBUG = false;
    public static final String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final String EXTRA_MEDIA_ID = "android.media.browse.extra.MEDIA_ID";
    public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
    public static final String TAG = "MediaBrowserCompat";
    private final MediaBrowserImpl mImpl;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class CallbackHandler extends Handler {
        private final WeakReference<MediaBrowserServiceCallbackImpl> mCallbackImplRef;
        private WeakReference<Messenger> mCallbacksMessengerRef;

        public CallbackHandler(MediaBrowserServiceCallbackImpl callbackImpl) {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message msg) {
        }

        public void setCallbacksMessenger(Messenger callbacksMessenger) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ConnectionCallback {
        public final MediaBrowser.ConnectionCallback mConnectionCallbackFwk;
        public ConnectionCallbackInternal mConnectionCallbackInternal;

        @RequiresApi(21)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class ConnectionCallbackApi21 extends MediaBrowser.ConnectionCallback {
            public final /* synthetic */ ConnectionCallback this$0;

            public ConnectionCallbackApi21(final ConnectionCallback this$0) {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public interface ConnectionCallbackInternal {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }

        public void setInternalConnectionCallback(ConnectionCallbackInternal connectionCallbackInternal) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class CustomActionCallback {
        public void onError(String action, Bundle extras, Bundle data) {
        }

        public void onProgressUpdate(String action, Bundle extras, Bundle data) {
        }

        public void onResult(String action, Bundle extras, Bundle resultData) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class CustomActionResultReceiver extends ResultReceiver {
        private final String mAction;
        private final CustomActionCallback mCallback;
        private final Bundle mExtras;

        public CustomActionResultReceiver(String action, Bundle extras, CustomActionCallback callback, Handler handler) {
        }

        @Override // android.support.v4.os.ResultReceiver
        public void onReceiveResult(int resultCode, Bundle resultData) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class ItemCallback {
        public final MediaBrowser.ItemCallback mItemCallbackFwk;

        @RequiresApi(23)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class ItemCallbackApi23 extends MediaBrowser.ItemCallback {
            public final /* synthetic */ ItemCallback this$0;

            public ItemCallbackApi23(final ItemCallback this$0) {
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onError(@NonNull String itemId) {
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onItemLoaded(MediaBrowser.MediaItem item) {
            }
        }

        public void onError(@NonNull String itemId) {
        }

        public void onItemLoaded(MediaItem item) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ItemReceiver extends ResultReceiver {
        private final ItemCallback mCallback;
        private final String mMediaId;

        public ItemReceiver(String mediaId, ItemCallback callback, Handler handler) {
        }

        @Override // android.support.v4.os.ResultReceiver
        public void onReceiveResult(int resultCode, Bundle resultData) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface MediaBrowserImpl {
        void connect();

        void disconnect();

        @Nullable
        Bundle getExtras();

        void getItem(@NonNull String mediaId, @NonNull ItemCallback cb);

        @Nullable
        Bundle getNotifyChildrenChangedOptions();

        @NonNull
        String getRoot();

        ComponentName getServiceComponent();

        @NonNull
        MediaSessionCompat.Token getSessionToken();

        boolean isConnected();

        void search(@NonNull String query, Bundle extras, @NonNull SearchCallback callback);

        void sendCustomAction(@NonNull String action, Bundle extras, @Nullable CustomActionCallback callback);

        void subscribe(@NonNull String parentId, @Nullable Bundle options, @NonNull SubscriptionCallback callback);

        void unsubscribe(@NonNull String parentId, SubscriptionCallback callback);
    }

    @RequiresApi(21)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MediaBrowserImplApi21 implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl, ConnectionCallback.ConnectionCallbackInternal {
        public final MediaBrowser mBrowserFwk;
        public Messenger mCallbacksMessenger;
        public final Context mContext;
        public final CallbackHandler mHandler;
        private MediaSessionCompat.Token mMediaSessionToken;
        private Bundle mNotifyChildrenChangedOptions;
        public final Bundle mRootHints;
        public ServiceBinderWrapper mServiceBinderWrapper;
        public int mServiceVersion;
        private final ArrayMap<String, Subscription> mSubscriptions;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ MediaBrowserImplApi21 this$0;
            public final /* synthetic */ ItemCallback val$cb;
            public final /* synthetic */ String val$mediaId;

            public AnonymousClass1(final MediaBrowserImplApi21 this$0, final ItemCallback val$cb, final String val$mediaId) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 implements Runnable {
            public final /* synthetic */ MediaBrowserImplApi21 this$0;
            public final /* synthetic */ ItemCallback val$cb;
            public final /* synthetic */ String val$mediaId;

            public AnonymousClass2(final MediaBrowserImplApi21 this$0, final ItemCallback val$cb, final String val$mediaId) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass3 implements Runnable {
            public final /* synthetic */ MediaBrowserImplApi21 this$0;
            public final /* synthetic */ ItemCallback val$cb;
            public final /* synthetic */ String val$mediaId;

            public AnonymousClass3(final MediaBrowserImplApi21 this$0, final ItemCallback val$cb, final String val$mediaId) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass4 implements Runnable {
            public final /* synthetic */ MediaBrowserImplApi21 this$0;
            public final /* synthetic */ SearchCallback val$callback;
            public final /* synthetic */ Bundle val$extras;
            public final /* synthetic */ String val$query;

            public AnonymousClass4(final MediaBrowserImplApi21 this$0, final SearchCallback val$callback, final String val$query, final Bundle val$extras) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$5  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass5 implements Runnable {
            public final /* synthetic */ MediaBrowserImplApi21 this$0;
            public final /* synthetic */ SearchCallback val$callback;
            public final /* synthetic */ Bundle val$extras;
            public final /* synthetic */ String val$query;

            public AnonymousClass5(final MediaBrowserImplApi21 this$0, final SearchCallback val$callback, final String val$query, final Bundle val$extras) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$6  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass6 implements Runnable {
            public final /* synthetic */ MediaBrowserImplApi21 this$0;
            public final /* synthetic */ String val$action;
            public final /* synthetic */ CustomActionCallback val$callback;
            public final /* synthetic */ Bundle val$extras;

            public AnonymousClass6(final MediaBrowserImplApi21 this$0, final CustomActionCallback val$callback, final String val$action, final Bundle val$extras) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$7  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass7 implements Runnable {
            public final /* synthetic */ MediaBrowserImplApi21 this$0;
            public final /* synthetic */ String val$action;
            public final /* synthetic */ CustomActionCallback val$callback;
            public final /* synthetic */ Bundle val$extras;

            public AnonymousClass7(final MediaBrowserImplApi21 this$0, final CustomActionCallback val$callback, final String val$action, final Bundle val$extras) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public MediaBrowserImplApi21(Context context, ComponentName serviceComponent, ConnectionCallback callback, Bundle rootHints) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @Nullable
        public Bundle getExtras() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(@NonNull final String mediaId, @NonNull final ItemCallback cb) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getNotifyChildrenChangedOptions() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @NonNull
        public String getRoot() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public ComponentName getServiceComponent() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @NonNull
        public MediaSessionCompat.Token getSessionToken() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnected() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionFailed() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(Messenger callback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionSuspended() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(Messenger callback, String parentId, List<MediaItem> list, Bundle options, Bundle notifyChildrenChangedOptions) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(final Messenger callback, final String root, final MediaSessionCompat.Token session, final Bundle extra) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void search(@NonNull final String query, final Bundle extras, @NonNull final SearchCallback callback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(@NonNull final String action, final Bundle extras, @Nullable final CustomActionCallback callback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(@NonNull final String parentId, final Bundle options, @NonNull final SubscriptionCallback callback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(@NonNull String parentId, SubscriptionCallback callback) {
        }
    }

    @RequiresApi(23)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MediaBrowserImplApi23 extends MediaBrowserImplApi21 {
        public MediaBrowserImplApi23(Context context, ComponentName serviceComponent, ConnectionCallback callback, Bundle rootHints) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(@NonNull final String mediaId, @NonNull final ItemCallback cb) {
        }
    }

    @RequiresApi(26)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MediaBrowserImplApi26 extends MediaBrowserImplApi23 {
        public MediaBrowserImplApi26(Context context, ComponentName serviceComponent, ConnectionCallback callback, Bundle rootHints) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(@NonNull String parentId, @Nullable Bundle options, @NonNull SubscriptionCallback callback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(@NonNull String parentId, SubscriptionCallback callback) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MediaBrowserImplBase implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl {
        public static final int CONNECT_STATE_CONNECTED = 3;
        public static final int CONNECT_STATE_CONNECTING = 2;
        public static final int CONNECT_STATE_DISCONNECTED = 1;
        public static final int CONNECT_STATE_DISCONNECTING = 0;
        public static final int CONNECT_STATE_SUSPENDED = 4;
        public final ConnectionCallback mCallback;
        public Messenger mCallbacksMessenger;
        public final Context mContext;
        private Bundle mExtras;
        public final CallbackHandler mHandler;
        private MediaSessionCompat.Token mMediaSessionToken;
        private Bundle mNotifyChildrenChangedOptions;
        public final Bundle mRootHints;
        private String mRootId;
        public ServiceBinderWrapper mServiceBinderWrapper;
        public final ComponentName mServiceComponent;
        public MediaServiceConnection mServiceConnection;
        public int mState;
        private final ArrayMap<String, Subscription> mSubscriptions;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ MediaBrowserImplBase this$0;

            public AnonymousClass1(final MediaBrowserImplBase this$0) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 implements Runnable {
            public final /* synthetic */ MediaBrowserImplBase this$0;

            public AnonymousClass2(final MediaBrowserImplBase this$0) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass3 implements Runnable {
            public final /* synthetic */ MediaBrowserImplBase this$0;
            public final /* synthetic */ ItemCallback val$cb;
            public final /* synthetic */ String val$mediaId;

            public AnonymousClass3(final MediaBrowserImplBase this$0, final ItemCallback val$cb, final String val$mediaId) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass4 implements Runnable {
            public final /* synthetic */ MediaBrowserImplBase this$0;
            public final /* synthetic */ ItemCallback val$cb;
            public final /* synthetic */ String val$mediaId;

            public AnonymousClass4(final MediaBrowserImplBase this$0, final ItemCallback val$cb, final String val$mediaId) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$5  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass5 implements Runnable {
            public final /* synthetic */ MediaBrowserImplBase this$0;
            public final /* synthetic */ SearchCallback val$callback;
            public final /* synthetic */ Bundle val$extras;
            public final /* synthetic */ String val$query;

            public AnonymousClass5(final MediaBrowserImplBase this$0, final SearchCallback val$callback, final String val$query, final Bundle val$extras) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$6  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass6 implements Runnable {
            public final /* synthetic */ MediaBrowserImplBase this$0;
            public final /* synthetic */ String val$action;
            public final /* synthetic */ CustomActionCallback val$callback;
            public final /* synthetic */ Bundle val$extras;

            public AnonymousClass6(final MediaBrowserImplBase this$0, final CustomActionCallback val$callback, final String val$action, final Bundle val$extras) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class MediaServiceConnection implements ServiceConnection {
            public final /* synthetic */ MediaBrowserImplBase this$0;

            /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
            public class AnonymousClass1 implements Runnable {
                public final /* synthetic */ MediaServiceConnection this$1;
                public final /* synthetic */ IBinder val$binder;
                public final /* synthetic */ ComponentName val$name;

                public AnonymousClass1(final MediaServiceConnection this$1, final ComponentName val$name, final IBinder val$binder) {
                }

                @Override // java.lang.Runnable
                public void run() {
                }
            }

            /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
            public class AnonymousClass2 implements Runnable {
                public final /* synthetic */ MediaServiceConnection this$1;
                public final /* synthetic */ ComponentName val$name;

                public AnonymousClass2(final MediaServiceConnection this$1, final ComponentName val$name) {
                }

                @Override // java.lang.Runnable
                public void run() {
                }
            }

            public MediaServiceConnection(final MediaBrowserImplBase this$0) {
            }

            private void postOrRun(Runnable r) {
            }

            public boolean isCurrent(String funcName) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(final ComponentName name, final IBinder binder) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(final ComponentName name) {
            }
        }

        public MediaBrowserImplBase(Context context, ComponentName serviceComponent, ConnectionCallback callback, Bundle rootHints) {
        }

        private static String getStateLabel(int state) {
        }

        private boolean isCurrent(Messenger callback, String funcName) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
        }

        public void dump() {
        }

        public void forceCloseConnection() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @Nullable
        public Bundle getExtras() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(@NonNull final String mediaId, @NonNull final ItemCallback cb) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getNotifyChildrenChangedOptions() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @NonNull
        public String getRoot() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @NonNull
        public ComponentName getServiceComponent() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @NonNull
        public MediaSessionCompat.Token getSessionToken() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(final Messenger callback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(final Messenger callback, final String parentId, final List<MediaItem> list, final Bundle options, final Bundle notifyChildrenChangedOptions) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(final Messenger callback, final String root, final MediaSessionCompat.Token session, final Bundle extra) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void search(@NonNull final String query, final Bundle extras, @NonNull final SearchCallback callback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(@NonNull final String action, final Bundle extras, @Nullable final CustomActionCallback callback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(@NonNull String parentId, Bundle options, @NonNull SubscriptionCallback callback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(@NonNull String parentId, SubscriptionCallback callback) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface MediaBrowserServiceCallbackImpl {
        void onConnectionFailed(Messenger callback);

        void onLoadChildren(Messenger callback, String parentId, List<MediaItem> list, Bundle options, Bundle notifyChildrenChangedOptions);

        void onServiceConnected(Messenger callback, String root, MediaSessionCompat.Token session, Bundle extra);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class SearchCallback {
        public void onError(@NonNull String query, Bundle extras) {
        }

        public void onSearchResult(@NonNull String query, Bundle extras, @NonNull List<MediaItem> items) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SearchResultReceiver extends ResultReceiver {
        private final SearchCallback mCallback;
        private final Bundle mExtras;
        private final String mQuery;

        public SearchResultReceiver(String query, Bundle extras, SearchCallback callback, Handler handler) {
        }

        @Override // android.support.v4.os.ResultReceiver
        public void onReceiveResult(int resultCode, Bundle resultData) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ServiceBinderWrapper {
        private Messenger mMessenger;
        private Bundle mRootHints;

        public ServiceBinderWrapper(IBinder target, Bundle rootHints) {
        }

        private void sendRequest(int what, Bundle data, Messenger cbMessenger) throws RemoteException {
        }

        public void addSubscription(String parentId, IBinder callbackToken, Bundle options, Messenger callbacksMessenger) throws RemoteException {
        }

        public void connect(Context context, Messenger callbacksMessenger) throws RemoteException {
        }

        public void disconnect(Messenger callbacksMessenger) throws RemoteException {
        }

        public void getMediaItem(String mediaId, ResultReceiver receiver, Messenger callbacksMessenger) throws RemoteException {
        }

        public void registerCallbackMessenger(Context context, Messenger callbackMessenger) throws RemoteException {
        }

        public void removeSubscription(String parentId, IBinder callbackToken, Messenger callbacksMessenger) throws RemoteException {
        }

        public void search(String query, Bundle extras, ResultReceiver receiver, Messenger callbacksMessenger) throws RemoteException {
        }

        public void sendCustomAction(String action, Bundle extras, ResultReceiver receiver, Messenger callbacksMessenger) throws RemoteException {
        }

        public void unregisterCallbackMessenger(Messenger callbackMessenger) throws RemoteException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Subscription {
        private final List<SubscriptionCallback> mCallbacks;
        private final List<Bundle> mOptionsList;

        public SubscriptionCallback getCallback(Bundle options) {
        }

        public List<SubscriptionCallback> getCallbacks() {
        }

        public List<Bundle> getOptionsList() {
        }

        public boolean isEmpty() {
        }

        public void putCallback(Bundle options, SubscriptionCallback callback) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class SubscriptionCallback {
        public final MediaBrowser.SubscriptionCallback mSubscriptionCallbackFwk;
        public WeakReference<Subscription> mSubscriptionRef;
        public final IBinder mToken;

        @RequiresApi(21)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class SubscriptionCallbackApi21 extends MediaBrowser.SubscriptionCallback {
            public final /* synthetic */ SubscriptionCallback this$0;

            public SubscriptionCallbackApi21(final SubscriptionCallback this$0) {
            }

            public List<MediaItem> applyOptions(List<MediaItem> list, final Bundle options) {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(@NonNull String parentId, List<MediaBrowser.MediaItem> children) {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(@NonNull String parentId) {
            }
        }

        @RequiresApi(26)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class SubscriptionCallbackApi26 extends SubscriptionCallbackApi21 {
            public final /* synthetic */ SubscriptionCallback this$0;

            public SubscriptionCallbackApi26(final SubscriptionCallback this$0) {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(@NonNull String parentId, @NonNull List<MediaBrowser.MediaItem> children, @NonNull Bundle options) {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(@NonNull String parentId, @NonNull Bundle options) {
            }
        }

        public void onChildrenLoaded(@NonNull String parentId, @NonNull List<MediaItem> children) {
        }

        public void onChildrenLoaded(@NonNull String parentId, @NonNull List<MediaItem> children, @NonNull Bundle options) {
        }

        public void onError(@NonNull String parentId) {
        }

        public void onError(@NonNull String parentId, @NonNull Bundle options) {
        }

        public void setSubscription(Subscription subscription) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName serviceComponent, ConnectionCallback callback, Bundle rootHints) {
    }

    public void connect() {
    }

    public void disconnect() {
    }

    @Nullable
    public Bundle getExtras() {
    }

    public void getItem(@NonNull final String mediaId, @NonNull final ItemCallback cb) {
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Bundle getNotifyChildrenChangedOptions() {
    }

    @NonNull
    public String getRoot() {
    }

    @NonNull
    public ComponentName getServiceComponent() {
    }

    @NonNull
    public MediaSessionCompat.Token getSessionToken() {
    }

    public boolean isConnected() {
    }

    public void search(@NonNull final String query, final Bundle extras, @NonNull SearchCallback callback) {
    }

    public void sendCustomAction(@NonNull String action, Bundle extras, @Nullable CustomActionCallback callback) {
    }

    public void subscribe(@NonNull String parentId, @NonNull SubscriptionCallback callback) {
    }

    public void unsubscribe(@NonNull String parentId) {
    }

    public void unsubscribe(@NonNull String parentId, @NonNull SubscriptionCallback callback) {
    }

    public void subscribe(@NonNull String parentId, @NonNull Bundle options, @NonNull SubscriptionCallback callback) {
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = null;
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        private final MediaDescriptionCompat mDescription;
        private final int mFlags;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ MediaItem createFromParcel(Parcel in) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ MediaItem[] newArray(int size) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MediaItem createFromParcel(Parcel in) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MediaItem[] newArray(int size) {
            }
        }

        public MediaItem(@NonNull MediaDescriptionCompat description, int flags) {
        }

        public static MediaItem fromMediaItem(Object itemObj) {
        }

        public static List<MediaItem> fromMediaItemList(List<?> itemList) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @NonNull
        public MediaDescriptionCompat getDescription() {
        }

        public int getFlags() {
        }

        @Nullable
        public String getMediaId() {
        }

        public boolean isBrowsable() {
        }

        public boolean isPlayable() {
        }

        @NonNull
        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
        }

        public MediaItem(Parcel in) {
        }
    }
}
