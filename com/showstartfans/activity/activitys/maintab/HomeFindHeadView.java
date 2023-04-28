package com.showstartfans.activity.activitys.maintab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.DrawableRes;
import com.showstartfans.activity.model.FindBean;
import h.u.a.c.f0.u9.j0;
import h.u.a.c.f0.u9.l0;
import h.u.a.c.f0.u9.o0;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatBackgroundHelper;
import skin.support.widget.SkinCompatSupportable;

/* compiled from: HomeFindHeadView.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"J\b\u0010#\u001a\u0004\u0018\u00010$J\b\u0010%\u001a\u00020\u001fH\u0002J\u0012\u0010&\u001a\u00020\u001f2\b\b\u0001\u0010'\u001a\u00020\nH\u0016R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/HomeFindHeadView;", "Landroid/widget/RelativeLayout;", "Lskin/support/widget/SkinCompatSupportable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "activityAdapter", "Lcom/showstartfans/activity/activitys/maintab/findview/ShareActivityAdapter;", "getActivityAdapter", "()Lcom/showstartfans/activity/activitys/maintab/findview/ShareActivityAdapter;", "activityAdapter$delegate", "Lkotlin/Lazy;", "fansAdapter", "Lcom/showstartfans/activity/activitys/maintab/findview/ListFanAdatper;", "getFansAdapter", "()Lcom/showstartfans/activity/activitys/maintab/findview/ListFanAdatper;", "fansAdapter$delegate", "groupInfoAdapter", "Lcom/showstartfans/activity/activitys/maintab/findview/FindRecommendedAdapter;", "getGroupInfoAdapter", "()Lcom/showstartfans/activity/activitys/maintab/findview/FindRecommendedAdapter;", "groupInfoAdapter$delegate", "mBackgroundTintHelper", "Lskin/support/widget/SkinCompatBackgroundHelper;", "applySkin", "", "bindHomeHeadData", "bean", "Lcom/showstartfans/activity/model/FindBean;", "getFirstHeadView", "Landroid/view/View;", "listener", "setBackgroundResource", "resId", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HomeFindHeadView extends RelativeLayout implements SkinCompatSupportable {
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private final Lazy c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f5782d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f5783e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private SkinCompatBackgroundHelper f5784f;

    /* compiled from: HomeFindHeadView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/findview/ShareActivityAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<o0> {
        public final /* synthetic */ Context $context;

        public a(Context context) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ o0 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final o0 invoke() {
        }
    }

    /* compiled from: HomeFindHeadView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/findview/ListFanAdatper;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<l0> {
        public final /* synthetic */ Context $context;

        public b(Context context) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ l0 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final l0 invoke() {
        }
    }

    /* compiled from: HomeFindHeadView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/findview/FindRecommendedAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<j0> {
        public final /* synthetic */ Context $context;

        public c(Context context) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ j0 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final j0 invoke() {
        }
    }

    public /* synthetic */ HomeFindHeadView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    private static final void d(HomeFindHeadView homeFindHeadView, List list, int i2) {
    }

    private static final void e(FindBean findBean, HomeFindHeadView homeFindHeadView) {
    }

    public static /* synthetic */ void f(HomeFindHeadView homeFindHeadView, View view) {
    }

    public static /* synthetic */ void g(FindBean findBean, HomeFindHeadView homeFindHeadView) {
    }

    private final o0 getActivityAdapter() {
    }

    private final l0 getFansAdapter() {
    }

    private final j0 getGroupInfoAdapter() {
    }

    public static /* synthetic */ void h(HomeFindHeadView homeFindHeadView, View view) {
    }

    public static /* synthetic */ void i(HomeFindHeadView homeFindHeadView, List list, int i2) {
    }

    public static /* synthetic */ void j(HomeFindHeadView homeFindHeadView, View view) {
    }

    private final void k() {
    }

    private static final void l(HomeFindHeadView homeFindHeadView, View view) {
    }

    private static final void m(HomeFindHeadView homeFindHeadView, View view) {
    }

    private static final void n(HomeFindHeadView homeFindHeadView, View view) {
    }

    public void a() {
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void c(@Nullable FindBean findBean) {
    }

    @Nullable
    public final View getFirstHeadView() {
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
    }

    public HomeFindHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public HomeFindHeadView(@NotNull Context context) {
    }

    public HomeFindHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
