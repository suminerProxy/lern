package com.showstartfans.activity.activitys.maintab;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.showstartfans.activity.eventmodel.LoginEvent;
import com.showstartfans.activity.eventmodel.RefreshPayVideoStatusEvent;
import com.showstartfans.activity.eventmodel.RefreshVideoDetailEvent;
import com.showstartfans.activity.eventmodel.RefreshVideoItemCommNumEvent;
import com.showstartfans.activity.eventmodel.VideoListLikeEvent;
import com.showstartfans.activity.eventmodel.VideoListUserFollowEvent;
import com.showstartfans.activity.model.VideoDetailBean;
import com.showstartfans.activity.model.VideoDetailCommBean;
import com.showstartfans.activity.view.superplayer.THSuperPlayerView;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import h.u.a.c.f0.p9;
import h.u.a.w.c0.t2;
import h.u.a.w.d0.w2;
import h.y.a.m.n;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoDetailActivity.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 o2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001oB\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010'H\u0002J\b\u0010,\u001a\u00020*H\u0002J\u0006\u0010-\u001a\u00020.J\u0018\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u0011H\u0002J\b\u00102\u001a\u00020*H\u0002J\b\u00103\u001a\u00020*H\u0002J\u0006\u00104\u001a\u00020*J\u0010\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020\u000eH\u0002J\u0006\u00107\u001a\u00020*J\b\u00108\u001a\u00020*H\u0014J\b\u00109\u001a\u00020*H\u0014J\b\u0010:\u001a\u00020*H\u0002J\b\u0010;\u001a\u00020*H\u0014J\b\u0010<\u001a\u00020*H\u0002J\b\u0010=\u001a\u00020*H\u0016J\b\u0010>\u001a\u00020*H\u0014J\u0012\u0010?\u001a\u00020*2\b\u0010@\u001a\u0004\u0018\u00010AH\u0007J\u0012\u0010?\u001a\u00020*2\b\u0010@\u001a\u0004\u0018\u00010BH\u0007J\u0012\u0010?\u001a\u00020*2\b\u0010@\u001a\u0004\u0018\u00010CH\u0007J\u0012\u0010?\u001a\u00020*2\b\u0010@\u001a\u0004\u0018\u00010DH\u0007J\u0012\u0010?\u001a\u00020*2\b\u0010@\u001a\u0004\u0018\u00010EH\u0007J\u0012\u0010?\u001a\u00020*2\b\u0010@\u001a\u0004\u0018\u00010FH\u0007J\u001a\u0010G\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u000e2\b\u0010@\u001a\u0004\u0018\u00010IH\u0016J\u0012\u0010J\u001a\u00020*2\b\u0010K\u001a\u0004\u0018\u00010LH\u0014J\b\u0010M\u001a\u00020*H\u0014J$\u0010N\u001a\u00020*2\b\u0010O\u001a\u0004\u0018\u00010P2\b\u0010Q\u001a\u0004\u0018\u00010\f2\u0006\u0010R\u001a\u00020\u000eH\u0016J\b\u0010S\u001a\u00020*H\u0014J\u0012\u0010T\u001a\u00020*2\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J\b\u0010W\u001a\u00020*H\u0014J\u0010\u0010X\u001a\u00020*2\u0006\u0010Y\u001a\u00020\u0011H\u0002J\u0010\u0010Z\u001a\u00020*2\u0006\u0010[\u001a\u00020\u000eH\u0002J\u0010\u0010\\\u001a\u00020*2\u0006\u0010]\u001a\u00020\u000eH\u0002J\b\u0010^\u001a\u00020*H\u0002J\b\u0010_\u001a\u00020*H\u0002J\b\u0010`\u001a\u00020*H\u0002J\b\u0010a\u001a\u00020\u000eH\u0014J\u0010\u0010b\u001a\u00020*2\u0006\u0010+\u001a\u00020'H\u0002J*\u0010c\u001a\u00020*2\b\u0010d\u001a\u0004\u0018\u00010e2\u0006\u0010f\u001a\u00020\u000e2\u0006\u0010g\u001a\u00020\u00112\u0006\u0010h\u001a\u00020\u0011H\u0002J\b\u0010i\u001a\u00020*H\u0002J\b\u0010j\u001a\u00020*H\u0002J\u0010\u0010k\u001a\u00020*2\b\u0010l\u001a\u0004\u0018\u00010'J\u000e\u0010m\u001a\u00020*2\u0006\u0010(\u001a\u00020\u000eJ\b\u0010n\u001a\u00020*H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b \u0010!R\u000e\u0010#\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006p"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/VideoDetailActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "Lcom/mob/moblink/SceneRestorable;", "Lcom/showstartfans/activity/widget/popupwindow/ShareMenuListListener;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/maintab/VideoDetailCommHomeAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/maintab/VideoDetailCommHomeAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "commId", "", "commType", "", "fromType", "globalPlayer", "", "increasePostId", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "getLoadMoreAction", "()Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "loadMoreAction$delegate", "loginRefresh", "pageNo", "playerView", "Lcom/showstartfans/activity/view/superplayer/THSuperPlayerView;", "quickShare", "recordPlayTwenty", "shareDialog", "Lcom/showstartfans/activity/widget/dialog/ShareVideoListDialog;", "getShareDialog", "()Lcom/showstartfans/activity/widget/dialog/ShareVideoListDialog;", "shareDialog$delegate", "tabFindVideoPointFragmentIndex", "timer", "Landroid/os/CountDownTimer;", "videoDetailBean", "Lcom/showstartfans/activity/model/VideoDetailBean;", "videoId", "coverData", "", "bean", "followUser", "getCurrentPlaySeconds", "", "getVideoComm", "changeType", "showProgress", "getVideoDetailInfo", "getVideoSharePic", "increasePost", "increaseSet", "quickType", "increaseUpdate", "initData", "initListener", "initPlayerView", "initView", "newPlayer", "onBackPressed", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/LoginEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshPayVideoStatusEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshVideoDetailEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshVideoItemCommNumEvent;", "Lcom/showstartfans/activity/eventmodel/VideoListLikeEvent;", "Lcom/showstartfans/activity/eventmodel/VideoListUserFollowEvent;", "onKeyDown", "keyCode", "Landroid/view/KeyEvent;", "onNewIntent", "intent", "Landroid/content/Intent;", "onPause", "onPupMenuViewClick", "view", "Landroid/view/View;", "content", h.a.a.a.a.i.g.C, "onResume", "onReturnSceneData", "p0", "Lcom/mob/moblink/Scene;", "onStop", "quickSharePost", "bottomShare", "refreshComm", "type", "refreshDetail", "videoIds", "resetDetailInfo", "restoreListPlayer", "scrollToItemComm", "setContentViewRes", "setFollowStatus", "setZanIcon", "zanView", "Landroid/widget/TextView;", "praiseNum", "isCollect", "topXY", "shareQuickClick", "timeTask", "upDateView", "concernSiteBean", "updateVideoPayInfoById", "zanVideo", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class VideoDetailActivity extends BaseNoToolBarActivity implements SceneRestorable, w2 {
    @NotNull
    public static final a t = null;
    @NotNull
    public Map<Integer, View> b;
    private int c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f5911d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private String f5912e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5913f;

    /* renamed from: g  reason: collision with root package name */
    private int f5914g;

    /* renamed from: h  reason: collision with root package name */
    private int f5915h;

    /* renamed from: i  reason: collision with root package name */
    private int f5916i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private VideoDetailBean f5917j;

    /* renamed from: k  reason: collision with root package name */
    private int f5918k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5919l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5920m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private CountDownTimer f5921n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private THSuperPlayerView f5922o;

    /* renamed from: p  reason: collision with root package name */
    private int f5923p;
    @NotNull
    private final Lazy q;
    @NotNull
    private final Lazy r;
    @NotNull
    private final Lazy s;

    /* compiled from: VideoDetailActivity.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\bH\u0007J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH\u0007¨\u0006\u0011"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/VideoDetailActivity$Companion;", "", "()V", "start", "", "ctx", "Landroid/content/Context;", "videoInfoId", "", "commId", "", "globalPlayer", "", "sceneView", "Landroid/view/View;", "fromType", "tabVideoPointFragmentIndex", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ void c(a aVar, Context context, int i2, String str, boolean z, int i3, int i4, Object obj) {
        }

        public static /* synthetic */ void d(a aVar, Context context, int i2, String str, boolean z, View view, int i3, int i4, int i5, Object obj) {
        }

        @JvmStatic
        public final void a(@Nullable Context context, int i2, @NotNull String str, boolean z, int i3) {
        }

        @JvmStatic
        public final void b(@Nullable Context context, int i2, @NotNull String str, boolean z, @NotNull View view, int i3, int i4) {
        }
    }

    /* compiled from: VideoDetailActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/VideoDetailCommHomeAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<p9> {
        public final /* synthetic */ VideoDetailActivity this$0;

        public b(VideoDetailActivity videoDetailActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ p9 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final p9 invoke() {
        }
    }

    /* compiled from: VideoDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Ref.IntRef $wish;
        public final /* synthetic */ VideoDetailActivity this$0;

        public c(VideoDetailActivity videoDetailActivity, Ref.IntRef intRef) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: VideoDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/showstartfans/activity/model/VideoDetailCommBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function1<List<? extends VideoDetailCommBean>, Unit> {
        public final /* synthetic */ boolean $changeType;
        public final /* synthetic */ VideoDetailActivity this$0;

        public d(VideoDetailActivity videoDetailActivity, boolean z) {
        }

        public static /* synthetic */ void a(VideoDetailActivity videoDetailActivity) {
        }

        /* renamed from: invoke$lambda-0  reason: not valid java name */
        private static final void m20invoke$lambda0(VideoDetailActivity videoDetailActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends VideoDetailCommBean> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable List<? extends VideoDetailCommBean> list) {
        }
    }

    /* compiled from: VideoDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function1<Object, Unit> {
        public final /* synthetic */ VideoDetailActivity this$0;

        /* compiled from: VideoDetailActivity.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ VideoDetailActivity this$0;

            public a(VideoDetailActivity videoDetailActivity) {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public e(VideoDetailActivity videoDetailActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Object obj) {
        }
    }

    /* compiled from: VideoDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ VideoDetailActivity this$0;

        public f(VideoDetailActivity videoDetailActivity) {
        }

        public static /* synthetic */ void a(VideoDetailActivity videoDetailActivity, String str, View view, String str2, int i2) {
        }

        /* renamed from: invoke$lambda-0  reason: not valid java name */
        private static final void m21invoke$lambda0(VideoDetailActivity videoDetailActivity, String str, View view, String str2, int i2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable String str) {
        }
    }

    /* compiled from: VideoDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ VideoDetailActivity this$0;

        public g(VideoDetailActivity videoDetailActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
        }
    }

    /* compiled from: VideoDetailActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class h extends Lambda implements Function0<h.v.a.d> {
        public static final h INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.v.a.d invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.v.a.d invoke() {
        }
    }

    /* compiled from: VideoDetailActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/widget/dialog/ShareVideoListDialog;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class i extends Lambda implements Function0<t2> {
        public final /* synthetic */ VideoDetailActivity this$0;

        public i(VideoDetailActivity videoDetailActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ t2 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final t2 invoke() {
        }
    }

    /* compiled from: VideoDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/VideoDetailActivity$timeTask$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class j extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VideoDetailActivity f5924a;

        public j(VideoDetailActivity videoDetailActivity) {
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j2) {
        }
    }

    /* compiled from: VideoDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class k extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ VideoDetailActivity this$0;

        public k(VideoDetailActivity videoDetailActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    public static final /* synthetic */ boolean A(VideoDetailActivity videoDetailActivity) {
    }

    public static /* synthetic */ void A0(THSuperPlayerView tHSuperPlayerView, VideoDetailActivity videoDetailActivity) {
    }

    public static final /* synthetic */ h.v.a.d B(VideoDetailActivity videoDetailActivity) {
    }

    public static /* synthetic */ void B0(VideoDetailActivity videoDetailActivity, View view) {
    }

    public static final /* synthetic */ int C(VideoDetailActivity videoDetailActivity) {
    }

    public static /* synthetic */ void C0(VideoDetailActivity videoDetailActivity, View view) {
    }

    public static final /* synthetic */ THSuperPlayerView D(VideoDetailActivity videoDetailActivity) {
    }

    public static /* synthetic */ void D0(VideoDetailActivity videoDetailActivity, View view) {
    }

    public static final /* synthetic */ VideoDetailBean E(VideoDetailActivity videoDetailActivity) {
    }

    public static /* synthetic */ void E0(VideoDetailActivity videoDetailActivity) {
    }

    public static final /* synthetic */ void F(VideoDetailActivity videoDetailActivity) {
    }

    public static /* synthetic */ void F0(VideoDetailActivity videoDetailActivity, View view) {
    }

    public static final /* synthetic */ void G(VideoDetailActivity videoDetailActivity, int i2) {
    }

    public static /* synthetic */ void G0(VideoDetailActivity videoDetailActivity, View view) {
    }

    public static final /* synthetic */ void H(VideoDetailActivity videoDetailActivity) {
    }

    public static /* synthetic */ void H0(VideoDetailActivity videoDetailActivity, int i2) {
    }

    public static final /* synthetic */ void I(VideoDetailActivity videoDetailActivity) {
    }

    public static /* synthetic */ void I0(VideoDetailActivity videoDetailActivity, View view) {
    }

    public static final /* synthetic */ void J(VideoDetailActivity videoDetailActivity) {
    }

    private final void J0() {
    }

    public static final /* synthetic */ void K(VideoDetailActivity videoDetailActivity) {
    }

    private static final void K0(THSuperPlayerView tHSuperPlayerView) {
    }

    public static final /* synthetic */ void L(VideoDetailActivity videoDetailActivity, VideoDetailBean videoDetailBean) {
    }

    private static final void L0(THSuperPlayerView tHSuperPlayerView, VideoDetailActivity videoDetailActivity) {
    }

    public static final /* synthetic */ void M(VideoDetailActivity videoDetailActivity, boolean z) {
    }

    private final void M0(boolean z) {
    }

    public static final /* synthetic */ void N(VideoDetailActivity videoDetailActivity, String str) {
    }

    private final void N0(int i2) {
    }

    public static final /* synthetic */ void O(VideoDetailActivity videoDetailActivity, boolean z) {
    }

    private final void O0(int i2) {
    }

    public static final /* synthetic */ void P(VideoDetailActivity videoDetailActivity, TextView textView, int i2, boolean z, boolean z2) {
    }

    private final void P0() {
    }

    private final void Q(VideoDetailBean videoDetailBean) {
    }

    private final void Q0() {
    }

    private static final void R(VideoDetailBean videoDetailBean, VideoDetailActivity videoDetailActivity, View view) {
    }

    private final void R0() {
    }

    private static final void S(VideoDetailActivity videoDetailActivity, int i2) {
    }

    private final void S0(VideoDetailBean videoDetailBean) {
    }

    private final void T() {
    }

    private final void T0(TextView textView, int i2, boolean z, boolean z2) {
    }

    private final p9 U() {
    }

    private final void U0() {
    }

    @JvmStatic
    public static final void V0(@Nullable Context context, int i2, @NotNull String str, boolean z, int i3) {
    }

    private final h.v.a.d W() {
    }

    @JvmStatic
    public static final void W0(@Nullable Context context, int i2, @NotNull String str, boolean z, @NotNull View view, int i3, int i4) {
    }

    private final t2 X() {
    }

    private final void X0() {
    }

    private final void Y(boolean z, boolean z2) {
    }

    private final void Z() {
    }

    private final void a0() {
    }

    private final void a1() {
    }

    private final void c0(int i2) {
    }

    private static final void e0(VideoDetailActivity videoDetailActivity, boolean z) {
    }

    private static final void f0(VideoDetailActivity videoDetailActivity, View view) {
    }

    private static final void g0(VideoDetailActivity videoDetailActivity, View view) {
    }

    private static final void h0(VideoDetailActivity videoDetailActivity, View view) {
    }

    private static final void i0(VideoDetailActivity videoDetailActivity) {
    }

    private static final void j0(VideoDetailActivity videoDetailActivity, View view) {
    }

    private static final void k0(VideoDetailActivity videoDetailActivity, View view) {
    }

    private static final void l0(VideoDetailActivity videoDetailActivity, View view) {
    }

    private static final void m0(VideoDetailActivity videoDetailActivity, View view) {
    }

    private static final void n0(VideoDetailActivity videoDetailActivity, View view) {
    }

    private static final void o0(VideoDetailActivity videoDetailActivity, View view) {
    }

    private static final void p0(VideoDetailActivity videoDetailActivity, View view) {
    }

    private static final void q0(VideoDetailActivity videoDetailActivity, View view) {
    }

    private final void r0() {
    }

    public static /* synthetic */ void s0(VideoDetailActivity videoDetailActivity, View view) {
    }

    public static /* synthetic */ void t0(VideoDetailActivity videoDetailActivity, View view) {
    }

    public static /* synthetic */ void u0(VideoDetailActivity videoDetailActivity, View view) {
    }

    public static /* synthetic */ void v0(VideoDetailActivity videoDetailActivity, boolean z) {
    }

    public static final /* synthetic */ void w(VideoDetailActivity videoDetailActivity, VideoDetailBean videoDetailBean) {
    }

    public static /* synthetic */ void w0(VideoDetailActivity videoDetailActivity, View view) {
    }

    public static final /* synthetic */ void x(VideoDetailActivity videoDetailActivity, int i2, n nVar, Function0 function0) {
    }

    public static /* synthetic */ void x0(VideoDetailBean videoDetailBean, VideoDetailActivity videoDetailActivity, View view) {
    }

    public static final /* synthetic */ p9 y(VideoDetailActivity videoDetailActivity) {
    }

    public static /* synthetic */ void y0(VideoDetailActivity videoDetailActivity, View view) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity z(VideoDetailActivity videoDetailActivity) {
    }

    public static /* synthetic */ void z0(THSuperPlayerView tHSuperPlayerView) {
    }

    public final long V() {
    }

    public final void Y0(@Nullable VideoDetailBean videoDetailBean) {
    }

    public final void Z0(int i2) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    public final void b0() {
    }

    public final void d0() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initData() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable VideoListUserFollowEvent videoListUserFollowEvent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, @Nullable KeyEvent keyEvent) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // h.u.a.w.d0.w2
    public void onPupMenuViewClick(@Nullable View view, @Nullable String str, int i2) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.mob.moblink.SceneRestorable
    public void onReturnSceneData(@Nullable Scene scene) {
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable VideoListLikeEvent videoListLikeEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshVideoDetailEvent refreshVideoDetailEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshVideoItemCommNumEvent refreshVideoItemCommNumEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable LoginEvent loginEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshPayVideoStatusEvent refreshPayVideoStatusEvent) {
    }
}
