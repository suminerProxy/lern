package h.u.a.h;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.HotelBean;
import com.showstartfans.activity.model.HotelRoomBean;
import com.showstartfans.activity.model.HotelTimeCheckBean;
import com.showstartfans.activity.model.actdes.ActDesBean;
import h.u.a.g.b9;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HotelRoomDialog.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/showstartfans/activity/dialog/HotelRoomDialog;", "Lcom/taihebase/activity/view/bottomsheet/BaseBottomSheetDialogFragment;", "act", "Landroidx/appcompat/app/AppCompatActivity;", "fromActDesBean", "Lcom/showstartfans/activity/model/actdes/ActDesBean;", "mData", "Lcom/showstartfans/activity/model/HotelBean;", "mRoom", "Lcom/showstartfans/activity/model/HotelRoomBean;", "checkTimeCheckBean", "Lcom/showstartfans/activity/model/HotelTimeCheckBean;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/showstartfans/activity/model/actdes/ActDesBean;Lcom/showstartfans/activity/model/HotelBean;Lcom/showstartfans/activity/model/HotelRoomBean;Lcom/showstartfans/activity/model/HotelTimeCheckBean;)V", "adapterVpPhoto", "Lcom/showstartfans/activity/adapter/HotelRoomPhotoAdapter;", "getAdapterVpPhoto", "()Lcom/showstartfans/activity/adapter/HotelRoomPhotoAdapter;", "adapterVpPhoto$delegate", "Lkotlin/Lazy;", "binding", "Lcom/showstartfans/activity/databinding/DialogHotelRoomBinding;", "mTimeCheckBean", "getDialogView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "initData", "", "initView", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class p0 extends h.y.a.o.y.a {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public Map<Integer, View> f24288e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private ActDesBean f24289f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private HotelBean f24290g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private HotelRoomBean f24291h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private HotelTimeCheckBean f24292i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private final Lazy f24293j;

    /* renamed from: k  reason: collision with root package name */
    private b9 f24294k;

    /* compiled from: HotelRoomDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/adapter/HotelRoomPhotoAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<h.u.a.d.x0> {
        public final /* synthetic */ p0 this$0;

        public a(p0 p0Var) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.u.a.d.x0 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.u.a.d.x0 invoke() {
        }
    }

    /* compiled from: HotelRoomDialog.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/dialog/HotelRoomDialog$initView$2", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", h.a.a.a.a.i.g.C, "positionOffset", "", "positionOffsetPixels", "onPageSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ p0 b;

        public b(p0 p0Var) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }
    }

    public p0(@NotNull AppCompatActivity appCompatActivity, @Nullable ActDesBean actDesBean, @Nullable HotelBean hotelBean, @Nullable HotelRoomBean hotelRoomBean, @Nullable HotelTimeCheckBean hotelTimeCheckBean) {
    }

    public static final /* synthetic */ h.u.a.d.x0 h(p0 p0Var) {
    }

    public static final /* synthetic */ b9 i(p0 p0Var) {
    }

    private final void initData() {
    }

    public static final /* synthetic */ Context j(p0 p0Var) {
    }

    private final h.u.a.d.x0 k() {
    }

    private static final void l(p0 p0Var, View view) {
    }

    public static /* synthetic */ void m(p0 p0Var, View view) {
    }

    @Override // h.y.a.o.y.a
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.o.y.a
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.y.a.o.y.a
    @Nullable
    public View f(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
    }

    @Override // h.y.a.o.y.a
    public void initView() {
    }

    @Override // h.y.a.o.y.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }
}
