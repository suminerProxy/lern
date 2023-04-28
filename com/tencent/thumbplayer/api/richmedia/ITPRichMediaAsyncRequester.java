package com.tencent.thumbplayer.api.richmedia;

import com.tencent.thumbplayer.api.TPTimeRange;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITPRichMediaAsyncRequester {
    void cancelRequest(int i2);

    TPRichMediaFeature[] getFeatures();

    void prepareAsync();

    void release();

    int requestFeatureDataAsyncAtTimeMs(int i2, long j2);

    int requestFeatureDataAsyncAtTimeMsArray(int i2, long[] jArr);

    int requestFeatureDataAsyncAtTimeRange(int i2, TPTimeRange tPTimeRange);

    int requestFeatureDataAsyncAtTimeRanges(int i2, TPTimeRange[] tPTimeRangeArr);

    void setRequesterListener(ITPRichMediaAsyncRequesterListener iTPRichMediaAsyncRequesterListener);

    void setRichMediaSource(String str);
}
