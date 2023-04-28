package com.showstartfans.activity.activitys.profile;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.alipay.sdk.widget.j;
import com.google.android.material.appbar.AppBarLayout;
import com.showstartfans.activity.eventmodel.LoginEvent;
import com.showstartfans.activity.eventmodel.RefreshUserSceneEvent;
import com.showstartfans.activity.manager.PhotoWallPhotoBean;
import com.showstartfans.activity.model.GroupInfo;
import com.showstartfans.activity.model.Tag;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import h.u.a.c.l0.g3;
import h.u.a.c.l0.h3;
import h.u.a.c.l0.y3;
import h.u.a.g.g5;
import h.y.a.m.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShowClassSceneActivity.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 @2\u00020\u0001:\u0001@B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000bH\u0002J\u0010\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000bH\u0002J\b\u0010*\u001a\u00020'H\u0002J\u0012\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0011H\u0002J\u0006\u0010-\u001a\u00020'J\b\u0010.\u001a\u00020'H\u0014J\u0012\u0010/\u001a\u00020'2\b\u0010,\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u00100\u001a\u00020'2\b\u00101\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u00102\u001a\u00020'H\u0014J\b\u00103\u001a\u00020'H\u0014J\b\u00104\u001a\u00020'H\u0002J\b\u00105\u001a\u00020'H\u0014J\u0010\u00106\u001a\u00020'2\u0006\u00107\u001a\u000208H\u0007J\u0010\u00106\u001a\u00020'2\u0006\u00107\u001a\u000209H\u0007J\b\u0010:\u001a\u00020'H\u0014J\b\u0010;\u001a\u00020'H\u0014J\b\u0010<\u001a\u00020'H\u0002J\b\u0010=\u001a\u00020>H\u0014J\u0006\u0010?\u001a\u00020'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0013j\b\u0012\u0004\u0012\u00020\b`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u0012\u0012\u0004\u0012\u00020%0\u0013j\b\u0012\u0004\u0012\u00020%`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ShowClassSceneActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "()V", "activityId", "", "binding", "Lcom/showstartfans/activity/databinding/ActivityShowSceneLayoutBinding;", "canSendMoment", "", "canSendPost", "enterLoginActivity", "", "groupInfo", "Lcom/showstartfans/activity/model/GroupInfo;", "isInitFragment", "isInitViewPager", "mBean", "Lcom/showstartfans/activity/model/Tag;", "mTabTitle", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "momentGroupAdapter", "Lcom/showstartfans/activity/activitys/profile/MomentGroupAdapter;", "getMomentGroupAdapter", "()Lcom/showstartfans/activity/activitys/profile/MomentGroupAdapter;", "momentGroupAdapter$delegate", "Lkotlin/Lazy;", "momentUserAdapter", "Lcom/showstartfans/activity/activitys/profile/MomentUserAdapter;", "getMomentUserAdapter", "()Lcom/showstartfans/activity/activitys/profile/MomentUserAdapter;", "momentUserAdapter$delegate", "pageNo", "photoTabFragment", "Lcom/showstartfans/activity/activitys/profile/ShowClassPhotoTabFragment;", "showMoment", "tabFragment", "Landroidx/fragment/app/Fragment;", "getData", "", "showPro", "getHeaderData", "getShopCartAndViewPager", "hasPhotoWall", "tagInfo", "hideRecord", "initData", "initFragment", "initHeader", "bean", "initListener", "initView", "initViewPager", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/LoginEvent;", "Lcom/showstartfans/activity/eventmodel/RefreshUserSceneEvent;", "onRestart", "onResume", j.f851l, "setContentViewResByViewBind", "Landroid/view/View;", "showRecord", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ShowClassSceneActivity extends BaseNoToolBarActivity {
    @NotNull
    public static final a s = null;
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f6251d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private String f6252e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private String f6253f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private String f6254g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private GroupInfo f6255h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private Tag f6256i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f6257j;

    /* renamed from: k  reason: collision with root package name */
    private g5 f6258k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private y3 f6259l;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    private final Lazy f6260m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private final Lazy f6261n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    private final ArrayList<String> f6262o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    private final ArrayList<Fragment> f6263p;
    private boolean q;
    private boolean r;

    /* compiled from: ShowClassSceneActivity.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ShowClassSceneActivity$Companion;", "", "()V", "start", "", "ctx", "Landroid/content/Context;", "id", "", "type", "name", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@Nullable Context context, int i2, int i3, @Nullable String str) {
        }
    }

    /* compiled from: ShowClassSceneActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/showstartfans/activity/manager/PhotoWallPhotoBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<List<? extends PhotoWallPhotoBean>, Unit> {
        public final /* synthetic */ ShowClassSceneActivity this$0;

        public b(ShowClassSceneActivity showClassSceneActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends PhotoWallPhotoBean> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<PhotoWallPhotoBean> list) {
        }
    }

    /* compiled from: ShowClassSceneActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/profile/ShowClassSceneActivity$initListener$3", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShowClassSceneActivity f6264a;

        public c(ShowClassSceneActivity showClassSceneActivity) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    /* compiled from: ShowClassSceneActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "isDouble", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function2<View, Boolean, Unit> {
        public final /* synthetic */ ShowClassSceneActivity this$0;

        public d(ShowClassSceneActivity showClassSceneActivity) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Boolean bool) {
        }

        public final void invoke(@NotNull View view, boolean z) {
        }
    }

    /* compiled from: ShowClassSceneActivity.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/profile/ShowClassSceneActivity$initListener$8", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", h.a.a.a.a.i.g.C, "positionOffset", "", "positionOffsetPixels", "onPageSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ ShowClassSceneActivity b;

        public e(ShowClassSceneActivity showClassSceneActivity) {
        }

        public static /* synthetic */ void a(ShowClassSceneActivity showClassSceneActivity) {
        }

        private static final void b(ShowClassSceneActivity showClassSceneActivity) {
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

    /* compiled from: ShowClassSceneActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/profile/MomentGroupAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function0<g3> {
        public final /* synthetic */ ShowClassSceneActivity this$0;

        public f(ShowClassSceneActivity showClassSceneActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final g3 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ g3 invoke() {
        }
    }

    /* compiled from: ShowClassSceneActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/profile/MomentUserAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends Lambda implements Function0<h3> {
        public final /* synthetic */ ShowClassSceneActivity this$0;

        public g(ShowClassSceneActivity showClassSceneActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h3 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h3 invoke() {
        }
    }

    public static final /* synthetic */ void A(ShowClassSceneActivity showClassSceneActivity) {
    }

    private final void B(boolean z) {
    }

    private final void C(boolean z) {
    }

    private static final void D(ShowClassSceneActivity showClassSceneActivity, n nVar) {
    }

    private final g3 E() {
    }

    private final h3 F() {
    }

    private final void G() {
    }

    private static final void H(ShowClassSceneActivity showClassSceneActivity, n nVar) {
    }

    private final boolean I(Tag tag) {
    }

    private final void K(Tag tag) {
    }

    private final void L(Tag tag) {
    }

    private static final void M(ShowClassSceneActivity showClassSceneActivity, View view) {
    }

    private static final void N(ShowClassSceneActivity showClassSceneActivity, AppBarLayout appBarLayout, int i2) {
    }

    private static final void O(ShowClassSceneActivity showClassSceneActivity, View view) {
    }

    private static final void P(ShowClassSceneActivity showClassSceneActivity, View view) {
    }

    private static final void Q(ShowClassSceneActivity showClassSceneActivity, View view) {
    }

    private final void R() {
    }

    public static /* synthetic */ void S(ShowClassSceneActivity showClassSceneActivity, View view) {
    }

    public static /* synthetic */ void T(ShowClassSceneActivity showClassSceneActivity, n nVar) {
    }

    public static /* synthetic */ void U(ShowClassSceneActivity showClassSceneActivity) {
    }

    public static /* synthetic */ void V(ShowClassSceneActivity showClassSceneActivity, View view) {
    }

    public static /* synthetic */ void W(ShowClassSceneActivity showClassSceneActivity, View view) {
    }

    public static /* synthetic */ void X(ShowClassSceneActivity showClassSceneActivity, n nVar) {
    }

    public static /* synthetic */ void Y(ShowClassSceneActivity showClassSceneActivity, AppBarLayout appBarLayout, int i2) {
    }

    public static /* synthetic */ void Z(ShowClassSceneActivity showClassSceneActivity, View view) {
    }

    public static /* synthetic */ void a0(ShowClassSceneActivity showClassSceneActivity) {
    }

    private final void b0() {
    }

    /* renamed from: onEvent$lambda-6  reason: not valid java name */
    private static final void m26onEvent$lambda6(ShowClassSceneActivity showClassSceneActivity) {
    }

    /* renamed from: onEvent$lambda-8$lambda-7  reason: not valid java name */
    private static final void m27onEvent$lambda8$lambda7(ShowClassSceneActivity showClassSceneActivity) {
    }

    public static final /* synthetic */ int w(ShowClassSceneActivity showClassSceneActivity) {
    }

    public static final /* synthetic */ g5 x(ShowClassSceneActivity showClassSceneActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity y(ShowClassSceneActivity showClassSceneActivity) {
    }

    public static final /* synthetic */ ArrayList z(ShowClassSceneActivity showClassSceneActivity) {
    }

    public final void J() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    public final void c0() {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@NotNull RefreshUserSceneEvent refreshUserSceneEvent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, android.app.Activity
    public void onRestart() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@NotNull LoginEvent loginEvent) {
    }
}
