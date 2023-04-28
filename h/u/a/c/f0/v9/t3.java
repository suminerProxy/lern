package h.u.a.c.f0.v9;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.model.PostArticleData;
import com.taihebase.activity.view.LoadMoreRecyclerView;
import h.u.a.c.f0.p8;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArticleGridFragment.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 62\u00020\u0001:\u00016B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010+\u001a\u00020\u001dJ\b\u0010,\u001a\u00020\fH\u0014J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\fH\u0002J\b\u0010/\u001a\u00020\fH\u0002J\b\u00100\u001a\u00020\u001dH\u0014J\b\u00101\u001a\u00020\u001dH\u0014J\b\u00102\u001a\u00020\u001dH\u0014J\b\u00103\u001a\u00020\u001dH\u0016J\u0010\u00104\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\fH\u0002J\u0006\u00105\u001a\u00020\u001dR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000Ri\u0010\u0016\u001aQ\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0017j\u0004\u0018\u0001`\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"Rg\u0010#\u001aO\u0012\u0013\u0012\u00110$¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0017j\u0004\u0018\u0001`(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"¨\u00067"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/ArticleGridFragment;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/maintab/ArticleGridAdapter;", "canSendPost", "", "getCanSendPost", "()Z", "setCanSendPost", "(Z)V", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "list", "Lcom/taihebase/activity/view/LoadMoreRecyclerView;", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "getLoadMoreAction", "()Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "loadMoreAction$delegate", "Lkotlin/Lazy;", "mPage", "onGetFirstData", "Lkotlin/Function3;", "Lcom/showstartfans/activity/model/PostArticleData;", "Lkotlin/ParameterName;", "name", "data", "pageIndex", "", "Lcom/showstartfans/activity/activitys/maintab/newmain/OnGetFirstData;", "getOnGetFirstData", "()Lkotlin/jvm/functions/Function3;", "setOnGetFirstData", "(Lkotlin/jvm/functions/Function3;)V", "onScrolledCallBack", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "dx", "dy", "Lcom/showstartfans/activity/activitys/maintab/newmain/OnScrolledCallBack;", "getOnScrolledCallBack", "setOnScrolledCallBack", "OnRefresh", "getContentView", "getData", "page", "getHotLastPageNo", "initData", "initListener", "initView", "onDestroy", "saveLastPageNo", "scrollTop", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class t3 extends h.y.a.f.o.e {
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public static final a f18782k = null;
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private Function3<? super RecyclerView, ? super Integer, ? super Integer, Unit> c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private Function3<? super PostArticleData, ? super Integer, ? super Boolean, Unit> f18783d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f18784e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private p8 f18785f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private LoadMoreRecyclerView f18786g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final Lazy f18787h;

    /* renamed from: i  reason: collision with root package name */
    private int f18788i;

    /* renamed from: j  reason: collision with root package name */
    private int f18789j;

    /* compiled from: ArticleGridFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/ArticleGridFragment$Companion;", "", "()V", "getInstance", "Lcom/showstartfans/activity/activitys/maintab/newmain/ArticleGridFragment;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final t3 a(int i2) {
        }
    }

    /* compiled from: ArticleGridFragment.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/ArticleGridFragment$initListener$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t3 f18790a;

        public b(t3 t3Var) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* compiled from: ArticleGridFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<h.v.a.d> {
        public static final c INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.v.a.d invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.v.a.d invoke() {
        }
    }

    private final void getData(int i2) {
    }

    private final h.v.a.d getLoadMoreAction() {
    }

    private static final void i(t3 t3Var, int i2, int i3, h.y.a.m.n nVar) {
    }

    private final int j() {
    }

    private static final void m(t3 t3Var, boolean z) {
    }

    public static /* synthetic */ void n(t3 t3Var, int i2, int i3, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void q(t3 t3Var, boolean z) {
    }

    private final void r(int i2) {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    public final void g() {
    }

    @Override // h.y.a.f.o.e
    public int getContentView() {
    }

    public final boolean h() {
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

    @Nullable
    public final Function3<PostArticleData, Integer, Boolean, Unit> k() {
    }

    @Nullable
    public final Function3<RecyclerView, Integer, Integer, Unit> l() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    public final void s() {
    }

    public final void u(boolean z) {
    }

    public final void v(@Nullable Function3<? super PostArticleData, ? super Integer, ? super Boolean, Unit> function3) {
    }

    public final void w(@Nullable Function3<? super RecyclerView, ? super Integer, ? super Integer, Unit> function3) {
    }
}
