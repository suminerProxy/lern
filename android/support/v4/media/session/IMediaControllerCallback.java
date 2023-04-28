package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface IMediaControllerCallback extends IInterface {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Default implements IMediaControllerCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onCaptioningEnabledChanged(boolean enabled) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onEvent(String event, Bundle extras) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onExtrasChanged(Bundle extras) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onMetadataChanged(MediaMetadataCompat metadata) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onPlaybackStateChanged(PlaybackStateCompat state) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onQueueChanged(List<MediaSessionCompat.QueueItem> queue) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onQueueTitleChanged(CharSequence title) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onRepeatModeChanged(int repeatMode) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onSessionDestroyed() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onSessionReady() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onShuffleModeChanged(int shuffleMode) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onShuffleModeChangedRemoved(boolean enabled) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onVolumeInfoChanged(ParcelableVolumeInfo info) throws RemoteException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class Stub extends Binder implements IMediaControllerCallback {
        private static final String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";
        public static final int TRANSACTION_onCaptioningEnabledChanged = 11;
        public static final int TRANSACTION_onEvent = 1;
        public static final int TRANSACTION_onExtrasChanged = 7;
        public static final int TRANSACTION_onMetadataChanged = 4;
        public static final int TRANSACTION_onPlaybackStateChanged = 3;
        public static final int TRANSACTION_onQueueChanged = 5;
        public static final int TRANSACTION_onQueueTitleChanged = 6;
        public static final int TRANSACTION_onRepeatModeChanged = 9;
        public static final int TRANSACTION_onSessionDestroyed = 2;
        public static final int TRANSACTION_onSessionReady = 13;
        public static final int TRANSACTION_onShuffleModeChanged = 12;
        public static final int TRANSACTION_onShuffleModeChangedRemoved = 10;
        public static final int TRANSACTION_onVolumeInfoChanged = 8;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class Proxy implements IMediaControllerCallback {
            public static IMediaControllerCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder remote) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            public String getInterfaceDescriptor() {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onCaptioningEnabledChanged(boolean enabled) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onEvent(String event, Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(Bundle extras) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(MediaMetadataCompat metadata) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onPlaybackStateChanged(PlaybackStateCompat state) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueChanged(List<MediaSessionCompat.QueueItem> queue) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(CharSequence title) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onRepeatModeChanged(int repeatMode) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionReady() throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChanged(int shuffleMode) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChangedRemoved(boolean enabled) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(ParcelableVolumeInfo info) throws RemoteException {
            }
        }

        public static IMediaControllerCallback asInterface(IBinder obj) {
        }

        public static IMediaControllerCallback getDefaultImpl() {
        }

        public static boolean setDefaultImpl(IMediaControllerCallback impl) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
        }
    }

    void onCaptioningEnabledChanged(boolean enabled) throws RemoteException;

    void onEvent(String event, Bundle extras) throws RemoteException;

    void onExtrasChanged(Bundle extras) throws RemoteException;

    void onMetadataChanged(MediaMetadataCompat metadata) throws RemoteException;

    void onPlaybackStateChanged(PlaybackStateCompat state) throws RemoteException;

    void onQueueChanged(List<MediaSessionCompat.QueueItem> queue) throws RemoteException;

    void onQueueTitleChanged(CharSequence title) throws RemoteException;

    void onRepeatModeChanged(int repeatMode) throws RemoteException;

    void onSessionDestroyed() throws RemoteException;

    void onSessionReady() throws RemoteException;

    void onShuffleModeChanged(int shuffleMode) throws RemoteException;

    void onShuffleModeChangedRemoved(boolean enabled) throws RemoteException;

    void onVolumeInfoChanged(ParcelableVolumeInfo info) throws RemoteException;
}
