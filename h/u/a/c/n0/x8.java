package h.u.a.c.n0;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.model.AddressBean;
import com.showstartfans.activity.model.NftBean;
import com.taihebase.activity.base.BaseNewActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NFTTransactionDialog.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\fJ\b\u0010\u0012\u001a\u00020\u000bH\u0002J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\"\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u000bH\u0002J\b\u0010!\u001a\u00020\u000bH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/NFTTransactionDialog;", "Lcom/taihebase/activity/view/bottomsheet/BaseBottomSheetDialogFragment;", "context", "Lcom/taihebase/activity/base/BaseNewActivity;", "data", "Lcom/showstartfans/activity/model/NftBean;", h.a.a.a.a.i.g.C, "", "onResult", "Lkotlin/Function1;", "", "", "(Lcom/taihebase/activity/base/BaseNewActivity;Lcom/showstartfans/activity/model/NftBean;ILkotlin/jvm/functions/Function1;)V", "binding", "Lcom/showstartfans/activity/databinding/DialogNftTransactionBinding;", "requestForSelectAddress", "selectAddress", "Lcom/showstartfans/activity/model/AddressBean;", "getDefaultAddressInfo", "getDialogView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "initAddressData", "temp", "initView", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "transaction", "update", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class x8 extends h.y.a.o.y.a {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public Map<Integer, View> f19919e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final BaseNewActivity f19920f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private final NftBean f19921g;

    /* renamed from: h  reason: collision with root package name */
    private final int f19922h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final Function1<Boolean, Unit> f19923i;

    /* renamed from: j  reason: collision with root package name */
    private final int f19924j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private AddressBean f19925k;

    /* renamed from: l  reason: collision with root package name */
    private h.u.a.g.m9 f19926l;

    /* compiled from: NFTTransactionDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function1<Boolean, Unit> {
        public static final a INSTANCE = null;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    public /* synthetic */ x8(BaseNewActivity baseNewActivity, NftBean nftBean, int i2, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    private final void h() {
    }

    private static final void i(x8 x8Var, h.y.a.m.n nVar) {
    }

    private final void j(AddressBean addressBean) {
    }

    private static final void k(x8 x8Var, View view) {
    }

    private static final void l(x8 x8Var, View view) {
    }

    private static final void m(x8 x8Var, View view) {
    }

    private static final void n(x8 x8Var, View view) {
    }

    public static /* synthetic */ void q(x8 x8Var, View view) {
    }

    public static /* synthetic */ void r(x8 x8Var, View view) {
    }

    public static /* synthetic */ void s(x8 x8Var, View view) {
    }

    public static /* synthetic */ void u(x8 x8Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void v(x8 x8Var, View view) {
    }

    public static /* synthetic */ void w(x8 x8Var, h.y.a.m.n nVar) {
    }

    private final void x() {
    }

    private static final void y(x8 x8Var, h.y.a.m.n nVar) {
    }

    private final void z() {
    }

    @Override // h.y.a.o.y.a
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.o.y.a
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.y.a.o.y.a
    @NotNull
    public View f(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
    }

    @Override // h.y.a.o.y.a
    public void initView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // h.y.a.o.y.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    public x8(@NotNull BaseNewActivity baseNewActivity, @Nullable NftBean nftBean, int i2, @NotNull Function1<? super Boolean, Unit> function1) {
    }
}
