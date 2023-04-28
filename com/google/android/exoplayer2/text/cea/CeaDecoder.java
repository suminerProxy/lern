package com.google.android.exoplayer2.text.cea;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.OutputBuffer;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoder;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class CeaDecoder implements SubtitleDecoder {
    private static final int NUM_INPUT_BUFFERS = 10;
    private static final int NUM_OUTPUT_BUFFERS = 2;
    private final ArrayDeque<CeaInputBuffer> availableInputBuffers;
    private final ArrayDeque<SubtitleOutputBuffer> availableOutputBuffers;
    @Nullable
    private CeaInputBuffer dequeuedInputBuffer;
    private long playbackPositionUs;
    private long queuedInputBufferCount;
    private final PriorityQueue<CeaInputBuffer> queuedInputBuffers;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CeaInputBuffer extends SubtitleInputBuffer implements Comparable<CeaInputBuffer> {
        private long queuedInputBufferCount;

        private CeaInputBuffer() {
        }

        public static /* synthetic */ long access$102(CeaInputBuffer ceaInputBuffer, long j2) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(CeaInputBuffer other) {
        }

        public /* synthetic */ CeaInputBuffer(AnonymousClass1 anonymousClass1) {
        }

        /* renamed from: compareTo  reason: avoid collision after fix types in other method */
        public int compareTo2(CeaInputBuffer other) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CeaOutputBuffer extends SubtitleOutputBuffer {
        private OutputBuffer.Owner<CeaOutputBuffer> owner;

        public CeaOutputBuffer(OutputBuffer.Owner<CeaOutputBuffer> owner) {
        }

        @Override // com.google.android.exoplayer2.decoder.OutputBuffer
        public final void release() {
        }
    }

    private void releaseInputBuffer(CeaInputBuffer inputBuffer) {
    }

    public abstract Subtitle createSubtitle();

    public abstract void decode(SubtitleInputBuffer inputBuffer);

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws DecoderException {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ SubtitleOutputBuffer dequeueOutputBuffer() throws DecoderException {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
    }

    @Nullable
    public final SubtitleOutputBuffer getAvailableOutputBuffer() {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public abstract String getName();

    public final long getPositionUs() {
    }

    public abstract boolean isNewSubtitleDataAvailable();

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer inputBuffer) throws DecoderException {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }

    public void releaseOutputBuffer(SubtitleOutputBuffer outputBuffer) {
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long positionUs) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public void queueInputBuffer(SubtitleInputBuffer inputBuffer) throws SubtitleDecoderException {
    }
}
