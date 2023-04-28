package h.u.a.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.model.HotelBean;
import com.showstartfans.activity.model.HotelRoomBean;
import com.showstartfans.activity.model.HotelTimeCheckBean;
import com.showstartfans.activity.model.actdes.ActDesBean;
import com.taihebase.activity.widget.NonScrollListView;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HotelRoomAdapter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J*\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0014J\u001a\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0011H\u0014J$\u0010\u0018\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/showstartfans/activity/adapter/HotelRoomAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/model/HotelRoomBean;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "fromActDesBean", "Lcom/showstartfans/activity/model/actdes/ActDesBean;", "mData", "Lcom/showstartfans/activity/model/HotelBean;", "mTimeCheckBean", "Lcom/showstartfans/activity/model/HotelTimeCheckBean;", "onBindViewHolder_impl", "", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "", "original_position", "real_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "hotel", "checkTimeCheckBean", "ViewHodler", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class v0 extends h.y.a.f.m<HotelRoomBean> {
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private ActDesBean f20327n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private HotelBean f20328o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private HotelTimeCheckBean f20329p;

    /* compiled from: HotelRoomAdapter.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0019\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00110\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u00150\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00190\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\n \u0007*\u0004\u0018\u00010\u00190\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u001e\u001a\n \u0007*\u0004\u0018\u00010\u00190\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0019\u0010 \u001a\n \u0007*\u0004\u0018\u00010\u00190\u0019¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0019\u0010\"\u001a\n \u0007*\u0004\u0018\u00010\u00190\u0019¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0019\u0010$\u001a\n \u0007*\u0004\u0018\u00010\u00190\u0019¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0019\u0010&\u001a\n \u0007*\u0004\u0018\u00010\u00190\u0019¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001b¨\u0006("}, d2 = {"Lcom/showstartfans/activity/adapter/HotelRoomAdapter$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/adapter/HotelRoomAdapter;Landroid/view/View;)V", "layoutMoreIcon", "Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "getLayoutMoreIcon", "()Landroid/widget/FrameLayout;", "layout_Top", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getLayout_Top", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "layout_bottom", "getLayout_bottom", "list_extend", "Lcom/taihebase/activity/widget/NonScrollListView;", "getList_extend", "()Lcom/taihebase/activity/widget/NonScrollListView;", "sdv_conver", "Lcom/facebook/drawee/view/SimpleDraweeView;", "getSdv_conver", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "tvDing", "Landroid/widget/TextView;", "getTvDing", "()Landroid/widget/TextView;", "tvPhotoNum", "getTvPhotoNum", "tv_Price", "getTv_Price", "tv_dingman", "getTv_dingman", "tv_info", "getTv_info", "tv_tag", "getTv_tag", "tv_title", "getTv_title", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final SimpleDraweeView f20330a;
        private final ConstraintLayout b;
        private final FrameLayout c;

        /* renamed from: d  reason: collision with root package name */
        private final NonScrollListView f20331d;

        /* renamed from: e  reason: collision with root package name */
        private final TextView f20332e;

        /* renamed from: f  reason: collision with root package name */
        private final TextView f20333f;

        /* renamed from: g  reason: collision with root package name */
        private final TextView f20334g;

        /* renamed from: h  reason: collision with root package name */
        private final TextView f20335h;

        /* renamed from: i  reason: collision with root package name */
        private final FrameLayout f20336i;

        /* renamed from: j  reason: collision with root package name */
        private final TextView f20337j;

        /* renamed from: k  reason: collision with root package name */
        private final TextView f20338k;

        /* renamed from: l  reason: collision with root package name */
        private final TextView f20339l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ v0 f20340m;

        public a(@NotNull v0 v0Var, View view) {
        }

        public final FrameLayout c() {
        }

        public final ConstraintLayout d() {
        }

        public final FrameLayout e() {
        }

        public final NonScrollListView f() {
        }

        public final SimpleDraweeView g() {
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

        public final TextView m() {
        }

        public final TextView n() {
        }
    }

    public v0(@NotNull Context context) {
    }

    public static /* synthetic */ void Q(HotelRoomBean hotelRoomBean, v0 v0Var, View view) {
    }

    public static /* synthetic */ void R(Ref.BooleanRef booleanRef, a aVar, v0 v0Var, HotelRoomBean hotelRoomBean, View view) {
    }

    private static final void S(Ref.BooleanRef booleanRef, a aVar, v0 v0Var, HotelRoomBean hotelRoomBean, View view) {
    }

    private static final void T(HotelRoomBean hotelRoomBean, v0 v0Var, View view) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    public final void U(@Nullable ActDesBean actDesBean, @Nullable HotelBean hotelBean, @Nullable HotelTimeCheckBean hotelTimeCheckBean) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }
}
