package h.u.a.c.f0.v9;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.showstartfans.activity.model.InteractionMsgBean;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabMessageTabCommFragment.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\b\u0010\u0012\u001a\u00020\rH\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0014J\u0006\u0010\n\u001a\u00020\u0010J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\u0006\u0010\u0017\u001a\u00020\u0010R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabMessageTabCommFragment;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "Lcom/showstartfans/activity/listener/OnDoubleClickListener;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/message/AdapterCommMessageNew;", "getAdapter", "()Lcom/showstartfans/activity/activitys/message/AdapterCommMessageNew;", "adapter$delegate", "Lkotlin/Lazy;", "loadFirst", "", "pageNo", "", "type", "getCommDate", "", "show", "getContentView", "initData", "initListener", "initView", "onDoubleClickHappen", "smoothScroollTop", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class i4 extends h.y.a.f.o.e implements h.u.a.l.b {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public static final a f18707g = null;

    /* renamed from: h  reason: collision with root package name */
    public static final int f18708h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final int f18709i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f18710j = 2;
    @NotNull
    public Map<Integer, View> b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private int f18711d;

    /* renamed from: e  reason: collision with root package name */
    private int f18712e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f18713f;

    /* compiled from: TabMessageTabCommFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabMessageTabCommFragment$Companion;", "", "()V", "TYPE_COMMENT", "", "TYPE_LIKE", "TYPE_STATEMENT", "getInstance", "Lcom/showstartfans/activity/activitys/maintab/newmain/TabMessageTabCommFragment;", "type", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final i4 a(int i2) {
        }
    }

    /* compiled from: TabMessageTabCommFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/message/AdapterCommMessageNew;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<h.u.a.c.g0.j1> {
        public final /* synthetic */ i4 this$0;

        public b(i4 i4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.u.a.c.g0.j1 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.u.a.c.g0.j1 invoke() {
        }
    }

    /* compiled from: TabMessageTabCommFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/showstartfans/activity/model/InteractionMsgBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<List<? extends InteractionMsgBean>, Unit> {
        public final /* synthetic */ i4 this$0;

        public c(i4 i4Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends InteractionMsgBean> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable List<? extends InteractionMsgBean> list) {
        }
    }

    /* compiled from: TabMessageTabCommFragment.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabMessageTabCommFragment$initListener$1", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i4 f18714a;

        public d(i4 i4Var) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    public static final /* synthetic */ h.u.a.c.g0.j1 g(i4 i4Var) {
    }

    public static final /* synthetic */ void h(i4 i4Var, boolean z) {
    }

    public static final /* synthetic */ FragmentActivity i(i4 i4Var) {
    }

    public static final /* synthetic */ int j(i4 i4Var) {
    }

    public static final /* synthetic */ int k(i4 i4Var) {
    }

    public static final /* synthetic */ void l(i4 i4Var, int i2) {
    }

    private final h.u.a.c.g0.j1 m() {
    }

    private final void n(boolean z) {
    }

    public static /* synthetic */ void q(i4 i4Var) {
    }

    public static /* synthetic */ void r(i4 i4Var) {
    }

    private static final void u(i4 i4Var) {
    }

    private static final void w(i4 i4Var) {
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

    @Override // h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // h.u.a.l.b
    public void p() {
    }

    public final void s() {
    }

    public final void v() {
    }
}
