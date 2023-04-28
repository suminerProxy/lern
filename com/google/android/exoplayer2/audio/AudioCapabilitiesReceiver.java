package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AudioCapabilitiesReceiver {
    @Nullable
    public AudioCapabilities audioCapabilities;
    private final Context context;
    @Nullable
    private final ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver;
    private final Handler handler;
    private final Listener listener;
    @Nullable
    private final BroadcastReceiver receiver;
    private boolean registered;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ExternalSurroundSoundSettingObserver extends ContentObserver {
        private final ContentResolver resolver;
        private final Uri settingUri;
        public final /* synthetic */ AudioCapabilitiesReceiver this$0;

        public ExternalSurroundSoundSettingObserver(final AudioCapabilitiesReceiver this$0, Handler handler, ContentResolver resolver, Uri settingUri) {
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
        }

        public void register() {
        }

        public void unregister() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        public final /* synthetic */ AudioCapabilitiesReceiver this$0;

        private HdmiAudioPlugBroadcastReceiver(final AudioCapabilitiesReceiver this$0) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public /* synthetic */ HdmiAudioPlugBroadcastReceiver(AudioCapabilitiesReceiver audioCapabilitiesReceiver, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Listener {
        void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities);
    }

    public AudioCapabilitiesReceiver(Context context, Listener listener) {
    }

    public static /* synthetic */ void access$100(AudioCapabilitiesReceiver audioCapabilitiesReceiver, AudioCapabilities audioCapabilities) {
    }

    public static /* synthetic */ Context access$200(AudioCapabilitiesReceiver audioCapabilitiesReceiver) {
    }

    private void onNewAudioCapabilities(AudioCapabilities newAudioCapabilities) {
    }

    public AudioCapabilities register() {
    }

    public void unregister() {
    }
}
