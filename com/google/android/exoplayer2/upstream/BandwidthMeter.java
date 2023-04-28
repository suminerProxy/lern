package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface BandwidthMeter {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface EventListener {

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class EventDispatcher {
            private final CopyOnWriteArrayList<HandlerAndListener> listeners;

            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public static final class HandlerAndListener {
                private final Handler handler;
                private final EventListener listener;
                private boolean released;

                public HandlerAndListener(Handler handler, EventListener eventListener) {
                }

                public static /* synthetic */ EventListener access$000(HandlerAndListener handlerAndListener) {
                }

                public static /* synthetic */ boolean access$100(HandlerAndListener handlerAndListener) {
                }

                public static /* synthetic */ Handler access$200(HandlerAndListener handlerAndListener) {
                }

                public void release() {
                }
            }

            public static /* synthetic */ void a(HandlerAndListener handlerAndListener, int i2, long j2, long j3) {
            }

            public void addListener(Handler eventHandler, EventListener eventListener) {
            }

            public void bandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate) {
            }

            public void removeListener(EventListener eventListener) {
            }
        }

        void onBandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate);
    }

    void addEventListener(Handler eventHandler, EventListener eventListener);

    long getBitrateEstimate();

    long getTimeToFirstByteEstimateUs();

    @Nullable
    TransferListener getTransferListener();

    void removeEventListener(EventListener eventListener);
}
