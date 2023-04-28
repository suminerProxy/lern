package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DoubleClickView.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ)\u0010\u001e\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0002\u0010!J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u000e\u0010\u000b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\u0004\u0018\u0001`\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006&"}, d2 = {"Lcom/showstartfans/activity/view/DoubleClickView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "clickOffsetDistance", "clickOffsetTime", "doubleClickOffsetTime", "downPoint", "", "", "[Ljava/lang/Float;", "lastClickTime", "", "lastDownTime", "onDoubleClick", "Lkotlin/Function0;", "", "Lcom/showstartfans/activity/view/OnDoubleClick;", "getOnDoubleClick", "()Lkotlin/jvm/functions/Function0;", "setOnDoubleClick", "(Lkotlin/jvm/functions/Function0;)V", "upPoint", "Distance", "point", "point2", "([Ljava/lang/Float;[Ljava/lang/Float;)F", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class DoubleClickView extends View {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private Function0<Unit> c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Float[] f6643d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Float[] f6644e;

    /* renamed from: f  reason: collision with root package name */
    private long f6645f;

    /* renamed from: g  reason: collision with root package name */
    private long f6646g;

    /* renamed from: h  reason: collision with root package name */
    private final int f6647h;

    /* renamed from: i  reason: collision with root package name */
    private final int f6648i;

    /* renamed from: j  reason: collision with root package name */
    private final int f6649j;

    public DoubleClickView(@Nullable Context context) {
    }

    private final float a(Float[] fArr, Float[] fArr2) {
    }

    public void b() {
    }

    @Nullable
    public View c(int i2) {
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
    }

    @Nullable
    public final Function0<Unit> getOnDoubleClick() {
    }

    public final void setOnDoubleClick(@Nullable Function0<Unit> function0) {
    }

    public DoubleClickView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public DoubleClickView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
