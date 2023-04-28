package com.showstartfans.activity.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import i.a.u0.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AutoScrollRecyclerView.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020$H\u0014J\b\u0010%\u001a\u00020$H\u0014J\b\u0010&\u001a\u00020\bH\u0014J\b\u0010'\u001a\u00020\u0016H\u0014J\b\u0010(\u001a\u00020\u0016H\u0014J\u0018\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020$H\u0014J\u0006\u0010-\u001a\u00020\u0016J\u0006\u0010.\u001a\u00020\u0016R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lcom/showstartfans/activity/widget/AutoScrollRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "autoPlay", "getAutoPlay", "()Z", "setAutoPlay", "(Z)V", "autoTask", "Lio/reactivex/disposables/Disposable;", "currentTimeOut", "", "isHorizontal", "isTouch", "onTime", "Lkotlin/Function1;", "", "getOnTime", "()Lkotlin/jvm/functions/Function1;", "setOnTime", "(Lkotlin/jvm/functions/Function1;)V", "timeOut", "getTimeOut", "()J", "setTimeOut", "(J)V", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "getBottomPaddingOffset", "", "getTopPaddingOffset", "isPaddingOffsetRequired", "onAttachedToWindow", "onDetachedFromWindow", "onVisibilityChanged", "changedView", "Landroid/view/View;", "visibility", "start", "stop", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class AutoScrollRecyclerView extends RecyclerView {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private c c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7358d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7359e;

    /* renamed from: f  reason: collision with root package name */
    private long f7360f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private Function1<? super Long, Unit> f7361g;

    /* renamed from: h  reason: collision with root package name */
    private long f7362h;

    /* compiled from: AutoScrollRecyclerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function1<Long, Unit> {
        public static final a INSTANCE = null;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
        }

        public final void invoke(long j2) {
        }
    }

    @JvmOverloads
    public AutoScrollRecyclerView(@NotNull Context context) {
    }

    public /* synthetic */ AutoScrollRecyclerView(Context context, AttributeSet attributeSet, int i2, DefaultConstructorMarker defaultConstructorMarker) {
    }

    private final boolean c() {
    }

    public static /* synthetic */ void d(AutoScrollRecyclerView autoScrollRecyclerView, Long l2) {
    }

    private static final void f(AutoScrollRecyclerView autoScrollRecyclerView, Long l2) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
    }

    public final void e() {
    }

    public final void g() {
    }

    public final boolean getAutoPlay() {
    }

    @Override // android.view.View
    public int getBottomPaddingOffset() {
    }

    @NotNull
    public final Function1<Long, Unit> getOnTime() {
    }

    public final long getTimeOut() {
    }

    @Override // android.view.View
    public int getTopPaddingOffset() {
    }

    @Override // android.view.View
    public boolean isPaddingOffsetRequired() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View view, int i2) {
    }

    public final void setAutoPlay(boolean z) {
    }

    public final void setOnTime(@NotNull Function1<? super Long, Unit> function1) {
    }

    public final void setTimeOut(long j2) {
    }

    @JvmOverloads
    public AutoScrollRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
