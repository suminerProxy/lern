package com.tencent.thumbplayer.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPHeadsetPluginDetector {
    private static final int AUDIO_TYPE_BLUETOOTH_A2DP = 2;
    private static final int AUDIO_TYPE_BUILTIN_OTHERS = 99;
    private static final int AUDIO_TYPE_BUILTIN_SPEAKER = 0;
    private static final int AUDIO_TYPE_HEADPHONES = 1;
    private static final String TAG = "TPHeadsetPluginDetector";
    private static boolean hasRegisterReceiver;
    private static boolean isInitted;
    private static List<HeadsetPluginListener> listeners;
    private static WeakReference<Context> mContextRef;
    private static Set<Integer> mCurOutputs;
    private static BroadcastReceiver mReceiver;

    /* renamed from: com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 extends AudioDeviceCallback {
        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface HeadsetPluginListener {
        void onHeadsetPlugin(Set<Integer> set, Set<Integer> set2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class HeadsetPluginReceiver extends BroadcastReceiver {
        private HeadsetPluginReceiver() {
        }

        public /* synthetic */ HeadsetPluginReceiver(AnonymousClass1 anonymousClass1) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    public static /* synthetic */ Set access$000() {
    }

    public static /* synthetic */ Set access$100() {
    }

    public static /* synthetic */ void access$200(Set set, Set set2) {
    }

    public static void addHeadsetPluginListener(HeadsetPluginListener headsetPluginListener) {
    }

    public static void deinit() {
    }

    private static AudioManager getAudioManager() {
    }

    private static Set<Integer> getAudioOutputs() {
    }

    @TPMethodCalledByNative
    public static Set<Integer> getCurrentRoutes() {
    }

    public static void init(Context context) {
    }

    private static void initCurrentOutputs() {
    }

    @TPMethodCalledByNative
    public static boolean isAudioRouteTypeOn(int i2) {
    }

    @TPMethodCalledByNative
    public static boolean isBluetoothPlugin() {
    }

    @TPMethodCalledByNative
    public static boolean isHeadsetPlugin() {
    }

    private static void notifyAudioOutputStateChange(Set<Integer> set, Set<Integer> set2) {
    }

    @RequiresApi(api = 23)
    private static boolean registerDeviceCallback() {
    }

    private static void registerReceiver() {
    }

    public static void removeHeadsetPluginListener(HeadsetPluginListener headsetPluginListener) {
    }

    private static void unregisterReceiver() {
    }
}
