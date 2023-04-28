package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.upstream.Allocation;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SampleDataQueue {
    private static final int INITIAL_SCRATCH_SIZE = 32;
    private final int allocationLength;
    private final Allocator allocator;
    private AllocationNode firstAllocationNode;
    private AllocationNode readAllocationNode;
    private final ParsableByteArray scratch;
    private long totalBytesWritten;
    private AllocationNode writeAllocationNode;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AllocationNode {
        @Nullable
        public Allocation allocation;
        public final long endPosition;
        @Nullable
        public AllocationNode next;
        public final long startPosition;
        public boolean wasInitialized;

        public AllocationNode(long startPosition, int allocationLength) {
        }

        public AllocationNode clear() {
        }

        public void initialize(Allocation allocation, AllocationNode next) {
        }

        public int translateOffset(long absolutePosition) {
        }
    }

    public SampleDataQueue(Allocator allocator) {
    }

    private void clearAllocationNodes(AllocationNode fromNode) {
    }

    private static AllocationNode getNodeContainingPosition(AllocationNode allocationNode, long absolutePosition) {
    }

    private void postAppend(int length) {
    }

    private int preAppend(int length) {
    }

    private static AllocationNode readData(AllocationNode allocationNode, long absolutePosition, ByteBuffer target, int length) {
    }

    private static AllocationNode readEncryptionData(AllocationNode allocationNode, DecoderInputBuffer buffer, SampleQueue.SampleExtrasHolder extrasHolder, ParsableByteArray scratch) {
    }

    private static AllocationNode readSampleData(AllocationNode allocationNode, DecoderInputBuffer buffer, SampleQueue.SampleExtrasHolder extrasHolder, ParsableByteArray scratch) {
    }

    public void discardDownstreamTo(long absolutePosition) {
    }

    public void discardUpstreamSampleBytes(long totalBytesWritten) {
    }

    public long getTotalBytesWritten() {
    }

    public void peekToBuffer(DecoderInputBuffer buffer, SampleQueue.SampleExtrasHolder extrasHolder) {
    }

    public void readToBuffer(DecoderInputBuffer buffer, SampleQueue.SampleExtrasHolder extrasHolder) {
    }

    public void reset() {
    }

    public void rewind() {
    }

    public int sampleData(DataReader input, int length, boolean allowEndOfInput) throws IOException {
    }

    private static AllocationNode readData(AllocationNode allocationNode, long absolutePosition, byte[] target, int length) {
    }

    public void sampleData(ParsableByteArray buffer, int length) {
    }
}
