package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AdPlaybackState implements Bundleable {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public static final Bundleable.Creator<AdPlaybackState> CREATOR = null;
    private static final int FIELD_AD_GROUPS = 1;
    private static final int FIELD_AD_RESUME_POSITION_US = 2;
    private static final int FIELD_CONTENT_DURATION_US = 3;
    private static final int FIELD_REMOVED_AD_GROUP_COUNT = 4;
    public static final AdPlaybackState NONE = null;
    private static final AdGroup REMOVED_AD_GROUP = null;
    public final int adGroupCount;
    private final AdGroup[] adGroups;
    public final long adResumePositionUs;
    @Nullable
    public final Object adsId;
    public final long contentDurationUs;
    public final int removedAdGroupCount;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AdGroup implements Bundleable {
        public static final Bundleable.Creator<AdGroup> CREATOR = null;
        private static final int FIELD_CONTENT_RESUME_OFFSET_US = 5;
        private static final int FIELD_COUNT = 1;
        private static final int FIELD_DURATIONS_US = 4;
        private static final int FIELD_IS_SERVER_SIDE_INSERTED = 6;
        private static final int FIELD_STATES = 3;
        private static final int FIELD_TIME_US = 0;
        private static final int FIELD_URIS = 2;
        public final long contentResumeOffsetUs;
        public final int count;
        public final long[] durationsUs;
        public final boolean isServerSideInserted;
        public final int[] states;
        public final long timeUs;
        public final Uri[] uris;

        public AdGroup(long timeUs) {
        }

        public static /* synthetic */ AdGroup a(Bundle bundle) {
        }

        @CheckResult
        private static long[] copyDurationsUsWithSpaceForAdCount(long[] durationsUs, int count) {
        }

        @CheckResult
        private static int[] copyStatesWithSpaceForAdCount(int[] states, int count) {
        }

        private static AdGroup fromBundle(Bundle bundle) {
        }

        private static String keyForField(int field) {
        }

        public boolean equals(@Nullable Object o2) {
        }

        public int getFirstAdIndexToPlay() {
        }

        public int getNextAdIndexToPlay(int lastPlayedAdIndex) {
        }

        public boolean hasUnplayedAds() {
        }

        public int hashCode() {
        }

        public boolean shouldPlayAdGroup() {
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
        }

        @CheckResult
        public AdGroup withAdCount(int count) {
        }

        @CheckResult
        public AdGroup withAdDurationsUs(long[] durationsUs) {
        }

        @CheckResult
        public AdGroup withAdState(int state, int index) {
        }

        @CheckResult
        public AdGroup withAdUri(Uri uri, int index) {
        }

        @CheckResult
        public AdGroup withAllAdsSkipped() {
        }

        @CheckResult
        public AdGroup withContentResumeOffsetUs(long contentResumeOffsetUs) {
        }

        @CheckResult
        public AdGroup withIsServerSideInserted(boolean isServerSideInserted) {
        }

        @CheckResult
        public AdGroup withTimeUs(long timeUs) {
        }

        private AdGroup(long timeUs, int count, int[] states, Uri[] uris, long[] durationsUs, long contentResumeOffsetUs, boolean isServerSideInserted) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface AdState {
    }

    public AdPlaybackState(Object adsId, long... adGroupTimesUs) {
    }

    public static /* synthetic */ AdPlaybackState a(Bundle bundle) {
    }

    private static AdGroup[] createEmptyAdGroups(long[] adGroupTimesUs) {
    }

    private static AdPlaybackState fromBundle(Bundle bundle) {
    }

    private boolean isPositionBeforeAdGroup(long positionUs, long periodDurationUs, int adGroupIndex) {
    }

    private static String keyForField(int field) {
    }

    public boolean equals(@Nullable Object o2) {
    }

    public AdGroup getAdGroup(int adGroupIndex) {
    }

    public int getAdGroupIndexAfterPositionUs(long positionUs, long periodDurationUs) {
    }

    public int getAdGroupIndexForPositionUs(long positionUs, long periodDurationUs) {
    }

    public int hashCode() {
    }

    public boolean isAdInErrorState(int adGroupIndex, int adIndexInAdGroup) {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public String toString() {
    }

    @CheckResult
    public AdPlaybackState withAdCount(int adGroupIndex, int adCount) {
    }

    @CheckResult
    public AdPlaybackState withAdDurationsUs(long[][] adDurationUs) {
    }

    @CheckResult
    public AdPlaybackState withAdGroupTimeUs(int adGroupIndex, long adGroupTimeUs) {
    }

    @CheckResult
    public AdPlaybackState withAdLoadError(int adGroupIndex, int adIndexInAdGroup) {
    }

    @CheckResult
    public AdPlaybackState withAdResumePositionUs(long adResumePositionUs) {
    }

    @CheckResult
    public AdPlaybackState withAdUri(int adGroupIndex, int adIndexInAdGroup, Uri uri) {
    }

    @CheckResult
    public AdPlaybackState withContentDurationUs(long contentDurationUs) {
    }

    @CheckResult
    public AdPlaybackState withContentResumeOffsetUs(int adGroupIndex, long contentResumeOffsetUs) {
    }

    @CheckResult
    public AdPlaybackState withIsServerSideInserted(int adGroupIndex, boolean isServerSideInserted) {
    }

    @CheckResult
    public AdPlaybackState withNewAdGroup(int adGroupIndex, long adGroupTimeUs) {
    }

    @CheckResult
    public AdPlaybackState withPlayedAd(int adGroupIndex, int adIndexInAdGroup) {
    }

    @CheckResult
    public AdPlaybackState withRemovedAdGroupCount(int removedAdGroupCount) {
    }

    @CheckResult
    public AdPlaybackState withSkippedAd(int adGroupIndex, int adIndexInAdGroup) {
    }

    @CheckResult
    public AdPlaybackState withSkippedAdGroup(int adGroupIndex) {
    }

    private AdPlaybackState(@Nullable Object adsId, AdGroup[] adGroups, long adResumePositionUs, long contentDurationUs, int removedAdGroupCount) {
    }

    @CheckResult
    public AdPlaybackState withAdDurationsUs(int adGroupIndex, long... adDurationsUs) {
    }
}
