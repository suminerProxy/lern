package com.tencent.liteav.audio;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface TXAudioEffectManager {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AudioMusicParam {
        public long endTimeMS;
        public int id;
        public boolean isShortFile;
        public int loopCount;
        public String path;
        public boolean publish;
        public long startTimeMS;

        public AudioMusicParam(int i2, String str) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface TXMusicPlayObserver {
        void onComplete(int i2, int i3);

        void onPlayProgress(int i2, long j2, long j3);

        void onStart(int i2, int i3);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class TXVoiceChangerType {
        private static final /* synthetic */ TXVoiceChangerType[] $VALUES = null;
        public static final TXVoiceChangerType TXLiveVoiceChangerType_0 = null;
        public static final TXVoiceChangerType TXLiveVoiceChangerType_1 = null;
        public static final TXVoiceChangerType TXLiveVoiceChangerType_10 = null;
        public static final TXVoiceChangerType TXLiveVoiceChangerType_11 = null;
        public static final TXVoiceChangerType TXLiveVoiceChangerType_2 = null;
        public static final TXVoiceChangerType TXLiveVoiceChangerType_3 = null;
        public static final TXVoiceChangerType TXLiveVoiceChangerType_4 = null;
        public static final TXVoiceChangerType TXLiveVoiceChangerType_5 = null;
        public static final TXVoiceChangerType TXLiveVoiceChangerType_6 = null;
        public static final TXVoiceChangerType TXLiveVoiceChangerType_7 = null;
        public static final TXVoiceChangerType TXLiveVoiceChangerType_8 = null;
        public static final TXVoiceChangerType TXLiveVoiceChangerType_9 = null;
        private int nativeValue;

        private TXVoiceChangerType(String str, int i2, int i3) {
        }

        public static TXVoiceChangerType valueOf(String str) {
        }

        public static TXVoiceChangerType[] values() {
        }

        public final int getNativeValue() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class TXVoiceReverbType {
        private static final /* synthetic */ TXVoiceReverbType[] $VALUES = null;
        public static final TXVoiceReverbType TXLiveVoiceReverbType_0 = null;
        public static final TXVoiceReverbType TXLiveVoiceReverbType_1 = null;
        public static final TXVoiceReverbType TXLiveVoiceReverbType_10 = null;
        public static final TXVoiceReverbType TXLiveVoiceReverbType_2 = null;
        public static final TXVoiceReverbType TXLiveVoiceReverbType_3 = null;
        public static final TXVoiceReverbType TXLiveVoiceReverbType_4 = null;
        public static final TXVoiceReverbType TXLiveVoiceReverbType_5 = null;
        public static final TXVoiceReverbType TXLiveVoiceReverbType_6 = null;
        public static final TXVoiceReverbType TXLiveVoiceReverbType_7 = null;
        public static final TXVoiceReverbType TXLiveVoiceReverbType_8 = null;
        public static final TXVoiceReverbType TXLiveVoiceReverbType_9 = null;
        private int nativeValue;

        private TXVoiceReverbType(String str, int i2, int i3) {
        }

        public static TXVoiceReverbType valueOf(String str) {
        }

        public static TXVoiceReverbType[] values() {
        }

        public final int getNativeValue() {
        }
    }

    void enableVoiceEarMonitor(boolean z);

    long getMusicCurrentPosInMS(int i2);

    long getMusicDurationInMS(String str);

    void pausePlayMusic(int i2);

    void resumePlayMusic(int i2);

    void seekMusicToPosInMS(int i2, int i3);

    void setAllMusicVolume(int i2);

    void setMusicObserver(int i2, TXMusicPlayObserver tXMusicPlayObserver);

    void setMusicPitch(int i2, float f2);

    void setMusicPlayoutVolume(int i2, int i3);

    void setMusicPublishVolume(int i2, int i3);

    void setMusicSpeedRate(int i2, float f2);

    void setVoiceCaptureVolume(int i2);

    void setVoiceChangerType(TXVoiceChangerType tXVoiceChangerType);

    void setVoiceEarMonitorVolume(int i2);

    void setVoicePitch(double d2);

    void setVoiceReverbType(TXVoiceReverbType tXVoiceReverbType);

    boolean startPlayMusic(AudioMusicParam audioMusicParam);

    void stopPlayMusic(int i2);
}
