package h.u.a.c.f0.v9;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.showstartfans.activity.eventmodel.ClearUserMsgEvent;
import com.showstartfans.activity.eventmodel.LoginEvent;
import com.showstartfans.activity.eventmodel.RefreshRealNameMsgEvent;
import com.showstartfans.activity.eventmodel.RefreshTicketListEvent;
import com.showstartfans.activity.eventmodel.TicketSuccessEvent;
import h.u.a.c.f0.f9;
import h.u.a.c.f0.g9;
import h.u.a.c.f0.i9;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabTicketHolderFragment.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020-H\u0016J\b\u0010/\u001a\u00020\u0014H\u0014J \u00100\u001a\u00020-2\u0006\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u001cH\u0002J\b\u00104\u001a\u00020-H\u0002J\b\u00105\u001a\u00020-H\u0014J\b\u00106\u001a\u00020-H\u0014J\b\u00107\u001a\u00020-H\u0002J\b\u00108\u001a\u00020-H\u0014J\b\u00109\u001a\u00020-H\u0016J\b\u0010:\u001a\u00020-H\u0016J\u0012\u0010;\u001a\u00020-2\b\u0010<\u001a\u0004\u0018\u00010=H\u0007J\u0012\u0010;\u001a\u00020-2\b\u0010<\u001a\u0004\u0018\u00010>H\u0007J\u0012\u0010;\u001a\u00020-2\b\u0010<\u001a\u0004\u0018\u00010?H\u0007J\u0012\u0010;\u001a\u00020-2\b\u0010<\u001a\u0004\u0018\u00010@H\u0007J\u0012\u0010;\u001a\u00020-2\b\u0010<\u001a\u0004\u0018\u00010AH\u0007J\b\u0010B\u001a\u00020-H\u0016J\b\u0010C\u001a\u00020-H\u0002J\u0010\u0010D\u001a\u00020-2\u0006\u0010E\u001a\u00020\u001cH\u0016J\b\u0010F\u001a\u00020-H\u0016J\b\u0010G\u001a\u00020-H\u0002J\b\u0010H\u001a\u00020-H\u0002J\b\u0010I\u001a\u00020-H\u0002J\b\u0010J\u001a\u00020-H\u0002J\b\u0010K\u001a\u00020-H\u0002J\b\u0010L\u001a\u00020-H\u0002J\b\u0010M\u001a\u00020-H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0019\u0010\u0016R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\u001f\u0010 R\u000e\u0010\"\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b'\u0010(R\u000e\u0010*\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabTicketHolderFragment;", "Lcom/taihebase/activity/base/fragment/BaseVisibleFragment;", "Lcom/showstartfans/activity/listener/OnDoubleClickListener;", "Lcom/showstartfans/activity/utils/OnTicketSlideOpenCall;", "()V", "adapterSlide", "Lcom/showstartfans/activity/activitys/maintab/TabTicketHSlideAdapter;", "getAdapterSlide", "()Lcom/showstartfans/activity/activitys/maintab/TabTicketHSlideAdapter;", "adapterSlide$delegate", "Lkotlin/Lazy;", "adapterT", "Lcom/showstartfans/activity/activitys/maintab/TabTicketHMainAdapter;", "getAdapterT", "()Lcom/showstartfans/activity/activitys/maintab/TabTicketHMainAdapter;", "adapterT$delegate", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/RelativeLayout;", "bottomHeight", "", "getBottomHeight", "()I", "bottomHeight$delegate", "dp15", "getDp15", "dp15$delegate", "fragmentVisible", "", "historyAdapter", "Lcom/showstartfans/activity/activitys/maintab/TicketHistoryAdapter;", "getHistoryAdapter", "()Lcom/showstartfans/activity/activitys/maintab/TicketHistoryAdapter;", "historyAdapter$delegate", "historyPageNo", "initDisplayPosition", "isLoad", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "getLoadMoreAction", "()Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "loadMoreAction$delegate", "requestData", "ticketPageNo", "Pause", "", "Resume", "getContentView", "getData", "page", "type", "showPro", "getInvitationData", "initData", "initListener", "initScreenShortPM", "initView", "onDestroy", "onDoubleClickHappen", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/ClearUserMsgEvent;", "Lcom/showstartfans/activity/eventmodel/LoginEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshRealNameMsgEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshTicketListEvent;", "Lcom/showstartfans/activity/eventmodel/TicketSuccessEvent;", "onInvisible", com.alipay.sdk.widget.j.f844e, "onTicketSlideOpenCall", "isOpen", "onVisible", "resetEmpView", "setRealNameTypeView", "setRefuse", "setTicketSlideStyle", "setTicketStyle", "setTicketStyleUI", "ticketEmpView", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class l4 extends h.y.a.f.o.f implements h.u.a.l.b, h.u.a.t.t2 {
    @NotNull
    public Map<Integer, View> c;

    /* renamed from: d  reason: collision with root package name */
    private int f18741d;

    /* renamed from: e  reason: collision with root package name */
    private int f18742e;

    /* renamed from: f  reason: collision with root package name */
    private int f18743f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f18744g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f18745h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f18746i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private BottomSheetBehavior<RelativeLayout> f18747j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private final Lazy f18748k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private final Lazy f18749l;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    private final Lazy f18750m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private final Lazy f18751n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    private final Lazy f18752o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    private final Lazy f18753p;

    /* compiled from: TabTicketHolderFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/TabTicketHSlideAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<g9> {
        public final /* synthetic */ l4 this$0;

        public a(l4 l4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ g9 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final g9 invoke() {
        }
    }

    /* compiled from: TabTicketHolderFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/TabTicketHMainAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<f9> {
        public final /* synthetic */ l4 this$0;

        public b(l4 l4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ f9 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final f9 invoke() {
        }
    }

    /* compiled from: TabTicketHolderFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Integer> {
        public final /* synthetic */ l4 this$0;

        public c(l4 l4Var) {
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

    /* compiled from: TabTicketHolderFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<Integer> {
        public final /* synthetic */ l4 this$0;

        public d(l4 l4Var) {
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

    /* compiled from: TabTicketHolderFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function0<Unit> {
        public final /* synthetic */ int $page;
        public final /* synthetic */ boolean $showPro;
        public final /* synthetic */ int $type;
        public final /* synthetic */ l4 this$0;

        public e(l4 l4Var, int i2, int i3, boolean z) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: TabTicketHolderFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/TicketHistoryAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function0<i9> {
        public final /* synthetic */ l4 this$0;

        public f(l4 l4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ i9 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final i9 invoke() {
        }
    }

    /* compiled from: TabTicketHolderFragment.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabTicketHolderFragment$initListener$2$1", "Lcom/showstartfans/activity/widget/dialog/OnRealNameTwoPointCall;", "onRealNameTwoPoint", "", "onRealNameTwoPointFail", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g implements h.u.a.w.c0.m2 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l4 f18754a;

        public g(l4 l4Var) {
        }

        @Override // h.u.a.w.c0.m2
        public void a() {
        }

        @Override // h.u.a.w.c0.m2
        public void b() {
        }
    }

    /* compiled from: TabTicketHolderFragment.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabTicketHolderFragment$initListener$4", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageScrollStateChanged", "", "state", "", "onPageSelected", h.a.a.a.a.i.g.C, "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class h extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l4 f18755a;

        public h(l4 l4Var) {
        }

        public static /* synthetic */ void a(l4 l4Var, int i2) {
        }

        private static final void b(l4 l4Var, int i2) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i2) {
        }
    }

    /* compiled from: TabTicketHolderFragment.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabTicketHolderFragment$initListener$6", "Lcom/showstartfans/activity/activitys/maintab/TabTicketHMainAdapter$OnTicketGuideDialogStatus;", "OnDismiss", "", "OnShow", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class i implements f9.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l4 f18756a;

        public i(l4 l4Var) {
        }

        @Override // h.u.a.c.f0.f9.b
        public void a() {
        }

        @Override // h.u.a.c.f0.f9.b
        public void b() {
        }
    }

    /* compiled from: TabTicketHolderFragment.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabTicketHolderFragment$initView$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class j extends BottomSheetBehavior.BottomSheetCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l4 f18757a;

        public j(l4 l4Var) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NotNull View view, float f2) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NotNull View view, int i2) {
        }
    }

    /* compiled from: TabTicketHolderFragment.kt */
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

    /* compiled from: TabTicketHolderFragment.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabTicketHolderFragment$setTicketStyle$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class l implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ l4 b;

        public l(l4 l4Var) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    private static final void A(l4 l4Var, int i2, int i3, boolean z, h.y.a.m.n nVar) {
    }

    private static final void B(l4 l4Var, Object obj) {
    }

    private final int C() {
    }

    private final i9 D() {
    }

    private final void E() {
    }

    private static final void F(l4 l4Var, h.y.a.m.n nVar) {
    }

    private static final void G(l4 l4Var, boolean z) {
    }

    private static final void H(l4 l4Var, View view) {
    }

    private static final void I(l4 l4Var, View view) {
    }

    private static final void J(l4 l4Var, View view) {
    }

    private final void K() {
    }

    public static /* synthetic */ void L(Ref.BooleanRef booleanRef, ImageView imageView, View view) {
    }

    public static /* synthetic */ void M(l4 l4Var, View view) {
    }

    public static /* synthetic */ void N(l4 l4Var, boolean z) {
    }

    public static /* synthetic */ void O(l4 l4Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void P(Ref.BooleanRef booleanRef, ImageView imageView, View view) {
    }

    public static /* synthetic */ void Q(l4 l4Var, View view) {
    }

    public static /* synthetic */ void R(l4 l4Var, Object obj) {
    }

    public static /* synthetic */ void S(Ref.BooleanRef booleanRef, l4 l4Var, View view) {
    }

    public static /* synthetic */ void T(l4 l4Var, View view) {
    }

    public static /* synthetic */ void U(l4 l4Var, View view) {
    }

    public static /* synthetic */ void V(l4 l4Var, int i2, int i3, boolean z, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void W(l4 l4Var) {
    }

    private static final void X(l4 l4Var) {
    }

    private final void Y() {
    }

    private final void Z() {
    }

    private final void a0() {
    }

    private static final void b0(Ref.BooleanRef booleanRef, ImageView imageView, View view) {
    }

    private static final void c0(l4 l4Var, View view) {
    }

    private static final void d0(Ref.BooleanRef booleanRef, l4 l4Var, View view) {
    }

    private static final void e0(Ref.BooleanRef booleanRef, ImageView imageView, View view) {
    }

    private final void f0() {
    }

    private final void g0() {
    }

    private final h.v.a.d getLoadMoreAction() {
    }

    private final void h0() {
    }

    public static final /* synthetic */ f9 i(l4 l4Var) {
    }

    private final void i0() {
    }

    public static final /* synthetic */ int j(l4 l4Var) {
    }

    public static final /* synthetic */ FragmentActivity k(l4 l4Var) {
    }

    public static final /* synthetic */ void l(l4 l4Var, int i2, int i3, boolean z) {
    }

    public static final /* synthetic */ void m(l4 l4Var) {
    }

    public static final /* synthetic */ int n(l4 l4Var) {
    }

    private final void onRefresh() {
    }

    public static final /* synthetic */ boolean q(l4 l4Var) {
    }

    public static final /* synthetic */ void r(l4 l4Var, int i2) {
    }

    public static final /* synthetic */ void s(l4 l4Var, int i2) {
    }

    public static final /* synthetic */ void u(l4 l4Var, boolean z) {
    }

    public static final /* synthetic */ void v(l4 l4Var, int i2) {
    }

    private final g9 w() {
    }

    private final f9 x() {
    }

    private final int y() {
    }

    private final void z(int i2, int i3, boolean z) {
    }

    @Override // h.y.a.f.o.e
    public void Pause() {
    }

    @Override // h.y.a.f.o.e
    public void Resume() {
    }

    @Override // h.y.a.f.o.f, h.y.a.f.o.e, h.y.a.f.o.d
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.f.o.f, h.y.a.f.o.e, h.y.a.f.o.d
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.u.a.t.t2
    public void d(boolean z) {
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

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // h.y.a.f.o.f, h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshTicketListEvent refreshTicketListEvent) {
    }

    @Override // h.u.a.l.b
    public void p() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable LoginEvent loginEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshRealNameMsgEvent refreshRealNameMsgEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable ClearUserMsgEvent clearUserMsgEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable TicketSuccessEvent ticketSuccessEvent) {
    }
}
