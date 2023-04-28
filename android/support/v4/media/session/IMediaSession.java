package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface IMediaSession extends IInterface {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Default implements IMediaSession {
        @Override // android.support.v4.media.session.IMediaSession
        public void addQueueItem(MediaDescriptionCompat description) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void addQueueItemAt(MediaDescriptionCompat description, int index) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void adjustVolume(int direction, int flags, String packageName) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void fastForward() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public Bundle getExtras() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public long getFlags() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public PendingIntent getLaunchPendingIntent() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public MediaMetadataCompat getMetadata() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public String getPackageName() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public PlaybackStateCompat getPlaybackState() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public List<MediaSessionCompat.QueueItem> getQueue() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public CharSequence getQueueTitle() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public int getRatingType() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public int getRepeatMode() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public Bundle getSessionInfo() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public int getShuffleMode() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public String getTag() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public ParcelableVolumeInfo getVolumeAttributes() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public boolean isCaptioningEnabled() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public boolean isShuffleModeEnabledRemoved() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public boolean isTransportControlEnabled() throws RemoteException {
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
        public void playFromMediaId(String uri, Bundle extras) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void playFromSearch(String string, Bundle extras) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void playFromUri(Uri uri, Bundle extras) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void prepare() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void prepareFromMediaId(String uri, Bundle extras) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void prepareFromSearch(String string, Bundle extras) throws RemoteException {
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
        public void registerCallbackListener(IMediaControllerCallback cb) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void removeQueueItem(MediaDescriptionCompat description) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void removeQueueItemAt(int index) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void rewind() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void seekTo(long pos) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void sendCommand(String command, Bundle args, MediaSessionCompat.ResultReceiverWrapper cb) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void sendCustomAction(String action, Bundle args) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public boolean sendMediaButton(KeyEvent mediaButton) throws RemoteException {
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
        public void setShuffleModeEnabledRemoved(boolean shuffleMode) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setVolumeTo(int value, int flags, String packageName) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void skipToQueueItem(long id) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void stop() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void unregisterCallbackListener(IMediaControllerCallback cb) throws RemoteException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class Stub extends Binder implements IMediaSession {
        private static final String DESCRIPTOR = "android.support.v4.media.session.IMediaSession";
        public static final int TRANSACTION_addQueueItem = 41;
        public static final int TRANSACTION_addQueueItemAt = 42;
        public static final int TRANSACTION_adjustVolume = 11;
        public static final int TRANSACTION_fastForward = 22;
        public static final int TRANSACTION_getExtras = 31;
        public static final int TRANSACTION_getFlags = 9;
        public static final int TRANSACTION_getLaunchPendingIntent = 8;
        public static final int TRANSACTION_getMetadata = 27;
        public static final int TRANSACTION_getPackageName = 6;
        public static final int TRANSACTION_getPlaybackState = 28;
        public static final int TRANSACTION_getQueue = 29;
        public static final int TRANSACTION_getQueueTitle = 30;
        public static final int TRANSACTION_getRatingType = 32;
        public static final int TRANSACTION_getRepeatMode = 37;
        public static final int TRANSACTION_getSessionInfo = 50;
        public static final int TRANSACTION_getShuffleMode = 47;
        public static final int TRANSACTION_getTag = 7;
        public static final int TRANSACTION_getVolumeAttributes = 10;
        public static final int TRANSACTION_isCaptioningEnabled = 45;
        public static final int TRANSACTION_isShuffleModeEnabledRemoved = 38;
        public static final int TRANSACTION_isTransportControlEnabled = 5;
        public static final int TRANSACTION_next = 20;
        public static final int TRANSACTION_pause = 18;
        public static final int TRANSACTION_play = 13;
        public static final int TRANSACTION_playFromMediaId = 14;
        public static final int TRANSACTION_playFromSearch = 15;
        public static final int TRANSACTION_playFromUri = 16;
        public static final int TRANSACTION_prepare = 33;
        public static final int TRANSACTION_prepareFromMediaId = 34;
        public static final int TRANSACTION_prepareFromSearch = 35;
        public static final int TRANSACTION_prepareFromUri = 36;
        public static final int TRANSACTION_previous = 21;
        public static final int TRANSACTION_rate = 25;
        public static final int TRANSACTION_rateWithExtras = 51;
        public static final int TRANSACTION_registerCallbackListener = 3;
        public static final int TRANSACTION_removeQueueItem = 43;
        public static final int TRANSACTION_removeQueueItemAt = 44;
        public static final int TRANSACTION_rewind = 23;
        public static final int TRANSACTION_seekTo = 24;
        public static final int TRANSACTION_sendCommand = 1;
        public static final int TRANSACTION_sendCustomAction = 26;
        public static final int TRANSACTION_sendMediaButton = 2;
        public static final int TRANSACTION_setCaptioningEnabled = 46;
        public static final int TRANSACTION_setPlaybackSpeed = 49;
        public static final int TRANSACTION_setRepeatMode = 39;
        public static final int TRANSACTION_setShuffleMode = 48;
        public static final int TRANSACTION_setShuffleModeEnabledRemoved = 40;
        public static final int TRANSACTION_setVolumeTo = 12;
        public static final int TRANSACTION_skipToQueueItem = 17;
        public static final int TRANSACTION_stop = 19;
        public static final int TRANSACTION_unregisterCallbackListener = 4;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class Proxy implements IMediaSession {
            public static IMediaSession sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder remote) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(MediaDescriptionCompat description) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(MediaDescriptionCompat description, int index) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int direction, int flags, String packageName) throws RemoteException {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getExtras() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() throws RemoteException {
            }

            public String getInterfaceDescriptor() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PendingIntent getLaunchPendingIntent() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getPackageName() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PlaybackStateCompat getPlaybackState() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public List<MediaSessionCompat.QueueItem> getQueue() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public CharSequence getQueueTitle() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getSessionInfo() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getTag() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public ParcelableVolumeInfo getVolumeAttributes() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() throws RemoteException {
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
            public void playFromMediaId(String uri, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(String string, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(Uri uri, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(String uri, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(String string, Bundle extras) throws RemoteException {
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
            public void registerCallbackListener(IMediaControllerCallback cb) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(MediaDescriptionCompat description) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int index) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long pos) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(String command, Bundle args, MediaSessionCompat.ResultReceiverWrapper cb) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(String action, Bundle args) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(KeyEvent mediaButton) throws RemoteException {
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
            public void setShuffleModeEnabledRemoved(boolean shuffleMode) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int value, int flags, String packageName) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long id) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(IMediaControllerCallback cb) throws RemoteException {
            }
        }

        public static IMediaSession asInterface(IBinder obj) {
        }

        public static IMediaSession getDefaultImpl() {
        }

        public static boolean setDefaultImpl(IMediaSession impl) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
        }
    }

    void addQueueItem(MediaDescriptionCompat description) throws RemoteException;

    void addQueueItemAt(MediaDescriptionCompat description, int index) throws RemoteException;

    void adjustVolume(int direction, int flags, String packageName) throws RemoteException;

    void fastForward() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    long getFlags() throws RemoteException;

    PendingIntent getLaunchPendingIntent() throws RemoteException;

    MediaMetadataCompat getMetadata() throws RemoteException;

    String getPackageName() throws RemoteException;

    PlaybackStateCompat getPlaybackState() throws RemoteException;

    List<MediaSessionCompat.QueueItem> getQueue() throws RemoteException;

    CharSequence getQueueTitle() throws RemoteException;

    int getRatingType() throws RemoteException;

    int getRepeatMode() throws RemoteException;

    Bundle getSessionInfo() throws RemoteException;

    int getShuffleMode() throws RemoteException;

    String getTag() throws RemoteException;

    ParcelableVolumeInfo getVolumeAttributes() throws RemoteException;

    boolean isCaptioningEnabled() throws RemoteException;

    boolean isShuffleModeEnabledRemoved() throws RemoteException;

    boolean isTransportControlEnabled() throws RemoteException;

    void next() throws RemoteException;

    void pause() throws RemoteException;

    void play() throws RemoteException;

    void playFromMediaId(String uri, Bundle extras) throws RemoteException;

    void playFromSearch(String string, Bundle extras) throws RemoteException;

    void playFromUri(Uri uri, Bundle extras) throws RemoteException;

    void prepare() throws RemoteException;

    void prepareFromMediaId(String uri, Bundle extras) throws RemoteException;

    void prepareFromSearch(String string, Bundle extras) throws RemoteException;

    void prepareFromUri(Uri uri, Bundle extras) throws RemoteException;

    void previous() throws RemoteException;

    void rate(RatingCompat rating) throws RemoteException;

    void rateWithExtras(RatingCompat rating, Bundle extras) throws RemoteException;

    void registerCallbackListener(IMediaControllerCallback cb) throws RemoteException;

    void removeQueueItem(MediaDescriptionCompat description) throws RemoteException;

    void removeQueueItemAt(int index) throws RemoteException;

    void rewind() throws RemoteException;

    void seekTo(long pos) throws RemoteException;

    void sendCommand(String command, Bundle args, MediaSessionCompat.ResultReceiverWrapper cb) throws RemoteException;

    void sendCustomAction(String action, Bundle args) throws RemoteException;

    boolean sendMediaButton(KeyEvent mediaButton) throws RemoteException;

    void setCaptioningEnabled(boolean enabled) throws RemoteException;

    void setPlaybackSpeed(float speed) throws RemoteException;

    void setRepeatMode(int repeatMode) throws RemoteException;

    void setShuffleMode(int shuffleMode) throws RemoteException;

    void setShuffleModeEnabledRemoved(boolean shuffleMode) throws RemoteException;

    void setVolumeTo(int value, int flags, String packageName) throws RemoteException;

    void skipToQueueItem(long id) throws RemoteException;

    void stop() throws RemoteException;

    void unregisterCallbackListener(IMediaControllerCallback cb) throws RemoteException;
}
