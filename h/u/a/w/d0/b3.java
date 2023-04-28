package h.u.a.w.d0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.activitys.usercenter.TabCouponsSelectNewActivity;
import com.showstartfans.activity.model.FansUserInfoBean;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import com.umeng.analytics.pro.am;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TicketHGiftFriendDialog.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\u001a\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0015J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0019H\u0002J\u0012\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010&\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010'\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/showstartfans/activity/widget/popupwindow/TicketHGiftFriendDialog;", "Lcom/taihebase/activity/view/bottomsheet/BaseSheetFragment;", "()V", "areaCode", "", "clearIcon", "Landroid/widget/ImageView;", "desHtml", "Landroid/widget/TextView;", "giftBtn", "inputView", "Landroid/widget/EditText;", "phoneArea", "readAgreement", "", "selectP", "Lcom/showstartfans/activity/widget/popupwindow/PopAreaCodeSelect;", TabCouponsSelectNewActivity.f6399o, "", "tipsTitle", "userInfoBean", "Lcom/showstartfans/activity/model/FansUserInfoBean;", "xyIcon", "getContentView", "initData", "", "initListener", "initView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "presentServiceTemp", "presentTicket", "phone", "searchData", "setID", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class b3 extends h.y.a.o.y.b {
    @NotNull
    public Map<Integer, View> b;
    private EditText c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f25197d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f25198e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f25199f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f25200g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f25201h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f25202i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private String f25203j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f25204k;

    /* renamed from: l  reason: collision with root package name */
    private int f25205l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private r2 f25206m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private FansUserInfoBean f25207n;

    /* compiled from: TicketHGiftFriendDialog.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/showstartfans/activity/widget/popupwindow/TicketHGiftFriendDialog$initListener$6", "Landroid/view/View$OnKeyListener;", "onKey", "", am.aE, "Landroid/view/View;", "keyCode", "", "event", "Landroid/view/KeyEvent;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements View.OnKeyListener {
        public final /* synthetic */ b3 b;

        public a(b3 b3Var) {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(@Nullable View view, int i2, @Nullable KeyEvent keyEvent) {
        }
    }

    /* compiled from: TicketHGiftFriendDialog.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/showstartfans/activity/widget/popupwindow/TicketHGiftFriendDialog$initListener$7", "Landroid/text/TextWatcher;", "afterTextChanged", "", am.aB, "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", AnimatedPasterJsonConfig.CONFIG_COUNT, TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements TextWatcher {
        public final /* synthetic */ b3 b;

        public b(b3 b3Var) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public static /* synthetic */ void A(b3 b3Var, View view) {
    }

    public static /* synthetic */ void B(b3 b3Var, String str, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void C(b3 b3Var, View view) {
    }

    public static /* synthetic */ void D(b3 b3Var, View view) {
    }

    public static /* synthetic */ void E(b3 b3Var, String str) {
    }

    public static /* synthetic */ void F(b3 b3Var, View view) {
    }

    public static /* synthetic */ void G(b3 b3Var, View view) {
    }

    public static /* synthetic */ void H(b3 b3Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void I(b3 b3Var, View view, String str, int i2) {
    }

    public static /* synthetic */ void J(b3 b3Var, View view) {
    }

    public static /* synthetic */ void K(b3 b3Var, View view) {
    }

    public static /* synthetic */ void L(b3 b3Var, View view) {
    }

    private final void M() {
    }

    private static final void N(b3 b3Var, h.y.a.m.n nVar) {
    }

    private final void O(String str) {
    }

    private static final void P(b3 b3Var, h.y.a.m.n nVar) {
    }

    private final void Q(String str) {
    }

    private static final void R(b3 b3Var, String str, h.y.a.m.n nVar) {
    }

    private static final void S(b3 b3Var, String str) {
    }

    private static final void T(b3 b3Var, String str) {
    }

    public static final /* synthetic */ String e(b3 b3Var) {
    }

    public static final /* synthetic */ ImageView f(b3 b3Var) {
    }

    public static final /* synthetic */ Context g(b3 b3Var) {
    }

    public static final /* synthetic */ TextView h(b3 b3Var) {
    }

    public static final /* synthetic */ EditText i(b3 b3Var) {
    }

    public static final /* synthetic */ TextView j(b3 b3Var) {
    }

    private static final void k(b3 b3Var, View view) {
    }

    private static final void l(b3 b3Var, View view) {
    }

    private static final void m(b3 b3Var, View view) {
    }

    private static final void n(b3 b3Var, View view) {
    }

    private static final void q(b3 b3Var, View view, String str, int i2) {
    }

    private static final void r(b3 b3Var, View view) {
    }

    private static final void s(b3 b3Var, View view) {
    }

    private static final boolean u(b3 b3Var, View view, MotionEvent motionEvent) {
    }

    private static final void v(b3 b3Var, View view) {
    }

    private static final void w(b3 b3Var, View view) {
    }

    public static /* synthetic */ void x(b3 b3Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void y(b3 b3Var, String str) {
    }

    public static /* synthetic */ boolean z(b3 b3Var, View view, MotionEvent motionEvent) {
    }

    public final void U(int i2) {
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
    @SuppressLint({"ClickableViewAccessibility"})
    public void initView(@NotNull View view, @Nullable Bundle bundle) {
    }

    @Override // h.y.a.o.y.b, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
    }
}
