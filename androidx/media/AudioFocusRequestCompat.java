package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AudioFocusRequestCompat {
    public static final AudioAttributesCompat FOCUS_DEFAULT_ATTR = null;
    private final AudioAttributesCompat mAudioAttributesCompat;
    private final Handler mFocusChangeHandler;
    private final int mFocusGain;
    private final Object mFrameworkAudioFocusRequest;
    private final AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener;
    private final boolean mPauseOnDuck;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder {
        private AudioAttributesCompat mAudioAttributesCompat;
        private Handler mFocusChangeHandler;
        private int mFocusGain;
        private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener;
        private boolean mPauseOnDuck;

        public Builder(int focusGain) {
        }

        private static boolean isValidFocusGain(int focusGain) {
        }

        public AudioFocusRequestCompat build() {
        }

        @NonNull
        public Builder setAudioAttributes(@NonNull AudioAttributesCompat attributes) {
        }

        @NonNull
        public Builder setFocusGain(int focusGain) {
        }

        @NonNull
        public Builder setOnAudioFocusChangeListener(@NonNull AudioManager.OnAudioFocusChangeListener listener) {
        }

        @NonNull
        public Builder setWillPauseWhenDucked(boolean pauseOnDuck) {
        }

        @NonNull
        public Builder setOnAudioFocusChangeListener(@NonNull AudioManager.OnAudioFocusChangeListener listener, @NonNull Handler handler) {
        }

        public Builder(@NonNull AudioFocusRequestCompat requestToCopy) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class OnAudioFocusChangeListenerHandlerCompat implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {
        private static final int FOCUS_CHANGE = 2782386;
        private final Handler mHandler;
        private final AudioManager.OnAudioFocusChangeListener mListener;

        public OnAudioFocusChangeListenerHandlerCompat(@NonNull AudioManager.OnAudioFocusChangeListener listener, @NonNull Handler handler) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int focusChange) {
        }
    }

    public AudioFocusRequestCompat(int focusGain, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler focusChangeHandler, AudioAttributesCompat audioFocusRequestCompat, boolean pauseOnDuck) {
    }

    public boolean equals(Object o2) {
    }

    @RequiresApi(21)
    public AudioAttributes getAudioAttributes() {
    }

    @NonNull
    public AudioAttributesCompat getAudioAttributesCompat() {
    }

    @RequiresApi(26)
    public AudioFocusRequest getAudioFocusRequest() {
    }

    @NonNull
    public Handler getFocusChangeHandler() {
    }

    public int getFocusGain() {
    }

    @NonNull
    public AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeListener() {
    }

    public int hashCode() {
    }

    public boolean willPauseWhenDucked() {
    }
}
