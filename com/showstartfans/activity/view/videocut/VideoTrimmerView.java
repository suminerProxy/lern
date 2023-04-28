package com.showstartfans.activity.view.videocut;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.view.videocut.RangeSeekBarView;
import com.taihe.ffmpeg.FFmpegUtil;
import h.u.a.u.f4.d;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class VideoTrimmerView extends FrameLayout {
    private static final String H = "VideoTrimmerView";
    public static final int I = 60;
    public static final long J = 3000;
    public static final long K = 60000;
    public static final int L = 10;
    public static int M;
    public static int N;
    public static int O;
    private static int P;
    private static int Q;
    private Handler A;
    private String B;
    private boolean C;
    private boolean D;
    private final RangeSeekBarView.a E;
    private final RecyclerView.OnScrollListener F;
    private Runnable G;
    private boolean b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private Context f7305d;

    /* renamed from: e  reason: collision with root package name */
    private ZVideoView f7306e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView f7307f;

    /* renamed from: g  reason: collision with root package name */
    private RangeSeekBarView f7308g;

    /* renamed from: h  reason: collision with root package name */
    private LinearLayout f7309h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f7310i;

    /* renamed from: j  reason: collision with root package name */
    private Uri f7311j;

    /* renamed from: k  reason: collision with root package name */
    private h.u.a.u.f4.f f7312k;

    /* renamed from: l  reason: collision with root package name */
    private long f7313l;

    /* renamed from: m  reason: collision with root package name */
    private h.u.a.u.f4.g f7314m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7315n;

    /* renamed from: o  reason: collision with root package name */
    private float f7316o;

    /* renamed from: p  reason: collision with root package name */
    private long f7317p;
    private long q;
    private long r;
    private long s;
    private long t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private int y;
    private ValueAnimator z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends d.a {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Context f7318i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Uri f7319j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ long f7320k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ long f7321l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ int f7322m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ VideoTrimmerView f7323n;

        public a(VideoTrimmerView videoTrimmerView, String str, long j2, String str2, Context context, Uri uri, long j3, long j4, int i2) {
        }

        private /* synthetic */ void l(Bitmap bitmap) throws Exception {
        }

        @Override // h.u.a.u.f4.d.a
        public void j() {
        }

        public /* synthetic */ void m(Bitmap bitmap) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements MediaPlayer.OnPreparedListener {
        public final /* synthetic */ VideoTrimmerView b;

        public b(VideoTrimmerView videoTrimmerView) {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements FFmpegUtil.onCallBack {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7324a;
        public final /* synthetic */ VideoTrimmerView b;

        public c(VideoTrimmerView videoTrimmerView, String str) {
        }

        @Override // com.taihe.ffmpeg.FFmpegUtil.onCallBack
        public void onComplete() {
        }

        @Override // com.taihe.ffmpeg.FFmpegUtil.onCallBack
        public void onFailure() {
        }

        @Override // com.taihe.ffmpeg.FFmpegUtil.onCallBack
        public void onProgress(float f2) {
        }

        @Override // com.taihe.ffmpeg.FFmpegUtil.onCallBack
        public void onStart() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d implements RangeSeekBarView.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VideoTrimmerView f7325a;

        public d(VideoTrimmerView videoTrimmerView) {
        }

        @Override // com.showstartfans.activity.view.videocut.RangeSeekBarView.a
        public void a(RangeSeekBarView rangeSeekBarView, long j2, long j3, int i2, boolean z, RangeSeekBarView.b bVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class e extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VideoTrimmerView f7326a;

        public e(VideoTrimmerView videoTrimmerView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ FrameLayout.LayoutParams b;
        public final /* synthetic */ VideoTrimmerView c;

        public f(VideoTrimmerView videoTrimmerView, FrameLayout.LayoutParams layoutParams) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class g implements Runnable {
        public final /* synthetic */ VideoTrimmerView b;

        public g(VideoTrimmerView videoTrimmerView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public VideoTrimmerView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ h.u.a.u.f4.f A(VideoTrimmerView videoTrimmerView) {
    }

    public static /* synthetic */ long B(VideoTrimmerView videoTrimmerView) {
    }

    public static /* synthetic */ long C(VideoTrimmerView videoTrimmerView, long j2) {
    }

    public static /* synthetic */ long D(VideoTrimmerView videoTrimmerView) {
    }

    public static /* synthetic */ long E(VideoTrimmerView videoTrimmerView, long j2) {
    }

    public static /* synthetic */ long F(VideoTrimmerView videoTrimmerView) {
    }

    public static /* synthetic */ long G(VideoTrimmerView videoTrimmerView, long j2) {
    }

    public static /* synthetic */ long H(VideoTrimmerView videoTrimmerView) {
    }

    public static /* synthetic */ long I(VideoTrimmerView videoTrimmerView, long j2) {
    }

    private int K() {
    }

    private void M() {
    }

    private void N(Context context) {
    }

    private void O() {
    }

    private void U() {
    }

    private void V() {
    }

    private void W() {
    }

    private void X() {
    }

    private void Y() {
    }

    private void Z(long j2) {
    }

    public static /* synthetic */ boolean a(VideoTrimmerView videoTrimmerView) {
    }

    private void a0() {
    }

    public static /* synthetic */ int b() {
    }

    private void b0(Context context, Uri uri, int i2, long j2, long j3) {
    }

    public static /* synthetic */ void c(VideoTrimmerView videoTrimmerView) {
    }

    private void c0() {
    }

    public static /* synthetic */ boolean d(VideoTrimmerView videoTrimmerView) {
    }

    private void d0(MediaPlayer mediaPlayer) {
    }

    public static /* synthetic */ boolean e(VideoTrimmerView videoTrimmerView, boolean z) {
    }

    public static /* synthetic */ void f(VideoTrimmerView videoTrimmerView, long j2) {
    }

    public static /* synthetic */ void g(VideoTrimmerView videoTrimmerView) {
    }

    private boolean getRestoreState() {
    }

    public static /* synthetic */ RangeSeekBarView h(VideoTrimmerView videoTrimmerView) {
    }

    public static /* synthetic */ int i(VideoTrimmerView videoTrimmerView) {
    }

    public static /* synthetic */ int j(VideoTrimmerView videoTrimmerView) {
    }

    public static /* synthetic */ int k(VideoTrimmerView videoTrimmerView, int i2) {
    }

    public static /* synthetic */ int l(VideoTrimmerView videoTrimmerView) {
    }

    public static /* synthetic */ boolean m(VideoTrimmerView videoTrimmerView, boolean z) {
    }

    public static /* synthetic */ float n(VideoTrimmerView videoTrimmerView) {
    }

    public static /* synthetic */ float o(VideoTrimmerView videoTrimmerView, float f2) {
    }

    public static /* synthetic */ h.u.a.u.f4.g p(VideoTrimmerView videoTrimmerView) {
    }

    public static /* synthetic */ int q(VideoTrimmerView videoTrimmerView) {
    }

    public static /* synthetic */ long r(VideoTrimmerView videoTrimmerView) {
    }

    public static /* synthetic */ long s(VideoTrimmerView videoTrimmerView) {
    }

    private void setPlayPauseViewIcon(boolean z) {
    }

    public static /* synthetic */ long t(VideoTrimmerView videoTrimmerView, long j2) {
    }

    public static /* synthetic */ ZVideoView u(VideoTrimmerView videoTrimmerView) {
    }

    public static /* synthetic */ void v(VideoTrimmerView videoTrimmerView, boolean z) {
    }

    public static /* synthetic */ ImageView w(VideoTrimmerView videoTrimmerView) {
    }

    public static /* synthetic */ void x(VideoTrimmerView videoTrimmerView) {
    }

    public static /* synthetic */ void y(VideoTrimmerView videoTrimmerView, MediaPlayer mediaPlayer) {
    }

    public static /* synthetic */ boolean z(VideoTrimmerView videoTrimmerView, boolean z) {
    }

    public void J(ZVideoView zVideoView) {
    }

    public void L(String str) {
    }

    public void P(Uri uri) {
    }

    public boolean Q() {
    }

    public void R() {
    }

    public void S() {
    }

    public void T() {
    }

    public void setOnTrimVideoListener(h.u.a.u.f4.f fVar) {
    }

    public void setRestoreState(boolean z) {
    }

    public VideoTrimmerView(Context context, AttributeSet attributeSet, int i2) {
    }
}
