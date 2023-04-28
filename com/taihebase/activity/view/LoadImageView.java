package com.taihebase.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatBackgroundHelper;
import skin.support.widget.SkinCompatSupportable;

/* compiled from: LoadImageView.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB+\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\nJ\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\nJ\u000e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(J\u000e\u0010&\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\nR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/taihebase/activity/view/LoadImageView;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "Lskin/support/widget/SkinCompatSupportable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleAttr", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "borderWidth", "", "radius", "roundingParams", "Lcom/facebook/drawee/generic/RoundingParams;", "getRoundingParams", "()Lcom/facebook/drawee/generic/RoundingParams;", "skinCompatBackgroundHelper", "Lskin/support/widget/SkinCompatBackgroundHelper;", "applySkin", "", "init", "setBorderColor", "color", "setBorderWidth", "setCornerRadius", "setEmptyPic", "emptyId", "setFailureImage", "resourceId", "setOval", "livOval", "", "setRound", "radii", "", "dp", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LoadImageView extends SimpleDraweeView implements SkinCompatSupportable {
    @NotNull
    public Map<Integer, View> b;
    private final float c;

    /* renamed from: d  reason: collision with root package name */
    private int f8003d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private SkinCompatBackgroundHelper f8004e;

    public LoadImageView(@Nullable Context context) {
    }

    private final RoundingParams getRoundingParams() {
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
    }

    public void c() {
    }

    @Nullable
    public View e(int i2) {
    }

    public final void f(@Nullable AttributeSet attributeSet) {
    }

    public final void setBorderColor(int i2) {
    }

    public final void setBorderWidth(float f2) {
    }

    public final void setCornerRadius(int i2) {
    }

    public final void setEmptyPic(int i2) {
    }

    public final void setFailureImage(int i2) {
    }

    public final void setOval(boolean z) {
    }

    public final void setRound(int i2) {
    }

    public LoadImageView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public final void setRound(@NotNull float[] fArr) {
    }

    public LoadImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public LoadImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
    }
}
