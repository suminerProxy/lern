package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.audio.AudioAttributes;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AudioFocusManager {
    private static final int AUDIO_FOCUS_STATE_HAVE_FOCUS = 1;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT = 2;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT_DUCK = 3;
    private static final int AUDIO_FOCUS_STATE_NO_FOCUS = 0;
    public static final int PLAYER_COMMAND_DO_NOT_PLAY = -1;
    public static final int PLAYER_COMMAND_PLAY_WHEN_READY = 1;
    public static final int PLAYER_COMMAND_WAIT_FOR_CALLBACK = 0;
    private static final String TAG = "AudioFocusManager";
    private static final float VOLUME_MULTIPLIER_DEFAULT = 1.0f;
    private static final float VOLUME_MULTIPLIER_DUCK = 0.2f;
    @Nullable
    private AudioAttributes audioAttributes;
    private AudioFocusRequest audioFocusRequest;
    private int audioFocusState;
    private final AudioManager audioManager;
    private int focusGainToRequest;
    private final AudioFocusListener focusListener;
    @Nullable
    private PlayerControl playerControl;
    private boolean rebuildAudioFocusRequest;
    private float volumeMultiplier;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AudioFocusListener implements AudioManager.OnAudioFocusChangeListener {
        private final Handler eventHandler;
        public final /* synthetic */ AudioFocusManager this$0;

        public AudioFocusListener(final AudioFocusManager this$0, Handler eventHandler) {
        }

        private /* synthetic */ void a(int i2) {
        }

        public /* synthetic */ void b(int i2) {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface PlayerCommand {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface PlayerControl {
        void executePlayerCommand(int playerCommand);

        void setVolumeMultiplier(float volumeMultiplier);
    }

    public AudioFocusManager(Context context, Handler eventHandler, PlayerControl playerControl) {
    }

    private void abandonAudioFocusDefault() {
    }

    private void abandonAudioFocusIfHeld() {
    }

    @RequiresApi(26)
    private void abandonAudioFocusV26() {
    }

    public static /* synthetic */ void access$000(AudioFocusManager audioFocusManager, int i2) {
    }

    private static int convertAudioAttributesToFocusGain(@Nullable AudioAttributes audioAttributes) {
    }

    private void executePlayerCommand(int playerCommand) {
    }

    private void handlePlatformAudioFocusChange(int focusChange) {
    }

    private int requestAudioFocus() {
    }

    private int requestAudioFocusDefault() {
    }

    @RequiresApi(26)
    private int requestAudioFocusV26() {
    }

    private void setAudioFocusState(int audioFocusState) {
    }

    private boolean shouldAbandonAudioFocusIfHeld(int playbackState) {
    }

    private boolean willPauseWhenDucked() {
    }

    @VisibleForTesting
    public AudioManager.OnAudioFocusChangeListener getFocusListener() {
    }

    public float getVolumeMultiplier() {
    }

    public void release() {
    }

    public void setAudioAttributes(@Nullable AudioAttributes audioAttributes) {
    }

    public int updateAudioFocus(boolean playWhenReady, int playbackState) {
    }
}
