package h.u.a.h;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.model.SceneDetailCommBean;
import h.u.a.c.f0.a9;
import h.u.a.g.s9;
import h.u.a.w.d0.d2;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReviewListDialog.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00172\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010'H\u0002J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0017H\u0002J\u001c\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\u001eH\u0002J\b\u00100\u001a\u00020\u001eH\u0016J\u0010\u00101\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015J\b\u00102\u001a\u00020\u001eH\u0002J\u0010\u00103\u001a\u00020\u001e2\b\u00104\u001a\u0004\u0018\u00010\u0015R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R=\u0010\u0018\u001a%\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0019j\u0004\u0018\u0001`\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lcom/showstartfans/activity/dialog/ReviewListDialog;", "Lcom/taihebase/activity/view/bottomsheet/BaseBottomSheetDialogFragment;", "act", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "adapter", "Lcom/showstartfans/activity/activitys/maintab/SceneDetailCommAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/maintab/SceneDetailCommAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/showstartfans/activity/databinding/DialogReviewListBinding;", "isHot", "", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "getLoadMoreAction", "()Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "loadMoreAction$delegate", "mData", "Lcom/showstartfans/activity/model/Article;", "mPage", "", "onReviewSuccess", "Lkotlin/Function1;", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "Lkotlin/ParameterName;", "name", "bean", "", "Lcom/showstartfans/activity/dialog/OnReviewSuccess;", "getOnReviewSuccess", "()Lkotlin/jvm/functions/Function1;", "setOnReviewSuccess", "(Lkotlin/jvm/functions/Function1;)V", "OnDateCallBack", "page", "it", "", "getData", "getDialogView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "initListener", "initView", "sendCommDialog", "setTabTitleStyle", "show", "data", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class t0 extends h.y.a.o.y.a {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public Map<Integer, View> f24306e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f24307f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private Function1<? super SceneDetailCommBean, Unit> f24308g;

    /* renamed from: h  reason: collision with root package name */
    private s9 f24309h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final Lazy f24310i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private Article f24311j;

    /* renamed from: k  reason: collision with root package name */
    private int f24312k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private final Lazy f24313l;

    /* compiled from: ReviewListDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/SceneDetailCommAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<a9> {
        public final /* synthetic */ t0 this$0;

        public a(t0 t0Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ a9 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final a9 invoke() {
        }
    }

    /* compiled from: ReviewListDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<List<? extends SceneDetailCommBean>, Unit> {
        public final /* synthetic */ int $page;
        public final /* synthetic */ t0 this$0;

        public b(t0 t0Var, int i2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends SceneDetailCommBean> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable List<? extends SceneDetailCommBean> list) {
        }
    }

    /* compiled from: ReviewListDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<List<? extends SceneDetailCommBean>, Unit> {
        public final /* synthetic */ int $page;
        public final /* synthetic */ t0 this$0;

        public c(t0 t0Var, int i2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends SceneDetailCommBean> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable List<? extends SceneDetailCommBean> list) {
        }
    }

    /* compiled from: ReviewListDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<h.v.a.d> {
        public static final d INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.v.a.d invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.v.a.d invoke() {
        }
    }

    /* compiled from: ReviewListDialog.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/dialog/ReviewListDialog$sendCommDialog$1", "Lcom/showstartfans/activity/widget/popupwindow/OnDanmuInputCall;", "onDanmuInputCall", "", "inputStr", "", "onDanmuInputDismiss", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e implements d2 {
        public final /* synthetic */ t0 b;
        public final /* synthetic */ Article c;

        /* compiled from: ReviewListDialog.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends Lambda implements Function1<Integer, Unit> {
            public final /* synthetic */ Article $bean;
            public final /* synthetic */ String $inputStr;
            public final /* synthetic */ t0 this$0;

            public a(Article article, String str, t0 t0Var) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            }

            public final void invoke(int i2) {
            }
        }

        public e(t0 t0Var, Article article) {
        }

        @Override // h.u.a.w.d0.d2
        public void onDanmuInputCall(@NotNull String str) {
        }

        @Override // h.u.a.w.d0.d2
        public void onDanmuInputDismiss() {
        }
    }

    public t0(@NotNull AppCompatActivity appCompatActivity) {
    }

    private final void C() {
    }

    private final void getData(int i2) {
    }

    private final h.v.a.d getLoadMoreAction() {
    }

    private final void h(int i2, List<? extends SceneDetailCommBean> list) {
    }

    public static final /* synthetic */ void i(t0 t0Var, int i2, List list) {
    }

    private final void initListener() {
    }

    public static final /* synthetic */ a9 j(t0 t0Var) {
    }

    public static final /* synthetic */ Context k(t0 t0Var) {
    }

    private final a9 l() {
    }

    private static final void n(t0 t0Var, View view) {
    }

    private static final void q(t0 t0Var, boolean z) {
    }

    private static final void r(t0 t0Var, View view) {
    }

    private static final void s(t0 t0Var, View view) {
    }

    private static final void u(t0 t0Var, View view) {
    }

    public static /* synthetic */ void v(t0 t0Var, View view) {
    }

    public static /* synthetic */ void w(t0 t0Var, View view) {
    }

    public static /* synthetic */ void x(t0 t0Var, View view) {
    }

    public static /* synthetic */ void y(t0 t0Var, View view) {
    }

    public static /* synthetic */ void z(t0 t0Var, boolean z) {
    }

    public final void A(@Nullable Article article) {
    }

    public final void B(@Nullable Function1<? super SceneDetailCommBean, Unit> function1) {
    }

    public final void D(@Nullable Article article) {
    }

    @Override // h.y.a.o.y.a
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.o.y.a
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.y.a.o.y.a
    @Nullable
    public View f(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
    }

    @Override // h.y.a.o.y.a
    public void initView() {
    }

    @Nullable
    public final Function1<SceneDetailCommBean, Unit> m() {
    }

    @Override // h.y.a.o.y.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }
}
