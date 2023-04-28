package com.tencent.live2;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.live2.V2TXLiveDef;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class V2TXLivePusherObserver {
    public void onCaptureFirstAudioFrame() {
    }

    public void onCaptureFirstVideoFrame() {
    }

    public void onError(int i2, String str, Bundle bundle) {
    }

    public void onGLContextCreated() {
    }

    public void onGLContextDestroyed() {
    }

    public void onMicrophoneVolumeUpdate(int i2) {
    }

    public int onProcessVideoFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame, V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame2) {
    }

    public void onPushStatusUpdate(V2TXLiveDef.V2TXLivePushStatus v2TXLivePushStatus, String str, Bundle bundle) {
    }

    public void onSetMixTranscodingConfig(int i2, String str) {
    }

    public void onSnapshotComplete(Bitmap bitmap) {
    }

    public void onStatisticsUpdate(V2TXLiveDef.V2TXLivePusherStatistics v2TXLivePusherStatistics) {
    }

    public void onWarning(int i2, String str, Bundle bundle) {
    }
}
