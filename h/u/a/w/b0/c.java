package h.u.a.w.b0;

import android.app.Dialog;
import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.taihebase.activity.view.LoadImageView;
import h.w.a.e.b.b.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DanmuDialog.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0006\u0010\u001f\u001a\u00020\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/showstartfans/activity/widget/danmu/DanmuDialog;", "Landroid/app/Dialog;", "mContext", "Landroid/content/Context;", "HorizontalScreen", "", "bean", "Lcom/tai/danmuku/danmu/danmaku/model/BaseDanmaku;", "listener", "Lcom/tai/danmuku/OnDanmuItemClickAPI;", "(Landroid/content/Context;ZLcom/tai/danmuku/danmu/danmaku/model/BaseDanmaku;Lcom/tai/danmuku/OnDanmuItemClickAPI;)V", "getBean", "()Lcom/tai/danmuku/danmu/danmaku/model/BaseDanmaku;", "button", "Landroid/widget/TextView;", "danmuStr", "jbIcon", "Landroid/widget/ImageView;", "getListener", "()Lcom/tai/danmuku/OnDanmuItemClickAPI;", "userLogo", "Lcom/taihebase/activity/view/LoadImageView;", "userLogoType", "userMsg", "Landroid/widget/RelativeLayout;", Oauth2AccessToken.KEY_SCREEN_NAME, "countDown", "", "initViews", "view", "Landroid/view/View;", "showS", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class c extends Dialog {
    @NotNull
    private final d b;
    @NotNull
    private final h.w.a.d c;

    /* renamed from: d  reason: collision with root package name */
    private LoadImageView f24997d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f24998e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f24999f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f25000g;

    /* renamed from: h  reason: collision with root package name */
    private RelativeLayout f25001h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f25002i;

    /* renamed from: j  reason: collision with root package name */
    private ImageView f25003j;

    /* compiled from: DanmuDialog.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/widget/danmu/DanmuDialog$countDown$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f25004a;

        public a(c cVar) {
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j2) {
        }
    }

    public c(@NotNull Context context, boolean z, @NotNull d dVar, @NotNull h.w.a.d dVar2) {
    }

    private final void a() {
    }

    private final void d(View view) {
    }

    private static final void e(c cVar, View view) {
    }

    private static final void f(int i2, c cVar, View view) {
    }

    public static /* synthetic */ void g(c cVar, View view) {
    }

    public static /* synthetic */ void h(int i2, c cVar, View view) {
    }

    @NotNull
    public final d b() {
    }

    @NotNull
    public final h.w.a.d c() {
    }

    public final void i() {
    }
}
