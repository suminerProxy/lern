package com.showstartfans.activity.activitys.profile;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.model.SceneDetailCommBean;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.u.a.c.f0.a9;
import h.u.a.g.n4;
import h.u.a.w.d0.d2;
import h.y.a.m.o;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SceneCommDetailActivity.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J(\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u0016H\u0014J\b\u0010$\u001a\u00020\u0016H\u0014J\b\u0010%\u001a\u00020\u0016H\u0014J\b\u0010&\u001a\u00020'H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/SceneCommDetailActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/maintab/SceneDetailCommAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/maintab/SceneDetailCommAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "headDingCount", "", "headId", "headIsDing", "headUserId", "headUserName", "", "headUserType", "mainReviewId", "sceneId", "viewBinding", "Lcom/showstartfans/activity/databinding/ActivitySceneCommDetailsBinding;", "bindCommHead", "", "commBean", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "first", "", "isHeadLoad", "bindView", "bean", "Lcom/showstartfans/activity/model/Article;", "getReplayComm", "reviewId", "firstId", "lastId", "initData", "initListener", "initView", "setContentViewResByViewBind", "Landroid/view/View;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class SceneCommDetailActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public static final a f6224m = null;
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f6225d;

    /* renamed from: e  reason: collision with root package name */
    private int f6226e;

    /* renamed from: f  reason: collision with root package name */
    private int f6227f;

    /* renamed from: g  reason: collision with root package name */
    private int f6228g;

    /* renamed from: h  reason: collision with root package name */
    private int f6229h;

    /* renamed from: i  reason: collision with root package name */
    private int f6230i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private String f6231j;

    /* renamed from: k  reason: collision with root package name */
    private n4 f6232k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private final Lazy f6233l;

    /* compiled from: SceneCommDetailActivity.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/SceneCommDetailActivity$Companion;", "", "()V", "start", "", "ctx", "Landroid/app/Activity;", "sceneId", "", "mainReviewId", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@Nullable Activity activity, int i2, int i3) {
        }
    }

    /* compiled from: SceneCommDetailActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/SceneDetailCommAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<a9> {
        public final /* synthetic */ SceneCommDetailActivity this$0;

        public b(SceneCommDetailActivity sceneCommDetailActivity) {
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

    /* compiled from: SceneCommDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<SceneDetailCommBean, Unit> {
        public final /* synthetic */ int $firstId;
        public final /* synthetic */ boolean $isHeadLoad;
        public final /* synthetic */ SceneCommDetailActivity this$0;

        public c(SceneCommDetailActivity sceneCommDetailActivity, int i2, boolean z) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SceneDetailCommBean sceneDetailCommBean) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable SceneDetailCommBean sceneDetailCommBean) {
        }
    }

    /* compiled from: SceneCommDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/Article;", "code", "Lcom/taihebase/activity/network/ResultCode;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function2<Article, o, Unit> {
        public final /* synthetic */ SceneCommDetailActivity this$0;

        public d(SceneCommDetailActivity sceneCommDetailActivity) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Article article, o oVar) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Article article, @NotNull o oVar) {
        }
    }

    /* compiled from: SceneCommDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/profile/SceneCommDetailActivity$initListener$1", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SceneCommDetailActivity f6234a;

        public e(SceneCommDetailActivity sceneCommDetailActivity) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    /* compiled from: SceneCommDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/profile/SceneCommDetailActivity$initListener$6$1", "Lcom/showstartfans/activity/widget/popupwindow/OnDanmuInputCall;", "onDanmuInputCall", "", "inputStr", "", "onDanmuInputDismiss", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f implements d2 {
        public final /* synthetic */ SceneCommDetailActivity b;

        /* compiled from: SceneCommDetailActivity.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends Lambda implements Function1<Integer, Unit> {
            public final /* synthetic */ String $inputStr;
            public final /* synthetic */ SceneCommDetailActivity this$0;

            public a(SceneCommDetailActivity sceneCommDetailActivity, String str) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            }

            public final void invoke(int i2) {
            }
        }

        public f(SceneCommDetailActivity sceneCommDetailActivity) {
        }

        @Override // h.u.a.w.d0.d2
        public void onDanmuInputCall(@NotNull String str) {
        }

        @Override // h.u.a.w.d0.d2
        public void onDanmuInputDismiss() {
        }
    }

    /* compiled from: SceneCommDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/profile/SceneCommDetailActivity$initListener$8", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SceneCommDetailActivity f6235a;

        public g(SceneCommDetailActivity sceneCommDetailActivity) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    public static final /* synthetic */ int A(SceneCommDetailActivity sceneCommDetailActivity) {
    }

    public static final /* synthetic */ String B(SceneCommDetailActivity sceneCommDetailActivity) {
    }

    public static final /* synthetic */ void C(SceneCommDetailActivity sceneCommDetailActivity, int i2, int i3, int i4, boolean z) {
    }

    public static final /* synthetic */ int D(SceneCommDetailActivity sceneCommDetailActivity) {
    }

    public static final /* synthetic */ n4 E(SceneCommDetailActivity sceneCommDetailActivity) {
    }

    private final void F(SceneDetailCommBean sceneDetailCommBean, boolean z, boolean z2) {
    }

    private final void G(Article article) {
    }

    private final a9 H() {
    }

    private final void I(int i2, int i3, int i4, boolean z) {
    }

    private static final void J(SceneCommDetailActivity sceneCommDetailActivity, View view) {
    }

    private static final void K(SceneCommDetailActivity sceneCommDetailActivity, View view) {
    }

    private static final void L(SceneCommDetailActivity sceneCommDetailActivity, View view) {
    }

    private static final void M(SceneCommDetailActivity sceneCommDetailActivity, View view) {
    }

    private static final void N(SceneCommDetailActivity sceneCommDetailActivity, View view) {
    }

    private static final void O(SceneCommDetailActivity sceneCommDetailActivity, AppBarLayout appBarLayout, int i2) {
    }

    public static /* synthetic */ void P(SceneCommDetailActivity sceneCommDetailActivity, View view) {
    }

    public static /* synthetic */ void Q(SceneCommDetailActivity sceneCommDetailActivity, AppBarLayout appBarLayout, int i2) {
    }

    public static /* synthetic */ void R(SceneCommDetailActivity sceneCommDetailActivity, View view) {
    }

    public static /* synthetic */ void S(SceneCommDetailActivity sceneCommDetailActivity, View view) {
    }

    public static /* synthetic */ void T(SceneCommDetailActivity sceneCommDetailActivity, View view) {
    }

    public static /* synthetic */ void U(SceneCommDetailActivity sceneCommDetailActivity, View view) {
    }

    public static final /* synthetic */ void w(SceneCommDetailActivity sceneCommDetailActivity, SceneDetailCommBean sceneDetailCommBean, boolean z, boolean z2) {
    }

    public static final /* synthetic */ void x(SceneCommDetailActivity sceneCommDetailActivity, Article article) {
    }

    public static final /* synthetic */ a9 y(SceneCommDetailActivity sceneCommDetailActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity z(SceneCommDetailActivity sceneCommDetailActivity) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
