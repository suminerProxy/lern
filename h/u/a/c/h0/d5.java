package h.u.a.c.h0;

import android.view.View;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.eventmodel.RefreshSearchEvent;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SearchTabShowFragment.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0014J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020 H\u0014J\b\u0010\u000f\u001a\u00020 H\u0014J\u0006\u0010\"\u001a\u00020 J\b\u0010#\u001a\u00020 H\u0016J\u0012\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0010H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/showstartfans/activity/activitys/other/SearchTabShowFragment;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/other/AdapterProfileList;", "getAdapter", "()Lcom/showstartfans/activity/activitys/other/AdapterProfileList;", "adapter$delegate", "Lkotlin/Lazy;", "cityId", "", "kotlin.jvm.PlatformType", "getCityId", "()Ljava/lang/String;", "cityId$delegate", "initView", "", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "getLoadMoreAction", "()Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "loadMoreAction$delegate", "mAdapter", "Lcom/soli/pullupdownrefresh/more/LoadMoreRecyclerAdapter;", "getMAdapter", "()Lcom/soli/pullupdownrefresh/more/LoadMoreRecyclerAdapter;", "mAdapter$delegate", "pageNo", "", "postData", "getContentView", "initData", "", "initListener", "loadFirstData", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/RefreshSearchEvent;", "searchByParams", "isShow", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class d5 extends h.y.a.f.o.e {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public static final a f19054j = null;
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f19055d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f19056e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f19057f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Lazy f19058g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final Lazy f19059h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final Lazy f19060i;

    /* compiled from: SearchTabShowFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/showstartfans/activity/activitys/other/SearchTabShowFragment$Companion;", "", "()V", "getInstance", "Lcom/showstartfans/activity/activitys/other/SearchTabShowFragment;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ d5 b(a aVar, int i2, int i3, Object obj) {
        }

        @NotNull
        public final d5 a(int i2) {
        }
    }

    /* compiled from: SearchTabShowFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/other/AdapterProfileList;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<m4> {
        public final /* synthetic */ d5 this$0;

        public b(d5 d5Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ m4 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final m4 invoke() {
        }
    }

    /* compiled from: SearchTabShowFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<String> {
        public static final c INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final String invoke2() {
        }
    }

    /* compiled from: SearchTabShowFragment.kt */
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

    /* compiled from: SearchTabShowFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/soli/pullupdownrefresh/more/LoadMoreRecyclerAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function0<h.v.a.e.e> {
        public final /* synthetic */ d5 this$0;

        public e(d5 d5Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.v.a.e.e invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.v.a.e.e invoke() {
        }
    }

    public static final /* synthetic */ m4 g(d5 d5Var) {
    }

    private final h.v.a.d getLoadMoreAction() {
    }

    private final m4 h() {
    }

    private final String i() {
    }

    private final h.v.a.e.e j() {
    }

    private static final void k(d5 d5Var, boolean z) {
    }

    public static /* synthetic */ void l(d5 d5Var) {
    }

    public static /* synthetic */ void m(d5 d5Var, boolean z) {
    }

    public static /* synthetic */ void n(d5 d5Var, h.y.a.m.n nVar) {
    }

    private static final void r(d5 d5Var) {
    }

    private final void s(boolean z) {
    }

    private static final void u(d5 d5Var, h.y.a.m.n nVar) {
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

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RefreshSearchEvent refreshSearchEvent) {
    }

    public final void q() {
    }
}
