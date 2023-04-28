package com.easypull;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.sobot.network.http.model.SobotProgress;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import com.umeng.analytics.pro.am;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EasyPullLayout.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000 V2\u00020\u0001:\u0003UVWB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020\tJ\u0012\u0010;\u001a\u00020\u00192\b\u0010<\u001a\u0004\u0018\u00010=H\u0014J\b\u0010>\u001a\u00020=H\u0014J\u0012\u0010?\u001a\u00020=2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010?\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010=H\u0014J\b\u0010@\u001a\u00020/H\u0002J\b\u0010A\u001a\u00020/H\u0014J\u0012\u0010B\u001a\u00020\u00192\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J0\u0010E\u001a\u00020/2\u0006\u0010.\u001a\u00020\u00192\u0006\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\t2\u0006\u0010H\u001a\u00020\t2\u0006\u0010I\u001a\u00020\tH\u0014J\u0018\u0010J\u001a\u00020/2\u0006\u0010K\u001a\u00020\t2\u0006\u0010L\u001a\u00020\tH\u0014J\u0012\u0010M\u001a\u00020\u00192\b\u0010N\u001a\u0004\u0018\u00010DH\u0016J\b\u0010O\u001a\u00020/H\u0002J\b\u0010P\u001a\u00020/H\u0002J\u0016\u0010Q\u001a\u00020/2\u000e\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0'JW\u0010R\u001a\u00020/2O\u0010F\u001aK\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/0)J+\u0010S\u001a\u00020/2#\u0010F\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020/01J\u0006\u0010T\u001a\u00020/R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0'X\u0082\u000e¢\u0006\u0002\n\u0000RY\u0010(\u001aM\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R-\u00100\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020/\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/easypull/EasyPullLayout;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "auto_refresh_rolling_duration", "", "childViews", "Ljava/util/HashMap;", "Landroid/view/View;", "Lcom/easypull/EasyPullLayout$ChildViewAttr;", "Lkotlin/collections/HashMap;", "currentState", "Ljava/lang/Integer;", "currentType", "downX", "", "downY", "fixed_content_bottom", "", "fixed_content_left", "fixed_content_right", "fixed_content_top", "horizontalAnimator", "Landroid/animation/ValueAnimator;", "lastPullFraction", "max_offset_bottom", "max_offset_left", "max_offset_right", "max_offset_top", "offsetX", "offsetY", "onEdgeListener", "Lkotlin/Function0;", "onPullListener", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "type", SobotProgress.FRACTION, "changed", "", "onTriggerListener", "Lkotlin/Function1;", "roll_back_duration", "sticky_factor", "trigger_offset_bottom", "trigger_offset_left", "trigger_offset_right", "trigger_offset_top", "verticalAnimator", "autoRefresh", "typeEdge", "checkLayoutParams", "p", "Landroid/view/ViewGroup$LayoutParams;", "generateDefaultLayoutParams", "generateLayoutParams", "move", "onFinishInflate", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onLayout", "l", am.aI, "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "event", "rollBackHorizontal", "rollBackVertical", "setOnEdgeListener", "setOnPullListener", "setOnTriggerListener", "stop", "ChildViewAttr", "Companion", "LayoutParams", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class EasyPullLayout extends ViewGroup {
    @NotNull
    public static final b E = null;
    public static final int F = -1;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;
    public static final int K = 4;
    public static final int L = 0;
    public static final int M = 1;
    public static final int N = 2;
    @Nullable
    private ValueAnimator A;
    @NotNull
    private Function0<Integer> B;
    @Nullable
    private Function3<? super Integer, ? super Float, ? super Boolean, Unit> C;
    @Nullable
    private Function1<? super Integer, Unit> D;
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f2996d;

    /* renamed from: e  reason: collision with root package name */
    private int f2997e;

    /* renamed from: f  reason: collision with root package name */
    private int f2998f;

    /* renamed from: g  reason: collision with root package name */
    private int f2999g;

    /* renamed from: h  reason: collision with root package name */
    private int f3000h;

    /* renamed from: i  reason: collision with root package name */
    private int f3001i;

    /* renamed from: j  reason: collision with root package name */
    private int f3002j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3003k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f3004l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f3005m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f3006n;

    /* renamed from: o  reason: collision with root package name */
    private long f3007o;

    /* renamed from: p  reason: collision with root package name */
    private long f3008p;
    private float q;
    @NotNull
    private HashMap<View, a> r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    @Nullable
    private Integer x;
    @Nullable
    private Integer y;
    @Nullable
    private ValueAnimator z;

    /* compiled from: EasyPullLayout.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/easypull/EasyPullLayout$Companion;", "", "()V", "STATE_IDLE", "", "STATE_ROLLING", "STATE_TRIGGERING", "TYPE_CONTENT", "TYPE_EDGE_BOTTOM", "TYPE_EDGE_LEFT", "TYPE_EDGE_RIGHT", "TYPE_EDGE_TOP", "TYPE_NONE", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: EasyPullLayout.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/easypull/EasyPullLayout$autoRefresh$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class d extends AnimatorListenerAdapter {
        public final /* synthetic */ EasyPullLayout b;

        public d(EasyPullLayout easyPullLayout) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Nullable Animator animator) {
        }
    }

    /* compiled from: EasyPullLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class e extends Lambda implements Function0<Integer> {
        public static final e INSTANCE = null;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    /* compiled from: EasyPullLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class f extends Lambda implements Function0<Integer> {
        public final /* synthetic */ View $contentView;
        public final /* synthetic */ EasyPullLayout this$0;

        public f(EasyPullLayout easyPullLayout, View view) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Integer invoke() {
        }
    }

    /* compiled from: EasyPullLayout.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/easypull/EasyPullLayout$rollBackHorizontal$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class g extends AnimatorListenerAdapter {
        public final /* synthetic */ int b;
        public final /* synthetic */ EasyPullLayout c;

        public g(int i2, EasyPullLayout easyPullLayout) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Nullable Animator animator) {
        }
    }

    /* compiled from: EasyPullLayout.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/easypull/EasyPullLayout$rollBackVertical$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class h extends AnimatorListenerAdapter {
        public final /* synthetic */ int b;
        public final /* synthetic */ EasyPullLayout c;

        public h(int i2, EasyPullLayout easyPullLayout) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Nullable Animator animator) {
        }
    }

    public EasyPullLayout(@Nullable Context context) {
    }

    public static final /* synthetic */ HashMap c(EasyPullLayout easyPullLayout) {
    }

    public static final /* synthetic */ Integer d(EasyPullLayout easyPullLayout) {
    }

    public static final /* synthetic */ Integer e(EasyPullLayout easyPullLayout) {
    }

    public static final /* synthetic */ Function1 f(EasyPullLayout easyPullLayout) {
    }

    public static final /* synthetic */ void g(EasyPullLayout easyPullLayout) {
    }

    public static final /* synthetic */ void h(EasyPullLayout easyPullLayout) {
    }

    public static final /* synthetic */ void i(EasyPullLayout easyPullLayout, Integer num) {
    }

    public static final /* synthetic */ void j(EasyPullLayout easyPullLayout, float f2) {
    }

    public static final /* synthetic */ void k(EasyPullLayout easyPullLayout, float f2) {
    }

    private static final void m(EasyPullLayout easyPullLayout, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
    }

    public static /* synthetic */ void n(EasyPullLayout easyPullLayout, int i2, float f2, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
    }

    public static /* synthetic */ void o(EasyPullLayout easyPullLayout, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
    }

    public static /* synthetic */ void p(EasyPullLayout easyPullLayout, int i2, float f2, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
    }

    private final void q() {
    }

    private final void r() {
    }

    private static final void s(EasyPullLayout easyPullLayout, int i2, float f2, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
    }

    private final void t() {
    }

    private static final void u(EasyPullLayout easyPullLayout, int i2, float f2, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateLayoutParams(@Nullable AttributeSet attributeSet) {
    }

    public final void l(int i2) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
    }

    public final void setOnEdgeListener(@NotNull Function0<Integer> function0) {
    }

    public final void setOnPullListener(@NotNull Function3<? super Integer, ? super Float, ? super Boolean, Unit> function3) {
    }

    public final void setOnTriggerListener(@NotNull Function1<? super Integer, Unit> function1) {
    }

    public final void v() {
    }

    public EasyPullLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
    }

    public EasyPullLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    /* compiled from: EasyPullLayout.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nB\u0011\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\fB\u0011\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/easypull/EasyPullLayout$LayoutParams;", "Landroid/view/ViewGroup$MarginLayoutParams;", am.aF, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", AnimatedPasterJsonConfig.CONFIG_WIDTH, "", AnimatedPasterJsonConfig.CONFIG_HEIGHT, "(II)V", MessageKey.MSG_SOURCE, "(Landroid/view/ViewGroup$MarginLayoutParams;)V", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/ViewGroup$LayoutParams;)V", "type", "getType", "()I", "setType", "(I)V", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class c extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        private int f3012a;

        public c(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        }

        public final int a() {
        }

        public final void b(int i2) {
        }

        public c(int i2, int i3) {
        }

        public c(@Nullable ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public c(@Nullable ViewGroup.LayoutParams layoutParams) {
        }
    }

    /* compiled from: EasyPullLayout.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ8\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/easypull/EasyPullLayout$ChildViewAttr;", "", TtmlNode.LEFT, "", "top", TtmlNode.RIGHT, "bottom", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "(IIIII)V", "getBottom", "()I", "setBottom", "(I)V", "getLeft", "setLeft", "getRight", "setRight", "getSize", "setSize", "getTop", "setTop", "set", "", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int f3009a;
        private int b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f3010d;

        /* renamed from: e  reason: collision with root package name */
        private int f3011e;

        public a() {
        }

        public a(int i2, int i3, int i4, int i5, int i6) {
        }

        public static /* synthetic */ void g(a aVar, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        }

        public final int a() {
        }

        public final int b() {
        }

        public final int c() {
        }

        public final int d() {
        }

        public final int e() {
        }

        public final void f(int i2, int i3, int i4, int i5, int i6) {
        }

        public final void h(int i2) {
        }

        public final void i(int i2) {
        }

        public final void j(int i2) {
        }

        public final void k(int i2) {
        }

        public final void l(int i2) {
        }

        public /* synthetic */ a(int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
