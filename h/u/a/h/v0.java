package h.u.a.h;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.eventmodel.LoginEvent;
import com.showstartfans.activity.view.ShareView;
import com.taihebase.activity.base.BaseNewActivity;
import h.u.a.d.b1;
import h.u.a.w.z;
import h.y.a.f.m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareMouldDialog.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u001d\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\b\u0010 \u001a\u00020\u0013H\u0002J\b\u0010!\u001a\u00020\u0013H\u0016J\u0012\u0010\"\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010$H\u0007J\u0012\u0010\"\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010%H\u0007J\u0012\u0010\"\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010&H\u0007J\u000e\u0010'\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/showstartfans/activity/dialog/ShareMouldDialog;", "Lcom/taihebase/activity/base/BaseDialog;", "newBaseActivity", "Lcom/taihebase/activity/base/BaseNewActivity;", "(Lcom/taihebase/activity/base/BaseNewActivity;)V", "activityId", "", "command", "", "hasLinkItem", "", "layout_close", "Landroid/widget/FrameLayout;", "layout_mould", "Landroid/widget/LinearLayout;", "mouldAdapter", "Lcom/showstartfans/activity/adapter/MouldAdapter;", "onShareComplete", "Lkotlin/Function0;", "", "getOnShareComplete", "()Lkotlin/jvm/functions/Function0;", "setOnShareComplete", "(Lkotlin/jvm/functions/Function0;)V", "rv_list_mould", "Landroidx/recyclerview/widget/RecyclerView;", "targetId", "view_share", "Lcom/showstartfans/activity/view/ShareView;", "ShowLinkDialog", "addLinkItem", "dismiss", "getData", "onCreate", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/LoginEvent;", "Lcom/showstartfans/activity/model/ShareMouldSuccess;", "Lcom/showstartfans/activity/model/ShareSaveSuccess;", "setData", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class v0 extends h.y.a.f.e {
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private ShareView f24314d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private String f24315e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private FrameLayout f24316f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private RecyclerView f24317g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private b1 f24318h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f24319i;

    /* renamed from: j  reason: collision with root package name */
    private int f24320j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f24321k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private Function0<Unit> f24322l;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    private String f24323m;

    /* compiled from: ShareMouldDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ v0 this$0;

        public a(v0 v0Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: ShareMouldDialog.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/dialog/ShareMouldDialog$onCreate$1", "Lcom/showstartfans/activity/widget/ShareUtil$OnShareStatusListentr;", "onCancel", "", "onFail", "onSuccess", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements z.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v0 f24324a;

        public b(v0 v0Var) {
        }

        @Override // h.u.a.w.z.b
        public void onCancel() {
        }

        @Override // h.u.a.w.z.b
        public void onFail() {
        }

        @Override // h.u.a.w.z.b
        public void onSuccess() {
        }
    }

    /* compiled from: ShareMouldDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/NewShareBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<h.u.a.o.u, Unit> {
        public final /* synthetic */ v0 this$0;

        public c(v0 v0Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(h.u.a.o.u uVar) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable h.u.a.o.u uVar) {
        }
    }

    /* compiled from: ShareMouldDialog.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/dialog/ShareMouldDialog$onCreate$4", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter$OnItemClickListener;", "OnItemClick", "", h.a.a.a.a.i.g.C, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements m.b {
        public final /* synthetic */ v0 b;

        public d(v0 v0Var) {
        }

        @Override // h.y.a.f.m.b
        public void c(int i2) {
        }
    }

    public v0(@NotNull BaseNewActivity baseNewActivity) {
    }

    private final void n(String str) {
    }

    public static final /* synthetic */ int o(v0 v0Var) {
    }

    public static final /* synthetic */ void p(v0 v0Var) {
    }

    private final void q() {
    }

    private final void r() {
    }

    private static final void s(v0 v0Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void u(View view) {
    }

    public static /* synthetic */ void v(v0 v0Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void w(v0 v0Var, View view) {
    }

    private static final void x(v0 v0Var, View view) {
    }

    private static final void y(View view) {
    }

    public final void A(@Nullable Function0<Unit> function0) {
    }

    @Override // h.y.a.f.e
    public void a() {
    }

    @Override // h.y.a.f.e
    public void g() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable LoginEvent loginEvent) {
    }

    @Nullable
    public final Function0<Unit> t() {
    }

    public final void z(int i2) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable h.u.a.o.b0 b0Var) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable h.u.a.o.c0 c0Var) {
    }
}
