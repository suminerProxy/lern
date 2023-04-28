package tencent.txlive.zhibo.widget.like;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import tencent.txlive.zhibo.widget.like.TCAbstractPathAnimator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class TCPathAnimator extends TCAbstractPathAnimator {
    private static final int MAX_PATH_COUNTS = 10;
    private final AtomicInteger mCounter;
    private int mCurrentPathCounts;
    private Handler mHandler;
    private HashMap<Integer, Path> mPathVec;
    private final Random mRandom;

    /* renamed from: tencent.txlive.zhibo.widget.like.TCPathAnimator$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 implements Animation.AnimationListener {
        public final /* synthetic */ TCPathAnimator this$0;
        public final /* synthetic */ View val$child;
        public final /* synthetic */ ViewGroup val$parent;

        /* renamed from: tencent.txlive.zhibo.widget.like.TCPathAnimator$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public class RunnableC06611 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$1;

            public RunnableC06611(AnonymousClass1 anonymousClass1) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(TCPathAnimator tCPathAnimator, ViewGroup viewGroup, View view) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class FloatAnimation extends Animation {
        private float mDistance;
        private PathMeasure mPm;
        private float mRotation;
        private View mView;

        public FloatAnimation(Path path, float f2, View view, View view2) {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f2, Transformation transformation) {
        }
    }

    public TCPathAnimator(TCAbstractPathAnimator.Config config) {
    }

    public static /* synthetic */ Handler access$000(TCPathAnimator tCPathAnimator) {
    }

    public static /* synthetic */ AtomicInteger access$100(TCPathAnimator tCPathAnimator) {
    }

    public static /* synthetic */ float access$200(double d2, double d3, double d4, double d5, double d6) {
    }

    private static float scale(double d2, double d3, double d4, double d5, double d6) {
    }

    @Override // tencent.txlive.zhibo.widget.like.TCAbstractPathAnimator
    public void start(View view, ViewGroup viewGroup) {
    }
}
