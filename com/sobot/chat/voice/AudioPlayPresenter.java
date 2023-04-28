package com.sobot.chat.voice;

import android.content.Context;
import android.media.MediaPlayer;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.core.HttpUtils;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class AudioPlayPresenter {
    private AudioPlayCallBack mCallbak;
    private Context mContent;
    private ZhiChiMessageBase mCurrentMsg;

    /* renamed from: com.sobot.chat.voice.AudioPlayPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements HttpUtils.FileCallBack {
        public final /* synthetic */ AudioPlayPresenter this$0;
        public final /* synthetic */ ZhiChiMessageBase val$message;

        public AnonymousClass1(AudioPlayPresenter audioPlayPresenter, ZhiChiMessageBase zhiChiMessageBase) {
        }

        @Override // com.sobot.chat.core.HttpUtils.FileCallBack
        public void inProgress(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.FileCallBack
        public void onError(Exception exc, String str, int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.FileCallBack
        public void onResponse(File file) {
        }
    }

    /* renamed from: com.sobot.chat.voice.AudioPlayPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements MediaPlayer.OnPreparedListener {
        public final /* synthetic */ AudioPlayPresenter this$0;
        public final /* synthetic */ ZhiChiMessageBase val$message;

        public AnonymousClass2(AudioPlayPresenter audioPlayPresenter, ZhiChiMessageBase zhiChiMessageBase) {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
        }
    }

    /* renamed from: com.sobot.chat.voice.AudioPlayPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements MediaPlayer.OnCompletionListener {
        public final /* synthetic */ AudioPlayPresenter this$0;
        public final /* synthetic */ ZhiChiMessageBase val$message;

        public AnonymousClass3(AudioPlayPresenter audioPlayPresenter, ZhiChiMessageBase zhiChiMessageBase) {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
        }
    }

    public AudioPlayPresenter(Context context) {
    }

    public static /* synthetic */ void access$000(AudioPlayPresenter audioPlayPresenter, ZhiChiMessageBase zhiChiMessageBase, File file) {
    }

    public static /* synthetic */ AudioPlayCallBack access$100(AudioPlayPresenter audioPlayPresenter) {
    }

    public static /* synthetic */ ZhiChiMessageBase access$202(AudioPlayPresenter audioPlayPresenter, ZhiChiMessageBase zhiChiMessageBase) {
    }

    private void playVoice(ZhiChiMessageBase zhiChiMessageBase, File file) {
    }

    private void playVoiceByPath(ZhiChiMessageBase zhiChiMessageBase) {
    }

    public synchronized void clickAudio(ZhiChiMessageBase zhiChiMessageBase, AudioPlayCallBack audioPlayCallBack) {
    }
}
