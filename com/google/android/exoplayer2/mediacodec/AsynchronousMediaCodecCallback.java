package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.IntArrayQueue;
import java.util.ArrayDeque;

@RequiresApi(23)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AsynchronousMediaCodecCallback extends MediaCodec.Callback {
    @GuardedBy("lock")
    private final IntArrayQueue availableInputBuffers;
    @GuardedBy("lock")
    private final IntArrayQueue availableOutputBuffers;
    @GuardedBy("lock")
    private final ArrayDeque<MediaCodec.BufferInfo> bufferInfos;
    private final HandlerThread callbackThread;
    @Nullable
    @GuardedBy("lock")
    private MediaFormat currentFormat;
    @GuardedBy("lock")
    private final ArrayDeque<MediaFormat> formats;
    private Handler handler;
    @Nullable
    @GuardedBy("lock")
    private IllegalStateException internalException;
    private final Object lock;
    @Nullable
    @GuardedBy("lock")
    private MediaCodec.CodecException mediaCodecException;
    @GuardedBy("lock")
    private long pendingFlushCount;
    @Nullable
    @GuardedBy("lock")
    private MediaFormat pendingOutputFormat;
    @GuardedBy("lock")
    private boolean shutDown;

    public AsynchronousMediaCodecCallback(HandlerThread callbackThread) {
    }

    private /* synthetic */ void a(Runnable runnable) {
    }

    @GuardedBy("lock")
    private void addOutputFormat(MediaFormat mediaFormat) {
    }

    @GuardedBy("lock")
    private void flushInternal() {
    }

    @GuardedBy("lock")
    private boolean isFlushingOrShutdown() {
    }

    @GuardedBy("lock")
    private void maybeThrowException() {
    }

    @GuardedBy("lock")
    private void maybeThrowInternalException() {
    }

    @GuardedBy("lock")
    private void maybeThrowMediaCodecException() {
    }

    private void onFlushCompleted(Runnable onFlushCompleted) {
    }

    @GuardedBy("lock")
    private void onFlushCompletedSynchronized(Runnable onFlushCompleted) {
    }

    private void setInternalException(IllegalStateException e2) {
    }

    public /* synthetic */ void b(Runnable runnable) {
    }

    public int dequeueInputBufferIndex() {
    }

    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
    }

    public void flushAsync(Runnable onFlushCompleted) {
    }

    public MediaFormat getOutputFormat() {
    }

    public void initialize(MediaCodec codec) {
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(@NonNull MediaCodec codec, @NonNull MediaCodec.CodecException e2) {
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(@NonNull MediaCodec codec, int index) {
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(@NonNull MediaCodec codec, int index, @NonNull MediaCodec.BufferInfo info) {
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(@NonNull MediaCodec codec, @NonNull MediaFormat format) {
    }

    public void shutdown() {
    }
}
