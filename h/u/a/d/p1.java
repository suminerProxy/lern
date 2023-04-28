package h.u.a.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.model.goodsmodel.ShoppingCartBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShopPhotoCartAdapter.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001bJ\b\u0010\u001c\u001a\u00020\u000bH\u0016J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J*\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0014J\u001a\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020\u000bH\u0014J\u000e\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u000bJ\u0010\u0010*\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010,J\u000e\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020/R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002`\fX\u0082\u000e¢\u0006\u0002\n\u0000RC\u0010\r\u001a+\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000ej\u0004\u0018\u0001`\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u00061"}, d2 = {"Lcom/showstartfans/activity/adapter/ShopPhotoCartAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/model/goodsmodel/ShoppingCartBean;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "list", "", "(Landroid/content/Context;Ljava/util/List;)V", "checkMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "onChangeListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "checkDatas", "", "Lcom/showstartfans/activity/adapter/OnChangeListener;", "getOnChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "getCheckData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItemCount", "getItemViewType", h.a.a.a.a.i.g.C, "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "removeCheck", "pos", "removeCheckById", "id", "", "setCheckAll", "checlAll", "", "ViewHodler", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class p1 extends h.y.a.f.m<ShoppingCartBean> {
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private HashMap<Integer, ShoppingCartBean> f20293n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private Function1<? super List<? extends ShoppingCartBean>, Unit> f20294o;

    /* compiled from: ShopPhotoCartAdapter.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/showstartfans/activity/adapter/ShopPhotoCartAdapter$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/adapter/ShopPhotoCartAdapter;Landroid/view/View;)V", "iv_gougou", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIv_gougou", "()Landroid/widget/ImageView;", "sdvConver", "Lcom/facebook/drawee/view/SimpleDraweeView;", "getSdvConver", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "tvName", "Landroid/widget/TextView;", "getTvName", "()Landroid/widget/TextView;", "tvPrice", "getTvPrice", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final SimpleDraweeView f20295a;
        private final ImageView b;
        private final TextView c;

        /* renamed from: d  reason: collision with root package name */
        private final TextView f20296d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ p1 f20297e;

        public a(@NotNull p1 p1Var, View view) {
        }

        public final ImageView c() {
        }

        public final SimpleDraweeView d() {
        }

        public final TextView e() {
        }

        public final TextView f() {
        }
    }

    public p1(@NotNull Context context) {
    }

    public static /* synthetic */ void S(p1 p1Var, int i2, a aVar, ShoppingCartBean shoppingCartBean, View view) {
    }

    private static final void T(p1 p1Var, int i2, a aVar, ShoppingCartBean shoppingCartBean, View view) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    @NotNull
    public final ArrayList<ShoppingCartBean> Q() {
    }

    @Nullable
    public final Function1<List<? extends ShoppingCartBean>, Unit> R() {
    }

    public final void U(int i2) {
    }

    public final void V(@Nullable String str) {
    }

    public final void W(boolean z) {
    }

    public final void X(@Nullable Function1<? super List<? extends ShoppingCartBean>, Unit> function1) {
    }

    @Override // h.y.a.f.m, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    @Override // h.y.a.f.m, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }

    public p1(@NotNull Context context, @Nullable List<ShoppingCartBean> list) {
    }
}
