package com.showstartfans.activity.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RefundStepView.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/showstartfans/activity/widget/RefundStepView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dstRect", "Landroid/graphics/Rect;", "failedBitmap", "Landroid/graphics/Bitmap;", "value", "", "isRefuse", "()Z", "setRefuse", "(Z)V", "max", "getMax", "()I", "setMax", "(I)V", "paint", "Landroid/graphics/Paint;", "progress", "getProgress", "setProgress", "progressCorner", "progressHeight", "srcRect", "successBitmap", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class RefundStepView extends View {
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private final Paint c;

    /* renamed from: d  reason: collision with root package name */
    private int f7442d;

    /* renamed from: e  reason: collision with root package name */
    private int f7443e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private Bitmap f7444f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private Bitmap f7445g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final Rect f7446h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final Rect f7447i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f7448j;

    /* renamed from: k  reason: collision with root package name */
    private int f7449k;

    /* renamed from: l  reason: collision with root package name */
    private int f7450l;

    @JvmOverloads
    public RefundStepView(@NotNull Context context) {
    }

    @JvmOverloads
    public RefundStepView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public /* synthetic */ RefundStepView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final boolean c() {
    }

    public final int getMax() {
    }

    public final int getProgress() {
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
    }

    public final void setMax(int i2) {
    }

    public final void setProgress(int i2) {
    }

    public final void setRefuse(boolean z) {
    }

    @JvmOverloads
    public RefundStepView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
