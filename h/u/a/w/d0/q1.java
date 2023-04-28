package h.u.a.w.d0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.fragment.app.FragmentManager;
import com.showstartfans.activity.model.PhoneZoneBean;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AreaCodeSelectDialog.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0006J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0014J\b\u0010\u0019\u001a\u00020\u0017H\u0014J\b\u0010\u001a\u001a\u00020\u0017H\u0014J\u001a\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0006\u0010 \u001a\u00020\u0017J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0006J\u0018\u0010\"\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\u00042\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020\u00172\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\b\u0010*\u001a\u00020\u0006H\u0002J\u0016\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0010J\b\u0010/\u001a\u00020\u0017H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/showstartfans/activity/widget/popupwindow/AreaCodeSelectDialog;", "Lcom/taihebase/activity/view/bottomsheet/BaseSheetFragment;", "()V", "callback", "Lcom/showstartfans/activity/widget/popupwindow/ShareMenuListListener;", "initPosCode", "", "listView", "Landroid/widget/ListView;", "phoneZoneAdapter", "Lcom/showstartfans/activity/widget/popupwindow/PhoneZoneAdapter;", "getPhoneZoneAdapter", "()Lcom/showstartfans/activity/widget/popupwindow/PhoneZoneAdapter;", "phoneZoneAdapter$delegate", "Lkotlin/Lazy;", h.a.a.a.a.i.g.C, "", "getAreaCNByCode", "areaCode", "getAreaCode", "getAreaCodeView", "code", "getCityAreaCode", "", "getContentView", "initData", "initListener", "initView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setChoose", "setChooseAreeCode", "setData", "call", "ctx", "Landroid/content/Context;", "setPhoneZoneBeanList", "beanList", "", "Lcom/showstartfans/activity/model/PhoneZoneBean;", "setPhoneZoneChoosePst", "showDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "poi", "updateSelect", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class q1 extends h.y.a.o.y.b {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private ListView c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f25229d;

    /* renamed from: e  reason: collision with root package name */
    private int f25230e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private w2 f25231f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Lazy f25232g;

    /* compiled from: AreaCodeSelectDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/widget/popupwindow/PhoneZoneAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<q2> {
        public final /* synthetic */ q1 this$0;

        public a(q1 q1Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ q2 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final q2 invoke() {
        }
    }

    public static final /* synthetic */ Context e(q1 q1Var) {
    }

    private final void i() {
    }

    private static final void j(q1 q1Var, h.y.a.m.n nVar) {
    }

    private final q2 k() {
    }

    private static final void l(q1 q1Var, AdapterView adapterView, View view, int i2, long j2) {
    }

    public static /* synthetic */ void m(q1 q1Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void n(q1 q1Var, AdapterView adapterView, View view, int i2, long j2) {
    }

    private final void u(List<? extends PhoneZoneBean> list) {
    }

    private final String v() {
    }

    private final void x() {
    }

    @Override // h.y.a.o.y.b
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.o.y.b
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Nullable
    public final String f(@NotNull String str) {
    }

    @Nullable
    public final String g() {
    }

    @Override // h.y.a.o.y.b
    public int getContentView() {
    }

    @Nullable
    public final String h(@NotNull String str) {
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

    public final void q() {
    }

    public final void r(@NotNull String str) {
    }

    public final void s(@Nullable w2 w2Var, @NotNull Context context) {
    }

    public final void w(@NotNull FragmentManager fragmentManager, int i2) {
    }
}
