package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.showstartfans.activity.model.Article;
import com.taihebase.activity.widget.indicator.AutoHideInkPageIndicator2;
import h.a.a.a.a.i.g;
import h.u.a.c.l0.i3;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImmersionTuWenView.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\"\u001a\u00020\tH\u0016J\b\u0010#\u001a\u00020\u001fH\u0014J\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020\u001fH\u0016J\b\u0010'\u001a\u00020\u001fH\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001a\u0010\u0011R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/showstartfans/activity/view/ImmersionTuWenView;", "Lcom/showstartfans/activity/view/BaseImmersionView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "indicator", "Lcom/taihebase/activity/widget/indicator/AutoHideInkPageIndicator2;", "mData", "Lcom/showstartfans/activity/model/Article;", "screenHeight", "getScreenHeight", "()I", "screenHeight$delegate", "Lkotlin/Lazy;", "screenRatio", "", "getScreenRatio", "()F", "screenRatio$delegate", "screenWidth", "getScreenWidth", "screenWidth$delegate", "vp_viewpager", "Landroidx/viewpager/widget/ViewPager;", "OnBindViewHolder_", "", g.C, "data", "getLayoutId", "initView", "isViewPagerScrollEnd", "", "onPageHide", "onSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ImmersionTuWenView extends BaseImmersionView {
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public Map<Integer, View> f6763d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f6764e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f6765f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Lazy f6766g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private ViewPager f6767h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private AutoHideInkPageIndicator2 f6768i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private Article f6769j;

    /* compiled from: ImmersionTuWenView.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/view/ImmersionTuWenView$OnBindViewHolder_$1", "Lcom/showstartfans/activity/activitys/profile/OnRecycleItemDoubleClick;", "onItemDoubleClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements i3 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImmersionTuWenView f6770a;

        public a(ImmersionTuWenView immersionTuWenView) {
        }

        @Override // h.u.a.c.l0.i3
        public void a() {
        }
    }

    /* compiled from: ImmersionTuWenView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<Integer> {
        public final /* synthetic */ ImmersionTuWenView this$0;

        public b(ImmersionTuWenView immersionTuWenView) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    /* compiled from: ImmersionTuWenView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Float> {
        public final /* synthetic */ ImmersionTuWenView this$0;

        public c(ImmersionTuWenView immersionTuWenView) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Float invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Float invoke() {
        }
    }

    /* compiled from: ImmersionTuWenView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<Integer> {
        public final /* synthetic */ ImmersionTuWenView this$0;

        public d(ImmersionTuWenView immersionTuWenView) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    public ImmersionTuWenView(@Nullable Context context) {
    }

    private final int getScreenHeight() {
    }

    private final float getScreenRatio() {
    }

    private final int getScreenWidth() {
    }

    public static final /* synthetic */ int s(ImmersionTuWenView immersionTuWenView) {
    }

    public static final /* synthetic */ int t(ImmersionTuWenView immersionTuWenView) {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void f(int i2, @Nullable Article article) {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void g() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public int getLayoutId() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    @Nullable
    public View h(int i2) {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void i() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void p() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void r() {
    }

    public final boolean u() {
    }

    public ImmersionTuWenView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public ImmersionTuWenView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
