package h.u.a.h;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.UserInfoBean;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.view.LoadMoreRecyclerView;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import com.umeng.analytics.pro.am;
import com.viewpagerindicator.UnderlinePageIndicator;
import h.u.a.c.w.z1;
import h.y.a.f.m;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AtUserDialog.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010-\u001a\u00020\u001dH\u0016J\u001a\u0010.\u001a\u00020\u001d2\b\u0010\u001b\u001a\u0004\u0018\u00010$2\u0006\u0010/\u001a\u00020\u0016H\u0002J\b\u00100\u001a\u00020\u001dH\u0002J\b\u00101\u001a\u00020\u001dH\u0016J\u0010\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u000204H\u0002J3\u00105\u001a\u00020\u001d2+\u0010\u0017\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0018j\u0004\u0018\u0001`\u001eR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R3\u0010\u0017\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0018j\u0004\u0018\u0001`\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/showstartfans/activity/dialog/AtUserDialog;", "Lcom/taihebase/activity/base/BaseDialog;", "newBaseActivity", "Lcom/taihebase/activity/base/BaseNewActivity;", "(Lcom/taihebase/activity/base/BaseNewActivity;)V", "adapter", "Lcom/showstartfans/activity/adapter/AtUserAdapter;", "et_input", "Landroid/widget/EditText;", "fragments", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/activitys/article/UserListFragment;", "Lkotlin/collections/ArrayList;", "indicator", "Lcom/viewpagerindicator/UnderlinePageIndicator;", "layout_main_dialog", "Landroidx/constraintlayout/widget/ConstraintLayout;", "layout_tab", "Landroid/widget/RelativeLayout;", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "mPage", "", "onItemClick", "Lkotlin/Function1;", "Lcom/showstartfans/activity/model/UserInfoBean;", "Lkotlin/ParameterName;", "name", "bean", "", "Lcom/showstartfans/activity/activitys/article/OnItemClick;", "radioGroup", "Landroid/widget/RadioGroup;", "rv_list", "Lcom/taihebase/activity/view/LoadMoreRecyclerView;", "searchKey", "", "tab_attent", "Landroid/widget/RadioButton;", "tab_fans", "tab_friends", "tv_Cancel", "Landroid/widget/TextView;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "dismiss", "getData", "page", "initListener", "onCreate", "setMode", "isSearch", "", "show", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class h0 extends h.y.a.f.e {
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private Function1<? super UserInfoBean, Unit> f24242d;

    /* renamed from: e  reason: collision with root package name */
    private int f24243e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private h.u.a.d.l0 f24244f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private h.v.a.d f24245g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private String f24246h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final ArrayList<z1> f24247i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private LoadMoreRecyclerView f24248j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private ViewPager f24249k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private UnderlinePageIndicator f24250l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private EditText f24251m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private TextView f24252n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private RadioGroup f24253o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private RadioButton f24254p;
    @Nullable
    private RadioButton q;
    @Nullable
    private RadioButton r;
    @Nullable
    private RelativeLayout s;
    @Nullable
    private ConstraintLayout t;

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", am.aB, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", AnimatedPasterJsonConfig.CONFIG_COUNT, TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements TextWatcher {
        public final /* synthetic */ h0 b;

        public a(h0 h0Var) {
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

    /* compiled from: AtUserDialog.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/dialog/AtUserDialog$initListener$4", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter$OnItemClickListener;", "OnItemClick", "", h.a.a.a.a.i.g.C, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements m.b {
        public final /* synthetic */ h0 b;

        public b(h0 h0Var) {
        }

        @Override // h.y.a.f.m.b
        public void c(int i2) {
        }
    }

    /* compiled from: AtUserDialog.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/dialog/AtUserDialog$initListener$5", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "arg0", "", "onPageScrolled", "arg1", "", "arg2", "onPageSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ h0 b;

        public c(h0 h0Var) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }
    }

    /* compiled from: AtUserDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/UserInfoBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function1<UserInfoBean, Unit> {
        public final /* synthetic */ h0 this$0;

        public d(h0 h0Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserInfoBean userInfoBean) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable UserInfoBean userInfoBean) {
        }
    }

    public h0(@NotNull BaseNewActivity baseNewActivity) {
    }

    public static /* synthetic */ void A(h0 h0Var, RadioGroup radioGroup, int i2) {
    }

    public static /* synthetic */ void B(h0 h0Var, boolean z) {
    }

    public static /* synthetic */ void C(h0 h0Var, View view) {
    }

    public static /* synthetic */ void D(h0 h0Var, int i2, h.y.a.m.n nVar) {
    }

    private final void E(boolean z) {
    }

    public static final /* synthetic */ h.u.a.d.l0 n(h0 h0Var) {
    }

    public static final /* synthetic */ void o(h0 h0Var, String str, int i2) {
    }

    public static final /* synthetic */ Function1 p(h0 h0Var) {
    }

    public static final /* synthetic */ RadioButton q(h0 h0Var) {
    }

    public static final /* synthetic */ RadioButton r(h0 h0Var) {
    }

    public static final /* synthetic */ RadioButton s(h0 h0Var) {
    }

    public static final /* synthetic */ void t(h0 h0Var, boolean z) {
    }

    private final void u(String str, int i2) {
    }

    private static final void v(h0 h0Var, int i2, h.y.a.m.n nVar) {
    }

    private final void w() {
    }

    private static final void x(h0 h0Var, boolean z) {
    }

    private static final void y(h0 h0Var, View view) {
    }

    private static final void z(h0 h0Var, RadioGroup radioGroup, int i2) {
    }

    public final void F(@Nullable Function1<? super UserInfoBean, Unit> function1) {
    }

    @Override // h.y.a.f.e
    public void a() {
    }

    @Override // h.y.a.f.e
    public void g() {
    }
}
