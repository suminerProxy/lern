package com.showstartfans.activity.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.facebook.common.util.UriUtil;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImmersionMoodAnimationView.kt */
@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\r\u0018\u00002\u00020\u0001:\u0001(B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u0007J(\u0010\u001e\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u0010J\u0018\u0010!\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J\b\u0010\"\u001a\u00020\u001bH\u0014J\b\u0010#\u001a\u00020\u001bH\u0014J\u0012\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0006\u0010'\u001a\u00020\u001bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/showstartfans/activity/view/ImmersionMoodAnimationView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animationBitmap", "", "Lcom/showstartfans/activity/view/ImmersionMoodAnimationView$Data;", "animationRunnable", "com/showstartfans/activity/view/ImmersionMoodAnimationView$animationRunnable$1", "Lcom/showstartfans/activity/view/ImmersionMoodAnimationView$animationRunnable$1;", "focusDelay", "", "getFocusDelay", "()Z", "setFocusDelay", "(Z)V", "isRefresh", "paint", "Landroid/graphics/Paint;", "random", "Ljava/util/Random;", "add", "", UriUtil.LOCAL_RESOURCE_SCHEME, "percent", "addAll", "", "clear", "obtainData", "onAttachedToWindow", "onDetachedFromWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "start", "Data", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ImmersionMoodAnimationView extends View {
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private final Random c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6739d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6740e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final List<a> f6741f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Paint f6742g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final b f6743h;

    /* compiled from: ImmersionMoodAnimationView.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/view/ImmersionMoodAnimationView$animationRunnable$1", "Ljava/lang/Runnable;", "run", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements Runnable {
        public final /* synthetic */ ImmersionMoodAnimationView b;

        public b(ImmersionMoodAnimationView immersionMoodAnimationView) {
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
        }
    }

    @JvmOverloads
    public ImmersionMoodAnimationView(@NotNull Context context) {
    }

    @JvmOverloads
    public ImmersionMoodAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public /* synthetic */ ImmersionMoodAnimationView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static final /* synthetic */ List c(ImmersionMoodAnimationView immersionMoodAnimationView) {
    }

    public static final /* synthetic */ boolean d(ImmersionMoodAnimationView immersionMoodAnimationView) {
    }

    public static final /* synthetic */ void e(ImmersionMoodAnimationView immersionMoodAnimationView, boolean z) {
    }

    public static /* synthetic */ void g(ImmersionMoodAnimationView immersionMoodAnimationView, int i2, int i3, int i4, Object obj) {
    }

    public static /* synthetic */ void i(ImmersionMoodAnimationView immersionMoodAnimationView, List list, int i2, boolean z, int i3, Object obj) {
    }

    private final a j(int i2, int i3) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void f(@DrawableRes int i2, int i3) {
    }

    public final boolean getFocusDelay() {
    }

    public final void h(@NotNull List<Integer> list, int i2, boolean z) {
    }

    public final void k() {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
    }

    public final void setFocusDelay(boolean z) {
    }

    @JvmOverloads
    public ImmersionMoodAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    /* compiled from: ImmersionMoodAnimationView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/showstartfans/activity/view/ImmersionMoodAnimationView$Data;", "", "bitmap", "Landroid/graphics/Bitmap;", "type", "", "percent", "frequency", "", "(Landroid/graphics/Bitmap;IIF)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getFrequency", "()F", "setFrequency", "(F)V", "getPercent", "()I", "setPercent", "(I)V", "getType", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f6744a;
        private final int b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private float f6745d;

        public a(@NotNull Bitmap bitmap, int i2, int i3, float f2) {
        }

        @NotNull
        public final Bitmap a() {
        }

        public final float b() {
        }

        public final int c() {
        }

        public final int d() {
        }

        public final void e(float f2) {
        }

        public final void f(int i2) {
        }

        public /* synthetic */ a(Bitmap bitmap, int i2, int i3, float f2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
