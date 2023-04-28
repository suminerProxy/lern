package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class StreamVolumeManager {
    private static final String TAG = "StreamVolumeManager";
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private static final int VOLUME_FLAGS = 1;
    private final Context applicationContext;
    private final AudioManager audioManager;
    private final Handler eventHandler;
    private final Listener listener;
    private boolean muted;
    @Nullable
    private VolumeChangeReceiver receiver;
    private int streamType;
    private int volume;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Listener {
        void onStreamTypeChanged(int streamType);

        void onStreamVolumeChanged(int streamVolume, boolean streamMuted);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class VolumeChangeReceiver extends BroadcastReceiver {
        public final /* synthetic */ StreamVolumeManager this$0;

        private VolumeChangeReceiver(final StreamVolumeManager this$0) {
        }

        public static /* synthetic */ void a(StreamVolumeManager streamVolumeManager) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public /* synthetic */ VolumeChangeReceiver(StreamVolumeManager streamVolumeManager, AnonymousClass1 anonymousClass1) {
        }
    }

    public StreamVolumeManager(Context context, Handler eventHandler, Listener listener) {
    }

    public static /* synthetic */ Handler access$100(StreamVolumeManager streamVolumeManager) {
    }

    public static /* synthetic */ void access$200(StreamVolumeManager streamVolumeManager) {
    }

    private static boolean getMutedFromManager(AudioManager audioManager, int streamType) {
    }

    private static int getVolumeFromManager(AudioManager audioManager, int streamType) {
    }

    private void updateVolumeAndNotifyIfChanged() {
    }

    public void decreaseVolume() {
    }

    public int getMaxVolume() {
    }

    public int getMinVolume() {
    }

    public int getVolume() {
    }

    public void increaseVolume() {
    }

    public boolean isMuted() {
    }

    public void release() {
    }

    public void setMuted(boolean muted) {
    }

    public void setStreamType(int streamType) {
    }

    public void setVolume(int volume) {
    }
}
