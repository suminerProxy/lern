package com.tencent.liteav.audio;

import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.util.List;

@JNINamespace("liteav::manager")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXAudioEffectManagerImpl implements TXAudioEffectManager {
    private static final int EFFECT_PLAYER_ID_TYPE = 2;
    private static final String TAG = "TXAudioEffectManagerImpl";
    private List<Integer> mEffectIdList;
    private long mNativeAudioEffectMgr;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AudioBgmParams {
        private TXAudioEffectManager.AudioMusicParam mParams;

        public AudioBgmParams(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
        }

        @CalledByNative("AudioBgmParams")
        public long getEndTimeMS() {
        }

        @CalledByNative("AudioBgmParams")
        public int getLoopCount() {
        }

        @CalledByNative("AudioBgmParams")
        public String getPath() {
        }

        @CalledByNative("AudioBgmParams")
        public long getStartTimeMS() {
        }

        @CalledByNative("AudioBgmParams")
        public boolean isPublish() {
        }

        @CalledByNative("AudioBgmParams")
        public boolean isShortFile() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class MusicPlayObserver {
        private TXAudioEffectManager.TXMusicPlayObserver mListener;

        public MusicPlayObserver(TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
        }

        @CalledByNative("MusicPlayObserver")
        public void onComplete(long j2, int i2) {
        }

        @CalledByNative("MusicPlayObserver")
        public void onPlayProgress(long j2, long j3, long j4) {
        }

        @CalledByNative("MusicPlayObserver")
        public void onStart(long j2, int i2) {
        }
    }

    public TXAudioEffectManagerImpl(long j2) {
    }

    private static long convertToEffectId(int i2) {
    }

    private static native void nativeDestroy(long j2);

    private static native void nativeEnableAudioEarMonitoring(long j2, boolean z);

    private static native long nativeGetMusicCurrentPosInMS(long j2, long j3);

    private static native long nativeGetMusicDurationInMS(long j2, String str);

    private static native void nativePausePlayMusic(long j2, long j3);

    private static native void nativeResumePlayMusic(long j2, long j3);

    private static native void nativeSeekMusicToPosInMS(long j2, long j3, long j4);

    private static native void nativeSetAllMusicVolume(long j2, int i2);

    private static native void nativeSetAudioEarMonitoringVolume(long j2, int i2);

    private static native void nativeSetMusicObserver(long j2, long j3, MusicPlayObserver musicPlayObserver);

    private static native void nativeSetMusicPitch(long j2, long j3, float f2);

    private static native void nativeSetMusicPlayoutVolume(long j2, long j3, int i2);

    private static native void nativeSetMusicPublishVolume(long j2, long j3, int i2);

    private static native void nativeSetMusicSpeedRate(long j2, long j3, float f2);

    private static native void nativeSetVoiceCaptureVolume(long j2, int i2);

    private static native void nativeSetVoiceChangerType(long j2, int i2);

    private static native void nativeSetVoicePitch(long j2, double d2);

    private static native void nativeSetVoiceReverbType(long j2, int i2);

    private static native void nativeStartPlayMusic(long j2, long j3, AudioBgmParams audioBgmParams);

    private static native void nativeStopPlayMusic(long j2, long j3);

    public static TXAudioEffectManager.TXVoiceChangerType voiceChangerTypeFromInt(int i2) {
    }

    public static TXAudioEffectManager.TXVoiceReverbType voiceReverbTypeFromInt(int i2) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void enableVoiceEarMonitor(boolean z) {
    }

    public void finalize() throws Throwable {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public long getMusicCurrentPosInMS(int i2) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public long getMusicDurationInMS(String str) {
    }

    public void pauseAudioEffect(int i2) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void pausePlayMusic(int i2) {
    }

    public void playAudioEffect(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
    }

    public void resumeAudioEffect(int i2) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void resumePlayMusic(int i2) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void seekMusicToPosInMS(int i2, int i3) {
    }

    public void setAllAudioEffectsVolume(int i2) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setAllMusicVolume(int i2) {
    }

    public void setAudioEffectVolume(int i2, int i3) {
    }

    public void setEffectObserver(int i2, TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicObserver(int i2, TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPitch(int i2, float f2) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPlayoutVolume(int i2, int i3) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPublishVolume(int i2, int i3) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicSpeedRate(int i2, float f2) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceCaptureVolume(int i2) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceChangerType(TXAudioEffectManager.TXVoiceChangerType tXVoiceChangerType) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceEarMonitorVolume(int i2) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoicePitch(double d2) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceReverbType(TXAudioEffectManager.TXVoiceReverbType tXVoiceReverbType) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public boolean startPlayMusic(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
    }

    public void stopAllAudioEffects() {
    }

    public void stopAudioEffect(int i2) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void stopPlayMusic(int i2) {
    }
}
