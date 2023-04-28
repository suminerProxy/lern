package h.u.a.w.d0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.activitys.usercenter.TabCouponsSelectNewActivity;
import com.showstartfans.activity.model.WalletBean;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TicketBindUserDialog.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\nH\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\b\u0010\u0014\u001a\u00020\u000eH\u0014J\u001a\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\"\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/showstartfans/activity/widget/popupwindow/TicketBindUserDialog;", "Lcom/taihebase/activity/view/bottomsheet/BaseSheetFragment;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/pay/PaymentOrderManAdapter;", "mData", "Lcom/showstartfans/activity/model/WalletBean;", "recycleV", "Landroidx/recyclerview/widget/RecyclerView;", TabCouponsSelectNewActivity.f6399o, "", "ticket_user_type_msg", "Landroid/widget/TextView;", "bindTicket", "", "performerId", "", "getContentView", "getData", "initData", "initListener", "initView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "resultCode", "data", "Landroid/content/Intent;", "setData", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class z2 extends h.y.a.o.y.b {
    @NotNull
    public Map<Integer, View> b;
    private RecyclerView c;

    /* renamed from: d  reason: collision with root package name */
    private int f25315d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private WalletBean f25316e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private TextView f25317f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private h.u.a.c.i0.j0 f25318g;

    private final void e(int i2, String str) {
    }

    private static final void f(z2 z2Var, h.y.a.m.n nVar) {
    }

    private final void g() {
    }

    private static final void h(z2 z2Var, h.y.a.m.n nVar) {
    }

    private static final void i(z2 z2Var, View view) {
    }

    private static final void j(z2 z2Var, View view) {
    }

    public static /* synthetic */ void k(z2 z2Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void l(z2 z2Var, View view) {
    }

    public static /* synthetic */ void m(z2 z2Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void n(z2 z2Var, View view) {
    }

    @Override // h.y.a.o.y.b
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.o.y.b
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.y.a.o.y.b
    public int getContentView() {
    }

    @Override // h.y.a.o.y.b
    public void initData() {
    }

    @Override // h.y.a.o.y.b
    public void initListener() {
    }

    @Override // h.y.a.o.y.b
    public void initView(@NotNull View view, @Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // h.y.a.o.y.b, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    public final void q(@Nullable WalletBean walletBean) {
    }
}
