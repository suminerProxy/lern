package androidx.dynamicanimation.animation;

import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.dynamicanimation.animation.AnimationHandler;
import androidx.dynamicanimation.animation.DynamicAnimation;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements AnimationHandler.AnimationFrameCallback {
    public static final ViewProperty ALPHA = null;
    public static final float MIN_VISIBLE_CHANGE_ALPHA = 0.00390625f;
    public static final float MIN_VISIBLE_CHANGE_PIXELS = 1.0f;
    public static final float MIN_VISIBLE_CHANGE_ROTATION_DEGREES = 0.1f;
    public static final float MIN_VISIBLE_CHANGE_SCALE = 0.002f;
    public static final ViewProperty ROTATION = null;
    public static final ViewProperty ROTATION_X = null;
    public static final ViewProperty ROTATION_Y = null;
    public static final ViewProperty SCALE_X = null;
    public static final ViewProperty SCALE_Y = null;
    public static final ViewProperty SCROLL_X = null;
    public static final ViewProperty SCROLL_Y = null;
    private static final float THRESHOLD_MULTIPLIER = 0.75f;
    public static final ViewProperty TRANSLATION_X = null;
    public static final ViewProperty TRANSLATION_Y = null;
    public static final ViewProperty TRANSLATION_Z = null;
    private static final float UNSET = Float.MAX_VALUE;
    public static final ViewProperty X = null;
    public static final ViewProperty Y = null;
    public static final ViewProperty Z = null;
    private final ArrayList<OnAnimationEndListener> mEndListeners;
    private long mLastFrameTime;
    public float mMaxValue;
    public float mMinValue;
    private float mMinVisibleChange;
    public final FloatPropertyCompat mProperty;
    public boolean mRunning;
    public boolean mStartValueIsSet;
    public final Object mTarget;
    private final ArrayList<OnAnimationUpdateListener> mUpdateListeners;
    public float mValue;
    public float mVelocity;

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 extends ViewProperty {
        public AnonymousClass1(String str) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ float getValue(View view) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ void setValue(View view, float f2) {
        }

        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public float getValue2(View view) {
        }

        /* renamed from: setValue  reason: avoid collision after fix types in other method */
        public void setValue2(View view, float f2) {
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass10 extends ViewProperty {
        public AnonymousClass10(String str) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ float getValue(View view) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ void setValue(View view, float f2) {
        }

        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public float getValue2(View view) {
        }

        /* renamed from: setValue  reason: avoid collision after fix types in other method */
        public void setValue2(View view, float f2) {
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass11 extends ViewProperty {
        public AnonymousClass11(String str) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ float getValue(View view) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ void setValue(View view, float f2) {
        }

        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public float getValue2(View view) {
        }

        /* renamed from: setValue  reason: avoid collision after fix types in other method */
        public void setValue2(View view, float f2) {
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass12 extends ViewProperty {
        public AnonymousClass12(String str) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ float getValue(View view) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ void setValue(View view, float f2) {
        }

        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public float getValue2(View view) {
        }

        /* renamed from: setValue  reason: avoid collision after fix types in other method */
        public void setValue2(View view, float f2) {
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass13 extends ViewProperty {
        public AnonymousClass13(String str) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ float getValue(View view) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ void setValue(View view, float f2) {
        }

        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public float getValue2(View view) {
        }

        /* renamed from: setValue  reason: avoid collision after fix types in other method */
        public void setValue2(View view, float f2) {
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass14 extends ViewProperty {
        public AnonymousClass14(String str) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ float getValue(View view) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ void setValue(View view, float f2) {
        }

        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public float getValue2(View view) {
        }

        /* renamed from: setValue  reason: avoid collision after fix types in other method */
        public void setValue2(View view, float f2) {
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass15 extends FloatPropertyCompat {
        public final /* synthetic */ DynamicAnimation this$0;
        public final /* synthetic */ FloatValueHolder val$floatValueHolder;

        public AnonymousClass15(DynamicAnimation dynamicAnimation, String str, FloatValueHolder floatValueHolder) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(Object obj) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(Object obj, float f2) {
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2 extends ViewProperty {
        public AnonymousClass2(String str) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ float getValue(View view) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ void setValue(View view, float f2) {
        }

        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public float getValue2(View view) {
        }

        /* renamed from: setValue  reason: avoid collision after fix types in other method */
        public void setValue2(View view, float f2) {
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass3 extends ViewProperty {
        public AnonymousClass3(String str) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ float getValue(View view) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ void setValue(View view, float f2) {
        }

        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public float getValue2(View view) {
        }

        /* renamed from: setValue  reason: avoid collision after fix types in other method */
        public void setValue2(View view, float f2) {
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass4 extends ViewProperty {
        public AnonymousClass4(String str) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ float getValue(View view) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ void setValue(View view, float f2) {
        }

        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public float getValue2(View view) {
        }

        /* renamed from: setValue  reason: avoid collision after fix types in other method */
        public void setValue2(View view, float f2) {
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass5 extends ViewProperty {
        public AnonymousClass5(String str) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ float getValue(View view) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ void setValue(View view, float f2) {
        }

        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public float getValue2(View view) {
        }

        /* renamed from: setValue  reason: avoid collision after fix types in other method */
        public void setValue2(View view, float f2) {
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass6 extends ViewProperty {
        public AnonymousClass6(String str) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ float getValue(View view) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ void setValue(View view, float f2) {
        }

        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public float getValue2(View view) {
        }

        /* renamed from: setValue  reason: avoid collision after fix types in other method */
        public void setValue2(View view, float f2) {
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass7 extends ViewProperty {
        public AnonymousClass7(String str) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ float getValue(View view) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ void setValue(View view, float f2) {
        }

        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public float getValue2(View view) {
        }

        /* renamed from: setValue  reason: avoid collision after fix types in other method */
        public void setValue2(View view, float f2) {
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass8 extends ViewProperty {
        public AnonymousClass8(String str) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ float getValue(View view) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ void setValue(View view, float f2) {
        }

        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public float getValue2(View view) {
        }

        /* renamed from: setValue  reason: avoid collision after fix types in other method */
        public void setValue2(View view, float f2) {
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass9 extends ViewProperty {
        public AnonymousClass9(String str) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ float getValue(View view) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public /* bridge */ /* synthetic */ void setValue(View view, float f2) {
        }

        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public float getValue2(View view) {
        }

        /* renamed from: setValue  reason: avoid collision after fix types in other method */
        public void setValue2(View view, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MassState {
        public float mValue;
        public float mVelocity;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnAnimationEndListener {
        void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f2, float f3);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnAnimationUpdateListener {
        void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class ViewProperty extends FloatPropertyCompat<View> {
        public /* synthetic */ ViewProperty(String str, AnonymousClass1 anonymousClass1) {
        }

        private ViewProperty(String str) {
        }
    }

    public DynamicAnimation(FloatValueHolder floatValueHolder) {
    }

    private void endAnimationInternal(boolean z) {
    }

    private float getPropertyValue() {
    }

    private static <T> void removeEntry(ArrayList<T> arrayList, T t) {
    }

    private static <T> void removeNullEntries(ArrayList<T> arrayList) {
    }

    private void startAnimationInternal() {
    }

    public T addEndListener(OnAnimationEndListener onAnimationEndListener) {
    }

    public T addUpdateListener(OnAnimationUpdateListener onAnimationUpdateListener) {
    }

    public void cancel() {
    }

    @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean doAnimationFrame(long j2) {
    }

    public abstract float getAcceleration(float f2, float f3);

    public float getMinimumVisibleChange() {
    }

    public float getValueThreshold() {
    }

    public abstract boolean isAtEquilibrium(float f2, float f3);

    public boolean isRunning() {
    }

    public void removeEndListener(OnAnimationEndListener onAnimationEndListener) {
    }

    public void removeUpdateListener(OnAnimationUpdateListener onAnimationUpdateListener) {
    }

    public T setMaxValue(float f2) {
    }

    public T setMinValue(float f2) {
    }

    public T setMinimumVisibleChange(@FloatRange(from = 0.0d, fromInclusive = false) float f2) {
    }

    public void setPropertyValue(float f2) {
    }

    public T setStartValue(float f2) {
    }

    public T setStartVelocity(float f2) {
    }

    public abstract void setValueThreshold(float f2);

    public void start() {
    }

    public abstract boolean updateValueAndVelocity(long j2);

    public <K> DynamicAnimation(K k2, FloatPropertyCompat<K> floatPropertyCompat) {
    }
}
