package com.showstartfans.activity.view.superplayer;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.model.AuthorInfo;
import com.showstartfans.activity.widget.FollowTextView;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.taihe.videoplayer.SuperPlayerView;
import com.taihe.videoplayer.ui.player.FullScreenPlayer;
import com.taihebase.activity.view.LoadImageView;
import com.tencent.android.tpush.common.MessageKey;
import h.a.a.a.a.i.g;
import h.u.a.w.d0.d2;
import h.u.a.w.d0.w2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: THScenePlayerView.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u001f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\b\u0010.\u001a\u00020+H\u0016J\u0006\u0010/\u001a\u00020+J\u000e\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020\u0015J\u000e\u00102\u001a\u00020+2\u0006\u00101\u001a\u00020\u0017J\u000e\u00103\u001a\u00020+2\u0006\u00101\u001a\u00020\u0019J\u000e\u00104\u001a\u00020+2\u0006\u00101\u001a\u00020\u001bJ\b\u00105\u001a\u00020+H\u0002J\u0012\u00106\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0006\u00107\u001a\u00020+J\b\u00108\u001a\u00020+H\u0016J\b\u00109\u001a\u00020+H\u0016J\u0006\u0010:\u001a\u00020+J\u0006\u0010;\u001a\u00020+J\u0010\u0010;\u001a\u00020+2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010<\u001a\u00020=J\b\u0010>\u001a\u00020+H\u0016J\u0010\u0010?\u001a\u00020+2\u0006\u0010@\u001a\u00020=H\u0016J\b\u0010A\u001a\u00020+H\u0016J\b\u0010B\u001a\u00020+H\u0017J\u0012\u0010C\u001a\u00020+2\b\u0010D\u001a\u0004\u0018\u00010$H\u0016J\b\u0010E\u001a\u00020+H\u0016J\b\u0010F\u001a\u00020+H\u0016J\b\u0010G\u001a\u00020+H\u0016J$\u0010H\u001a\u00020+2\b\u0010I\u001a\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010(2\u0006\u0010L\u001a\u00020\fH\u0016J\b\u0010M\u001a\u00020+H\u0016J\b\u0010N\u001a\u00020+H\u0016J\b\u0010O\u001a\u00020+H\u0016J\b\u0010\u0016\u001a\u00020+H\u0016J\b\u0010\u0018\u001a\u00020+H\u0016J\b\u0010\u001a\u001a\u00020+H\u0016J\u0006\u0010P\u001a\u00020+J\u0006\u0010Q\u001a\u00020+J\u0006\u0010R\u001a\u00020+J\u0006\u0010S\u001a\u00020+J\u0006\u0010T\u001a\u00020+J\u0010\u0010U\u001a\u00020+2\u0006\u0010V\u001a\u00020=H\u0002J\u0012\u0010W\u001a\u00020+2\b\u0010X\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010Y\u001a\u00020+2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010Z\u001a\u00020+2\b\u0010[\u001a\u0004\u0018\u00010\\J\u000e\u0010]\u001a\u00020+2\u0006\u0010^\u001a\u00020\fJ\u0016\u0010_\u001a\u00020+2\u0006\u0010`\u001a\u00020=2\u0006\u0010a\u001a\u00020\fR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006b"}, d2 = {"Lcom/showstartfans/activity/view/superplayer/THScenePlayerView;", "Lcom/taihe/videoplayer/SuperPlayerView;", "Lcom/taihe/videoplayer/OnFullScreenViewCallBack;", "Lcom/showstartfans/activity/widget/popupwindow/ShareMenuListListener;", "Lcom/taihe/videoplayer/OnSuperPlayerViewCallback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bean", "Lcom/showstartfans/activity/model/Article;", "followStatus", "Lcom/showstartfans/activity/widget/FollowTextView;", "lottieView", "Lcom/airbnb/lottie/LottieAnimationView;", "playBtnClick", "Lcom/taihe/videoplayer/callback/OnPlayBtnClickCall;", "playCompleteCall", "Lcom/taihe/videoplayer/callback/OnVideoPlayCompleteCall;", "playReadyCall", "Lcom/taihe/videoplayer/callback/OnVideoPlayReadyCall;", "playStartCall", "Lcom/taihe/videoplayer/callback/OnVideoPlayStartCall;", MessageKey.MSG_SOURCE, "getSource", "()I", "setSource", "(I)V", "userLogo", "Lcom/taihebase/activity/view/LoadImageView;", Oauth2AccessToken.KEY_SCREEN_NAME, "Landroid/widget/TextView;", "userTypeIcon", "Landroid/widget/ImageView;", "videoShareImg", "", "zanButton", "addZanLottieAnimation", "", "parent", "Lcom/taihe/videoplayer/ui/player/FullScreenPlayer;", "backFullScreen", "backPress", "bindPlayBtnClickCall", "call", "bindPlayCompleteCall", "bindPlayReadyCall", "bindPlayStartCall", "bindUserInfoMsg", "dynamicAddFullScreenInfo", "getMediaInfo", "goRequestPlayUrl", "gotoFullScreen", "gotoStation", "intentionEvent", "isFullScreen", "", "newDanmuExample", "onDanmuOpenStatus", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "onFullScreenSendCommDMInputCall", "onFullScreenShareCall", "onFullScreenZanCall", "zan", "onPause", "onPaymentVipCall", "onPlayClick", "onPupMenuViewClick", "view", "Landroid/view/View;", "content", g.C, "onResume", "onStartFullScreenPlay", "onStopFullScreenPlay", "releaseAllWitchPlayer", "resetActivity", "resetAllCall", "resetDialog", "resetVideoByList", "setFollow", "follow", "setFullScreenViewCallBack", "mFullScreenPlayer", "setPlayInfoMsg", "upDateView", "concernSiteBean", "Lcom/showstartfans/activity/model/AuthorInfo;", "updatePlayerFollowStatus", "relationship", "updatePlayerZanStatus", "isCollect", "collectCount", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class THScenePlayerView extends SuperPlayerView implements h.x.g.c, w2, h.x.g.d {
    @Nullable
    private TextView A;
    @Nullable
    private FollowTextView B;
    @Nullable
    private TextView C;
    @Nullable
    private LottieAnimationView D;
    @NotNull
    private String E;
    private int F;
    @NotNull
    public Map<Integer, View> s;
    @Nullable
    private Article t;
    @Nullable
    private h.x.g.j.c u;
    @Nullable
    private h.x.g.j.d v;
    @Nullable
    private h.x.g.j.e w;
    @Nullable
    private h.x.g.j.a x;
    @Nullable
    private LoadImageView y;
    @Nullable
    private ImageView z;

    /* compiled from: THScenePlayerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Article $it;
        public final /* synthetic */ THScenePlayerView this$0;

        public a(THScenePlayerView tHScenePlayerView, Article article) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: THScenePlayerView.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/view/superplayer/THScenePlayerView$onFullScreenSendCommDMInputCall$1", "Lcom/showstartfans/activity/widget/popupwindow/OnDanmuInputCall;", "onDanmuInputCall", "", "inputStr", "", "onDanmuInputDismiss", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements d2 {
        public final /* synthetic */ THScenePlayerView b;

        /* compiled from: THScenePlayerView.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends Lambda implements Function1<Integer, Unit> {
            public final /* synthetic */ String $inputStr;
            public final /* synthetic */ THScenePlayerView this$0;

            public a(THScenePlayerView tHScenePlayerView, String str) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            }

            public final void invoke(int i2) {
            }
        }

        public b(THScenePlayerView tHScenePlayerView) {
        }

        @Override // h.u.a.w.d0.d2
        public void onDanmuInputCall(@Nullable String str) {
        }

        @Override // h.u.a.w.d0.d2
        public void onDanmuInputDismiss() {
        }
    }

    /* compiled from: THScenePlayerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "path", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ THScenePlayerView this$0;

        public c(THScenePlayerView tHScenePlayerView) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
        }
    }

    /* compiled from: THScenePlayerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function1<Boolean, Unit> {
        public static final d INSTANCE = null;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: THScenePlayerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function1<Boolean, Unit> {
        public static final e INSTANCE = null;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    public THScenePlayerView(@NotNull Context context) {
    }

    public static /* synthetic */ void A0(THScenePlayerView tHScenePlayerView, View view) {
    }

    public static /* synthetic */ void B0(LinearLayout linearLayout, THScenePlayerView tHScenePlayerView, View view) {
    }

    public static /* synthetic */ void C0(THScenePlayerView tHScenePlayerView, View view) {
    }

    public static /* synthetic */ void D0(THScenePlayerView tHScenePlayerView, View view) {
    }

    public static /* synthetic */ void E0(THScenePlayerView tHScenePlayerView, ValueAnimator valueAnimator) {
    }

    private static final void F0(THScenePlayerView tHScenePlayerView, Boolean bool) {
    }

    public static final /* synthetic */ Article h0(THScenePlayerView tHScenePlayerView) {
    }

    public static final /* synthetic */ void i0(THScenePlayerView tHScenePlayerView, boolean z) {
    }

    private final void j0(FullScreenPlayer fullScreenPlayer) {
    }

    private static final void k0(THScenePlayerView tHScenePlayerView, ValueAnimator valueAnimator) {
    }

    private final void q0() {
    }

    private static final void r0(LinearLayout linearLayout, THScenePlayerView tHScenePlayerView, View view) {
    }

    private static final void s0(THScenePlayerView tHScenePlayerView, View view) {
    }

    private final void setFollow(boolean z) {
    }

    private static final void t0(THScenePlayerView tHScenePlayerView, View view) {
    }

    private static final void u0(THScenePlayerView tHScenePlayerView, View view) {
    }

    public static /* synthetic */ void z0(THScenePlayerView tHScenePlayerView, Boolean bool) {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void A() {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void B(boolean z) {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void C() {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void D() {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void E() {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void F() {
    }

    public final void G0() {
    }

    public final void H0() {
    }

    public final void I0() {
    }

    public final void J0() {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void K() {
    }

    public final void K0() {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void L() {
    }

    public final void L0(@Nullable AuthorInfo authorInfo) {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void M() {
    }

    public final void M0(int i2) {
    }

    public final void N0(boolean z, int i2) {
    }

    @Override // h.x.g.d
    public void a() {
    }

    @Override // h.x.g.c
    @SuppressLint({"CheckResult"})
    public void b() {
    }

    @Override // h.x.g.c
    public void c(@Nullable TextView textView) {
    }

    @Override // h.x.g.d
    public void d() {
    }

    @Override // h.x.g.c
    public void f() {
    }

    public void f0() {
    }

    @Nullable
    public View g0(int i2) {
    }

    public final void getMediaInfo() {
    }

    public final int getSource() {
    }

    public final void l0() {
    }

    public final void m0(@NotNull h.x.g.j.a aVar) {
    }

    public final void n0(@NotNull h.x.g.j.c cVar) {
    }

    public final void o0(@NotNull h.x.g.j.d dVar) {
    }

    @Override // h.u.a.w.d0.w2
    public void onPupMenuViewClick(@Nullable View view, @Nullable String str, int i2) {
    }

    public final void p0(@NotNull h.x.g.j.e eVar) {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void q() {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void s(@Nullable FullScreenPlayer fullScreenPlayer) {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void setFullScreenViewCallBack(@Nullable FullScreenPlayer fullScreenPlayer) {
    }

    public final void setPlayInfoMsg(@Nullable Article article) {
    }

    public final void setSource(int i2) {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void u() {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void v() {
    }

    public final void v0() {
    }

    public final void w0() {
    }

    public final void x0(@Nullable Article article) {
    }

    public final boolean y0() {
    }

    public THScenePlayerView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
    }

    public THScenePlayerView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i2) {
    }
}
