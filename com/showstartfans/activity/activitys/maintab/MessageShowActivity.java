package com.showstartfans.activity.activitys.maintab;

import android.content.Context;
import android.view.View;
import com.alipay.sdk.util.l;
import com.alipay.sdk.widget.j;
import com.showstartfans.activity.eventmodel.MessageTabOfficialEvent;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.u.a.c.g0.n1;
import h.u.a.g.j2;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MessageShowActivity.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0014J\b\u0010\u0019\u001a\u00020\u0010H\u0014J\b\u0010\u001a\u001a\u00020\u0010H\u0014J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\u0012\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\b\u0010\u001f\u001a\u00020\u0010H\u0002J\b\u0010 \u001a\u00020!H\u0014J\u0006\u0010\"\u001a\u00020\u0010R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/MessageShowActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "Lcom/showstartfans/activity/listener/OnDoubleClickListener;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/message/AdapterSystemMessageNew;", "getAdapter", "()Lcom/showstartfans/activity/activitys/message/AdapterSystemMessageNew;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/showstartfans/activity/databinding/ActivityMainListviewMessageBinding;", "pageNo", "", "type", "dataInit", "", l.c, "Lcom/taihebase/activity/network/Result;", "getOfficialMessage", "show", "", "getTypeString", "", "initData", "initListener", "initView", "onDoubleClickHappen", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/MessageTabOfficialEvent;", j.f851l, "setContentViewResByViewBind", "Landroid/view/View;", "smoothScroollTop", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class MessageShowActivity extends BaseNewActivity implements h.u.a.l.b {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public static final a f5825g = null;

    /* renamed from: h  reason: collision with root package name */
    public static final int f5826h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final int f5827i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f5828j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f5829k = 3;

    /* renamed from: l  reason: collision with root package name */
    public static final int f5830l = 4;
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f5831d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f5832e;

    /* renamed from: f  reason: collision with root package name */
    private j2 f5833f;

    /* compiled from: MessageShowActivity.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/MessageShowActivity$Companion;", "", "()V", "TYPE_ACTIVITY", "", "TYPE_GOOD", "TYPE_OFFICIAL", "TYPE_ORDER", "TYPE_RAISE", "start", "", "context", "Landroid/content/Context;", "type", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@NotNull Context context, int i2) {
        }
    }

    /* compiled from: MessageShowActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/message/AdapterSystemMessageNew;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<n1> {
        public final /* synthetic */ MessageShowActivity this$0;

        public b(MessageShowActivity messageShowActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ n1 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final n1 invoke() {
        }
    }

    /* compiled from: MessageShowActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MessageShowActivity this$0;

        public c(MessageShowActivity messageShowActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: MessageShowActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/MessageShowActivity$initListener$1", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MessageShowActivity f5834a;

        public d(MessageShowActivity messageShowActivity) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    public static final /* synthetic */ void A(MessageShowActivity messageShowActivity, int i2) {
    }

    private final void B(n nVar) {
    }

    private final n1 C() {
    }

    private final void D(boolean z) {
    }

    private static final void E(MessageShowActivity messageShowActivity, n nVar) {
    }

    private static final void F(MessageShowActivity messageShowActivity, View view) {
    }

    private final String G() {
    }

    private static final void H(MessageShowActivity messageShowActivity) {
    }

    public static /* synthetic */ void I(MessageShowActivity messageShowActivity) {
    }

    public static /* synthetic */ void J(MessageShowActivity messageShowActivity, View view) {
    }

    public static /* synthetic */ void K(MessageShowActivity messageShowActivity) {
    }

    public static /* synthetic */ void L(MessageShowActivity messageShowActivity, n nVar) {
    }

    private final void M() {
    }

    private static final void O(MessageShowActivity messageShowActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity w(MessageShowActivity messageShowActivity) {
    }

    public static final /* synthetic */ void x(MessageShowActivity messageShowActivity, boolean z) {
    }

    public static final /* synthetic */ int y(MessageShowActivity messageShowActivity) {
    }

    public static final /* synthetic */ void z(MessageShowActivity messageShowActivity) {
    }

    public final void N() {
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

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable MessageTabOfficialEvent messageTabOfficialEvent) {
    }

    @Override // h.u.a.l.b
    public void p() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
