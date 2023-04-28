package h.u.a.h;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.showstartfans.activity.model.GroupNoticeBean;
import com.showstartfans.activity.view.GroupNoticeView;
import com.taihebase.activity.base.BaseNewActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GroupNoticeDialog.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\u001c\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u001a\u0010 \u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/showstartfans/activity/dialog/GroupNoticeDialog;", "Lcom/taihebase/activity/base/BaseDialog;", "newBaseActivity", "Lcom/taihebase/activity/base/BaseNewActivity;", "(Lcom/taihebase/activity/base/BaseNewActivity;)V", "groupId", "", "isConfirmed", "", "layout_main", "Landroid/widget/LinearLayout;", "noticeId", "onClickDialogSure", "Lkotlin/Function0;", "", "Lcom/showstartfans/activity/dialog/OnClickDialogSure;", "getOnClickDialogSure", "()Lkotlin/jvm/functions/Function0;", "setOnClickDialogSure", "(Lkotlin/jvm/functions/Function0;)V", "tvAleardlyNum", "Landroid/widget/TextView;", "tvSure", "viewGroupNotice", "Lcom/showstartfans/activity/view/GroupNoticeView;", "confirm", "getData", "onCreate", "setConfirmUI", "setData", "data", "Lcom/showstartfans/activity/model/GroupNoticeBean;", "show", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class n0 extends h.y.a.f.e {
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private Function0<Unit> f24280d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private GroupNoticeView f24281e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private TextView f24282f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private TextView f24283g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private LinearLayout f24284h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f24285i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private String f24286j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private String f24287k;

    /* compiled from: GroupNoticeDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/taihebase/activity/network/Result;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function1<h.y.a.m.n, Unit> {
        public final /* synthetic */ n0 this$0;

        public a(n0 n0Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(h.y.a.m.n nVar) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull h.y.a.m.n nVar) {
        }
    }

    public n0(@NotNull BaseNewActivity baseNewActivity) {
    }

    public static final /* synthetic */ void n(n0 n0Var, boolean z) {
    }

    private final void o() {
    }

    private final void p(String str, String str2) {
    }

    private static final void q(n0 n0Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void s(n0 n0Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void t(n0 n0Var, View view) {
    }

    private static final void u(n0 n0Var, View view) {
    }

    private final void v(boolean z) {
    }

    @Override // h.y.a.f.e
    public void g() {
    }

    @Nullable
    public final Function0<Unit> r() {
    }

    public final void w(@Nullable GroupNoticeBean groupNoticeBean) {
    }

    public final void x(@Nullable Function0<Unit> function0) {
    }

    public final void y(@Nullable String str, @Nullable String str2) {
    }
}
