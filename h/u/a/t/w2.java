package h.u.a.t;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.showstartfans.activity.model.actdes.MusicBean;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: PlayerEngine.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class w2 implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener {
    public TextView b;
    private WeakReference<ProgressWheel> c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<ProgressWheel> f24593d;

    /* renamed from: e  reason: collision with root package name */
    public MusicBean f24594e;

    /* renamed from: f  reason: collision with root package name */
    private Timer f24595f;

    /* renamed from: g  reason: collision with root package name */
    private e f24596g;

    /* renamed from: h  reason: collision with root package name */
    private f f24597h;

    /* renamed from: i  reason: collision with root package name */
    private int f24598i;

    /* renamed from: j  reason: collision with root package name */
    private List<MusicBean> f24599j;

    /* renamed from: k  reason: collision with root package name */
    private List<Integer> f24600k;

    /* renamed from: l  reason: collision with root package name */
    private d f24601l;

    /* renamed from: m  reason: collision with root package name */
    private Handler f24602m;

    /* compiled from: PlayerEngine.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements Handler.Callback {
        public final /* synthetic */ w2 b;

        public a(w2 w2Var) {
        }

        private /* synthetic */ void a(float f2) {
        }

        public /* synthetic */ void b(float f2) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* compiled from: PlayerEngine.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends TimerTask {
        public final /* synthetic */ w2 b;

        public b(w2 w2Var) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: PlayerEngine.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24603a = null;
    }

    /* compiled from: PlayerEngine.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface e {
        void onProgress(float f2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: PlayerEngine.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f {
        private static final /* synthetic */ f[] $VALUES = null;
        public static final f NORMAL = null;
        public static final f REPEAT = null;
        public static final f SHUFFLE = null;
        public static final f SHUFFLE_AND_REPEAT = null;

        private f(String str, int i2) {
        }

        public static f valueOf(String str) {
        }

        public static f[] values() {
        }
    }

    private void O() {
    }

    public static /* synthetic */ e a(w2 w2Var) {
    }

    public static /* synthetic */ WeakReference b(w2 w2Var) {
    }

    public static /* synthetic */ WeakReference c(w2 w2Var) {
    }

    public static /* synthetic */ d d(w2 w2Var) {
    }

    public static /* synthetic */ Handler e(w2 w2Var) {
    }

    private void f() {
    }

    private int l() {
    }

    private MusicBean n(int i2) {
    }

    private int s(MusicBean musicBean) {
    }

    private String t(int i2) {
    }

    private boolean u() {
    }

    public void A() {
    }

    public void B() {
    }

    public void C() {
    }

    public void D() {
    }

    public void E(int i2) {
    }

    public w2 F(List<MusicBean> list) {
    }

    public void G(e eVar) {
    }

    public void H(ProgressWheel progressWheel) {
    }

    public void I(ProgressWheel progressWheel) {
    }

    public void J(f fVar) {
    }

    public w2 K(MusicBean musicBean) {
    }

    public w2 L(String str) {
    }

    public void M(int i2) {
    }

    public void N() {
    }

    public void P() {
    }

    public void Q() {
    }

    public void R() {
    }

    public void g(int i2) {
    }

    public int h() {
    }

    public String i() {
    }

    public int j() {
    }

    public String k() {
    }

    public ProgressWheel m() {
    }

    public f o() {
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
    }

    public f p() {
    }

    public String q() {
    }

    public String r() {
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
    }

    public boolean v() {
    }

    public boolean w() {
    }

    public void x() {
    }

    public void y() {
    }

    public void z() {
    }

    /* compiled from: PlayerEngine.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d extends MediaPlayer {

        /* renamed from: a  reason: collision with root package name */
        private boolean f24604a;
        public final /* synthetic */ w2 b;

        private d(w2 w2Var) {
        }

        public boolean a() {
        }

        public void b() {
        }

        public void c(String str) {
        }

        public void d() {
        }

        public void e() {
        }

        @Override // android.media.MediaPlayer
        public void pause() throws IllegalStateException {
        }

        @Override // android.media.MediaPlayer
        public void reset() {
        }

        @Override // android.media.MediaPlayer
        public void start() throws IllegalStateException {
        }

        @Override // android.media.MediaPlayer
        public void stop() throws IllegalStateException {
        }

        public /* synthetic */ d(w2 w2Var, a aVar) {
        }
    }
}
