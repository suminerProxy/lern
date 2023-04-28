package com.nineoldandroids.animation;

import android.os.Handler;
import android.os.Message;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ValueAnimator extends Animator {
    public static final int ANIMATION_FRAME = 1;
    public static final int ANIMATION_START = 0;
    private static final long DEFAULT_FRAME_DELAY = 10;
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    public static final int RUNNING = 1;
    public static final int SEEKED = 2;
    public static final int STOPPED = 0;
    private static ThreadLocal<AnimationHandler> sAnimationHandler;
    private static final ThreadLocal<ArrayList<ValueAnimator>> sAnimations = null;
    private static final Interpolator sDefaultInterpolator = null;
    private static final ThreadLocal<ArrayList<ValueAnimator>> sDelayedAnims = null;
    private static final ThreadLocal<ArrayList<ValueAnimator>> sEndingAnims = null;
    private static final TypeEvaluator sFloatEvaluator = null;
    private static long sFrameDelay;
    private static final TypeEvaluator sIntEvaluator = null;
    private static final ThreadLocal<ArrayList<ValueAnimator>> sPendingAnimations = null;
    private static final ThreadLocal<ArrayList<ValueAnimator>> sReadyAnims = null;
    private float mCurrentFraction;
    private int mCurrentIteration;
    private long mDelayStartTime;
    private long mDuration;
    public boolean mInitialized;
    private Interpolator mInterpolator;
    private boolean mPlayingBackwards;
    public int mPlayingState;
    private int mRepeatCount;
    private int mRepeatMode;
    private boolean mRunning;
    public long mSeekTime;
    private long mStartDelay;
    public long mStartTime;
    private boolean mStarted;
    private boolean mStartedDelay;
    private ArrayList<AnimatorUpdateListener> mUpdateListeners;
    public PropertyValuesHolder[] mValues;
    public HashMap<String, PropertyValuesHolder> mValuesMap;

    /* renamed from: com.nineoldandroids.animation.ValueAnimator$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends ThreadLocal<ArrayList<ValueAnimator>> {
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ ArrayList<ValueAnimator> initialValue() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: initialValue  reason: avoid collision after fix types in other method */
        public ArrayList<ValueAnimator> initialValue2() {
        }
    }

    /* renamed from: com.nineoldandroids.animation.ValueAnimator$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 extends ThreadLocal<ArrayList<ValueAnimator>> {
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ ArrayList<ValueAnimator> initialValue() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: initialValue  reason: avoid collision after fix types in other method */
        public ArrayList<ValueAnimator> initialValue2() {
        }
    }

    /* renamed from: com.nineoldandroids.animation.ValueAnimator$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 extends ThreadLocal<ArrayList<ValueAnimator>> {
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ ArrayList<ValueAnimator> initialValue() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: initialValue  reason: avoid collision after fix types in other method */
        public ArrayList<ValueAnimator> initialValue2() {
        }
    }

    /* renamed from: com.nineoldandroids.animation.ValueAnimator$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass4 extends ThreadLocal<ArrayList<ValueAnimator>> {
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ ArrayList<ValueAnimator> initialValue() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: initialValue  reason: avoid collision after fix types in other method */
        public ArrayList<ValueAnimator> initialValue2() {
        }
    }

    /* renamed from: com.nineoldandroids.animation.ValueAnimator$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass5 extends ThreadLocal<ArrayList<ValueAnimator>> {
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ ArrayList<ValueAnimator> initialValue() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: initialValue  reason: avoid collision after fix types in other method */
        public ArrayList<ValueAnimator> initialValue2() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnimationHandler extends Handler {
        private AnimationHandler() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }

        public /* synthetic */ AnimationHandler(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface AnimatorUpdateListener {
        void onAnimationUpdate(ValueAnimator valueAnimator);
    }

    public static /* synthetic */ ThreadLocal access$000() {
    }

    public static /* synthetic */ ThreadLocal access$100() {
    }

    public static /* synthetic */ long access$1000() {
    }

    public static /* synthetic */ ThreadLocal access$200() {
    }

    public static /* synthetic */ long access$300(ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void access$400(ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ ThreadLocal access$500() {
    }

    public static /* synthetic */ ThreadLocal access$600() {
    }

    public static /* synthetic */ boolean access$700(ValueAnimator valueAnimator, long j2) {
    }

    public static /* synthetic */ boolean access$802(ValueAnimator valueAnimator, boolean z) {
    }

    public static /* synthetic */ void access$900(ValueAnimator valueAnimator) {
    }

    public static void clearAllAnimations() {
    }

    private boolean delayedAnimationFrame(long j2) {
    }

    private void endAnimation() {
    }

    public static int getCurrentAnimationsCount() {
    }

    public static long getFrameDelay() {
    }

    public static ValueAnimator ofFloat(float... fArr) {
    }

    public static ValueAnimator ofInt(int... iArr) {
    }

    public static ValueAnimator ofObject(TypeEvaluator typeEvaluator, Object... objArr) {
    }

    public static ValueAnimator ofPropertyValuesHolder(PropertyValuesHolder... propertyValuesHolderArr) {
    }

    public static void setFrameDelay(long j2) {
    }

    private void start(boolean z) {
    }

    private void startAnimation() {
    }

    public void addUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
    }

    public void animateValue(float f2) {
    }

    public boolean animationFrame(long j2) {
    }

    @Override // com.nineoldandroids.animation.Animator
    public void cancel() {
    }

    @Override // com.nineoldandroids.animation.Animator
    public /* bridge */ /* synthetic */ Animator clone() {
    }

    @Override // com.nineoldandroids.animation.Animator
    public void end() {
    }

    public float getAnimatedFraction() {
    }

    public Object getAnimatedValue() {
    }

    public long getCurrentPlayTime() {
    }

    @Override // com.nineoldandroids.animation.Animator
    public long getDuration() {
    }

    public Interpolator getInterpolator() {
    }

    public int getRepeatCount() {
    }

    public int getRepeatMode() {
    }

    @Override // com.nineoldandroids.animation.Animator
    public long getStartDelay() {
    }

    public PropertyValuesHolder[] getValues() {
    }

    public void initAnimation() {
    }

    @Override // com.nineoldandroids.animation.Animator
    public boolean isRunning() {
    }

    @Override // com.nineoldandroids.animation.Animator
    public boolean isStarted() {
    }

    public void removeAllUpdateListeners() {
    }

    public void removeUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
    }

    public void reverse() {
    }

    public void setCurrentPlayTime(long j2) {
    }

    @Override // com.nineoldandroids.animation.Animator
    public /* bridge */ /* synthetic */ Animator setDuration(long j2) {
    }

    public void setEvaluator(TypeEvaluator typeEvaluator) {
    }

    public void setFloatValues(float... fArr) {
    }

    public void setIntValues(int... iArr) {
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setInterpolator(Interpolator interpolator) {
    }

    public void setObjectValues(Object... objArr) {
    }

    public void setRepeatCount(int i2) {
    }

    public void setRepeatMode(int i2) {
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setStartDelay(long j2) {
    }

    public void setValues(PropertyValuesHolder... propertyValuesHolderArr) {
    }

    public String toString() {
    }

    @Override // com.nineoldandroids.animation.Animator
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo11clone() throws CloneNotSupportedException {
    }

    @Override // com.nineoldandroids.animation.Animator
    public ValueAnimator setDuration(long j2) {
    }

    @Override // com.nineoldandroids.animation.Animator
    public ValueAnimator clone() {
    }

    public Object getAnimatedValue(String str) {
    }

    @Override // com.nineoldandroids.animation.Animator
    public void start() {
    }
}
