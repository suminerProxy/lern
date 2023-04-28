package com.showstartfans.activity.activitys.profile;

import android.content.Context;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.eventmodel.ShoppingChangeEvent;
import com.showstartfans.activity.model.ShCartBean;
import com.showstartfans.activity.model.goodsmodel.ShoppingCartBean;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.u.a.d.p1;
import h.u.a.g.w4;
import h.y.a.m.n;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShopPhotoCartActivit.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0014J\b\u0010\u001a\u001a\u00020\u0016H\u0014J\b\u0010\u001b\u001a\u00020\u0016H\u0014J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010 \u001a\u00020!H\u0014J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u000eH\u0002J\b\u0010$\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ShopPhotoCartActivit;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "activityId", "", "adapter", "Lcom/showstartfans/activity/adapter/ShopPhotoCartAdapter;", "getAdapter", "()Lcom/showstartfans/activity/adapter/ShopPhotoCartAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/showstartfans/activity/databinding/ActivityShopPhotoCartBinding;", "checkAll", "", "isEditMode", "mBean", "Lcom/showstartfans/activity/model/ShCartBean;", "mGoodsList", "", "Lcom/showstartfans/activity/model/goodsmodel/ShoppingCartBean;", "getData", "", "isFirstLoad", "initData", "initListener", "initView", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/ShoppingChangeEvent;", "setCheckAll", "setContentViewResByViewBind", "Landroid/view/View;", "setMode", "isEdit", "updateBottomData", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ShopPhotoCartActivit extends BaseNewActivity {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public static final a f6243j = null;
    @NotNull
    public Map<Integer, View> b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6244d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private String f6245e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private ShCartBean f6246f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private List<? extends ShoppingCartBean> f6247g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final Lazy f6248h;

    /* renamed from: i  reason: collision with root package name */
    private w4 f6249i;

    /* compiled from: ShopPhotoCartActivit.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ShopPhotoCartActivit$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", "activityId", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@NotNull Context context, @NotNull String str) {
        }
    }

    /* compiled from: ShopPhotoCartActivit.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/adapter/ShopPhotoCartAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<p1> {
        public final /* synthetic */ ShopPhotoCartActivit this$0;

        public b(ShopPhotoCartActivit shopPhotoCartActivit) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final p1 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ p1 invoke() {
        }
    }

    /* compiled from: ShopPhotoCartActivit.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/profile/ShopPhotoCartActivit$initListener$3", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopPhotoCartActivit f6250a;

        public c(ShopPhotoCartActivit shopPhotoCartActivit) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    /* compiled from: ShopPhotoCartActivit.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ ShopPhotoCartActivit this$0;

        public d(ShopPhotoCartActivit shopPhotoCartActivit) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: ShopPhotoCartActivit.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/showstartfans/activity/model/goodsmodel/ShoppingCartBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function1<List<? extends ShoppingCartBean>, Unit> {
        public final /* synthetic */ ShopPhotoCartActivit this$0;

        public e(ShopPhotoCartActivit shopPhotoCartActivit) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ShoppingCartBean> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<? extends ShoppingCartBean> list) {
        }
    }

    private final void A(boolean z) {
    }

    public static /* synthetic */ void B(ShopPhotoCartActivit shopPhotoCartActivit, boolean z, int i2, Object obj) {
    }

    private static final void C(ShopPhotoCartActivit shopPhotoCartActivit, boolean z, n nVar) {
    }

    private static final void D(ShopPhotoCartActivit shopPhotoCartActivit, View view) {
    }

    private static final void E(ShopPhotoCartActivit shopPhotoCartActivit, View view) {
    }

    private static final void F(ShopPhotoCartActivit shopPhotoCartActivit, View view) {
    }

    private static final void G(ShopPhotoCartActivit shopPhotoCartActivit, View view) {
    }

    private static final void H(ShopPhotoCartActivit shopPhotoCartActivit, View view) {
    }

    public static /* synthetic */ void I(ShopPhotoCartActivit shopPhotoCartActivit, View view) {
    }

    public static /* synthetic */ void J(ShopPhotoCartActivit shopPhotoCartActivit, boolean z, n nVar) {
    }

    public static /* synthetic */ void K(ShopPhotoCartActivit shopPhotoCartActivit, View view) {
    }

    public static /* synthetic */ void L(ShopPhotoCartActivit shopPhotoCartActivit, View view) {
    }

    public static /* synthetic */ void M(ShopPhotoCartActivit shopPhotoCartActivit, View view) {
    }

    public static /* synthetic */ void N(ShopPhotoCartActivit shopPhotoCartActivit, View view) {
    }

    private final void O(boolean z) {
    }

    private final void P(boolean z) {
    }

    private final void Q() {
    }

    public static final /* synthetic */ w4 w(ShopPhotoCartActivit shopPhotoCartActivit) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity x(ShopPhotoCartActivit shopPhotoCartActivit) {
    }

    public static final /* synthetic */ void y(ShopPhotoCartActivit shopPhotoCartActivit) {
    }

    private final p1 z() {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable ShoppingChangeEvent shoppingChangeEvent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
