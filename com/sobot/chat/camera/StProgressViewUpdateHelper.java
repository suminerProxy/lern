package com.sobot.chat.camera;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class StProgressViewUpdateHelper extends Handler {
    private static final int CMD_REFRESH_PROGRESS_VIEWS = 1;
    private static final int MIN_INTERVAL = 20;
    private static final int UPDATE_INTERVAL_PAUSED = 500;
    private static final int UPDATE_INTERVAL_PLAYING = 1000;
    private Callback callback;
    private int intervalPaused;
    private int intervalPlaying;
    private Context mContext;
    private MediaPlayer mMediaPlayer;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface Callback {
        void onUpdateProgressViews(int i2, int i3);
    }

    public StProgressViewUpdateHelper(MediaPlayer mediaPlayer, Context context, Callback callback) {
    }

    private void queueNextRefresh(long j2) {
    }

    private int refreshProgressViews() {
    }

    @Override // android.os.Handler
    public void handleMessage(@NonNull Message message) {
    }

    public void start() {
    }

    public void stop() {
    }

    public StProgressViewUpdateHelper(MediaPlayer mediaPlayer, Callback callback, int i2, int i3) {
    }
}
