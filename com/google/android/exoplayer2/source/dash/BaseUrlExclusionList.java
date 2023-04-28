package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.source.dash.manifest.BaseUrl;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class BaseUrlExclusionList {
    private final Map<Integer, Long> excludedPriorities;
    private final Map<String, Long> excludedServiceLocations;
    private final Random random;
    private final Map<List<Pair<String, Integer>>, BaseUrl> selectionsTaken;

    public BaseUrlExclusionList() {
    }

    public static /* synthetic */ int a(BaseUrl baseUrl, BaseUrl baseUrl2) {
    }

    private static <T> void addExclusion(T toExclude, long excludeUntilMs, Map<T, Long> currentExclusions) {
    }

    private List<BaseUrl> applyExclusions(List<BaseUrl> baseUrls) {
    }

    private static int compareBaseUrl(BaseUrl a2, BaseUrl b) {
    }

    public static int getPriorityCount(List<BaseUrl> baseUrls) {
    }

    private static <T> void removeExpiredExclusions(long nowMs, Map<T, Long> exclusions) {
    }

    private BaseUrl selectWeighted(List<BaseUrl> candidates) {
    }

    public void exclude(BaseUrl baseUrlToExclude, long exclusionDurationMs) {
    }

    public int getPriorityCountAfterExclusion(List<BaseUrl> baseUrls) {
    }

    public void reset() {
    }

    @Nullable
    public BaseUrl selectBaseUrl(List<BaseUrl> baseUrls) {
    }

    @VisibleForTesting
    public BaseUrlExclusionList(Random random) {
    }
}
