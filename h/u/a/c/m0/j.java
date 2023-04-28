package h.u.a.c.m0;

import android.view.View;
import com.showstartfans.activity.model.PaySupportBean;
import com.showstartfans.activity.model.TeamInfoMsgBean;
import com.showstartfans.activity.model.TeamShowActivityBean;
import com.showstartfans.activity.model.pay.TicketBean;
import h.u.a.w.c0.r2;
import h.u.a.w.c0.u2;
import h.u.a.w.d0.w2;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TeamShowFragment.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0014J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0014J\b\u0010\u001c\u001a\u00020\u0016H\u0014J\b\u0010\u001d\u001a\u00020\u0016H\u0014J$\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\u00132\u0006\u0010\"\u001a\u00020\u000fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/showstartfans/activity/activitys/team/TeamShowFragment;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "Lcom/showstartfans/activity/widget/popupwindow/ShareMenuListListener;", "()V", "bean", "Lcom/showstartfans/activity/model/pay/TicketBean;", "beanActivity", "Lcom/showstartfans/activity/model/TeamShowActivityBean;", "beanPay", "Lcom/showstartfans/activity/model/PaySupportBean;", "dialog", "Lcom/showstartfans/activity/widget/dialog/TeamUserInfoDialog;", "messageDialog", "Lcom/taihebase/activity/widget/dialog/MessageDialog;", "realName", "", "shareDialog", "Lcom/showstartfans/activity/widget/dialog/ShareDialog;", "shareTeamID", "", "teamMaxNum", "buyAble", "", "getContentView", "getTeamShowData", "id", "grayUi", "initData", "initListener", "initView", "onPupMenuViewClick", "view", "Landroid/view/View;", "content", h.a.a.a.a.i.g.C, "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class j extends h.y.a.f.o.e implements w2 {
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    public static final a f19559l = null;
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f19560d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private String f19561e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private TicketBean f19562f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private TeamShowActivityBean f19563g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private PaySupportBean f19564h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private r2 f19565i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private h.y.a.p.w.g f19566j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private u2 f19567k;

    /* compiled from: TeamShowFragment.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/showstartfans/activity/activitys/team/TeamShowFragment$Companion;", "", "()V", "newInstance", "Lcom/showstartfans/activity/activitys/team/TeamShowFragment;", "bean", "Lcom/showstartfans/activity/model/pay/TicketBean;", "payBean", "Lcom/showstartfans/activity/model/PaySupportBean;", "activityBean", "Lcom/showstartfans/activity/model/TeamShowActivityBean;", "real", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final j a(@NotNull TicketBean ticketBean, @NotNull PaySupportBean paySupportBean, @NotNull TeamShowActivityBean teamShowActivityBean, int i2) {
        }
    }

    /* compiled from: TeamShowFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ int $id;
        public final /* synthetic */ j this$0;

        public b(j jVar, int i2) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public static final /* synthetic */ void g(j jVar, int i2) {
    }

    private final void h() {
    }

    private final void i(int i2) {
    }

    private static final void j(j jVar, int i2, n nVar) {
    }

    private static final void k(j jVar, TeamInfoMsgBean teamInfoMsgBean, View view) {
    }

    private static final void l(j jVar, TeamInfoMsgBean teamInfoMsgBean, View view) {
    }

    private static final void m(j jVar, TeamInfoMsgBean teamInfoMsgBean, View view) {
    }

    private final void n() {
    }

    private static final void q(j jVar, View view) {
    }

    private static final void r(j jVar, View view) {
    }

    public static /* synthetic */ void s(j jVar, TeamInfoMsgBean teamInfoMsgBean, View view) {
    }

    public static /* synthetic */ void u(j jVar, int i2, n nVar) {
    }

    public static /* synthetic */ void v(j jVar, View view) {
    }

    public static /* synthetic */ void w(j jVar, TeamInfoMsgBean teamInfoMsgBean, View view) {
    }

    public static /* synthetic */ void x(j jVar, TeamInfoMsgBean teamInfoMsgBean, View view) {
    }

    public static /* synthetic */ void y(j jVar, View view) {
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

    @Override // h.u.a.w.d0.w2
    public void onPupMenuViewClick(@Nullable View view, @Nullable String str, int i2) {
    }
}
