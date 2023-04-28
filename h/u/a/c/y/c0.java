package h.u.a.c.y;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.model.MapRecordData;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShowListAdapter.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\tH\u0016J.\u0010\"\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&J\u0010\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0004H\u0002J\u0016\u0010)\u001a\u00020\u00152\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/showstartfans/activity/activitys/community/ShowListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/showstartfans/activity/activitys/community/ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "list", "", "Lkotlin/Pair;", "", "", "getList", "()Ljava/util/List;", "pageNo", "progressDialog", "Lcom/taihebase/activity/widget/dialog/ProgressDialog;", "simpleDateFormat", "Ljava/text/SimpleDateFormat;", "simpleDateFormatY", "siteId", "animationStatus", "", "status", "Landroid/view/View;", "dismissProgress", "getItemCount", "getItemViewType", h.a.a.a.a.i.g.C, "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "requestShowList", com.alipay.sdk.widget.j.f851l, "Lcom/soli/pullupdownrefresh/PullRefreshLayout;", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "showProgress", "ctx", "updateActivityList", "data", "", "Lcom/showstartfans/activity/model/MapRecordData;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class c0 extends RecyclerView.Adapter<d0> {
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public static final a f20075h = null;

    /* renamed from: i  reason: collision with root package name */
    private static final int f20076i = 1;

    /* renamed from: j  reason: collision with root package name */
    private static final int f20077j = 2;

    /* renamed from: k  reason: collision with root package name */
    private static final int f20078k = 3;
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final Context f20079a;
    private int b;
    private int c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final List<Pair<Integer, Object>> f20080d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private h.y.a.p.w.i f20081e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final SimpleDateFormat f20082f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final SimpleDateFormat f20083g;

    /* compiled from: ShowListAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/showstartfans/activity/activitys/community/ShowListAdapter$Companion;", "", "()V", "TYPE_DATA", "", "TYPE_NO_DATA", "TYPE_TITLE", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: ShowListAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b extends Lambda implements Function1<Pair<? extends Integer, ? extends Object>, Boolean> {
        public static final b INSTANCE = null;

        @NotNull
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(@NotNull Pair<Integer, ? extends Object> pair) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Integer, ? extends Object> pair) {
        }
    }

    public c0(@NotNull Context context) {
    }

    private final void c(View view) {
    }

    private final void d() {
    }

    public static /* synthetic */ void e(PullRefreshLayout pullRefreshLayout, h.v.a.d dVar, c0 c0Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void f(c0 c0Var, View view) {
    }

    public static /* synthetic */ void g(c0 c0Var, MapRecordData mapRecordData, View view) {
    }

    private static final void i(c0 c0Var, View view) {
    }

    private static final void j(c0 c0Var, MapRecordData mapRecordData, View view) {
    }

    public static /* synthetic */ void m(c0 c0Var, int i2, int i3, PullRefreshLayout pullRefreshLayout, h.v.a.d dVar, int i4, Object obj) {
    }

    private static final void n(PullRefreshLayout pullRefreshLayout, h.v.a.d dVar, c0 c0Var, h.y.a.m.n nVar) {
    }

    private final void o(Context context) {
    }

    private final void p(List<MapRecordData> list) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
    }

    @NotNull
    public final List<Pair<Integer, Object>> getList() {
    }

    public void h(@NotNull d0 d0Var, int i2) {
    }

    @NotNull
    public d0 k(@NotNull ViewGroup viewGroup, int i2) {
    }

    public final void l(int i2, int i3, @Nullable PullRefreshLayout pullRefreshLayout, @Nullable h.v.a.d dVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(d0 d0Var, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ d0 onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }
}
