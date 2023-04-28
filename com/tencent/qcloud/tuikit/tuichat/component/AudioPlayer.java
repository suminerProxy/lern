package com.tencent.qcloud.tuikit.tuichat.component;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Handler;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class AudioPlayer {
    private static String CURRENT_RECORD_FILE = null;
    private static int MAGIC_NUMBER = 0;
    private static int MIN_RECORD_DURATION = 0;
    private static final String TAG = "AudioPlayer";
    private static AudioPlayer sInstance;
    private String mAudioRecordPath;
    private Handler mHandler;
    private Callback mPlayCallback;
    private MediaPlayer mPlayer;
    private Callback mRecordCallback;
    private MediaRecorder mRecorder;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.AudioPlayer$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ AudioPlayer this$0;

        public AnonymousClass1(AudioPlayer audioPlayer) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.AudioPlayer$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements MediaPlayer.OnCompletionListener {
        public final /* synthetic */ AudioPlayer this$0;

        public AnonymousClass2(AudioPlayer audioPlayer) {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface Callback {
        void onCompletion(Boolean bool);
    }

    private AudioPlayer() {
    }

    public static /* synthetic */ void access$000(AudioPlayer audioPlayer) {
    }

    public static /* synthetic */ void access$100(AudioPlayer audioPlayer, boolean z) {
    }

    public static /* synthetic */ Callback access$202(AudioPlayer audioPlayer, Callback callback) {
    }

    public static /* synthetic */ void access$300(AudioPlayer audioPlayer) {
    }

    public static /* synthetic */ void access$400(AudioPlayer audioPlayer, boolean z) {
    }

    public static AudioPlayer getInstance() {
    }

    private void onPlayCompleted(boolean z) {
    }

    private void onRecordCompleted(boolean z) {
    }

    private void stopInternalPlay() {
    }

    private void stopInternalRecord() {
    }

    public int getDuration() {
    }

    public String getPath() {
    }

    public boolean isPlaying() {
    }

    public void startPlay(String str, Callback callback) {
    }

    public void startRecord(Callback callback) {
    }

    public void stopPlay() {
    }

    public void stopRecord() {
    }
}
