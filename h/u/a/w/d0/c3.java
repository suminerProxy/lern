package h.u.a.w.d0;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.model.VideoDetailCommBean;
import h.u.a.c.f0.r9;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoDetailCommDialog.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0019\u001a\u00020\u0003H\u0014J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u001bH\u0014J\b\u0010 \u001a\u00020\u001bH\u0014J\u001a\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)H\u0016R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/showstartfans/activity/widget/popupwindow/VideoDetailCommDialog;", "Lcom/taihebase/activity/view/bottomsheet/BaseSheetFragment;", "videoDetailIds", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "bean", "Lcom/showstartfans/activity/model/VideoDetailCommBean;", "(IILcom/showstartfans/activity/model/VideoDetailCommBean;)V", "adapter", "Lcom/showstartfans/activity/activitys/maintab/VideoDetailCommReplayDialogAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/maintab/VideoDetailCommReplayDialogAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "commBean", "hiStr", "", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "getLoadMoreAction", "()Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "loadMoreAction$delegate", "pageNo", h.a.a.a.a.i.g.C, "videoDetailId", "getContentView", "getVideoComm", "", "mainCommId", "showP", "", "initData", "initListener", "initView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "loadData", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class c3 extends h.y.a.o.y.b {
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f25209d;

    /* renamed from: e  reason: collision with root package name */
    private int f25210e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private String f25211f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private VideoDetailCommBean f25212g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final Lazy f25213h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final Lazy f25214i;

    /* compiled from: VideoDetailCommDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/VideoDetailCommReplayDialogAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<r9> {
        public final /* synthetic */ c3 this$0;

        public a(c3 c3Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ r9 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final r9 invoke() {
        }
    }

    /* compiled from: VideoDetailCommDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/showstartfans/activity/model/VideoDetailCommBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<List<? extends VideoDetailCommBean>, Unit> {
        public final /* synthetic */ c3 this$0;

        public b(c3 c3Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends VideoDetailCommBean> list) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable List<? extends VideoDetailCommBean> list) {
        }
    }

    /* compiled from: VideoDetailCommDialog.kt */
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

    public c3(int i2, int i3, @NotNull VideoDetailCommBean videoDetailCommBean) {
    }

    public static final /* synthetic */ r9 e(c3 c3Var) {
    }

    public static final /* synthetic */ Context f(c3 c3Var) {
    }

    public static final /* synthetic */ String g(c3 c3Var) {
    }

    private final h.v.a.d getLoadMoreAction() {
    }

    public static final /* synthetic */ h.v.a.d h(c3 c3Var) {
    }

    public static final /* synthetic */ int i(c3 c3Var) {
    }

    public static final /* synthetic */ int j(c3 c3Var) {
    }

    public static final /* synthetic */ void k(c3 c3Var, String str) {
    }

    private final r9 l() {
    }

    private static final void n(c3 c3Var, View view) {
    }

    private static final void q(c3 c3Var, boolean z) {
    }

    private static final void r(c3 c3Var, View view) {
    }

    public static /* synthetic */ void s(c3 c3Var, View view) {
    }

    public static /* synthetic */ void u(c3 c3Var, boolean z) {
    }

    public static /* synthetic */ void v(c3 c3Var, View view) {
    }

    private final void w(boolean z) {
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

    public final void m(@NotNull String str, boolean z) {
    }

    @Override // h.y.a.o.y.b, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
    }
}
