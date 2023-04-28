package com.google.android.exoplayer2.transformer;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SegmentSpeedProvider implements SpeedProvider {
    private static final int INPUT_FRAME_RATE = 30;
    private final float baseSpeedMultiplier;
    private final ImmutableSortedMap<Long, Float> speedsByStartTimeUs;

    public SegmentSpeedProvider(Format format) {
    }

    private static ImmutableSortedMap<Long, Float> buildSpeedByStartTimeUsMap(Format format, float baseSpeed) {
    }

    private static ImmutableList<SlowMotionData.Segment> extractSlowMotionSegments(Format format) {
    }

    private static float getCaptureFrameRate(Format format) {
    }

    @Override // com.google.android.exoplayer2.transformer.SpeedProvider
    public float getSpeed(long timeUs) {
    }
}
