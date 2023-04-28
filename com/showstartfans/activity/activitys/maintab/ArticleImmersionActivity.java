package com.showstartfans.activity.activitys.maintab;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.view.ViewPagerLayoutManager;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.u.a.d.k0;
import h.u.a.g.j;
import h.u.a.h.t0;
import h.y.a.m.n;
import h.y.a.m.o;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArticleImmersionActivity.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 92\u00020\u0001:\u00029:B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\fH\u0002J\b\u0010(\u001a\u00020%H\u0002J\b\u0010)\u001a\u00020%H\u0014J\b\u0010*\u001a\u00020%H\u0002J\b\u0010+\u001a\u00020%H\u0002J\b\u0010,\u001a\u00020%H\u0014J\b\u0010-\u001a\u00020%H\u0014J\b\u0010.\u001a\u00020%H\u0014J\b\u0010/\u001a\u00020%H\u0014J\b\u00100\u001a\u00020%H\u0014J\u0018\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020!H\u0002J\b\u00104\u001a\u00020%H\u0014J\b\u00105\u001a\u00020%H\u0002J\b\u00106\u001a\u000207H\u0014J\b\u00108\u001a\u00020!H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/ArticleImmersionActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "adapter", "Lcom/showstartfans/activity/adapter/ArticleImmersionAdapter;", "getAdapter", "()Lcom/showstartfans/activity/adapter/ArticleImmersionAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/showstartfans/activity/databinding/ActivityArticleImmersionBinding;", "currentPos", "", "layoutManager", "Lcom/showstartfans/activity/view/ViewPagerLayoutManager;", "getLayoutManager", "()Lcom/showstartfans/activity/view/ViewPagerLayoutManager;", "layoutManager$delegate", "mCurrentData", "Lcom/showstartfans/activity/model/Article;", "mFromArticleID", "", "mFromData", "mGestureDetector", "Landroid/view/GestureDetector;", "getMGestureDetector", "()Landroid/view/GestureDetector;", "setMGestureDetector", "(Landroid/view/GestureDetector;)V", "mPage", "reviewwDoalog", "Lcom/showstartfans/activity/dialog/ReviewListDialog;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "finish", "", "getData", "page", "getSceneDetail", "initData", "initFirstData", "initGestureDetector", "initListener", "initView", "onPause", "onRestart", "onResume", "onSelectedPage", h.a.a.a.a.i.g.C, "isBottom", "onStop", "onSwipeLeft", "setContentViewResByViewBind", "Landroid/view/View;", "setStatusBarTextWhite", "Companion", "loadMoreListener", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ArticleImmersionActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public static final a f5749m = null;
    @NotNull
    public Map<Integer, View> b;
    private int c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f5750d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f5751e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private t0 f5752f;

    /* renamed from: g  reason: collision with root package name */
    private int f5753g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private Article f5754h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private Article f5755i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private String f5756j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private GestureDetector f5757k;

    /* renamed from: l  reason: collision with root package name */
    private j f5758l;

    /* compiled from: ArticleImmersionActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/ArticleImmersionActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "context", "Landroid/content/Context;", "article", "Lcom/showstartfans/activity/model/Article;", "articleID", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@NotNull Context context, @Nullable Article article) {
        }

        public final void b(@NotNull Context context, @Nullable String str) {
        }
    }

    /* compiled from: ArticleImmersionActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/adapter/ArticleImmersionAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<k0> {
        public final /* synthetic */ ArticleImmersionActivity this$0;

        public b(ArticleImmersionActivity articleImmersionActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final k0 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ k0 invoke() {
        }
    }

    /* compiled from: ArticleImmersionActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ ArticleImmersionActivity this$0;

        public c(ArticleImmersionActivity articleImmersionActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: ArticleImmersionActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/Article;", "code", "Lcom/taihebase/activity/network/ResultCode;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function2<Article, o, Unit> {
        public final /* synthetic */ ArticleImmersionActivity this$0;

        /* compiled from: ArticleImmersionActivity.kt */
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

        public d(ArticleImmersionActivity articleImmersionActivity) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Article article, o oVar) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Article article, @NotNull o oVar) {
        }
    }

    /* compiled from: ArticleImmersionActivity.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"com/showstartfans/activity/activitys/maintab/ArticleImmersionActivity$initGestureDetector$1", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "onFling", "", "e1", "Landroid/view/MotionEvent;", "e2", "velocityX", "", "velocityY", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ ArticleImmersionActivity b;

        public e(ArticleImmersionActivity articleImmersionActivity) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f2, float f3) {
        }
    }

    /* compiled from: ArticleImmersionActivity.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/maintab/ArticleImmersionActivity$initListener$1", "Lcom/showstartfans/activity/view/ViewPagerLayoutManager$OnViewPagerListener;", "onInitComplete", "", "onPageRelease", "isNext", "", h.a.a.a.a.i.g.C, "", "onPageSelected", "isBottom", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f implements ViewPagerLayoutManager.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArticleImmersionActivity f5759a;

        public f(ArticleImmersionActivity articleImmersionActivity) {
        }

        @Override // com.showstartfans.activity.view.ViewPagerLayoutManager.b
        public void a(int i2, boolean z) {
        }

        @Override // com.showstartfans.activity.view.ViewPagerLayoutManager.b
        public void onInitComplete() {
        }

        @Override // com.showstartfans.activity.view.ViewPagerLayoutManager.b
        public void onPageRelease(boolean z, int i2) {
        }
    }

    /* compiled from: ArticleImmersionActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends Lambda implements Function0<Unit> {
        public final /* synthetic */ ArticleImmersionActivity this$0;

        public g(ArticleImmersionActivity articleImmersionActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: ArticleImmersionActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/view/ViewPagerLayoutManager;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class h extends Lambda implements Function0<ViewPagerLayoutManager> {
        public final /* synthetic */ ArticleImmersionActivity this$0;

        public h(ArticleImmersionActivity articleImmersionActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewPagerLayoutManager invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ ViewPagerLayoutManager invoke() {
        }
    }

    /* compiled from: ArticleImmersionActivity.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u0006\u0010\u0016\u001a\u00020\u0006R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/ArticleImmersionActivity$loadMoreListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "mPageSize", "", "loadmore", "Lkotlin/Function0;", "", "(ILkotlin/jvm/functions/Function0;)V", "ITEM_LEFT_TO_LOAD_MORE", "isLoadingMore", "", "lastItemCount", "getLoadmore", "()Lkotlin/jvm/functions/Function0;", "pageSize", "onScrolled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "processOnMore", "mRecycler", "resetLastItemCount", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class i extends RecyclerView.OnScrollListener {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final Function0<Unit> f5760a;
        private int b;
        private boolean c;

        /* renamed from: d  reason: collision with root package name */
        private int f5761d;

        /* renamed from: e  reason: collision with root package name */
        private int f5762e;

        public /* synthetic */ i(int i2, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        }

        private final void b(RecyclerView recyclerView) {
        }

        @NotNull
        public final Function0<Unit> a() {
        }

        public final void c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }

        public i(int i2, @NotNull Function0<Unit> function0) {
        }
    }

    public static final /* synthetic */ int A(ArticleImmersionActivity articleImmersionActivity) {
    }

    public static final /* synthetic */ void B(ArticleImmersionActivity articleImmersionActivity) {
    }

    public static final /* synthetic */ void C(ArticleImmersionActivity articleImmersionActivity, int i2, boolean z) {
    }

    public static final /* synthetic */ void D(ArticleImmersionActivity articleImmersionActivity) {
    }

    public static final /* synthetic */ void E(ArticleImmersionActivity articleImmersionActivity, Article article) {
    }

    private final k0 F() {
    }

    private final void G(int i2) {
    }

    private static final void H(ArticleImmersionActivity articleImmersionActivity, n nVar) {
    }

    private final ViewPagerLayoutManager I() {
    }

    private final void K() {
    }

    private final void L() {
    }

    private static final void M(ArticleImmersionActivity articleImmersionActivity) {
    }

    private final void N() {
    }

    public static /* synthetic */ void O(ArticleImmersionActivity articleImmersionActivity, n nVar) {
    }

    public static /* synthetic */ void P(ArticleImmersionActivity articleImmersionActivity) {
    }

    private final void Q(int i2, boolean z) {
    }

    private final void R() {
    }

    public static final /* synthetic */ void w(ArticleImmersionActivity articleImmersionActivity, o oVar, Function0 function0) {
    }

    public static final /* synthetic */ k0 x(ArticleImmersionActivity articleImmersionActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity y(ArticleImmersionActivity articleImmersionActivity) {
    }

    public static final /* synthetic */ void z(ArticleImmersionActivity articleImmersionActivity, int i2) {
    }

    @Nullable
    public final GestureDetector J() {
    }

    public final void S(@Nullable GestureDetector gestureDetector) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
    }

    @Override // android.app.Activity
    public void finish() {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, android.app.Activity
    public void onRestart() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity
    public boolean setStatusBarTextWhite() {
    }
}
