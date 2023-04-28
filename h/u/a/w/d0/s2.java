package h.u.a.w.d0;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.model.SceneDetailCommBean;
import h.u.a.c.f0.b9;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SceneDetailCommReplyDialog.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0003H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001aH\u0014J\u001a\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/showstartfans/activity/widget/popupwindow/SceneDetailCommReplyDialog;", "Lcom/taihebase/activity/view/bottomsheet/BaseSheetFragment;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "bean", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "(ILcom/showstartfans/activity/model/SceneDetailCommBean;)V", "adapter", "Lcom/showstartfans/activity/activitys/maintab/SceneDetailCommReplyAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/maintab/SceneDetailCommReplyAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "commBean", "hiStr", "", "lastMinId", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "getLoadMoreAction", "()Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "loadMoreAction$delegate", "pageNo", h.a.a.a.a.i.g.C, "getContentView", "initData", "", "initListener", "initView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "loadData", "showP", "", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class s2 extends h.y.a.o.y.b {
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f25254d;

    /* renamed from: e  reason: collision with root package name */
    private int f25255e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private String f25256f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private SceneDetailCommBean f25257g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final Lazy f25258h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final Lazy f25259i;

    /* compiled from: SceneDetailCommReplyDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/SceneDetailCommReplyAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<b9> {
        public final /* synthetic */ s2 this$0;

        public a(s2 s2Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ b9 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final b9 invoke() {
        }
    }

    /* compiled from: SceneDetailCommReplyDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<SceneDetailCommBean, Unit> {
        public final /* synthetic */ SceneDetailCommBean $bean;
        public final /* synthetic */ s2 this$0;

        public b(s2 s2Var, SceneDetailCommBean sceneDetailCommBean) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SceneDetailCommBean sceneDetailCommBean) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable SceneDetailCommBean sceneDetailCommBean) {
        }
    }

    /* compiled from: SceneDetailCommReplyDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<h.v.a.d> {
        public static final c INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ h.v.a.d invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final h.v.a.d invoke() {
        }
    }

    public s2(int i2, @NotNull SceneDetailCommBean sceneDetailCommBean) {
    }

    public static final /* synthetic */ b9 e(s2 s2Var) {
    }

    public static final /* synthetic */ SceneDetailCommBean f(s2 s2Var) {
    }

    public static final /* synthetic */ Context g(s2 s2Var) {
    }

    private final h.v.a.d getLoadMoreAction() {
    }

    public static final /* synthetic */ String h(s2 s2Var) {
    }

    public static final /* synthetic */ h.v.a.d i(s2 s2Var) {
    }

    public static final /* synthetic */ int j(s2 s2Var) {
    }

    public static final /* synthetic */ int k(s2 s2Var) {
    }

    public static final /* synthetic */ void l(s2 s2Var, String str) {
    }

    public static final /* synthetic */ void m(s2 s2Var, int i2) {
    }

    private final b9 n() {
    }

    private static final void q(s2 s2Var, View view) {
    }

    private static final void r(s2 s2Var, boolean z) {
    }

    private static final void s(s2 s2Var, View view) {
    }

    public static /* synthetic */ void u(s2 s2Var, View view) {
    }

    public static /* synthetic */ void v(s2 s2Var, boolean z) {
    }

    public static /* synthetic */ void w(s2 s2Var, View view) {
    }

    private final void x(boolean z) {
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

    @Override // h.y.a.o.y.b, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
    }
}
