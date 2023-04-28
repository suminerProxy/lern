package h.u.a.c.f0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.view.GridISunJianView;
import com.showstartfans.activity.view.UserLevelView;
import com.showstartfans.activity.view.UserPhotoPraiseView;
import com.taihebase.activity.view.AutoGoneTextView;
import h.y.a.f.m;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArticleGridAdapter.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J*\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0014J\u001a\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\bH\u0014J\u0006\u0010%\u001a\u00020\u0014J\u0012\u0010&\u001a\u00020\u00142\b\u0010'\u001a\u0004\u0018\u00010(H\u0007J\u0012\u0010&\u001a\u00020\u00142\b\u0010'\u001a\u0004\u0018\u00010)H\u0007J\u0012\u0010&\u001a\u00020\u00142\b\u0010'\u001a\u0004\u0018\u00010*H\u0007J\b\u0010+\u001a\u00020\u0014H\u0016R2\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\tR\u00020\u00000\u0007j\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\tR\u00020\u0000`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\r¨\u0006-"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/ArticleGridAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/model/Article;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "itemMap", "Ljava/util/HashMap;", "", "Lcom/showstartfans/activity/activitys/maintab/ArticleGridAdapter$ViewHodler;", "Lkotlin/collections/HashMap;", "itemMinHeight", "getItemMinHeight", "()I", "itemMinHeight$delegate", "Lkotlin/Lazy;", "widthDP", "getWidthDP", "widthDP$delegate", "addAll", "", "newData", "", "checkSunJianPlay", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "real_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "onDestory", "onEvent", "event", "Lcom/showstartfans/activity/model/ArticleImmersinPraiseEvent;", "Lcom/showstartfans/activity/model/ArticleReviewEvent;", "Lcom/showstartfans/activity/model/UserFollowStatusEvent;", "removeAll", "ViewHodler", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class p8 extends h.y.a.f.m<Article> {
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private final Lazy f18375n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    private final HashMap<Integer, b> f18376o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    private final Lazy f18377p;

    /* compiled from: ArticleGridAdapter.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/maintab/ArticleGridAdapter$1", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter$OnAddDataIntercept;", "Lcom/showstartfans/activity/model/Article;", "onAddData", "", "data", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements m.a<Article> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p8 f18378a;

        public a(p8 p8Var) {
        }

        @Override // h.y.a.f.m.a
        public /* bridge */ /* synthetic */ boolean a(Article article) {
        }

        public boolean b(@NotNull Article article) {
        }
    }

    /* compiled from: ArticleGridAdapter.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\r0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\r0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0016\u001a\n \u0007*\u0004\u0018\u00010\u00170\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\n \u0007*\u0004\u0018\u00010\u001b0\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\n \u0007*\u0004\u0018\u00010\u001f0\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\"\u001a\n \u0007*\u0004\u0018\u00010#0#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/ArticleGridAdapter$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/activitys/maintab/ArticleGridAdapter;Landroid/view/View;)V", "iv_flag_sunjian", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIv_flag_sunjian", "()Landroid/widget/ImageView;", "iv_flag_video", "getIv_flag_video", "sdv_conver", "Lcom/facebook/drawee/view/SimpleDraweeView;", "getSdv_conver", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "sdv_head", "getSdv_head", "tv_content", "Lcom/taihebase/activity/view/AutoGoneTextView;", "getTv_content", "()Lcom/taihebase/activity/view/AutoGoneTextView;", "tv_userName", "Landroid/widget/TextView;", "getTv_userName", "()Landroid/widget/TextView;", "userLevel", "Lcom/showstartfans/activity/view/UserLevelView;", "getUserLevel", "()Lcom/showstartfans/activity/view/UserLevelView;", "view_grid_sunjian", "Lcom/showstartfans/activity/view/GridISunJianView;", "getView_grid_sunjian", "()Lcom/showstartfans/activity/view/GridISunJianView;", "view_praise", "Lcom/showstartfans/activity/view/UserPhotoPraiseView;", "getView_praise", "()Lcom/showstartfans/activity/view/UserPhotoPraiseView;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final UserPhotoPraiseView f18379a;
        private final SimpleDraweeView b;
        private final AutoGoneTextView c;

        /* renamed from: d  reason: collision with root package name */
        private final TextView f18380d;

        /* renamed from: e  reason: collision with root package name */
        private final SimpleDraweeView f18381e;

        /* renamed from: f  reason: collision with root package name */
        private final ImageView f18382f;

        /* renamed from: g  reason: collision with root package name */
        private final ImageView f18383g;

        /* renamed from: h  reason: collision with root package name */
        private final GridISunJianView f18384h;

        /* renamed from: i  reason: collision with root package name */
        private final UserLevelView f18385i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ p8 f18386j;

        public b(@NotNull p8 p8Var, View view) {
        }

        public final ImageView c() {
        }

        public final ImageView d() {
        }

        public final SimpleDraweeView e() {
        }

        public final SimpleDraweeView f() {
        }

        public final AutoGoneTextView g() {
        }

        public final TextView h() {
        }

        public final UserLevelView i() {
        }

        public final GridISunJianView j() {
        }

        public final UserPhotoPraiseView k() {
        }
    }

    /* compiled from: ArticleGridAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Integer> {
        public final /* synthetic */ p8 this$0;

        public c(p8 p8Var) {
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

    /* compiled from: ArticleGridAdapter.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/maintab/ArticleGridAdapter$onAttachedToRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p8 f18387a;

        public d(p8 p8Var) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* compiled from: ArticleGridAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Article $bean;
        public final /* synthetic */ int $real_position;
        public final /* synthetic */ p8 this$0;

        public e(Article article, p8 p8Var, int i2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: ArticleGridAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function0<Integer> {
        public final /* synthetic */ p8 this$0;

        public f(p8 p8Var) {
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

    public p8(@NotNull Context context) {
    }

    public static final /* synthetic */ void Q(p8 p8Var) {
    }

    public static final /* synthetic */ Context R(p8 p8Var) {
    }

    private static final void S(p8 p8Var, Object obj) {
    }

    private final void T() {
    }

    private final int U() {
    }

    private final int V() {
    }

    public static /* synthetic */ void W(p8 p8Var, Object obj) {
    }

    public static /* synthetic */ void X(p8 p8Var, Article article, View view) {
    }

    private static final void Y(p8 p8Var, Article article, View view) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    public final void Z() {
    }

    @Override // h.y.a.f.m
    public void addAll(@Nullable List<? extends Article> list) {
    }

    @Override // h.y.a.f.m, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable h.u.a.o.a aVar) {
    }

    @Override // h.y.a.f.m
    public void removeAll() {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable h.u.a.o.b bVar) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable h.u.a.o.d0 d0Var) {
    }
}
