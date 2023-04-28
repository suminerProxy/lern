package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaSession;
import android.view.KeyEvent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.MediaSessionManager;
import androidx.media.VolumeProviderCompat;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MediaSessionCompat {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_CAPTIONING_ENABLED = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_MEDIA_ID = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_PLAYBACK_SPEED = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_QUERY = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_RATING = "android.support.v4.media.session.action.ARGUMENT_RATING";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_REPEAT_MODE = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_SHUFFLE_MODE = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_URI = "android.support.v4.media.session.action.ARGUMENT_URI";
    public static final String ACTION_FLAG_AS_INAPPROPRIATE = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
    public static final String ACTION_FOLLOW = "android.support.v4.media.session.action.FOLLOW";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_PLAY_FROM_URI = "android.support.v4.media.session.action.PLAY_FROM_URI";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_PREPARE = "android.support.v4.media.session.action.PREPARE";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_PREPARE_FROM_MEDIA_ID = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_PREPARE_FROM_SEARCH = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_PREPARE_FROM_URI = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_SET_CAPTIONING_ENABLED = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_SET_PLAYBACK_SPEED = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_SET_RATING = "android.support.v4.media.session.action.SET_RATING";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_SET_REPEAT_MODE = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_SET_SHUFFLE_MODE = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    public static final String ACTION_SKIP_AD = "android.support.v4.media.session.action.SKIP_AD";
    public static final String ACTION_UNFOLLOW = "android.support.v4.media.session.action.UNFOLLOW";
    public static final String ARGUMENT_MEDIA_ATTRIBUTE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
    public static final String ARGUMENT_MEDIA_ATTRIBUTE_VALUE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
    private static final String DATA_CALLING_PACKAGE = "data_calling_pkg";
    private static final String DATA_CALLING_PID = "data_calling_pid";
    private static final String DATA_CALLING_UID = "data_calling_uid";
    private static final String DATA_EXTRAS = "data_extras";
    @Deprecated
    public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
    public static final int FLAG_HANDLES_QUEUE_COMMANDS = 4;
    @Deprecated
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String KEY_EXTRA_BINDER = "android.support.v4.media.session.EXTRA_BINDER";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String KEY_SESSION2_TOKEN = "android.support.v4.media.session.SESSION_TOKEN2";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String KEY_TOKEN = "android.support.v4.media.session.TOKEN";
    private static final int MAX_BITMAP_SIZE_IN_DP = 320;
    public static final int MEDIA_ATTRIBUTE_ALBUM = 1;
    public static final int MEDIA_ATTRIBUTE_ARTIST = 0;
    public static final int MEDIA_ATTRIBUTE_PLAYLIST = 2;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int PENDING_INTENT_FLAG_MUTABLE = 0;
    public static final String TAG = "MediaSessionCompat";
    public static int sMaxBitmapSize;
    private final ArrayList<OnActiveChangeListener> mActiveListeners;
    private final MediaControllerCompat mController;
    private final MediaSessionImpl mImpl;

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends Callback {
        public final /* synthetic */ MediaSessionCompat this$0;

        public AnonymousClass1(final MediaSessionCompat this$0) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class Callback {
        public final MediaSession.Callback mCallbackFwk;
        @GuardedBy("mLock")
        public CallbackHandler mCallbackHandler;
        public final Object mLock;
        private boolean mMediaPlayPausePendingOnHandler;
        @GuardedBy("mLock")
        public WeakReference<MediaSessionImpl> mSessionImpl;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class CallbackHandler extends Handler {
            private static final int MSG_MEDIA_PLAY_PAUSE_KEY_DOUBLE_TAP_TIMEOUT = 1;
            public final /* synthetic */ Callback this$0;

            public CallbackHandler(final Callback this$0, Looper looper) {
            }

            @Override // android.os.Handler
            public void handleMessage(Message msg) {
            }
        }

        @RequiresApi(21)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class MediaSessionCallbackApi21 extends MediaSession.Callback {
            public final /* synthetic */ Callback this$0;

            public MediaSessionCallbackApi21(final Callback this$0) {
            }

            private void clearCurrentControllerInfo(MediaSessionImpl sessionImpl) {
            }

            private MediaSessionImplApi21 getSessionImplIfCallbackIsSet() {
            }

            private void setCurrentControllerInfo(MediaSessionImpl sessionImpl) {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String command, Bundle extras, ResultReceiver cb) {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String action, Bundle extras) {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent mediaButtonIntent) {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String mediaId, Bundle extras) {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String search, Bundle extras) {
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(23)
            public void onPlayFromUri(Uri uri, Bundle extras) {
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(24)
            public void onPrepare() {
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(24)
            public void onPrepareFromMediaId(String mediaId, Bundle extras) {
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(24)
            public void onPrepareFromSearch(String query, Bundle extras) {
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(24)
            public void onPrepareFromUri(Uri uri, Bundle extras) {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long pos) {
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(29)
            public void onSetPlaybackSpeed(float speed) {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating ratingFwk) {
            }

            public void onSetRating(Rating ratingFwk, Bundle extras) {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long id) {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
            }
        }

        public void handleMediaPlayPauseIfPendingOnHandler(MediaSessionImpl impl, Handler callbackHandler) {
        }

        public void onAddQueueItem(MediaDescriptionCompat description) {
        }

        public void onAddQueueItem(MediaDescriptionCompat description, int index) {
        }

        public void onCommand(String command, Bundle extras, ResultReceiver cb) {
        }

        public void onCustomAction(String action, Bundle extras) {
        }

        public void onFastForward() {
        }

        public boolean onMediaButtonEvent(Intent mediaButtonEvent) {
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onPlayFromMediaId(String mediaId, Bundle extras) {
        }

        public void onPlayFromSearch(String query, Bundle extras) {
        }

        public void onPlayFromUri(Uri uri, Bundle extras) {
        }

        public void onPrepare() {
        }

        public void onPrepareFromMediaId(String mediaId, Bundle extras) {
        }

        public void onPrepareFromSearch(String query, Bundle extras) {
        }

        public void onPrepareFromUri(Uri uri, Bundle extras) {
        }

        public void onRemoveQueueItem(MediaDescriptionCompat description) {
        }

        @Deprecated
        public void onRemoveQueueItemAt(int index) {
        }

        public void onRewind() {
        }

        public void onSeekTo(long pos) {
        }

        public void onSetCaptioningEnabled(boolean enabled) {
        }

        public void onSetPlaybackSpeed(float speed) {
        }

        public void onSetRating(RatingCompat rating) {
        }

        public void onSetRating(RatingCompat rating, Bundle extras) {
        }

        public void onSetRepeatMode(int repeatMode) {
        }

        public void onSetShuffleMode(int shuffleMode) {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onSkipToQueueItem(long id) {
        }

        public void onStop() {
        }

        public void setSessionImpl(MediaSessionImpl impl, Handler handler) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface MediaSessionImpl {
        Callback getCallback();

        String getCallingPackage();

        MediaSessionManager.RemoteUserInfo getCurrentControllerInfo();

        Object getMediaSession();

        PlaybackStateCompat getPlaybackState();

        Object getRemoteControlClient();

        Token getSessionToken();

        boolean isActive();

        void release();

        void sendSessionEvent(String event, Bundle extras);

        void setActive(boolean active);

        void setCallback(Callback callback, Handler handler);

        void setCaptioningEnabled(boolean enabled);

        void setCurrentControllerInfo(MediaSessionManager.RemoteUserInfo remoteUserInfo);

        void setExtras(Bundle extras);

        void setFlags(int flags);

        void setMediaButtonReceiver(PendingIntent mbr);

        void setMetadata(MediaMetadataCompat metadata);

        void setPlaybackState(PlaybackStateCompat state);

        void setPlaybackToLocal(int stream);

        void setPlaybackToRemote(VolumeProviderCompat volumeProvider);

        void setQueue(List<QueueItem> queue);

        void setQueueTitle(CharSequence title);

        void setRatingType(int type);

        void setRepeatMode(int repeatMode);

        void setSessionActivity(PendingIntent pi);

        void setShuffleMode(int shuffleMode);
    }

    @RequiresApi(18)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MediaSessionImplApi18 extends MediaSessionImplBase {
        private static boolean sIsMbrPendingIntentSupported = true;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi18$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            public final /* synthetic */ MediaSessionImplApi18 this$0;

            public AnonymousClass1(final MediaSessionImplApi18 this$0) {
            }

            @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
            public void onPlaybackPositionUpdate(long newPositionMs) {
            }
        }

        public MediaSessionImplApi18(Context context, String tag, ComponentName mbrComponent, PendingIntent mbrIntent, VersionedParcelable session2Token, Bundle sessionInfo) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public int getRccTransportControlFlagsFromActions(long actions) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public void registerMediaButtonEventReceiver(PendingIntent mbrIntent, ComponentName mbrComponent) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(Callback callback, Handler handler) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public void setRccState(PlaybackStateCompat state) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public void unregisterMediaButtonEventReceiver(PendingIntent mbrIntent, ComponentName mbrComponent) {
        }
    }

    @RequiresApi(19)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MediaSessionImplApi19 extends MediaSessionImplApi18 {

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi19$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements RemoteControlClient.OnMetadataUpdateListener {
            public final /* synthetic */ MediaSessionImplApi19 this$0;

            public AnonymousClass1(final MediaSessionImplApi19 this$0) {
            }

            @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
            public void onMetadataUpdate(int key, Object newValue) {
            }
        }

        public MediaSessionImplApi19(Context context, String tag, ComponentName mbrComponent, PendingIntent mbrIntent, VersionedParcelable session2Token, Bundle sessionInfo) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle metadata) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public int getRccTransportControlFlagsFromActions(long actions) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(Callback callback, Handler handler) {
        }
    }

    @RequiresApi(28)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MediaSessionImplApi28 extends MediaSessionImplApi21 {
        public MediaSessionImplApi28(MediaSession sessionFwk, VersionedParcelable session2Token, Bundle sessionInfo) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        @NonNull
        public final MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        }

        public MediaSessionImplApi28(Object mediaSession) {
        }
    }

    @RequiresApi(29)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MediaSessionImplApi29 extends MediaSessionImplApi28 {
        public MediaSessionImplApi29(MediaSession sessionFwk, VersionedParcelable session2Token, Bundle sessionInfo) {
        }

        public MediaSessionImplApi29(Object mediaSession) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MediaSessionImplBase implements MediaSessionImpl {
        public static final int RCC_PLAYSTATE_NONE = 0;
        public final AudioManager mAudioManager;
        public volatile Callback mCallback;
        public boolean mCaptioningEnabled;
        private final Context mContext;
        public final RemoteCallbackList<IMediaControllerCallback> mControllerCallbacks;
        public boolean mDestroyed;
        public Bundle mExtras;
        public int mFlags;
        private MessageHandler mHandler;
        public boolean mIsActive;
        public int mLocalStream;
        public final Object mLock;
        private final ComponentName mMediaButtonReceiverComponentName;
        private final PendingIntent mMediaButtonReceiverIntent;
        public MediaMetadataCompat mMetadata;
        public final String mPackageName;
        public List<QueueItem> mQueue;
        public CharSequence mQueueTitle;
        public int mRatingType;
        public final RemoteControlClient mRcc;
        private MediaSessionManager.RemoteUserInfo mRemoteUserInfo;
        public int mRepeatMode;
        public PendingIntent mSessionActivity;
        public final Bundle mSessionInfo;
        public int mShuffleMode;
        public PlaybackStateCompat mState;
        private final MediaSessionStub mStub;
        public final String mTag;
        private final Token mToken;
        private VolumeProviderCompat.Callback mVolumeCallback;
        public VolumeProviderCompat mVolumeProvider;
        public int mVolumeType;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 extends VolumeProviderCompat.Callback {
            public final /* synthetic */ MediaSessionImplBase this$0;

            public AnonymousClass1(final MediaSessionImplBase this$0) {
            }

            @Override // androidx.media.VolumeProviderCompat.Callback
            public void onVolumeChanged(VolumeProviderCompat volumeProvider) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static final class Command {
            public final String command;
            public final Bundle extras;
            public final ResultReceiver stub;

            public Command(String command, Bundle extras, ResultReceiver stub) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class MediaSessionStub extends IMediaSession.Stub {
            public final /* synthetic */ MediaSessionImplBase this$0;

            public MediaSessionStub(final MediaSessionImplBase this$0) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(MediaDescriptionCompat description) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(MediaDescriptionCompat description, int index) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int direction, int flags, String packageName) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getExtras() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PendingIntent getLaunchPendingIntent() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getPackageName() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PlaybackStateCompat getPlaybackState() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public List<QueueItem> getQueue() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public CharSequence getQueueTitle() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getSessionInfo() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getTag() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public ParcelableVolumeInfo getVolumeAttributes() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(String mediaId, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(String query, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(Uri uri, Bundle extras) throws RemoteException {
            }

            public void postToHandler(int what) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(String mediaId, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(String query, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(Uri uri, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(RatingCompat rating) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(RatingCompat rating, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(IMediaControllerCallback cb) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(MediaDescriptionCompat description) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int index) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long pos) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(String command, Bundle args, ResultReceiverWrapper cb) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(String action, Bundle args) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(KeyEvent mediaButton) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean enabled) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setPlaybackSpeed(float speed) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int repeatMode) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int shuffleMode) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean enabled) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int value, int flags, String packageName) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long id) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(IMediaControllerCallback cb) {
            }

            public void postToHandler(int what, int arg1) {
            }

            public void postToHandler(int what, Object obj) {
            }

            public void postToHandler(int what, Object obj, int arg1) {
            }

            public void postToHandler(int what, Object obj, Bundle extras) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class MessageHandler extends Handler {
            private static final int KEYCODE_MEDIA_PAUSE = 127;
            private static final int KEYCODE_MEDIA_PLAY = 126;
            private static final int MSG_ADD_QUEUE_ITEM = 25;
            private static final int MSG_ADD_QUEUE_ITEM_AT = 26;
            private static final int MSG_ADJUST_VOLUME = 2;
            private static final int MSG_COMMAND = 1;
            private static final int MSG_CUSTOM_ACTION = 20;
            private static final int MSG_FAST_FORWARD = 16;
            private static final int MSG_MEDIA_BUTTON = 21;
            private static final int MSG_NEXT = 14;
            private static final int MSG_PAUSE = 12;
            private static final int MSG_PLAY = 7;
            private static final int MSG_PLAY_MEDIA_ID = 8;
            private static final int MSG_PLAY_SEARCH = 9;
            private static final int MSG_PLAY_URI = 10;
            private static final int MSG_PREPARE = 3;
            private static final int MSG_PREPARE_MEDIA_ID = 4;
            private static final int MSG_PREPARE_SEARCH = 5;
            private static final int MSG_PREPARE_URI = 6;
            private static final int MSG_PREVIOUS = 15;
            private static final int MSG_RATE = 19;
            private static final int MSG_RATE_EXTRA = 31;
            private static final int MSG_REMOVE_QUEUE_ITEM = 27;
            private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;
            private static final int MSG_REWIND = 17;
            private static final int MSG_SEEK_TO = 18;
            private static final int MSG_SET_CAPTIONING_ENABLED = 29;
            private static final int MSG_SET_PLAYBACK_SPEED = 32;
            private static final int MSG_SET_REPEAT_MODE = 23;
            private static final int MSG_SET_SHUFFLE_MODE = 30;
            private static final int MSG_SET_VOLUME = 22;
            private static final int MSG_SKIP_TO_ITEM = 11;
            private static final int MSG_STOP = 13;
            public final /* synthetic */ MediaSessionImplBase this$0;

            public MessageHandler(final MediaSessionImplBase this$0, Looper looper) {
            }

            private void onMediaButtonEvent(KeyEvent ke, Callback cb) {
            }

            @Override // android.os.Handler
            public void handleMessage(Message msg) {
            }
        }

        public MediaSessionImplBase(Context context, String tag, ComponentName mbrComponent, PendingIntent mbrIntent, VersionedParcelable session2Token, Bundle sessionInfo) {
        }

        private void sendCaptioningEnabled(boolean enabled) {
        }

        private void sendEvent(String event, Bundle extras) {
        }

        private void sendExtras(Bundle extras) {
        }

        private void sendMetadata(MediaMetadataCompat metadata) {
        }

        private void sendQueue(List<QueueItem> queue) {
        }

        private void sendQueueTitle(CharSequence queueTitle) {
        }

        private void sendRepeatMode(int repeatMode) {
        }

        private void sendSessionDestroyed() {
        }

        private void sendShuffleMode(int shuffleMode) {
        }

        private void sendState(PlaybackStateCompat state) {
        }

        public void adjustVolume(int direction, int flags) {
        }

        public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle metadata) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Callback getCallback() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public String getCallingPackage() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Object getMediaSession() {
        }

        public String getPackageNameForUid(int uid) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public PlaybackStateCompat getPlaybackState() {
        }

        public int getRccStateFromState(int state) {
        }

        public int getRccTransportControlFlagsFromActions(long actions) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Object getRemoteControlClient() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Token getSessionToken() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public boolean isActive() {
        }

        public void postToHandler(int what, int arg1, int arg2, Object obj, Bundle extras) {
        }

        public void registerMediaButtonEventReceiver(PendingIntent mbrIntent, ComponentName mbrComponent) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void release() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void sendSessionEvent(String event, Bundle extras) {
        }

        public void sendVolumeInfoChanged(ParcelableVolumeInfo info) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setActive(boolean active) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(Callback callback, Handler handler) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCaptioningEnabled(boolean enabled) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setExtras(Bundle extras) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setFlags(int flags) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMediaButtonReceiver(PendingIntent mbr) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMetadata(MediaMetadataCompat metadata) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackState(PlaybackStateCompat state) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToLocal(int stream) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToRemote(VolumeProviderCompat volumeProvider) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueue(List<QueueItem> queue) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueueTitle(CharSequence title) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRatingType(int type) {
        }

        public void setRccState(PlaybackStateCompat state) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRepeatMode(int repeatMode) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setSessionActivity(PendingIntent pi) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setShuffleMode(int shuffleMode) {
        }

        public void setVolumeTo(int value, int flags) {
        }

        public void unregisterMediaButtonEventReceiver(PendingIntent mbrIntent, ComponentName mbrComponent) {
        }

        public void updateMbrAndRcc() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnActiveChangeListener {
        void onActiveChanged();
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = null;
        public static final int UNKNOWN_ID = -1;
        private final MediaDescriptionCompat mDescription;
        private final long mId;
        private MediaSession.QueueItem mItemFwk;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ QueueItem createFromParcel(Parcel p2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ QueueItem[] newArray(int size) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public QueueItem createFromParcel(Parcel p2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public QueueItem[] newArray(int size) {
            }
        }

        public QueueItem(MediaDescriptionCompat description, long id) {
        }

        public static QueueItem fromQueueItem(Object queueItem) {
        }

        public static List<QueueItem> fromQueueItemList(List<?> itemList) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public MediaDescriptionCompat getDescription() {
        }

        public long getQueueId() {
        }

        public Object getQueueItem() {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat description, long id) {
        }

        public QueueItem(Parcel in) {
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = null;
        @GuardedBy("mLock")
        private IMediaSession mExtraBinder;
        private final Object mInner;
        private final Object mLock;
        @GuardedBy("mLock")
        private VersionedParcelable mSession2Token;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Token createFromParcel(Parcel in) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Token[] newArray(int size) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Token createFromParcel(Parcel in) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Token[] newArray(int size) {
            }
        }

        public Token(Object inner) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static Token fromBundle(Bundle tokenBundle) {
        }

        public static Token fromToken(Object token) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public boolean equals(Object obj) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public IMediaSession getExtraBinder() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public VersionedParcelable getSession2Token() {
        }

        public Object getToken() {
        }

        public int hashCode() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public void setExtraBinder(IMediaSession extraBinder) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void setSession2Token(VersionedParcelable session2Token) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Bundle toBundle() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
        }

        public Token(Object inner, IMediaSession extraBinder) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static Token fromToken(Object token, IMediaSession extraBinder) {
        }

        public Token(Object inner, IMediaSession extraBinder, VersionedParcelable session2Token) {
        }
    }

    public MediaSessionCompat(@NonNull Context context, @NonNull String tag) {
    }

    @RequiresApi(21)
    private MediaSession createFwkMediaSession(Context context, String tag, Bundle sessionInfo) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void ensureClassLoader(@Nullable Bundle bundle) {
    }

    public static MediaSessionCompat fromMediaSession(Context context, Object mediaSession) {
    }

    public static PlaybackStateCompat getStateWithUpdatedPosition(PlaybackStateCompat state, MediaMetadataCompat metadata) {
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Bundle unparcelWithClassLoader(@Nullable Bundle bundle) {
    }

    public void addOnActiveChangeListener(OnActiveChangeListener listener) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String getCallingPackage() {
    }

    public MediaControllerCompat getController() {
    }

    @NonNull
    public final MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
    }

    public Object getMediaSession() {
    }

    public Object getRemoteControlClient() {
    }

    public Token getSessionToken() {
    }

    public boolean isActive() {
    }

    public void release() {
    }

    public void removeOnActiveChangeListener(OnActiveChangeListener listener) {
    }

    public void sendSessionEvent(String event, Bundle extras) {
    }

    public void setActive(boolean active) {
    }

    public void setCallback(Callback callback) {
    }

    public void setCaptioningEnabled(boolean enabled) {
    }

    public void setExtras(Bundle extras) {
    }

    public void setFlags(int flags) {
    }

    public void setMediaButtonReceiver(PendingIntent mbr) {
    }

    public void setMetadata(MediaMetadataCompat metadata) {
    }

    public void setPlaybackState(PlaybackStateCompat state) {
    }

    public void setPlaybackToLocal(int stream) {
    }

    public void setPlaybackToRemote(VolumeProviderCompat volumeProvider) {
    }

    public void setQueue(List<QueueItem> queue) {
    }

    public void setQueueTitle(CharSequence title) {
    }

    public void setRatingType(int type) {
    }

    public void setRepeatMode(int repeatMode) {
    }

    public void setSessionActivity(PendingIntent pi) {
    }

    public void setShuffleMode(int shuffleMode) {
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = null;
        public ResultReceiver mResultReceiver;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ ResultReceiverWrapper createFromParcel(Parcel p2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ ResultReceiverWrapper[] newArray(int size) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper createFromParcel(Parcel p2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper[] newArray(int size) {
            }
        }

        public ResultReceiverWrapper(@NonNull ResultReceiver resultReceiver) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
        }

        public ResultReceiverWrapper(Parcel in) {
        }
    }

    public MediaSessionCompat(@NonNull Context context, @NonNull String tag, @Nullable ComponentName mbrComponent, @Nullable PendingIntent mbrIntent) {
    }

    public void setCallback(Callback callback, Handler handler) {
    }

    public MediaSessionCompat(@NonNull Context context, @NonNull String tag, @Nullable ComponentName mbrComponent, @Nullable PendingIntent mbrIntent, @Nullable Bundle sessionInfo) {
    }

    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public MediaSessionCompat(@NonNull Context context, @NonNull String tag, @Nullable ComponentName mbrComponent, @Nullable PendingIntent mbrIntent, @Nullable Bundle sessionInfo, @Nullable VersionedParcelable session2Token) {
    }

    @RequiresApi(21)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MediaSessionImplApi21 implements MediaSessionImpl {
        @GuardedBy("mLock")
        public Callback mCallback;
        public boolean mCaptioningEnabled;
        public boolean mDestroyed;
        public final RemoteCallbackList<IMediaControllerCallback> mExtraControllerCallbacks;
        public final Object mLock;
        public MediaMetadataCompat mMetadata;
        public PlaybackStateCompat mPlaybackState;
        public List<QueueItem> mQueue;
        public int mRatingType;
        @GuardedBy("mLock")
        public MediaSessionManager.RemoteUserInfo mRemoteUserInfo;
        public int mRepeatMode;
        public final MediaSession mSessionFwk;
        public Bundle mSessionInfo;
        public int mShuffleMode;
        public final Token mToken;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class ExtraSession extends IMediaSession.Stub {
            public final /* synthetic */ MediaSessionImplApi21 this$0;

            public ExtraSession(final MediaSessionImplApi21 this$0) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(MediaDescriptionCompat descriptionCompat) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(MediaDescriptionCompat descriptionCompat, int index) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int direction, int flags, String packageName) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getExtras() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PendingIntent getLaunchPendingIntent() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getPackageName() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PlaybackStateCompat getPlaybackState() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public List<QueueItem> getQueue() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public CharSequence getQueueTitle() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getSessionInfo() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getTag() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public ParcelableVolumeInfo getVolumeAttributes() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(String mediaId, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(String query, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(Uri uri, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(String mediaId, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(String query, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(Uri uri, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(RatingCompat rating) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(RatingCompat rating, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(IMediaControllerCallback cb) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(MediaDescriptionCompat description) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int index) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long pos) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(String command, Bundle args, ResultReceiverWrapper cb) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(String action, Bundle args) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(KeyEvent mediaButton) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean enabled) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setPlaybackSpeed(float speed) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int repeatMode) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int shuffleMode) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean enabled) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int value, int flags, String packageName) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long id) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(IMediaControllerCallback cb) {
            }
        }

        public MediaSessionImplApi21(MediaSession sessionFwk, VersionedParcelable session2Token, Bundle sessionInfo) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Callback getCallback() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public String getCallingPackage() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Object getMediaSession() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public PlaybackStateCompat getPlaybackState() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Object getRemoteControlClient() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Token getSessionToken() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public boolean isActive() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void release() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void sendSessionEvent(String event, Bundle extras) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setActive(boolean active) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(Callback callback, Handler handler) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCaptioningEnabled(boolean enabled) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setExtras(Bundle extras) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        @SuppressLint({"WrongConstant"})
        public void setFlags(int flags) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMediaButtonReceiver(PendingIntent mbr) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMetadata(MediaMetadataCompat metadata) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackState(PlaybackStateCompat state) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToLocal(int stream) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToRemote(VolumeProviderCompat volumeProvider) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueue(List<QueueItem> queue) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueueTitle(CharSequence title) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRatingType(int type) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRepeatMode(int repeatMode) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setSessionActivity(PendingIntent pi) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setShuffleMode(int shuffleMode) {
        }

        public MediaSessionImplApi21(Object mediaSession) {
        }
    }

    private MediaSessionCompat(Context context, MediaSessionImpl impl) {
    }
}
