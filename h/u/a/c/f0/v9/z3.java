package h.u.a.c.f0.v9;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import cn.sharesdk.framework.InnerShareParams;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabFindNewFragment.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\u00012B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\bH\u0014J\u0006\u0010!\u001a\u00020\bJ\b\u0010\"\u001a\u00020\bH\u0002J\b\u0010#\u001a\u00020\u001fH\u0014J\b\u0010$\u001a\u00020\u001fH\u0014J\b\u0010%\u001a\u00020\u001fH\u0014J\b\u0010&\u001a\u00020\u001fH\u0002J\b\u0010'\u001a\u00020\u001fH\u0016J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\bH\u0002J\u000e\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020*J\u000e\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\bJ\u0006\u00101\u001a\u00020\u001fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\rj\b\u0012\u0004\u0012\u00020\u0011`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\rj\b\u0012\u0004\u0012\u00020\u0015`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u0018¨\u00063"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabFindNewFragment;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "Lcom/showstartfans/activity/listener/OnDoubleClickListener;", "()V", "NormalCheckFragment", "Ljava/lang/Class;", "Lcom/showstartfans/activity/activitys/maintab/newmain/TabFindTabFragment;", "currentPos", "", "initDisplayPos", "pagerAdapter", "Lcom/showstartfans/activity/adapter/DyFragmentChangePagerAdapter;", "tabClass", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/activitys/maintab/newmain/TabFindNewFragment$TabItems;", "Lkotlin/collections/ArrayList;", "tabFragment", "Landroidx/fragment/app/Fragment;", "getTabFragment", "()Ljava/util/ArrayList;", "tabTitle", "", "toolBarHeight", "getToolBarHeight", "()I", "toolBarHeight$delegate", "Lkotlin/Lazy;", "toolBarPadding", "getToolBarPadding", "toolBarPadding$delegate", "checkPageData", "", "getContentView", "getCurrentSelectPoi", "getInitDisplayPos", "initData", "initListener", "initView", "initViewPager", "onDoubleClickHappen", "onHiddenChanged", InnerShareParams.HIDDEN, "", "onViewPageSelected", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "setShowAttentRedPoint", "show", "setSlideBG", "resid", "updateAttentPoint", "TabItems", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class z3 extends h.y.a.f.o.e implements h.u.a.l.b {
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private Class<a4> c;

    /* renamed from: d  reason: collision with root package name */
    private int f18820d;

    /* renamed from: e  reason: collision with root package name */
    private int f18821e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<Fragment> f18822f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<String> f18823g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final Lazy f18824h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final Lazy f18825i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private h.u.a.d.m0 f18826j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList<a> f18827k;

    /* compiled from: TabFindNewFragment.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabFindNewFragment$TabItems;", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final Fragment f18828a;

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

    /* compiled from: TabFindNewFragment.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/TabFindNewFragment$initListener$2", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", h.a.a.a.a.i.g.C, "positionOffset", "", "positionOffsetPixels", "onPageSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ z3 b;

        public b(z3 z3Var) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }
    }

    /* compiled from: TabFindNewFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Integer> {
        public final /* synthetic */ z3 this$0;

        public c(z3 z3Var) {
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

    /* compiled from: TabFindNewFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<Integer> {
        public final /* synthetic */ z3 this$0;

        public d(z3 z3Var) {
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

    public static final /* synthetic */ FragmentActivity g(z3 z3Var) {
    }

    public static final /* synthetic */ void h(z3 z3Var, int i2) {
    }

    private final void i() {
    }

    private final int k() {
    }

    private final int m() {
    }

    private final int n() {
    }

    private static final void q(z3 z3Var, View view) {
    }

    private final void r() {
    }

    private static final void s(z3 z3Var) {
    }

    public static /* synthetic */ void u(z3 z3Var) {
    }

    public static /* synthetic */ void v(z3 z3Var, View view) {
    }

    private final void w(int i2) {
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

    public final int j() {
    }

    @NotNull
    public final ArrayList<Fragment> l() {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
    }

    @Override // h.u.a.l.b
    public void p() {
    }

    public final void x(boolean z) {
    }

    public final void y(int i2) {
    }

    public final void z() {
    }
}
