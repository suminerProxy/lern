package com.showstartfans.activity.activitys.maintab;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.showstartfans.activity.model.home.HomeHeadClassChildBean;
import com.showstartfans.activity.model.home.HomeHeadClassSortTypeBean;
import com.showstartfans.activity.model.home.HomeHeadClassTimeTypeBean;
import com.showstartfans.activity.model.home.HomeHeadClassificationBean;
import com.showstartfans.activity.model.home.ShowStylesBean;
import com.tencent.qcloud.tuicore.TUIConstants;
import h.u.a.c.f0.v9.f4;
import h.u.a.w.d0.j2;
import h.u.a.w.d0.k2;
import h.u.a.w.d0.l2;
import h.u.a.w.d0.m2;
import h.u.a.w.d0.n2;
import h.u.a.w.d0.t1;
import h.u.a.w.d0.u1;
import h.u.a.w.d0.v1;
import h.u.a.w.d0.w1;
import h.u.a.w.d0.x1;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatBackgroundHelper;
import skin.support.widget.SkinCompatSupportable;

/* compiled from: HomeTypeScreenView.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0011\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001b\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB#\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010=\u001a\u00020>H\u0016J$\u0010?\u001a\u00020>2\b\u0010@\u001a\u0004\u0018\u00010\u00122\b\u0010A\u001a\u0004\u0018\u00010\u00192\b\u0010B\u001a\u0004\u0018\u00010CJ\u0006\u0010D\u001a\u00020>J\b\u0010E\u001a\u00020>H\u0002J\u000e\u0010F\u001a\u00020>2\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010G\u001a\u00020>2\b\u0010B\u001a\u0004\u0018\u00010HH\u0016J\b\u0010I\u001a\u00020>H\u0016J\u0012\u0010J\u001a\u00020>2\b\u0010B\u001a\u0004\u0018\u00010KH\u0016J\b\u0010L\u001a\u00020>H\u0016J\u001c\u0010M\u001a\u00020>2\b\u0010N\u001a\u0004\u0018\u00010K2\b\u0010O\u001a\u0004\u0018\u00010KH\u0016J\b\u0010P\u001a\u00020>H\u0016J\u0012\u0010Q\u001a\u00020>2\b\u0010B\u001a\u0004\u0018\u00010RH\u0016J\b\u0010S\u001a\u00020>H\u0016J\u0012\u0010T\u001a\u00020>2\b\u0010B\u001a\u0004\u0018\u00010UH\u0016J\b\u0010V\u001a\u00020>H\u0016J\u0006\u0010W\u001a\u00020>J\u001a\u0010X\u001a\u00020>2\b\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010[\u001a\u00020\u0014H\u0002J\u0010\u0010\\\u001a\u00020>2\u0006\u0010[\u001a\u00020\u0014H\u0002J,\u0010]\u001a\u00020>2\b\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020_2\b\b\u0002\u0010a\u001a\u00020bH\u0002R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010 \u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001f\u001a\u0004\b0\u00101R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u001f\u001a\u0004\b5\u00106R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006c"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/HomeTypeScreenView;", "Landroid/widget/HorizontalScrollView;", "Lcom/showstartfans/activity/widget/popupwindow/OnSearchTypeTagCall;", "Lcom/showstartfans/activity/widget/popupwindow/OnSearchTypeClassCall;", "Lcom/showstartfans/activity/widget/popupwindow/OnSearchTypeScaleCall;", "Lcom/showstartfans/activity/widget/popupwindow/OnSearchTimeClassCall;", "Lcom/showstartfans/activity/widget/popupwindow/OnSearchTypeMoreCall;", "Lskin/support/widget/SkinCompatSupportable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "appBar", "Lcom/google/android/material/appbar/AppBarLayout;", "barOpenStatus", "", "clickPoi", "endTime", "", "fragmentInstance", "Lcom/showstartfans/activity/activitys/maintab/newmain/TabHomeShowFragment;", "morePop", "Lcom/showstartfans/activity/widget/popupwindow/HomeSearchMorePop;", "getMorePop", "()Lcom/showstartfans/activity/widget/popupwindow/HomeSearchMorePop;", "morePop$delegate", "Lkotlin/Lazy;", "morePriceKey", "moreSaleKey", "scaleId", "scaleIn", "searchScalePop", "Lcom/showstartfans/activity/widget/popupwindow/HomeSearchScalePop;", "getSearchScalePop", "()Lcom/showstartfans/activity/widget/popupwindow/HomeSearchScalePop;", "searchScalePop$delegate", "searchSortPop", "Lcom/showstartfans/activity/widget/popupwindow/HomeSearchSortPop;", "getSearchSortPop", "()Lcom/showstartfans/activity/widget/popupwindow/HomeSearchSortPop;", "searchSortPop$delegate", "searchStylePop", "Lcom/showstartfans/activity/widget/popupwindow/HomeSearchStylePop;", "getSearchStylePop", "()Lcom/showstartfans/activity/widget/popupwindow/HomeSearchStylePop;", "searchStylePop$delegate", "searchTimePop", "Lcom/showstartfans/activity/widget/popupwindow/HomeSearchTimePop;", "getSearchTimePop", "()Lcom/showstartfans/activity/widget/popupwindow/HomeSearchTimePop;", "searchTimePop$delegate", "skinCompatBackgroundHelper", "Lskin/support/widget/SkinCompatBackgroundHelper;", "sortKey", "startTime", "styleKey", "applySkin", "", "bindData", "appBarLayout", "frag", "bean", "Lcom/showstartfans/activity/model/home/HomeHeadClassificationBean;", "hidePop", TUIConstants.TUIChat.NOTICE, "noticeBarOpenStatus", "onSearchTimeClassCall", "Lcom/showstartfans/activity/model/home/HomeHeadClassTimeTypeBean;", "onSearchTimeClassCallDismiss", "onSearchTypeClassCall", "Lcom/showstartfans/activity/model/home/HomeHeadClassSortTypeBean;", "onSearchTypeClassCallDismiss", "onSearchTypeMoreCall", "saleSituation", "price", "onSearchTypeMoreCallDismiss", "onSearchTypeScaleCall", "Lcom/showstartfans/activity/model/home/HomeHeadClassChildBean;", "onSearchTypeScaleCallDismiss", "onSearchTypeTagCall", "Lcom/showstartfans/activity/model/home/ShowStylesBean;", "onSearchTypeTagCallDismiss", "resetALLKey", "setSearchStyle", "view", "Landroid/widget/TextView;", "defaultStyle", "showBG", "viewAnimY", "start", "", "end", "duration", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HomeTypeScreenView extends HorizontalScrollView implements n2, k2, m2, j2, l2, SkinCompatSupportable {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private SkinCompatBackgroundHelper c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5787d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5788e;

    /* renamed from: f  reason: collision with root package name */
    private int f5789f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private String f5790g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private String f5791h;

    /* renamed from: i  reason: collision with root package name */
    private int f5792i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private String f5793j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private String f5794k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private String f5795l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private String f5796m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private AppBarLayout f5797n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private f4 f5798o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    private final Lazy f5799p;
    @NotNull
    private final Lazy q;
    @NotNull
    private final Lazy r;
    @NotNull
    private final Lazy s;
    @NotNull
    private final Lazy t;

    /* compiled from: HomeTypeScreenView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/widget/popupwindow/HomeSearchMorePop;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<t1> {
        public final /* synthetic */ HomeTypeScreenView this$0;

        public a(HomeTypeScreenView homeTypeScreenView) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ t1 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final t1 invoke() {
        }
    }

    /* compiled from: HomeTypeScreenView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/widget/popupwindow/HomeSearchScalePop;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<u1> {
        public final /* synthetic */ HomeTypeScreenView this$0;

        public b(HomeTypeScreenView homeTypeScreenView) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ u1 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final u1 invoke() {
        }
    }

    /* compiled from: HomeTypeScreenView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/widget/popupwindow/HomeSearchSortPop;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<v1> {
        public final /* synthetic */ HomeTypeScreenView this$0;

        public c(HomeTypeScreenView homeTypeScreenView) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ v1 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final v1 invoke() {
        }
    }

    /* compiled from: HomeTypeScreenView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/widget/popupwindow/HomeSearchStylePop;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<w1> {
        public final /* synthetic */ HomeTypeScreenView this$0;

        public d(HomeTypeScreenView homeTypeScreenView) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ w1 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final w1 invoke() {
        }
    }

    /* compiled from: HomeTypeScreenView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/widget/popupwindow/HomeSearchTimePop;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function0<x1> {
        public final /* synthetic */ HomeTypeScreenView this$0;

        public e(HomeTypeScreenView homeTypeScreenView) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ x1 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final x1 invoke() {
        }
    }

    public HomeTypeScreenView(@Nullable Context context) {
    }

    public static /* synthetic */ void A(HomeTypeScreenView homeTypeScreenView) {
    }

    public static /* synthetic */ void B(HomeTypeScreenView homeTypeScreenView) {
    }

    public static /* synthetic */ void C(HomeTypeScreenView homeTypeScreenView, View view) {
    }

    public static /* synthetic */ void D(HomeTypeScreenView homeTypeScreenView) {
    }

    private static final void E(HomeTypeScreenView homeTypeScreenView) {
    }

    private static final void F(HomeTypeScreenView homeTypeScreenView) {
    }

    private static final void G(HomeTypeScreenView homeTypeScreenView) {
    }

    private static final void H(HomeTypeScreenView homeTypeScreenView) {
    }

    private static final void I(HomeTypeScreenView homeTypeScreenView) {
    }

    private final void J() {
    }

    private final void M(TextView textView, boolean z) {
    }

    private final void N(boolean z) {
    }

    private final void O(TextView textView, float f2, float f3, long j2) {
    }

    public static /* synthetic */ void P(HomeTypeScreenView homeTypeScreenView, TextView textView, float f2, float f3, long j2, int i2, Object obj) {
    }

    private static final void Q(TextView textView, ValueAnimator valueAnimator) {
    }

    private final t1 getMorePop() {
    }

    private final u1 getSearchScalePop() {
    }

    private final v1 getSearchSortPop() {
    }

    private final w1 getSearchStylePop() {
    }

    private final x1 getSearchTimePop() {
    }

    private static final void m(HomeTypeScreenView homeTypeScreenView, View view) {
    }

    private static final void n(HomeTypeScreenView homeTypeScreenView, View view) {
    }

    private static final void o(HomeTypeScreenView homeTypeScreenView, View view) {
    }

    private static final void p(HomeTypeScreenView homeTypeScreenView, View view) {
    }

    private static final void q(HomeTypeScreenView homeTypeScreenView, View view) {
    }

    public static /* synthetic */ void t(HomeTypeScreenView homeTypeScreenView) {
    }

    public static /* synthetic */ void u(HomeTypeScreenView homeTypeScreenView, View view) {
    }

    public static /* synthetic */ void v(HomeTypeScreenView homeTypeScreenView, View view) {
    }

    public static /* synthetic */ void w(HomeTypeScreenView homeTypeScreenView) {
    }

    public static /* synthetic */ void x(HomeTypeScreenView homeTypeScreenView, View view) {
    }

    public static /* synthetic */ void y(HomeTypeScreenView homeTypeScreenView, View view) {
    }

    public static /* synthetic */ void z(TextView textView, ValueAnimator valueAnimator) {
    }

    public final void K(boolean z) {
    }

    public final void L() {
    }

    @Override // h.u.a.w.d0.k2
    public void a() {
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
    }

    @Override // h.u.a.w.d0.n2
    public void b() {
    }

    @Override // h.u.a.w.d0.n2
    public void c(@Nullable ShowStylesBean showStylesBean) {
    }

    @Override // h.u.a.w.d0.l2
    public void d() {
    }

    @Override // h.u.a.w.d0.m2
    public void e(@Nullable HomeHeadClassChildBean homeHeadClassChildBean) {
    }

    @Override // h.u.a.w.d0.j2
    public void f() {
    }

    @Override // h.u.a.w.d0.j2
    public void g(@Nullable HomeHeadClassTimeTypeBean homeHeadClassTimeTypeBean) {
    }

    @Override // h.u.a.w.d0.k2
    public void h(@Nullable HomeHeadClassSortTypeBean homeHeadClassSortTypeBean) {
    }

    @Override // h.u.a.w.d0.l2
    public void i(@Nullable HomeHeadClassSortTypeBean homeHeadClassSortTypeBean, @Nullable HomeHeadClassSortTypeBean homeHeadClassSortTypeBean2) {
    }

    @Override // h.u.a.w.d0.m2
    public void j() {
    }

    public void k() {
    }

    @Nullable
    public View l(int i2) {
    }

    public final void r(@Nullable AppBarLayout appBarLayout, @Nullable f4 f4Var, @Nullable HomeHeadClassificationBean homeHeadClassificationBean) {
    }

    public final void s() {
    }

    public HomeTypeScreenView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public HomeTypeScreenView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
