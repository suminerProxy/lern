package h.u.a.w.c0;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.ShareBean;
import com.showstartfans.activity.view.ShareView;
import h.u.a.w.z;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NewShareDialog.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020\u001dH\u0014J\b\u0010#\u001a\u00020\tH\u0014J\b\u0010$\u001a\u00020\tH\u0014J\u001a\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\u0016\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0019J3\u0010*\u001a\u00020\t2+\u0010+\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010j\u0004\u0018\u0001`\u0015J\u0010\u0010,\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010-\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001dR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0004\u0018\u0001`\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR3\u0010\u000f\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010j\u0004\u0018\u0001`\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/showstartfans/activity/widget/dialog/NewShareDialog;", "Lcom/taihebase/activity/view/bottomsheet/BaseSheetFragment;", "()V", "cancelBtn", "Landroid/widget/TextView;", "eShareType", "Lcom/taihebase/activity/enummodel/EShareType;", "onClickDownloadListener", "Lkotlin/Function0;", "", "Lcom/showstartfans/activity/widget/dialog/OnClickDownloadListener;", "getOnClickDownloadListener", "()Lkotlin/jvm/functions/Function0;", "setOnClickDownloadListener", "(Lkotlin/jvm/functions/Function0;)V", "onItemClickListener", "Lkotlin/Function1;", "Lcom/showstartfans/activity/model/NewShareBean;", "Lkotlin/ParameterName;", "name", "bean", "Lcom/showstartfans/activity/view/OnItemClick;", "parent_s", "Landroid/widget/LinearLayout;", "shareBean", "Lcom/showstartfans/activity/model/ShareBean;", "statusListentr", "Lcom/showstartfans/activity/widget/ShareUtil$OnShareStatusListentr;", TtmlNode.TAG_STYLE, "", "v_line", "Landroid/view/View;", "view_share", "Lcom/showstartfans/activity/view/ShareView;", "getContentView", "initData", "initListener", "initView", "view", "savedInstanceState", "Landroid/os/Bundle;", "setData", "setOnItemClickListener", "itemClickListener", "setOnShareStatusListentr", "setStyle", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class k2 extends h.y.a.o.y.b {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private LinearLayout c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private View f25030d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private ShareBean f25031e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private h.y.a.h.h f25032f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private ShareView f25033g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private TextView f25034h;

    /* renamed from: i  reason: collision with root package name */
    private int f25035i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private z.b f25036j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private Function1<? super h.u.a.o.u, Unit> f25037k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private Function0<Unit> f25038l;

    /* compiled from: NewShareDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/NewShareBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function1<h.u.a.o.u, Unit> {
        public final /* synthetic */ k2 this$0;

        public a(k2 k2Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(h.u.a.o.u uVar) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable h.u.a.o.u uVar) {
        }
    }

    public static final /* synthetic */ Function1 e(k2 k2Var) {
    }

    private static final void g(k2 k2Var, View view) {
    }

    public static /* synthetic */ void h(k2 k2Var, View view) {
    }

    @Override // h.y.a.o.y.b
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.o.y.b
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Nullable
    public final Function0<Unit> f() {
    }

    @Override // h.y.a.o.y.b
    public int getContentView() {
    }

    public final void i(@NotNull h.y.a.h.h hVar, @NotNull ShareBean shareBean) {
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

    public final void j(@Nullable Function0<Unit> function0) {
    }

    public final void k(@Nullable Function1<? super h.u.a.o.u, Unit> function1) {
    }

    public final void l(@Nullable z.b bVar) {
    }

    public final void m(int i2) {
    }

    @Override // h.y.a.o.y.b, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }
}
