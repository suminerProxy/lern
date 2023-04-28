package h.u.a.c.l0;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.showstartfans.activity.manager.PhotoWallPhotoBean;
import com.showstartfans.activity.model.PhotoWallTagBean;
import java.util.ArrayList;
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

/* compiled from: ShowClassPhotoTabFragment.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 02\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010$\u001a\u00020\u0018J\u000e\u0010%\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010&\u001a\u00020'H\u0014J\b\u0010(\u001a\u00020\u0018H\u0002J\b\u0010)\u001a\u00020\u0018H\u0014J\u0018\u0010)\u001a\u00020\u00182\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0013H\u0002J\b\u0010,\u001a\u00020\u0018H\u0014J\b\u0010-\u001a\u00020\u0018H\u0014J\u0018\u0010.\u001a\u00020\u00182\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0013H\u0002J\u0006\u0010/\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000RC\u0010\u0011\u001a+\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012j\u0004\u0018\u0001`\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ShowClassPhotoTabFragment;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "()V", "activityId", "", "adapterTab", "Lcom/showstartfans/activity/adapter/ShowClassPhotoTabAdapter;", "getAdapterTab", "()Lcom/showstartfans/activity/adapter/ShowClassPhotoTabAdapter;", "adapterTab$delegate", "Lkotlin/Lazy;", "isExpanded", "", "isInitViewPagered", "isLoaded", "listTab", "Landroidx/recyclerview/widget/RecyclerView;", "onPhotoCheckChangeListener", "Lkotlin/Function1;", "", "Lcom/showstartfans/activity/manager/PhotoWallPhotoBean;", "Lkotlin/ParameterName;", "name", "checks", "", "Lcom/showstartfans/activity/adapter/OnPhotoCheckChangeListener;", "getOnPhotoCheckChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnPhotoCheckChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "tabFragment", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/activitys/profile/PhotoWallFragment;", "Lkotlin/collections/ArrayList;", "vp_ViewPager", "Landroidx/viewpager/widget/ViewPager;", "OnRefresh", "OnappBarExpanded", "getContentView", "", "getData", "initData", "datas", "Lcom/showstartfans/activity/model/PhotoWallTagBean;", "initListener", "initView", "initViewPager", "onPageSelected", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class y3 extends h.y.a.f.o.e {
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    public static final a f19541l = null;
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private Function1<? super List<PhotoWallPhotoBean>, Unit> c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f19542d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private ViewPager f19543e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f19544f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<j3> f19545g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private String f19546h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f19547i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f19548j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f19549k;

    /* compiled from: ShowClassPhotoTabFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ShowClassPhotoTabFragment$Companion;", "", "()V", "newInstance", "Lcom/showstartfans/activity/activitys/profile/ShowClassPhotoTabFragment;", "activityId", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final y3 a(@NotNull String str) {
        }
    }

    /* compiled from: ShowClassPhotoTabFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/adapter/ShowClassPhotoTabAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<h.u.a.d.r1> {
        public final /* synthetic */ y3 this$0;

        public b(y3 y3Var) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.u.a.d.r1 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.u.a.d.r1 invoke() {
        }
    }

    /* compiled from: ShowClassPhotoTabFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ y3 this$0;

        public c(y3 y3Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        }

        public final void invoke(int i2) {
        }
    }

    /* compiled from: ShowClassPhotoTabFragment.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/profile/ShowClassPhotoTabFragment$initListener$2", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", h.a.a.a.a.i.g.C, "positionOffset", "", "positionOffsetPixels", "onPageSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ y3 b;

        public d(y3 y3Var) {
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

    /* compiled from: ShowClassPhotoTabFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/showstartfans/activity/manager/PhotoWallPhotoBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function1<List<? extends PhotoWallPhotoBean>, Unit> {
        public final /* synthetic */ y3 this$0;

        public e(y3 y3Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends PhotoWallPhotoBean> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<PhotoWallPhotoBean> list) {
        }
    }

    public static final /* synthetic */ h.u.a.d.r1 i(y3 y3Var) {
    }

    public static final /* synthetic */ FragmentActivity j(y3 y3Var) {
    }

    public static final /* synthetic */ ArrayList k(y3 y3Var) {
    }

    public static final /* synthetic */ ViewPager l(y3 y3Var) {
    }

    private final h.u.a.d.r1 m() {
    }

    private final void n() {
    }

    private static final void q(y3 y3Var, h.y.a.m.n nVar) {
    }

    private final void s(List<PhotoWallTagBean> list) {
    }

    private final void u(List<PhotoWallTagBean> list) {
    }

    public static /* synthetic */ void v(y3 y3Var, h.y.a.m.n nVar) {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    public final void g() {
    }

    @Override // h.y.a.f.o.e
    public int getContentView() {
    }

    public final void h(boolean z) {
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

    @Nullable
    public final Function1<List<PhotoWallPhotoBean>, Unit> r() {
    }

    public final void w() {
    }

    public final void x(@Nullable Function1<? super List<PhotoWallPhotoBean>, Unit> function1) {
    }
}
