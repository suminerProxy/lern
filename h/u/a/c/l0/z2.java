package h.u.a.c.l0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBinding;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.goodsmodel.ShoppingCartBean;
import h.u.a.g.o8;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AfterChooseBottomSheetDialog.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u0005H\u0015J\b\u0010\u000e\u001a\u00020\u0005H\u0014J\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/AfterChooseBottomSheetDialog;", "Lcom/taihebase/activity/view/bottomsheet/BaseSheetFragment;", "callback", "Lkotlin/Function1;", "Lcom/showstartfans/activity/model/goodsmodel/ShoppingCartBean;", "", "(Lkotlin/jvm/functions/Function1;)V", "binding", "Lcom/showstartfans/activity/databinding/DialogAfterChooseBinding;", "goodList", "", "getContentViewBinding", "Landroidx/viewbinding/ViewBinding;", "initData", "initListener", "initView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class z2 extends h.y.a.o.y.b {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public static final a f19551f = null;
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private final Function1<ShoppingCartBean, Unit> c;

    /* renamed from: d  reason: collision with root package name */
    private o8 f19552d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private List<? extends ShoppingCartBean> f19553e;

    /* compiled from: AfterChooseBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00040\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/AfterChooseBottomSheetDialog$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "manager", "Landroidx/fragment/app/FragmentManager;", "goodList", "", "Lcom/showstartfans/activity/model/goodsmodel/ShoppingCartBean;", "callback", "Lkotlin/Function1;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@NotNull FragmentManager fragmentManager, @NotNull List<? extends ShoppingCartBean> list, @NotNull Function1<? super ShoppingCartBean, Unit> function1) {
        }
    }

    public z2(@NotNull Function1<? super ShoppingCartBean, Unit> function1) {
    }

    private static final void e(z2 z2Var, View view) {
    }

    private static final void f(z2 z2Var, View view) {
    }

    public static /* synthetic */ void g(z2 z2Var, View view) {
    }

    public static /* synthetic */ void h(z2 z2Var, View view) {
    }

    @Override // h.y.a.o.y.b
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.o.y.b
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.y.a.o.y.b
    @NotNull
    public ViewBinding getContentViewBinding() {
    }

    @Override // h.y.a.o.y.b
    @SuppressLint({"ResourceType"})
    public void initData() {
    }

    @Override // h.y.a.o.y.b
    public void initListener() {
    }

    @Override // h.y.a.o.y.b
    public void initView(@NotNull View view, @Nullable Bundle bundle) {
    }

    @Override // h.y.a.o.y.b, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }
}
