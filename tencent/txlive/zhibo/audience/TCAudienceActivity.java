package tencent.txlive.zhibo.audience;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.showstartfans.activity.eventmodel.FloatWindowViewEvent;
import com.showstartfans.activity.eventmodel.LiveGiftPaySuccEvent;
import com.showstartfans.activity.eventmodel.LivePaySuccessEvent;
import com.showstartfans.activity.eventmodel.MobileConnChangeEvent;
import com.showstartfans.activity.eventmodel.OpenGiftPopEvent;
import com.showstartfans.activity.eventmodel.OpenOtherMediaEvent;
import com.showstartfans.activity.eventmodel.RefreshLivePlayEvent;
import com.showstartfans.activity.eventmodel.VideoListUserFollowEvent;
import com.showstartfans.activity.model.LiveDetailNoticeInfoBean;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.tencent.qcloud.tuicore.TUIConstants;
import h.a.a.a.a.i.g;
import h.u.a.w.c0.g2;
import h.u.a.w.c0.s1;
import h.u.a.w.c0.t1;
import h.u.a.w.d0.a2;
import h.u.a.w.d0.d2;
import h.u.a.w.d0.f2;
import h.u.a.w.d0.w2;
import h.u.a.w.d0.y1;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tencent.txlive.zhibo.msg.TCChatEntity;
import tencent.txlive.zhibo.msg.TCChatListAdapter;
import tencent.txlive.zhibo.msg.TCSimpleUserInfo;
import tencent.txlive.zhibo.ui.gift.LiveGiftView;
import tencent.txlive.zhibo.widget.LiveCommInput;

