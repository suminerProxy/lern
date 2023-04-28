package com.google.android.exoplayer2.transformer;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import java.nio.ByteBuffer;
import java.util.Iterator;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SefSlowMotionVideoSampleTransformer implements SampleTransformer {
    @VisibleForTesting
    public static final int INPUT_FRAME_RATE = 30;
    private static final int NAL_START_CODE_LENGTH = 0;
    private static final int NAL_UNIT_TYPE_PREFIX = 14;
    private static final int TARGET_OUTPUT_FRAME_RATE = 30;
    private final float captureFrameRate;
    @Nullable
    private SegmentInfo currentSegmentInfo;
    private long frameTimeDeltaUs;
    private final int inputMaxLayer;
    @Nullable
    private SegmentInfo nextSegmentInfo;
    private final int normalSpeedMaxLayer;
    private final byte[] scratch;
    private final Iterator<SlowMotionData.Segment> segmentIterator;
    @Nullable
    private final SlowMotionData slowMotionData;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MetadataInfo {
        public float captureFrameRate;
        public int inputMaxLayer;
        public int normalSpeedMaxLayer;
        @Nullable
        public SlowMotionData slowMotionData;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SegmentInfo {
        public final long endTimeUs;
        public final int maxLayer;
        public final int speedDivisor;
        public final long startTimeUs;

        public SegmentInfo(SlowMotionData.Segment segment, int inputMaxLayer, int normalSpeedLayer) {
        }

        private static int getSlowMotionMaxLayer(int speedDivisor, int inputMaxLayer, int normalSpeedMaxLayer) {
        }
    }

    public SefSlowMotionVideoSampleTransformer(Format format) {
    }

    private void enterNextSegment() {
    }

    private static MetadataInfo getMetadataInfo(@Nullable Metadata metadata) {
    }

    @RequiresNonNull({"currentSegmentInfo"})
    private void leaveCurrentSegment() {
    }

    private boolean shouldKeepFrameForOutputValidity(int layer, long timeUs) {
    }

    private void skipToNextNalUnit(ByteBuffer data) {
    }

    @VisibleForTesting
    public long getCurrentFrameOutputTimeUs(long inputTimeUs) {
    }

    @VisibleForTesting
    public boolean processCurrentFrame(int layer, long timeUs) {
    }

    @Override // com.google.android.exoplayer2.transformer.SampleTransformer
    public void transformSample(DecoderInputBuffer buffer) {
    }
}
