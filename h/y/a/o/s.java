package h.y.a.o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.taihebase.activity.widget.Toolbar;
import com.tencent.android.tpush.common.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NewRootView.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u001e\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u001cJ;\u0010\u001f\u001a\u0004\u0018\u00010\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0!2\u0006\u0010\"\u001a\u00020\n2\u0016\u0010#\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050$\"\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010%J;\u0010\u001f\u001a\u0004\u0018\u00010\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0!2\u0006\u0010\"\u001a\u00020\u00052\u0016\u0010#\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050$\"\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010&J\b\u0010'\u001a\u0004\u0018\u00010\u0010J\u0006\u0010(\u001a\u00020\u0010J\b\u0010)\u001a\u0004\u0018\u00010\u0019J\u0006\u0010*\u001a\u00020\u001cJ\u0018\u0010+\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010,\u001a\u00020\u001c2\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u000e\u0010-\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u0010J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u0005H\u0002J\u0006\u00100\u001a\u00020\u001cJ\u0006\u00101\u001a\u00020\u001cJ\u0012\u00102\u001a\u00020\u001c2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J;\u00103\u001a\u00020\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0!2\u0006\u0010\"\u001a\u00020\n2\u0016\u0010#\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050$\"\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010%J;\u00103\u001a\u00020\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0!2\u0006\u0010\"\u001a\u00020\u00052\u0016\u0010#\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050$\"\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010&J\u0014\u00103\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u00103\u001a\u0004\u0018\u00010\n2\u0006\u00104\u001a\u00020\u0005H\u0002J\u000e\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u0005J\u000e\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\u0001J\u000e\u00109\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u0005J&\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0005J\u000e\u0010>\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u0001J\u0006\u0010?\u001a\u00020\u001cJ\u001c\u0010@\u001a\u00020\u001c2\b\u0010\u0004\u001a\u0004\u0018\u00010\n2\b\u0010A\u001a\u0004\u0018\u00010\nH\u0002R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/taihebase/activity/view/NewRootView;", "", "mctx", "Landroid/content/Context;", "showView", "", "isNeedToolbar", "", "(Landroid/content/Context;IZ)V", "view", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;Z)V", "rooContent", "showViewID", "(Landroid/content/Context;Landroid/view/View;ILandroid/view/View;Z)V", "content", "Landroid/view/ViewGroup;", "ctx", "errorview", "justyContent", "progressView", "rootView", "getShowView", "()Landroid/view/View;", "toolbar", "Lcom/taihebase/activity/widget/Toolbar;", "viewDisplay", "contentOffsetTop", "", "top", "dissShowProgressInside", "errorHappen", "listener", "Lkotlin/Function0;", TtmlNode.TAG_LAYOUT, "id", "", "(Lkotlin/jvm/functions/Function0;Landroid/view/View;[Ljava/lang/Integer;)Landroid/view/View;", "(Lkotlin/jvm/functions/Function0;I[Ljava/lang/Integer;)Landroid/view/View;", "getContentView", "getRootView", "getToolbar", "hideToolBar", "initView", "judgeToolBarOffset", "justyProgressAreaContentTo", "offsetContent", Constants.FLAG_TAG_OFFSET, "offsetContentToScreenTop", "reInitView", "removeView", "setContentView", "resoucreId", "setRootViewBg", "color", com.alipay.sdk.widget.j.f843d, "title", "setToolBarBg", "setToolbarPadding", TtmlNode.LEFT, TtmlNode.RIGHT, "bottom", "showProgressInside", "showToolBar", "viewAnimation", "dissMissView", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class s {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final View f26435a;
    @NotNull
    private ViewGroup b;
    @Nullable
    private ViewGroup c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private Toolbar f26436d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f26437e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private View f26438f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private View f26439g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private View f26440h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private Context f26441i;

    /* compiled from: NewRootView.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taihebase/activity/view/NewRootView$viewAnimation$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ s b;
        public final /* synthetic */ View c;

        public a(s sVar, View view) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
        }
    }

    public s(@NotNull Context context, @NotNull View view, int i2, @Nullable View view2, boolean z) {
    }

    private final View A(Function0<Unit> function0, int i2, Integer... numArr) {
    }

    private final View B(Function0<Unit> function0, View view, Integer... numArr) {
    }

    private static final void C(Function0 function0, View view) {
    }

    private static final void D(Function0 function0, View view) {
    }

    private final void K(View view, View view2) {
    }

    public static final /* synthetic */ View a(s sVar) {
    }

    public static final /* synthetic */ View b(s sVar) {
    }

    public static final /* synthetic */ void c(s sVar, View view) {
    }

    public static final /* synthetic */ void d(s sVar, View view) {
    }

    public static final /* synthetic */ void e(s sVar, View view) {
    }

    private final void o(int i2, boolean z) {
    }

    public static /* synthetic */ void q(s sVar, boolean z, int i2, Object obj) {
    }

    public static /* synthetic */ void s(Function0 function0, View view) {
    }

    public static /* synthetic */ void t(Function0 function0, View view) {
    }

    private final void u(int i2) {
    }

    private final void x(View view) {
    }

    private final View y(int i2) {
    }

    private final View z(View view) {
    }

    public final void E(int i2) {
    }

    public final void F(@NotNull Object obj) {
    }

    public final void G(int i2) {
    }

    public final void H(int i2, int i3, int i4, int i5) {
    }

    public final void I(@NotNull Object obj) {
    }

    public final void J() {
    }

    public final void f(int i2) {
    }

    public final void g() {
    }

    @Nullable
    public final View h(@NotNull Function0<Unit> function0, int i2, @NotNull Integer... numArr) {
    }

    @Nullable
    public final View i(@NotNull Function0<Unit> function0, @NotNull View view, @NotNull Integer... numArr) {
    }

    @Nullable
    public final ViewGroup j() {
    }

    @NotNull
    public final ViewGroup k() {
    }

    @Nullable
    public final View l() {
    }

    @Nullable
    public final Toolbar m() {
    }

    public final void n() {
    }

    public final void p(boolean z) {
    }

    public final void r(@NotNull ViewGroup viewGroup) {
    }

    public final void v() {
    }

    public final void w() {
    }

    public /* synthetic */ s(Context context, View view, int i2, View view2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public /* synthetic */ s(Context context, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public s(@NotNull Context context, int i2, boolean z) {
    }

    public /* synthetic */ s(Context context, View view, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public s(@NotNull Context context, @NotNull View view, boolean z) {
    }
}
