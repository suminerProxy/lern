package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ChangeBounds extends Transition {
    private static final Property<View, PointF> BOTTOM_RIGHT_ONLY_PROPERTY = null;
    private static final Property<ViewBounds, PointF> BOTTOM_RIGHT_PROPERTY = null;
    private static final Property<Drawable, PointF> DRAWABLE_ORIGIN_PROPERTY = null;
    private static final Property<View, PointF> POSITION_PROPERTY = null;
    private static final String PROPNAME_BOUNDS = "android:changeBounds:bounds";
    private static final String PROPNAME_CLIP = "android:changeBounds:clip";
    private static final String PROPNAME_PARENT = "android:changeBounds:parent";
    private static final String PROPNAME_WINDOW_X = "android:changeBounds:windowX";
    private static final String PROPNAME_WINDOW_Y = "android:changeBounds:windowY";
    private static final Property<View, PointF> TOP_LEFT_ONLY_PROPERTY = null;
    private static final Property<ViewBounds, PointF> TOP_LEFT_PROPERTY = null;
    private static RectEvaluator sRectEvaluator;
    private static final String[] sTransitionProperties = null;
    private boolean mReparent;
    private boolean mResizeClip;
    private int[] mTempLocation;

    /* renamed from: androidx.transition.ChangeBounds$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 extends Property<Drawable, PointF> {
        private Rect mBounds;

        public AnonymousClass1(Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(Drawable drawable) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Drawable drawable, PointF pointF) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public PointF get2(Drawable drawable) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(Drawable drawable, PointF pointF) {
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass10 extends AnimatorListenerAdapter {
        public final /* synthetic */ ChangeBounds this$0;
        public final /* synthetic */ BitmapDrawable val$drawable;
        public final /* synthetic */ ViewGroup val$sceneRoot;
        public final /* synthetic */ float val$transitionAlpha;
        public final /* synthetic */ View val$view;

        public AnonymousClass10(ChangeBounds changeBounds, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2 extends Property<ViewBounds, PointF> {
        public AnonymousClass2(Class cls, String str) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public PointF get2(ViewBounds viewBounds) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(ViewBounds viewBounds) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(ViewBounds viewBounds, PointF pointF) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(ViewBounds viewBounds, PointF pointF) {
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass3 extends Property<ViewBounds, PointF> {
        public AnonymousClass3(Class cls, String str) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public PointF get2(ViewBounds viewBounds) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(ViewBounds viewBounds) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(ViewBounds viewBounds, PointF pointF) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(ViewBounds viewBounds, PointF pointF) {
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass4 extends Property<View, PointF> {
        public AnonymousClass4(Class cls, String str) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public PointF get2(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, PointF pointF) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(View view, PointF pointF) {
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass5 extends Property<View, PointF> {
        public AnonymousClass5(Class cls, String str) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public PointF get2(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, PointF pointF) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(View view, PointF pointF) {
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass6 extends Property<View, PointF> {
        public AnonymousClass6(Class cls, String str) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public PointF get2(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, PointF pointF) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(View view, PointF pointF) {
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass7 extends AnimatorListenerAdapter {
        private ViewBounds mViewBounds;
        public final /* synthetic */ ChangeBounds this$0;
        public final /* synthetic */ ViewBounds val$viewBounds;

        public AnonymousClass7(ChangeBounds changeBounds, ViewBounds viewBounds) {
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass8 extends AnimatorListenerAdapter {
        private boolean mIsCanceled;
        public final /* synthetic */ ChangeBounds this$0;
        public final /* synthetic */ int val$endBottom;
        public final /* synthetic */ int val$endLeft;
        public final /* synthetic */ int val$endRight;
        public final /* synthetic */ int val$endTop;
        public final /* synthetic */ Rect val$finalClip;
        public final /* synthetic */ View val$view;

        public AnonymousClass8(ChangeBounds changeBounds, View view, Rect rect, int i2, int i3, int i4, int i5) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass9 extends TransitionListenerAdapter {
        public boolean mCanceled;
        public final /* synthetic */ ChangeBounds this$0;
        public final /* synthetic */ ViewGroup val$parent;

        public AnonymousClass9(ChangeBounds changeBounds, ViewGroup viewGroup) {
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition) {
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) {
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ViewBounds {
        private int mBottom;
        private int mBottomRightCalls;
        private int mLeft;
        private int mRight;
        private int mTop;
        private int mTopLeftCalls;
        private View mView;

        public ViewBounds(View view) {
        }

        private void setLeftTopRightBottom() {
        }

        public void setBottomRight(PointF pointF) {
        }

        public void setTopLeft(PointF pointF) {
        }
    }

    public ChangeBounds() {
    }

    private void captureValues(TransitionValues transitionValues) {
    }

    private boolean parentMatches(View view, View view2) {
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
    }

    public boolean getResizeClip() {
    }

    @Override // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
    }

    public void setResizeClip(boolean z) {
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
    }
}
