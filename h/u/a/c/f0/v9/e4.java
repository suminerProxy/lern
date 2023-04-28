package h.u.a.c.f0.v9;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import cn.sharesdk.framework.InnerShareParams;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.eventmodel.MainHomeNewTabEvent;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabHomeNewFragment.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0013J\b\u0010\u001c\u001a\u00020\u0004H\u0014J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0014J\b\u0010 \u001a\u00020\u0018H\u0014J\b\u0010!\u001a\u00020\u0018H\u0014J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u0018H\u0016J\b\u0010+\u001a\u00020\u0018H\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.H\u0007J\u0010\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0013H\u0016J\u0010\u00101\u001a\u00020\u00182\b\u00102\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015¨\u00064"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabHomeNewFragment;", "Lcom/showstartfans/activity/activitys/maintab/newmain/BaseTabHomeFragment;", "()V", "initDisplayPos", "", "tabClass", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/activitys/maintab/newmain/TabHomeNewFragment$TabItems;", "Lkotlin/collections/ArrayList;", "tabFragment", "Landroidx/fragment/app/Fragment;", "tabTitle", "", "toolBarHeight", "getToolBarHeight", "()I", "toolBarHeight$delegate", "Lkotlin/Lazy;", "useApp", "", "getUseApp", "()Z", "useApp$delegate", "addTopSlidingView", "", "changeShoppingCarPop", "getADVAll", "needWait", "getContentView", "getHomeTicketRemind", "getPopSale", "initData", "initListener", "initView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onDoubleClickHappen", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/MainHomeNewTabEvent;", "onHiddenChanged", InnerShareParams.HIDDEN, "setCityName", "cityName", "TabItems", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class e4 extends w3 {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public Map<Integer, View> f18663e;

    /* renamed from: f  reason: collision with root package name */
    private int f18664f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<Fragment> f18665g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<String> f18666h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final Lazy f18667i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private final Lazy f18668j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList<a> f18669k;

    /* compiled from: TabHomeNewFragment.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabHomeNewFragment$TabItems;", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final Fragment f18670a;

        public a(@NotNull Fragment fragment) {
        }

        public static /* synthetic */ a c(a aVar, Fragment fragment, int i2, Object obj) {
        }

        @NotNull
        public final Fragment a() {
        }

        @NotNull
        public final a b(@NotNull Fragment fragment) {
        }

        @NotNull
        public final Fragment d() {
        }

        public boolean equals(@Nullable Object obj) {
        }

        public int hashCode() {
        }

        @NotNull
        public String toString() {
        }
    }

    /* compiled from: TabHomeNewFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabHomeNewFragment$initListener$4", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends ViewPager.SimpleOnPageChangeListener {
        public final /* synthetic */ e4 b;

        public b(e4 e4Var) {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }
    }

    /* compiled from: TabHomeNewFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Integer> {
        public final /* synthetic */ e4 this$0;

        public c(e4 e4Var) {
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

    /* compiled from: TabHomeNewFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ e4 this$0;

        public d(e4 e4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
        }
    }

    private static final void A(e4 e4Var, h.y.a.m.n nVar) {
    }

    private static final void B(e4 e4Var) {
    }

    private final void C(boolean z) {
    }

    private static final void D(e4 e4Var, h.y.a.m.n nVar) {
    }

    private static final void E(e4 e4Var) {
    }

    private final boolean F() {
    }

    private static final void G(e4 e4Var, View view) {
    }

    private static final void H(e4 e4Var, View view) {
    }

    private static final void I(e4 e4Var, View view) {
    }

    public static /* synthetic */ void J(e4 e4Var) {
    }

    public static /* synthetic */ void K(e4 e4Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ boolean L(e4 e4Var) {
    }

    public static /* synthetic */ void M(e4 e4Var, View view) {
    }

    public static /* synthetic */ void N(e4 e4Var, View view) {
    }

    public static /* synthetic */ void O(e4 e4Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void P(e4 e4Var, View view) {
    }

    public static /* synthetic */ void Q(e4 e4Var) {
    }

    private final int i() {
    }

    public static final /* synthetic */ FragmentActivity s(e4 e4Var) {
    }

    public static final /* synthetic */ void u(e4 e4Var, int i2) {
    }

    private final void v() {
    }

    private static final boolean y(e4 e4Var) {
    }

    private final void z() {
    }

    public final void R(@Nullable String str) {
    }

    @Override // h.u.a.c.f0.v9.w3, h.y.a.f.o.e, h.y.a.f.o.d
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.u.a.c.f0.v9.w3, h.y.a.f.o.e, h.y.a.f.o.d
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

    @Override // h.y.a.f.o.e, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
    }

    @Override // h.u.a.c.f0.v9.w3, h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@NotNull MainHomeNewTabEvent mainHomeNewTabEvent) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
    }

    @Override // h.u.a.c.f0.v9.w3, h.u.a.l.b
    public void p() {
    }

    public final void w() {
    }

    public final void x(boolean z) {
    }
}
