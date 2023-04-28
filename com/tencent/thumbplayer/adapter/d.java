package com.tencent.thumbplayer.adapter;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.NonNull;
import com.tencent.thumbplayer.adapter.a.c;
import com.tencent.thumbplayer.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.api.TPCaptureCallBack;
import com.tencent.thumbplayer.api.TPCaptureParams;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.TPDrmInfo;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.api.TPPlayerState;
import com.tencent.thumbplayer.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.api.TPProgramInfo;
import com.tencent.thumbplayer.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.api.TPSubtitleData;
import com.tencent.thumbplayer.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.api.TPTrackInfo;
import com.tencent.thumbplayer.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer;
import com.tencent.thumbplayer.g.a;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class d implements com.tencent.thumbplayer.adapter.a, c.k {

    /* renamed from: a  reason: collision with root package name */
    private com.tencent.thumbplayer.f.b f13095a;
    private com.tencent.thumbplayer.f.a b;
    private Context c;

    /* renamed from: d  reason: collision with root package name */
    private com.tencent.thumbplayer.adapter.a.b f13096d;

    /* renamed from: e  reason: collision with root package name */
    private TPPlayerState f13097e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13098f;

    /* renamed from: g  reason: collision with root package name */
    private e f13099g;

    /* renamed from: h  reason: collision with root package name */
    private a f13100h;

    /* renamed from: i  reason: collision with root package name */
    private c f13101i;

    /* renamed from: j  reason: collision with root package name */
    private g f13102j;

    /* renamed from: k  reason: collision with root package name */
    private com.tencent.thumbplayer.adapter.strategy.a f13103k;

    /* renamed from: l  reason: collision with root package name */
    private b f13104l;

    /* renamed from: m  reason: collision with root package name */
    private int f13105m;

    /* renamed from: n  reason: collision with root package name */
    private com.tencent.thumbplayer.g.a f13106n;

    /* renamed from: com.tencent.thumbplayer.adapter.d$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements a.InterfaceC0248a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f13107a;

        public AnonymousClass1(d dVar) {
        }

        @Override // com.tencent.thumbplayer.g.a.InterfaceC0248a
        public long a(ITPRichMediaSynchronizer iTPRichMediaSynchronizer) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class a implements c.a, c.b, c.InterfaceC0243c, c.d, c.e, c.f, c.g, c.h, c.i, c.j, c.l, c.m, c.n, c.o, c.p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f13108a;

        private a(d dVar) {
        }

        public /* synthetic */ a(d dVar, AnonymousClass1 anonymousClass1) {
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

        @Override // com.tencent.thumbplayer.adapter.a.c.j
        public void c() {
        }
    }

    public d(Context context, @NonNull com.tencent.thumbplayer.f.b bVar) {
    }

    private com.tencent.thumbplayer.adapter.a.b a(int i2, com.tencent.thumbplayer.f.b bVar) {
    }

    private com.tencent.thumbplayer.adapter.strategy.a a(c cVar) {
    }

    public static /* synthetic */ TPPostProcessFrameBuffer a(d dVar, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
    }

    private TPPostProcessFrameBuffer a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
    }

    public static /* synthetic */ TPRemoteSdpInfo a(d dVar, String str, int i2) {
    }

    private TPRemoteSdpInfo a(String str, int i2) {
    }

    private void a(int i2, int i3, long j2, long j3) {
    }

    private void a(int i2, long j2, long j3, Object obj) {
    }

    private void a(long j2, long j3) {
    }

    private void a(com.tencent.thumbplayer.adapter.a.b bVar) {
    }

    public static /* synthetic */ void a(d dVar) {
    }

    public static /* synthetic */ void a(d dVar, int i2, int i3, long j2, long j3) {
    }

    public static /* synthetic */ void a(d dVar, int i2, long j2, long j3, Object obj) {
    }

    public static /* synthetic */ void a(d dVar, long j2, long j3) {
    }

    public static /* synthetic */ void a(d dVar, TPAudioFrameBuffer tPAudioFrameBuffer) {
    }

    public static /* synthetic */ void a(d dVar, TPDrmInfo tPDrmInfo) {
    }

    public static /* synthetic */ void a(d dVar, TPPlayerDetailInfo tPPlayerDetailInfo) {
    }

    public static /* synthetic */ void a(d dVar, TPSubtitleData tPSubtitleData) {
    }

    public static /* synthetic */ void a(d dVar, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
    }

    public static /* synthetic */ void a(d dVar, TPVideoFrameBuffer tPVideoFrameBuffer) {
    }

    private void a(TPAudioFrameBuffer tPAudioFrameBuffer) {
    }

    private void a(TPDrmInfo tPDrmInfo) {
    }

    private void a(TPPlayerDetailInfo tPPlayerDetailInfo) {
    }

    private void a(TPSubtitleData tPSubtitleData) {
    }

    private void a(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
    }

    private void a(TPVideoFrameBuffer tPVideoFrameBuffer) {
    }

    public static /* synthetic */ TPPostProcessFrameBuffer b(d dVar, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
    }

    private TPPostProcessFrameBuffer b(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
    }

    private void b(com.tencent.thumbplayer.adapter.a.b bVar) {
    }

    public static /* synthetic */ void b(d dVar) {
    }

    public static /* synthetic */ void c(d dVar) {
    }

    private void d(int i2) {
    }

    private void e(int i2) {
    }

    private void u() {
    }

    private void v() {
    }

    private void w() {
    }

    private void x() {
    }

    private int y() {
    }

    private boolean z() {
    }

    @Override // com.tencent.thumbplayer.adapter.a
    public int a() {
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

    @Override // com.tencent.thumbplayer.adapter.a
    public void a(c.k kVar) {
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

    @Override // com.tencent.thumbplayer.adapter.a
    public void a(@NonNull com.tencent.thumbplayer.adapter.a.e eVar) {
    }

    @Override // com.tencent.thumbplayer.adapter.a
    public void a(com.tencent.thumbplayer.adapter.a.e eVar, int i2, long j2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a
    public void a(@NonNull com.tencent.thumbplayer.adapter.a.e eVar, Map<String, String> map) {
    }

    @Override // com.tencent.thumbplayer.adapter.a
    public void a(com.tencent.thumbplayer.adapter.a.e eVar, Map<String, String> map, int i2, long j2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(TPOptionalParam tPOptionalParam) {
    }

    @Override // com.tencent.thumbplayer.adapter.a
    public void a(TPVideoInfo tPVideoInfo) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(ITPMediaAsset iTPMediaAsset) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i2, long j2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a
    public void a(ITPRichMediaSynchronizer iTPRichMediaSynchronizer) {
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
    public void a(String str, Map<String, String> map, int i2, long j2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(boolean z) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(boolean z, long j2, long j3) {
    }

    @Override // com.tencent.thumbplayer.adapter.a
    public int b() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public long b(int i2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void b(float f2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.c.k
    public void b(int i2, int i3) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void b(int i2, long j2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a
    public void b(TPVideoInfo tPVideoInfo) {
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

    @Override // com.tencent.thumbplayer.adapter.a
    public boolean c() {
    }

    @Override // com.tencent.thumbplayer.adapter.a
    public int d() {
    }

    @Override // com.tencent.thumbplayer.adapter.a
    public b e() {
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
