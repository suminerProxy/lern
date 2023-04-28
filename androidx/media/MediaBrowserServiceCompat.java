package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.core.util.Pair;
import androidx.media.MediaSessionManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    public static final boolean DEBUG = false;
    private static final float EPSILON = 1.0E-5f;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String KEY_MEDIA_ITEM = "media_item";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String KEY_SEARCH_RESULTS = "search_results";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int RESULT_ERROR = -1;
    public static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
    public static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
    public static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int RESULT_OK = 0;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int RESULT_PROGRESS_UPDATE = 1;
    public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    public static final String TAG = "MBServiceCompat";
    public final ConnectionRecord mConnectionFromFwk;
    public final ArrayMap<IBinder, ConnectionRecord> mConnections;
    public ConnectionRecord mCurConnection;
    public final ServiceHandler mHandler;
    private MediaBrowserServiceImpl mImpl;
    public final ArrayList<ConnectionRecord> mPendingConnections;
    public MediaSessionCompat.Token mSession;

    /* renamed from: androidx.media.MediaBrowserServiceCompat$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends Result<List<MediaBrowserCompat.MediaItem>> {
        public final /* synthetic */ MediaBrowserServiceCompat this$0;
        public final /* synthetic */ ConnectionRecord val$connection;
        public final /* synthetic */ Bundle val$notifyChildrenChangedOptions;
        public final /* synthetic */ String val$parentId;
        public final /* synthetic */ Bundle val$subscribeOptions;

        public AnonymousClass1(final MediaBrowserServiceCompat this$0, Object debug, final ConnectionRecord val$connection, final String val$parentId, final Bundle val$subscribeOptions, final Bundle val$notifyChildrenChangedOptions) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        public /* bridge */ /* synthetic */ void onResultSent(List<MediaBrowserCompat.MediaItem> list) {
        }

        /* renamed from: onResultSent  reason: avoid collision after fix types in other method */
        public void onResultSent2(List<MediaBrowserCompat.MediaItem> list) {
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends Result<MediaBrowserCompat.MediaItem> {
        public final /* synthetic */ MediaBrowserServiceCompat this$0;
        public final /* synthetic */ ResultReceiver val$receiver;

        public AnonymousClass2(final MediaBrowserServiceCompat this$0, Object debug, final ResultReceiver val$receiver) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        public /* bridge */ /* synthetic */ void onResultSent(MediaBrowserCompat.MediaItem item) {
        }

        /* renamed from: onResultSent  reason: avoid collision after fix types in other method */
        public void onResultSent2(MediaBrowserCompat.MediaItem item) {
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 extends Result<List<MediaBrowserCompat.MediaItem>> {
        public final /* synthetic */ MediaBrowserServiceCompat this$0;
        public final /* synthetic */ ResultReceiver val$receiver;

        public AnonymousClass3(final MediaBrowserServiceCompat this$0, Object debug, final ResultReceiver val$receiver) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        public /* bridge */ /* synthetic */ void onResultSent(List<MediaBrowserCompat.MediaItem> items) {
        }

        /* renamed from: onResultSent  reason: avoid collision after fix types in other method */
        public void onResultSent2(List<MediaBrowserCompat.MediaItem> items) {
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 extends Result<Bundle> {
        public final /* synthetic */ MediaBrowserServiceCompat this$0;
        public final /* synthetic */ ResultReceiver val$receiver;

        public AnonymousClass4(final MediaBrowserServiceCompat this$0, Object debug, final ResultReceiver val$receiver) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        public void onErrorSent(Bundle data) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        public void onProgressUpdateSent(Bundle data) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.Result
        public /* bridge */ /* synthetic */ void onResultSent(Bundle result) {
        }

        /* renamed from: onResultSent  reason: avoid collision after fix types in other method */
        public void onResultSent2(Bundle result) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class BrowserRoot {
        public static final String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
        public static final String EXTRA_RECENT = "android.service.media.extra.RECENT";
        public static final String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";
        @Deprecated
        public static final String EXTRA_SUGGESTION_KEYWORDS = "android.service.media.extra.SUGGESTION_KEYWORDS";
        private final Bundle mExtras;
        private final String mRootId;

        public BrowserRoot(@NonNull String rootId, @Nullable Bundle extras) {
        }

        public static /* synthetic */ String access$000(BrowserRoot browserRoot) {
        }

        public static /* synthetic */ Bundle access$100(BrowserRoot browserRoot) {
        }

        public Bundle getExtras() {
        }

        public String getRootId() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ConnectionRecord implements IBinder.DeathRecipient {
        public final MediaSessionManager.RemoteUserInfo browserInfo;
        public final ServiceCallbacks callbacks;
        public final int pid;
        public final String pkg;
        public BrowserRoot root;
        public final Bundle rootHints;
        public final HashMap<String, List<Pair<IBinder, Bundle>>> subscriptions;
        public final /* synthetic */ MediaBrowserServiceCompat this$0;
        public final int uid;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ConnectionRecord$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ ConnectionRecord this$1;

            public AnonymousClass1(final ConnectionRecord this$1) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public ConnectionRecord(final MediaBrowserServiceCompat this$0, String pkg, int pid, int uid, Bundle rootHints, ServiceCallbacks callback) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface MediaBrowserServiceImpl {
        Bundle getBrowserRootHints();

        MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo();

        void notifyChildrenChanged(MediaSessionManager.RemoteUserInfo remoteUserInfo, String parentId, Bundle options);

        void notifyChildrenChanged(String parentId, Bundle options);

        IBinder onBind(Intent intent);

        void onCreate();

        void setSessionToken(MediaSessionCompat.Token token);
    }

    @RequiresApi(21)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class MediaBrowserServiceImplApi21 implements MediaBrowserServiceImpl {
        public Messenger mMessenger;
        public final List<Bundle> mRootExtrasList;
        public MediaBrowserService mServiceFwk;
        public final /* synthetic */ MediaBrowserServiceCompat this$0;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ MediaBrowserServiceImplApi21 this$1;
            public final /* synthetic */ MediaSessionCompat.Token val$token;

            public AnonymousClass1(final MediaBrowserServiceImplApi21 this$1, final MediaSessionCompat.Token val$token) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 extends Result<List<MediaBrowserCompat.MediaItem>> {
            public final /* synthetic */ MediaBrowserServiceImplApi21 this$1;
            public final /* synthetic */ ResultWrapper val$resultWrapper;

            public AnonymousClass2(final MediaBrowserServiceImplApi21 this$1, Object debug, final ResultWrapper val$resultWrapper) {
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void detach() {
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public /* bridge */ /* synthetic */ void onResultSent(List<MediaBrowserCompat.MediaItem> list) {
            }

            /* renamed from: onResultSent  reason: avoid collision after fix types in other method */
            public void onResultSent2(List<MediaBrowserCompat.MediaItem> list) {
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass3 implements Runnable {
            public final /* synthetic */ MediaBrowserServiceImplApi21 this$1;
            public final /* synthetic */ Bundle val$options;
            public final /* synthetic */ String val$parentId;

            public AnonymousClass3(final MediaBrowserServiceImplApi21 this$1, final String val$parentId, final Bundle val$options) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass4 implements Runnable {
            public final /* synthetic */ MediaBrowserServiceImplApi21 this$1;
            public final /* synthetic */ Bundle val$options;
            public final /* synthetic */ String val$parentId;
            public final /* synthetic */ MediaSessionManager.RemoteUserInfo val$remoteUserInfo;

            public AnonymousClass4(final MediaBrowserServiceImplApi21 this$1, final MediaSessionManager.RemoteUserInfo val$remoteUserInfo, final String val$parentId, final Bundle val$options) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class MediaBrowserServiceApi21 extends MediaBrowserService {
            public final /* synthetic */ MediaBrowserServiceImplApi21 this$1;

            public MediaBrowserServiceApi21(final MediaBrowserServiceImplApi21 this$1, Context context) {
            }

            @Override // android.service.media.MediaBrowserService
            @SuppressLint({"SyntheticAccessor"})
            public MediaBrowserService.BrowserRoot onGetRoot(String clientPackageName, int clientUid, Bundle rootHints) {
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String parentId, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            }
        }

        public MediaBrowserServiceImplApi21(final MediaBrowserServiceCompat this$0) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public Bundle getBrowserRootHints() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(final String parentId, final Bundle options) {
        }

        public void notifyChildrenChangedForCompat(final String parentId, final Bundle options) {
        }

        public void notifyChildrenChangedForCompatOnHandler(final ConnectionRecord connection, final String parentId, final Bundle options) {
        }

        public void notifyChildrenChangedForFramework(final String parentId, final Bundle options) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public IBinder onBind(Intent intent) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
        }

        public BrowserRoot onGetRoot(String clientPackageName, int clientUid, Bundle rootHints) {
        }

        public void onLoadChildren(String parentId, final ResultWrapper<List<Parcel>> resultWrapper) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void setSessionToken(final MediaSessionCompat.Token token) {
        }

        public void notifyChildrenChangedForCompat(final MediaSessionManager.RemoteUserInfo remoteUserInfo, final String parentId, final Bundle options) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(final MediaSessionManager.RemoteUserInfo remoteUserInfo, final String parentId, final Bundle options) {
        }
    }

    @RequiresApi(23)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21 {
        public final /* synthetic */ MediaBrowserServiceCompat this$0;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 extends Result<MediaBrowserCompat.MediaItem> {
            public final /* synthetic */ MediaBrowserServiceImplApi23 this$1;
            public final /* synthetic */ ResultWrapper val$resultWrapper;

            public AnonymousClass1(final MediaBrowserServiceImplApi23 this$1, Object debug, final ResultWrapper val$resultWrapper) {
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void detach() {
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public /* bridge */ /* synthetic */ void onResultSent(MediaBrowserCompat.MediaItem item) {
            }

            /* renamed from: onResultSent  reason: avoid collision after fix types in other method */
            public void onResultSent2(MediaBrowserCompat.MediaItem item) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class MediaBrowserServiceApi23 extends MediaBrowserServiceImplApi21.MediaBrowserServiceApi21 {
            public final /* synthetic */ MediaBrowserServiceImplApi23 this$1;

            public MediaBrowserServiceApi23(final MediaBrowserServiceImplApi23 this$1, Context context) {
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String itemId, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            }
        }

        public MediaBrowserServiceImplApi23(final MediaBrowserServiceCompat this$0) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
        }

        public void onLoadItem(String itemId, final ResultWrapper<Parcel> resultWrapper) {
        }
    }

    @RequiresApi(26)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23 {
        public final /* synthetic */ MediaBrowserServiceCompat this$0;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 extends Result<List<MediaBrowserCompat.MediaItem>> {
            public final /* synthetic */ MediaBrowserServiceImplApi26 this$1;
            public final /* synthetic */ Bundle val$options;
            public final /* synthetic */ ResultWrapper val$resultWrapper;

            public AnonymousClass1(final MediaBrowserServiceImplApi26 this$1, Object debug, final ResultWrapper val$resultWrapper, final Bundle val$options) {
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void detach() {
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public /* bridge */ /* synthetic */ void onResultSent(List<MediaBrowserCompat.MediaItem> list) {
            }

            /* renamed from: onResultSent  reason: avoid collision after fix types in other method */
            public void onResultSent2(List<MediaBrowserCompat.MediaItem> list) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class MediaBrowserServiceApi26 extends MediaBrowserServiceImplApi23.MediaBrowserServiceApi23 {
            public final /* synthetic */ MediaBrowserServiceImplApi26 this$1;

            public MediaBrowserServiceApi26(final MediaBrowserServiceImplApi26 this$1, Context context) {
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String parentId, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle options) {
            }
        }

        public MediaBrowserServiceImplApi26(final MediaBrowserServiceCompat this$0) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public Bundle getBrowserRootHints() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21
        public void notifyChildrenChangedForFramework(final String parentId, final Bundle options) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
        }

        public void onLoadChildren(String parentId, final ResultWrapper<List<Parcel>> resultWrapper, final Bundle options) {
        }
    }

    @RequiresApi(28)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class MediaBrowserServiceImplApi28 extends MediaBrowserServiceImplApi26 {
        public final /* synthetic */ MediaBrowserServiceCompat this$0;

        public MediaBrowserServiceImplApi28(final MediaBrowserServiceCompat this$0) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class MediaBrowserServiceImplBase implements MediaBrowserServiceImpl {
        private Messenger mMessenger;
        public final /* synthetic */ MediaBrowserServiceCompat this$0;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ MediaBrowserServiceImplBase this$1;
            public final /* synthetic */ MediaSessionCompat.Token val$token;

            public AnonymousClass1(final MediaBrowserServiceImplBase this$1, final MediaSessionCompat.Token val$token) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 implements Runnable {
            public final /* synthetic */ MediaBrowserServiceImplBase this$1;
            public final /* synthetic */ Bundle val$options;
            public final /* synthetic */ String val$parentId;

            public AnonymousClass2(final MediaBrowserServiceImplBase this$1, final String val$parentId, final Bundle val$options) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass3 implements Runnable {
            public final /* synthetic */ MediaBrowserServiceImplBase this$1;
            public final /* synthetic */ Bundle val$options;
            public final /* synthetic */ String val$parentId;
            public final /* synthetic */ MediaSessionManager.RemoteUserInfo val$remoteUserInfo;

            public AnonymousClass3(final MediaBrowserServiceImplBase this$1, final MediaSessionManager.RemoteUserInfo val$remoteUserInfo, final String val$parentId, final Bundle val$options) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public MediaBrowserServiceImplBase(final MediaBrowserServiceCompat this$0) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public Bundle getBrowserRootHints() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(@NonNull final String parentId, final Bundle options) {
        }

        public void notifyChildrenChangedOnHandler(final ConnectionRecord connection, final String parentId, final Bundle options) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public IBinder onBind(Intent intent) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void setSessionToken(final MediaSessionCompat.Token token) {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(@NonNull final MediaSessionManager.RemoteUserInfo remoteUserInfo, @NonNull final String parentId, final Bundle options) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Result<T> {
        private final Object mDebug;
        private boolean mDetachCalled;
        private int mFlags;
        private boolean mSendErrorCalled;
        private boolean mSendResultCalled;

        public Result(Object debug) {
        }

        private void checkExtraFields(Bundle extras) {
        }

        public void detach() {
        }

        public int getFlags() {
        }

        public boolean isDone() {
        }

        public void onErrorSent(Bundle extras) {
        }

        public void onProgressUpdateSent(Bundle extras) {
        }

        public void onResultSent(T result) {
        }

        public void sendError(Bundle extras) {
        }

        public void sendProgressUpdate(Bundle extras) {
        }

        public void sendResult(T result) {
        }

        public void setFlags(int flags) {
        }
    }

    @RequiresApi(21)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ResultWrapper<T> {
        public MediaBrowserService.Result mResultFwk;

        public ResultWrapper(MediaBrowserService.Result result) {
        }

        public void detach() {
        }

        public List<MediaBrowser.MediaItem> parcelListToItemList(List<Parcel> parcelList) {
        }

        public void sendResult(T result) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ServiceBinderImpl {
        public final /* synthetic */ MediaBrowserServiceCompat this$0;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ ServiceBinderImpl this$1;
            public final /* synthetic */ ServiceCallbacks val$callbacks;
            public final /* synthetic */ int val$pid;
            public final /* synthetic */ String val$pkg;
            public final /* synthetic */ Bundle val$rootHints;
            public final /* synthetic */ int val$uid;

            public AnonymousClass1(final ServiceBinderImpl this$1, final ServiceCallbacks val$callbacks, final String val$pkg, final int val$pid, final int val$uid, final Bundle val$rootHints) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 implements Runnable {
            public final /* synthetic */ ServiceBinderImpl this$1;
            public final /* synthetic */ ServiceCallbacks val$callbacks;

            public AnonymousClass2(final ServiceBinderImpl this$1, final ServiceCallbacks val$callbacks) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass3 implements Runnable {
            public final /* synthetic */ ServiceBinderImpl this$1;
            public final /* synthetic */ ServiceCallbacks val$callbacks;
            public final /* synthetic */ String val$id;
            public final /* synthetic */ Bundle val$options;
            public final /* synthetic */ IBinder val$token;

            public AnonymousClass3(final ServiceBinderImpl this$1, final ServiceCallbacks val$callbacks, final String val$id, final IBinder val$token, final Bundle val$options) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass4 implements Runnable {
            public final /* synthetic */ ServiceBinderImpl this$1;
            public final /* synthetic */ ServiceCallbacks val$callbacks;
            public final /* synthetic */ String val$id;
            public final /* synthetic */ IBinder val$token;

            public AnonymousClass4(final ServiceBinderImpl this$1, final ServiceCallbacks val$callbacks, final String val$id, final IBinder val$token) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$5  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass5 implements Runnable {
            public final /* synthetic */ ServiceBinderImpl this$1;
            public final /* synthetic */ ServiceCallbacks val$callbacks;
            public final /* synthetic */ String val$mediaId;
            public final /* synthetic */ ResultReceiver val$receiver;

            public AnonymousClass5(final ServiceBinderImpl this$1, final ServiceCallbacks val$callbacks, final String val$mediaId, final ResultReceiver val$receiver) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$6  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass6 implements Runnable {
            public final /* synthetic */ ServiceBinderImpl this$1;
            public final /* synthetic */ ServiceCallbacks val$callbacks;
            public final /* synthetic */ int val$pid;
            public final /* synthetic */ String val$pkg;
            public final /* synthetic */ Bundle val$rootHints;
            public final /* synthetic */ int val$uid;

            public AnonymousClass6(final ServiceBinderImpl this$1, final ServiceCallbacks val$callbacks, final int val$uid, final String val$pkg, final int val$pid, final Bundle val$rootHints) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$7  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass7 implements Runnable {
            public final /* synthetic */ ServiceBinderImpl this$1;
            public final /* synthetic */ ServiceCallbacks val$callbacks;

            public AnonymousClass7(final ServiceBinderImpl this$1, final ServiceCallbacks val$callbacks) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$8  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass8 implements Runnable {
            public final /* synthetic */ ServiceBinderImpl this$1;
            public final /* synthetic */ ServiceCallbacks val$callbacks;
            public final /* synthetic */ Bundle val$extras;
            public final /* synthetic */ String val$query;
            public final /* synthetic */ ResultReceiver val$receiver;

            public AnonymousClass8(final ServiceBinderImpl this$1, final ServiceCallbacks val$callbacks, final String val$query, final Bundle val$extras, final ResultReceiver val$receiver) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$9  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass9 implements Runnable {
            public final /* synthetic */ ServiceBinderImpl this$1;
            public final /* synthetic */ String val$action;
            public final /* synthetic */ ServiceCallbacks val$callbacks;
            public final /* synthetic */ Bundle val$extras;
            public final /* synthetic */ ResultReceiver val$receiver;

            public AnonymousClass9(final ServiceBinderImpl this$1, final ServiceCallbacks val$callbacks, final String val$action, final Bundle val$extras, final ResultReceiver val$receiver) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public ServiceBinderImpl(final MediaBrowserServiceCompat this$0) {
        }

        public void addSubscription(final String id, final IBinder token, final Bundle options, final ServiceCallbacks callbacks) {
        }

        public void connect(final String pkg, final int pid, final int uid, final Bundle rootHints, final ServiceCallbacks callbacks) {
        }

        public void disconnect(final ServiceCallbacks callbacks) {
        }

        public void getMediaItem(final String mediaId, final ResultReceiver receiver, final ServiceCallbacks callbacks) {
        }

        public void registerCallbacks(final ServiceCallbacks callbacks, final String pkg, final int pid, final int uid, final Bundle rootHints) {
        }

        public void removeSubscription(final String id, final IBinder token, final ServiceCallbacks callbacks) {
        }

        public void search(final String query, final Bundle extras, final ResultReceiver receiver, final ServiceCallbacks callbacks) {
        }

        public void sendCustomAction(final String action, final Bundle extras, final ResultReceiver receiver, final ServiceCallbacks callbacks) {
        }

        public void unregisterCallbacks(final ServiceCallbacks callbacks) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ServiceCallbacks {
        IBinder asBinder();

        void onConnect(String root, MediaSessionCompat.Token session, Bundle extras) throws RemoteException;

        void onConnectFailed() throws RemoteException;

        void onLoadChildren(String mediaId, List<MediaBrowserCompat.MediaItem> list, Bundle options, Bundle notifyChildrenChangedOptions) throws RemoteException;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ServiceCallbacksCompat implements ServiceCallbacks {
        public final Messenger mCallbacks;

        public ServiceCallbacksCompat(Messenger callbacks) {
        }

        private void sendRequest(int what, Bundle data) throws RemoteException {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public IBinder asBinder() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnect(String root, MediaSessionCompat.Token session, Bundle extras) throws RemoteException {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnectFailed() throws RemoteException {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onLoadChildren(String mediaId, List<MediaBrowserCompat.MediaItem> list, Bundle options, Bundle notifyChildrenChangedOptions) throws RemoteException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public final class ServiceHandler extends Handler {
        private final ServiceBinderImpl mServiceBinderImpl;
        public final /* synthetic */ MediaBrowserServiceCompat this$0;

        public ServiceHandler(final MediaBrowserServiceCompat this$0) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
        }

        public void postOrRun(Runnable r) {
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message msg, long uptimeMillis) {
        }
    }

    public void addSubscription(String id, ConnectionRecord connection, IBinder token, Bundle options) {
    }

    public List<MediaBrowserCompat.MediaItem> applyOptions(List<MediaBrowserCompat.MediaItem> list, final Bundle options) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void attachToBaseContext(Context base) {
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fd, PrintWriter writer, String[] args) {
    }

    public final Bundle getBrowserRootHints() {
    }

    @NonNull
    public final MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
    }

    @Nullable
    public MediaSessionCompat.Token getSessionToken() {
    }

    public boolean isValidPackage(String pkg, int uid) {
    }

    public void notifyChildrenChanged(@NonNull String parentId) {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    public void onCustomAction(@NonNull String action, Bundle extras, @NonNull Result<Bundle> result) {
    }

    @Nullable
    public abstract BrowserRoot onGetRoot(@NonNull String clientPackageName, int clientUid, @Nullable Bundle rootHints);

    public abstract void onLoadChildren(@NonNull String parentId, @NonNull Result<List<MediaBrowserCompat.MediaItem>> result);

    public void onLoadChildren(@NonNull String parentId, @NonNull Result<List<MediaBrowserCompat.MediaItem>> result, @NonNull Bundle options) {
    }

    public void onLoadItem(String itemId, @NonNull Result<MediaBrowserCompat.MediaItem> result) {
    }

    public void onSearch(@NonNull String query, Bundle extras, @NonNull Result<List<MediaBrowserCompat.MediaItem>> result) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onSubscribe(String id, Bundle option) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onUnsubscribe(String id) {
    }

    public void performCustomAction(final String action, Bundle extras, ConnectionRecord connection, final ResultReceiver receiver) {
    }

    public void performLoadChildren(final String parentId, final ConnectionRecord connection, final Bundle subscribeOptions, final Bundle notifyChildrenChangedOptions) {
    }

    public void performLoadItem(String itemId, ConnectionRecord connection, final ResultReceiver receiver) {
    }

    public void performSearch(final String query, Bundle extras, ConnectionRecord connection, final ResultReceiver receiver) {
    }

    public boolean removeSubscription(String id, ConnectionRecord connection, IBinder token) {
    }

    public void setSessionToken(MediaSessionCompat.Token token) {
    }

    public void notifyChildrenChanged(@NonNull String parentId, @NonNull Bundle options) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void notifyChildrenChanged(@NonNull MediaSessionManager.RemoteUserInfo remoteUserInfo, @NonNull String parentId, @NonNull Bundle options) {
    }
}
