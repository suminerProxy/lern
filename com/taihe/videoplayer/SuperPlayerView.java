package com.taihe.videoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tai.danmuku.danmu.widget.DanmakuView;
import com.taihe.videoplayer.ui.player.FullScreenPlayer;
import com.taihe.videoplayer.ui.player.WindowPlayer;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.TXVodPlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import h.x.g.f;
import h.x.g.h;
import h.x.g.l.a.m;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SuperPlayerView extends RelativeLayout {
    public boolean b;
    private TXCloudVideoView c;

    /* renamed from: d  reason: collision with root package name */
    public FullScreenPlayer f7875d;

    /* renamed from: e  reason: collision with root package name */
    public WindowPlayer f7876e;

    /* renamed from: f  reason: collision with root package name */
    public DanmakuView f7877f;

    /* renamed from: g  reason: collision with root package name */
    private f.c f7878g;

    /* renamed from: h  reason: collision with root package name */
    private h.x.g.d f7879h;

    /* renamed from: i  reason: collision with root package name */
    private h.x.g.k.g.b f7880i;

    /* renamed from: j  reason: collision with root package name */
    private h.x.g.k.a f7881j;

    /* renamed from: k  reason: collision with root package name */
    private ViewGroup f7882k;

    /* renamed from: l  reason: collision with root package name */
    public Context f7883l;

    /* renamed from: m  reason: collision with root package name */
    private h f7884m;

    /* renamed from: n  reason: collision with root package name */
    public int f7885n;

    /* renamed from: o  reason: collision with root package name */
    private d f7886o;

    /* renamed from: p  reason: collision with root package name */
    private float f7887p;
    private final m.a q;
    private final h.x.g.k.c r;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements m.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SuperPlayerView f7888a;

        public a(SuperPlayerView superPlayerView) {
        }

        @Override // h.x.g.l.a.m.a
        public void a(float f2) {
        }

        @Override // h.x.g.l.a.m.a
        public void b() {
        }

        @Override // h.x.g.l.a.m.a
        public void c() {
        }

        @Override // h.x.g.l.a.m.a
        public void d(f.c cVar) {
        }

        @Override // h.x.g.l.a.m.a
        public void e(boolean z) {
        }

        @Override // h.x.g.l.a.m.a
        public void f() {
        }

        @Override // h.x.g.l.a.m.a
        public void g(float f2) {
        }

        @Override // h.x.g.l.a.m.a
        public void h() {
        }

        @Override // h.x.g.l.a.m.a
        public void i(f.c cVar) {
        }

        @Override // h.x.g.l.a.m.a
        public void j(h.x.g.k.d.h hVar) {
        }

        @Override // h.x.g.l.a.m.a
        public void k() {
        }

        @Override // h.x.g.l.a.m.a
        public void l() {
        }

        @Override // h.x.g.l.a.m.a
        public void m(boolean z) {
        }

        @Override // h.x.g.l.a.m.a
        public void n(boolean z) {
        }

        @Override // h.x.g.l.a.m.a
        public void o(boolean z) {
        }

        @Override // h.x.g.l.a.m.a
        public void onFloatPositionChange(int i2, int i3) {
        }

        @Override // h.x.g.l.a.m.a
        public void onResume() {
        }

        @Override // h.x.g.l.a.m.a
        public void p(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends h.x.g.k.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SuperPlayerView f7889a;

        public b(SuperPlayerView superPlayerView) {
        }

        @Override // h.x.g.k.c
        public void a(int i2, String str) {
        }

        @Override // h.x.g.k.c
        public void b(String str) {
        }

        @Override // h.x.g.k.c
        public void c() {
        }

        @Override // h.x.g.k.c
        public void d() {
        }

        @Override // h.x.g.k.c
        public void e() {
        }

        @Override // h.x.g.k.c
        public void f() {
        }

        @Override // h.x.g.k.c
        public void g(long j2, long j3) {
        }

        @Override // h.x.g.k.c
        public void h() {
        }

        @Override // h.x.g.k.c
        public void i(TXLivePlayer tXLivePlayer, String str) {
        }

        @Override // h.x.g.k.c
        public void j(f.e eVar) {
        }

        @Override // h.x.g.k.c
        public void k(int i2) {
        }

        @Override // h.x.g.k.c
        public void l(boolean z, f.e eVar, h.x.g.k.d.h hVar) {
        }

        @Override // h.x.g.k.c
        public void m(boolean z, f.e eVar, h.x.g.k.d.h hVar) {
        }

        @Override // h.x.g.k.c
        public void n(h.x.g.k.d.b bVar, List<h.x.g.k.d.d> list) {
        }

        @Override // h.x.g.k.c
        public void o(List<h.x.g.k.d.h> list, h.x.g.k.d.h hVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7890a = null;
        public static final /* synthetic */ int[] b = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface d {
        void onPrepared();
    }

    public SuperPlayerView(Context context) {
    }

    private void V(f.a aVar) {
    }

    private void e0(String str) {
    }

    public static /* synthetic */ h.x.g.k.a g(SuperPlayerView superPlayerView) {
    }

    public static /* synthetic */ h h(SuperPlayerView superPlayerView) {
    }

    public static /* synthetic */ void i(SuperPlayerView superPlayerView, String str) {
    }

    public static /* synthetic */ m.a j(SuperPlayerView superPlayerView) {
    }

    public static /* synthetic */ h.x.g.d k(SuperPlayerView superPlayerView) {
    }

    public static /* synthetic */ f.c l(SuperPlayerView superPlayerView, f.c cVar) {
    }

    public static /* synthetic */ h.x.g.k.g.b m(SuperPlayerView superPlayerView) {
    }

    public static /* synthetic */ h.x.g.k.g.b n(SuperPlayerView superPlayerView, h.x.g.k.g.b bVar) {
    }

    public static /* synthetic */ float o(SuperPlayerView superPlayerView, float f2) {
    }

    public static /* synthetic */ d p(SuperPlayerView superPlayerView) {
    }

    private void w() {
    }

    private void x() {
    }

    private void y() {
    }

    public static /* synthetic */ void z() {
    }

    public void A() {
    }

    public void B(boolean z) {
    }

    public void C() {
    }

    public void D() {
    }

    public void E() {
    }

    public void F() {
    }

    public void G(int i2, String str) {
    }

    public void H(int i2, String str, String str2) {
    }

    public void I(int i2, List<h.a> list, int i3) {
    }

    public void J(String str) {
    }

    public void K() {
    }

    public void L() {
    }

    public void M() {
    }

    public void N(h hVar) {
    }

    public void O(int i2) {
    }

    public void P(int i2) {
    }

    public void Q(int i2) {
    }

    public void R(int i2) {
    }

    public void S() {
    }

    public void T() {
    }

    public void U() {
    }

    public void W(int i2) {
    }

    public void X() {
    }

    public void Y(String str, String str2, String str3) {
    }

    public void Z(String str, String str2, String str3, String str4, boolean z, boolean z2, Long l2) {
    }

    public void a0(String str, String str2, boolean z, boolean z2, Long l2) {
    }

    public void b0() {
    }

    public void c0(f.c cVar) {
    }

    public void d0(String str, String str2, String str3, boolean z, boolean z2, Long l2) {
    }

    public void finalize() throws Throwable {
    }

    public f.d getCurrentPlayState() {
    }

    public long getCurrentSeconds() {
    }

    public float getDuration() {
    }

    public String getPlayURL() {
    }

    public f.c getPlayerMode() {
    }

    public f.d getPlayerState() {
    }

    public f.c getScreenModel() {
    }

    public TXVodPlayer getTXVodPlayer() {
    }

    public long getTotalSeconds() {
    }

    public boolean getVipSee() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s(FullScreenPlayer fullScreenPlayer) {
    }

    public void setContext(Context context) {
    }

    public void setController(boolean z) {
    }

    public void setFullScreenType(boolean z) {
    }

    public void setFullScreenViewCallBack(FullScreenPlayer fullScreenPlayer) {
    }

    public void setLoop(boolean z) {
    }

    public void setOnPlayerListener(d dVar) {
    }

    public void setPlayerViewCallback(h.x.g.d dVar) {
    }

    public void setWindowPlayTitleShow(boolean z) {
    }

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public SuperPlayerView(Context context, AttributeSet attributeSet) {
    }

    public SuperPlayerView(Context context, AttributeSet attributeSet, int i2) {
    }
}
