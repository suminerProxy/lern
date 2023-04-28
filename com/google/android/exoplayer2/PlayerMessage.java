package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Clock;
import java.util.concurrent.TimeoutException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PlayerMessage {
    private final Clock clock;
    private boolean deleteAfterDelivery;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private Looper looper;
    @Nullable
    private Object payload;
    private long positionMs;
    private final Sender sender;
    private final Target target;
    private final Timeline timeline;
    private int type;
    private int windowIndex;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Sender {
        void sendMessage(PlayerMessage message);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Target {
        void handleMessage(int messageType, @Nullable Object message) throws ExoPlaybackException;
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int defaultWindowIndex, Clock clock, Looper defaultLooper) {
    }

    public synchronized boolean blockUntilDelivered() throws InterruptedException {
    }

    public synchronized PlayerMessage cancel() {
    }

    public boolean getDeleteAfterDelivery() {
    }

    public Looper getLooper() {
    }

    @Nullable
    public Object getPayload() {
    }

    public long getPositionMs() {
    }

    public Target getTarget() {
    }

    public Timeline getTimeline() {
    }

    public int getType() {
    }

    public int getWindowIndex() {
    }

    public synchronized boolean isCanceled() {
    }

    public synchronized void markAsProcessed(boolean isDelivered) {
    }

    public PlayerMessage send() {
    }

    public PlayerMessage setDeleteAfterDelivery(boolean deleteAfterDelivery) {
    }

    @Deprecated
    public PlayerMessage setHandler(Handler handler) {
    }

    public PlayerMessage setLooper(Looper looper) {
    }

    public PlayerMessage setPayload(@Nullable Object payload) {
    }

    public PlayerMessage setPosition(long positionMs) {
    }

    public PlayerMessage setType(int messageType) {
    }

    public PlayerMessage setPosition(int windowIndex, long positionMs) {
    }

    public synchronized boolean blockUntilDelivered(long timeoutMs) throws InterruptedException, TimeoutException {
    }
}
