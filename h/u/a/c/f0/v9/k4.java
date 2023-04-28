package h.u.a.c.f0.v9;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import cn.sharesdk.framework.InnerShareParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.showstartfans.activity.eventmodel.ArticlePublishEvent;
import com.showstartfans.activity.eventmodel.ConverChangeEvent;
import com.showstartfans.activity.eventmodel.LoginEvent;
import com.showstartfans.activity.eventmodel.PlayMusicEvent;
import com.showstartfans.activity.eventmodel.RefreshUserInfoEvent;
import com.showstartfans.activity.eventmodel.RefreshUserSceneEvent;
import com.showstartfans.activity.eventmodel.RefreshUserSignEvent;
import com.showstartfans.activity.eventmodel.SceneDetailCommEvent;
import com.showstartfans.activity.eventmodel.SceneDetailZanEvent;
import com.showstartfans.activity.eventmodel.SceneListVideoPlayerRollbackEvent;
import com.showstartfans.activity.eventmodel.SceneRemoveIndexEvent;
import com.showstartfans.activity.eventmodel.VideoListUserFollowEvent;
import com.showstartfans.activity.model.PostArticleData;
import com.showstartfans.activity.model.UserHomePagerInfoBean;
import com.showstartfans.activity.view.UserLevelView;
import com.showstartfans.activity.view.UserPhotoSmallView;
import com.taihebase.activity.view.FoldTextView;
import com.taihebase.activity.view.LoadImageView;
import com.taihebase.activity.view.svg.SvgImageView;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabMineNewFragment.kt */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0093\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010Z\u001a\u00020[H\u0002J\b\u0010\\\u001a\u00020[H\u0002J\b\u0010]\u001a\u00020[H\u0002J\b\u0010^\u001a\u00020\u001aH\u0014J\b\u0010_\u001a\u00020[H\u0002J?\u0010`\u001a\u00020[2\u0006\u0010a\u001a\u00020\u00162\u0006\u0010b\u001a\u00020\u00162%\u0010c\u001a!\u0012\u0015\u0012\u0013\u0018\u00010R¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\u0004\u0012\u00020[\u0018\u00010dH\u0002J\u0010\u0010h\u001a\u00020[2\u0006\u0010i\u001a\u00020\u0016H\u0002J\u0010\u0010j\u001a\u00020[2\u0006\u0010k\u001a\u00020\u0016H\u0002J\u0010\u0010l\u001a\u00020[2\u0006\u0010k\u001a\u00020\u0016H\u0002J\u0010\u0010m\u001a\u00020[2\u0006\u0010n\u001a\u00020oH\u0002J\b\u0010p\u001a\u00020[H\u0002J\b\u0010q\u001a\u00020[H\u0014J\b\u0010r\u001a\u00020 H\u0002J\b\u0010s\u001a\u00020[H\u0014J\b\u0010t\u001a\u00020[H\u0014J\b\u0010u\u001a\u00020[H\u0002J\b\u0010v\u001a\u00020[H\u0002J\b\u0010w\u001a\u00020[H\u0016J\b\u0010x\u001a\u00020[H\u0016J\u0012\u0010y\u001a\u00020[2\b\u0010z\u001a\u0004\u0018\u00010{H\u0007J\u0012\u0010y\u001a\u00020[2\b\u0010z\u001a\u0004\u0018\u00010|H\u0007J\u0012\u0010y\u001a\u00020[2\b\u0010z\u001a\u0004\u0018\u00010}H\u0007J\u0010\u0010y\u001a\u00020[2\u0006\u0010z\u001a\u00020~H\u0007J\u0012\u0010y\u001a\u00020[2\b\u0010z\u001a\u0004\u0018\u00010\u007fH\u0007J\u0013\u0010y\u001a\u00020[2\t\u0010z\u001a\u0005\u0018\u00010\u0080\u0001H\u0007J\u0013\u0010y\u001a\u00020[2\t\u0010z\u001a\u0005\u0018\u00010\u0081\u0001H\u0007J\u0013\u0010y\u001a\u00020[2\t\u0010z\u001a\u0005\u0018\u00010\u0082\u0001H\u0007J\u0013\u0010y\u001a\u00020[2\t\u0010z\u001a\u0005\u0018\u00010\u0083\u0001H\u0007J\u0013\u0010y\u001a\u00020[2\t\u0010z\u001a\u0005\u0018\u00010\u0084\u0001H\u0007J\u0013\u0010y\u001a\u00020[2\t\u0010z\u001a\u0005\u0018\u00010\u0085\u0001H\u0007J\u0013\u0010y\u001a\u00020[2\t\u0010z\u001a\u0005\u0018\u00010\u0086\u0001H\u0007J\u0012\u0010\u0087\u0001\u001a\u00020[2\u0007\u0010\u0088\u0001\u001a\u00020\u0016H\u0016J\t\u0010\u0089\u0001\u001a\u00020[H\u0016J\t\u0010\u008a\u0001\u001a\u00020[H\u0016J\u0007\u0010\u008b\u0001\u001a\u00020[J\t\u0010\u008c\u0001\u001a\u00020[H\u0002J\u0014\u0010\u008d\u0001\u001a\u00020[2\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010oH\u0002J\t\u0010\u008f\u0001\u001a\u00020[H\u0002J\t\u0010\u0090\u0001\u001a\u00020[H\u0002J\u0014\u0010\u0091\u0001\u001a\u00020[2\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010oH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0018\u00010\rR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u000b\u001a\u0004\b/\u00100R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010;\u001a\n =*\u0004\u0018\u00010<0<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u000b\u001a\u0004\b>\u0010?R\u0010\u0010A\u001a\u0004\u0018\u00010BX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010E\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u000b\u001a\u0004\bF\u0010\u001cR\u0010\u0010H\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010J\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010K\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010L\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010M\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010N\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010O\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010P\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Q\u001a\u0004\u0018\u00010RX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010S\u001a\u0004\u0018\u00010TX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010U\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010V\u001a\u0004\u0018\u00010WX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010X\u001a\u0004\u0018\u00010YX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0094\u0001"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabMineNewFragment;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "Lcom/showstartfans/activity/listener/OnDoubleClickListener;", "()V", "ad_icon", "Lcom/taihebase/activity/view/LoadImageView;", "adapter", "Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "adapterTop", "Lcom/showstartfans/activity/activitys/maintab/newmain/TabMineNewFragment$BgPagerAdapter;", "add_loc", "Landroid/widget/TextView;", "all_show", "all_site", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/recyclerview/widget/RecyclerView;", "canGoMap", "", "canSendPost", "circleImage_head", "countNumHeight", "", "getCountNumHeight", "()I", "countNumHeight$delegate", "defaultPeekHeight", "down_View_mine", "Landroid/view/View;", "edit_icon", "Landroid/widget/ImageView;", "head_bg", "isDownScroll", "isRequestMapNumber", "layou_copy", "Lcom/taihebase/activity/view/svg/SvgImageView;", "layout_no_scene", "Landroid/widget/LinearLayout;", "ll_attention", "ll_fans", "ll_friend", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "getLoadMoreAction", "()Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "loadMoreAction$delegate", "mTopImage", "Lcom/facebook/drawee/view/SimpleDraweeView;", "mUserPhotoSmall", "Lcom/showstartfans/activity/view/UserPhotoSmallView;", "my_order", "pageNo", "refreshUserInfo", "see_card", "see_loc", "spUtil", "Lcom/taihebase/activity/utils/SPUtileBiz;", "kotlin.jvm.PlatformType", "getSpUtil", "()Lcom/taihebase/activity/utils/SPUtileBiz;", "spUtil$delegate", "tab_Top", "Lcom/flyco/tablayout/SlidingTabLayout;", "text_NFT", "text_sc", "topHeight", "getTopHeight", "topHeight$delegate", "tv_active_center", "tv_userid", "txt_Hotel", "txt_attention_num", "txt_coupons", "txt_fans_num", "txt_friend_num", "txt_name", "txt_pay", "userInfoBean", "Lcom/showstartfans/activity/model/UserHomePagerInfoBean;", "userLevel", "Lcom/showstartfans/activity/view/UserLevelView;", "user_admin", "user_sign", "Lcom/taihebase/activity/view/FoldTextView;", "vp_bg_viewPager", "Landroidx/viewpager/widget/ViewPager;", "bindViewData", "", "checkMusicPlay", "copyFansID", "getContentView", "getMapNumber", "getMineInfo", "isShowProgress", "isUpdateView", "callBac", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "success", "getUserScene", "showProcess", "gotoMap", "needSlide", "gotoPhoto", "gotoSign", "text", "", "initBgPager", "initData", "initHeadView", "initListener", "initView", "loadMoreData", "onArticleDataChange", "onDestroy", "onDoubleClickHappen", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/ArticlePublishEvent;", "Lcom/showstartfans/activity/eventmodel/ConverChangeEvent;", "Lcom/showstartfans/activity/eventmodel/LoginEvent;", "Lcom/showstartfans/activity/eventmodel/PlayMusicEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshUserInfoEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshUserSceneEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshUserSignEvent;", "Lcom/showstartfans/activity/eventmodel/SceneDetailCommEvent;", "Lcom/showstartfans/activity/eventmodel/SceneDetailZanEvent;", "Lcom/showstartfans/activity/eventmodel/SceneListVideoPlayerRollbackEvent;", "Lcom/showstartfans/activity/eventmodel/SceneRemoveIndexEvent;", "Lcom/showstartfans/activity/eventmodel/VideoListUserFollowEvent;", "onHiddenChanged", InnerShareParams.HIDDEN, "onPause", "onResume", "resetView", "scrollToTop", "setCoverImage", InnerShareParams.IMAGE_URL, "setLocalInfo", "setViewData", "showMineAD", "adPic", "BgPagerAdapter", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class k4 extends h.y.a.f.o.e implements h.u.a.l.b {
    @Nullable
    private LoadImageView A;
    @Nullable
    private ImageView B;
    @Nullable
    private View C;
    @Nullable
    private FoldTextView D;
    @Nullable
    private LoadImageView E;
    @Nullable
    private TextView F;
    @Nullable
    private TextView G;
    @Nullable
    private TextView H;
    @Nullable
    private TextView I;
    @Nullable
    private TextView J;
    @Nullable
    private TextView K;
    @Nullable
    private TextView L;
    @Nullable
    private TextView M;
    @Nullable
    private LinearLayout N;
    private boolean O;
    @NotNull
    private final Lazy P;
    @NotNull
    private final Lazy Q;
    @NotNull
    private final Lazy R;
    private int S;
    @NotNull
    private final Lazy T;
    @NotNull
    private final Lazy U;
    @Nullable
    private BottomSheetBehavior<RecyclerView> V;
    private boolean W;
    @Nullable
    private TextView X;
    @Nullable
    private TextView Y;
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18723d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f18724e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f18725f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private ViewPager f18726g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private SlidingTabLayout f18727h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private UserHomePagerInfoBean f18728i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private a f18729j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private SimpleDraweeView f18730k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private UserPhotoSmallView f18731l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private SvgImageView f18732m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private LoadImageView f18733n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private TextView f18734o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private TextView f18735p;
    @Nullable
    private TextView q;
    @Nullable
    private LinearLayout r;
    @Nullable
    private LinearLayout s;
    @Nullable
    private LinearLayout t;
    @Nullable
    private TextView u;
    @Nullable
    private TextView v;
    @Nullable
    private UserLevelView w;
    @Nullable
    private TextView x;
    @Nullable
    private TextView y;
    @Nullable
    private TextView z;

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0006\u0010\u000f\u001a\u00020\u0010R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabMineNewFragment$BgPagerAdapter;", "Lcom/taihebase/activity/base/BasePagerAdapter;", "", "context", "Landroid/content/Context;", "(Lcom/showstartfans/activity/activitys/maintab/newmain/TabMineNewFragment;Landroid/content/Context;)V", "sdv_conver_map", "Lcom/facebook/drawee/view/SimpleDraweeView;", "getCount", "", "getPageTitle", "", h.a.a.a.a.i.g.C, "onCreateView", "Landroid/view/View;", "update", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends h.y.a.f.i<String> {
        @Nullable
        private SimpleDraweeView c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ k4 f18736d;

        public a(@Nullable k4 k4Var, Context context) {
        }

        public static /* synthetic */ void j(k4 k4Var, View view) {
        }

        public static /* synthetic */ void k(k4 k4Var, View view) {
        }

        private static final void l(k4 k4Var, View view) {
        }

        private static final void m(k4 k4Var, View view) {
        }

        @Override // h.y.a.f.i, androidx.viewpager.widget.PagerAdapter
        public int getCount() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NotNull
        public CharSequence getPageTitle(int i2) {
        }

        @Override // h.y.a.f.i
        @NotNull
        public View h(int i2) {
        }

        public final void n() {
        }
    }

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<h.u.a.c.l0.t3> {
        public final /* synthetic */ k4 this$0;

        public b(k4 k4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.u.a.c.l0.t3 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.u.a.c.l0.t3 invoke() {
        }
    }

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Integer> {
        public final /* synthetic */ k4 this$0;

        public c(k4 k4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
        }
    }

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ k4 this$0;

        /* compiled from: TabMineNewFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/UserHomePagerInfoBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends Lambda implements Function1<UserHomePagerInfoBean, Unit> {
            public final /* synthetic */ k4 this$0;

            public a(k4 k4Var) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UserHomePagerInfoBean userHomePagerInfoBean) {
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable UserHomePagerInfoBean userHomePagerInfoBean) {
            }
        }

        public d(k4 k4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/PostArticleData;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function1<PostArticleData, Unit> {
        public final /* synthetic */ k4 this$0;

        public e(k4 k4Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PostArticleData postArticleData) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable PostArticleData postArticleData) {
        }
    }

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabMineNewFragment$initBgPager$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", h.a.a.a.a.i.g.C, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends ViewPager.SimpleOnPageChangeListener {
        public final /* synthetic */ k4 b;

        public f(k4 k4Var) {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }
    }

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/UserHomePagerInfoBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends Lambda implements Function1<UserHomePagerInfoBean, Unit> {
        public final /* synthetic */ k4 this$0;

        public g(k4 k4Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserHomePagerInfoBean userHomePagerInfoBean) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable UserHomePagerInfoBean userHomePagerInfoBean) {
        }
    }

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabMineNewFragment$initListener$23", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class h extends BottomSheetBehavior.BottomSheetCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k4 f18737a;

        public h(k4 k4Var) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NotNull View view, float f2) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NotNull View view, int i2) {
        }
    }

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabMineNewFragment$initListener$24", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class i extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k4 f18738a;

        public i(k4 k4Var) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class j extends Lambda implements Function1<CoordinatorLayout, Unit> {
        public final /* synthetic */ k4 this$0;

        public j(k4 k4Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CoordinatorLayout coordinatorLayout) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull CoordinatorLayout coordinatorLayout) {
        }
    }

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class k extends Lambda implements Function0<h.v.a.d> {
        public static final k INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.v.a.d invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.v.a.d invoke() {
        }
    }

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/UserHomePagerInfoBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class l extends Lambda implements Function1<UserHomePagerInfoBean, Unit> {
        public final /* synthetic */ k4 this$0;

        public l(k4 k4Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserHomePagerInfoBean userHomePagerInfoBean) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable UserHomePagerInfoBean userHomePagerInfoBean) {
        }
    }

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/UserHomePagerInfoBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class m extends Lambda implements Function1<UserHomePagerInfoBean, Unit> {
        public final /* synthetic */ k4 this$0;

        public m(k4 k4Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserHomePagerInfoBean userHomePagerInfoBean) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable UserHomePagerInfoBean userHomePagerInfoBean) {
        }
    }

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/UserHomePagerInfoBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class n extends Lambda implements Function1<UserHomePagerInfoBean, Unit> {
        public final /* synthetic */ k4 this$0;

        public n(k4 k4Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserHomePagerInfoBean userHomePagerInfoBean) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable UserHomePagerInfoBean userHomePagerInfoBean) {
        }
    }

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/UserHomePagerInfoBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class o extends Lambda implements Function1<UserHomePagerInfoBean, Unit> {
        public final /* synthetic */ k4 this$0;

        public o(k4 k4Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserHomePagerInfoBean userHomePagerInfoBean) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable UserHomePagerInfoBean userHomePagerInfoBean) {
        }
    }

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/taihebase/activity/utils/SPUtileBiz;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class p extends Lambda implements Function0<h.y.a.n.u0> {
        public static final p INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.y.a.n.u0 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final h.y.a.n.u0 invoke() {
        }
    }

    /* compiled from: TabMineNewFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class q extends Lambda implements Function0<Integer> {
        public final /* synthetic */ k4 this$0;

        public q(k4 k4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
        }
    }

    public static final /* synthetic */ void A(k4 k4Var, boolean z) {
    }

    private static final void A0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ void B(k4 k4Var, boolean z) {
    }

    private static final void B0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ boolean C(k4 k4Var) {
    }

    private static final void C0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ boolean D(k4 k4Var) {
    }

    public static /* synthetic */ void D0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ void E(k4 k4Var) {
    }

    public static /* synthetic */ void E0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ void F(k4 k4Var, TextView textView) {
    }

    public static /* synthetic */ void F0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ void G(k4 k4Var, TextView textView) {
    }

    public static /* synthetic */ void G0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ void H(k4 k4Var, boolean z) {
    }

    public static /* synthetic */ void H0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ void I(k4 k4Var, boolean z) {
    }

    public static /* synthetic */ void I0(k4 k4Var) {
    }

    public static final /* synthetic */ void J(k4 k4Var, int i2) {
    }

    public static /* synthetic */ void J0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ void K(k4 k4Var, boolean z) {
    }

    public static /* synthetic */ void K0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ void L(k4 k4Var, SimpleDraweeView simpleDraweeView) {
    }

    public static /* synthetic */ void L0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ void M(k4 k4Var, UserPhotoSmallView userPhotoSmallView) {
    }

    public static /* synthetic */ void M0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ void N(k4 k4Var, int i2) {
    }

    public static /* synthetic */ void N0(k4 k4Var, View view) {
    }

    private final void O() {
    }

    public static /* synthetic */ void O0(k4 k4Var, View view) {
    }

    private final void P() {
    }

    public static /* synthetic */ void P0(k4 k4Var) {
    }

    private final void Q() {
    }

    public static /* synthetic */ void Q0(k4 k4Var, Function1 function1, boolean z, h.y.a.m.n nVar) {
    }

    private final h.u.a.c.l0.t3 R() {
    }

    public static /* synthetic */ void R0(k4 k4Var, View view) {
    }

    private final int S() {
    }

    public static /* synthetic */ void S0(k4 k4Var) {
    }

    private final void T() {
    }

    public static /* synthetic */ void T0(k4 k4Var, View view) {
    }

    private static final void U(k4 k4Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void U0(k4 k4Var, View view) {
    }

    private final void V(boolean z, boolean z2, Function1<? super UserHomePagerInfoBean, Unit> function1) {
    }

    public static /* synthetic */ void V0(k4 k4Var, PlayMusicEvent playMusicEvent) {
    }

    private static final void W(k4 k4Var, Function1 function1, boolean z, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void W0(k4 k4Var) {
    }

    private final h.y.a.n.u0 X() {
    }

    public static /* synthetic */ void X0(k4 k4Var, h.y.a.m.n nVar) {
    }

    private final int Y() {
    }

    public static /* synthetic */ void Y0(k4 k4Var, View view) {
    }

    private final void Z(boolean z) {
    }

    public static /* synthetic */ void Z0(k4 k4Var, View view) {
    }

    private final void a0(boolean z) {
    }

    public static /* synthetic */ void a1(k4 k4Var, View view) {
    }

    private static final void b0(k4 k4Var) {
    }

    public static /* synthetic */ void b1(k4 k4Var, View view) {
    }

    private final void c0(boolean z) {
    }

    public static /* synthetic */ void c1(k4 k4Var, boolean z) {
    }

    private static final void d0(k4 k4Var) {
    }

    public static /* synthetic */ void d1(k4 k4Var, View view) {
    }

    private final void e0(String str) {
    }

    public static /* synthetic */ void e1(k4 k4Var, View view) {
    }

    private final void f0() {
    }

    public static /* synthetic */ void f1(k4 k4Var, View view) {
    }

    public static final /* synthetic */ void g(k4 k4Var) {
    }

    private final View g0() {
    }

    private final void g1() {
    }

    private final h.v.a.d getLoadMoreAction() {
    }

    public static final /* synthetic */ h.u.a.c.l0.t3 h(k4 k4Var) {
    }

    private static final void h0(k4 k4Var, boolean z) {
    }

    private final void h1() {
    }

    public static final /* synthetic */ TextView i(k4 k4Var) {
    }

    private static final void i0(k4 k4Var, View view) {
    }

    private static final void i1(k4 k4Var) {
    }

    public static final /* synthetic */ TextView j(k4 k4Var) {
    }

    private static final void j0(k4 k4Var, View view) {
    }

    private static final void j1(k4 k4Var, PlayMusicEvent playMusicEvent) {
    }

    public static final /* synthetic */ BottomSheetBehavior k(k4 k4Var) {
    }

    private static final void k0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ boolean l(k4 k4Var) {
    }

    private static final void l0(k4 k4Var, View view) {
    }

    private final void l1() {
    }

    public static final /* synthetic */ boolean m(k4 k4Var) {
    }

    private static final void m0(k4 k4Var, View view) {
    }

    private final void m1(String str) {
    }

    public static final /* synthetic */ FragmentActivity n(k4 k4Var) {
    }

    private static final void n0(k4 k4Var, View view) {
    }

    private final void n1() {
    }

    private static final void o0(k4 k4Var, View view) {
    }

    private final void o1() {
    }

    /* renamed from: onEvent$lambda-36  reason: not valid java name */
    private static final void m41onEvent$lambda36(k4 k4Var) {
    }

    private static final void p0(k4 k4Var, View view) {
    }

    private final void p1(String str) {
    }

    public static final /* synthetic */ int q(k4 k4Var) {
    }

    private static final void q0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ h.v.a.d r(k4 k4Var) {
    }

    private static final void r0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ UserPhotoSmallView s(k4 k4Var) {
    }

    private static final void s0(k4 k4Var, View view) {
    }

    private static final void t0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ void u(k4 k4Var) {
    }

    private static final void u0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ void v(k4 k4Var, boolean z, boolean z2, Function1 function1) {
    }

    private static final void v0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ int w(k4 k4Var) {
    }

    private static final void w0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ int x(k4 k4Var) {
    }

    private static final void x0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ UserHomePagerInfoBean y(k4 k4Var) {
    }

    private static final void y0(k4 k4Var, View view) {
    }

    public static final /* synthetic */ ViewPager z(k4 k4Var) {
    }

    private static final void z0(k4 k4Var, View view) {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.y.a.f.o.e
    public int getContentView() {
    }

    @Override // h.y.a.f.o.e
    public void initData() {
    }

    @Override // h.y.a.f.o.e
    public void initListener() {
    }

    @Override // h.y.a.f.o.e
    public void initView() {
    }

    public final void k1() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshUserSceneEvent refreshUserSceneEvent) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
    }

    @Override // h.y.a.f.o.d, androidx.fragment.app.Fragment
    public void onPause() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
    }

    @Override // h.u.a.l.b
    public void p() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshUserInfoEvent refreshUserInfoEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable ConverChangeEvent converChangeEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@NotNull PlayMusicEvent playMusicEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable LoginEvent loginEvent) {
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
    public final void onEvent(@Nullable ArticlePublishEvent articlePublishEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshUserSignEvent refreshUserSignEvent) {
    }
}
