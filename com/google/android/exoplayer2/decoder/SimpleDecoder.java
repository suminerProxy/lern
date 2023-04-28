package com.google.android.exoplayer2.decoder;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.OutputBuffer;
import java.util.ArrayDeque;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends OutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {
    private int availableInputBufferCount;
    private final I[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final O[] availableOutputBuffers;
    private final Thread decodeThread;
    private I dequeuedInputBuffer;
    private E exception;
    private boolean flushed;
    private final Object lock;
    private final ArrayDeque<I> queuedInputBuffers;
    private final ArrayDeque<O> queuedOutputBuffers;
    private boolean released;
    private int skippedOutputBufferCount;

    /* renamed from: com.google.android.exoplayer2.decoder.SimpleDecoder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends Thread {
        public final /* synthetic */ SimpleDecoder this$0;

        public AnonymousClass1(final SimpleDecoder this$0, String name) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    public SimpleDecoder(I[] inputBuffers, O[] outputBuffers) {
    }

    public static /* synthetic */ void access$000(SimpleDecoder simpleDecoder) {
    }

    private boolean canDecodeBuffer() {
    }

    private boolean decode() throws InterruptedException {
    }

    private void maybeNotifyDecodeLoop() {
    }

    private void maybeThrowException() throws DecoderException {
    }

    private void releaseInputBufferInternal(I inputBuffer) {
    }

    private void releaseOutputBufferInternal(O outputBuffer) {
    }

    private void run() {
    }

    public abstract I createInputBuffer();

    public abstract O createOutputBuffer();

    public abstract E createUnexpectedDecodeException(Throwable error);

    @Nullable
    public abstract E decode(I inputBuffer, O outputBuffer, boolean reset);

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ Object dequeueInputBuffer() throws DecoderException {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ Object dequeueOutputBuffer() throws DecoderException {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void flush() {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(Object inputBuffer) throws DecoderException {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @CallSuper
    public void release() {
    }

    @CallSuper
    public void releaseOutputBuffer(O outputBuffer) {
    }

    public final void setInitialInputBufferSize(int size) {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public final I dequeueInputBuffer() throws DecoderException {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public final O dequeueOutputBuffer() throws DecoderException {
    }

    public final void queueInputBuffer(I inputBuffer) throws DecoderException {
    }
}
