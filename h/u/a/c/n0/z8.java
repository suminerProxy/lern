package h.u.a.c.n0;

import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.NftBean;
import com.taihebase.activity.base.BaseNewActivity;
import com.umeng.analytics.pro.am;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NFTTransferringDialog.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001cB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\tH\u0002J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010\u0019\u001a\u00020\tH\u0002J\b\u0010\u001a\u001a\u00020\tH\u0002J\u0006\u0010\u001b\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/NFTTransferringDialog;", "Lcom/taihebase/activity/view/bottomsheet/BaseBottomSheetDialogFragment;", "context", "Landroidx/appcompat/app/AppCompatActivity;", "data", "Lcom/showstartfans/activity/model/NftBean;", "onResult", "Lkotlin/Function1;", "", "", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/showstartfans/activity/model/NftBean;Lkotlin/jvm/functions/Function1;)V", "binding", "Lcom/showstartfans/activity/databinding/DialogNftTransferringBinding;", "isAgree", "", "phoneAutoFillPop", "Lcom/showstartfans/activity/activitys/usercenter/NFTTransferringDialog$PhoneAutoFillPop;", "agreementChanged", "getDialogView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "initView", "next", "phoneChanged", "showPhoneAutoFill", "PhoneAutoFillPop", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class z8 extends h.y.a.o.y.a {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public Map<Integer, View> f19935e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final AppCompatActivity f19936f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private final NftBean f19937g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final Function1<Integer, Unit> f19938h;

    /* renamed from: i  reason: collision with root package name */
    private h.u.a.g.n9 f19939i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f19940j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private b f19941k;

    /* compiled from: NFTTransferringDialog.kt */
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

    /* compiled from: NFTTransferringDialog.kt */
    @Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nR\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/NFTTransferringDialog$PhoneAutoFillPop;", "Landroid/widget/PopupWindow;", "context", "Lcom/taihebase/activity/base/BaseNewActivity;", "phones", "", "", "onResult", "Lkotlin/Function1;", "", "(Lcom/taihebase/activity/base/BaseNewActivity;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "adapter", "com/showstartfans/activity/activitys/usercenter/NFTTransferringDialog$PhoneAutoFillPop$adapter$1", "Lcom/showstartfans/activity/activitys/usercenter/NFTTransferringDialog$PhoneAutoFillPop$adapter$1;", "binding", "Lcom/showstartfans/activity/databinding/DialogNftPhoneAutofillBinding;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends PopupWindow {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private h.u.a.g.k9 f19942a;
        @NotNull
        private final a b;

        /* compiled from: NFTTransferringDialog.kt */
        @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J*\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\bH\u0014¨\u0006\u000f"}, d2 = {"com/showstartfans/activity/activitys/usercenter/NFTTransferringDialog$PhoneAutoFillPop$adapter$1", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "", "onBindViewHolder_impl", "", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "", "original_position", h.a.a.a.a.i.g.C, "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends h.y.a.f.m<String> {

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ BaseNewActivity f19943n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ Function1<String, Unit> f19944o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ b f19945p;

            /* compiled from: NFTTransferringDialog.kt */
            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/showstartfans/activity/activitys/usercenter/NFTTransferringDialog$PhoneAutoFillPop$adapter$1$onCreateViewHolder_impl$1", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
            /* renamed from: h.u.a.c.n0.z8$b$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
            public static final class C0346a extends RecyclerView.ViewHolder {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ TextView f19946a;

                public C0346a(TextView textView) {
                }
            }

            public a(BaseNewActivity baseNewActivity, Function1<? super String, Unit> function1, b bVar) {
            }

            public static /* synthetic */ void Q(Function1 function1, String str, b bVar, View view) {
            }

            private static final void R(Function1 function1, String str, b bVar, View view) {
            }

            @Override // h.y.a.f.m
            @NotNull
            public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
            }

            @Override // h.y.a.f.m
            public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
            }
        }

        public b(@NotNull BaseNewActivity baseNewActivity, @NotNull List<String> list, @NotNull Function1<? super String, Unit> function1) {
        }
    }

    /* compiled from: NFTTransferringDialog.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/usercenter/NFTTransferringDialog$initView$2", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends ClickableSpan {
        public final /* synthetic */ z8 b;

        public c(z8 z8Var) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint textPaint) {
        }
    }

    /* compiled from: NFTTransferringDialog.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/usercenter/NFTTransferringDialog$initView$8", "Landroid/telephony/PhoneNumberFormattingTextWatcher;", "afterTextChanged", "", am.aB, "Landroid/text/Editable;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends PhoneNumberFormattingTextWatcher {
        public final /* synthetic */ z8 b;

        public e(z8 z8Var) {
        }

        @Override // android.telephony.PhoneNumberFormattingTextWatcher, android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
        }
    }

    /* compiled from: NFTTransferringDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ z8 this$0;

        public f(z8 z8Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
        }
    }

    public /* synthetic */ z8(AppCompatActivity appCompatActivity, NftBean nftBean, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static /* synthetic */ void A(z8 z8Var, View view) {
    }

    public static /* synthetic */ void B(z8 z8Var, View view) {
    }

    public static /* synthetic */ void C(z8 z8Var) {
    }

    public static /* synthetic */ void D(z8 z8Var, View view) {
    }

    public static /* synthetic */ void E(z8 z8Var, View view) {
    }

    public static /* synthetic */ void F(z8 z8Var, View view) {
    }

    private final void G() {
    }

    private final void H() {
    }

    private static final void J(z8 z8Var) {
    }

    public static final /* synthetic */ h.u.a.g.n9 h(z8 z8Var) {
    }

    public static final /* synthetic */ AppCompatActivity i(z8 z8Var) {
    }

    public static final /* synthetic */ Function1 j(z8 z8Var) {
    }

    public static final /* synthetic */ void k(z8 z8Var) {
    }

    private final void l() {
    }

    private static final void m(z8 z8Var, View view) {
    }

    private static final void n(z8 z8Var, View view) {
    }

    private static final void q(z8 z8Var, View view) {
    }

    private static final void r(z8 z8Var, View view) {
    }

    private static final void s(z8 z8Var, View view) {
    }

    private static final void u(z8 z8Var, View view) {
    }

    private static final void v(z8 z8Var, View view) {
    }

    private static final void w(z8 z8Var, View view, boolean z) {
    }

    public static /* synthetic */ void x(z8 z8Var, View view, boolean z) {
    }

    public static /* synthetic */ void y(z8 z8Var, View view) {
    }

    public static /* synthetic */ void z(z8 z8Var, View view) {
    }

    public final void I() {
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

    /* compiled from: NFTTransferringDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ z8 this$0;

        public d(z8 z8Var) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Integer num) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        }
    }

    public z8(@NotNull AppCompatActivity appCompatActivity, @Nullable NftBean nftBean, @NotNull Function1<? super Integer, Unit> function1) {
    }
}
