package com.taihebase.activity.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.constraintlayout.motion.widget.Key;
import com.alipay.sdk.widget.j;
import com.facebook.common.util.UriUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import h.y.a.k.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.svg.SkinSvgImageView;
import skin.support.widget.SkinCompatBackgroundHelper;
import skin.support.widget.SkinCompatSupportable;

/* compiled from: Toolbar.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u000bJ\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0016\u0010#\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bJ \u0010$\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0018\u0010'\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"J \u0010(\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000bJ\u000e\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u000bJ \u0010.\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000bJ\u0016\u0010/\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u001bJ6\u0010/\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000bJ\b\u00105\u001a\u00020\u0019H\u0016J\u0010\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020&H\u0002J\u0012\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u00020\u001dH\u0002J2\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000bH\u0002J\u0006\u0010;\u001a\u00020\u0010J\u0006\u0010<\u001a\u00020\u0000J\u0010\u0010=\u001a\u0004\u0018\u00010\u00102\u0006\u0010 \u001a\u00020\u000bJ\u001a\u0010>\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u001a\u0010?\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\"\u0010@\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010A\u001a\u00020BH\u0002J\"\u0010C\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000b2\b\u0010D\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000bH\u0002J\u0018\u0010E\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0002J\u000e\u0010F\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000bJ\"\u0010G\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000b2\b\u0010D\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000bH\u0002J\u0006\u0010H\u001a\u00020*J\u0006\u0010I\u001a\u00020\u000bJ\u000e\u0010J\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u000bJ\u0018\u0010K\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u000bH\u0002JJ\u0010L\u001a\u00020\u00192\b\b\u0002\u0010M\u001a\u00020\u001d28\u0010N\u001a4\u0012\u0013\u0012\u00110*¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(R\u0012\u0013\u0012\u00110\u001d¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020\u0019\u0018\u00010OJ\b\u0010T\u001a\u00020\u0019H\u0002J\u0006\u0010U\u001a\u00020\u0019J\u0006\u0010V\u001a\u00020\u0019J\u0012\u0010W\u001a\u00020\u00192\b\b\u0001\u0010!\u001a\u00020\u000bH\u0016J\u000e\u0010X\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\u000bJ\u0018\u0010Z\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u001b2\b\b\u0002\u0010[\u001a\u00020\u001dJ\u000e\u0010Z\u001a\u00020\u001b2\u0006\u0010\\\u001a\u00020\u000bJ\u000e\u0010]\u001a\u00020\u00192\u0006\u0010^\u001a\u00020&J\u0010\u0010_\u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\"J\u0010\u0010`\u001a\u00020\u00192\b\u0010N\u001a\u0004\u0018\u00010\u0017J\u000e\u0010a\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u000eJ\u000e\u0010b\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u000bJ\u000e\u0010c\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u000bJ\u000e\u0010d\u001a\u00020\u00192\u0006\u0010e\u001a\u00020\u000bJ\u0010\u0010d\u001a\u00020\u00192\b\u0010e\u001a\u0004\u0018\u00010*J\u000e\u0010f\u001a\u00020\u00192\u0006\u0010g\u001a\u00020&J\u000e\u0010h\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\u000bJ\u000e\u0010i\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\u000bJ\u0006\u0010j\u001a\u00020\u0019J&\u0010k\u001a\u00020\u00192\u0006\u0010l\u001a\u00020\u000b2\u0006\u0010m\u001a\u00020\u000b2\u0006\u0010n\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020\u000bJ\u000e\u0010p\u001a\u00020\u00192\u0006\u0010q\u001a\u00020\u000bJ\u000e\u0010r\u001a\u00020\u00192\u0006\u0010q\u001a\u00020\u000bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006s"}, d2 = {"Lcom/taihebase/activity/widget/Toolbar;", "Landroid/widget/FrameLayout;", "Lskin/support/widget/SkinCompatSupportable;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "context", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backListener", "Lcom/taihebase/activity/listener/OnToolbarBackListener;", "barBackIcon", "Landroid/widget/ImageView;", "barTitle", "Landroid/widget/TextView;", "checkBackgroundColor", "mBackgroundTintHelper", "Lskin/support/widget/SkinCompatBackgroundHelper;", "onBarMenuClick", "Lcom/taihebase/activity/listener/onBarMenuClickListener;", "addCenterView", "", "centerView", "Landroid/view/View;", "isMatch", "", UriUtil.LOCAL_RESOURCE_SCHEME, "addIconMenu", "idIndex", "resId", "Landroid/graphics/drawable/Drawable;", "addIconMenuBySvgImage", "addIconMenuCus", "dpNum", "", "addIconMenuNoPadding", "addNoBgTextMenu", "text", "", "colorId", "addStatusBarHeight", "statusBarHeight", "addTextMenu", "addViewMenu", "view", "topMar", "bottomMar", "leftMar", "rightMar", "applySkin", "dpto", "dp", "getAddMenuParams", "Landroid/widget/LinearLayout$LayoutParams;", "isIcon", "getBackImageView", "getBarRoot", "getIconMenu", "getImageView", "getImageViewNoPadding", "getImageViewPadding", "getMenuContainer", "Landroid/widget/LinearLayout;", "getNoBGTextView", "str", "getSvgImageView", "getTextMenu", "getTextView", "getTitleString", "getToolBackgroundColor", "getViewMenu", "getViewView", "inSearchModel", "needClick", "listener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "content", "clickSearch", "refreshMenu", "removeTitleView", "resetToolBarBg", "setBackgroundResource", "setBgViewColor", "color", "setCustomView", "needClear", "layoutId", "setHeadViewTitleAlpha", Key.ALPHA, "setLeftImageRes", "setOnBarMenuClicklistener", "setOnTopLeftListener", "setStatusView", "setTextColor", j.f843d, "title", "setTitleAlpha", "alp", "setToolBackgroundColor", "setToolBarBgAutoTheme", "setTransparentBg", "setbackPadding", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "visibilityBack", "visibility", "visibilityTitle", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"CustomViewStyleable"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class Toolbar extends FrameLayout implements SkinCompatSupportable {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private SkinCompatBackgroundHelper c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private Context f8212d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final ImageView f8213e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final TextView f8214f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private k f8215g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private h.y.a.k.j f8216h;

    /* renamed from: i  reason: collision with root package name */
    private int f8217i;

    /* compiled from: Toolbar.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "text", "", "clickSearch", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function2<String, Boolean, Unit> {
        public final /* synthetic */ Function2<String, Boolean, Unit> $listener;

        public a(Function2<? super String, ? super Boolean, Unit> function2) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
        }

        public final void invoke(@NotNull String str, boolean z) {
        }
    }

    public /* synthetic */ Toolbar(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    private static final void A(Toolbar toolbar, ImageView imageView, View view) {
    }

    private final TextView B(int i2, String str, int i3) {
    }

    private static final void C(Toolbar toolbar, TextView textView, View view) {
    }

    private final ImageView D(int i2, int i3) {
    }

    private static final void E(Toolbar toolbar, SkinSvgImageView skinSvgImageView, View view) {
    }

    private final TextView G(int i2, String str, int i3) {
    }

    private static final void H(Toolbar toolbar, TextView textView, View view) {
    }

    private final View J(View view, int i2) {
    }

    private static final void K(Toolbar toolbar, View view, View view2) {
    }

    public static /* synthetic */ void M(Toolbar toolbar, boolean z, Function2 function2, int i2, Object obj) {
    }

    public static /* synthetic */ void N(Toolbar toolbar, View view, View view2) {
    }

    public static /* synthetic */ void O(Toolbar toolbar, ImageView imageView, View view) {
    }

    public static /* synthetic */ void P(Toolbar toolbar, TextView textView, View view) {
    }

    public static /* synthetic */ void Q(Toolbar toolbar, ImageView imageView, View view) {
    }

    public static /* synthetic */ void R(Toolbar toolbar, ImageView imageView, View view) {
    }

    public static /* synthetic */ void S(Toolbar toolbar, TextView textView, View view) {
    }

    public static /* synthetic */ void T(Toolbar toolbar, View view) {
    }

    public static /* synthetic */ void U(Toolbar toolbar, SkinSvgImageView skinSvgImageView, View view) {
    }

    private final void V() {
    }

    public static /* synthetic */ void a0(Toolbar toolbar, View view, boolean z, int i2, Object obj) {
    }

    private static final void c(Toolbar toolbar, View view) {
    }

    public static /* synthetic */ void f(Toolbar toolbar, View view, boolean z, int i2, Object obj) {
    }

    private final LinearLayout getMenuContainer() {
    }

    private final int p(float f2) {
    }

    private final LinearLayout.LayoutParams q(boolean z) {
    }

    private final LinearLayout.LayoutParams r(boolean z, int i2, int i3, int i4, int i5) {
    }

    public static /* synthetic */ LinearLayout.LayoutParams s(Toolbar toolbar, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj) {
    }

    public static /* synthetic */ LinearLayout.LayoutParams t(Toolbar toolbar, boolean z, int i2, Object obj) {
    }

    private final ImageView v(int i2, Drawable drawable) {
    }

    private static final void w(Toolbar toolbar, ImageView imageView, View view) {
    }

    private final ImageView x(int i2, Drawable drawable) {
    }

    private static final void y(Toolbar toolbar, ImageView imageView, View view) {
    }

    private final ImageView z(int i2, float f2, Drawable drawable) {
    }

    @NotNull
    public final TextView F(int i2) {
    }

    @NotNull
    public final View I(int i2) {
    }

    public final void L(boolean z, @Nullable Function2<? super String, ? super Boolean, Unit> function2) {
    }

    public final void W() {
    }

    public final void X() {
    }

    @NotNull
    public final View Y(int i2) {
    }

    public final void Z(@NotNull View view, boolean z) {
    }

    public void a() {
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void b0() {
    }

    public final void c0(int i2, int i3, int i4, int i5) {
    }

    public final void d(int i2) {
    }

    public final void d0(int i2) {
    }

    public final void e(@NotNull View view, boolean z) {
    }

    public final void e0(int i2) {
    }

    public final void g(int i2, @Nullable Drawable drawable) {
    }

    @NotNull
    public final ImageView getBackImageView() {
    }

    @NotNull
    public final Toolbar getBarRoot() {
    }

    @NotNull
    public final String getTitleString() {
    }

    public final int getToolBackgroundColor() {
    }

    public final void h(int i2, int i3) {
    }

    public final void i(int i2, float f2, @Nullable Drawable drawable) {
    }

    public final void j(int i2, @Nullable Drawable drawable) {
    }

    public final void k(int i2, @Nullable String str, int i3) {
    }

    public final void l(int i2) {
    }

    public final void m(int i2, @Nullable String str, int i3) {
    }

    public final void n(int i2, @NotNull View view) {
    }

    public final void o(int i2, @NotNull View view, int i3, int i4, int i5, int i6) {
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
    }

    public final void setBgViewColor(int i2) {
    }

    public final void setHeadViewTitleAlpha(float f2) {
    }

    public final void setLeftImageRes(@Nullable Drawable drawable) {
    }

    public final void setOnBarMenuClicklistener(@Nullable k kVar) {
    }

    public final void setOnTopLeftListener(@NotNull h.y.a.k.j jVar) {
    }

    public final void setStatusView(int i2) {
    }

    public final void setTextColor(int i2) {
    }

    public final void setTitle(@Nullable String str) {
    }

    public final void setTitleAlpha(float f2) {
    }

    public final void setToolBackgroundColor(int i2) {
    }

    public final void setToolBarBgAutoTheme(int i2) {
    }

    @Nullable
    public final ImageView u(int i2) {
    }

    public Toolbar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public final void setTitle(int i2) {
    }

    public Toolbar(@NotNull Context context) {
    }

    public Toolbar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
