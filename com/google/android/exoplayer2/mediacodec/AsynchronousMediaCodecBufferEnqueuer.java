package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.util.ConditionVariable;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(23)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class AsynchronousMediaCodecBufferEnqueuer {
    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque<MessageParams> MESSAGE_PARAMS_INSTANCE_POOL = null;
    private static final int MSG_OPEN_CV = 2;
    private static final int MSG_QUEUE_INPUT_BUFFER = 0;
    private static final int MSG_QUEUE_SECURE_INPUT_BUFFER = 1;
    private static final Object QUEUE_SECURE_LOCK = null;
    private final MediaCodec codec;
    private final ConditionVariable conditionVariable;
    private Handler handler;
    private final HandlerThread handlerThread;
    private final boolean needsSynchronizationWorkaround;
    private final AtomicReference<RuntimeException> pendingRuntimeException;
    private boolean started;

    /* renamed from: com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends Handler {
        public final /* synthetic */ AsynchronousMediaCodecBufferEnqueuer this$0;

        public AnonymousClass1(final AsynchronousMediaCodecBufferEnqueuer this$0, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class MessageParams {
        public final MediaCodec.CryptoInfo cryptoInfo;
        public int flags;
        public int index;
        public int offset;
        public long presentationTimeUs;
        public int size;

        public void setQueueParams(int index, int offset, int size, long presentationTimeUs, int flags) {
        }
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec codec, HandlerThread queueingThread, boolean forceQueueingSynchronizationWorkaround) {
    }

    public static /* synthetic */ void access$000(AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer, Message message) {
    }

    private void blockUntilHandlerThreadIsIdle() throws InterruptedException {
    }

    private static void copy(CryptoInfo cryptoInfo, MediaCodec.CryptoInfo frameworkCryptoInfo) {
    }

    private void doHandleMessage(Message msg) {
    }

    private void doQueueInputBuffer(int index, int offset, int size, long presentationTimeUs, int flag) {
    }

    private void doQueueSecureInputBuffer(int index, int offset, MediaCodec.CryptoInfo info, long presentationTimeUs, int flags) {
    }

    private void flushHandlerThread() throws InterruptedException {
    }

    private static MessageParams getMessageParams() {
    }

    private void maybeThrowException() {
    }

    private static boolean needsSynchronizationWorkaround() {
    }

    private static void recycleMessageParams(MessageParams params) {
    }

    public void flush() {
    }

    public void queueInputBuffer(int index, int offset, int size, long presentationTimeUs, int flags) {
    }

    public void queueSecureInputBuffer(int index, int offset, CryptoInfo info, long presentationTimeUs, int flags) {
    }

    @VisibleForTesting
    public void setPendingRuntimeException(RuntimeException exception) {
    }

    public void shutdown() {
    }

    public void start() {
    }

    public void waitUntilQueueingComplete() throws InterruptedException {
    }

    @VisibleForTesting
    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec codec, HandlerThread handlerThread, boolean forceQueueingSynchronizationWorkaround, ConditionVariable conditionVariable) {
    }

    @Nullable
    private static int[] copy(@Nullable int[] src, @Nullable int[] dst) {
    }

    @Nullable
    private static byte[] copy(@Nullable byte[] src, @Nullable byte[] dst) {
    }
}
