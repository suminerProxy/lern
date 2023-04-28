package h.u.a.c.l0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.model.PostArticleData;
import com.taihebase.activity.view.LoadMoreRecyclerView;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TagArticleGridFragment.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\u001aJ\u0018\u0010\"\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020\bJ\b\u0010&\u001a\u00020\bH\u0014J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\bH\u0002J\b\u0010(\u001a\u00020\u001aH\u0014J\b\u0010)\u001a\u00020\u001aH\u0014J\b\u0010*\u001a\u00020\u001aH\u0014J\b\u0010+\u001a\u00020\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000Rg\u0010\u0012\u001aO\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0013j\u0004\u0018\u0001`\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/TagArticleGridFragment;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "()V", "ID", "", "adapter", "Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "list", "Lcom/taihebase/activity/view/LoadMoreRecyclerView;", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "getLoadMoreAction", "()Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "loadMoreAction$delegate", "Lkotlin/Lazy;", "mPage", "onScrolledCallBack", "Lkotlin/Function3;", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/ParameterName;", "name", "recyclerView", "dx", "dy", "", "Lcom/showstartfans/activity/activitys/profile/OnScrolledCallBack;", "getOnScrolledCallBack", "()Lkotlin/jvm/functions/Function3;", "setOnScrolledCallBack", "(Lkotlin/jvm/functions/Function3;)V", "type", "OnRefresh", "addData", "data", "Lcom/showstartfans/activity/model/PostArticleData;", "page", "getContentView", "getData", "initData", "initListener", "initView", "onDestroy", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class c4 extends h.y.a.f.o.e {
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public static final a f19380k = null;
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private Function3<? super RecyclerView, ? super Integer, ? super Integer, Unit> c;

    /* renamed from: d  reason: collision with root package name */
    private int f19381d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private t3 f19382e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private LoadMoreRecyclerView f19383f;

    /* renamed from: g  reason: collision with root package name */
    private int f19384g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private String f19385h;

    /* renamed from: i  reason: collision with root package name */
    private int f19386i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private final Lazy f19387j;

    /* compiled from: TagArticleGridFragment.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/TagArticleGridFragment$Companion;", "", "()V", "getInstance", "Lcom/showstartfans/activity/activitys/profile/TagArticleGridFragment;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "type", "Id", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final c4 a(int i2, int i3, @Nullable String str) {
        }
    }

    /* compiled from: TagArticleGridFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/PostArticleData;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<PostArticleData, Unit> {
        public final /* synthetic */ int $page;
        public final /* synthetic */ c4 this$0;

        public b(c4 c4Var, int i2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PostArticleData postArticleData) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable PostArticleData postArticleData) {
        }
    }

    /* compiled from: TagArticleGridFragment.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/profile/TagArticleGridFragment$initListener$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c4 f19388a;

        public c(c4 c4Var) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* compiled from: TagArticleGridFragment.kt */
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

    private final void getData(int i2) {
    }

    private final h.v.a.d getLoadMoreAction() {
    }

    public static final /* synthetic */ h.v.a.d h(c4 c4Var) {
    }

    private static final void k(c4 c4Var, boolean z) {
    }

    public static /* synthetic */ void l(c4 c4Var, boolean z) {
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

    public final void i(@Nullable PostArticleData postArticleData, int i2) {
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

    @Nullable
    public final Function3<RecyclerView, Integer, Integer, Unit> j() {
    }

    public final void m(@Nullable Function3<? super RecyclerView, ? super Integer, ? super Integer, Unit> function3) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }
}
