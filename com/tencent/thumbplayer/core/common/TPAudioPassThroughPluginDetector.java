package com.tencent.thumbplayer.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPAudioPassThroughPluginDetector {
    private static final int DEFAULT_MAX_CHANNEL_COUNT = 8;
    private static final String TAG = "TPAudioPassThroughPluginDetector";
    private static boolean hasRegisterReceiver;
    private static boolean isInitted;
    private static List<AudioPassThroughPluginListener> listeners;
    private static TPAudioPassThroughCapabilities mAudioPassThroughCapabilities;
    private static WeakReference<Context> mContextRef;
    private static Handler mHandler;
    private static boolean mIsAudioPassThroughPlugin;
    private static BroadcastReceiver mReceiver;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface AudioPassThroughPluginListener {
        void onAudioPassThroughPlugin(boolean z);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        private HdmiAudioPlugBroadcastReceiver() {
        }

        public /* synthetic */ HdmiAudioPlugBroadcastReceiver(AnonymousClass1 anonymousClass1) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    public static /* synthetic */ void access$100(TPAudioPassThroughCapabilities tPAudioPassThroughCapabilities) {
    }

    public static /* synthetic */ void access$200(boolean z) {
    }

    public static void addListener(AudioPassThroughPluginListener audioPassThroughPluginListener) {
    }

    public static void deinit() {
    }

    private static Looper getLooper() {
    }

    public static void init(Context context) {
    }

    public static boolean isAudioPassThroughPlugin() {
    }

    public static boolean isAudioPassThroughSupport(int i2, int i3) {
    }

    private static void notifyAudioPassThroughStateChange(boolean z) {
    }

    private static void onUpdateAudioCapabilities(TPAudioPassThroughCapabilities tPAudioPassThroughCapabilities) {
    }

    private static void registerReceiver() {
    }

    public static void removeListener(AudioPassThroughPluginListener audioPassThroughPluginListener) {
    }

    private static void unregisterReceiver() {
    }
}
