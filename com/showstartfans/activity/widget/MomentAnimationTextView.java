package com.showstartfans.activity.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MomentAnimationTextView.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0018\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0014J\b\u0010)\u001a\u00020#H\u0002R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/showstartfans/activity/widget/MomentAnimationTextView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "alphas", "", "currentTime", "", "value", "", "hint", "getHint", "()Ljava/lang/String;", "setHint", "(Ljava/lang/String;)V", "paint", "Landroid/text/TextPaint;", "random", "Ljava/util/Random;", "space", "text", "getText", "setText", "textArray", "", "isEmojiCharacter", "", "codePoint", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "start", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class MomentAnimationTextView extends View {
    @NotNull
    public Map<Integer, View> b;
    private float c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f7431d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private String f7432e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f7433f;

    /* renamed from: g  reason: collision with root package name */
    private int f7434g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final TextPaint f7435h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final Random f7436i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private final Map<Integer, Integer> f7437j;

    /* compiled from: MomentAnimationTextView.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/widget/MomentAnimationTextView$start$1", "Ljava/lang/Runnable;", "run", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ MomentAnimationTextView b;

        public a(MomentAnimationTextView momentAnimationTextView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    @JvmOverloads
    public MomentAnimationTextView(@NotNull Context context) {
    }

    @JvmOverloads
    public MomentAnimationTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public /* synthetic */ MomentAnimationTextView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static final /* synthetic */ float c(MomentAnimationTextView momentAnimationTextView) {
    }

    public static final /* synthetic */ void d(MomentAnimationTextView momentAnimationTextView, float f2) {
    }

    private final boolean e(char c) {
    }

    private final void f() {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    @NotNull
    public final String getHint() {
    }

    @NotNull
    public final String getText() {
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public final void setHint(@NotNull String str) {
    }

    public final void setText(@NotNull String str) {
    }

    @JvmOverloads
    public MomentAnimationTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
