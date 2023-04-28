package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.SlidingPercentile;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    private static final int COUNTRY_GROUP_INDEX_2G = 1;
    private static final int COUNTRY_GROUP_INDEX_3G = 2;
    private static final int COUNTRY_GROUP_INDEX_4G = 3;
    private static final int COUNTRY_GROUP_INDEX_5G_NSA = 4;
    private static final int COUNTRY_GROUP_INDEX_5G_SA = 5;
    private static final int COUNTRY_GROUP_INDEX_WIFI = 0;
    public static final ImmutableListMultimap<String, Integer> DEFAULT_INITIAL_BITRATE_COUNTRY_GROUPS = null;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = null;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = null;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = null;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = null;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = null;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = null;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;
    @Nullable
    private static DefaultBandwidthMeter singletonInstance;
    private long bitrateEstimate;
    private final Clock clock;
    private final BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private final ImmutableMap<Integer, Long> initialBitrateEstimates;
    private long lastReportedBitrateEstimate;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private final boolean resetOnNetworkTypeChange;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;

    public /* synthetic */ DefaultBandwidthMeter(Context context, Map map, int i2, Clock clock, boolean z, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ void a(DefaultBandwidthMeter defaultBandwidthMeter, int i2) {
    }

    private static ImmutableListMultimap<String, Integer> createInitialBitrateCountryGroupAssignment() {
    }

    private long getInitialBitrateEstimateForNetworkType(int networkType) {
    }

    public static synchronized DefaultBandwidthMeter getSingletonInstance(Context context) {
    }

    private static boolean isTransferAtFullNetworkSpeed(DataSpec dataSpec, boolean isNetwork) {
    }

    private void maybeNotifyBandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate) {
    }

    private synchronized void onNetworkTypeChanged(int networkType) {
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public void addEventListener(Handler eventHandler, BandwidthMeter.EventListener eventListener) {
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public /* synthetic */ long getTimeToFirstByteEstimateUs() {
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public TransferListener getTransferListener() {
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onBytesTransferred(DataSource source, DataSpec dataSpec, boolean isNetwork, int bytesTransferred) {
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferEnd(DataSource source, DataSpec dataSpec, boolean isNetwork) {
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public void onTransferInitializing(DataSource source, DataSpec dataSpec, boolean isNetwork) {
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferStart(DataSource source, DataSpec dataSpec, boolean isNetwork) {
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public void removeEventListener(BandwidthMeter.EventListener eventListener) {
    }

    public synchronized void setNetworkTypeOverride(int networkType) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private Clock clock;
        @Nullable
        private final Context context;
        private Map<Integer, Long> initialBitrateEstimates;
        private boolean resetOnNetworkTypeChange;
        private int slidingWindowMaxWeight;

        public Builder(Context context) {
        }

        private static ImmutableList<Integer> getCountryGroupIndices(String countryCode) {
        }

        private static Map<Integer, Long> getInitialBitrateEstimatesForCountry(String countryCode) {
        }

        public DefaultBandwidthMeter build() {
        }

        public Builder setClock(Clock clock) {
        }

        public Builder setInitialBitrateEstimate(long initialBitrateEstimate) {
        }

        public Builder setResetOnNetworkTypeChange(boolean resetOnNetworkTypeChange) {
        }

        public Builder setSlidingWindowMaxWeight(int slidingWindowMaxWeight) {
        }

        public Builder setInitialBitrateEstimate(int networkType, long initialBitrateEstimate) {
        }

        public Builder setInitialBitrateEstimate(String countryCode) {
        }
    }

    @Deprecated
    public DefaultBandwidthMeter() {
    }

    private DefaultBandwidthMeter(@Nullable Context context, Map<Integer, Long> initialBitrateEstimates, int maxWeight, Clock clock, boolean resetOnNetworkTypeChange) {
    }
}
