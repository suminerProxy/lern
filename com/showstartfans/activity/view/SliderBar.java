package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.manager.PhotoWallPhotoBean;
import h.c.a.a.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SliderBar.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u00106\u001a\u00020&2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020\tH\u0002J\b\u0010:\u001a\u00020(H\u0002J\u000e\u0010;\u001a\u00020(2\u0006\u0010$\u001a\u00020\u0010J\u000e\u0010<\u001a\u00020(2\u0006\u0010$\u001a\u00020\u0010J\u0010\u0010=\u001a\u00020(2\b\u0010>\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020\tH\u0002J\u0018\u0010A\u001a\u00020(2\u0006\u0010B\u001a\u00020\t2\b\b\u0002\u0010C\u001a\u00020&J\u000e\u0010D\u001a\u00020(2\u0006\u0010$\u001a\u00020\u0010J\u0018\u0010E\u001a\u00020(2\u0006\u0010F\u001a\u00020&2\b\b\u0002\u0010C\u001a\u00020&R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000Rg\u0010 \u001aO\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110&¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b('\u0012\u0004\u0012\u00020(\u0018\u00010!j\u0004\u0018\u0001`)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/showstartfans/activity/view/SliderBar;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "autoHideRun", "Ljava/lang/Runnable;", "autoHideTime", "", "currentRatio", "", "downPoint", "", "[Ljava/lang/Float;", "downTime", "lastDownLocalY", "lastDownY", "lastShowStr", "", "layoutBar", "layoutTime", "Landroid/widget/LinearLayout;", "mData", "Lcom/showstartfans/activity/manager/PhotoWallPhotoBean;", "mMode", "minDffIndex", "onBarMoveListener", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", MapBundleKey.OfflineMapKey.OFFLINE_RATION, "ratioOfffset", "", "touchIng", "", "Lcom/showstartfans/activity/view/OnBarMoveListener;", "getOnBarMoveListener", "()Lkotlin/jvm/functions/Function3;", "setOnBarMoveListener", "(Lkotlin/jvm/functions/Function3;)V", "parentLayout", "Lcom/showstartfans/activity/view/SliderBarLayout;", "getParentLayout", "()Lcom/showstartfans/activity/view/SliderBarLayout;", "setParentLayout", "(Lcom/showstartfans/activity/view/SliderBarLayout;)V", "tvTime", "Landroid/widget/TextView;", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "getLocalY", "onClick", "scrollForTouch", "scrollFormList", "setCheckData", "data", "setLocalY", "y", "setMode", a.f16081l, "anima", "setRatio", "setShow", "show", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class SliderBar extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private Function3<? super Float, ? super Float, ? super Boolean, Unit> c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private SliderBarLayout f7025d;

    /* renamed from: e  reason: collision with root package name */
    private float f7026e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private FrameLayout f7027f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private LinearLayout f7028g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private TextView f7029h;

    /* renamed from: i  reason: collision with root package name */
    private int f7030i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private String f7031j;

    /* renamed from: k  reason: collision with root package name */
    private int f7032k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private PhotoWallPhotoBean f7033l;

    /* renamed from: m  reason: collision with root package name */
    private long f7034m;

    /* renamed from: n  reason: collision with root package name */
    private float f7035n;

    /* renamed from: o  reason: collision with root package name */
    private float f7036o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    private Float[] f7037p;
    private long q;
    @NotNull
    private final Runnable r;

    public SliderBar(@NotNull Context context) {
    }

    private static final void c(SliderBar sliderBar) {
    }

    public static /* synthetic */ void d(SliderBar sliderBar) {
    }

    public static /* synthetic */ void e(SliderBar sliderBar) {
    }

    private final void f() {
    }

    private final int getLocalY() {
    }

    public static /* synthetic */ void j(SliderBar sliderBar, int i2, boolean z, int i3, Object obj) {
    }

    public static /* synthetic */ void l(SliderBar sliderBar, boolean z, boolean z2, int i2, Object obj) {
    }

    private final void setLocalY(int i2) {
    }

    /* renamed from: setShow$lambda-1  reason: not valid java name */
    private static final void m28setShow$lambda1(SliderBar sliderBar) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
    }

    public final void g(float f2) {
    }

    @Nullable
    public final Function3<Float, Float, Boolean, Unit> getOnBarMoveListener() {
    }

    @Nullable
    public final SliderBarLayout getParentLayout() {
    }

    public final void h(float f2) {
    }

    public final void i(int i2, boolean z) {
    }

    public final void k(boolean z, boolean z2) {
    }

    public final void setCheckData(@Nullable PhotoWallPhotoBean photoWallPhotoBean) {
    }

    public final void setOnBarMoveListener(@Nullable Function3<? super Float, ? super Float, ? super Boolean, Unit> function3) {
    }

    public final void setParentLayout(@Nullable SliderBarLayout sliderBarLayout) {
    }

    public final void setRatio(float f2) {
    }

    public SliderBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public SliderBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
