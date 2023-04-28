package h.y.a.o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.tencent.android.tpush.common.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NewFragmentRootView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u0006\u0010\u0014\u001a\u00020\u0015J;\u0010\u0016\u001a\u0004\u0018\u00010\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010\u0019\u001a\u00020\b2\u0016\u0010\u001a\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u001b\"\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001cJ;\u0010\u0016\u001a\u0004\u0018\u00010\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010\u0019\u001a\u00020\u00052\u0016\u0010\u001a\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u001b\"\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\u001f\u001a\u00020\u000bJ\u0010\u0010 \u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u000e\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u000bJ\u0010\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0005H\u0002J\u0006\u0010%\u001a\u00020\u0015J\u0006\u0010&\u001a\u00020\u0015J\u0012\u0010'\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\bH\u0002J;\u0010(\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010\u0019\u001a\u00020\b2\u0016\u0010\u001a\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u001b\"\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010\u001cJ;\u0010(\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010\u0019\u001a\u00020\u00052\u0016\u0010\u001a\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u001b\"\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010\u001dJ\u0014\u0010(\u001a\u0004\u0018\u00010\b2\b\u0010\"\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010(\u001a\u0004\u0018\u00010\b2\u0006\u0010)\u001a\u00020\u0005H\u0002J\u000e\u0010*\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0001J\u001c\u0010+\u001a\u00020\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\b2\b\u0010,\u001a\u0004\u0018\u00010\bH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/taihebase/activity/view/NewFragmentRootView;", "", "mctx", "Landroid/content/Context;", "showView", "", "(Landroid/content/Context;I)V", "rooContent", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;I)V", "content", "Landroid/view/ViewGroup;", "ctx", "errorview", "justyContent", "mInflater", "Landroid/view/LayoutInflater;", "progressView", "rootView", "viewDisplay", "dissShowProgressInside", "", "errorHappen", "listener", "Lkotlin/Function0;", TtmlNode.TAG_LAYOUT, "id", "", "(Lkotlin/jvm/functions/Function0;Landroid/view/View;[Ljava/lang/Integer;)Landroid/view/View;", "(Lkotlin/jvm/functions/Function0;I[Ljava/lang/Integer;)Landroid/view/View;", "getContentView", "getRootView", "initView", "justyProgressAreaContentTo", "view", "offsetContent", Constants.FLAG_TAG_OFFSET, "offsetContentToScreenTop", "reInitView", "removeView", "setContentView", "resoucreId", "showProgressInside", "viewAnimation", "dissMissView", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class r {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f26429a;
    @Nullable
    private ViewGroup b;
    @Nullable
    private ViewGroup c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private View f26430d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private View f26431e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private View f26432f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private LayoutInflater f26433g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private Context f26434h;

    /* compiled from: NewFragmentRootView.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taihebase/activity/view/NewFragmentRootView$viewAnimation$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ r b;
        public final /* synthetic */ View c;

        public a(r rVar, View view) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
        }
    }

    public r(@NotNull Context context, @NotNull View view, int i2) {
    }

    public static final /* synthetic */ View a(r rVar) {
    }

    public static final /* synthetic */ View b(r rVar) {
    }

    public static final /* synthetic */ void c(r rVar, View view) {
    }

    public static final /* synthetic */ void d(r rVar, View view) {
    }

    public static final /* synthetic */ void e(r rVar, View view) {
    }

    private final void k(int i2) {
    }

    public static /* synthetic */ void m(Function0 function0, View view) {
    }

    public static /* synthetic */ void n(Function0 function0, View view) {
    }

    private final void o(int i2) {
    }

    private final void r(View view) {
    }

    private final View s(int i2) {
    }

    private final View t(View view) {
    }

    private final View u(Function0<Unit> function0, int i2, Integer... numArr) {
    }

    private final View v(Function0<Unit> function0, View view, Integer... numArr) {
    }

    private static final void w(Function0 function0, View view) {
    }

    private static final void x(Function0 function0, View view) {
    }

    private final void z(View view, View view2) {
    }

    public final void f() {
    }

    @Nullable
    public final View g(@NotNull Function0<Unit> function0, int i2, @NotNull Integer... numArr) {
    }

    @Nullable
    public final View h(@NotNull Function0<Unit> function0, @NotNull View view, @NotNull Integer... numArr) {
    }

    @Nullable
    public final ViewGroup i() {
    }

    @NotNull
    public final ViewGroup j() {
    }

    public final void l(@NotNull ViewGroup viewGroup) {
    }

    public final void p() {
    }

    public final void q() {
    }

    public final void y(@NotNull Object obj) {
    }

    public r(@NotNull Context context, int i2) {
    }
}
