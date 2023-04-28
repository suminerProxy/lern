package com.showstartfans.activity.view.superplayer;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableImage;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.DanMuCusItem;
import com.showstartfans.activity.model.FindVideoBean;
import com.showstartfans.activity.model.MessageDetailLettersBean;
import com.showstartfans.activity.model.VocalConcertDetailPhotoBean;
import com.showstartfans.activity.widget.FollowTextView;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.taihe.videoplayer.SuperPlayerView;
import com.taihe.videoplayer.ui.player.FullScreenPlayer;
import com.taihebase.activity.view.LoadImageView;
import h.u.a.w.d0.d2;
import h.u.a.w.d0.w2;
import h.y.a.n.j1;
import h.y.a.n.u0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: THSuperPlayerView.kt */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u001a\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u000eH\u0016J\u0012\u00102\u001a\u00020.2\b\u00103\u001a\u0004\u0018\u000104H\u0002J\b\u00105\u001a\u00020.H\u0016J\u0006\u00106\u001a\u00020.J\u000e\u00107\u001a\u00020.2\u0006\u00108\u001a\u00020\u001bJ\u000e\u00109\u001a\u00020.2\u0006\u00108\u001a\u00020\u001dJ\u000e\u0010:\u001a\u00020.2\u0006\u00108\u001a\u00020\u0019J\u000e\u0010;\u001a\u00020.2\u0006\u00108\u001a\u00020\u001fJ\u000e\u0010<\u001a\u00020.2\u0006\u00108\u001a\u00020!J\u000e\u0010=\u001a\u00020.2\u0006\u0010\"\u001a\u00020#J\b\u0010>\u001a\u00020.H\u0002J\u0012\u0010?\u001a\u00020.2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0018\u0010@\u001a\u00020.2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020BH\u0002J\u0006\u0010D\u001a\u00020.J5\u0010E\u001a\u00020.2\u0006\u0010F\u001a\u00020\u000e2#\u0010G\u001a\u001f\u0012\u0013\u0012\u00110+¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020.\u0018\u00010HH\u0002J\b\u0010L\u001a\u00020.H\u0016J\u0006\u0010M\u001a\u00020.J\u0006\u0010N\u001a\u00020.J\u0010\u0010N\u001a\u00020.2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0006\u0010O\u001a\u00020PJ\b\u0010Q\u001a\u00020.H\u0016J\u0010\u0010R\u001a\u00020.2\u0006\u0010S\u001a\u00020PH\u0016J\b\u0010T\u001a\u00020.H\u0016J\b\u0010U\u001a\u00020.H\u0016J\u0012\u0010V\u001a\u00020.2\b\u0010W\u001a\u0004\u0018\u00010'H\u0016J\u001c\u0010X\u001a\u00020.2\b\u0010Y\u001a\u0004\u0018\u00010Z2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\b\u0010]\u001a\u00020.H\u0016J\b\u0010^\u001a\u00020.H\u0016J\b\u0010_\u001a\u00020.H\u0016J$\u0010`\u001a\u00020.2\b\u0010a\u001a\u0004\u0018\u00010b2\b\u0010c\u001a\u0004\u0018\u00010+2\u0006\u0010d\u001a\u00020\u000eH\u0016J\b\u0010e\u001a\u00020.H\u0016J\b\u0010f\u001a\u00020.H\u0016J\b\u0010g\u001a\u00020.H\u0016J\b\u0010\u001c\u001a\u00020.H\u0016J\b\u0010\u001e\u001a\u00020.H\u0016J\b\u0010 \u001a\u00020.H\u0016J\u0010\u0010h\u001a\u00020.2\u0006\u0010i\u001a\u00020\u000eH\u0016J\u0010\u0010j\u001a\u00020.2\u0006\u0010i\u001a\u00020\u000eH\u0016J\u0010\u0010k\u001a\u00020.2\u0006\u0010i\u001a\u00020\u000eH\u0016J\u0010\u0010l\u001a\u00020.2\u0006\u0010i\u001a\u00020\u000eH\u0016J\u0006\u0010m\u001a\u00020.J\u0006\u0010n\u001a\u00020.J\u0006\u0010o\u001a\u00020.J\u0006\u0010p\u001a\u00020.J\u0006\u0010q\u001a\u00020.J\u001a\u0010r\u001a\u00020.2\u0006\u0010s\u001a\u00020t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0010\u0010u\u001a\u00020.2\u0006\u0010v\u001a\u00020PH\u0002J\u0012\u0010w\u001a\u00020.2\b\u0010x\u001a\u0004\u0018\u000104H\u0016J\u001a\u0010y\u001a\u00020.2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010z\u001a\u00020PJ\u0010\u0010{\u001a\u00020.2\b\u0010|\u001a\u0004\u0018\u00010\u0011J\u0010\u0010}\u001a\u00020.2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010~\u001a\u00020.2\u0006\u0010\u007f\u001a\u00020\u000eJ\u0010\u0010\u0080\u0001\u001a\u00020.2\u0007\u0010\u0081\u0001\u001a\u00020PR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0082\u0001"}, d2 = {"Lcom/showstartfans/activity/view/superplayer/THSuperPlayerView;", "Lcom/taihe/videoplayer/SuperPlayerView;", "Lcom/taihe/videoplayer/OnFullScreenViewCallBack;", "Lcom/showstartfans/activity/widget/popupwindow/ShareMenuListListener;", "Lcom/taihebase/activity/listener/OnHandlerListener;", "Lcom/tai/danmuku/OnDanmuItemClick;", "Lcom/taihe/videoplayer/OnSuperPlayerViewCallback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bean", "Lcom/showstartfans/activity/model/FindVideoBean;", "followStatus", "Lcom/showstartfans/activity/widget/FollowTextView;", "handler", "Lcom/taihebase/activity/utils/WeakHandler;", "lottieView", "Lcom/airbnb/lottie/LottieAnimationView;", "paymentClickCall", "Lcom/taihe/videoplayer/callback/OnPlayPaymentClickCall;", "playBtnClick", "Lcom/taihe/videoplayer/callback/OnPlayBtnClickCall;", "playCompleteCall", "Lcom/taihe/videoplayer/callback/OnVideoPlayCompleteCall;", "playReadyCall", "Lcom/taihe/videoplayer/callback/OnVideoPlayReadyCall;", "playStartCall", "Lcom/taihe/videoplayer/callback/OnVideoPlayStartCall;", "playTwentyCall", "Lcom/taihe/videoplayer/callback/OnVideoPlayTwentyCall;", "userLogo", "Lcom/taihebase/activity/view/LoadImageView;", Oauth2AccessToken.KEY_SCREEN_NAME, "Landroid/widget/TextView;", "userTypeIcon", "Landroid/widget/ImageView;", "videoShareImg", "", "zanButton", "OnDanmuItemClick", "", "baseDanmaku", "Lcom/tai/danmuku/danmu/danmaku/model/BaseDanmaku;", "type", "addZanLottieAnimation", "parent", "Lcom/taihe/videoplayer/ui/player/FullScreenPlayer;", "backFullScreen", "backPress", "bindPlayBtnClickCall", "call", "bindPlayCompleteCall", "bindPlayPaymentClickCall", "bindPlayReadyCall", "bindPlayStartCall", "bindPlayTwentyCall", "bindUserInfoMsg", "dynamicAddFullScreenInfo", "getBarrageList", "startTime", "", "endTime", "getMediaInfo", "getRealVideoUrl", "videoId", "callBack", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "url", "goRequestPlayUrl", "gotoStation", "intentionEvent", "isFullScreen", "", "newDanmuExample", "onDanmuOpenStatus", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "onFullScreenSendCommDMInputCall", "onFullScreenShareCall", "onFullScreenZanCall", "zan", "onHandlerMessage", "activity", "Landroid/app/Activity;", "msg", "Landroid/os/Message;", "onPause", "onPaymentVipCall", "onPlayClick", "onPupMenuViewClick", "view", "Landroid/view/View;", "content", h.a.a.a.a.i.g.C, "onResume", "onStartFullScreenPlay", "onStopFullScreenPlay", "playingFifty", "progress", "playingSeventyFive", "playingTwenty", "playingTwentyFive", "releaseAllWitchPlayer", "resetActivity", "resetAllCall", "resetDialog", "resetVideoByList", "sendMsg", "danMuCusItem", "Lcom/showstartfans/activity/model/DanMuCusItem;", "setFollow", "follow", "setFullScreenViewCallBack", "mFullScreenPlayer", "setPlayInfoMsg", "autoPlay", "upDateView", "concernSiteBean", "updatePaySuccessInfoMsg", "updatePlayerFollowStatus", "relationship", "updatePlayerZanStatus", "isCollect", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class THSuperPlayerView extends SuperPlayerView implements h.x.g.c, w2, h.y.a.k.f, h.w.a.c, h.x.g.d {
    @Nullable
    private LoadImageView A;
    @Nullable
    private ImageView B;
    @Nullable
    private TextView C;
    @Nullable
    private FollowTextView D;
    @Nullable
    private TextView E;
    @Nullable
    private LottieAnimationView F;
    @Nullable
    private j1 G;
    @NotNull
    private String H;
    @NotNull
    public Map<Integer, View> s;
    @Nullable
    private FindVideoBean t;
    @Nullable
    private h.x.g.j.f u;
    @Nullable
    private h.x.g.j.c v;
    @Nullable
    private h.x.g.j.d w;
    @Nullable
    private h.x.g.j.e x;
    @Nullable
    private h.x.g.j.a y;
    @Nullable
    private h.x.g.j.b z;

    /* compiled from: THSuperPlayerView.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/view/superplayer/THSuperPlayerView$OnDanmuItemClick$1", "Lcom/tai/danmuku/OnDanmuItemClickAPI;", "OnDanmuItemJB", "", "baseDanmaku", "Lcom/tai/danmuku/danmu/danmaku/model/BaseDanmaku;", "OnDanmuItemRemove", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements h.w.a.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ THSuperPlayerView f7246a;

        /* compiled from: THSuperPlayerView.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.showstartfans.activity.view.superplayer.THSuperPlayerView$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class C0138a extends Lambda implements Function1<Boolean, Unit> {
            public static final C0138a INSTANCE = null;

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            }

            public final void invoke(boolean z) {
            }
        }

        public a(THSuperPlayerView tHSuperPlayerView) {
        }

        private static final void c(THSuperPlayerView tHSuperPlayerView, h.w.a.e.b.b.d dVar, View view, String str, int i2) {
        }

        public static /* synthetic */ void d(THSuperPlayerView tHSuperPlayerView, h.w.a.e.b.b.d dVar, View view, String str, int i2) {
        }

        @Override // h.w.a.d
        public void a(@Nullable h.w.a.e.b.b.d dVar) {
        }

        @Override // h.w.a.d
        public void b(@Nullable h.w.a.e.b.b.d dVar) {
        }
    }

    /* compiled from: THSuperPlayerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ LinearLayout $this_apply;
        public final /* synthetic */ THSuperPlayerView this$0;

        public b(THSuperPlayerView tHSuperPlayerView, LinearLayout linearLayout) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: THSuperPlayerView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/showstartfans/activity/model/MessageDetailLettersBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<List<? extends MessageDetailLettersBean>, Unit> {
        public final /* synthetic */ THSuperPlayerView this$0;

        /* compiled from: THSuperPlayerView.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/view/superplayer/THSuperPlayerView$getBarrageList$1$1$1$1", "Lcom/taihebase/activity/listener/OnGetBitmapListenerCall;", "onFailure_", "", "dataSource", "Lcom/facebook/datasource/DataSource;", "Lcom/facebook/common/references/CloseableReference;", "Lcom/facebook/imagepipeline/image/CloseableImage;", "onSuccess_", "bitmap", "Landroid/graphics/Bitmap;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends h.y.a.k.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DanMuCusItem f7247a;
            public final /* synthetic */ THSuperPlayerView b;

            public a(DanMuCusItem danMuCusItem, THSuperPlayerView tHSuperPlayerView) {
            }

            @Override // h.y.a.k.d
            public void a(@Nullable DataSource<CloseableReference<CloseableImage>> dataSource) {
            }

            @Override // h.y.a.k.d
            public void b(@Nullable Bitmap bitmap) {
            }
        }

        public c(THSuperPlayerView tHSuperPlayerView) {
        }

        public static /* synthetic */ void a(List list, u0 u0Var, THSuperPlayerView tHSuperPlayerView) {
        }

        /* renamed from: invoke$lambda-1$lambda-0  reason: not valid java name */
        private static final void m29invoke$lambda1$lambda0(List list, u0 u0Var, THSuperPlayerView tHSuperPlayerView) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends MessageDetailLettersBean> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable List<? extends MessageDetailLettersBean> list) {
        }
    }

    /* compiled from: THSuperPlayerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/VocalConcertDetailPhotoBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function1<VocalConcertDetailPhotoBean, Unit> {
        public final /* synthetic */ THSuperPlayerView this$0;

        public d(THSuperPlayerView tHSuperPlayerView) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(VocalConcertDetailPhotoBean vocalConcertDetailPhotoBean) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable VocalConcertDetailPhotoBean vocalConcertDetailPhotoBean) {
        }
    }

    /* compiled from: THSuperPlayerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ Function1<String, Unit> $callBack;
        public final /* synthetic */ THSuperPlayerView this$0;

        public e(Function1<? super String, Unit> function1, THSuperPlayerView tHSuperPlayerView) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
        }
    }

    /* compiled from: THSuperPlayerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ THSuperPlayerView this$0;

        public f(THSuperPlayerView tHSuperPlayerView) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
        }
    }

    /* compiled from: THSuperPlayerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ FindVideoBean $bean;
        public final /* synthetic */ THSuperPlayerView this$0;

        public g(FindVideoBean findVideoBean, THSuperPlayerView tHSuperPlayerView) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
        }
    }

    /* compiled from: THSuperPlayerView.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/view/superplayer/THSuperPlayerView$onFullScreenSendCommDMInputCall$1", "Lcom/showstartfans/activity/widget/popupwindow/OnDanmuInputCall;", "onDanmuInputCall", "", "inputStr", "", "onDanmuInputDismiss", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class h implements d2 {
        public final /* synthetic */ THSuperPlayerView b;

        /* compiled from: THSuperPlayerView.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/MessageDetailLettersBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends Lambda implements Function1<MessageDetailLettersBean, Unit> {
            public final /* synthetic */ String $inputStr;
            public final /* synthetic */ THSuperPlayerView this$0;

            public a(THSuperPlayerView tHSuperPlayerView, String str) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MessageDetailLettersBean messageDetailLettersBean) {
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable MessageDetailLettersBean messageDetailLettersBean) {
            }
        }

        public h(THSuperPlayerView tHSuperPlayerView) {
        }

        @Override // h.u.a.w.d0.d2
        public void onDanmuInputCall(@Nullable String str) {
        }

        @Override // h.u.a.w.d0.d2
        public void onDanmuInputDismiss() {
        }
    }

    /* compiled from: THSuperPlayerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class i extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ THSuperPlayerView this$0;

        public i(THSuperPlayerView tHSuperPlayerView) {
        }

        public static /* synthetic */ void a(THSuperPlayerView tHSuperPlayerView, DialogInterface dialogInterface) {
        }

        /* renamed from: invoke$lambda-0  reason: not valid java name */
        private static final void m30invoke$lambda0(THSuperPlayerView tHSuperPlayerView, DialogInterface dialogInterface) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable String str) {
        }
    }

    /* compiled from: THSuperPlayerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class j extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ THSuperPlayerView this$0;

        public j(THSuperPlayerView tHSuperPlayerView) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: THSuperPlayerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class k extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ boolean $autoPlay;
        public final /* synthetic */ FindVideoBean $bean;
        public final /* synthetic */ THSuperPlayerView this$0;

        public k(FindVideoBean findVideoBean, boolean z, THSuperPlayerView tHSuperPlayerView) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
        }
    }

    public THSuperPlayerView(@NotNull Context context) {
    }

    private static final void A0(THSuperPlayerView tHSuperPlayerView, View view) {
    }

    private static final void B0(LinearLayout linearLayout, THSuperPlayerView tHSuperPlayerView, View view) {
    }

    private final void C0(long j2, long j3) {
    }

    private final void D0(int i2, Function1<? super String, Unit> function1) {
    }

    public static /* synthetic */ void I0(THSuperPlayerView tHSuperPlayerView, DialogInterface dialogInterface) {
    }

    public static /* synthetic */ void J0(LinearLayout linearLayout, THSuperPlayerView tHSuperPlayerView, View view) {
    }

    public static /* synthetic */ void K0(THSuperPlayerView tHSuperPlayerView, View view) {
    }

    public static /* synthetic */ void L0(THSuperPlayerView tHSuperPlayerView, View view) {
    }

    public static /* synthetic */ void M0(THSuperPlayerView tHSuperPlayerView, View view, String str, int i2) {
    }

    public static /* synthetic */ void N0(THSuperPlayerView tHSuperPlayerView, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void O0(THSuperPlayerView tHSuperPlayerView, View view) {
    }

    private static final void P0(THSuperPlayerView tHSuperPlayerView, View view, String str, int i2) {
    }

    private static final void Q0(THSuperPlayerView tHSuperPlayerView, DialogInterface dialogInterface) {
    }

    private final void W0(DanMuCusItem danMuCusItem, j1 j1Var) {
    }

    public static /* synthetic */ void Y0(THSuperPlayerView tHSuperPlayerView, FindVideoBean findVideoBean, boolean z, int i2, Object obj) {
    }

    public static final /* synthetic */ FindVideoBean h0(THSuperPlayerView tHSuperPlayerView) {
    }

    public static final /* synthetic */ FollowTextView i0(THSuperPlayerView tHSuperPlayerView) {
    }

    public static final /* synthetic */ j1 j0(THSuperPlayerView tHSuperPlayerView) {
    }

    public static final /* synthetic */ TextView k0(THSuperPlayerView tHSuperPlayerView) {
    }

    public static final /* synthetic */ void l0(THSuperPlayerView tHSuperPlayerView, DanMuCusItem danMuCusItem, j1 j1Var) {
    }

    public static final /* synthetic */ void m0(THSuperPlayerView tHSuperPlayerView, j1 j1Var) {
    }

    public static final /* synthetic */ void n0(THSuperPlayerView tHSuperPlayerView, String str) {
    }

    private final void o0(FullScreenPlayer fullScreenPlayer) {
    }

    private static final void p0(THSuperPlayerView tHSuperPlayerView, ValueAnimator valueAnimator) {
    }

    private final void setFollow(boolean z) {
    }

    private final void x0() {
    }

    private static final void y0(THSuperPlayerView tHSuperPlayerView, View view) {
    }

    private static final void z0(THSuperPlayerView tHSuperPlayerView, View view) {
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

    public final void E0() {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void F() {
    }

    public final void F0() {
    }

    public final void G0(@Nullable FindVideoBean findVideoBean) {
    }

    public final boolean H0() {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void K() {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void L() {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void M() {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void O(int i2) {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void P(int i2) {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void Q(int i2) {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void R(int i2) {
    }

    public final void R0() {
    }

    public final void S0() {
    }

    public final void T0() {
    }

    public final void U0() {
    }

    public final void V0() {
    }

    public final void X0(@Nullable FindVideoBean findVideoBean, boolean z) {
    }

    public final void Z0(@Nullable FindVideoBean findVideoBean) {
    }

    @Override // h.x.g.d
    public void a() {
    }

    public final void a1(@Nullable FindVideoBean findVideoBean) {
    }

    @Override // h.x.g.c
    public void b() {
    }

    public final void b1(int i2) {
    }

    @Override // h.x.g.c
    public void c(@Nullable TextView textView) {
    }

    public final void c1(boolean z) {
    }

    @Override // h.x.g.d
    public void d() {
    }

    @Override // h.w.a.c
    public void e(@Nullable h.w.a.e.b.b.d dVar, int i2) {
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

    @Override // h.y.a.k.f
    public void onHandlerMessage(@Nullable Activity activity, @Nullable Message message) {
    }

    @Override // h.u.a.w.d0.w2
    public void onPupMenuViewClick(@Nullable View view, @Nullable String str, int i2) {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void q() {
    }

    public final void q0() {
    }

    public final void r0(@NotNull h.x.g.j.a aVar) {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void s(@Nullable FullScreenPlayer fullScreenPlayer) {
    }

    public final void s0(@NotNull h.x.g.j.c cVar) {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void setFullScreenViewCallBack(@Nullable FullScreenPlayer fullScreenPlayer) {
    }

    public final void t0(@NotNull h.x.g.j.b bVar) {
    }

    @Override // com.taihe.videoplayer.SuperPlayerView
    public void u() {
    }

    public final void u0(@NotNull h.x.g.j.d dVar) {
    }

    public final void v0(@NotNull h.x.g.j.e eVar) {
    }

    public final void w0(@NotNull h.x.g.j.f fVar) {
    }

    public THSuperPlayerView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
    }

    public THSuperPlayerView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i2) {
    }
}
