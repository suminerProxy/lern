package com.tencent.thumbplayer.tplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.thumbplayer.adapter.a.c;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.thumbplayer.api.ITPSurface;
import com.tencent.thumbplayer.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.api.TPCaptureCallBack;
import com.tencent.thumbplayer.api.TPCaptureParams;
import com.tencent.thumbplayer.api.TPDrmInfo;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.api.TPProgramInfo;
import com.tencent.thumbplayer.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.api.TPSubtitleData;
import com.tencent.thumbplayer.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.api.TPTrackInfo;
import com.tencent.thumbplayer.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.api.proxy.ITPPlayerProxy;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.api.report.ITPBusinessReportManager;
import com.tencent.thumbplayer.api.reportv2.ITPExtendReportController;
import com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoaderListener;
import com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.tplayer.a.g;
import com.tencent.thumbplayer.utils.n;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class b implements ITPPlayer {
    private static final SparseIntArray D = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f13506a = "api call:";
    private static AtomicInteger u;
    private long A;
    private int B;
    private int C;
    private final com.tencent.thumbplayer.adapter.a b;
    private c c;

    /* renamed from: d  reason: collision with root package name */
    private com.tencent.thumbplayer.d.a f13507d;

    /* renamed from: e  reason: collision with root package name */
    private com.tencent.thumbplayer.tplayer.plugins.report.b f13508e;

    /* renamed from: f  reason: collision with root package name */
    private com.tencent.thumbplayer.d.a.a f13509f;

    /* renamed from: g  reason: collision with root package name */
    private com.tencent.thumbplayer.tplayer.plugins.b f13510g;

    /* renamed from: h  reason: collision with root package name */
    private HandlerThread f13511h;

    /* renamed from: i  reason: collision with root package name */
    private Looper f13512i;

    /* renamed from: j  reason: collision with root package name */
    private a f13513j;

    /* renamed from: k  reason: collision with root package name */
    private Context f13514k;

    /* renamed from: l  reason: collision with root package name */
    private String f13515l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f13516m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f13517n;

    /* renamed from: o  reason: collision with root package name */
    private int f13518o;

    /* renamed from: p  reason: collision with root package name */
    private ArrayList<String> f13519p;
    private long q;
    private long r;
    private long s;
    private com.tencent.thumbplayer.f.a t;
    private AtomicInteger v;
    private boolean w;
    private com.tencent.thumbplayer.e.c x;
    private g y;
    private Map<Long, Long> z;

    @SuppressLint({"HandlerLeak"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13520a;
        private b b;

        public a(b bVar, b bVar2) {
        }

        public a(b bVar, b bVar2, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.tplayer.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class C0254b implements c.a, c.b, c.InterfaceC0243c, c.d, c.e, c.f, c.g, c.h, c.i, c.j, c.k, c.l, c.m, c.n, c.o, c.p, ITPPlayListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13521a;

        public C0254b(b bVar) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.c.o
        public TPPostProcessFrameBuffer a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.c.d
        public TPRemoteSdpInfo a(String str, int i2) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.c.i
        public void a() {
        }

        @Override // com.tencent.thumbplayer.adapter.a.c.f
        public void a(int i2, int i3, long j2, long j3) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.c.h
        public void a(int i2, long j2, long j3, Object obj) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.c.p
        public void a(long j2, long j3) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.c.a
        public void a(TPAudioFrameBuffer tPAudioFrameBuffer) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.c.g
        public void a(TPDrmInfo tPDrmInfo) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.c.e
        public void a(TPPlayerDetailInfo tPPlayerDetailInfo) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.c.l
        public void a(TPSubtitleData tPSubtitleData) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.c.m
        public void a(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.c.n
        public void a(TPVideoFrameBuffer tPVideoFrameBuffer) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.c.b
        public TPPostProcessFrameBuffer b(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.c.InterfaceC0243c
        public void b() {
        }

        @Override // com.tencent.thumbplayer.adapter.a.c.k
        public void b(int i2, int i3) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.c.j
        public void c() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getAdvRemainTime() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public String getContentType(int i2, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int getCurrentPlayClipNo() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getCurrentPlayOffset() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getCurrentPosition() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public String getDataFilePath(int i2, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getDataTotalSize(int i2, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public Object getPlayInfo(long j2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public Object getPlayInfo(String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getPlayerBufferLength() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlExpired(Map<String, String> map) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlUpdate(String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadError(int i2, int i3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadFinish() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProtocolUpdate(String str, String str2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadStatusUpdate(int i2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public Object onPlayCallback(int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int onReadData(int i2, String str, long j2, long j3) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int onStartReadData(int i2, String str, long j2, long j3) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int onStopReadData(int i2, String str, int i3) {
        }
    }

    public b(Context context) {
    }

    public b(Context context, Looper looper) {
    }

    public b(Context context, Looper looper, Looper looper2) {
    }

    public b(Context context, Looper looper, Looper looper2, com.tencent.thumbplayer.f.b bVar) {
    }

    public static /* synthetic */ int a(b bVar, int i2) {
    }

    private int a(String str) {
    }

    private long a(long j2, String str) {
    }

    public static /* synthetic */ long a(b bVar, long j2) {
    }

    public static /* synthetic */ long a(b bVar, long j2, String str) {
    }

    private TPVideoInfo a(TPVideoInfo tPVideoInfo, int i2, int i3) {
    }

    public static /* synthetic */ com.tencent.thumbplayer.d.a a(b bVar) {
    }

    private void a(@TPPlayerDetailInfo.TPPlayerDetailInfoType int i2) {
    }

    private void a(int i2, int i3) {
    }

    private void a(int i2, int i3, int i4, Object obj) {
    }

    private void a(int i2, int i3, int i4, String str, Object obj) {
    }

    private void a(int i2, long j2, long j3, Object obj) {
    }

    private void a(@NonNull Message message) {
    }

    private void a(TPOptionalParam tPOptionalParam) {
    }

    private void a(@NonNull TPPlayerDetailInfo tPPlayerDetailInfo) {
    }

    public static /* synthetic */ void a(b bVar, int i2, int i3) {
    }

    public static /* synthetic */ void a(b bVar, int i2, int i3, int i4, Object obj) {
    }

    public static /* synthetic */ void a(b bVar, int i2, int i3, int i4, String str, Object obj) {
    }

    public static /* synthetic */ void a(b bVar, int i2, long j2, long j3, Object obj) {
    }

    public static /* synthetic */ void a(b bVar, Message message) {
    }

    public static /* synthetic */ void a(b bVar, Object obj) {
    }

    private void a(Object obj) {
    }

    private long b(long j2, String str) {
    }

    public static /* synthetic */ long b(b bVar, long j2) {
    }

    public static /* synthetic */ com.tencent.thumbplayer.adapter.a b(b bVar) {
    }

    private TPDownloadParamData b(int i2, int i3) {
    }

    private void b(int i2) {
    }

    public static /* synthetic */ void b(b bVar, int i2) {
    }

    public static /* synthetic */ void b(b bVar, Object obj) {
    }

    private void b(Object obj) {
    }

    public static /* synthetic */ long c(b bVar, long j2) {
    }

    public static /* synthetic */ com.tencent.thumbplayer.f.a c(b bVar) {
    }

    private void c() {
    }

    private void c(@TPPlayerDetailInfo.TPPlayerDetailInfoType int i2) {
    }

    public static /* synthetic */ void c(b bVar, int i2) {
    }

    public static /* synthetic */ void d(b bVar) {
    }

    private boolean d() {
    }

    public static /* synthetic */ c e(b bVar) {
    }

    private void e() {
    }

    public static /* synthetic */ int f(b bVar) {
    }

    private void f() {
    }

    public static /* synthetic */ com.tencent.thumbplayer.d.a.a g(b bVar) {
    }

    private boolean g() {
    }

    public static /* synthetic */ boolean h(b bVar) {
    }

    public Looper a() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void addAudioTrackSource(String str, String str2) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void addAudioTrackSource(String str, String str2, TPDownloadParamData tPDownloadParamData) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(c = true)
    public void addSubtitleSource(String str, String str2, String str3) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(c = true)
    public void addSubtitleSource(@NonNull String str, String str2, @NonNull String str3, TPDownloadParamData tPDownloadParamData) {
    }

    public String b() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(a = true)
    public void captureVideo(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void deselectTrack(int i2, long j2) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void enableTPAssetResourceLoader(ITPAssetResourceLoaderListener iTPAssetResourceLoaderListener, Looper looper) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public int getBufferPercent() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getCurrentPositionMs() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public int getCurrentState() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getDurationMs() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public ITPExtendReportController getExtendReportController() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getPlayableDurationMs() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public ITPPlayerProxy getPlayerProxy() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public int getPlayerType() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public TPProgramInfo[] getProgramInfo() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getPropertyLong(int i2) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public String getPropertyString(int i2) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public ITPBusinessReportManager getReportManager() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public TPTrackInfo[] getTrackInfo() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public int getVideoHeight() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public int getVideoWidth() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void pause() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void pauseDownload() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void prepareAsync() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(a = true)
    public void release() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(a = true)
    public void reset() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void resumeDownload() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void seekTo(int i2) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void seekTo(int i2, int i3) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void selectProgram(int i2, long j2) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void selectTrack(int i2, long j2) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(b = true)
    public void setAudioGainRatio(float f2) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(b = true)
    public void setAudioNormalizeVolumeParams(String str) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void setDataSource(ParcelFileDescriptor parcelFileDescriptor) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void setDataSource(ITPMediaAsset iTPMediaAsset) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void setDataSource(String str) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void setDataSource(String str, Map<String, String> map) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(b = true, c = true)
    public void setLoopback(boolean z) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(b = true, c = true)
    public void setLoopback(boolean z, long j2, long j3) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnAudioFrameOutputListener(ITPPlayerListener.IOnAudioFrameOutputListener iOnAudioFrameOutputListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnAudioProcessFrameOutputListener(ITPPlayerListener.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnCompletionListener(ITPPlayerListener.IOnCompletionListener iOnCompletionListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnDemuxerListener(ITPPlayerListener.IOnDemuxerListener iOnDemuxerListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnDetailInfoListener(ITPPlayerListener.IOnDetailInfoListener iOnDetailInfoListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnErrorListener(ITPPlayerListener.IOnErrorListener iOnErrorListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnEventRecordListener(ITPPlayerListener.IOnEventRecordListener iOnEventRecordListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnInfoListener(ITPPlayerListener.IOnInfoListener iOnInfoListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnPlayerStateChangeListener(ITPPlayerListener.IOnStateChangeListener iOnStateChangeListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnPreparedListener(ITPPlayerListener.IOnPreparedListener iOnPreparedListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnSeekCompleteListener(ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnStopAsyncCompleteListener(ITPPlayerListener.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnSubtitleDataListener(ITPPlayerListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnSubtitleFrameOutListener(ITPPlayerListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnVideoFrameOutListener(ITPPlayerListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnVideoProcessFrameOutputListener(ITPPlayerListener.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnVideoSizeChangedListener(ITPPlayerListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(b = true)
    public void setOutputMute(boolean z) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(b = true)
    public void setPlaySpeedRatio(float f2) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(c = true)
    public void setPlayerOptionalParam(TPOptionalParam tPOptionalParam) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void setRichMediaSynchronizer(@Nullable ITPRichMediaSynchronizer iTPRichMediaSynchronizer) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void setSurface(Surface surface) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void setTPSurface(ITPSurface iTPSurface) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(c = true)
    public void setVideoInfo(TPVideoInfo tPVideoInfo) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void start() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(a = true)
    public void stop() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void stopAsync() {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(b = true, c = true)
    public void switchDefinition(@NonNull ITPMediaAsset iTPMediaAsset, long j2, TPVideoInfo tPVideoInfo) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(b = true, c = true)
    public void switchDefinition(@NonNull ITPMediaAsset iTPMediaAsset, long j2, TPVideoInfo tPVideoInfo, int i2) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(b = true, c = true)
    public void switchDefinition(@NonNull String str, long j2, TPVideoInfo tPVideoInfo) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(b = true, c = true)
    public void switchDefinition(@NonNull String str, long j2, TPVideoInfo tPVideoInfo, int i2) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(b = true, c = true)
    public void switchDefinition(@NonNull String str, long j2, TPVideoInfo tPVideoInfo, Map<String, String> map) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b(b = true, c = true)
    public void switchDefinition(@NonNull String str, long j2, TPVideoInfo tPVideoInfo, Map<String, String> map, int i2) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void updateLoggerContext(com.tencent.thumbplayer.f.b bVar) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @n.b
    public void updateTaskInfo(String str, Object obj) {
    }
}
