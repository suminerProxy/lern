package com.taihebase.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.recyclerview.widget.RecyclerView;
import h.a.a.a.a.i.g;
import h.v.a.e.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatBackgroundHelper;
import skin.support.widget.SkinCompatSupportable;

/* compiled from: LoadMoreRecyclerView.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eJ\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eJ\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000bJ\u0006\u0010 \u001a\u00020\u0016J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH\u0014J\u0016\u0010$\u001a\u00020\u00162\f\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010&H\u0016J\u0012\u0010'\u001a\u00020\u00162\b\b\u0001\u0010(\u001a\u00020\u000bH\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/taihebase/activity/view/LoadMoreRecyclerView;", "Lcom/taihebase/activity/view/RecyclerViewEmpty;", "Lskin/support/widget/SkinCompatSupportable;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "context", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "footview", "Landroid/view/View;", "headview", "loadMoreAdapter", "Lcom/soli/pullupdownrefresh/more/LoadMoreRecyclerAdapter;", "mBackgroundTintHelper", "Lskin/support/widget/SkinCompatBackgroundHelper;", "mangerType", "addFooter", "", "view", "addHeader", "applySkin", "getFooter", "getHeader", "isFooter", "", g.C, "isHeader", "markIsStaggeredGridLayoutManager", "onMeasure", "widthSpec", "heightSpec", "setAdapter", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setBackgroundResource", "resId", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LoadMoreRecyclerView extends RecyclerViewEmpty implements SkinCompatSupportable {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public Map<Integer, View> f8005g;

    /* renamed from: h  reason: collision with root package name */
    private int f8006h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private View f8007i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private View f8008j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private e f8009k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private SkinCompatBackgroundHelper f8010l;

    public /* synthetic */ LoadMoreRecyclerView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    @Override // com.taihebase.activity.view.RecyclerViewEmpty
    public void a() {
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
    }

    @Override // com.taihebase.activity.view.RecyclerViewEmpty
    @Nullable
    public View b(int i2) {
    }

    public final void e(@NotNull View view) {
    }

    public final void f(@NotNull View view) {
    }

    public final boolean g(int i2) {
    }

    @Nullable
    public final View getFooter() {
    }

    @Nullable
    public final View getHeader() {
    }

    public final boolean h(int i2) {
    }

    public final void i() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // com.taihebase.activity.view.RecyclerViewEmpty, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(@Nullable RecyclerView.Adapter<?> adapter) {
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
    }

    public LoadMoreRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public LoadMoreRecyclerView(@NotNull Context context) {
    }

    public LoadMoreRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
