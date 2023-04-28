package com.showstartfans.activity.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatBackgroundHelper;
import skin.support.widget.SkinCompatSupportable;

/* compiled from: CoordinatorLayoutDown.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020&H\u0002J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u000200H\u0016J\b\u00103\u001a\u00020+H\u0002J\u0010\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020&H\u0016R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R\u001a\u0010\u001f\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001b\u0010\"\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\r\u001a\u0004\b#\u0010\u000bR\u001b\u0010%\u001a\u00020&8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b'\u0010(¨\u00066"}, d2 = {"Lcom/showstartfans/activity/view/CoordinatorLayoutDown;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lskin/support/widget/SkinCompatSupportable;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bgView", "Landroid/view/View;", "getBgView", "()Landroid/view/View;", "bgView$delegate", "Lkotlin/Lazy;", "canDetect", "", "getCanDetect", "()Z", "setCanDetect", "(Z)V", "dragDistance", "", "getDragDistance", "()F", "setDragDistance", "(F)V", "mBackgroundTintHelper", "Lskin/support/widget/SkinCompatBackgroundHelper;", "mIsBeingDragged", "getMIsBeingDragged", "setMIsBeingDragged", "mLastMotionY", "getMLastMotionY", "setMLastMotionY", "topImage", "getTopImage", "topImage$delegate", "topImageMinHeight", "", "getTopImageMinHeight", "()I", "topImageMinHeight$delegate", "applySkin", "", "changeTopImageHeight", "diff", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "event", "releaseToInitPosition", "setBackgroundResource", "resId", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CoordinatorLayoutDown extends CoordinatorLayout implements SkinCompatSupportable {
    @NotNull
    public Map<Integer, View> b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private float f6616d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6617e;

    /* renamed from: f  reason: collision with root package name */
    private float f6618f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Lazy f6619g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final Lazy f6620h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final Lazy f6621i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private SkinCompatBackgroundHelper f6622j;

    /* compiled from: CoordinatorLayoutDown.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<View> {
        public final /* synthetic */ CoordinatorLayoutDown this$0;

        public a(CoordinatorLayoutDown coordinatorLayoutDown) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ View invoke() {
        }
    }

    /* compiled from: CoordinatorLayoutDown.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<View> {
        public final /* synthetic */ CoordinatorLayoutDown this$0;

        public b(CoordinatorLayoutDown coordinatorLayoutDown) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ View invoke() {
        }
    }

    /* compiled from: CoordinatorLayoutDown.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Integer> {
        public final /* synthetic */ CoordinatorLayoutDown this$0;

        public c(CoordinatorLayoutDown coordinatorLayoutDown) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    public CoordinatorLayoutDown(@NotNull Context context, @NotNull AttributeSet attributeSet) {
    }

    private final void c(int i2) {
    }

    public static /* synthetic */ void d(CoordinatorLayoutDown coordinatorLayoutDown, ValueAnimator valueAnimator) {
    }

    private final void e() {
    }

    private static final void f(CoordinatorLayoutDown coordinatorLayoutDown, ValueAnimator valueAnimator) {
    }

    public void a() {
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
    }

    @Nullable
    public View b(int i2) {
    }

    @Nullable
    public final View getBgView() {
    }

    public final boolean getCanDetect() {
    }

    public final float getDragDistance() {
    }

    public final boolean getMIsBeingDragged() {
    }

    public final float getMLastMotionY() {
    }

    @NotNull
    public final View getTopImage() {
    }

    public final int getTopImageMinHeight() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
    }

    public final void setCanDetect(boolean z) {
    }

    public final void setDragDistance(float f2) {
    }

    public final void setMIsBeingDragged(boolean z) {
    }

    public final void setMLastMotionY(float f2) {
    }
}
