package com.taihebase.activity.widget.magicTab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.baidu.platform.comapi.map.MapBundleKey;
import h.y.a.p.y.k.c.a.c;
import h.y.a.p.y.k.c.a.d;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatBackgroundHelper;
import skin.support.widget.SkinCompatSupportable;

/* compiled from: THMagicTab.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010 \u001a\u00020!H\u0016J\u001c\u0010\"\u001a\u00020!2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0013\u001a\u00020\u0014J\u001c\u0010\"\u001a\u00020!2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0013\u001a\u00020#J\b\u0010$\u001a\u00020!H\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000bH\u0014J\u0012\u0010(\u001a\u00020!2\b\b\u0001\u0010)\u001a\u00020\u000bH\u0016R\u001a\u0010\r\u001a\u00020\u000eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006*"}, d2 = {"Lcom/taihebase/activity/widget/magicTab/THMagicTab;", "Lcom/taihebase/activity/widget/magicTab/MagicIndicator;", "Lskin/support/widget/SkinCompatSupportable;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "context", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBackgroundTintHelper", "Lskin/support/widget/SkinCompatBackgroundHelper;", "getMBackgroundTintHelper", "()Lskin/support/widget/SkinCompatBackgroundHelper;", "setMBackgroundTintHelper", "(Lskin/support/widget/SkinCompatBackgroundHelper;)V", "mViewPager", "Landroidx/viewpager/widget/ViewPager;", "getMViewPager", "()Landroidx/viewpager/widget/ViewPager;", "setMViewPager", "(Landroidx/viewpager/widget/ViewPager;)V", "tabTitle", "Ljava/util/ArrayList;", "", "getTabTitle", "()Ljava/util/ArrayList;", "setTabTitle", "(Ljava/util/ArrayList;)V", "applySkin", "", "bindDataList", "Landroidx/viewpager2/widget/ViewPager2;", "changeThemeColor", "getTabView", "Lcom/taihebase/activity/widget/magicTab/buildins/commonnavigator/abs/IPagerTitleView;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "setBackgroundResource", "resId", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class THMagicTab extends MagicIndicator implements SkinCompatSupportable {
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public Map<Integer, View> f8307d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private ViewPager f8308e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<String> f8309f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private SkinCompatBackgroundHelper f8310g;

    /* compiled from: THMagicTab.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/taihebase/activity/widget/magicTab/THMagicTab$bindDataList$1", "Lcom/taihebase/activity/widget/magicTab/buildins/commonnavigator/abs/CommonNavigatorAdapter;", "getCount", "", "getIndicator", "Lcom/taihebase/activity/widget/magicTab/buildins/commonnavigator/abs/IPagerIndicator;", "context", "Landroid/content/Context;", "getTitleView", "Lcom/taihebase/activity/widget/magicTab/buildins/commonnavigator/abs/IPagerTitleView;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends h.y.a.p.y.k.c.a.a {
        public final /* synthetic */ ArrayList<String> b;
        public final /* synthetic */ THMagicTab c;

        public a(ArrayList<String> arrayList, THMagicTab tHMagicTab) {
        }

        @Override // h.y.a.p.y.k.c.a.a
        public int a() {
        }

        @Override // h.y.a.p.y.k.c.a.a
        @Nullable
        public c b(@NotNull Context context) {
        }

        @Override // h.y.a.p.y.k.c.a.a
        @NotNull
        public d c(@NotNull Context context, int i2) {
        }
    }

    /* compiled from: THMagicTab.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/taihebase/activity/widget/magicTab/THMagicTab$bindDataList$2", "Lcom/taihebase/activity/widget/magicTab/buildins/commonnavigator/abs/CommonNavigatorAdapter;", "getCount", "", "getIndicator", "Lcom/taihebase/activity/widget/magicTab/buildins/commonnavigator/abs/IPagerIndicator;", "context", "Landroid/content/Context;", "getTitleView", "Lcom/taihebase/activity/widget/magicTab/buildins/commonnavigator/abs/IPagerTitleView;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends h.y.a.p.y.k.c.a.a {
        public final /* synthetic */ ArrayList<String> b;
        public final /* synthetic */ THMagicTab c;

        public b(ArrayList<String> arrayList, THMagicTab tHMagicTab) {
        }

        @Override // h.y.a.p.y.k.c.a.a
        public int a() {
        }

        @Override // h.y.a.p.y.k.c.a.a
        @Nullable
        public c b(@NotNull Context context) {
        }

        @Override // h.y.a.p.y.k.c.a.a
        @NotNull
        public d c(@NotNull Context context, int i2) {
        }
    }

    public THMagicTab(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    private final void h() {
    }

    private static final void j(THMagicTab tHMagicTab, int i2, View view) {
    }

    public static /* synthetic */ void k(THMagicTab tHMagicTab, int i2, View view) {
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
    }

    public void d() {
    }

    @Nullable
    public View e(int i2) {
    }

    public final void f(@NotNull ArrayList<String> arrayList, @NotNull ViewPager viewPager) {
    }

    public final void g(@NotNull ArrayList<String> arrayList, @NotNull ViewPager2 viewPager2) {
    }

    @NotNull
    public final SkinCompatBackgroundHelper getMBackgroundTintHelper() {
    }

    @Nullable
    public final ViewPager getMViewPager() {
    }

    @Nullable
    public final ArrayList<String> getTabTitle() {
    }

    @NotNull
    public d i(int i2) {
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
    }

    public final void setMBackgroundTintHelper(@NotNull SkinCompatBackgroundHelper skinCompatBackgroundHelper) {
    }

    public final void setMViewPager(@Nullable ViewPager viewPager) {
    }

    public final void setTabTitle(@Nullable ArrayList<String> arrayList) {
    }

    public /* synthetic */ THMagicTab(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public THMagicTab(@NotNull Context context) {
    }

    public THMagicTab(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
