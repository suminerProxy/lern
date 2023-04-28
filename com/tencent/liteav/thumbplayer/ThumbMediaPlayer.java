package com.tencent.liteav.thumbplayer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.PowerManager;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.liteav.txcplayer.a;
import com.tencent.liteav.txcplayer.b;
import com.tencent.liteav.txcplayer.c;
import com.tencent.liteav.txcplayer.e;
import com.tencent.thumbplayer.api.ITPModuleLoader;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.thumbplayer.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.api.TPTrackInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset;
import com.tencent.thumbplayer.api.report.TPDefaultReportInfo;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ThumbMediaPlayer extends a implements b {
    private static final String THUMB_PLAYER_GUID = "liteav_tbplayer_android_";
    private static final int THUMB_PLAYER_PLATFORM_ID = 2330303;
    private static volatile boolean mSDKInited;
    private final String TAG;
    private long mBitrate;
    private int mBitrateIndex;
    private long mCachedBytes;
    private e mConfig;
    private String mDataSource;
    private boolean mEnableAccurateSeek;
    private boolean mHasReceiveFirstVideoRenderEvent;
    private boolean mIsLooping;
    private Map<String, Object> mPrivateConfig;
    private float mRate;
    private boolean mReuseSurfaceTexture;
    private boolean mScreenOnWhilePlaying;
    private Surface mSurface;
    private SurfaceHolder mSurfaceHolder;
    private SurfaceTexture mSurfaceTexture;
    private c mSurfaceTextureHost;
    private volatile ITPPlayer mTPPPlayer;
    private long mTcpSpeed;
    private long mTotalFileSize;
    private Object mTrtcCloud;
    private PowerManager.WakeLock mWakeLock;

    /* renamed from: com.tencent.liteav.thumbplayer.ThumbMediaPlayer$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements ITPModuleLoader {
        public final /* synthetic */ ThumbMediaPlayer this$0;

        public AnonymousClass1(ThumbMediaPlayer thumbMediaPlayer) {
        }

        @Override // com.tencent.thumbplayer.api.ITPModuleLoader
        public void loadLibrary(String str, String str2) {
        }
    }

    /* renamed from: com.tencent.liteav.thumbplayer.ThumbMediaPlayer$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends TPDefaultReportInfo {
        public final /* synthetic */ ThumbMediaPlayer this$0;

        public AnonymousClass2(ThumbMediaPlayer thumbMediaPlayer) {
        }

        @Override // com.tencent.thumbplayer.api.report.TPDefaultReportInfo
        public int getPlayType() {
        }
    }

    /* renamed from: com.tencent.liteav.thumbplayer.ThumbMediaPlayer$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ ThumbMediaPlayer this$0;

        public AnonymousClass3(ThumbMediaPlayer thumbMediaPlayer) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.liteav.thumbplayer.ThumbMediaPlayer$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ ThumbMediaPlayer this$0;

        public AnonymousClass4(ThumbMediaPlayer thumbMediaPlayer) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.liteav.thumbplayer.ThumbMediaPlayer$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements com.tencent.liteav.txcplayer.c.b {
        public final /* synthetic */ ThumbMediaPlayer this$0;
        public final /* synthetic */ TPTrackInfo val$tPTrackInfo;

        public AnonymousClass5(ThumbMediaPlayer thumbMediaPlayer, TPTrackInfo tPTrackInfo) {
        }

        public com.tencent.liteav.txcplayer.c.a getFormat() {
        }

        public String getInfoInline() {
        }

        public String getLanguage() {
        }

        public int getTrackType() {
        }
    }

    /* renamed from: com.tencent.liteav.thumbplayer.ThumbMediaPlayer$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements ITPPlayerListener.IOnAudioFrameOutputListener {
        public final /* synthetic */ ThumbMediaPlayer this$0;

        public AnonymousClass6(ThumbMediaPlayer thumbMediaPlayer) {
        }

        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioFrameOutputListener
        public void onAudioFrameOut(ITPPlayer iTPPlayer, TPAudioFrameBuffer tPAudioFrameBuffer) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TRTCCloudClassInvokeHelper {
        private static final String TAG = "com.tencent.liteav.thumbplayer.ThumbMediaPlayer$TRTCCloudClassInvokeHelper";
        private static TRTCCloudClassInvokeHelper mInstance;
        private Class mClazzTRTCAudioFrame;
        private Class mClazzTRTCCloud;
        private Field mFieldChannel;
        private Field mFieldData;
        private Field mFieldSampleRate;
        private Method mMethodMixExternalAudioFrame;

        private TRTCCloudClassInvokeHelper(Object obj) {
        }

        public static /* synthetic */ TRTCCloudClassInvokeHelper access$102(TRTCCloudClassInvokeHelper tRTCCloudClassInvokeHelper) {
        }

        public static /* synthetic */ TRTCCloudClassInvokeHelper access$400(Object obj) {
        }

        public static /* synthetic */ void access$500(TRTCCloudClassInvokeHelper tRTCCloudClassInvokeHelper, Object obj, TPAudioFrameBuffer tPAudioFrameBuffer) {
        }

        private static TRTCCloudClassInvokeHelper getInstance(Object obj) {
        }

        private void mixExternalAudioFrame(Object obj, TPAudioFrameBuffer tPAudioFrameBuffer) {
        }
    }

    public ThumbMediaPlayer(Context context) {
    }

    public static /* synthetic */ ITPPlayer access$000(ThumbMediaPlayer thumbMediaPlayer) {
    }

    public static /* synthetic */ String access$200(ThumbMediaPlayer thumbMediaPlayer) {
    }

    public static /* synthetic */ Object access$300(ThumbMediaPlayer thumbMediaPlayer) {
    }

    public static String genFieldID(String str) {
    }

    private ITPMediaDRMAsset handleDRMAsset(String str) {
    }

    private static String processUrl(String str) {
    }

    private void setCustomReportData() {
    }

    private void setEnableMixExternalAudioFrame() {
    }

    private void setSurfaceToPlayer(Surface surface) {
    }

    private void setTPPLibCustomLoader() {
    }

    private void setTPSystemInfo() {
    }

    private void setVideoInfo(String str) {
    }

    private com.tencent.liteav.txcplayer.c.b transferToITrackInfo(TPTrackInfo tPTrackInfo) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void attachTRTC(Object obj) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void detachTRTC() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void enableAdaptiveBitrate() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public int getBitrateIndex() {
    }

    public e getConfig() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public long getCurrentPosition() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public long getDuration() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public com.tencent.liteav.txcplayer.d.b getMediaInfo() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public long getPlayableDurationMs() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public long getPropertyLong(int i2) throws IllegalStateException {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public float getRate() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public ArrayList<com.tencent.liteav.txcplayer.d.a> getSupportedBitrates() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public Surface getSurface() {
    }

    @Override // com.tencent.liteav.txcplayer.b
    public SurfaceTexture getSurfaceTexture() {
    }

    public ITPPlayer getTPPPlayer() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public com.tencent.liteav.txcplayer.c.b[] getTrackInfo() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public int getVideoHeight() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public int getVideoSarDen() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public int getVideoSarNum() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public int getVideoWidth() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public boolean isLooping() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public boolean isPlayable() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public boolean isPlaying() {
    }

    public void onReceiveFirstVideoRenderEvent() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void pause() throws IllegalStateException {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void prepareAsync() throws IllegalStateException {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void publishAudioToNetwork() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void release() {
    }

    public void releaseSurfaceTexture() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void reset() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void seekTo(long j2) throws IllegalStateException {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setAudioStreamType(int i2) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setAudioVolume(int i2) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setBitrateIndex(int i2) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setConfig(e eVar) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setDataSource(Context context, Uri uri) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
    }

    public void setEnableAccurateSeek(boolean z) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setKeepInBackground(boolean z) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setLogEnabled(boolean z) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setLooping(boolean z) {
    }

    public void setMaxCacheSize(int i2) {
    }

    @Override // com.tencent.liteav.txcplayer.a, com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setPrivateConfig(Map<String, Object> map) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setRate(float f2) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setScreenOnWhilePlaying(boolean z) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setSurface(Surface surface) {
    }

    @Override // com.tencent.liteav.txcplayer.b
    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
    }

    @Override // com.tencent.liteav.txcplayer.b
    public void setSurfaceTextureHost(c cVar) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setWakeMode(Context context, int i2) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void start() throws IllegalStateException {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void stop() throws IllegalStateException {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void unpublishAudioToNetwork() {
    }

    public void updateBitrate(long j2) {
    }

    public void updateTcpSpeed(long j2) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setDataSource(FileDescriptor fileDescriptor) throws IOException, IllegalArgumentException, IllegalStateException {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
    }
}
