package com.tencent.thumbplayer.adapter.a.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.TimedText;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.adapter.a.a.a;
import com.tencent.thumbplayer.adapter.a.c;
import com.tencent.thumbplayer.api.TPAudioAttributes;
import com.tencent.thumbplayer.api.TPCaptureCallBack;
import com.tencent.thumbplayer.api.TPCaptureParams;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPProgramInfo;
import com.tencent.thumbplayer.api.TPTrackInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.core.common.TPSubtitleFrame;
import java.io.FileDescriptor;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class e implements com.tencent.thumbplayer.adapter.a.b {
    private c.l A;
    private c.m B;
    private volatile MediaPlayer C;
    private d D;
    private com.tencent.thumbplayer.a.c E;
    private Object F;
    private Future<?> G;
    private final Object H;
    private long I;
    private a J;
    private final Object K;
    private int L;
    private int M;
    private final Object N;
    private Future<?> O;
    private boolean P;
    private volatile EnumC0241e Q;
    private volatile EnumC0241e R;
    private boolean S;
    private long T;
    private long U;
    private int V;
    private int W;
    private volatile boolean X;
    private int Y;
    private int Z;

    /* renamed from: a  reason: collision with root package name */
    private com.tencent.thumbplayer.f.a f12993a;
    private int aa;
    private int ab;
    private int ac;
    private List<b> ad;
    private List<b> ae;
    private com.tencent.thumbplayer.adapter.a.a.a af;
    private long ag;
    private f ah;
    @TargetApi(16)
    private MediaPlayer.OnTimedTextListener ai;
    private Context b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private long f12994d;

    /* renamed from: e  reason: collision with root package name */
    private long f12995e;

    /* renamed from: f  reason: collision with root package name */
    private String f12996f;

    /* renamed from: g  reason: collision with root package name */
    private FileDescriptor f12997g;

    /* renamed from: h  reason: collision with root package name */
    private AssetFileDescriptor f12998h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f12999i;

    /* renamed from: j  reason: collision with root package name */
    private float f13000j;

    /* renamed from: k  reason: collision with root package name */
    private float f13001k;

    /* renamed from: l  reason: collision with root package name */
    private Map<String, String> f13002l;

    /* renamed from: m  reason: collision with root package name */
    private int f13003m;

    /* renamed from: n  reason: collision with root package name */
    private long f13004n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13005o;

    /* renamed from: p  reason: collision with root package name */
    private long f13006p;
    private int q;
    private int r;
    private TPAudioAttributes s;
    private boolean t;
    private c.i u;
    private c.InterfaceC0243c v;
    private c.h w;
    private c.f x;
    private c.j y;
    private c.p z;

    /* renamed from: com.tencent.thumbplayer.adapter.a.a.e$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements a.InterfaceC0240a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f13007a;

        public AnonymousClass1(e eVar) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.a.a.InterfaceC0240a
        public void a(a.d dVar) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.a.a.InterfaceC0240a
        public void a(TPSubtitleFrame tPSubtitleFrame) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.a.a.InterfaceC0240a
        public void a(String str) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.a.a.e$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements a.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f13008a;

        public AnonymousClass2(e eVar) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.a.a.c
        public long a() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.a.a.e$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f13009a;

        public AnonymousClass3(e eVar) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.a.a.b
        public void a(int i2, long j2) {
        }

        @Override // com.tencent.thumbplayer.adapter.a.a.a.b
        public void a(long j2) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.a.a.e$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f13010a;

        public AnonymousClass4(e eVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.a.a.e$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f13011a;
        public final /* synthetic */ e b;

        public AnonymousClass5(e eVar, a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.a.a.e$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f13012a;

        public AnonymousClass6(e eVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.a.a.e$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements MediaPlayer.OnTimedTextListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f13013a;

        public AnonymousClass7(e eVar) {
        }

        @Override // android.media.MediaPlayer.OnTimedTextListener
        public void onTimedText(MediaPlayer mediaPlayer, TimedText timedText) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f13014a;
        public Future<?> b;

        private a() {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public TPTrackInfo f13015a;
        public String b;
        public List<TPOptionalParam> c;

        private b() {
        }

        public /* synthetic */ b(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class c implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private Handler f13016a;

        public c(Handler handler) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class d implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f13017a;

        private d(e eVar) {
        }

        public /* synthetic */ d(e eVar, AnonymousClass1 anonymousClass1) {
        }

        private int a(int i2) {
        }

        private int b(int i2) {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* renamed from: com.tencent.thumbplayer.adapter.a.a.e$e  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class EnumC0241e {

        /* renamed from: a  reason: collision with root package name */
        public static final EnumC0241e f13018a = null;
        public static final EnumC0241e b = null;
        public static final EnumC0241e c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final EnumC0241e f13019d = null;

        /* renamed from: e  reason: collision with root package name */
        public static final EnumC0241e f13020e = null;

        /* renamed from: f  reason: collision with root package name */
        public static final EnumC0241e f13021f = null;

        /* renamed from: g  reason: collision with root package name */
        public static final EnumC0241e f13022g = null;

        /* renamed from: h  reason: collision with root package name */
        public static final EnumC0241e f13023h = null;

        /* renamed from: i  reason: collision with root package name */
        public static final EnumC0241e f13024i = null;

        /* renamed from: j  reason: collision with root package name */
        public static final EnumC0241e f13025j = null;

        /* renamed from: k  reason: collision with root package name */
        private static final /* synthetic */ EnumC0241e[] f13026k = null;

        private EnumC0241e(String str, int i2) {
        }

        public static EnumC0241e valueOf(String str) {
        }

        public static EnumC0241e[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public int f13027a;
        public long b;
        public long c;

        /* renamed from: d  reason: collision with root package name */
        public int f13028d;

        /* renamed from: e  reason: collision with root package name */
        public int f13029e;

        /* renamed from: f  reason: collision with root package name */
        public int f13030f;

        /* renamed from: g  reason: collision with root package name */
        public String f13031g;

        /* renamed from: h  reason: collision with root package name */
        public EnumC0241e f13032h;

        private f() {
        }

        public /* synthetic */ f(AnonymousClass1 anonymousClass1) {
        }
    }

    public e(Context context, com.tencent.thumbplayer.f.b bVar) {
    }

    public static /* synthetic */ int A(e eVar) {
    }

    private void A() {
    }

    public static /* synthetic */ int B(e eVar) {
    }

    private synchronized void B() {
    }

    private void C() {
    }

    private void D() {
    }

    private synchronized void E() {
    }

    private boolean F() {
    }

    public static /* synthetic */ int a(e eVar, int i2) {
    }

    private MediaPlayer a() {
    }

    public static /* synthetic */ EnumC0241e a(e eVar, EnumC0241e enumC0241e) {
    }

    public static /* synthetic */ c.l a(e eVar) {
    }

    private void a(MediaPlayer mediaPlayer) {
    }

    private void a(MediaPlayer mediaPlayer, int i2, @TPCommonEnum.TPSeekMode int i3) {
    }

    private synchronized void a(f fVar) {
    }

    private void a(TPAudioAttributes tPAudioAttributes) {
    }

    private boolean a(EnumC0241e enumC0241e) {
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
    }

    public static /* synthetic */ int b(e eVar, int i2) {
    }

    public static /* synthetic */ EnumC0241e b(e eVar, EnumC0241e enumC0241e) {
    }

    public static /* synthetic */ c.m b(e eVar) {
    }

    private void b() {
    }

    private void b(AssetFileDescriptor assetFileDescriptor) {
    }

    private boolean b(EnumC0241e enumC0241e) {
    }

    public static /* synthetic */ boolean b(e eVar, boolean z) {
    }

    public static /* synthetic */ com.tencent.thumbplayer.f.a c(e eVar) {
    }

    private void c() {
    }

    public static /* synthetic */ int d(int i2) {
    }

    public static /* synthetic */ c.h d(e eVar) {
    }

    private void d() {
    }

    private void d(int i2, long j2) {
    }

    public static /* synthetic */ EnumC0241e e(e eVar) {
    }

    private void e() {
    }

    private void e(int i2) {
    }

    private void e(int i2, long j2) {
    }

    private int f(int i2) {
    }

    public static /* synthetic */ com.tencent.thumbplayer.adapter.a.a.a f(e eVar) {
    }

    private void f(int i2, long j2) {
    }

    private static int g(int i2) {
    }

    public static /* synthetic */ void g(e eVar) {
    }

    public static /* synthetic */ void h(e eVar) {
    }

    public static /* synthetic */ c.f i(e eVar) {
    }

    public static /* synthetic */ void j(e eVar) {
    }

    public static /* synthetic */ boolean k(e eVar) {
    }

    public static /* synthetic */ void l(e eVar) {
    }

    public static /* synthetic */ MediaPlayer m(e eVar) {
    }

    public static /* synthetic */ int n(e eVar) {
    }

    public static /* synthetic */ boolean o(e eVar) {
    }

    public static /* synthetic */ void p(e eVar) {
    }

    public static /* synthetic */ void q(e eVar) {
    }

    public static /* synthetic */ c.InterfaceC0243c r(e eVar) {
    }

    public static /* synthetic */ boolean s(e eVar) {
    }

    public static /* synthetic */ void t(e eVar) {
    }

    public static /* synthetic */ int u(e eVar) {
    }

    private void u() {
    }

    public static /* synthetic */ int v(e eVar) {
    }

    private synchronized void v() {
    }

    public static /* synthetic */ c.p w(e eVar) {
    }

    private void w() {
    }

    public static /* synthetic */ EnumC0241e x(e eVar) {
    }

    private void x() {
    }

    public static /* synthetic */ c.j y(e eVar) {
    }

    private void y() {
    }

    public static /* synthetic */ int z(e eVar) {
    }

    private synchronized void z() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(float f2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public void a(int i2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    @TargetApi(26)
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
    @TargetApi(23)
    public void b(float f2) {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    @TargetApi(16)
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
    public synchronized void i() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public synchronized void j() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public synchronized void k() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public synchronized void l() {
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
    @TargetApi(16)
    public TPTrackInfo[] r() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public TPProgramInfo[] s() {
    }

    @Override // com.tencent.thumbplayer.adapter.a.b
    public long t() {
    }
}
