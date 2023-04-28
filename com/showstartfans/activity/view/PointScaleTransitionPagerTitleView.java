package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.taihebase.activity.widget.magicTab.buildins.commonnavigator.titles.ScaleTransitionPagerTitleView;
import h.y.a.p.y.k.c.a.d;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatFrameLayout;

/* compiled from: PointScaleTransitionPagerTitleView.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0016J(\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J(\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0019J\u000e\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/showstartfans/activity/view/PointScaleTransitionPagerTitleView;", "Lskin/support/widget/SkinCompatFrameLayout;", "Lcom/taihebase/activity/widget/magicTab/buildins/commonnavigator/abs/IPagerTitleView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ivPoint", "Landroid/widget/ImageView;", "vTitleView", "Lcom/taihebase/activity/widget/magicTab/buildins/commonnavigator/titles/ScaleTransitionPagerTitleView;", "applySkin", "", "onDeselected", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "totalCount", "onEnter", "enterPercent", "", "leftToRight", "", "onLeave", "leavePercent", "onSelected", "setShowPoint", "show", "setText", "text", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class PointScaleTransitionPagerTitleView extends SkinCompatFrameLayout implements d {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private ScaleTransitionPagerTitleView c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private ImageView f6900d;

    public PointScaleTransitionPagerTitleView(@NotNull Context context) {
    }

    @Override // h.y.a.p.y.k.c.a.d
    public void a(int i2, int i3) {
    }

    @Override // skin.support.widget.SkinCompatFrameLayout, skin.support.widget.SkinCompatSupportable
    public void applySkin() {
    }

    @Override // h.y.a.p.y.k.c.a.d
    public void b(int i2, int i3, float f2, boolean z) {
    }

    @Override // h.y.a.p.y.k.c.a.d
    public void c(int i2, int i3) {
    }

    @Override // h.y.a.p.y.k.c.a.d
    public void d(int i2, int i3, float f2, boolean z) {
    }

    public void e() {
    }

    @Nullable
    public View f(int i2) {
    }

    public final void setShowPoint(boolean z) {
    }

    public final void setText(@NotNull String str) {
    }

    public PointScaleTransitionPagerTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public PointScaleTransitionPagerTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
