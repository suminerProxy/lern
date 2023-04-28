package com.showstartfans.activity.activitys.profile;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.showstartfans.activity.eventmodel.SceneCommCountChangeEvent;
import com.showstartfans.activity.eventmodel.SceneDetailCommEvent;
import com.showstartfans.activity.eventmodel.SceneDetailZanEvent;
import com.showstartfans.activity.eventmodel.VideoListUserFollowEvent;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.model.SceneDetailCommBean;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.u.a.c.f0.a9;
import h.u.a.c.l0.i3;
import h.u.a.g.o4;
import h.y.a.m.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ScenePostDetailsActivity.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0014J\u0018\u0010!\u001a\u00020\u001f2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0002J\u001c\u0010%\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010\u00182\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u0018\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0010H\u0002J\u0018\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0010H\u0002J$\u0010.\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010/\u001a\u00020\u0010H\u0002J\u0012\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u000102H\u0002J\b\u00103\u001a\u00020\u001fH\u0014J\b\u00104\u001a\u00020\u001fH\u0015J\b\u00105\u001a\u00020\u001fH\u0014J\u0012\u00106\u001a\u00020\u001f2\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u0012\u00109\u001a\u00020\u001f2\b\u0010:\u001a\u0004\u0018\u00010$H\u0016J\b\u0010;\u001a\u00020\u001fH\u0016J\u0018\u0010<\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u000bH\u0016J\u0010\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020\u000bH\u0016J\u0012\u0010A\u001a\u00020\u001f2\b\u0010B\u001a\u0004\u0018\u00010CH\u0007J\u0012\u0010A\u001a\u00020\u001f2\b\u0010B\u001a\u0004\u0018\u00010DH\u0007J\u0012\u0010A\u001a\u00020\u001f2\b\u0010B\u001a\u0004\u0018\u00010EH\u0007J\u0012\u0010A\u001a\u00020\u001f2\b\u0010B\u001a\u0004\u0018\u00010FH\u0007J\u0012\u0010A\u001a\u00020\u001f2\b\u0010B\u001a\u0004\u0018\u00010GH\u0007J\u0012\u0010H\u001a\u00020\u001f2\b\u0010I\u001a\u0004\u0018\u00010JH\u0014J\b\u0010K\u001a\u00020\u001fH\u0014J\b\u0010L\u001a\u00020\u001fH\u0014J\u0012\u0010M\u001a\u00020\u001f2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\b\u0010P\u001a\u00020\u001fH\u0002J\b\u0010Q\u001a\u00020\u001fH\u0002J\u0010\u0010R\u001a\u00020\u001f2\u0006\u0010S\u001a\u00020\u000bH\u0002J\b\u0010T\u001a\u00020UH\u0014J\b\u0010V\u001a\u00020\u001fH\u0002J\b\u0010W\u001a\u00020\u001fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\rj\b\u0012\u0004\u0012\u00020\u000b`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ScenePostDetailsActivity;", "Lcom/showstartfans/activity/activitys/profile/BaseScenePostDetailActivity;", "Lcom/mob/moblink/SceneRestorable;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/maintab/SceneDetailCommAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/maintab/SceneDetailCommAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "detailCla", "", "excludeReviewIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "globalPlayer", "", "isHot", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "getLoadMoreAction", "()Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "loadMoreAction$delegate", "mBean", "Lcom/showstartfans/activity/model/Article;", "pageNo", "sdv_video_conver", "Lcom/facebook/drawee/view/SimpleDraweeView;", "viewBind", "Lcom/showstartfans/activity/databinding/ActivityScenePostDetailsBinding;", "NotifyCenterZanInfo", "", "OnAutoPullDown", "addListData", "it", "", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "addZanLottieAnimation", "bean", "parent", "Landroid/widget/FrameLayout;", "bindView", "type", "needSetMedia", "getSceneDetail", "showProgress", "getVideoComm", "isHotReal", "indexOfDinglUsers", "userID", "", "initData", "initListener", "initView", "newPlayer", "viewP", "Landroidx/cardview/widget/CardView;", "onAddNewComment", "newCommBean", "onBackPressed", "onChangeZanStatus", "isCollect", "zanNum", "onDeleteScene", "id", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/SceneCommCountChangeEvent;", "Lcom/showstartfans/activity/eventmodel/SceneDetailCommEvent;", "Lcom/showstartfans/activity/eventmodel/SceneDetailZanEvent;", "Lcom/showstartfans/activity/eventmodel/VideoListUserFollowEvent;", "Lcom/showstartfans/activity/model/ArticleImmersinPraiseEvent;", "onNewIntent", "intent", "Landroid/content/Intent;", "onPause", "onResume", "onReturnSceneData", "p0", "Lcom/mob/moblink/Scene;", "resetPlayer", "scrollToItemComm", "setContentViewByType", "cla", "setContentViewResByViewBind", "Landroid/view/View;", "setTabTitleStyle", "setVideoPlayerByStatus", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ScenePostDetailsActivity extends BaseScenePostDetailActivity implements SceneRestorable {
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public Map<Integer, View> f6236o;

    /* renamed from: p  reason: collision with root package name */
    private int f6237p;
    private boolean q;
    private int r;
    private boolean s;
    @NotNull
    private final ArrayList<Integer> t;
    @Nullable
    private Article u;
    @Nullable
    private SimpleDraweeView v;
    private o4 w;
    @NotNull
    private final Lazy x;
    @NotNull
    private final Lazy y;

    /* compiled from: ScenePostDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/SceneDetailCommAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<a9> {
        public final /* synthetic */ ScenePostDetailsActivity this$0;

        public a(ScenePostDetailsActivity scenePostDetailsActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ a9 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final a9 invoke() {
        }
    }

    /* compiled from: ScenePostDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<Integer, Boolean> {
        public final /* synthetic */ ScenePostDetailsActivity this$0;

        public b(ScenePostDetailsActivity scenePostDetailsActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        }

        @NotNull
        public final Boolean invoke(int i2) {
        }
    }

    /* compiled from: ScenePostDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/activitys/profile/ScenePostDetailsActivity$bindView$1$3", "Lcom/showstartfans/activity/activitys/profile/OnRecycleItemDoubleClick;", "onItemDoubleClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements i3 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScenePostDetailsActivity f6238a;

        public c(ScenePostDetailsActivity scenePostDetailsActivity) {
        }

        @Override // h.u.a.c.l0.i3
        public void a() {
        }
    }

    /* compiled from: ScenePostDetailsActivity.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/profile/ScenePostDetailsActivity$bindView$1$4", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", h.a.a.a.a.i.g.C, "positionOffset", "", "positionOffsetPixels", "onPageSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ ScenePostDetailsActivity b;
        public final /* synthetic */ Article c;

        public d(ScenePostDetailsActivity scenePostDetailsActivity, Article article) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }
    }

    /* compiled from: ScenePostDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/Article;", "code", "Lcom/taihebase/activity/network/ResultCode;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function2<Article, o, Unit> {
        public final /* synthetic */ boolean $needSetMedia;
        public final /* synthetic */ boolean $showProgress;
        public final /* synthetic */ ScenePostDetailsActivity this$0;

        /* compiled from: ScenePostDetailsActivity.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends Lambda implements Function0<Unit> {
            public static final a INSTANCE = null;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public e(boolean z, ScenePostDetailsActivity scenePostDetailsActivity, boolean z2) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Article article, o oVar) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Article article, @NotNull o oVar) {
        }
    }

    /* compiled from: ScenePostDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function1<List<? extends SceneDetailCommBean>, Unit> {
        public final /* synthetic */ ScenePostDetailsActivity this$0;

        public f(ScenePostDetailsActivity scenePostDetailsActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends SceneDetailCommBean> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable List<? extends SceneDetailCommBean> list) {
        }
    }

    /* compiled from: ScenePostDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends Lambda implements Function1<List<? extends SceneDetailCommBean>, Unit> {
        public final /* synthetic */ ScenePostDetailsActivity this$0;

        public g(ScenePostDetailsActivity scenePostDetailsActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends SceneDetailCommBean> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable List<? extends SceneDetailCommBean> list) {
        }
    }

    /* compiled from: ScenePostDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class h extends Lambda implements Function1<List<? extends SceneDetailCommBean>, Unit> {
        public final /* synthetic */ ScenePostDetailsActivity this$0;

        public h(ScenePostDetailsActivity scenePostDetailsActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends SceneDetailCommBean> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable List<? extends SceneDetailCommBean> list) {
        }
    }

    /* compiled from: ScenePostDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "path", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class i extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ ScenePostDetailsActivity this$0;

        public i(ScenePostDetailsActivity scenePostDetailsActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
        }
    }

    /* compiled from: ScenePostDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "isDouble", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class j extends Lambda implements Function2<View, Boolean, Unit> {
        public final /* synthetic */ ScenePostDetailsActivity this$0;

        public j(ScenePostDetailsActivity scenePostDetailsActivity) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Boolean bool) {
        }

        public final void invoke(@NotNull View view, boolean z) {
        }
    }

    /* compiled from: ScenePostDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/profile/ScenePostDetailsActivity$initListener$3", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class k implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScenePostDetailsActivity f6239a;

        public k(ScenePostDetailsActivity scenePostDetailsActivity) {
        }

        public static /* synthetic */ void c(ScenePostDetailsActivity scenePostDetailsActivity) {
        }

        private static final void d(ScenePostDetailsActivity scenePostDetailsActivity) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    /* compiled from: ScenePostDetailsActivity.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002K\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0001j\u0002`\nJ!\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/profile/ScenePostDetailsActivity$initListener$7", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "success", "isFollow", "", "newRelationship", "", "Lcom/showstartfans/activity/widget/OnFollowListener;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class l implements Function3<Boolean, Boolean, Integer, Unit> {
        public final /* synthetic */ ScenePostDetailsActivity b;

        public l(ScenePostDetailsActivity scenePostDetailsActivity) {
        }

        public void a(boolean z, boolean z2, int i2) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2, Integer num) {
        }
    }

    /* compiled from: ScenePostDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class m extends Lambda implements Function0<h.v.a.d> {
        public static final m INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.v.a.d invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.v.a.d invoke() {
        }
    }

    private final void A0(Article article, FrameLayout frameLayout) {
    }

    private static final void B0(LottieAnimationView lottieAnimationView, FrameLayout frameLayout, ValueAnimator valueAnimator) {
    }

    private final void C0(int i2, boolean z) {
    }

    private final a9 D0() {
    }

    private final h.v.a.d E0() {
    }

    private final void F0(boolean z, boolean z2) {
    }

    private final void G0(boolean z, boolean z2, boolean z3) {
    }

    public static /* synthetic */ void H0(ScenePostDetailsActivity scenePostDetailsActivity, boolean z, boolean z2, boolean z3, int i2, Object obj) {
    }

    private final int I0(String str) {
    }

    private static final void J0(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    private static final void K0(ScenePostDetailsActivity scenePostDetailsActivity, boolean z) {
    }

    private static final void L0(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    private static final void M0(ScenePostDetailsActivity scenePostDetailsActivity, Boolean bool) {
    }

    private static final void N0(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    private static final void O0(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    private static final void P0(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    private static final void Q0(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    private static final void R0(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    private static final void S0(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    private static final void T0(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    private static final void U0(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    public static /* synthetic */ void V0(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    public static /* synthetic */ void W0(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    public static /* synthetic */ void X0(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    public static /* synthetic */ void Y0(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    public static /* synthetic */ void Z0(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    public static /* synthetic */ void a1(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    public static /* synthetic */ void b1(ScenePostDetailsActivity scenePostDetailsActivity, boolean z) {
    }

    public static /* synthetic */ void c1(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    public static /* synthetic */ void d1(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    public static /* synthetic */ void e1(ScenePostDetailsActivity scenePostDetailsActivity) {
    }

    public static /* synthetic */ void f1(ScenePostDetailsActivity scenePostDetailsActivity) {
    }

    public static /* synthetic */ void g1(ScenePostDetailsActivity scenePostDetailsActivity, Boolean bool) {
    }

    public static /* synthetic */ void h1(LottieAnimationView lottieAnimationView, FrameLayout frameLayout, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void i1(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    public static /* synthetic */ void j1(ScenePostDetailsActivity scenePostDetailsActivity, View view) {
    }

    private final void k0() {
    }

    private final void k1(CardView cardView) {
    }

    private static final void l0(ScenePostDetailsActivity scenePostDetailsActivity) {
    }

    private final void l1() {
    }

    public static final /* synthetic */ void m0(ScenePostDetailsActivity scenePostDetailsActivity, List list) {
    }

    private final void m1() {
    }

    public static final /* synthetic */ void n0(ScenePostDetailsActivity scenePostDetailsActivity, Article article, FrameLayout frameLayout) {
    }

    private static final void n1(ScenePostDetailsActivity scenePostDetailsActivity) {
    }

    public static final /* synthetic */ void o0(ScenePostDetailsActivity scenePostDetailsActivity, int i2, boolean z) {
    }

    private final void o1(int i2) {
    }

    public static final /* synthetic */ void p0(ScenePostDetailsActivity scenePostDetailsActivity, o oVar, Function0 function0) {
    }

    private final void p1() {
    }

    public static final /* synthetic */ BaseNewFunctionActivity q0(ScenePostDetailsActivity scenePostDetailsActivity) {
    }

    private final void q1() {
    }

    public static final /* synthetic */ int r0(ScenePostDetailsActivity scenePostDetailsActivity) {
    }

    public static final /* synthetic */ h.v.a.d s0(ScenePostDetailsActivity scenePostDetailsActivity) {
    }

    public static final /* synthetic */ Article t0(ScenePostDetailsActivity scenePostDetailsActivity) {
    }

    public static final /* synthetic */ void u0(ScenePostDetailsActivity scenePostDetailsActivity, boolean z, boolean z2) {
    }

    public static final /* synthetic */ o4 v0(ScenePostDetailsActivity scenePostDetailsActivity) {
    }

    public static final /* synthetic */ void w0(ScenePostDetailsActivity scenePostDetailsActivity, int i2) {
    }

    public static final /* synthetic */ void x0(ScenePostDetailsActivity scenePostDetailsActivity, int i2) {
    }

    public static final /* synthetic */ void y0(ScenePostDetailsActivity scenePostDetailsActivity, int i2) {
    }

    private final void z0(List<? extends SceneDetailCommBean> list) {
    }

    @Override // com.showstartfans.activity.activitys.profile.BaseScenePostDetailActivity
    public void L(@Nullable SceneDetailCommBean sceneDetailCommBean) {
    }

    @Override // com.showstartfans.activity.activitys.profile.BaseScenePostDetailActivity
    public void M(boolean z, int i2) {
    }

    @Override // com.showstartfans.activity.activitys.profile.BaseScenePostDetailActivity
    public void N(int i2) {
    }

    @Override // com.showstartfans.activity.activitys.profile.BaseScenePostDetailActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.showstartfans.activity.activitys.profile.BaseScenePostDetailActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initData() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @SuppressLint({"CheckResult"})
    public void initListener() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable VideoListUserFollowEvent videoListUserFollowEvent) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }

    @Override // com.showstartfans.activity.activitys.profile.BaseScenePostDetailActivity
    public void w() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable SceneDetailZanEvent sceneDetailZanEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable SceneDetailCommEvent sceneDetailCommEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable SceneCommCountChangeEvent sceneCommCountChangeEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable h.u.a.o.a aVar) {
    }
}
