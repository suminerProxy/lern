package com.tencent.thumbplayer.adapter.a.b;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.adapter.a.c;
import com.tencent.thumbplayer.api.TPCaptureCallBack;
import com.tencent.thumbplayer.api.TPCaptureParams;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPProgramInfo;
import com.tencent.thumbplayer.api.TPSubtitleData;
import com.tencent.thumbplayer.api.TPTrackInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.core.common.TPAudioFrame;
import com.tencent.thumbplayer.core.common.TPDetailInfo;
import com.tencent.thumbplayer.core.common.TPMediaTrackInfo;
import com.tencent.thumbplayer.core.common.TPPostProcessFrame;
import com.tencent.thumbplayer.core.common.TPSubtitleFrame;
import com.tencent.thumbplayer.core.common.TPVideoFrame;
import com.tencent.thumbplayer.core.demuxer.ITPNativeDemuxerCallback;
import com.tencent.thumbplayer.core.demuxer.TPNativeRemoteSdpInfo;
import com.tencent.thumbplayer.core.player.ITPNativePlayerAudioFrameCallback;
import com.tencent.thumbplayer.core.player.ITPNativePlayerEventRecordCallback;
import com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback;
import com.tencent.thumbplayer.core.player.ITPNativePlayerPostProcessFrameCallback;
import com.tencent.thumbplayer.core.player.ITPNativePlayerSubtitleFrameCallback;
import com.tencent.thumbplayer.core.player.ITPNativePlayerVideoFrameCallback;
import com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.core.player.TPNativePlayer;
import com.tencent.thumbplayer.core.player.TPNativePlayerInitConfig;
import com.tencent.thumbplayer.core.player.TPNativePlayerProgramInfo;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class b implements com.tencent.thumbplayer.adapter.a.b {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<Integer> f13035a = null;
    private TPNativePlayer b;
    private TPNativePlayerInitConfig c;

    /* renamed from: d  reason: collision with root package name */
    private a f13036d;

    /* renamed from: e  reason: collision with root package name */
    private com.tencent.thumbplayer.adapter.e f13037e;

    /* renamed from: f  reason: collision with root package name */
    private com.tencent.thumbplayer.adapter.a.a f13038f;

    /* renamed from: g  reason: collision with root package name */
    private TPSubtitleData f13039g;

    /* renamed from: h  reason: collision with root package name */
    private com.tencent.thumbplayer.f.a f13040h;

    /* renamed from: i  reason: collision with root package name */
    private ITPNativePlayerMessageCallback f13041i;

    /* renamed from: j  reason: collision with root package name */
    private ITPNativePlayerAudioFrameCallback f13042j;

    /* renamed from: k  reason: collision with root package name */
    private ITPNativePlayerVideoFrameCallback f13043k;

    /* renamed from: l  reason: collision with root package name */
    private ITPNativePlayerSubtitleFrameCallback f13044l;

    /* renamed from: m  reason: collision with root package name */
    private ITPNativePlayerPostProcessFrameCallback f13045m;

    /* renamed from: n  reason: collision with root package name */
    private ITPNativeDemuxerCallback f13046n;

    /* renamed from: o  reason: collision with root package name */
    private ITPNativePlayerEventRecordCallback f13047o;

    /* renamed from: com.tencent.thumbplayer.adapter.a.b.b$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements ITPNativePlayerMessageCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13048a;

        public AnonymousClass1(b bVar) {
        }

        private void a(int i2, Object obj) {
        }

        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback
        public void onASyncCallResult(int i2, long j2, int i3, int i4) {
        }

        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback
        public void onDetailInfo(TPDetailInfo tPDetailInfo) {
        }

        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback
        public void onError(int i2, int i3) {
        }

        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback
        public void onInfoLong(int i2, long j2, long j3) {
        }

        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback
        public void onInfoObject(int i2, Object obj) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.a.b.b$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements ITPNativePlayerAudioFrameCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13049a;

        public AnonymousClass2(b bVar) {
        }

        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerAudioFrameCallback
        public void onAudioFrame(TPAudioFrame tPAudioFrame, int i2) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.a.b.b$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements ITPNativePlayerVideoFrameCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13050a;

        public AnonymousClass3(b bVar) {
        }

        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerVideoFrameCallback
        public void onVideoFrame(TPVideoFrame tPVideoFrame, int i2) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.a.b.b$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements ITPNativePlayerSubtitleFrameCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13051a;

        public AnonymousClass4(b bVar) {
        }

        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerSubtitleFrameCallback
        public void onSubtitleFrame(TPSubtitleFrame tPSubtitleFrame, int i2) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.a.b.b$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements ITPNativePlayerPostProcessFrameCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13052a;

        public AnonymousClass5(b bVar) {
        }

        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerPostProcessFrameCallback
        public TPPostProcessFrame onPostProcessFrame(TPPostProcessFrame tPPostProcessFrame, int i2) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.a.b.b$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements ITPNativeDemuxerCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13053a;

        public AnonymousClass6(b bVar) {
        }

        @Override // com.tencent.thumbplayer.core.demuxer.ITPNativeDemuxerCallback
        public TPNativeRemoteSdpInfo onSdpExchange(String str, int i2) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.a.b.b$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements ITPNativePlayerEventRecordCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13054a;

        public AnonymousClass7(b bVar) {
        }

        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerEventRecordCallback
        public void onDrmInfo(TPGeneralPlayFlowParams.TPPlayerDrmParams tPPlayerDrmParams) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.a.b.b$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass8 extends HashSet<Integer> {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13055a;
        private WeakReference<b> b;

        public a(b bVar, Looper looper, b bVar2) {
        }

        private void a(@TPCommonEnum.NativeErrorType int i2, int i3) {
        }

        private void a(C0242b c0242b) {
        }

        private void a(d dVar) {
        }

        private void a(e eVar) {
        }

        private void a(TPDetailInfo tPDetailInfo) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.a.b.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class C0242b {
        @TPCommonEnum.NativeMsgInfo

        /* renamed from: a  reason: collision with root package name */
        public int f13056a;
        public long b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f13057d;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f13058a;
        public int b;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f13059a;
        public long b;
        public long c;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public int f13060a;
        public Object b;
    }

    public b(Context context, com.tencent.thumbplayer.f.b bVar) {
    }

    private TPProgramInfo a(TPNativePlayerProgramInfo tPNativePlayerProgramInfo) {
    }

    private TPTrackInfo a(TPMediaTrackInfo tPMediaTrackInfo) {
    }

    public static /* synthetic */ com.tencent.thumbplayer.f.a a(b bVar) {
    }

    private void a() {
    }

    private void a(@TPCommonEnum.NativeErrorType int i2, d dVar) {
    }

    private void a(@TPCommonEnum.NativeMsgInfo int i2, e eVar) {
    }

    private void a(@TPCommonEnum.TPOptionalId int i2, TPOptionalParam.OptionalParamBoolean optionalParamBoolean) {
    }

    private void a(@TPCommonEnum.TPOptionalId int i2, TPOptionalParam.OptionalParamFloat optionalParamFloat) {
    }

    private void a(@TPCommonEnum.TPOptionalId int i2, TPOptionalParam.OptionalParamLong optionalParamLong) {
    }

    private void a(@TPCommonEnum.TPOptionalId int i2, TPOptionalParam.OptionalParamObject optionalParamObject) {
    }

    private void a(@TPCommonEnum.TPOptionalId int i2, TPOptionalParam.OptionalParamQueueInt optionalParamQueueInt) {
    }

    private void a(@TPCommonEnum.TPOptionalId int i2, TPOptionalParam.OptionalParamQueueString optionalParamQueueString) {
    }

    private void a(int i2, TPOptionalParam.OptionalParamString optionalParamString) {
    }

    private void a(long j2, long j3) {
    }

    private void a(C0242b c0242b) {
    }

    public static /* synthetic */ void a(b bVar, int i2, d dVar) {
    }

    public static /* synthetic */ void a(b bVar, int i2, e eVar) {
    }

    public static /* synthetic */ void a(b bVar, long j2, long j3) {
    }

    public static /* synthetic */ void a(b bVar, C0242b c0242b) {
    }

    public static /* synthetic */ boolean a(b bVar, int i2) {
    }

    public static /* synthetic */ a b(b bVar) {
    }

    private void b() {
    }

    private void b(@TPCommonEnum.TPOptionalId int i2, TPOptionalParam.OptionalParamBoolean optionalParamBoolean) {
    }

    private void b(@TPCommonEnum.TPOptionalId int i2, TPOptionalParam.OptionalParamLong optionalParamLong) {
    }

    private void b(int i2, TPOptionalParam.OptionalParamObject optionalParamObject) {
    }

    private void b(@TPCommonEnum.TPOptionalId int i2, TPOptionalParam.OptionalParamString optionalParamString) {
    }

    public static /* synthetic */ com.tencent.thumbplayer.adapter.e c(b bVar) {
    }

    private void c() {
    }

    private void d() {
    }

    public static /* synthetic */ void d(b bVar) {
    }

    private boolean d(int i2) {
    }

    public static /* synthetic */ void e(b bVar) {
    }

    public static /* synthetic */ void f(b bVar) {
    }

    public static /* synthetic */ TPSubtitleData g(b bVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(float f2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(int i2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(int i2, @TPCommonEnum.TPSeekMode int i3) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(int i2, long j2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(AssetFileDescriptor assetFileDescriptor) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(ParcelFileDescriptor parcelFileDescriptor) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(Surface surface) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(SurfaceHolder surfaceHolder) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(c.a aVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(c.b bVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(c.InterfaceC0243c interfaceC0243c) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(c.d dVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(c.e eVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(c.f fVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(c.g gVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(c.h hVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(c.i iVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(c.j jVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(c.l lVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(c.m mVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(c.n nVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(c.o oVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(c.p pVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(TPOptionalParam tPOptionalParam) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(ITPMediaAsset iTPMediaAsset) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i2, long j2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(com.tencent.thumbplayer.f.b bVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(String str) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(String str, @TPCommonEnum.TPSwitchDefMode int i2, long j2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(String str, String str2, String str3) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(String str, String str2, List<TPOptionalParam> list) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(String str, Map<String, String> map) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(String str, Map<String, String> map, @TPCommonEnum.TPSwitchDefMode int i2, long j2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(boolean z) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(boolean z, long j2, long j3) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public long b(int i2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void b(float f2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void b(int i2, long j2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void b(boolean z) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public String c(int i2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void c(int i2, long j2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void f() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void g() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void h() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void i() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void j() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void k() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void l() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public long m() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public long n() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public long o() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public int p() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public int q() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public TPTrackInfo[] r() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public TPProgramInfo[] s() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public long t() {
    }
}
