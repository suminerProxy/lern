package com.tencent.liteav.txcvodplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.Surface;
import android.widget.FrameLayout;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;
import com.tencent.liteav.txcplayer.d;
import com.tencent.liteav.txcplayer.d.b;
import com.tencent.liteav.txcplayer.e;
import com.tencent.liteav.txcvodplayer.renderer.TextureRenderView;
import com.tencent.liteav.txcvodplayer.renderer.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXCVodVideoView extends FrameLayout {
    private String A;
    private float B;
    private long C;
    private volatile boolean D;
    private int E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private ITXVCubePlayer.c K;
    private ITXVCubePlayer.g L;
    private int M;
    private ITXVCubePlayer.d N;
    private ITXVCubePlayer.f O;
    private ITXVCubePlayer.k P;
    private ITXVCubePlayer.i Q;
    private ITXVCubePlayer.j R;
    private ITXVCubePlayer.e S;
    private int T;
    private d U;
    private Handler V;
    private boolean W;

    /* renamed from: a  reason: collision with root package name */
    public int f11714a;
    public int b;
    public ITXVCubePlayer c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11715d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11716e;

    /* renamed from: f  reason: collision with root package name */
    public Object f11717f;

    /* renamed from: g  reason: collision with root package name */
    public ITXVCubePlayer.l f11718g;

    /* renamed from: h  reason: collision with root package name */
    public ITXVCubePlayer.h f11719h;

    /* renamed from: i  reason: collision with root package name */
    public a.InterfaceC0199a f11720i;

    /* renamed from: j  reason: collision with root package name */
    private a.b f11721j;

    /* renamed from: k  reason: collision with root package name */
    private int f11722k;

    /* renamed from: l  reason: collision with root package name */
    private int f11723l;

    /* renamed from: m  reason: collision with root package name */
    private int f11724m;

    /* renamed from: n  reason: collision with root package name */
    private int f11725n;

    /* renamed from: o  reason: collision with root package name */
    private int f11726o;

    /* renamed from: p  reason: collision with root package name */
    private int f11727p;
    private long q;
    private long r;
    private int s;
    private boolean t;
    private Context u;
    private e v;
    private Map<String, Object> w;
    private com.tencent.liteav.txcvodplayer.renderer.a x;
    private int y;
    private int z;

    /* renamed from: com.tencent.liteav.txcvodplayer.TXCVodVideoView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Surface f11728a;
        public final /* synthetic */ TXCVodVideoView b;

        public AnonymousClass1(TXCVodVideoView tXCVodVideoView, Surface surface) {
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        public final void a(ITXVCubePlayer iTXVCubePlayer) {
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        public final Surface b() {
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        public final Surface c() {
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        public final com.tencent.liteav.txcvodplayer.renderer.a a() {
        }
    }

    /* renamed from: com.tencent.liteav.txcvodplayer.TXCVodVideoView$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 implements ITXVCubePlayer.g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXCVodVideoView f11729a;

        public AnonymousClass10(TXCVodVideoView tXCVodVideoView) {
        }

        @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.g
        public final boolean a(int i2, int i3, int i4, Object obj) {
        }
    }

    /* renamed from: com.tencent.liteav.txcvodplayer.TXCVodVideoView$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 implements ITXVCubePlayer.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXCVodVideoView f11730a;

        public AnonymousClass11(TXCVodVideoView tXCVodVideoView) {
        }

        @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.d
        public final boolean a(int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.liteav.txcvodplayer.TXCVodVideoView$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 implements ITXVCubePlayer.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXCVodVideoView f11731a;

        public AnonymousClass12(TXCVodVideoView tXCVodVideoView) {
        }

        @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.f
        public final void a() {
        }
    }

    /* renamed from: com.tencent.liteav.txcvodplayer.TXCVodVideoView$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass13 implements ITXVCubePlayer.k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXCVodVideoView f11732a;

        public AnonymousClass13(TXCVodVideoView tXCVodVideoView) {
        }

        @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.k
        public final void a() {
        }
    }

    /* renamed from: com.tencent.liteav.txcvodplayer.TXCVodVideoView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements ITXVCubePlayer.i {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXCVodVideoView f11733a;

        public AnonymousClass2(TXCVodVideoView tXCVodVideoView) {
        }

        @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.i
        public final void a() {
        }
    }

    /* renamed from: com.tencent.liteav.txcvodplayer.TXCVodVideoView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements ITXVCubePlayer.j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXCVodVideoView f11734a;

        public AnonymousClass3(TXCVodVideoView tXCVodVideoView) {
        }
    }

    /* renamed from: com.tencent.liteav.txcvodplayer.TXCVodVideoView$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements ITXVCubePlayer.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXCVodVideoView f11735a;

        public AnonymousClass4(TXCVodVideoView tXCVodVideoView) {
        }

        @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.e
        public final void a() {
        }
    }

    /* renamed from: com.tencent.liteav.txcvodplayer.TXCVodVideoView$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements ITXVCubePlayer.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXCVodVideoView f11737a;

        public AnonymousClass6(TXCVodVideoView tXCVodVideoView) {
        }

        @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.a
        public final int a() {
        }
    }

    /* renamed from: com.tencent.liteav.txcvodplayer.TXCVodVideoView$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements ITXVCubePlayer.l {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXCVodVideoView f11738a;

        public AnonymousClass7(TXCVodVideoView tXCVodVideoView) {
        }

        @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.l
        public final void a(ITXVCubePlayer iTXVCubePlayer, int i2, int i3, String str) {
        }
    }

    /* renamed from: com.tencent.liteav.txcvodplayer.TXCVodVideoView$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 implements ITXVCubePlayer.h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXCVodVideoView f11739a;

        public AnonymousClass8(TXCVodVideoView tXCVodVideoView) {
        }

        @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.h
        public final void a(ITXVCubePlayer iTXVCubePlayer) {
        }
    }

    /* renamed from: com.tencent.liteav.txcvodplayer.TXCVodVideoView$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 implements ITXVCubePlayer.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXCVodVideoView f11740a;

        public AnonymousClass9(TXCVodVideoView tXCVodVideoView) {
        }

        @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.c
        public final void a() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<TXCVodVideoView> f11741a;
        private final int b;
        private final String c;

        public a(TXCVodVideoView tXCVodVideoView, Looper looper) {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
        }
    }

    public TXCVodVideoView(Context context) {
    }

    public static /* synthetic */ void A(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ int a(TXCVodVideoView tXCVodVideoView, int i2) {
    }

    public static /* synthetic */ int b(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ int c(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ int d(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ int e(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ int f(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ int g(TXCVodVideoView tXCVodVideoView, int i2) {
    }

    public static /* synthetic */ int h(TXCVodVideoView tXCVodVideoView, int i2) {
    }

    public static /* synthetic */ int i(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ int j(TXCVodVideoView tXCVodVideoView, int i2) {
    }

    public static /* synthetic */ long k(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ float l(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ boolean m(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ int n(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ int o(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ String p(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ long q(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ int r(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ int s(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ boolean t(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ void u(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ boolean v(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ ITXVCubePlayer w(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ ITXVCubePlayer x(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ boolean y(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ d z(TXCVodVideoView tXCVodVideoView) {
    }

    public int getBitrateIndex() {
    }

    public long getBufferDuration() {
    }

    public long getCurrentPosition() {
    }

    public int getDuration() {
    }

    public b getMediaInfo() {
    }

    public int getMetaRotationDegree() {
    }

    public int getPlayerType() {
    }

    public String getServerIp() {
    }

    public ArrayList<com.tencent.liteav.txcplayer.d.a> getSupportedBitrates() {
    }

    public String getUrlPathExtention() {
    }

    public int getVideoHeight() {
    }

    public int getVideoRotationDegree() {
    }

    public int getVideoWidth() {
    }

    public void setAudioPlayoutVolume(int i2) {
    }

    public void setAutoPlay(boolean z) {
    }

    public void setBitrateIndex(int i2) {
    }

    public void setConfig(e eVar) {
    }

    public void setListener(d dVar) {
    }

    public void setMute(boolean z) {
    }

    public void setPlayerType(int i2) {
    }

    public void setPrivateConfig(Map<String, Object> map) {
    }

    public void setRate(float f2) {
    }

    public void setRender(int i2) {
    }

    public void setRenderMode(int i2) {
    }

    public void setRenderSurface(Surface surface) {
    }

    public void setRenderView(com.tencent.liteav.txcvodplayer.renderer.a aVar) {
    }

    public void setStartTime(float f2) {
    }

    public void setTextureRenderView(TextureRenderView textureRenderView) {
    }

    public void setVideoPath(String str) {
    }

    public void setVideoRotationDegree(int i2) {
    }

    public void setVideoURI(Uri uri) {
    }

    public static /* synthetic */ long a(TXCVodVideoView tXCVodVideoView, long j2) {
    }

    public static /* synthetic */ int b(TXCVodVideoView tXCVodVideoView, int i2) {
    }

    public static /* synthetic */ int c(TXCVodVideoView tXCVodVideoView, int i2) {
    }

    public static /* synthetic */ int d(TXCVodVideoView tXCVodVideoView, int i2) {
    }

    public static /* synthetic */ int e(TXCVodVideoView tXCVodVideoView, int i2) {
    }

    public static /* synthetic */ int f(TXCVodVideoView tXCVodVideoView, int i2) {
    }

    public static /* synthetic */ boolean g(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ Handler h(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ int i(TXCVodVideoView tXCVodVideoView, int i2) {
    }

    public static /* synthetic */ e j(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ a.b a(TXCVodVideoView tXCVodVideoView, a.b bVar) {
    }

    private static void b(ITXVCubePlayer iTXVCubePlayer, a.b bVar) {
    }

    private void c(boolean z) {
    }

    @TargetApi(23)
    private boolean e() {
    }

    private void f() {
    }

    public final void d() {
    }

    public static /* synthetic */ com.tencent.liteav.txcvodplayer.renderer.a a(TXCVodVideoView tXCVodVideoView) {
    }

    public static /* synthetic */ String a(TXCVodVideoView tXCVodVideoView, String str) {
    }

    public static /* synthetic */ void a(ITXVCubePlayer iTXVCubePlayer, a.b bVar) {
    }

    public static /* synthetic */ void a(TXCVodVideoView tXCVodVideoView, int i2, String str, String str2) {
    }

    public static /* synthetic */ boolean a(TXCVodVideoView tXCVodVideoView, boolean z) {
    }

    private void a(Context context) {
    }

    private void b(boolean z) {
    }

    /* renamed from: com.tencent.liteav.txcvodplayer.TXCVodVideoView$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements a.InterfaceC0199a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TXCVodVideoView f11736a;

        public AnonymousClass5(TXCVodVideoView tXCVodVideoView) {
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0199a
        public final void a(a.b bVar, int i2, int i3) {
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0199a
        public final void b(a.b bVar) {
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0199a
        public final void a(a.b bVar) {
        }
    }

    public final boolean c() {
    }

    public final void a() {
    }

    public final void b() {
    }

    public TXCVodVideoView(Context context, AttributeSet attributeSet) {
    }

    public final void a(int i2) {
    }

    public final boolean a(boolean z) {
    }

    private void a(int i2, String str, String str2) {
    }

    private static void a(ITXVCubePlayer iTXVCubePlayer) {
    }

    public TXCVodVideoView(Context context, AttributeSet attributeSet, int i2) {
    }
}
