package h.u.a.w.e0;

import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import com.showstartfans.activity.widget.video.VideoEnabledWebView;

/* compiled from: VideoEnabledWebChromeClient.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class e extends WebChromeClient implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {
    private View b;
    private ViewGroup c;

    /* renamed from: d  reason: collision with root package name */
    private View f25319d;

    /* renamed from: e  reason: collision with root package name */
    private VideoEnabledWebView f25320e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25321f;

    /* renamed from: g  reason: collision with root package name */
    private FrameLayout f25322g;

    /* renamed from: h  reason: collision with root package name */
    private WebChromeClient.CustomViewCallback f25323h;

    /* renamed from: i  reason: collision with root package name */
    private a f25324i;

    /* compiled from: VideoEnabledWebChromeClient.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface a {
        void a(boolean z);
    }

    public e() {
    }

    public boolean a() {
    }

    public void b(a aVar) {
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    public e(View view, ViewGroup viewGroup) {
    }

    public e(View view, ViewGroup viewGroup, View view2) {
    }

    public e(View view, ViewGroup viewGroup, View view2, VideoEnabledWebView videoEnabledWebView) {
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
    }
}
