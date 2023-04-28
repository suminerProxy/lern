package h.u.a.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.model.HotelBean;
import com.showstartfans.activity.model.HotelTimeCheckBean;
import com.showstartfans.activity.model.actdes.ActDesBean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HotelListAdapter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J*\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0014J\u001a\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u000fH\u0014J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/showstartfans/activity/adapter/HotelListAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/model/HotelBean;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "checkTimeBean", "Lcom/showstartfans/activity/model/HotelTimeCheckBean;", "fromActDesBean", "Lcom/showstartfans/activity/model/actdes/ActDesBean;", "onBindViewHolder_impl", "", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "", "original_position", "real_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "ViewHodler", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class q0 extends h.y.a.f.m<HotelBean> {
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private ActDesBean f20298n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private HotelTimeCheckBean f20299o;

    /* compiled from: HotelListAdapter.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0016\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\u001a\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0019\u0010\u001c\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\u001e\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010 \u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u0006\""}, d2 = {"Lcom/showstartfans/activity/adapter/HotelListAdapter$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/adapter/HotelListAdapter;Landroid/view/View;)V", "ivPreferred", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIvPreferred", "()Landroid/widget/ImageView;", "rv_list_tag", "Landroidx/recyclerview/widget/RecyclerView;", "getRv_list_tag", "()Landroidx/recyclerview/widget/RecyclerView;", "sdv_conver", "Lcom/facebook/drawee/view/SimpleDraweeView;", "getSdv_conver", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "tvRenovationDate", "Landroid/widget/TextView;", "getTvRenovationDate", "()Landroid/widget/TextView;", "tv_Price", "getTv_Price", "tv_address", "getTv_address", "tv_distance", "getTv_distance", "tv_title", "getTv_title", "tv_userScore", "getTv_userScore", "tvstarRate", "getTvstarRate", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final RecyclerView f20300a;
        private final TextView b;
        private final TextView c;

        /* renamed from: d  reason: collision with root package name */
        private final SimpleDraweeView f20301d;

        /* renamed from: e  reason: collision with root package name */
        private final TextView f20302e;

        /* renamed from: f  reason: collision with root package name */
        private final TextView f20303f;

        /* renamed from: g  reason: collision with root package name */
        private final TextView f20304g;

        /* renamed from: h  reason: collision with root package name */
        private final TextView f20305h;

        /* renamed from: i  reason: collision with root package name */
        private final TextView f20306i;

        /* renamed from: j  reason: collision with root package name */
        private final ImageView f20307j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ q0 f20308k;

        public a(@NotNull q0 q0Var, View view) {
        }

        public final ImageView c() {
        }

        public final RecyclerView d() {
        }

        public final SimpleDraweeView e() {
        }

        public final TextView f() {
        }

        public final TextView g() {
        }

        public final TextView h() {
        }

        public final TextView i() {
        }

        public final TextView j() {
        }

        public final TextView k() {
        }

        public final TextView l() {
        }
    }

    public q0(@NotNull Context context) {
    }

    public static /* synthetic */ void Q(q0 q0Var, HotelBean hotelBean, View view) {
    }

    private static final void R(q0 q0Var, HotelBean hotelBean, View view) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    public final void S(@Nullable ActDesBean actDesBean, @Nullable HotelTimeCheckBean hotelTimeCheckBean) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }
}
