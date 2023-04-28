package com.showstartfans.activity.activitys.fansspace;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.eventmodel.ArticlePublishEvent;
import com.showstartfans.activity.eventmodel.ConverChangeEvent;
import com.showstartfans.activity.eventmodel.RefreshUserHomeBgEvent;
import com.showstartfans.activity.eventmodel.RefreshUserInfoEvent;
import com.showstartfans.activity.eventmodel.RefreshUserSignEvent;
import com.showstartfans.activity.eventmodel.SceneDetailCommEvent;
import com.showstartfans.activity.eventmodel.SceneDetailZanEvent;
import com.showstartfans.activity.eventmodel.SceneListVideoPlayerRollbackEvent;
import com.showstartfans.activity.eventmodel.SceneRemoveIndexEvent;
import com.showstartfans.activity.eventmodel.VideoListUserFollowEvent;
import com.showstartfans.activity.model.FansHomePagerInfoBean;
import com.showstartfans.activity.model.PostArticleData;
import com.showstartfans.activity.model.PrivateSettingBean;
import com.showstartfans.activity.view.UserLevelView;
import com.showstartfans.activity.view.UserPhotoSmallView;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import com.taihebase.activity.view.LoadImageView;
import com.taihebase.activity.view.svg.SvgImageView;
import com.tencent.cloud.huiyansdkface.facelight.api.WbCloudFaceContant;
import h.u.a.c.l0.t3;
import h.u.a.o.k;
import h.x.e.e.o;
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
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FansHomeNewActivity.kt */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 \u0093\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0093\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010K\u001a\u00020LH\u0002J\b\u0010M\u001a\u00020LH\u0002J\u000e\u0010N\u001a\u00020L2\u0006\u0010O\u001a\u00020\u0018J\b\u0010P\u001a\u00020LH\u0002J\u0006\u0010Q\u001a\u00020LJ\u0016\u0010R\u001a\u00020L2\u0006\u0010S\u001a\u00020\u001e2\u0006\u0010T\u001a\u00020\u0018J\b\u0010U\u001a\u00020LH\u0002J\b\u0010V\u001a\u00020\u001eH\u0002J\b\u0010W\u001a\u00020LH\u0002J\u0010\u0010X\u001a\u00020L2\u0006\u0010Y\u001a\u00020ZH\u0002J\b\u0010[\u001a\u00020LH\u0014J\b\u0010\\\u001a\u00020\u001aH\u0002J\b\u0010]\u001a\u00020LH\u0014J\b\u0010^\u001a\u00020LH\u0014J\b\u0010_\u001a\u00020\u0011H\u0002J\"\u0010`\u001a\u00020L2\u0006\u0010a\u001a\u00020\u00182\u0006\u0010b\u001a\u00020\u00182\b\u0010c\u001a\u0004\u0018\u00010dH\u0014J\b\u0010e\u001a\u00020LH\u0016J\b\u0010f\u001a\u00020LH\u0014J\u0012\u0010g\u001a\u00020L2\b\u0010h\u001a\u0004\u0018\u00010iH\u0007J\u0012\u0010g\u001a\u00020L2\b\u0010h\u001a\u0004\u0018\u00010jH\u0007J\u0012\u0010g\u001a\u00020L2\b\u0010h\u001a\u0004\u0018\u00010kH\u0007J\u0012\u0010g\u001a\u00020L2\b\u0010h\u001a\u0004\u0018\u00010lH\u0007J\u0012\u0010g\u001a\u00020L2\b\u0010h\u001a\u0004\u0018\u00010mH\u0007J\u0012\u0010g\u001a\u00020L2\b\u0010h\u001a\u0004\u0018\u00010nH\u0007J\u0012\u0010g\u001a\u00020L2\b\u0010h\u001a\u0004\u0018\u00010oH\u0007J\u0012\u0010g\u001a\u00020L2\b\u0010h\u001a\u0004\u0018\u00010pH\u0007J\u0012\u0010g\u001a\u00020L2\b\u0010h\u001a\u0004\u0018\u00010qH\u0007J\u0012\u0010g\u001a\u00020L2\b\u0010h\u001a\u0004\u0018\u00010rH\u0007J\u0012\u0010g\u001a\u00020L2\b\u0010h\u001a\u0004\u0018\u00010sH\u0007J\u0012\u0010t\u001a\u00020L2\b\u0010u\u001a\u0004\u0018\u00010dH\u0014J\u001a\u0010v\u001a\u00020L2\b\u0010w\u001a\u0004\u0018\u00010x2\u0006\u0010y\u001a\u00020\u0018H\u0016J\b\u0010z\u001a\u00020LH\u0014J\b\u0010{\u001a\u00020LH\u0014J\u0012\u0010|\u001a\u00020L2\b\u0010}\u001a\u0004\u0018\u00010~H\u0016J\b\u0010\u007f\u001a\u00020LH\u0014J\u0011\u0010\u0080\u0001\u001a\u00020L2\u0006\u0010T\u001a\u00020\u0018H\u0002J\u0007\u0010\u0081\u0001\u001a\u00020LJ\u0010\u0010\u0082\u0001\u001a\u00020L2\u0007\u0010\u0083\u0001\u001a\u00020\u0011J\t\u0010\u0084\u0001\u001a\u00020\u0018H\u0014J\t\u0010\u0085\u0001\u001a\u00020LH\u0002J\t\u0010\u0086\u0001\u001a\u00020LH\u0002J\t\u0010\u0087\u0001\u001a\u00020LH\u0002J\u0007\u0010\u0088\u0001\u001a\u00020LJ\t\u0010\u0089\u0001\u001a\u00020LH\u0002J\t\u0010\u008a\u0001\u001a\u00020LH\u0002J\u0012\u0010\u008b\u0001\u001a\u00020L2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010*J\u001b\u0010\u008d\u0001\u001a\u00020L2\u0007\u0010\u008e\u0001\u001a\u00020\u001e2\u0007\u0010\u008f\u0001\u001a\u00020\u0018H\u0002J\u0012\u0010\u0090\u0001\u001a\u00020L2\u0007\u0010\u0091\u0001\u001a\u00020\u0011H\u0002J\u0012\u0010\u0092\u0001\u001a\u00020L2\u0007\u0010\u008e\u0001\u001a\u00020\u001eH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\n\u001a\u0004\b5\u00106R\u000e\u00108\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010D\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u00010JX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0094\u0001"}, d2 = {"Lcom/showstartfans/activity/activitys/fansspace/FansHomeNewActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "Lcom/mob/moblink/SceneRestorable;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/recyclerview/widget/RecyclerView;", "btn_parent", "Landroid/widget/LinearLayout;", "canSeeHomePage", "", "canSendPost", "circleImage_head", "Lcom/taihebase/activity/view/LoadImageView;", o.f25898e, "Landroid/widget/TextView;", "defaultPeekHeight", "", "down_View", "Landroid/view/View;", "edit_icon", "Landroid/widget/ImageView;", "fansId", "", "fans_num", "fans_nums", "follow_add_icon", "Lcom/taihebase/activity/view/svg/SvgImageView;", "follow_btn", "follow_num", "follow_nums", "follow_str", "from", "head_bg", "homePagerInfoBean", "Lcom/showstartfans/activity/model/FansHomePagerInfoBean;", "isBlack", "isCustomService", "isDownScroll", "isMyself", "layou_copy", "layout_no_scene", "ll_fans", "ll_friend", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "getLoadMoreAction", "()Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "loadMoreAction$delegate", "pageNo", "picPathsb", "Ljava/lang/StringBuffer;", "privateBean", "Lcom/showstartfans/activity/model/PrivateSettingBean;", "private_chat", "renz", WbCloudFaceContant.SIGN, "text_sc", "title_p", "topImage", "tv_userid", "uploadedPath", "", "userLevel", "Lcom/showstartfans/activity/view/UserLevelView;", "user_name", "user_photo_small", "Lcom/showstartfans/activity/view/UserPhotoSmallView;", "addBlack", "", "bindUserInfoData", "concernOrcancelNew", "type", "copyFansID", "deleteBlack", "deleteUserImage", "imageId", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "getData", "getEmpMsgStr", "getOpenData", "getUserHomePagerInfo", "loadingType", "Lcom/taihebase/activity/enummodel/LoadingType;", "initData", "initHeadView", "initListener", "initView", "isMe", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/ArticlePublishEvent;", "Lcom/showstartfans/activity/eventmodel/ConverChangeEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshUserHomeBgEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshUserInfoEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshUserSignEvent;", "Lcom/showstartfans/activity/eventmodel/SceneDetailCommEvent;", "Lcom/showstartfans/activity/eventmodel/SceneDetailZanEvent;", "Lcom/showstartfans/activity/eventmodel/SceneListVideoPlayerRollbackEvent;", "Lcom/showstartfans/activity/eventmodel/SceneRemoveIndexEvent;", "Lcom/showstartfans/activity/eventmodel/VideoListUserFollowEvent;", "Lcom/showstartfans/activity/model/FollowStatusChangeEvent;", "onNewIntent", "intent", "onOffsetChanged", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "verticalOffset", "onPause", "onResume", "onReturnSceneData", "p0", "Lcom/mob/moblink/Scene;", "onStop", "report", "resetView", "setBlack", WbCloudFaceContant.BLACK, "setContentViewRes", "setFollowView", "setIdentityInfo", "showReportPop", "startActivityChat", "startAttention", "startFans", "upDateView", "concernSiteBean", "upMorePic", "picturePath", h.a.a.a.a.i.g.C, "updateFollowStatus", "isFollow", "updateUserBg", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FansHomeNewActivity extends BaseNoToolBarActivity implements AppBarLayout.OnOffsetChangedListener, SceneRestorable {
    @NotNull
    public static final a U = null;
    @NotNull
    private static final String V = null;
    @NotNull
    private static final String W = null;
    @NotNull
    private static final String X = null;
    @NotNull
    private static final String Y = null;
    @Nullable
    private ImageView A;
    @Nullable
    private View B;
    @Nullable
    private TextView C;
    @Nullable
    private LoadImageView D;
    @Nullable
    private TextView E;
    @Nullable
    private TextView F;
    @Nullable
    private TextView G;
    @Nullable
    private TextView H;
    @Nullable
    private TextView I;
    @Nullable
    private LinearLayout J;
    @Nullable
    private TextView K;
    @Nullable
    private LinearLayout L;
    @Nullable
    private TextView M;
    @Nullable
    private LinearLayout N;
    @Nullable
    private TextView O;
    @Nullable
    private LinearLayout P;
    @Nullable
    private SvgImageView Q;
    @Nullable
    private TextView R;
    @Nullable
    private LinearLayout S;
    @Nullable
    private UserLevelView T;
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private String c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f5451d;

    /* renamed from: e  reason: collision with root package name */
    private int f5452e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5453f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5454g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5455h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5456i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5457j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5458k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private PrivateSettingBean f5459l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private FansHomePagerInfoBean f5460m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private StringBuffer f5461n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private List<String> f5462o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    private final Lazy f5463p;
    private int q;
    @Nullable
    private BottomSheetBehavior<RecyclerView> r;
    @Nullable
    private UserPhotoSmallView s;
    @Nullable
    private LoadImageView t;
    @NotNull
    private final Lazy u;
    @Nullable
    private SvgImageView v;
    @Nullable
    private TextView w;
    @Nullable
    private LinearLayout x;
    @Nullable
    private LinearLayout y;
    @Nullable
    private LoadImageView z;

    /* compiled from: FansHomeNewActivity.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\"\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/showstartfans/activity/activitys/fansspace/FansHomeNewActivity$Companion;", "", "()V", "CUSTOM_SERVICE", "", "getCUSTOM_SERVICE", "()Ljava/lang/String;", "FANS_ID_KEY", "getFANS_ID_KEY", "FOLLOW_SOURCE", "getFOLLOW_SOURCE", "UMENG_FROM_ID", "getUMENG_FROM_ID", "start", "", "ctx", "Landroid/content/Context;", "fansId", "customService", "", "from", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final String a() {
        }

        @NotNull
        public final String b() {
        }

        @NotNull
        public final String c() {
        }

        @NotNull
        public final String d() {
        }

        @JvmStatic
        public final void e(@Nullable Context context, @NotNull String str, @NotNull String str2) {
        }

        @JvmStatic
        public final void f(@Nullable Context context, @NotNull String str, boolean z, @NotNull String str2) {
        }
    }

    /* compiled from: FansHomeNewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b extends Lambda implements Function0<t3> {
        public final /* synthetic */ FansHomeNewActivity this$0;

        public b(FansHomeNewActivity fansHomeNewActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ t3 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final t3 invoke() {
        }
    }

    /* compiled from: FansHomeNewActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ int $type;
        public final /* synthetic */ FansHomeNewActivity this$0;

        public c(FansHomeNewActivity fansHomeNewActivity, int i2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: FansHomeNewActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/PostArticleData;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class d extends Lambda implements Function1<PostArticleData, Unit> {
        public final /* synthetic */ FansHomeNewActivity this$0;

        public d(FansHomeNewActivity fansHomeNewActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PostArticleData postArticleData) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable PostArticleData postArticleData) {
        }
    }

    /* compiled from: FansHomeNewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class e extends Lambda implements Function0<Unit> {
        public final /* synthetic */ n $result;
        public final /* synthetic */ FansHomeNewActivity this$0;

        public e(n nVar, FansHomeNewActivity fansHomeNewActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: FansHomeNewActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/fansspace/FansHomeNewActivity$initListener$15", "Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;", "onChildViewAttachedToWindow", "", "view", "Landroid/view/View;", "onChildViewDetachedFromWindow", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class f implements RecyclerView.OnChildAttachStateChangeListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(@NotNull View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(@NotNull View view) {
        }
    }

    /* compiled from: FansHomeNewActivity.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/fansspace/FansHomeNewActivity$initListener$16", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class g extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FansHomeNewActivity f5464a;

        public g(FansHomeNewActivity fansHomeNewActivity) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* compiled from: FansHomeNewActivity.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/fansspace/FansHomeNewActivity$initListener$6", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class h extends BottomSheetBehavior.BottomSheetCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FansHomeNewActivity f5465a;

        public h(FansHomeNewActivity fansHomeNewActivity) {
        }

        public static /* synthetic */ void a(FansHomeNewActivity fansHomeNewActivity) {
        }

        private static final void b(FansHomeNewActivity fansHomeNewActivity) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NotNull View view, float f2) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NotNull View view, int i2) {
        }
    }

    /* compiled from: FansHomeNewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class i extends Lambda implements Function0<h.v.a.d> {
        public static final i INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.v.a.d invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.v.a.d invoke() {
        }
    }

    public static final /* synthetic */ BaseNewFunctionActivity A(FansHomeNewActivity fansHomeNewActivity) {
    }

    public static /* synthetic */ void A0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    public static final /* synthetic */ int B(FansHomeNewActivity fansHomeNewActivity) {
    }

    public static /* synthetic */ void B0(FansHomeNewActivity fansHomeNewActivity, FansHomePagerInfoBean fansHomePagerInfoBean, View view) {
    }

    public static final /* synthetic */ String C() {
    }

    public static /* synthetic */ void C0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    public static final /* synthetic */ String D() {
    }

    public static /* synthetic */ void D0(View view) {
    }

    public static final /* synthetic */ String E(FansHomeNewActivity fansHomeNewActivity) {
    }

    public static /* synthetic */ void E0(View view) {
    }

    public static final /* synthetic */ LoadImageView F(FansHomeNewActivity fansHomeNewActivity) {
    }

    public static /* synthetic */ void F0(FansHomeNewActivity fansHomeNewActivity, n nVar) {
    }

    public static final /* synthetic */ LinearLayout G(FansHomeNewActivity fansHomeNewActivity) {
    }

    public static /* synthetic */ void G0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    public static final /* synthetic */ h.v.a.d H(FansHomeNewActivity fansHomeNewActivity) {
    }

    public static /* synthetic */ void H0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    public static final /* synthetic */ int I(FansHomeNewActivity fansHomeNewActivity) {
    }

    public static /* synthetic */ void I0(FansHomeNewActivity fansHomeNewActivity, boolean z) {
    }

    public static final /* synthetic */ String J() {
    }

    public static /* synthetic */ void J0(FansHomeNewActivity fansHomeNewActivity, n nVar) {
    }

    public static final /* synthetic */ void K(FansHomeNewActivity fansHomeNewActivity, h.y.a.h.i iVar) {
    }

    public static /* synthetic */ void K0(FansHomeNewActivity fansHomeNewActivity, n nVar) {
    }

    public static final /* synthetic */ boolean L(FansHomeNewActivity fansHomeNewActivity) {
    }

    public static /* synthetic */ void L0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    public static final /* synthetic */ boolean M(FansHomeNewActivity fansHomeNewActivity) {
    }

    public static /* synthetic */ void M0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    public static final /* synthetic */ void N(FansHomeNewActivity fansHomeNewActivity, boolean z) {
    }

    public static /* synthetic */ void N0(FansHomeNewActivity fansHomeNewActivity, n nVar) {
    }

    public static final /* synthetic */ void O(FansHomeNewActivity fansHomeNewActivity, boolean z) {
    }

    public static /* synthetic */ void O0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    public static final /* synthetic */ void P(FansHomeNewActivity fansHomeNewActivity, int i2) {
    }

    public static /* synthetic */ void P0(FansHomeNewActivity fansHomeNewActivity, View view, String str, int i2) {
    }

    public static final /* synthetic */ void Q(FansHomeNewActivity fansHomeNewActivity, boolean z) {
    }

    public static /* synthetic */ void Q0(FansHomeNewActivity fansHomeNewActivity, n nVar) {
    }

    private final void R() {
    }

    public static /* synthetic */ void R0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    private static final void S(FansHomeNewActivity fansHomeNewActivity, n nVar) {
    }

    public static /* synthetic */ void S0(int i2, FansHomeNewActivity fansHomeNewActivity, n nVar) {
    }

    private final void T() {
    }

    public static /* synthetic */ void T0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    private static final void U(FansHomeNewActivity fansHomeNewActivity, FansHomePagerInfoBean fansHomePagerInfoBean, View view) {
    }

    private final void U0(int i2) {
    }

    private final void W() {
    }

    private final void X0() {
    }

    private static final void Y(FansHomeNewActivity fansHomeNewActivity, n nVar) {
    }

    private final void Y0() {
    }

    private final void Z0() {
    }

    private final t3 a0() {
    }

    private static final void a1(FansHomeNewActivity fansHomeNewActivity, View view, String str, int i2) {
    }

    private final void b0() {
    }

    @JvmStatic
    public static final void b1(@Nullable Context context, @NotNull String str, @NotNull String str2) {
    }

    private final String c0() {
    }

    @JvmStatic
    public static final void c1(@Nullable Context context, @NotNull String str, boolean z, @NotNull String str2) {
    }

    private final h.v.a.d d0() {
    }

    private final void e0() {
    }

    private final void e1() {
    }

    private static final void f0(FansHomeNewActivity fansHomeNewActivity, n nVar) {
    }

    private final void f1() {
    }

    private final void g0(h.y.a.h.i iVar) {
    }

    private static final void h0(FansHomeNewActivity fansHomeNewActivity, n nVar) {
    }

    private final void h1(String str, int i2) {
    }

    private final View i0() {
    }

    private static final void i1(int i2, FansHomeNewActivity fansHomeNewActivity, n nVar) {
    }

    private static final void j0(FansHomeNewActivity fansHomeNewActivity, boolean z) {
    }

    private final void j1(boolean z) {
    }

    private static final void k0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    private final void k1(String str) {
    }

    private static final void l0(View view) {
    }

    private static final void l1(FansHomeNewActivity fansHomeNewActivity, n nVar) {
    }

    private static final void m0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    private static final void n0(FansHomeNewActivity fansHomeNewActivity, View view, String str, int i2) {
    }

    private static final void o0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    private static final void p0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    private static final void q0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    private static final void r0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    private static final void s0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    private static final void t0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    private static final void u0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    private static final void v0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    public static final /* synthetic */ t3 w(FansHomeNewActivity fansHomeNewActivity) {
    }

    private static final void w0(View view) {
    }

    public static final /* synthetic */ BottomSheetBehavior x(FansHomeNewActivity fansHomeNewActivity) {
    }

    private final boolean x0() {
    }

    public static final /* synthetic */ String y() {
    }

    public static /* synthetic */ void y0(FansHomeNewActivity fansHomeNewActivity, View view) {
    }

    public static final /* synthetic */ boolean z(FansHomeNewActivity fansHomeNewActivity) {
    }

    public static /* synthetic */ void z0(FansHomeNewActivity fansHomeNewActivity, View view, String str, int i2) {
    }

    public final void V(int i2) {
    }

    public final void V0() {
    }

    public final void W0(boolean z) {
    }

    public final void X() {
    }

    public final void Z(@NotNull String str, int i2) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    public final void d1() {
    }

    public final void g1(@Nullable FansHomePagerInfoBean fansHomePagerInfoBean) {
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshUserInfoEvent refreshUserInfoEvent) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public void onOffsetChanged(@Nullable AppBarLayout appBarLayout, int i2) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
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
    public final void onEvent(@Nullable VideoListUserFollowEvent videoListUserFollowEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable SceneDetailZanEvent sceneDetailZanEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable SceneDetailCommEvent sceneDetailCommEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable SceneListVideoPlayerRollbackEvent sceneListVideoPlayerRollbackEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable SceneRemoveIndexEvent sceneRemoveIndexEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshUserHomeBgEvent refreshUserHomeBgEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshUserSignEvent refreshUserSignEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable ArticlePublishEvent articlePublishEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable k kVar) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable ConverChangeEvent converChangeEvent) {
    }
}
