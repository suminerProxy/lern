package h.u.a.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.model.NftBean;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NftListAdapter.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ*\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0014J\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0014¨\u0006\u0016"}, d2 = {"Lcom/showstartfans/activity/adapter/NftListAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/model/NftBean;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "list", "", "(Landroid/content/Context;Ljava/util/List;)V", "onBindViewHolder_impl", "", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "", "original_position", h.a.a.a.a.i.g.C, "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHodler", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class g1 extends h.y.a.f.m<NftBean> {

    /* compiled from: NftListAdapter.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\u0016\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/showstartfans/activity/adapter/NftListAdapter$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/adapter/NftListAdapter;Landroid/view/View;)V", "ivTag", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIvTag", "()Landroid/widget/ImageView;", "sdvConver", "Lcom/facebook/drawee/view/SimpleDraweeView;", "getSdvConver", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "tvInfo2", "Landroid/widget/TextView;", "getTvInfo2", "()Landroid/widget/TextView;", "tvName", "getTvName", "tvNo", "getTvNo", "tvStatu", "getTvStatu", "tvTime", "getTvTime", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final SimpleDraweeView f20239a;
        private final TextView b;
        private final TextView c;

        /* renamed from: d  reason: collision with root package name */
        private final TextView f20240d;

        /* renamed from: e  reason: collision with root package name */
        private final TextView f20241e;

        /* renamed from: f  reason: collision with root package name */
        private final ImageView f20242f;

        /* renamed from: g  reason: collision with root package name */
        private final TextView f20243g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ g1 f20244h;

        public a(@NotNull g1 g1Var, View view) {
        }

        public final ImageView c() {
        }

        public final SimpleDraweeView d() {
        }

        public final TextView e() {
        }

        public final TextView f() {
        }

        public final TextView g() {
        }

        public final TextView h() {
        }

        public final TextView i() {
        }
    }

    public g1(@NotNull Context context) {
    }

    public static /* synthetic */ void Q(NftBean nftBean, g1 g1Var, View view) {
    }

    private static final void R(NftBean nftBean, g1 g1Var, View view) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }

    public g1(@NotNull Context context, @Nullable List<NftBean> list) {
    }
}
