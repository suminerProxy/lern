package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Slide extends Visibility {
    private static final String PROPNAME_SCREEN_POSITION = "android:slide:screenPosition";
    private static final TimeInterpolator sAccelerate = null;
    private static final CalculateSlide sCalculateBottom = null;
    private static final CalculateSlide sCalculateEnd = null;
    private static final CalculateSlide sCalculateLeft = null;
    private static final CalculateSlide sCalculateRight = null;
    private static final CalculateSlide sCalculateStart = null;
    private static final CalculateSlide sCalculateTop = null;
    private static final TimeInterpolator sDecelerate = null;
    private CalculateSlide mSlideCalculator;
    private int mSlideEdge;

    /* renamed from: androidx.transition.Slide$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 extends CalculateSlideHorizontal {
        @Override // androidx.transition.Slide.CalculateSlide
        public float getGoneX(ViewGroup viewGroup, View view) {
        }
    }

    /* renamed from: androidx.transition.Slide$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2 extends CalculateSlideHorizontal {
        @Override // androidx.transition.Slide.CalculateSlide
        public float getGoneX(ViewGroup viewGroup, View view) {
        }
    }

    /* renamed from: androidx.transition.Slide$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass3 extends CalculateSlideVertical {
        @Override // androidx.transition.Slide.CalculateSlide
        public float getGoneY(ViewGroup viewGroup, View view) {
        }
    }

    /* renamed from: androidx.transition.Slide$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass4 extends CalculateSlideHorizontal {
        @Override // androidx.transition.Slide.CalculateSlide
        public float getGoneX(ViewGroup viewGroup, View view) {
        }
    }

    /* renamed from: androidx.transition.Slide$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass5 extends CalculateSlideHorizontal {
        @Override // androidx.transition.Slide.CalculateSlide
        public float getGoneX(ViewGroup viewGroup, View view) {
        }
    }

    /* renamed from: androidx.transition.Slide$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass6 extends CalculateSlideVertical {
        @Override // androidx.transition.Slide.CalculateSlide
        public float getGoneY(ViewGroup viewGroup, View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface CalculateSlide {
        float getGoneX(ViewGroup viewGroup, View view);

        float getGoneY(ViewGroup viewGroup, View view);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class CalculateSlideHorizontal implements CalculateSlide {
        private CalculateSlideHorizontal() {
        }

        @Override // androidx.transition.Slide.CalculateSlide
        public float getGoneY(ViewGroup viewGroup, View view) {
        }

        public /* synthetic */ CalculateSlideHorizontal(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class CalculateSlideVertical implements CalculateSlide {
        private CalculateSlideVertical() {
        }

        @Override // androidx.transition.Slide.CalculateSlide
        public float getGoneX(ViewGroup viewGroup, View view) {
        }

        public /* synthetic */ CalculateSlideVertical(AnonymousClass1 anonymousClass1) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface GravityFlag {
    }

    public Slide() {
    }

    private void captureValues(TransitionValues transitionValues) {
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
    }

    public int getSlideEdge() {
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
    }

    public void setSlideEdge(int i2) {
    }

    public Slide(int i2) {
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
    }
}
