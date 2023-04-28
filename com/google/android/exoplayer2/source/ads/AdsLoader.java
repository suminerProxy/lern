package com.google.android.exoplayer2.source.ads;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface AdsLoader {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface EventListener {
        void onAdClicked();

        void onAdLoadError(AdsMediaSource.AdLoadException error, DataSpec dataSpec);

        void onAdPlaybackState(AdPlaybackState adPlaybackState);

        void onAdTapped();
    }

    void handlePrepareComplete(AdsMediaSource adsMediaSource, int adGroupIndex, int adIndexInAdGroup);

    void handlePrepareError(AdsMediaSource adsMediaSource, int adGroupIndex, int adIndexInAdGroup, IOException exception);

    void release();

    void setPlayer(@Nullable Player player);

    void setSupportedContentTypes(int... contentTypes);

    void start(AdsMediaSource adsMediaSource, DataSpec adTagDataSpec, Object adsId, AdViewProvider adViewProvider, EventListener eventListener);

    void stop(AdsMediaSource adsMediaSource, EventListener eventListener);
}
