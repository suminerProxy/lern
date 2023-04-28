package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.showstartfans.activity.manager.PhotoWallPhotoBean;
import com.showstartfans.activity.model.goodsmodel.ShoppingCartBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShopMiniBarView.kt */
@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006*\u0001(\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u000fJ\b\u00103\u001a\u000201H\u0002J\b\u00104\u001a\u000201H\u0002J\b\u00105\u001a\u000201H\u0014J\u0006\u00106\u001a\u000201J\u0016\u00107\u001a\u0002012\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u000109J\u0018\u0010:\u001a\u0002012\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020\tH\u0002J\u0018\u0010=\u001a\u0002012\u0006\u0010>\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u0010\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0004\n\u0002\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/showstartfans/activity/view/ShopMiniBarView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "activityId", "", "checkDatas", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/manager/PhotoWallPhotoBean;", "Lkotlin/collections/ArrayList;", "checkNum", "image_shopping", "Landroid/widget/ImageView;", "isCheckPage", "", "()Z", "setCheckPage", "(Z)V", "isInPhotoBrowing", "isLogined", "layou_price", "Landroid/widget/LinearLayout;", "layout_shopCart", "onClickAddtoCartListener", "Landroid/view/View$OnClickListener;", "getOnClickAddtoCartListener", "()Landroid/view/View$OnClickListener;", "setOnClickAddtoCartListener", "(Landroid/view/View$OnClickListener;)V", "onClickBuyOnceListener", "getOnClickBuyOnceListener", "setOnClickBuyOnceListener", "onDataChangeListener", "com/showstartfans/activity/view/ShopMiniBarView$onDataChangeListener$1", "Lcom/showstartfans/activity/view/ShopMiniBarView$onDataChangeListener$1;", "shopNum", "Landroid/widget/TextView;", "tvPrice", "tv_add_to_shopcart", "tv_buy_one", "tv_getPhoto", "addOnce", "", "data", "checkView", "initListener", "onDetachedFromWindow", "onResume", "setCheckData", "datas", "", "setInPhotoBrowing", "setShopNum", "num", "setShow", "show", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ShopMiniBarView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private String c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private View.OnClickListener f6999d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private View.OnClickListener f7000e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7001f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7002g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private FrameLayout f7003h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private TextView f7004i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private TextView f7005j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private LinearLayout f7006k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private TextView f7007l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private TextView f7008m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private TextView f7009n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private ImageView f7010o;

    /* renamed from: p  reason: collision with root package name */
    private int f7011p;
    @NotNull
    private final ArrayList<PhotoWallPhotoBean> q;
    private boolean r;
    @NotNull
    private final a s;

    /* compiled from: ShopMiniBarView.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002t\u00122\u00120\u0012\u0004\u0012\u00020\u00030\u0002j\u0017\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u00122\u00120\u0012\u0004\u0012\u00020\b0\u0002j\u0017\u0012\u0004\u0012\u00020\b`\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0001j\u0002`\u000bJ9\u0010\f\u001a\u00020\n2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0002j\b\u0012\u0004\u0012\u00020\b`\u0004H\u0096\u0002¨\u0006\r"}, d2 = {"com/showstartfans/activity/view/ShopMiniBarView$onDataChangeListener$1", "Lkotlin/Function2;", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/model/goodsmodel/ShoppingCartBean;", "Lkotlin/collections/ArrayList;", "Lkotlin/ParameterName;", "name", "shopData", "Lcom/showstartfans/activity/manager/PhotoWallPhotoBean;", "photo", "", "Lcom/showstartfans/activity/manager/OnDataChangeListener;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Function2<ArrayList<ShoppingCartBean>, ArrayList<PhotoWallPhotoBean>, Unit> {
        public final /* synthetic */ ShopMiniBarView b;

        public a(ShopMiniBarView shopMiniBarView) {
        }

        public void a(@NotNull ArrayList<ShoppingCartBean> arrayList, @NotNull ArrayList<PhotoWallPhotoBean> arrayList2) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(ArrayList<ShoppingCartBean> arrayList, ArrayList<PhotoWallPhotoBean> arrayList2) {
        }
    }

    public ShopMiniBarView(@NotNull Context context) {
    }

    private final void d() {
    }

    private final void e() {
    }

    private static final void f(ShopMiniBarView shopMiniBarView, View view) {
    }

    private static final void g(ShopMiniBarView shopMiniBarView, View view) {
    }

    private static final void h(ShopMiniBarView shopMiniBarView, View view) {
    }

    private static final void i(ShopMiniBarView shopMiniBarView, View view) {
    }

    public static /* synthetic */ void k(ShopMiniBarView shopMiniBarView, View view) {
    }

    public static /* synthetic */ void l(ShopMiniBarView shopMiniBarView, View view) {
    }

    public static /* synthetic */ void m(ShopMiniBarView shopMiniBarView, View view) {
    }

    public static /* synthetic */ void n(ShopMiniBarView shopMiniBarView, View view) {
    }

    private final void setShopNum(int i2) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void c(@Nullable PhotoWallPhotoBean photoWallPhotoBean) {
    }

    @Nullable
    public final View.OnClickListener getOnClickAddtoCartListener() {
    }

    @Nullable
    public final View.OnClickListener getOnClickBuyOnceListener() {
    }

    public final boolean j() {
    }

    public final void o() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    public final void p(boolean z, @Nullable String str) {
    }

    public final void q(boolean z, @Nullable String str) {
    }

    public final void setCheckData(@Nullable List<PhotoWallPhotoBean> list) {
    }

    public final void setCheckPage(boolean z) {
    }

    public final void setOnClickAddtoCartListener(@Nullable View.OnClickListener onClickListener) {
    }

    public final void setOnClickBuyOnceListener(@Nullable View.OnClickListener onClickListener) {
    }

    public ShopMiniBarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ShopMiniBarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
