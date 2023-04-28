package tencent.txlive.zhibo.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.LayoutAnimationController;
import android.widget.RelativeLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class TCSwipeAnimationController {
    private static final String TAG = "TCSwipeAnimationController";
    public Animation animation;
    public LayoutAnimationController controller;
    private boolean isMoving;
    private Context mContext;
    private float mInitX;
    private float mInitY;
    private float mScreenwidth;
    private float mTouchSlop;
    private RelativeLayout mViewGroup;
    private ValueAnimator valueAnimator;

    /* renamed from: tencent.txlive.zhibo.widget.TCSwipeAnimationController$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ TCSwipeAnimationController this$0;

        public AnonymousClass1(TCSwipeAnimationController tCSwipeAnimationController) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    public TCSwipeAnimationController(Context context) {
    }

    public static /* synthetic */ RelativeLayout access$000(TCSwipeAnimationController tCSwipeAnimationController) {
    }

    public boolean isMoving() {
    }

    public boolean processEvent(MotionEvent motionEvent) {
    }

    public void setAnimationView(RelativeLayout relativeLayout) {
    }
}
