package com.tencent.thumbplayer.core.richmedia;

import android.content.Context;
import com.tencent.thumbplayer.core.common.TPFieldCalledByNative;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPNativeRichMediaProcessor implements ITPNativeRichMediaProcessor {
    @TPFieldCalledByNative
    private long mNativeContext;

    public TPNativeRichMediaProcessor(Context context) {
    }

    private native int _deselectFeatureAsync(int i2);

    private native int _getCurrentPositionMsFeatureData(long j2, int[] iArr, TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData);

    private native TPNativeRichMediaFeature[] _getFeatures();

    private native void _nativeSetup();

    private native int _prepareAsync();

    private native void _release();

    private native int _reset();

    private native int _seek(long j2);

    private native int _selectFeatureAsync(int i2, TPNativeRichMediaRequestExtraInfo tPNativeRichMediaRequestExtraInfo);

    private native void _setInnerProcessorCallback(ITPNativeRichMediaInnerProcessorCallback iTPNativeRichMediaInnerProcessorCallback);

    private native int _setPlaybackRate(float f2);

    private native void _setProcessorCallback(ITPNativeRichMediaProcessorCallback iTPNativeRichMediaProcessorCallback);

    private native int _setRichMediaSource(String str);

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void deselectFeatureAsync(int i2) {
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public TPNativeRichMediaFeatureData getCurrentPositionMsFeatureData(long j2, int[] iArr) {
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public TPNativeRichMediaFeature[] getFeatures() {
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void prepareAsync() {
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void release() {
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void reset() {
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void seek(long j2) {
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void selectFeatureAsync(int i2, TPNativeRichMediaRequestExtraInfo tPNativeRichMediaRequestExtraInfo) {
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void setInnerProcessorCallback(ITPNativeRichMediaInnerProcessorCallback iTPNativeRichMediaInnerProcessorCallback) {
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void setPlaybackRate(float f2) {
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void setProcessorCallback(ITPNativeRichMediaProcessorCallback iTPNativeRichMediaProcessorCallback) {
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void setRichMediaSource(String str) {
    }
}
