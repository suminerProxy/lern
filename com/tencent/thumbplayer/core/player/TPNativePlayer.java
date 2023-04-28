package com.tencent.thumbplayer.core.player;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.tencent.thumbplayer.core.common.TPFieldCalledByNative;
import com.tencent.thumbplayer.core.common.TPMediaTrackInfo;
import com.tencent.thumbplayer.core.demuxer.ITPNativeDemuxerCallback;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPNativePlayer {
    private Context mContext;
    @TPFieldCalledByNative
    private long mNativeContext;
    private int m_playerID;

    public TPNativePlayer(Context context) {
    }

    private native int _addAudioTrackSource(String str, String str2);

    private native int _addInitConfigQueueInt(int i2, int i3);

    private native int _addInitConfigQueueString(int i2, String str);

    private native int _addSubtitleTrackSource(String str, String str2);

    private native int _applyInitConfig();

    private native int _createPlayer();

    private native int _deselectTrackAsync(int i2, long j2);

    private native long _getBufferedDurationMs();

    private native long _getBufferedSize();

    private native long _getCurrentPositionMs();

    private native long _getDemuxerOffsetInFile();

    private native long _getDurationMs();

    private native TPDynamicStatisticParams _getDynamicStatisticParams(boolean z);

    private native TPGeneralPlayFlowParams _getGeneralPlayFlowParams();

    private static native Object _getPlayerCoreParams(int i2);

    private native int _getPlayerID();

    private native int _getProgramCount();

    private native TPNativePlayerProgramInfo _getProgramInfo(int i2);

    private native long _getPropertyLong(int i2);

    private native String _getPropertyString(int i2);

    private native int _getTrackCount();

    private native TPNativePlayerHlsTag _getTrackHlsTag(int i2);

    private native boolean _getTrackIsExclusive(int i2);

    private native boolean _getTrackIsInternal(int i2);

    private native boolean _getTrackIsSelected(int i2);

    private native String _getTrackName(int i2);

    private native int _getTrackType(int i2);

    private native int _getVideoHeight();

    private native int _getVideoWidth();

    private native int _pause();

    private static native void _playerCoreNativeSetup();

    private native int _prepare();

    private native int _prepareAsync();

    private native int _release();

    private native int _reset();

    private native int _resetInitConfig();

    private native int _resume();

    private native int _seekToAsync(int i2, int i3, long j2);

    private native int _selectProgramAsync(int i2, long j2);

    private native int _selectTrackAsync(int i2, long j2);

    private native int _setAudioFrameCallback(Object obj);

    private native int _setAudioMute(boolean z);

    private native int _setAudioNormalizeVolumeParams(String str);

    private native int _setAudioVolume(float f2);

    private native int _setDataSource(String str);

    private native int _setDataSourceFd(int i2, long j2, long j3);

    private native int _setDataSourceWithHttpHeader(String str, Object[] objArr);

    private native int _setDemuxerCallback(Object obj);

    private native int _setEventRecordCallback(Object obj);

    private native int _setInitConfigBool(int i2, boolean z);

    private native int _setInitConfigFloat(int i2, float f2);

    private native int _setInitConfigInt(int i2, int i3);

    private native int _setInitConfigLong(int i2, long j2);

    private native int _setInitConfigObject(int i2, Object obj);

    private native int _setInitConfigString(int i2, String str);

    private native int _setLoopback(boolean z, long j2, long j3);

    private native int _setMessageCallback(Object obj);

    private native int _setOptionLong(int i2, long j2, long j3);

    private native int _setOptionObject(int i2, Object obj);

    private native int _setPlaybackRate(float f2);

    private native int _setPostProcessFrameCallback(Object obj);

    private native int _setSubtitleFrameCallback(Object obj);

    private native int _setVideoFrameCallback(Object obj);

    private native int _setVideoSurface(Surface surface);

    private native int _setVideoSurfaceWithType(Surface surface, int i2);

    private native int _start();

    private native int _stop();

    private native int _switchDefinitionAsync(String str, int i2, long j2);

    private native int _switchDefinitionAsyncWithHttpHeader(String str, Object[] objArr, int i2, long j2);

    public static void playerCoreNativeSetup(@NonNull Context context) {
    }

    public int addAudioTrackSource(String str, String str2) {
    }

    public int addSubtitleTrackSource(String str, String str2) {
    }

    public int deselectTrackAsync(int i2, long j2) {
    }

    public long getBufferedDurationMs() {
    }

    public long getBufferedSize() {
    }

    public long getCurrentPositionMs() {
    }

    public long getDemuxerOffsetInFile() {
    }

    public long getDurationMs() {
    }

    public TPDynamicStatisticParams getDynamicStatisticParams(boolean z) {
    }

    public TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
    }

    public Object getPlayerCoreParams(int i2) {
    }

    public int getPlayerID() {
    }

    public int getProgramCount() {
    }

    public TPNativePlayerProgramInfo[] getProgramInfo() {
    }

    public long getPropertyLong(int i2) {
    }

    public String getPropertyString(int i2) {
    }

    public TPMediaTrackInfo[] getTrackInfo() {
    }

    public int getVideoHeight() {
    }

    public int getVideoWidth() {
    }

    public int pause() {
    }

    public int prepare() {
    }

    public int prepareAsync() {
    }

    public void release() {
    }

    public void reset() {
    }

    public int seekToAsync(int i2, int i3, long j2) {
    }

    public int selectProgramAsync(int i2, long j2) {
    }

    public int selectTrackAsync(int i2, long j2) {
    }

    public int setAudioFrameCallback(ITPNativePlayerAudioFrameCallback iTPNativePlayerAudioFrameCallback) {
    }

    public int setAudioMute(boolean z) {
    }

    public int setAudioNormalizeVolumeParams(String str) {
    }

    public int setAudioVolume(float f2) {
    }

    public int setDataSource(int i2, long j2, long j3) {
    }

    public int setDataSource(String str) {
    }

    public int setDataSource(String str, Map<String, String> map) {
    }

    public int setDemuxerCallback(ITPNativeDemuxerCallback iTPNativeDemuxerCallback) {
    }

    public int setEventRecordCallback(ITPNativePlayerEventRecordCallback iTPNativePlayerEventRecordCallback) {
    }

    public void setInitConfig(TPNativePlayerInitConfig tPNativePlayerInitConfig) {
    }

    public int setLoopback(boolean z, long j2, long j3) {
    }

    public int setMessageCallback(ITPNativePlayerMessageCallback iTPNativePlayerMessageCallback) {
    }

    public int setOptionLong(int i2, long j2, long j3) {
    }

    public int setOptionObject(int i2, Object obj) {
    }

    public int setPlaybackRate(float f2) {
    }

    public int setPostProcessFrameCallback(ITPNativePlayerPostProcessFrameCallback iTPNativePlayerPostProcessFrameCallback) {
    }

    public int setSubtitleFrameCallback(ITPNativePlayerSubtitleFrameCallback iTPNativePlayerSubtitleFrameCallback) {
    }

    public int setVideoFrameCallback(ITPNativePlayerVideoFrameCallback iTPNativePlayerVideoFrameCallback) {
    }

    public int setVideoSurface(Surface surface) {
    }

    public int setVideoSurfaceWithType(Surface surface, int i2) {
    }

    public int start() {
    }

    public int stop() {
    }

    public int switchDefinitionAsync(String str, int i2, long j2) {
    }

    @Deprecated
    public int switchDefinitionAsync(String str, long j2) {
    }

    public int switchDefinitionAsync(String str, Map<String, String> map, int i2, long j2) {
    }
}
