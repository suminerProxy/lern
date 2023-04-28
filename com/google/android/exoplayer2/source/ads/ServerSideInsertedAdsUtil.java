package com.google.android.exoplayer2.source.ads;

import androidx.annotation.CheckResult;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.MediaPeriodId;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ServerSideInsertedAdsUtil {
    private ServerSideInsertedAdsUtil() {
    }

    @CheckResult
    public static AdPlaybackState addAdGroupToAdPlaybackState(AdPlaybackState adPlaybackState, long fromPositionUs, long toPositionUs, long contentResumeOffsetUs) {
    }

    public static int getAdCountInGroup(AdPlaybackState adPlaybackState, int adGroupIndex) {
    }

    public static long getMediaPeriodPositionUs(long positionUs, MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
    }

    public static long getMediaPeriodPositionUsForAd(long positionUs, int adGroupIndex, int adIndexInAdGroup, AdPlaybackState adPlaybackState) {
    }

    public static long getMediaPeriodPositionUsForContent(long positionUs, int nextAdGroupIndex, AdPlaybackState adPlaybackState) {
    }

    public static long getStreamDurationUs(Player player, AdPlaybackState adPlaybackState) {
    }

    public static long getStreamPositionUs(Player player, AdPlaybackState adPlaybackState) {
    }

    public static long getStreamPositionUsForAd(long positionUs, int adGroupIndex, int adIndexInAdGroup, AdPlaybackState adPlaybackState) {
    }

    public static long getStreamPositionUsForContent(long positionUs, int nextAdGroupIndex, AdPlaybackState adPlaybackState) {
    }

    public static long getStreamPositionUs(long positionUs, MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
    }
}
