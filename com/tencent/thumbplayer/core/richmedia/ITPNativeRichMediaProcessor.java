package com.tencent.thumbplayer.core.richmedia;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITPNativeRichMediaProcessor {
    void deselectFeatureAsync(int i2);

    TPNativeRichMediaFeatureData getCurrentPositionMsFeatureData(long j2, int[] iArr);

    TPNativeRichMediaFeature[] getFeatures();

    void prepareAsync();

    void release();

    void reset();

    void seek(long j2);

    void selectFeatureAsync(int i2, TPNativeRichMediaRequestExtraInfo tPNativeRichMediaRequestExtraInfo);

    void setInnerProcessorCallback(ITPNativeRichMediaInnerProcessorCallback iTPNativeRichMediaInnerProcessorCallback);

    void setPlaybackRate(float f2);

    void setProcessorCallback(ITPNativeRichMediaProcessorCallback iTPNativeRichMediaProcessorCallback);

    void setRichMediaSource(String str);
}
