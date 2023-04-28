package h.u.a.c.f0.v9;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.model.ActivityListBean;
import h.u.a.c.f0.x8;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabHomeShowPointFragment.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 72\u00020\u0001:\u00017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\u0004H\u0014J\b\u0010$\u001a\u00020!H\u0014J\b\u0010%\u001a\u00020!H\u0014J\b\u0010&\u001a\u00020!H\u0014J\u0010\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0012H\u0002J\u0010\u0010)\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0012H\u0002JF\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\f2\b\u0010.\u001a\u0004\u0018\u00010\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\fJ\b\u0010/\u001a\u00020!H\u0016J\b\u00100\u001a\u00020!H\u0016J\u0006\u00101\u001a\u00020!J\u001c\u00102\u001a\u00020!2\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabHomeShowPointFragment;", "Lcom/taihebase/activity/base/fragment/BaseVisibleFragment;", "()V", "activityScaleId", "", "adapter", "Lcom/showstartfans/activity/activitys/maintab/HomeShowAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/maintab/HomeShowAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "channelId", "", "cityCode", "cityTypeCode", "endTime", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "isFirstOther", "", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "getLoadMoreAction", "()Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "loadMoreAction$delegate", "pageNo", "postData", "postView", "searchMorePriceKey", "searchMoreSaleKey", "showStyle", "sortType", "startTime", "getActivityList", "", "showProcess", "getContentView", "initData", "initListener", "initView", "loadBegin", "showPro", "loadFirst", "noticeActivity", "searchStyleKey", "searchTypeClassKey", "moreSaleKey", "morePriceKey", "onInvisible", "onVisible", "scrollTop", "setViewData", "data", "Lcom/showstartfans/activity/model/ActivityListBean;", "code", "Lcom/taihebase/activity/network/ResultCode;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class g4 extends h.y.a.f.o.f {
    @NotNull
    public static final a u = null;
    @NotNull
    public Map<Integer, View> c;

    /* renamed from: d  reason: collision with root package name */
    private int f18687d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f18688e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f18689f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f18690g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private String f18691h;

    /* renamed from: i  reason: collision with root package name */
    private int f18692i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private String f18693j;

    /* renamed from: k  reason: collision with root package name */
    private int f18694k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private String f18695l;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    private String f18696m;

    /* renamed from: n  reason: collision with root package name */
    private int f18697n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private String f18698o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private String f18699p;
    @Nullable
    private String q;
    @Nullable
    private String r;
    @NotNull
    private final Lazy s;
    @NotNull
    private final Lazy t;

    /* compiled from: TabHomeShowPointFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/newmain/TabHomeShowPointFragment$Companion;", "", "()V", "getInstance", "Lcom/showstartfans/activity/activitys/maintab/newmain/TabHomeShowPointFragment;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "channelId", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ g4 b(a aVar, int i2, String str, int i3, Object obj) {
        }

        @NotNull
        public final g4 a(int i2, @NotNull String str) {
        }
    }

    /* compiled from: TabHomeShowPointFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/HomeShowAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<x8> {
        public final /* synthetic */ g4 this$0;

        public b(g4 g4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ x8 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final x8 invoke() {
        }
    }

    /* compiled from: TabHomeShowPointFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "beanS", "Lcom/showstartfans/activity/model/ActivityListBean;", "code", "Lcom/taihebase/activity/network/ResultCode;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function2<ActivityListBean, h.y.a.m.o, Unit> {
        public final /* synthetic */ g4 this$0;

        public c(g4 g4Var) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(ActivityListBean activityListBean, h.y.a.m.o oVar) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable ActivityListBean activityListBean, @Nullable h.y.a.m.o oVar) {
        }
    }

    /* compiled from: TabHomeShowPointFragment.kt */
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

    /* compiled from: TabHomeShowPointFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function0<Unit> {
        public final /* synthetic */ g4 this$0;

        public e(g4 g4Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    private final h.v.a.d getLoadMoreAction() {
    }

    public static final /* synthetic */ void i(g4 g4Var, boolean z) {
    }

    public static final /* synthetic */ FragmentActivity j(g4 g4Var) {
    }

    public static final /* synthetic */ void k(g4 g4Var, boolean z) {
    }

    public static final /* synthetic */ void l(g4 g4Var, ActivityListBean activityListBean, h.y.a.m.o oVar) {
    }

    private final void m(boolean z) {
    }

    private final x8 n() {
    }

    private static final void q(g4 g4Var, boolean z) {
    }

    public static /* synthetic */ void r(g4 g4Var, boolean z) {
    }

    public static /* synthetic */ void s(g4 g4Var, boolean z) {
    }

    private final void u(boolean z) {
    }

    private final void v(boolean z) {
    }

    private static final void w(g4 g4Var, boolean z) {
    }

    private final void z(ActivityListBean activityListBean, h.y.a.m.o oVar) {
    }

    @Override // h.y.a.f.o.f, h.y.a.f.o.e, h.y.a.f.o.d
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.f.o.f, h.y.a.f.o.e, h.y.a.f.o.d
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.y.a.f.o.f
    public void g() {
    }

    @Override // h.y.a.f.o.e
    public int getContentView() {
    }

    @Override // h.y.a.f.o.f
    public void h() {
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

    @Override // h.y.a.f.o.f, h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    public final void x(@NotNull String str, @NotNull String str2, int i2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
    }

    public final void y() {
    }
}
