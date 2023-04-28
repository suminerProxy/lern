package com.showstartfans.activity.activitys.community;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommunityMapMarkerLinearLayout.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/showstartfans/activity/activitys/community/CommunityMapMarkerLinearLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "angleSize", "", "bottomOffset", "fillColor", "", "getFillColor", "()I", "setFillColor", "(I)V", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "pathEffect", "Landroid/graphics/PathEffect;", "spaceH", "strokeColor", "getStrokeColor", "setStrokeColor", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CommunityMapMarkerLinearLayout extends LinearLayout {
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private final Paint c;

    /* renamed from: d  reason: collision with root package name */
    private int f5386d;

    /* renamed from: e  reason: collision with root package name */
    private int f5387e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Path f5388f;

    /* renamed from: g  reason: collision with root package name */
    private float f5389g;

    /* renamed from: h  reason: collision with root package name */
    private float f5390h;

    /* renamed from: i  reason: collision with root package name */
    private float f5391i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private PathEffect f5392j;

    @JvmOverloads
    public CommunityMapMarkerLinearLayout(@NotNull Context context) {
    }

    public /* synthetic */ CommunityMapMarkerLinearLayout(Context context, AttributeSet attributeSet, int i2, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final int getFillColor() {
    }

    public final int getStrokeColor() {
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(@Nullable Canvas canvas) {
    }

    public final void setFillColor(int i2) {
    }

    public final void setStrokeColor(int i2) {
    }

    @JvmOverloads
    public CommunityMapMarkerLinearLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
