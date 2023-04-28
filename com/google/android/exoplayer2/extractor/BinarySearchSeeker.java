package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.SeekMap;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BinarySearchSeeker {
    private static final long MAX_SKIP_BYTES = 262144;
    private final int minimumSearchRange;
    public final BinarySearchSeekMap seekMap;
    @Nullable
    public SeekOperationParams seekOperationParams;
    public final TimestampSeeker timestampSeeker;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class BinarySearchSeekMap implements SeekMap {
        private final long approxBytesPerFrame;
        private final long ceilingBytePosition;
        private final long ceilingTimePosition;
        private final long durationUs;
        private final long floorBytePosition;
        private final long floorTimePosition;
        private final SeekTimestampConverter seekTimestampConverter;

        public BinarySearchSeekMap(SeekTimestampConverter seekTimestampConverter, long durationUs, long floorTimePosition, long ceilingTimePosition, long floorBytePosition, long ceilingBytePosition, long approxBytesPerFrame) {
        }

        public static /* synthetic */ long access$1000(BinarySearchSeekMap binarySearchSeekMap) {
        }

        public static /* synthetic */ long access$1100(BinarySearchSeekMap binarySearchSeekMap) {
        }

        public static /* synthetic */ long access$1200(BinarySearchSeekMap binarySearchSeekMap) {
        }

        public static /* synthetic */ long access$1300(BinarySearchSeekMap binarySearchSeekMap) {
        }

        public static /* synthetic */ long access$1400(BinarySearchSeekMap binarySearchSeekMap) {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long timeUs) {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
        }

        public long timeUsToTargetTime(long timeUs) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
        public long timeUsToTargetTime(long timeUs) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SeekOperationParams {
        private final long approxBytesPerFrame;
        private long ceilingBytePosition;
        private long ceilingTimePosition;
        private long floorBytePosition;
        private long floorTimePosition;
        private long nextSearchBytePosition;
        private final long seekTimeUs;
        private final long targetTimePosition;

        public SeekOperationParams(long seekTimeUs, long targetTimePosition, long floorTimePosition, long ceilingTimePosition, long floorBytePosition, long ceilingBytePosition, long approxBytesPerFrame) {
        }

        public static /* synthetic */ long access$000(SeekOperationParams seekOperationParams) {
        }

        public static /* synthetic */ long access$100(SeekOperationParams seekOperationParams) {
        }

        public static /* synthetic */ long access$200(SeekOperationParams seekOperationParams) {
        }

        public static /* synthetic */ long access$300(SeekOperationParams seekOperationParams) {
        }

        public static /* synthetic */ long access$400(SeekOperationParams seekOperationParams) {
        }

        public static /* synthetic */ void access$800(SeekOperationParams seekOperationParams, long j2, long j3) {
        }

        public static /* synthetic */ void access$900(SeekOperationParams seekOperationParams, long j2, long j3) {
        }

        public static long calculateNextSearchBytePosition(long targetTimePosition, long floorTimePosition, long ceilingTimePosition, long floorBytePosition, long ceilingBytePosition, long approxBytesPerFrame) {
        }

        private long getCeilingBytePosition() {
        }

        private long getFloorBytePosition() {
        }

        private long getNextSearchBytePosition() {
        }

        private long getSeekTimeUs() {
        }

        private long getTargetTimePosition() {
        }

        private void updateNextSearchBytePosition() {
        }

        private void updateSeekCeiling(long ceilingTimePosition, long ceilingBytePosition) {
        }

        private void updateSeekFloor(long floorTimePosition, long floorBytePosition) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface SeekTimestampConverter {
        long timeUsToTargetTime(long timeUs);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TimestampSearchResult {
        public static final TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = null;
        public static final int TYPE_NO_TIMESTAMP = -3;
        public static final int TYPE_POSITION_OVERESTIMATED = -1;
        public static final int TYPE_POSITION_UNDERESTIMATED = -2;
        public static final int TYPE_TARGET_TIMESTAMP_FOUND = 0;
        private final long bytePositionToUpdate;
        private final long timestampToUpdate;
        private final int type;

        private TimestampSearchResult(int type, long timestampToUpdate, long bytePositionToUpdate) {
        }

        public static /* synthetic */ int access$500(TimestampSearchResult timestampSearchResult) {
        }

        public static /* synthetic */ long access$600(TimestampSearchResult timestampSearchResult) {
        }

        public static /* synthetic */ long access$700(TimestampSearchResult timestampSearchResult) {
        }

        public static TimestampSearchResult overestimatedResult(long newCeilingTimestamp, long newCeilingBytePosition) {
        }

        public static TimestampSearchResult targetFoundResult(long resultBytePosition) {
        }

        public static TimestampSearchResult underestimatedResult(long newFloorTimestamp, long newCeilingBytePosition) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface TimestampSeeker {
        void onSeekFinished();

        TimestampSearchResult searchForTimestamp(ExtractorInput input, long targetTimestamp) throws IOException;
    }

    public BinarySearchSeeker(SeekTimestampConverter seekTimestampConverter, TimestampSeeker timestampSeeker, long durationUs, long floorTimePosition, long ceilingTimePosition, long floorBytePosition, long ceilingBytePosition, long approxBytesPerFrame, int minimumSearchRange) {
    }

    public SeekOperationParams createSeekParamsForTargetTimeUs(long timeUs) {
    }

    public final SeekMap getSeekMap() {
    }

    public int handlePendingSeek(ExtractorInput input, PositionHolder seekPositionHolder) throws IOException {
    }

    public final boolean isSeeking() {
    }

    public final void markSeekOperationFinished(boolean foundTargetFrame, long resultPosition) {
    }

    public void onSeekOperationFinished(boolean foundTargetFrame, long resultPosition) {
    }

    public final int seekToPosition(ExtractorInput input, long position, PositionHolder seekPositionHolder) {
    }

    public final void setSeekTargetUs(long timeUs) {
    }

    public final boolean skipInputUntilPosition(ExtractorInput input, long position) throws IOException {
    }
}
