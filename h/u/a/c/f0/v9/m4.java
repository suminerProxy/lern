package h.u.a.c.f0.v9;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.eventmodel.BackVideoPlayFullScreenEvent;
import com.showstartfans.activity.eventmodel.LoginEvent;
import com.showstartfans.activity.eventmodel.RefreshPayVideoStatusEvent;
import com.showstartfans.activity.eventmodel.TabVideoFindPLayChangeEvent;
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

/* compiled from: TabVideoPointFragment.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 =2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001=B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001cJ\b\u0010!\u001a\u00020\u000eH\u0014J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\u001fH\u0014J\b\u0010%\u001a\u00020\u001fH\u0014J\b\u0010&\u001a\u00020\u001fH\u0014J\u000e\u0010'\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001cJ\b\u0010(\u001a\u00020\u001fH\u0016J\b\u0010)\u001a\u00020\u001fH\u0016J\u0012\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010,H\u0007J\u0012\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010-H\u0007J\u0012\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010.H\u0007J\u0012\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010/H\u0007J\u0012\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u000100H\u0007J\u0012\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u000101H\u0007J\u0012\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u000102H\u0007J\u0012\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u000103H\u0007J\b\u00104\u001a\u00020\u001fH\u0016J\b\u00105\u001a\u00020\u001fH\u0016J\b\u00106\u001a\u00020\u001fH\u0016J\b\u00107\u001a\u00020\u001fH\u0016J\u000e\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020\u000eJ\b\u0010:\u001a\u00020\u001fH\u0002J\u0010\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u000eH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabVideoPointFragment;", "Lcom/taihebase/activity/base/fragment/BaseVisibleFragment;", "Lcom/showstartfans/activity/listener/OnDoubleClickListener;", "Lcom/taihe/videoplayer/callback/OnVideoPlayCompleteCall;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/maintab/findview/FindVideoMainAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/maintab/findview/FindVideoMainAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "channelId", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "getLoadMoreAction", "()Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "loadMoreAction$delegate", "looperFlag", "manager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "manager$delegate", "pageNo", "postData", "", "postView", "changePlayStatus", "", "play", "getContentView", "getVideoList", "showPro", "initData", "initListener", "initView", "loadFirst", "onDestroy", "onDoubleClickHappen", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/BackVideoPlayFullScreenEvent;", "Lcom/showstartfans/activity/eventmodel/LoginEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshPayVideoStatusEvent;", "Lcom/showstartfans/activity/eventmodel/TabVideoFindPLayChangeEvent;", "Lcom/showstartfans/activity/eventmodel/VideoListItemPlayerRestoreEvent;", "Lcom/showstartfans/activity/eventmodel/VideoListLikeEvent;", "Lcom/showstartfans/activity/eventmodel/VideoListNewCommEvent;", "Lcom/showstartfans/activity/eventmodel/VideoListUserFollowEvent;", "onInvisible", "onPause", "onVideoPlayCompleteCall", "onVisible", "pushSelectIndex", "poi", "resetPointFragment", "updateVideoPayInfoById", "videoId", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class m4 extends h.y.a.f.o.f implements h.u.a.l.b, h.x.g.j.c {
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public static final a f18759m = null;
    @NotNull
    public Map<Integer, View> c;

    /* renamed from: d  reason: collision with root package name */
    private int f18760d;

    /* renamed from: e  reason: collision with root package name */
    private int f18761e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private String f18762f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f18763g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f18764h;

    /* renamed from: i  reason: collision with root package name */
    private int f18765i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private final Lazy f18766j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private final Lazy f18767k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private final Lazy f18768l;

    /* compiled from: TabVideoPointFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabVideoPointFragment$Companion;", "", "()V", "getInstance", "Lcom/showstartfans/activity/activitys/maintab/newmain/TabVideoPointFragment;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "channelId", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ m4 b(a aVar, int i2, String str, int i3, Object obj) {
        }

        @NotNull
        public final m4 a(int i2, @NotNull String str) {
        }
    }

    /* compiled from: TabVideoPointFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/findview/FindVideoMainAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<h.u.a.c.f0.u9.k0> {
        public final /* synthetic */ m4 this$0;

        public b(m4 m4Var) {
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

    /* compiled from: TabVideoPointFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ m4 this$0;

        public c(m4 m4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: TabVideoPointFragment.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabVideoPointFragment$initListener$2", "Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;", "onChildViewAttachedToWindow", "", "view", "Landroid/view/View;", "onChildViewDetachedFromWindow", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements RecyclerView.OnChildAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m4 f18769a;

        public d(m4 m4Var) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(@NotNull View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(@NotNull View view) {
        }
    }

    /* compiled from: TabVideoPointFragment.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabVideoPointFragment$initListener$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m4 f18770a;

        public e(m4 m4Var) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* compiled from: TabVideoPointFragment.kt */
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

    /* compiled from: TabVideoPointFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/LinearLayoutManager;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends Lambda implements Function0<LinearLayoutManager> {
        public final /* synthetic */ m4 this$0;

        public g(m4 m4Var) {
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

    /* compiled from: TabVideoPointFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class h extends Lambda implements Function1<List<? extends String>, Unit> {
        public final /* synthetic */ m4 this$0;

        public h(m4 m4Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable List<String> list) {
        }
    }

    private static final void C(m4 m4Var) {
    }

    private final void D() {
    }

    private final void E(int i2) {
    }

    private final h.v.a.d getLoadMoreAction() {
    }

    public static final /* synthetic */ h.u.a.c.f0.u9.k0 i(m4 m4Var) {
    }

    public static final /* synthetic */ FragmentActivity j(m4 m4Var) {
    }

    public static final /* synthetic */ int k(m4 m4Var) {
    }

    public static final /* synthetic */ LinearLayoutManager l(m4 m4Var) {
    }

    public static final /* synthetic */ void m(m4 m4Var, boolean z) {
    }

    public static final /* synthetic */ void n(m4 m4Var, int i2) {
    }

    private final h.u.a.c.f0.u9.k0 r() {
    }

    private final LinearLayoutManager s() {
    }

    private final void u(boolean z) {
    }

    private static final void v(m4 m4Var, h.y.a.m.n nVar) {
    }

    private static final void w(m4 m4Var, boolean z) {
    }

    public static /* synthetic */ void x(m4 m4Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void y(m4 m4Var, boolean z) {
    }

    public static /* synthetic */ void z(m4 m4Var) {
    }

    public final void A(boolean z) {
    }

    public final void B(int i2) {
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
    public final void onEvent(@Nullable TabVideoFindPLayChangeEvent tabVideoFindPLayChangeEvent) {
    }

    @Override // h.y.a.f.o.f, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public void onPause() {
    }

    @Override // h.u.a.l.b
    public void p() {
    }

    public final void q(boolean z) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable BackVideoPlayFullScreenEvent backVideoPlayFullScreenEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable VideoListUserFollowEvent videoListUserFollowEvent) {
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
    public final void onEvent(@Nullable LoginEvent loginEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshPayVideoStatusEvent refreshPayVideoStatusEvent) {
    }
}
