package com.showstartfans.activity.activitys.maintab.newmain;

import android.content.Context;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.NftBean;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.u.a.d.e1;
import h.u.a.d.f1;
import h.u.a.g.r2;
import h.u.a.t.m3;
import h.y.a.m.n;
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

/* compiled from: NftDetailsActivity.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0014J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0014J\b\u0010\u001d\u001a\u00020\u0015H\u0014J\b\u0010\u001e\u001a\u00020\u0015H\u0014J\b\u0010\u001f\u001a\u00020\u0015H\u0014J\b\u0010 \u001a\u00020\u0015H\u0014J\b\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u0017H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/NftDetailsActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "binding", "Lcom/showstartfans/activity/databinding/ActivityNftDetailsBinding;", "infoAdapter", "Lcom/showstartfans/activity/adapter/NftDetailsInfoAdapter;", "getInfoAdapter", "()Lcom/showstartfans/activity/adapter/NftDetailsInfoAdapter;", "infoAdapter$delegate", "Lkotlin/Lazy;", "mData", "Lcom/showstartfans/activity/model/NftBean;", "nftId", "", "quanyiAdapter", "Lcom/showstartfans/activity/adapter/NftDetailsQuanyiAdapter;", "getQuanyiAdapter", "()Lcom/showstartfans/activity/adapter/NftDetailsQuanyiAdapter;", "quanyiAdapter$delegate", "OnRefresh", "", "showLoading", "", "finish", "getData", "initData", "data", "initListener", "initView", "onDestroy", "onRestart", "onResume", "setContentViewResByViewBind", "Landroid/view/View;", "setGoodsInfo", "setStatusBarTextWhite", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class NftDetailsActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public static final a f5959h = null;
    @NotNull
    public Map<Integer, View> b;
    private r2 c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private NftBean f5960d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private String f5961e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f5962f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Lazy f5963g;

    /* compiled from: NftDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/NftDetailsActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", "nftId", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@Nullable Context context, @Nullable String str) {
        }
    }

    /* compiled from: NftDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/adapter/NftDetailsInfoAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<e1> {
        public final /* synthetic */ NftDetailsActivity this$0;

        public b(NftDetailsActivity nftDetailsActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final e1 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ e1 invoke() {
        }
    }

    /* compiled from: NftDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ NftDetailsActivity this$0;

        public c(NftDetailsActivity nftDetailsActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Integer num) {
        }
    }

    /* compiled from: NftDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/NftDetailsActivity$initListener$3", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NftDetailsActivity f5964a;

        public d(NftDetailsActivity nftDetailsActivity) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    /* compiled from: NftDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/adapter/NftDetailsQuanyiAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function0<f1> {
        public final /* synthetic */ NftDetailsActivity this$0;

        public e(NftDetailsActivity nftDetailsActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final f1 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ f1 invoke() {
        }
    }

    /* compiled from: NftDetailsActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/newmain/NftDetailsActivity$setGoodsInfo$1", "Lcom/showstartfans/activity/utils/WebUtil$OnInteceptStencil;", "OnIntecept", "", "isNight", "", "htmlStr", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f implements m3.d {
        @Override // h.u.a.t.m3.d
        @Nullable
        public String a(boolean z, @Nullable String str) {
        }
    }

    private static final void A(NftDetailsActivity nftDetailsActivity, n nVar) {
    }

    private static final void B(NftDetailsActivity nftDetailsActivity) {
    }

    private final e1 C() {
    }

    private final f1 D() {
    }

    private final void E(NftBean nftBean) {
    }

    private static final void F(NftDetailsActivity nftDetailsActivity) {
    }

    private static final void G(NftDetailsActivity nftDetailsActivity, View view) {
    }

    private static final void H(NftDetailsActivity nftDetailsActivity, View view) {
    }

    private static final void I(NftDetailsActivity nftDetailsActivity, View view) {
    }

    private static final void J(NftDetailsActivity nftDetailsActivity, View view) {
    }

    private static final void K(NftDetailsActivity nftDetailsActivity, int i2, NestedScrollView nestedScrollView, int i3, int i4, int i5, int i6) {
    }

    public static /* synthetic */ void L(NftDetailsActivity nftDetailsActivity, View view) {
    }

    public static /* synthetic */ void M(NftDetailsActivity nftDetailsActivity) {
    }

    public static /* synthetic */ void N(NftDetailsActivity nftDetailsActivity, int i2, NestedScrollView nestedScrollView, int i3, int i4, int i5, int i6) {
    }

    public static /* synthetic */ void O(NftDetailsActivity nftDetailsActivity) {
    }

    public static /* synthetic */ void P(NftDetailsActivity nftDetailsActivity, View view) {
    }

    public static /* synthetic */ void Q(NftDetailsActivity nftDetailsActivity, View view) {
    }

    public static /* synthetic */ void R(NftDetailsActivity nftDetailsActivity, View view) {
    }

    public static /* synthetic */ void S(NftDetailsActivity nftDetailsActivity, n nVar) {
    }

    private final void T() {
    }

    public static final /* synthetic */ BaseNewFunctionActivity x(NftDetailsActivity nftDetailsActivity) {
    }

    public static final /* synthetic */ void y(NftDetailsActivity nftDetailsActivity) {
    }

    private final void z() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // android.app.Activity
    public void finish() {
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

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity
    public boolean setStatusBarTextWhite() {
    }

    public final void w(boolean z) {
    }
}
