package com.showstartfans.activity.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReboundRecyclerView.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010)\u001a\u00020\tH\u0002J\b\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\tH\u0002J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u000200H\u0016J\u0012\u00101\u001a\u00020+2\b\u00102\u001a\u0004\u0018\u000103H\u0014J\u0010\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u000200H\u0017J\b\u00106\u001a\u00020+H\u0002J\b\u00107\u001a\u00020+H\u0002J\u0010\u00108\u001a\u00020+2\u0006\u00105\u001a\u000200H\u0002R\u000e\u0010\u000b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015¨\u00069"}, d2 = {"Lcom/showstartfans/activity/view/ReboundRecyclerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "DEFAULT_MAX_REBOUND_DURATION", "DEFAULT_SCROLL_RATIO", "", "isPressedDown", "", "mLastTouchY", "mMaximumVelocity", "mMinimumVelocity", "maxReboundAnimDuration", "getMaxReboundAnimDuration", "()I", "setMaxReboundAnimDuration", "(I)V", "overScroller", "Landroid/widget/OverScroller;", "<set-?>", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "scaledTouchSlop", "scrollRatio", "getScrollRatio", "()F", "setScrollRatio", "(F)V", "velocityTracker", "Landroid/view/VelocityTracker;", "yVelocity", "getYVelocity", "calculateDurationByScrollY", "computeScroll", "", "move", "deltaY", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onTouchEvent", "event", "rebound", "recycleVelocityTracker", "trackerEvent", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ReboundRecyclerView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    private final float c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6908d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final OverScroller f6909e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private VelocityTracker f6910f;

    /* renamed from: g  reason: collision with root package name */
    private int f6911g;

    /* renamed from: h  reason: collision with root package name */
    private int f6912h;

    /* renamed from: i  reason: collision with root package name */
    private int f6913i;

    /* renamed from: j  reason: collision with root package name */
    private int f6914j;

    /* renamed from: k  reason: collision with root package name */
    private float f6915k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private RecyclerView f6916l;

    /* renamed from: m  reason: collision with root package name */
    private float f6917m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f6918n;

    public /* synthetic */ ReboundRecyclerView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    private final int c() {
    }

    private final void d(int i2) {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g(MotionEvent motionEvent) {
    }

    private final int getYVelocity() {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    @Override // android.view.View
    public void computeScroll() {
    }

    public final int getMaxReboundAnimDuration() {
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
    }

    public final float getScrollRatio() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
    }

    public final void setMaxReboundAnimDuration(int i2) {
    }

    public final void setScrollRatio(float f2) {
    }

    public ReboundRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public ReboundRecyclerView(@NotNull Context context) {
    }

    public ReboundRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public /* synthetic */ ReboundRecyclerView(Context context, AttributeSet attributeSet, int i2, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
