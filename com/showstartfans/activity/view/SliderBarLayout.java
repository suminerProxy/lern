package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.manager.PhotoWallPhotoBean;
import com.tencent.android.tpush.common.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SliderBarLayout.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\fJ\b\u0010\"\u001a\u00020\u0019H\u0002J\u0010\u0010#\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010%J\u000e\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u000eR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R=\u0010\u0013\u001a%\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014j\u0004\u0018\u0001`\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/showstartfans/activity/view/SliderBarLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bindView", "Landroidx/recyclerview/widget/RecyclerView;", "isShowing", "", "()Z", "setShowing", "(Z)V", "isTouchBaring", "onSliderChangeListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", Constants.FLAG_TAG_OFFSET, "", "Lcom/showstartfans/activity/view/OnSliderChangeListener;", "getOnSliderChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnSliderChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "sliderBar", "Lcom/showstartfans/activity/view/SliderBar;", "view", "listener", "setCheckData", "data", "Lcom/showstartfans/activity/manager/PhotoWallPhotoBean;", "setShow", "show", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class SliderBarLayout extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private Function1<? super Float, Unit> c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f7038d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7039e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7040f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private SliderBar f7041g;

    /* compiled from: SliderBarLayout.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/view/SliderBarLayout$bindView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SliderBarLayout f7042a;

        public a(SliderBarLayout sliderBarLayout) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* compiled from: SliderBarLayout.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", MapBundleKey.OfflineMapKey.OFFLINE_RATION, "", "ratioOfffset", "touching", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function3<Float, Float, Boolean, Unit> {
        public final /* synthetic */ SliderBarLayout this$0;

        public b(SliderBarLayout sliderBarLayout) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Float f2, Float f3, Boolean bool) {
        }

        public final void invoke(float f2, float f3, boolean z) {
        }
    }

    public SliderBarLayout(@NotNull Context context) {
    }

    public static final /* synthetic */ RecyclerView c(SliderBarLayout sliderBarLayout) {
    }

    public static final /* synthetic */ SliderBar d(SliderBarLayout sliderBarLayout) {
    }

    public static final /* synthetic */ boolean e(SliderBarLayout sliderBarLayout) {
    }

    public static final /* synthetic */ void f(SliderBarLayout sliderBarLayout, boolean z) {
    }

    private final void i() {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void g(@Nullable RecyclerView recyclerView) {
    }

    @Nullable
    public final Function1<Float, Unit> getOnSliderChangeListener() {
    }

    public final boolean h() {
    }

    public final void setCheckData(@Nullable PhotoWallPhotoBean photoWallPhotoBean) {
    }

    public final void setOnSliderChangeListener(@Nullable Function1<? super Float, Unit> function1) {
    }

    public final void setShow(boolean z) {
    }

    public final void setShowing(boolean z) {
    }

    public SliderBarLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public SliderBarLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
