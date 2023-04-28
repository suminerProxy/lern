package com.tencent.live2;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.live2.V2TXLiveDef;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class V2TXLivePlayerObserver {
    public void onAudioLoading(V2TXLivePlayer v2TXLivePlayer, Bundle bundle) {
    }

    public void onAudioPlaying(V2TXLivePlayer v2TXLivePlayer, boolean z, Bundle bundle) {
    }

    public void onConnected(V2TXLivePlayer v2TXLivePlayer, Bundle bundle) {
    }

    public void onError(V2TXLivePlayer v2TXLivePlayer, int i2, String str, Bundle bundle) {
    }

    public void onPlayoutVolumeUpdate(V2TXLivePlayer v2TXLivePlayer, int i2) {
    }

    public void onReceiveSeiMessage(V2TXLivePlayer v2TXLivePlayer, int i2, byte[] bArr) {
    }

    public void onRenderVideoFrame(V2TXLivePlayer v2TXLivePlayer, V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
    }

    public void onSnapshotComplete(V2TXLivePlayer v2TXLivePlayer, Bitmap bitmap) {
    }

    public void onStatisticsUpdate(V2TXLivePlayer v2TXLivePlayer, V2TXLiveDef.V2TXLivePlayerStatistics v2TXLivePlayerStatistics) {
    }

    public void onVideoLoading(V2TXLivePlayer v2TXLivePlayer, Bundle bundle) {
    }

    public void onVideoPlaying(V2TXLivePlayer v2TXLivePlayer, boolean z, Bundle bundle) {
    }

    public void onVideoResolutionChanged(V2TXLivePlayer v2TXLivePlayer, int i2, int i3) {
    }

    public void onWarning(V2TXLivePlayer v2TXLivePlayer, int i2, String str, Bundle bundle) {
    }
}
