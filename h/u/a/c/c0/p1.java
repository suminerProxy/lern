package h.u.a.c.c0;

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
import com.taihebase.activity.base.BaseNewActivity;
import com.umeng.analytics.pro.am;
import h.u.a.g.k9;
import h.u.a.g.x8;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GroupAddManagerDialog.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0017B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u0007H\u0002J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0002J\u0006\u0010\u0016\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/showstartfans/activity/activitys/group/GroupAddManagerDialog;", "Lcom/taihebase/activity/view/bottomsheet/BaseBottomSheetDialogFragment;", "context", "Landroidx/appcompat/app/AppCompatActivity;", "onResult", "Lkotlin/Function1;", "", "", "(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;)V", "binding", "Lcom/showstartfans/activity/databinding/DialogGroupAddManagerBinding;", "phoneAutoFillPop", "Lcom/showstartfans/activity/activitys/group/GroupAddManagerDialog$PhoneAutoFillPop;", "checkConfirm", "getDialogView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "initView", "phoneChanged", "showPhoneAutoFill", "PhoneAutoFillPop", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class p1 extends h.y.a.o.y.a {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public Map<Integer, View> f18093e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final AppCompatActivity f18094f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Function1<Integer, Unit> f18095g;

    /* renamed from: h  reason: collision with root package name */
    private x8 f18096h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private b f18097i;

    /* compiled from: GroupAddManagerDialog.kt */
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

    /* compiled from: GroupAddManagerDialog.kt */
    @Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nR\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/showstartfans/activity/activitys/group/GroupAddManagerDialog$PhoneAutoFillPop;", "Landroid/widget/PopupWindow;", "context", "Lcom/taihebase/activity/base/BaseNewActivity;", "phones", "", "", "onResult", "Lkotlin/Function1;", "", "(Lcom/taihebase/activity/base/BaseNewActivity;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "adapter", "com/showstartfans/activity/activitys/group/GroupAddManagerDialog$PhoneAutoFillPop$adapter$1", "Lcom/showstartfans/activity/activitys/group/GroupAddManagerDialog$PhoneAutoFillPop$adapter$1;", "binding", "Lcom/showstartfans/activity/databinding/DialogNftPhoneAutofillBinding;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends PopupWindow {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private k9 f18098a;
        @NotNull
        private final a b;

        /* compiled from: GroupAddManagerDialog.kt */
        @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J*\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\bH\u0014¨\u0006\u000f"}, d2 = {"com/showstartfans/activity/activitys/group/GroupAddManagerDialog$PhoneAutoFillPop$adapter$1", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "", "onBindViewHolder_impl", "", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "", "original_position", h.a.a.a.a.i.g.C, "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends h.y.a.f.m<String> {

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ BaseNewActivity f18099n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ Function1<String, Unit> f18100o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ b f18101p;

            /* compiled from: GroupAddManagerDialog.kt */
            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/showstartfans/activity/activitys/group/GroupAddManagerDialog$PhoneAutoFillPop$adapter$1$onCreateViewHolder_impl$1", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
            /* renamed from: h.u.a.c.c0.p1$b$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
            public static final class C0344a extends RecyclerView.ViewHolder {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ TextView f18102a;

                public C0344a(TextView textView) {
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

    /* compiled from: GroupAddManagerDialog.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/group/GroupAddManagerDialog$initView$2", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends ClickableSpan {
        public final /* synthetic */ p1 b;

        public c(p1 p1Var) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint textPaint) {
        }
    }

    /* compiled from: GroupAddManagerDialog.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/group/GroupAddManagerDialog$initView$6", "Landroid/telephony/PhoneNumberFormattingTextWatcher;", "afterTextChanged", "", am.aB, "Landroid/text/Editable;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends PhoneNumberFormattingTextWatcher {
        public final /* synthetic */ p1 b;

        public e(p1 p1Var) {
        }

        @Override // android.telephony.PhoneNumberFormattingTextWatcher, android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
        }
    }

    /* compiled from: GroupAddManagerDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ p1 this$0;

        public f(p1 p1Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
        }
    }

    public /* synthetic */ p1(AppCompatActivity appCompatActivity, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static final /* synthetic */ x8 h(p1 p1Var) {
    }

    public static final /* synthetic */ AppCompatActivity i(p1 p1Var) {
    }

    public static final /* synthetic */ Function1 j(p1 p1Var) {
    }

    public static final /* synthetic */ void k(p1 p1Var) {
    }

    private final void l() {
    }

    private static final void m(p1 p1Var, View view) {
    }

    private static final void n(p1 p1Var, View view) {
    }

    private static final void q(p1 p1Var, View view) {
    }

    private static final void r(p1 p1Var, View view) {
    }

    public static /* synthetic */ void s(p1 p1Var, View view) {
    }

    public static /* synthetic */ void u(p1 p1Var, View view) {
    }

    public static /* synthetic */ void v(p1 p1Var, View view) {
    }

    public static /* synthetic */ void w(p1 p1Var, View view) {
    }

    private final void x() {
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

    public final void y() {
    }

    /* compiled from: GroupAddManagerDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ p1 this$0;

        public d(p1 p1Var) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Integer num) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        }
    }

    public p1(@NotNull AppCompatActivity appCompatActivity, @NotNull Function1<? super Integer, Unit> function1) {
    }
}
