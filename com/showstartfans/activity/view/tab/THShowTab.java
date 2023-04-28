package com.showstartfans.activity.view.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.taihebase.activity.widget.magicTab.MagicIndicator;
import h.y.a.p.y.k.c.a.c;
import h.y.a.p.y.k.c.a.d;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatBackgroundHelper;
import skin.support.widget.SkinCompatSupportable;

/* compiled from: THShowTab.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J(\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\u0012\u0010\u0018\u001a\u00020\u00102\b\b\u0001\u0010\u0019\u001a\u00020\u000bH\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/showstartfans/activity/view/tab/THShowTab;", "Lcom/taihebase/activity/widget/magicTab/MagicIndicator;", "Lskin/support/widget/SkinCompatSupportable;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "context", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBackgroundTintHelper", "Lskin/support/widget/SkinCompatBackgroundHelper;", "applySkin", "", "bindDataList", "tabTitle", "", "", "listener", "Lkotlin/Function1;", "changeThemeColor", "setBackgroundResource", "resId", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class THShowTab extends MagicIndicator implements SkinCompatSupportable {
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public Map<Integer, View> f7264d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private SkinCompatBackgroundHelper f7265e;

    /* compiled from: THShowTab.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/view/tab/THShowTab$bindDataList$1", "Lcom/taihebase/activity/widget/magicTab/buildins/commonnavigator/abs/CommonNavigatorAdapter;", "getCount", "", "getIndicator", "Lcom/taihebase/activity/widget/magicTab/buildins/commonnavigator/abs/IPagerIndicator;", "context", "Landroid/content/Context;", "getTitleView", "Lcom/taihebase/activity/widget/magicTab/buildins/commonnavigator/abs/IPagerTitleView;", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends h.y.a.p.y.k.c.a.a {
        public final /* synthetic */ List<String> b;
        public final /* synthetic */ Function1<Integer, Unit> c;

        public a(List<String> list, Function1<? super Integer, Unit> function1) {
        }

        private static final void i(Function1 function1, int i2, View view) {
        }

        public static /* synthetic */ void j(Function1 function1, int i2, View view) {
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

    public /* synthetic */ THShowTab(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    private final void g() {
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
    }

    public void d() {
    }

    @Nullable
    public View e(int i2) {
    }

    public final void f(@NotNull List<String> list, @NotNull Function1<? super Integer, Unit> function1) {
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
    }

    public THShowTab(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public THShowTab(@NotNull Context context) {
    }

    public THShowTab(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
