package h.u.a.c.l0;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.manager.PhotoWallPhotoBean;
import com.showstartfans.activity.view.SliderBarLayout;
import com.taihebase.activity.view.LoadMoreRecyclerView;
import com.taihebase.activity.view.recycleview.spannedgridlayoutmanager.SpannedGridLayoutManager;
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

/* compiled from: PhotoWallFragment.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 92\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010-\u001a\u00020$J\u000e\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u000200J\b\u00101\u001a\u00020\u001dH\u0014J\u0010\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\u001dH\u0002J\b\u00104\u001a\u00020$H\u0014J\b\u00105\u001a\u00020$H\u0014J\b\u00106\u001a\u00020$H\u0014J\b\u00107\u001a\u00020$H\u0016J\b\u00108\u001a\u00020$H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000RC\u0010\u001e\u001a+\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\r0 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020$\u0018\u00010\u001fj\u0004\u0018\u0001`%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/PhotoWallFragment;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "()V", "activityId", "", "adapter", "Lcom/showstartfans/activity/adapter/PhotoWallAapter;", "getAdapter", "()Lcom/showstartfans/activity/adapter/PhotoWallAapter;", "adapter$delegate", "Lkotlin/Lazy;", "checkPhotos", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/manager/PhotoWallPhotoBean;", "Lkotlin/collections/ArrayList;", "getCheckPhotos", "()Ljava/util/ArrayList;", "setCheckPhotos", "(Ljava/util/ArrayList;)V", "layoutManager", "Lcom/taihebase/activity/view/recycleview/spannedgridlayoutmanager/SpannedGridLayoutManager;", "layoutSlider", "Lcom/showstartfans/activity/view/SliderBarLayout;", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "getLoadMoreAction", "()Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "loadMoreAction$delegate", "mPage", "", "onPhotoCheckChangeListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "checks", "", "Lcom/showstartfans/activity/adapter/OnPhotoCheckChangeListener;", "getOnPhotoCheckChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnPhotoCheckChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "recycleList", "Lcom/taihebase/activity/view/LoadMoreRecyclerView;", "tagId", "OnRefresh", "OnappBarExpanded", "isExpanded", "", "getContentView", "getData", "page", "initData", "initListener", "initView", "onResume", "updateCheckItemStatus", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class j3 extends h.y.a.f.o.e {
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public static final a f19439m = null;
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private Function1<? super List<PhotoWallPhotoBean>, Unit> c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<PhotoWallPhotoBean> f19440d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private String f19441e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private String f19442f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Lazy f19443g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final Lazy f19444h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private LoadMoreRecyclerView f19445i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private SliderBarLayout f19446j;

    /* renamed from: k  reason: collision with root package name */
    private SpannedGridLayoutManager f19447k;

    /* renamed from: l  reason: collision with root package name */
    private int f19448l;

    /* compiled from: PhotoWallFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/PhotoWallFragment$Companion;", "", "()V", "newInstance", "Lcom/showstartfans/activity/activitys/profile/PhotoWallFragment;", "activityId", "", "tagId", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final j3 a(@NotNull String str, @NotNull String str2) {
        }
    }

    /* compiled from: PhotoWallFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/adapter/PhotoWallAapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<h.u.a.d.i1> {
        public final /* synthetic */ j3 this$0;

        public b(j3 j3Var) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.u.a.d.i1 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.u.a.d.i1 invoke() {
        }
    }

    /* compiled from: PhotoWallFragment.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/profile/PhotoWallFragment$initListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j3 f19449a;

        public c(j3 j3Var) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* compiled from: PhotoWallFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/showstartfans/activity/manager/PhotoWallPhotoBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function1<List<? extends PhotoWallPhotoBean>, Unit> {
        public final /* synthetic */ j3 this$0;

        public d(j3 j3Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends PhotoWallPhotoBean> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<PhotoWallPhotoBean> list) {
        }
    }

    /* compiled from: PhotoWallFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function0<h.v.a.d> {
        public static final e INSTANCE = null;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.v.a.d invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.v.a.d invoke() {
        }
    }

    private final void A() {
    }

    private final void getData(int i2) {
    }

    private final h.v.a.d getLoadMoreAction() {
    }

    public static final /* synthetic */ String i(j3 j3Var) {
    }

    public static final /* synthetic */ h.u.a.d.i1 j(j3 j3Var) {
    }

    public static final /* synthetic */ FragmentActivity k(j3 j3Var) {
    }

    public static final /* synthetic */ SliderBarLayout l(j3 j3Var) {
    }

    private final h.u.a.d.i1 m() {
    }

    private static final void q(j3 j3Var, int i2, h.y.a.m.n nVar) {
    }

    private static final void s(j3 j3Var, boolean z) {
    }

    private static final SpannedGridLayoutManager.e u(j3 j3Var, int i2) {
    }

    public static /* synthetic */ void v(j3 j3Var, int i2, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void w(j3 j3Var, boolean z) {
    }

    public static /* synthetic */ SpannedGridLayoutManager.e x(j3 j3Var, int i2) {
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

    @NotNull
    public final ArrayList<PhotoWallPhotoBean> n() {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
    }

    @Nullable
    public final Function1<List<PhotoWallPhotoBean>, Unit> r() {
    }

    public final void y(@NotNull ArrayList<PhotoWallPhotoBean> arrayList) {
    }

    public final void z(@Nullable Function1<? super List<PhotoWallPhotoBean>, Unit> function1) {
    }
}
