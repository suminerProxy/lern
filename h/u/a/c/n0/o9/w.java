package h.u.a.c.n0.o9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.model.SearchListBean;
import com.taihebase.activity.view.LoadImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CollectGoodsAdapter.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J*\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0014J\u001a\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0014¨\u0006\u0013"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/adapter/CollectGoodsAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/model/SearchListBean;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onBindViewHolder_impl", "", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "", "original_position", "real_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class w extends h.y.a.f.m<SearchListBean> {

    /* compiled from: CollectGoodsAdapter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0019\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00100\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0015\u001a\n \b*\u0004\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/adapter/CollectGoodsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/taihebase/activity/view/itemTouch/ItemTouchHelperViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/activitys/usercenter/adapter/CollectGoodsAdapter;Landroid/view/View;)V", "goodsName", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getGoodsName", "()Landroid/widget/TextView;", "goodsP", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getGoodsP", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "goodsPost", "Lcom/taihebase/activity/view/LoadImageView;", "getGoodsPost", "()Lcom/taihebase/activity/view/LoadImageView;", "goodsPrice", "getGoodsPrice", "goodsSc", "getGoodsSc", "onItemClear", "", "onItemSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends RecyclerView.ViewHolder implements h.y.a.o.z.b {

        /* renamed from: a  reason: collision with root package name */
        private final LoadImageView f19822a;
        private final TextView b;
        private final TextView c;

        /* renamed from: d  reason: collision with root package name */
        private final TextView f19823d;

        /* renamed from: e  reason: collision with root package name */
        private final ConstraintLayout f19824e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w f19825f;

        public a(@NotNull w wVar, View view) {
        }

        @Override // h.y.a.o.z.b
        public void a() {
        }

        @Override // h.y.a.o.z.b
        public void b() {
        }

        public final TextView c() {
        }

        public final ConstraintLayout d() {
        }

        public final LoadImageView e() {
        }

        public final TextView f() {
        }

        public final TextView g() {
        }
    }

    /* compiled from: CollectGoodsAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ int $real_position;
        public final /* synthetic */ w this$0;

        public b(w wVar, int i2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    public w(@NotNull Context context) {
    }

    public static /* synthetic */ void Q(SearchListBean searchListBean, w wVar, View view) {
    }

    public static /* synthetic */ void R(w wVar, SearchListBean searchListBean, int i2, View view) {
    }

    private static final void S(w wVar, SearchListBean searchListBean, int i2, View view) {
    }

    private static final void T(SearchListBean searchListBean, w wVar, View view) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }
}
