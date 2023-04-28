package h.u.a.c.h0;

import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.eventmodel.LoginEvent;
import com.showstartfans.activity.eventmodel.RefreshPayVideoStatusEvent;
import com.showstartfans.activity.eventmodel.RefreshSearchEvent;
import com.showstartfans.activity.eventmodel.VideoListItemPlayerRestoreEvent;
import com.showstartfans.activity.eventmodel.VideoListLikeEvent;
import com.showstartfans.activity.eventmodel.VideoListNewCommEvent;
import com.showstartfans.activity.eventmodel.VideoListUserFollowEvent;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SearchTabVideoFragment.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020\u0012H\u0014J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000bH\u0002J\b\u0010#\u001a\u00020!H\u0014J\b\u0010$\u001a\u00020!H\u0014J\b\u0010\n\u001a\u00020!H\u0014J\u0006\u0010%\u001a\u00020\u000bJ\u0006\u0010&\u001a\u00020!J\b\u0010'\u001a\u00020!H\u0016J\u0012\u0010(\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u00010*H\u0007J\u0012\u0010(\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u00010+H\u0007J\u0012\u0010(\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u00010,H\u0007J\u0012\u0010(\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u00010-H\u0007J\u0012\u0010(\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u00010.H\u0007J\u0012\u0010(\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u00010/H\u0007J\u0012\u0010(\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u000100H\u0007J\b\u00101\u001a\u00020!H\u0016J\b\u00102\u001a\u00020!H\u0016J\b\u00103\u001a\u00020!H\u0016J\u0006\u00104\u001a\u00020!J\u0006\u00105\u001a\u00020!J\u000e\u00106\u001a\u00020!2\u0006\u00107\u001a\u00020\u0012R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/showstartfans/activity/activitys/other/SearchTabVideoFragment;", "Lcom/taihebase/activity/base/fragment/BaseVisibleFragment;", "Lcom/taihe/videoplayer/callback/OnVideoPlayCompleteCall;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/maintab/findview/FindVideoMainAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/maintab/findview/FindVideoMainAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "initView", "", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "getLoadMoreAction", "()Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "loadMoreAction$delegate", "looperFlag", "", "mAdapter", "Lcom/soli/pullupdownrefresh/more/LoadMoreRecyclerAdapter;", "getMAdapter", "()Lcom/soli/pullupdownrefresh/more/LoadMoreRecyclerAdapter;", "mAdapter$delegate", "manager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "manager$delegate", "pageNo", "postData", "getContentView", "getVideoList", "", "isShow", "initData", "initListener", "isShowFragment", "loadFirstData", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/LoginEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshPayVideoStatusEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshSearchEvent;", "Lcom/showstartfans/activity/eventmodel/VideoListItemPlayerRestoreEvent;", "Lcom/showstartfans/activity/eventmodel/VideoListLikeEvent;", "Lcom/showstartfans/activity/eventmodel/VideoListNewCommEvent;", "Lcom/showstartfans/activity/eventmodel/VideoListUserFollowEvent;", "onInvisible", "onVideoPlayCompleteCall", "onVisible", "smoothScroollTop", "updatePlayerMsg", "updateVideoPayInfoById", "videoId", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class f5 extends h.y.a.f.o.f implements h.x.g.j.c {
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    public static final a f19072l = null;
    @NotNull
    public Map<Integer, View> c;

    /* renamed from: d  reason: collision with root package name */
    private int f19073d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f19074e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f19075f;

    /* renamed from: g  reason: collision with root package name */
    private int f19076g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final Lazy f19077h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final Lazy f19078i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private final Lazy f19079j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private final Lazy f19080k;

    /* compiled from: SearchTabVideoFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/showstartfans/activity/activitys/other/SearchTabVideoFragment$Companion;", "", "()V", "getInstance", "Lcom/showstartfans/activity/activitys/other/SearchTabVideoFragment;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ f5 b(a aVar, int i2, int i3, Object obj) {
        }

        @NotNull
        public final f5 a(int i2) {
        }
    }

    /* compiled from: SearchTabVideoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/findview/FindVideoMainAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<h.u.a.c.f0.u9.k0> {
        public final /* synthetic */ f5 this$0;

        public b(f5 f5Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.u.a.c.f0.u9.k0 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.u.a.c.f0.u9.k0 invoke() {
        }
    }

    /* compiled from: SearchTabVideoFragment.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/other/SearchTabVideoFragment$initListener$2", "Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;", "onChildViewAttachedToWindow", "", "view", "Landroid/view/View;", "onChildViewDetachedFromWindow", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements RecyclerView.OnChildAttachStateChangeListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(@NotNull View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(@NotNull View view) {
        }
    }

    /* compiled from: SearchTabVideoFragment.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/other/SearchTabVideoFragment$initListener$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f5 f19081a;

        public d(f5 f5Var) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* compiled from: SearchTabVideoFragment.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/showstartfans/activity/activitys/other/SearchTabVideoFragment$initListener$4", "Landroid/view/View$OnKeyListener;", "onKey", "", "view", "Landroid/view/View;", "i", "", "keyEvent", "Landroid/view/KeyEvent;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e implements View.OnKeyListener {
        public final /* synthetic */ f5 b;

        public e(f5 f5Var) {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(@Nullable View view, int i2, @NotNull KeyEvent keyEvent) {
        }
    }

    /* compiled from: SearchTabVideoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function0<h.v.a.d> {
        public static final f INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.v.a.d invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.v.a.d invoke() {
        }
    }

    /* compiled from: SearchTabVideoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/soli/pullupdownrefresh/more/LoadMoreRecyclerAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends Lambda implements Function0<h.v.a.e.e> {
        public final /* synthetic */ f5 this$0;

        public g(f5 f5Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.v.a.e.e invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.v.a.e.e invoke() {
        }
    }

    /* compiled from: SearchTabVideoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/LinearLayoutManager;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class h extends Lambda implements Function0<LinearLayoutManager> {
        public final /* synthetic */ f5 this$0;

        public h(f5 f5Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ LinearLayoutManager invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final LinearLayoutManager invoke() {
        }
    }

    /* compiled from: SearchTabVideoFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class i extends Lambda implements Function1<List<? extends String>, Unit> {
        public final /* synthetic */ f5 this$0;

        public i(f5 f5Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable List<String> list) {
        }
    }

    public static /* synthetic */ void A(f5 f5Var, boolean z) {
    }

    private static final void C(f5 f5Var) {
    }

    private static final void E(f5 f5Var) {
    }

    private final h.v.a.d getLoadMoreAction() {
    }

    public static final /* synthetic */ h.u.a.c.f0.u9.k0 i(f5 f5Var) {
    }

    public static final /* synthetic */ FragmentActivity j(f5 f5Var) {
    }

    public static final /* synthetic */ int k(f5 f5Var) {
    }

    public static final /* synthetic */ LinearLayoutManager l(f5 f5Var) {
    }

    public static final /* synthetic */ void m(f5 f5Var, int i2) {
    }

    private final h.u.a.c.f0.u9.k0 n() {
    }

    private final h.v.a.e.e q() {
    }

    private final LinearLayoutManager r() {
    }

    private final void s(boolean z) {
    }

    private static final void u(f5 f5Var, h.y.a.m.n nVar) {
    }

    private static final void v(f5 f5Var, boolean z) {
    }

    public static /* synthetic */ void x(f5 f5Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void y(f5 f5Var) {
    }

    public static /* synthetic */ void z(f5 f5Var) {
    }

    public final void B() {
    }

    public final void D() {
    }

    public final void F() {
    }

    public final void G(int i2) {
    }

    @Override // h.y.a.f.o.f, h.y.a.f.o.e, h.y.a.f.o.d
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.f.o.f, h.y.a.f.o.e, h.y.a.f.o.d
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.y.a.f.o.f
    public void g() {
    }

    @Override // h.y.a.f.o.e
    public int getContentView() {
    }

    @Override // h.y.a.f.o.f
    public void h() {
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

    @Override // h.x.g.j.c
    public void o() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // h.y.a.f.o.f, h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable VideoListUserFollowEvent videoListUserFollowEvent) {
    }

    public final boolean w() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable LoginEvent loginEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable VideoListLikeEvent videoListLikeEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable VideoListNewCommEvent videoListNewCommEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable VideoListItemPlayerRestoreEvent videoListItemPlayerRestoreEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshPayVideoStatusEvent refreshPayVideoStatusEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshSearchEvent refreshSearchEvent) {
    }
}
