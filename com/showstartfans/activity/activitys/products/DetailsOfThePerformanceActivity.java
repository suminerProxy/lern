package com.showstartfans.activity.activitys.products;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.palette.graphics.Palette;
import cn.sharesdk.framework.InnerShareParams;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.showstartfans.activity.eventmodel.ChangeMusicStatusEvent;
import com.showstartfans.activity.eventmodel.LoginEvent;
import com.showstartfans.activity.eventmodel.PlayMusicEvent;
import com.showstartfans.activity.eventmodel.ReservationEvent;
import com.showstartfans.activity.eventmodel.SubscribecEvent;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.model.CouponBean;
import com.showstartfans.activity.model.ParticipatingBean;
import com.showstartfans.activity.model.PostArticleData;
import com.showstartfans.activity.model.TicketSessionBean;
import com.showstartfans.activity.model.actdes.ActDesBean;
import com.showstartfans.activity.model.actdes.OtherActivitiesBean;
import com.showstartfans.activity.model.actdes.SiteBean;
import com.showstartfans.activity.view.VideoFullView;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import com.taihebase.activity.view.SlideLodeMoreLayout;
import com.tencent.android.tpush.common.Constants;
import h.u.a.c.f0.p8;
import h.u.a.c.k0.e2;
import h.u.a.c.k0.f2;
import h.u.a.c.k0.g2;
import h.u.a.c.k0.i2;
import h.u.a.c.k0.j2;
import h.u.a.c.k0.l2;
import h.u.a.c.k0.n2;
import h.u.a.w.c0.m2;
import h.u.a.w.c0.r2;
import h.u.a.w.d0.w2;
import h.u.a.w.d0.x2;
import h.u.a.w.d0.y2;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DetailsOfThePerformanceActivity.kt */
@Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u009a\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u009a\u0001B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\nH\u0002J\u0018\u0010K\u001a\u00020I2\u0006\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u00020\nH\u0002J\u0018\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020QH\u0002J\u0010\u0010S\u001a\u00020E2\u0006\u0010T\u001a\u000207H\u0002J\b\u0010U\u001a\u00020IH\u0002J\u0010\u0010V\u001a\u00020I2\u0006\u0010L\u001a\u00020\nH\u0002J\u001e\u0010W\u001a\u00020I2\u0006\u0010X\u001a\u00020Y2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020I0[H\u0002J\b\u0010\\\u001a\u00020IH\u0002J\u0010\u0010]\u001a\u00020I2\u0006\u0010M\u001a\u00020^H\u0002J\b\u0010_\u001a\u00020IH\u0002J\b\u0010`\u001a\u00020EH\u0002J\b\u0010a\u001a\u00020IH\u0002J\b\u0010b\u001a\u00020IH\u0014J\b\u0010c\u001a\u00020IH\u0014J\b\u0010d\u001a\u00020IH\u0014J\b\u0010e\u001a\u00020IH\u0002J\u0010\u0010f\u001a\u00020\u001a2\u0006\u0010g\u001a\u000207H\u0002J\b\u0010h\u001a\u00020\u001aH\u0002J\b\u0010i\u001a\u00020IH\u0002J\b\u0010j\u001a\u00020IH\u0016J\u0012\u0010k\u001a\u00020I2\b\u0010l\u001a\u0004\u0018\u00010EH\u0016J\b\u0010m\u001a\u00020IH\u0014J\u0012\u0010n\u001a\u00020I2\b\u0010o\u001a\u0004\u0018\u00010pH\u0007J\u0012\u0010n\u001a\u00020I2\b\u0010o\u001a\u0004\u0018\u00010qH\u0007J\u0012\u0010n\u001a\u00020I2\b\u0010o\u001a\u0004\u0018\u00010rH\u0007J\u0012\u0010n\u001a\u00020I2\b\u0010o\u001a\u0004\u0018\u00010sH\u0007J\u0010\u0010n\u001a\u00020I2\u0006\u0010o\u001a\u00020tH\u0007J\u0012\u0010u\u001a\u00020I2\b\u0010v\u001a\u0004\u0018\u00010wH\u0014J$\u0010x\u001a\u00020I2\b\u0010l\u001a\u0004\u0018\u00010E2\b\u0010y\u001a\u0004\u0018\u0001072\u0006\u0010z\u001a\u00020\nH\u0016J\b\u0010{\u001a\u00020IH\u0014J\u0012\u0010|\u001a\u00020I2\b\u0010}\u001a\u0004\u0018\u00010~H\u0016J\u0014\u0010\u007f\u001a\u00020I2\n\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0016J\t\u0010\u0082\u0001\u001a\u00020IH\u0003J\u000f\u0010\u0083\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020\nJ\u0011\u0010\u0084\u0001\u001a\u00020I2\u0006\u0010M\u001a\u00020\nH\u0002J\t\u0010\u0085\u0001\u001a\u00020IH\u0002J\t\u0010\u0086\u0001\u001a\u00020\nH\u0014J/\u0010\u0087\u0001\u001a\u00020I2\u0007\u0010\u0088\u0001\u001a\u00020\n2\u0010\u0010\u0089\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u008a\u0001\u0018\u00010\u00102\t\b\u0002\u0010\u008b\u0001\u001a\u00020\u001aH\u0002J\u0012\u0010\u008c\u0001\u001a\u00020I2\u0007\u0010\u008d\u0001\u001a\u00020\u001aH\u0002J\t\u0010\u008e\u0001\u001a\u00020IH\u0002J\t\u0010\u008f\u0001\u001a\u00020IH\u0002J\u0013\u0010\u0090\u0001\u001a\u00020I2\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0002J\u001b\u0010\u0093\u0001\u001a\u00020I2\u0007\u0010\u0094\u0001\u001a\u0002072\u0007\u0010\u0095\u0001\u001a\u00020\u001aH\u0002J\t\u0010\u0096\u0001\u001a\u00020IH\u0002J\t\u0010\u0097\u0001\u001a\u00020IH\u0002J\u0012\u0010\u0098\u0001\u001a\u00020I2\u0007\u0010\u0099\u0001\u001a\u00020\u001aH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b-\u0010.R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b2\u00103R\u000e\u00105\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010%\u001a\u0004\b:\u0010;R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010?\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010%\u001a\u0004\b@\u0010)R \u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020E0D0CX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u009b\u0001"}, d2 = {"Lcom/showstartfans/activity/activitys/products/DetailsOfThePerformanceActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "Lcom/showstartfans/activity/widget/popupwindow/ShowDetailOtherShowPop$OnOtherShowPop;", "Lcom/showstartfans/activity/widget/popupwindow/ShareMenuListListener;", "Lcom/taihebase/activity/listener/OnToolbarBackListener;", "Lcom/mob/moblink/SceneRestorable;", "()V", "actDesBean", "Lcom/showstartfans/activity/model/actdes/ActDesBean;", "activityId", "", "articleAdapter", "Lcom/showstartfans/activity/activitys/maintab/ArticleGridAdapter;", "couponPop", "Lcom/showstartfans/activity/widget/popupwindow/ShowDetailCouponPop;", "experienceList", "", "Lcom/showstartfans/activity/model/Article;", "fullView", "Lcom/showstartfans/activity/view/VideoFullView;", "getcoupon", "goodsAdapter", "Lcom/showstartfans/activity/activitys/products/NearGoodsAdapter;", "hotelAdapter", "Lcom/showstartfans/activity/activitys/products/ShowHotelAdapter;", "isOnceShare", "", "isTouch", "musicAdapter", "Lcom/showstartfans/activity/activitys/products/MusicListAdapter;", "otherPop", "Lcom/showstartfans/activity/widget/popupwindow/ShowDetailOtherShowPop;", "otherTimeAdapter", "Lcom/showstartfans/activity/activitys/products/OtherTimeAdapter;", "getOtherTimeAdapter", "()Lcom/showstartfans/activity/activitys/products/OtherTimeAdapter;", "otherTimeAdapter$delegate", "Lkotlin/Lazy;", "perforHorizontalManAdapter", "Lcom/showstartfans/activity/activitys/products/SponSorAdapter;", "getPerforHorizontalManAdapter", "()Lcom/showstartfans/activity/activitys/products/SponSorAdapter;", "perforHorizontalManAdapter$delegate", "perforManAdapter", "Lcom/showstartfans/activity/activitys/products/ParticipatingAdapter;", "getPerforManAdapter", "()Lcom/showstartfans/activity/activitys/products/ParticipatingAdapter;", "perforManAdapter$delegate", "photoAdapter", "Lcom/showstartfans/activity/activitys/products/PhotoAdapter;", "getPhotoAdapter", "()Lcom/showstartfans/activity/activitys/products/PhotoAdapter;", "photoAdapter$delegate", "scrollY", "searchKeyId", "", "shareDialog", "Lcom/showstartfans/activity/widget/dialog/ShareDialog;", "getShareDialog", "()Lcom/showstartfans/activity/widget/dialog/ShareDialog;", "shareDialog$delegate", "showGroup", "Landroid/widget/ImageView;", "sponsorManAdapter", "getSponsorManAdapter", "sponsorManAdapter$delegate", "tabs", "", "Lkotlin/Pair;", "Landroid/view/View;", "ticketSessionBean", "Lcom/showstartfans/activity/model/TicketSessionBean;", "OpenAudience", "", "realNameValidType", "addWantActivity", "id", "type", "bd_encrypt", "", "bd_lat", "", "bd_lon", "createKnowView", "text", "getActivityDetail", "getActivityTicket", "getCoupon", "couponBean", "Lcom/showstartfans/activity/model/CouponBean;", "callBack", "Lkotlin/Function0;", "getCouponsAndReceive", "getExperienceAndDetail", "Lcom/taihebase/activity/enummodel/LoadingType;", "getHotelList", "getShareBtn", "gotoGoodsList", "initData", "initListener", "initView", "initWebData", "isInstallByread", Constants.FLAG_PACKAGE_NAME, "judgeCity", "jumpTick", "onBackPressed", "onClick", "view", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/ChangeMusicStatusEvent;", "Lcom/showstartfans/activity/eventmodel/LoginEvent;", "Lcom/showstartfans/activity/eventmodel/PlayMusicEvent;", "Lcom/showstartfans/activity/eventmodel/ReservationEvent;", "Lcom/showstartfans/activity/eventmodel/SubscribecEvent;", "onNewIntent", "intent", "Landroid/content/Intent;", "onPupMenuViewClick", "content", h.a.a.a.a.i.g.C, "onResume", "onReturnSceneData", InnerShareParams.SCENCE, "Lcom/mob/moblink/Scene;", "onSelectOtherShow", "bean", "Lcom/showstartfans/activity/model/actdes/OtherActivitiesBean;", "openClockShow", "openRe", "putUserExperience", "sendIntent", "setContentViewRes", "setParticipating", "squadStatus", "userInfos", "Lcom/showstartfans/activity/model/ParticipatingBean;", "isHorizontal", "setWantLly", "isWant", "showAttentionOnFirst", "showCityDiffDialog", "showDHdialog", "data", "Lcom/showstartfans/activity/model/actdes/SiteBean;", "startActivityToSelectTicket", "umengFrom", "goPay", "tackAction", "unConOrderDialog", "updateClockShow", "isOpen", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class DetailsOfThePerformanceActivity extends BaseNoToolBarActivity implements y2.a, w2, h.y.a.k.j, SceneRestorable {
    @NotNull
    public static final a A = null;
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f6153d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private String f6154e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private List<Article> f6155f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private ActDesBean f6156g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private TicketSessionBean f6157h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private ImageView f6158i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private VideoFullView f6159j;

    /* renamed from: k  reason: collision with root package name */
    private int f6160k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6161l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private f2 f6162m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private l2 f6163n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private e2 f6164o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    private final Lazy f6165p;
    @NotNull
    private final Lazy q;
    @NotNull
    private final Lazy r;
    @NotNull
    private final Lazy s;
    @NotNull
    private final Lazy t;
    @NotNull
    private final Lazy u;
    @Nullable
    private y2 v;
    @Nullable
    private x2 w;
    @Nullable
    private p8 x;
    private boolean y;
    @NotNull
    private final List<Pair<String, View>> z;

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ8\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bJ(\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bJ0\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bJ \u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b¨\u0006\u000f"}, d2 = {"Lcom/showstartfans/activity/activitys/products/DetailsOfThePerformanceActivity$Companion;", "", "()V", "gotoComment", "", "ctx", "Landroid/content/Context;", "activityId", "", "start", "", "shareId", "payFromToType", "from", "livePushId", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@NotNull Context context, @NotNull String str) {
        }

        public final void b(@Nullable Context context, int i2, int i3, int i4, @NotNull String str, @NotNull String str2) {
        }

        public final void c(@Nullable Context context, int i2, int i3, @NotNull String str) {
        }

        public final void d(@Nullable Context context, int i2, int i3, @NotNull String str, @NotNull String str2) {
        }

        public final void e(@Nullable Context context, int i2, @NotNull String str) {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/showstartfans/activity/activitys/products/DetailsOfThePerformanceActivity$OpenAudience$1", "Lcom/showstartfans/activity/widget/dialog/OnRealNameTwoPointCall;", "onRealNameTwoPoint", "", "onRealNameTwoPointFail", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements m2 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DetailsOfThePerformanceActivity f6166a;

        public b(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        @Override // h.u.a.w.c0.m2
        public void a() {
        }

        @Override // h.u.a.w.c0.m2
        public void b() {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ int $type;
        public final /* synthetic */ DetailsOfThePerformanceActivity this$0;

        public c(int i2, DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ DetailsOfThePerformanceActivity this$0;

        public d(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function0<Unit> {
        public static final e INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ CouponBean $couponBean;
        public final /* synthetic */ DetailsOfThePerformanceActivity this$0;

        public f(CouponBean couponBean, DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/PostArticleData;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends Lambda implements Function1<PostArticleData, Unit> {
        public final /* synthetic */ DetailsOfThePerformanceActivity this$0;

        public g(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PostArticleData postArticleData) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable PostArticleData postArticleData) {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/products/DetailsOfThePerformanceActivity$initListener$1", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class h implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DetailsOfThePerformanceActivity f6167a;

        public h(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class i extends Lambda implements Function0<Unit> {
        public final /* synthetic */ DetailsOfThePerformanceActivity this$0;

        public i(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class j extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SlideLodeMoreLayout $layout_Slide;
        public final /* synthetic */ DetailsOfThePerformanceActivity this$0;

        public j(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, SlideLodeMoreLayout slideLodeMoreLayout) {
        }

        public static /* synthetic */ void a(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, SlideLodeMoreLayout slideLodeMoreLayout, Object obj) {
        }

        /* renamed from: invoke$lambda-0  reason: not valid java name */
        private static final void m23invoke$lambda0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, SlideLodeMoreLayout slideLodeMoreLayout, Object obj) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001c\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/products/DetailsOfThePerformanceActivity$initWebData$1$20$3", "Landroid/webkit/WebChromeClient;", "onHideCustomView", "", "onShowCustomView", "view", "Landroid/view/View;", "callback", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class k extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DetailsOfThePerformanceActivity f6168a;

        public k(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        public static /* synthetic */ void a(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        private static final void b(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(@Nullable View view, @Nullable WebChromeClient.CustomViewCallback customViewCallback) {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class l extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ DetailsOfThePerformanceActivity this$0;

        public l(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        }

        public final void invoke(int i2) {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "colorRes", "", "palette", "Landroidx/palette/graphics/Palette;", "invoke", "(Ljava/lang/Integer;Landroidx/palette/graphics/Palette;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class m extends Lambda implements Function2<Integer, Palette, Unit> {
        public final /* synthetic */ DetailsOfThePerformanceActivity this$0;

        public m(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        public static /* synthetic */ void a(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, Integer num) {
        }

        /* renamed from: invoke$lambda-1$lambda-0  reason: not valid java name */
        private static final void m24invoke$lambda1$lambda0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, Integer num) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Palette palette) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Integer num, @Nullable Palette palette) {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", h.a.a.a.a.i.g.C, "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class n extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ ActDesBean $this_apply;
        public final /* synthetic */ DetailsOfThePerformanceActivity this$0;

        public n(ActDesBean actDesBean, DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        }

        public final void invoke(int i2) {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class o extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SlideLodeMoreLayout $layout_Slide;
        public final /* synthetic */ DetailsOfThePerformanceActivity this$0;

        public o(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, SlideLodeMoreLayout slideLodeMoreLayout) {
        }

        public static /* synthetic */ void a(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, SlideLodeMoreLayout slideLodeMoreLayout, Object obj) {
        }

        /* renamed from: invoke$lambda-0  reason: not valid java name */
        private static final void m25invoke$lambda0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, SlideLodeMoreLayout slideLodeMoreLayout, Object obj) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/products/OtherTimeAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class p extends Lambda implements Function0<g2> {
        public final /* synthetic */ DetailsOfThePerformanceActivity this$0;

        public p(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ g2 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final g2 invoke() {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/products/SponSorAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class q extends Lambda implements Function0<n2> {
        public final /* synthetic */ DetailsOfThePerformanceActivity this$0;

        public q(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ n2 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final n2 invoke() {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/products/ParticipatingAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class r extends Lambda implements Function0<i2> {
        public final /* synthetic */ DetailsOfThePerformanceActivity this$0;

        public r(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ i2 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final i2 invoke() {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/products/PhotoAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class s extends Lambda implements Function0<j2> {
        public final /* synthetic */ DetailsOfThePerformanceActivity this$0;

        public s(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ j2 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final j2 invoke() {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/widget/dialog/ShareDialog;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class t extends Lambda implements Function0<r2> {
        public final /* synthetic */ DetailsOfThePerformanceActivity this$0;

        public t(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ r2 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final r2 invoke() {
        }
    }

    /* compiled from: DetailsOfThePerformanceActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/products/SponSorAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class u extends Lambda implements Function0<n2> {
        public final /* synthetic */ DetailsOfThePerformanceActivity this$0;

        public u(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ n2 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final n2 invoke() {
        }
    }

    public static final /* synthetic */ BaseNewFunctionActivity A(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
    }

    private static final void A0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, ActDesBean actDesBean, int i2) {
    }

    public static /* synthetic */ void A1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    public static final /* synthetic */ void B(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, h.y.a.h.i iVar) {
    }

    private static final void B0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, ActDesBean actDesBean, View view) {
    }

    @SuppressLint({"CheckResult"})
    private final void B1() {
    }

    public static final /* synthetic */ int C(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
    }

    private static final void C0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, ActDesBean actDesBean, TextView textView, View view) {
    }

    private static final void C1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, Boolean bool) {
    }

    public static final /* synthetic */ ImageView D(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
    }

    private static final void D0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, ValueAnimator valueAnimator) {
    }

    private static final void D1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    public static final /* synthetic */ List E(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
    }

    private static final void E0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, ActDesBean actDesBean) {
    }

    public static final /* synthetic */ void F(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
    }

    private static final void F0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
    }

    private final void F1(int i2) {
    }

    public static final /* synthetic */ void G(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, int i2) {
    }

    private static final boolean G0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view, MotionEvent motionEvent) {
    }

    private static final void G1(h.y.a.m.n nVar) {
    }

    public static final /* synthetic */ void H(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, List list) {
    }

    private static final boolean H0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view, MotionEvent motionEvent) {
    }

    private final void H1() {
    }

    public static final /* synthetic */ void I(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, int i2) {
    }

    private static final void I0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
    }

    private final void I1(int i2, List<? extends ParticipatingBean> list, boolean z) {
    }

    public static final /* synthetic */ void J(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, boolean z) {
    }

    private final boolean J0(String str) {
    }

    public static /* synthetic */ void J1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, int i2, List list, boolean z, int i3, Object obj) {
    }

    public static final /* synthetic */ void K(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, boolean z) {
    }

    private final boolean K0() {
    }

    private final void K1(boolean z) {
    }

    public static final /* synthetic */ void L(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
    }

    private final void L0() {
    }

    private final void L1() {
    }

    private final void M(int i2, int i3) {
    }

    public static /* synthetic */ void M0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private static final void M1(h.y.a.p.w.a aVar, View view) {
    }

    private final double[] N(double d2, double d3) {
    }

    public static /* synthetic */ void N0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, Function0 function0, h.y.a.m.n nVar) {
    }

    private static final void N1(h.y.a.p.w.a aVar, DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private final View O(String str) {
    }

    public static /* synthetic */ void O0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private final void O1() {
    }

    private static final void P(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    public static /* synthetic */ void P0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, ActDesBean actDesBean, int i2) {
    }

    private static final void P1(h.y.a.p.w.a aVar, DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, boolean z, View view) {
    }

    private final void Q() {
    }

    public static /* synthetic */ void Q0(h.y.a.p.w.a aVar, DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private final void Q1(SiteBean siteBean) {
    }

    private static final void R(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void R0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private static final void R1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, double d2, double d3, String str, View view, String str2, int i2) {
    }

    private final void S(int i2) {
    }

    public static /* synthetic */ boolean S0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view, MotionEvent motionEvent) {
    }

    private final void S1(String str, boolean z) {
    }

    private static final void T(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void T0(h.y.a.p.w.a aVar, DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, boolean z, View view) {
    }

    private final void T1() {
    }

    private final void U(CouponBean couponBean, Function0<Unit> function0) {
    }

    public static /* synthetic */ void U0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private static final void U1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private static final void V(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, Function0 function0, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void V0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private final void V1() {
    }

    private final void W() {
    }

    public static /* synthetic */ void W0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private static final void W1(View view) {
    }

    private static final void X(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void X0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
    }

    private final void X1(boolean z) {
    }

    private static final void Y(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, CouponBean couponBean) {
    }

    public static /* synthetic */ boolean Y0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view, MotionEvent motionEvent) {
    }

    private static final void Y1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private final void Z(h.y.a.h.i iVar) {
    }

    public static /* synthetic */ void Z0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, ValueAnimator valueAnimator) {
    }

    private final void a0() {
    }

    public static /* synthetic */ void a1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, ActDesBean actDesBean, View view) {
    }

    private static final void b0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void b1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private final g2 c0() {
    }

    public static /* synthetic */ void c1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, ActDesBean actDesBean, TextView textView, View view) {
    }

    private final n2 d0() {
    }

    public static /* synthetic */ void d1(View view) {
    }

    private final i2 e0() {
    }

    public static /* synthetic */ void e1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, double d2, double d3, String str, View view, String str2, int i2) {
    }

    private final j2 f0() {
    }

    public static /* synthetic */ void f1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, h.y.a.m.n nVar) {
    }

    private final View g0() {
    }

    public static /* synthetic */ void g1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private final r2 h0() {
    }

    public static /* synthetic */ void h1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private final n2 i0() {
    }

    public static /* synthetic */ void i1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private final void j0() {
    }

    public static /* synthetic */ void j1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, ActDesBean actDesBean, View view) {
    }

    private static final void k0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    public static /* synthetic */ void k1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private static final void l0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    public static /* synthetic */ void l1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, ActDesBean actDesBean) {
    }

    private static final void m0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    public static /* synthetic */ void m1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
    }

    private static final void n0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    public static /* synthetic */ void n1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, h.y.a.m.n nVar) {
    }

    private static final void o0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, int i2, View view) {
    }

    public static /* synthetic */ void o1(h.y.a.p.w.a aVar, View view) {
    }

    private static final void p0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    public static /* synthetic */ void p1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, CouponBean couponBean) {
    }

    private static final void q0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    public static /* synthetic */ void q1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, h.y.a.m.n nVar) {
    }

    private static final void r0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    public static /* synthetic */ void r1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private static final void s0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    public static /* synthetic */ void s1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, int i2, View view) {
    }

    private static final void t0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    public static /* synthetic */ void t1(h.y.a.m.n nVar) {
    }

    private static final void u0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    public static /* synthetic */ void u1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private final void v0() {
    }

    public static /* synthetic */ void v1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    private final void w(int i2) {
    }

    private static final void w0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, ActDesBean actDesBean, View view) {
    }

    public static /* synthetic */ void w1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, Boolean bool) {
    }

    public static final /* synthetic */ ActDesBean x(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
    }

    private static final void x0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
    }

    public static /* synthetic */ void x1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    public static final /* synthetic */ void y(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
    }

    private static final void y0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    public static /* synthetic */ void y1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
    }

    public static final /* synthetic */ x2 z(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity) {
    }

    private static final void z0(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, View view) {
    }

    public static /* synthetic */ void z1(DetailsOfThePerformanceActivity detailsOfThePerformanceActivity, h.y.a.m.n nVar) {
    }

    public final void E1(int i2) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
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

    @Override // h.y.a.k.j
    public void onClick(@Nullable View view) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable PlayMusicEvent playMusicEvent) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }

    @Override // h.u.a.w.d0.y2.a
    public void v(@Nullable OtherActivitiesBean otherActivitiesBean) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable ReservationEvent reservationEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable ChangeMusicStatusEvent changeMusicStatusEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable LoginEvent loginEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@NotNull SubscribecEvent subscribecEvent) {
    }
}
