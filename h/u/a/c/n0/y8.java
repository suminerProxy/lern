package h.u.a.c.n0;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.showstartfans.activity.model.FansUserInfoBean;
import com.taihebase.activity.base.BaseNewActivity;
import h.u.a.g.o9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NFTTransferringConfirmDialog.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\nH\u0014J\u0012\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\nH\u0002J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0014R\u001a\u0010\f\u001a\u00020\rX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/NFTTransferringConfirmDialog;", "Landroid/app/Dialog;", "context", "Lcom/taihebase/activity/base/BaseNewActivity;", "nftId", "", "phone", "onResult", "Lkotlin/Function1;", "", "", "(Lcom/taihebase/activity/base/BaseNewActivity;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "binding", "Lcom/showstartfans/activity/databinding/DialogNftTransferringConfirmBinding;", "getBinding", "()Lcom/showstartfans/activity/databinding/DialogNftTransferringConfirmBinding;", "setBinding", "(Lcom/showstartfans/activity/databinding/DialogNftTransferringConfirmBinding;)V", "exitsUser", "user", "Lcom/showstartfans/activity/model/FansUserInfoBean;", "notUser", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "searchData", "transferring", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class y8 extends Dialog {
    @NotNull
    private final BaseNewActivity b;
    @NotNull
    private final String c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final String f19930d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Function1<Integer, Unit> f19931e;

    /* renamed from: f  reason: collision with root package name */
    public o9 f19932f;

    /* compiled from: NFTTransferringConfirmDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function1<Integer, Unit> {
        public static final a INSTANCE = null;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Integer num) {
        }
    }

    public /* synthetic */ y8(BaseNewActivity baseNewActivity, String str, String str2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
    }

    private static final void b(y8 y8Var, FansUserInfoBean fansUserInfoBean, View view) {
    }

    public static /* synthetic */ void d(y8 y8Var, View view) {
    }

    public static /* synthetic */ void e(y8 y8Var, FansUserInfoBean fansUserInfoBean, View view) {
    }

    public static /* synthetic */ void f(y8 y8Var, FansUserInfoBean fansUserInfoBean, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void g(y8 y8Var, h.y.a.m.n nVar) {
    }

    private static final void i(y8 y8Var, View view) {
    }

    private final void j() {
    }

    private static final void k(y8 y8Var, h.y.a.m.n nVar) {
    }

    private static final void n(y8 y8Var, FansUserInfoBean fansUserInfoBean, h.y.a.m.n nVar) {
    }

    public void a(@NotNull FansUserInfoBean fansUserInfoBean) {
    }

    @NotNull
    public final o9 c() {
    }

    public void h() {
    }

    public final void l(@NotNull o9 o9Var) {
    }

    public void m(@NotNull FansUserInfoBean fansUserInfoBean) {
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
    }

    public y8(@NotNull BaseNewActivity baseNewActivity, @NotNull String str, @NotNull String str2, @NotNull Function1<? super Integer, Unit> function1) {
    }
}