/* compiled from: TCAudienceActivity.kt */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\rH\u0016J\b\u0010$\u001a\u00020\"H\u0016J\b\u0010%\u001a\u00020\"H\u0016J\b\u0010&\u001a\u00020\"H\u0002J\b\u0010'\u001a\u00020\"H\u0016J\u0018\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020\"H\u0002J\b\u0010-\u001a\u00020\"H\u0002J\b\u0010.\u001a\u00020\"H\u0002J\b\u0010/\u001a\u00020\"H\u0016J\u0010\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\rH\u0002J\u0010\u00102\u001a\u00020\"2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020*H\u0002J\b\u00107\u001a\u00020\"H\u0002J\u000e\u00108\u001a\u00020\"2\u0006\u00109\u001a\u00020*J\u0010\u0010:\u001a\u00020\"2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\"H\u0014J\b\u0010>\u001a\u00020\"H\u0014J\b\u0010?\u001a\u00020\"H\u0002J\b\u0010@\u001a\u00020\"H\u0002J\b\u0010A\u001a\u00020\"H\u0014J\u0010\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\rH\u0016J\b\u0010D\u001a\u00020\"H\u0002J\u0010\u0010E\u001a\u00020\"2\u0006\u0010F\u001a\u00020GH\u0016J\u001a\u0010H\u001a\u00020\"2\u0006\u00109\u001a\u00020*2\b\u0010I\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010J\u001a\u00020\"2\u0006\u0010F\u001a\u00020GH\u0016J\u0010\u0010K\u001a\u00020\"2\u0006\u0010F\u001a\u00020LH\u0016J\b\u0010M\u001a\u00020\"H\u0016J\b\u0010N\u001a\u00020\"H\u0016J\b\u0010O\u001a\u00020\"H\u0002J\b\u0010P\u001a\u00020\"H\u0016J\u0012\u0010Q\u001a\u00020\"2\b\u0010R\u001a\u0004\u0018\u00010*H\u0016J\b\u0010S\u001a\u00020\"H\u0016J\b\u0010T\u001a\u00020\"H\u0014J\u0012\u0010U\u001a\u00020\"2\b\u0010V\u001a\u0004\u0018\u00010WH\u0007J\u0012\u0010U\u001a\u00020\"2\b\u0010V\u001a\u0004\u0018\u00010XH\u0007J\u0012\u0010U\u001a\u00020\"2\b\u0010V\u001a\u0004\u0018\u00010YH\u0007J\u0012\u0010U\u001a\u00020\"2\b\u0010V\u001a\u0004\u0018\u00010ZH\u0007J\u0012\u0010U\u001a\u00020\"2\b\u0010V\u001a\u0004\u0018\u00010[H\u0007J\u0012\u0010U\u001a\u00020\"2\b\u0010V\u001a\u0004\u0018\u00010\\H\u0007J\u0012\u0010U\u001a\u00020\"2\b\u0010V\u001a\u0004\u0018\u00010]H\u0007J\u0012\u0010U\u001a\u00020\"2\b\u0010V\u001a\u0004\u0018\u00010^H\u0007J\b\u0010_\u001a\u00020\"H\u0016J\b\u0010`\u001a\u00020\"H\u0016J\b\u0010a\u001a\u00020\"H\u0016J\u0012\u0010b\u001a\u00020\"2\b\u0010c\u001a\u0004\u0018\u00010dH\u0014J\b\u0010e\u001a\u00020\"H\u0014J\b\u0010f\u001a\u00020\"H\u0016J$\u0010g\u001a\u00020\"2\b\u0010h\u001a\u0004\u0018\u00010i2\b\u0010j\u001a\u0004\u0018\u00010*2\u0006\u0010k\u001a\u00020LH\u0016J\b\u0010l\u001a\u00020\"H\u0014J\u0012\u0010m\u001a\u00020\"2\b\u0010n\u001a\u0004\u0018\u00010oH\u0016J\b\u0010p\u001a\u00020\"H\u0016J\u0016\u0010q\u001a\u00020\"2\u0006\u0010r\u001a\u00020s2\u0006\u00106\u001a\u00020LJ\u0012\u0010t\u001a\u00020\"2\b\u0010u\u001a\u0004\u0018\u00010*H\u0016J\b\u0010v\u001a\u00020\"H\u0016J\u0010\u0010w\u001a\u00020\"2\u0006\u0010x\u001a\u00020yH\u0007J\b\u0010z\u001a\u00020LH\u0014J\u0006\u0010{\u001a\u00020\"J\u0016\u0010|\u001a\u00020\"2\u0006\u0010}\u001a\u00020*2\u0006\u0010~\u001a\u00020yJ\b\u0010\u007f\u001a\u00020\"H\u0016J\t\u0010\u0080\u0001\u001a\u00020\"H\u0016J\u0012\u0010\u0081\u0001\u001a\u00020\"2\u0007\u0010\u0082\u0001\u001a\u00020\rH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0083\u0001"}, d2 = {"Ltencent/txlive/zhibo/audience/TCAudienceActivity;", "Ltencent/txlive/zhibo/audience/BaseTCAudienceActivity;", "Lcom/showstartfans/activity/widget/popupwindow/ShareMenuListListener;", "Lcom/showstartfans/activity/widget/popupwindow/OnLiveManagerControlCall;", "Lcom/showstartfans/activity/widget/popupwindow/OnDanmuInputCall;", "Lcom/showstartfans/activity/widget/dialog/BuyLiveDialogListener;", "Lcom/mob/moblink/SceneRestorable;", "()V", "buyLiveDialog", "Lcom/showstartfans/activity/widget/dialog/BuyLiveDialog;", "danmuInputPop", "Lcom/showstartfans/activity/widget/popupwindow/DanmuInputPop;", "firstSoft", "", "liveInput", "Ltencent/txlive/zhibo/widget/LiveCommInput;", "mChatMsgListAdapter", "Ltencent/txlive/zhibo/msg/TCChatListAdapter;", "mGiftView", "Ltencent/txlive/zhibo/ui/gift/LiveGiftView;", "managerControlPop", "Lcom/showstartfans/activity/widget/popupwindow/LIveManagerControlPop;", "getManagerControlPop", "()Lcom/showstartfans/activity/widget/popupwindow/LIveManagerControlPop;", "managerControlPop$delegate", "Lkotlin/Lazy;", "openGift", "shareDialog", "Lcom/showstartfans/activity/widget/popupwindow/LiveShareDialog;", "shareHorizontalDialog", "Lcom/showstartfans/activity/widget/dialog/LiveShareHorizontalDialog;", "timer", "Landroid/os/CountDownTimer;", "OnLiveMControlJY", "", "isJYL", "OnLiveMControlOver", "OnLiveMControlShare", "backFullScreen", "backLive", "banOnePeople", "mRoomId", "", TUIConstants.TUILive.USER_ID, "countDown", "desLiveAll", "destroyAll", "dismissControlView", "fullMemberBan", "status", "getFirstFrame", "bitmap", "Landroid/graphics/Bitmap;", "getLiveUnPlayInfo", "liveEventId", "goFullScreen", "groupIsFullBan", "groupId", "handlePraiseMsg", "userInfo", "Ltencent/txlive/zhibo/msg/TCSimpleUserInfo;", "initData", "initListener", "initManagerView", "initRoomMsg", "initView", "isAllBanMsg", "allBan", "listenerKeyBar", "notifyGiftMsg", "entity", "Ltencent/txlive/zhibo/msg/TCChatEntity;", "notifyLiveHot", "hotNum", "notifyMsg", "notifyOnlineMember", "", "onActivityNew", "onBackPressed", "onClickUiToggle", "onClose", "onDanmuInputCall", "inputStr", "onDanmuInputDismiss", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/FloatWindowViewEvent;", "Lcom/showstartfans/activity/eventmodel/LiveGiftPaySuccEvent;", "Lcom/showstartfans/activity/eventmodel/LivePaySuccessEvent;", "Lcom/showstartfans/activity/eventmodel/MobileConnChangeEvent;", "Lcom/showstartfans/activity/eventmodel/OpenGiftPopEvent;", "Lcom/showstartfans/activity/eventmodel/OpenOtherMediaEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshLivePlayEvent;", "Lcom/showstartfans/activity/eventmodel/VideoListUserFollowEvent;", "onLiveEnd", "onLivePausePlay", "onLiveResumePlay", "onNewIntent", "intent", "Landroid/content/Intent;", "onPause", "onPayLive", "onPupMenuViewClick", "view", "Landroid/view/View;", "content", g.C, "onResume", "onReturnSceneData", "p0", "Lcom/mob/moblink/Scene;", "onStartPlay", "openLivePlay", "context", "Landroid/content/Context;", "overLiveStatus", "changeMsg", "refreshPlayLive", "remindCla", "day", "", "setContentViewRes", "setJYIcon", "showBuyFrame", "tips", "seeTime", "startTime", "stopTime", "visibiltyLiveVip", "canWatch", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class TCAudienceActivity extends BaseTCAudienceActivity implements w2, f2, d2, t1, SceneRestorable {
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    @Nullable
    private s1 buyLiveDialog;
    @Nullable
    private h.u.a.w.d0.s1 danmuInputPop;
    private boolean firstSoft;
    @Nullable
    private LiveCommInput liveInput;
    @Nullable
    private TCChatListAdapter mChatMsgListAdapter;
    @Nullable
    private LiveGiftView mGiftView;
    @NotNull
    private final Lazy managerControlPop$delegate;
    private boolean openGift;
    @Nullable
    private a2 shareDialog;
    @Nullable
    private g2 shareHorizontalDialog;
    @Nullable
    private CountDownTimer timer;

    public static /* synthetic */ void F(TCAudienceActivity tCAudienceActivity, View view) {
    }

    public static /* synthetic */ void G(TCAudienceActivity tCAudienceActivity) {
    }

    public static /* synthetic */ void H(TCAudienceActivity tCAudienceActivity, View view) {
    }

    public static /* synthetic */ boolean I(TCAudienceActivity tCAudienceActivity, View view, MotionEvent motionEvent) {
    }

    public static /* synthetic */ void J(TCAudienceActivity tCAudienceActivity, View view) {
    }

    public static /* synthetic */ void K(TCAudienceActivity tCAudienceActivity, long j2, boolean z) {
    }

    public static /* synthetic */ void L(TCAudienceActivity tCAudienceActivity, View view) {
    }

    public static /* synthetic */ void M(LiveDetailNoticeInfoBean liveDetailNoticeInfoBean, TCAudienceActivity tCAudienceActivity) {
    }

    public static /* synthetic */ void N(TCAudienceActivity tCAudienceActivity, View view) {
    }

    public static /* synthetic */ void O(TCAudienceActivity tCAudienceActivity, RefreshLivePlayEvent refreshLivePlayEvent) {
    }

    public static /* synthetic */ void P(TCAudienceActivity tCAudienceActivity) {
    }

    public static /* synthetic */ void Q(TCAudienceActivity tCAudienceActivity, View view) {
    }

    public static /* synthetic */ void R(TCAudienceActivity tCAudienceActivity, View view) {
    }

    public static /* synthetic */ void S(TCAudienceActivity tCAudienceActivity) {
    }

    public static /* synthetic */ void T(TCAudienceActivity tCAudienceActivity) {
    }

    public static /* synthetic */ void U(TCAudienceActivity tCAudienceActivity, View view) {
    }

    public static /* synthetic */ void V(TCAudienceActivity tCAudienceActivity, View view) {
    }

    public static /* synthetic */ void W(TCAudienceActivity tCAudienceActivity) {
    }

    public static /* synthetic */ void X(TCAudienceActivity tCAudienceActivity, View view) {
    }

    public static /* synthetic */ void Y(TCAudienceActivity tCAudienceActivity, View view) {
    }

    public static /* synthetic */ void Z(TCAudienceActivity tCAudienceActivity) {
    }

    public static /* synthetic */ void a0(TCAudienceActivity tCAudienceActivity) {
    }

    public static final /* synthetic */ void access$banOnePeople(TCAudienceActivity tCAudienceActivity, String str, String str2) {
    }

    public static final /* synthetic */ s1 access$getBuyLiveDialog$p(TCAudienceActivity tCAudienceActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity access$getCtx(TCAudienceActivity tCAudienceActivity) {
    }

    public static final /* synthetic */ boolean access$getFirstSoft$p(TCAudienceActivity tCAudienceActivity) {
    }

    public static final /* synthetic */ TCChatListAdapter access$getMChatMsgListAdapter$p(TCAudienceActivity tCAudienceActivity) {
    }

    public static final /* synthetic */ CountDownTimer access$getTimer$p(TCAudienceActivity tCAudienceActivity) {
    }

    public static final /* synthetic */ void access$initRoomMsg(TCAudienceActivity tCAudienceActivity) {
    }

    public static final /* synthetic */ void access$setFirstSoft$p(TCAudienceActivity tCAudienceActivity, boolean z) {
    }

    public static final /* synthetic */ void access$visibiltyLiveVip(TCAudienceActivity tCAudienceActivity, boolean z) {
    }

    public static /* synthetic */ boolean b0(TCAudienceActivity tCAudienceActivity, View view, MotionEvent motionEvent) {
    }

    private final void backFullScreen() {
    }

    private final void banOnePeople(String str, String str2) {
    }

    public static /* synthetic */ void c0(TCAudienceActivity tCAudienceActivity, View view) {
    }

    private final void countDown() {
    }

    public static /* synthetic */ void d0(TCAudienceActivity tCAudienceActivity, View view) {
    }

    private final void desLiveAll() {
    }

    /* renamed from: desLiveAll$lambda-52  reason: not valid java name */
    private static final void m1685desLiveAll$lambda52(TCAudienceActivity tCAudienceActivity) {
    }

    private final void destroyAll() {
    }

    public static /* synthetic */ void e0(TCAudienceActivity tCAudienceActivity, View view) {
    }

    public static /* synthetic */ void f0(TCAudienceActivity tCAudienceActivity, View view) {
    }

    private final void fullMemberBan(boolean z) {
    }

    public static /* synthetic */ void g0(LiveDetailNoticeInfoBean liveDetailNoticeInfoBean, TCAudienceActivity tCAudienceActivity) {
    }

    private final void getLiveUnPlayInfo(String str) {
    }

    private final y1 getManagerControlPop() {
    }

    private final void goFullScreen() {
    }

    public static /* synthetic */ void h0(TCAudienceActivity tCAudienceActivity, View view) {
    }

    public static /* synthetic */ void i0(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-1  reason: not valid java name */
    private static final boolean m1686initListener$lambda1(TCAudienceActivity tCAudienceActivity, View view, MotionEvent motionEvent) {
    }

    /* renamed from: initListener$lambda-10  reason: not valid java name */
    private static final void m1687initListener$lambda10(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-10$lambda-9  reason: not valid java name */
    private static final void m1688initListener$lambda10$lambda9(TCAudienceActivity tCAudienceActivity) {
    }

    /* renamed from: initListener$lambda-11  reason: not valid java name */
    private static final void m1689initListener$lambda11(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-12  reason: not valid java name */
    private static final void m1690initListener$lambda12(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-13  reason: not valid java name */
    private static final void m1691initListener$lambda13(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-14  reason: not valid java name */
    private static final void m1692initListener$lambda14(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-17  reason: not valid java name */
    private static final void m1693initListener$lambda17(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-17$lambda-16$lambda-15  reason: not valid java name */
    private static final void m1694initListener$lambda17$lambda16$lambda15(LiveDetailNoticeInfoBean liveDetailNoticeInfoBean, TCAudienceActivity tCAudienceActivity) {
    }

    /* renamed from: initListener$lambda-18  reason: not valid java name */
    private static final void m1695initListener$lambda18(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-19  reason: not valid java name */
    private static final void m1696initListener$lambda19(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-2  reason: not valid java name */
    private static final void m1697initListener$lambda2(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-21  reason: not valid java name */
    private static final boolean m1698initListener$lambda21(TCAudienceActivity tCAudienceActivity, View view, MotionEvent motionEvent) {
    }

    /* renamed from: initListener$lambda-21$lambda-20  reason: not valid java name */
    private static final void m1699initListener$lambda21$lambda20(TCAudienceActivity tCAudienceActivity) {
    }

    /* renamed from: initListener$lambda-22  reason: not valid java name */
    private static final void m1700initListener$lambda22(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-24  reason: not valid java name */
    private static final void m1701initListener$lambda24(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-24$lambda-23  reason: not valid java name */
    private static final void m1702initListener$lambda24$lambda23(TCAudienceActivity tCAudienceActivity) {
    }

    /* renamed from: initListener$lambda-25  reason: not valid java name */
    private static final void m1703initListener$lambda25(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-26  reason: not valid java name */
    private static final void m1704initListener$lambda26(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-3  reason: not valid java name */
    private static final void m1705initListener$lambda3(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-4  reason: not valid java name */
    private static final void m1706initListener$lambda4(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-5  reason: not valid java name */
    private static final void m1707initListener$lambda5(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-6  reason: not valid java name */
    private static final void m1708initListener$lambda6(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-7  reason: not valid java name */
    private static final void m1709initListener$lambda7(TCAudienceActivity tCAudienceActivity, View view) {
    }

    /* renamed from: initListener$lambda-8  reason: not valid java name */
    private static final void m1710initListener$lambda8(TCAudienceActivity tCAudienceActivity, View view) {
    }

    private final void initManagerView() {
    }

    private final void initRoomMsg() {
    }

    /* renamed from: initRoomMsg$lambda-31$lambda-30$lambda-28  reason: not valid java name */
    private static final void m1711initRoomMsg$lambda31$lambda30$lambda28(TCAudienceActivity tCAudienceActivity) {
    }

    /* renamed from: initRoomMsg$lambda-31$lambda-30$lambda-29  reason: not valid java name */
    private static final void m1712initRoomMsg$lambda31$lambda30$lambda29(LiveDetailNoticeInfoBean liveDetailNoticeInfoBean, TCAudienceActivity tCAudienceActivity) {
    }

    public static /* synthetic */ void j0(TCAudienceActivity tCAudienceActivity, View view) {
    }

    public static /* synthetic */ void k0(TCAudienceActivity tCAudienceActivity, View view) {
    }

    public static /* synthetic */ void l0(TCAudienceActivity tCAudienceActivity) {
    }

    private final void listenerKeyBar() {
    }

    public static /* synthetic */ void m0(TCAudienceActivity tCAudienceActivity, View view) {
    }

    private final void onClickUiToggle() {
    }

    /* renamed from: onEvent$lambda-35$lambda-34  reason: not valid java name */
    private static final void m1713onEvent$lambda35$lambda34(TCAudienceActivity tCAudienceActivity, RefreshLivePlayEvent refreshLivePlayEvent) {
    }

    /* renamed from: onEvent$lambda-39$lambda-38  reason: not valid java name */
    private static final void m1714onEvent$lambda39$lambda38(TCAudienceActivity tCAudienceActivity) {
    }

    /* renamed from: onStartPlay$lambda-27  reason: not valid java name */
    private static final void m1715onStartPlay$lambda27(TCAudienceActivity tCAudienceActivity) {
    }

    /* renamed from: remindCla$lambda-50  reason: not valid java name */
    private static final void m1716remindCla$lambda50(TCAudienceActivity tCAudienceActivity, long j2, boolean z) {
    }

    /* renamed from: remindCla$lambda-50$lambda-49  reason: not valid java name */
    private static final void m1717remindCla$lambda50$lambda49(TCAudienceActivity tCAudienceActivity, View view) {
    }

    private final void visibiltyLiveVip(boolean z) {
    }

    /* renamed from: visibiltyLiveVip$lambda-40  reason: not valid java name */
    private static final void m1718visibiltyLiveVip$lambda40(TCAudienceActivity tCAudienceActivity) {
    }

    @Override // h.u.a.w.d0.f2
    public void OnLiveMControlJY(boolean z) {
    }

    @Override // h.u.a.w.d0.f2
    public void OnLiveMControlOver() {
    }

    @Override // h.u.a.w.d0.f2
    public void OnLiveMControlShare() {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void backLive() {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void dismissControlView() {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void getFirstFrame(@NotNull Bitmap bitmap) {
    }

    public final void groupIsFullBan(@NotNull String str) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void handlePraiseMsg(@NotNull TCSimpleUserInfo tCSimpleUserInfo) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity, com.taihebase.activity.base.BaseNewActivity
    public void initData() {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity, com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity, com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void isAllBanMsg(boolean z) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void notifyGiftMsg(@NotNull TCChatEntity tCChatEntity) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void notifyLiveHot(@NotNull String str, @Nullable String str2) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void notifyMsg(@NotNull TCChatEntity tCChatEntity) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void notifyOnlineMember(int i2) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void onActivityNew() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // h.u.a.w.c0.t1
    public void onClose() {
    }

    @Override // h.u.a.w.d0.d2
    public void onDanmuInputCall(@Nullable String str) {
    }

    @Override // h.u.a.w.d0.d2
    public void onDanmuInputDismiss() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable VideoListUserFollowEvent videoListUserFollowEvent) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void onLiveEnd() {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void onLivePausePlay() {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void onLiveResumePlay() {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // h.u.a.w.c0.t1
    public void onPayLive() {
    }

    @Override // h.u.a.w.d0.w2
    public void onPupMenuViewClick(@Nullable View view, @Nullable String str, int i2) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.mob.moblink.SceneRestorable
    public void onReturnSceneData(@Nullable Scene scene) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void onStartPlay() {
    }

    public final void openLivePlay(@NotNull Context context, int i2) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void overLiveStatus(@Nullable String str) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void refreshPlayLive() {
    }

    @SuppressLint({"CheckResult"})
    public final void remindCla(long j2) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity, com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }

    public final void setJYIcon() {
    }

    public final void showBuyFrame(@NotNull String str, long j2) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void startTime() {
    }

    @Override // tencent.txlive.zhibo.audience.BaseTCAudienceActivity
    public void stopTime() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable MobileConnChangeEvent mobileConnChangeEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable OpenOtherMediaEvent openOtherMediaEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshLivePlayEvent refreshLivePlayEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable LivePaySuccessEvent livePaySuccessEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable FloatWindowViewEvent floatWindowViewEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable LiveGiftPaySuccEvent liveGiftPaySuccEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable OpenGiftPopEvent openGiftPopEvent) {
    }
}
