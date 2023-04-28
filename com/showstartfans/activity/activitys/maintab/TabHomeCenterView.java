package com.showstartfans.activity.activitys.maintab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.material.appbar.AppBarLayout;
import com.showstartfans.activity.model.home.HomeHeadClassificationBean;
import h.a.a.a.a.i.g;
import h.u.a.c.f0.v9.f4;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatFrameLayout;

/* compiled from: TabHomeCenterView.kt */
@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u000e\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\tH\u0002J\u0006\u0010\u001d\u001a\u00020\u0018J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u0018J4\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/TabHomeCenterView;", "Lskin/support/widget/SkinCompatFrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "callBack", "com/showstartfans/activity/activitys/maintab/TabHomeCenterView$callBack$1", "Lcom/showstartfans/activity/activitys/maintab/TabHomeCenterView$callBack$1;", "frag", "Lcom/showstartfans/activity/activitys/maintab/newmain/TabHomeShowFragment;", "layout_parent", "Landroid/widget/FrameLayout;", "mDatas", "", "Lcom/showstartfans/activity/model/home/HomeHeadClassificationBean;", "addItem", "", "bean", "applySkin", "checkPage", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "hidePop", "noticeBarOpenStatus", "barOpenStatus", "", "resetALLKey", "setViewPager", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "datas", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class TabHomeCenterView extends SkinCompatFrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private FrameLayout c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private List<? extends HomeHeadClassificationBean> f5866d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private AppBarLayout f5867e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private f4 f5868f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final a f5869g;

    /* compiled from: TabHomeCenterView.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/maintab/TabHomeCenterView$callBack$1", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageSelected", "", g.C, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TabHomeCenterView f5870a;

        public a(TabHomeCenterView tabHomeCenterView) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i2) {
        }
    }

    public TabHomeCenterView(@NotNull Context context) {
    }

    public static final /* synthetic */ void g(TabHomeCenterView tabHomeCenterView, int i2) {
    }

    private final void i(int i2) {
    }

    @Override // skin.support.widget.SkinCompatFrameLayout, skin.support.widget.SkinCompatSupportable
    public void applySkin() {
    }

    public void e() {
    }

    @Nullable
    public View f(int i2) {
    }

    public final void h(@Nullable HomeHeadClassificationBean homeHeadClassificationBean) {
    }

    public final void j() {
    }

    public final void k(boolean z) {
    }

    public final void l() {
    }

    public final void m(@Nullable ViewPager2 viewPager2, @Nullable List<? extends HomeHeadClassificationBean> list, @Nullable AppBarLayout appBarLayout, @Nullable f4 f4Var) {
    }

    public TabHomeCenterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public TabHomeCenterView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
