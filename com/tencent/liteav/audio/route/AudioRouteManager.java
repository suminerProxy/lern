package com.tencent.liteav.audio.route;

import android.media.AudioManager;
import com.tencent.liteav.audio.route.b;
import com.tencent.liteav.audio.route.m;
import com.tencent.liteav.audio.route.n;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::audio")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class AudioRouteManager extends n.a {
    private static final int BLUETOOTH_SCO_RECONNECT_INTERVAL = 1000;
    private static final long IN_CALL_DETECTION_TIME = 500;
    private static final String TAG = "AudioRouteManager";
    private final AudioManager mAudioManager;
    private final l mAudioRouteSupervisor;
    private final n mBroadcastReceiver;
    private a mCurrentAudioIOScene;
    private String mCurrentRouteConfig;
    private b.a mCurrentRouteType;
    private a mExpectedAudioIOScene;
    private final Runnable mForceUpdateRouteRunnable;
    private com.tencent.liteav.base.util.b mHandler;
    private boolean mIsServiceStarted;
    private final long mNativeAudioRouteManager;
    private m.a mSwitcher;
    private m.a.InterfaceC0190a mSwitcherListener;

    /* renamed from: com.tencent.liteav.audio.route.AudioRouteManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements m.a.InterfaceC0190a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AudioRouteManager f11377a;

        public AnonymousClass1(AudioRouteManager audioRouteManager) {
        }

        @Override // com.tencent.liteav.audio.route.m.a.InterfaceC0190a
        public final void a(b.a aVar) {
        }

        @Override // com.tencent.liteav.audio.route.m.a.InterfaceC0190a
        public final void b(b.a aVar) {
        }
    }

    @CalledByNative
    public AudioRouteManager(long j2) {
    }

    public static /* synthetic */ long access$000(AudioRouteManager audioRouteManager) {
    }

    public static /* synthetic */ void access$100(long j2, int i2) {
    }

    public static /* synthetic */ l access$200(AudioRouteManager audioRouteManager) {
    }

    public static /* synthetic */ void access$300(AudioRouteManager audioRouteManager, boolean z) {
    }

    public static /* synthetic */ void access$lambda$0(AudioRouteManager audioRouteManager) {
    }

    public static /* synthetic */ void access$lambda$1(AudioRouteManager audioRouteManager) {
    }

    private void autoCheckRouteUpdate(boolean z) {
    }

    private void destroySwitcher() {
    }

    private void handleBluetoothHeadsetChangedInternal(boolean z) {
    }

    private void handleBluetoothSCOChangedInternal(boolean z) {
    }

    private void handleWiredHeadsetChangedInternal(boolean z) {
    }

    public static /* synthetic */ void lambda$new$0(AudioRouteManager audioRouteManager) {
    }

    public static /* synthetic */ void lambda$notifyAudioIOSceneChanged$2(AudioRouteManager audioRouteManager, int i2) {
    }

    public static /* synthetic */ void lambda$onBluetoothConnectionChanged$5(AudioRouteManager audioRouteManager, boolean z) {
    }

    public static /* synthetic */ void lambda$onBluetoothSCOConnected$6(AudioRouteManager audioRouteManager, boolean z) {
    }

    public static /* synthetic */ void lambda$onWiredHeadsetConnectionChanged$4(AudioRouteManager audioRouteManager, boolean z) {
    }

    public static /* synthetic */ void lambda$setHandFreeModeEnabled$3(AudioRouteManager audioRouteManager, boolean z) {
    }

    public static /* synthetic */ void lambda$start$1(AudioRouteManager audioRouteManager, String str) {
    }

    private static native void nativeNotifyAudioRouteChangedFromJava(long j2, int i2);

    private void notifyAudioIOSceneChangedInternal() {
    }

    private void removeCallbacksOnWorkThread(Runnable runnable) {
    }

    private void runOnWorkThread(Runnable runnable) {
    }

    private void runOnWorkThreadAndWaitDone(Runnable runnable, long j2) {
    }

    private void setHandFreeModeEnabledInternal(boolean z) {
    }

    private void startInternal(String str) {
    }

    private void stopInternal() {
    }

    private void updateAudioRouteStatus() {
    }

    @CalledByNative
    public void initialize() {
    }

    @CalledByNative
    public void notifyAudioIOSceneChanged(int i2, long j2) {
    }

    @Override // com.tencent.liteav.audio.route.n.a
    public void onBluetoothConnectionChanged(boolean z) {
    }

    @Override // com.tencent.liteav.audio.route.n.a
    public void onBluetoothSCOConnected(boolean z) {
    }

    @Override // com.tencent.liteav.audio.route.n.a
    public void onWiredHeadsetConnectionChanged(boolean z) {
    }

    @CalledByNative
    public void setHandFreeModeEnabled(boolean z) {
    }

    @CalledByNative
    public void start(String str) {
    }

    @CalledByNative
    public void stop() {
    }

    @CalledByNative
    public void uninitialize() {
    }

    private void runOnWorkThread(Runnable runnable, long j2) {
    }
}
