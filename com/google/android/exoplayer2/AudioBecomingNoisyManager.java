package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AudioBecomingNoisyManager {
    private final Context context;
    private final AudioBecomingNoisyReceiver receiver;
    private boolean receiverRegistered;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class AudioBecomingNoisyReceiver extends BroadcastReceiver implements Runnable {
        private final Handler eventHandler;
        private final EventListener listener;
        public final /* synthetic */ AudioBecomingNoisyManager this$0;

        public AudioBecomingNoisyReceiver(final AudioBecomingNoisyManager this$0, Handler eventHandler, EventListener listener) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface EventListener {
        void onAudioBecomingNoisy();
    }

    public AudioBecomingNoisyManager(Context context, Handler eventHandler, EventListener listener) {
    }

    public static /* synthetic */ boolean access$000(AudioBecomingNoisyManager audioBecomingNoisyManager) {
    }

    public void setEnabled(boolean enabled) {
    }
}
