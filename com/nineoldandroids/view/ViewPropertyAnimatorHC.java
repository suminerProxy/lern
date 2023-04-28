package com.nineoldandroids.view;

import android.view.View;
import android.view.animation.Interpolator;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.ValueAnimator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ViewPropertyAnimatorHC extends ViewPropertyAnimator {
    private static final int ALPHA = 512;
    private static final int NONE = 0;
    private static final int ROTATION = 16;
    private static final int ROTATION_X = 32;
    private static final int ROTATION_Y = 64;
    private static final int SCALE_X = 4;
    private static final int SCALE_Y = 8;
    private static final int TRANSFORM_MASK = 511;
    private static final int TRANSLATION_X = 1;
    private static final int TRANSLATION_Y = 2;
    private static final int X = 128;
    private static final int Y = 256;
    private Runnable mAnimationStarter;
    private AnimatorEventListener mAnimatorEventListener;
    private HashMap<Animator, PropertyBundle> mAnimatorMap;
    private long mDuration;
    private boolean mDurationSet;
    private Interpolator mInterpolator;
    private boolean mInterpolatorSet;
    private Animator.AnimatorListener mListener;
    public ArrayList<NameValuesHolder> mPendingAnimations;
    private long mStartDelay;
    private boolean mStartDelaySet;
    private final WeakReference<View> mView;

    /* renamed from: com.nineoldandroids.view.ViewPropertyAnimatorHC$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ ViewPropertyAnimatorHC this$0;

        public AnonymousClass1(ViewPropertyAnimatorHC viewPropertyAnimatorHC) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnimatorEventListener implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ ViewPropertyAnimatorHC this$0;

        private AnimatorEventListener(ViewPropertyAnimatorHC viewPropertyAnimatorHC) {
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }

        public /* synthetic */ AnimatorEventListener(ViewPropertyAnimatorHC viewPropertyAnimatorHC, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class NameValuesHolder {
        public float mDeltaValue;
        public float mFromValue;
        public int mNameConstant;

        public NameValuesHolder(int i2, float f2, float f3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PropertyBundle {
        public ArrayList<NameValuesHolder> mNameValuesHolder;
        public int mPropertyMask;

        public PropertyBundle(int i2, ArrayList<NameValuesHolder> arrayList) {
        }

        public boolean cancel(int i2) {
        }
    }

    public ViewPropertyAnimatorHC(View view) {
    }

    public static /* synthetic */ void access$100(ViewPropertyAnimatorHC viewPropertyAnimatorHC) {
    }

    public static /* synthetic */ Animator.AnimatorListener access$200(ViewPropertyAnimatorHC viewPropertyAnimatorHC) {
    }

    public static /* synthetic */ Animator.AnimatorListener access$202(ViewPropertyAnimatorHC viewPropertyAnimatorHC, Animator.AnimatorListener animatorListener) {
    }

    public static /* synthetic */ HashMap access$300(ViewPropertyAnimatorHC viewPropertyAnimatorHC) {
    }

    public static /* synthetic */ WeakReference access$400(ViewPropertyAnimatorHC viewPropertyAnimatorHC) {
    }

    public static /* synthetic */ void access$500(ViewPropertyAnimatorHC viewPropertyAnimatorHC, int i2, float f2) {
    }

    private void animateProperty(int i2, float f2) {
    }

    private void animatePropertyBy(int i2, float f2) {
    }

    private float getValue(int i2) {
    }

    private void setValue(int i2, float f2) {
    }

    private void startAnimation() {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator alpha(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator alphaBy(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public void cancel() {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public long getDuration() {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public long getStartDelay() {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator rotation(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator rotationBy(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator rotationX(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator rotationXBy(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator rotationY(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator rotationYBy(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator scaleX(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator scaleXBy(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator scaleY(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator scaleYBy(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator setDuration(long j2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator setInterpolator(Interpolator interpolator) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator setListener(Animator.AnimatorListener animatorListener) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator setStartDelay(long j2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public void start() {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator translationX(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator translationXBy(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator translationY(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator translationYBy(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator x(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator xBy(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator y(float f2) {
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public ViewPropertyAnimator yBy(float f2) {
    }

    private void animatePropertyBy(int i2, float f2, float f3) {
    }
}
