package com.aliyun.identity.face.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class IdentityScanFrameView extends LinearLayout {
    private int frameHeightMaxSize;
    private int frameHeightMinSize;
    private int horizonExpansionMinSize;
    private int lrGapViewWidthMaxSize;
    private int lrGapViewWidthMinSize;
    private int scanFrameTop;
    private View scanFrameTopView;
    private int scanLineTopGapHeightMaxSize;
    private int scanLineTopGapHeightMinSize;
    private int verticalExpansionSize;

    /* renamed from: com.aliyun.identity.face.ui.IdentityScanFrameView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ IdentityScanFrameView this$0;

        public AnonymousClass1(IdentityScanFrameView identityScanFrameView) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.IdentityScanFrameView$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass10 implements Animator.AnimatorListener {
        public final /* synthetic */ IdentityScanFrameView this$0;
        public final /* synthetic */ AnimationListener val$animationListener;

        public AnonymousClass10(IdentityScanFrameView identityScanFrameView, AnimationListener animationListener) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.IdentityScanFrameView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Animator.AnimatorListener {
        public final /* synthetic */ IdentityScanFrameView this$0;
        public final /* synthetic */ AnimationListener val$animationListener;

        public AnonymousClass2(IdentityScanFrameView identityScanFrameView, AnimationListener animationListener) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.IdentityScanFrameView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ IdentityScanFrameView this$0;
        public final /* synthetic */ View val$scanLineImgViewTopGap;

        public AnonymousClass3(IdentityScanFrameView identityScanFrameView, View view) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.IdentityScanFrameView$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ IdentityScanFrameView this$0;
        public final /* synthetic */ View val$scanLineImgView;

        public AnonymousClass4(IdentityScanFrameView identityScanFrameView, View view) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.IdentityScanFrameView$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ IdentityScanFrameView this$0;

        public AnonymousClass5(IdentityScanFrameView identityScanFrameView) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.IdentityScanFrameView$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass6 implements Animator.AnimatorListener {
        public final /* synthetic */ IdentityScanFrameView this$0;
        public final /* synthetic */ AnimationListener val$animationListener;
        public final /* synthetic */ boolean val$isExpansion;

        public AnonymousClass6(IdentityScanFrameView identityScanFrameView, AnimationListener animationListener, boolean z) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.IdentityScanFrameView$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass7 implements AnimationListener {
        public final /* synthetic */ IdentityScanFrameView this$0;
        public final /* synthetic */ AnimationListener val$animationListener;
        public final /* synthetic */ int val$duration;

        public AnonymousClass7(IdentityScanFrameView identityScanFrameView, int i2, AnimationListener animationListener) {
        }

        @Override // com.aliyun.identity.face.ui.IdentityScanFrameView.AnimationListener
        public void onAnimationFinish() {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.IdentityScanFrameView$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass8 implements AnimationListener {
        public final /* synthetic */ IdentityScanFrameView this$0;
        public final /* synthetic */ AnimationListener val$animationListener;
        public final /* synthetic */ int val$duration;

        public AnonymousClass8(IdentityScanFrameView identityScanFrameView, int i2, AnimationListener animationListener) {
        }

        @Override // com.aliyun.identity.face.ui.IdentityScanFrameView.AnimationListener
        public void onAnimationFinish() {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.IdentityScanFrameView$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass9 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ IdentityScanFrameView this$0;

        public AnonymousClass9(IdentityScanFrameView identityScanFrameView) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface AnimationListener {
        void onAnimationFinish();
    }

    public IdentityScanFrameView(Context context) {
    }

    public static /* synthetic */ void access$000(IdentityScanFrameView identityScanFrameView, float f2) {
    }

    public static /* synthetic */ void access$100(IdentityScanFrameView identityScanFrameView, float f2) {
    }

    public static /* synthetic */ void access$200(IdentityScanFrameView identityScanFrameView, int i2, boolean z, AnimationListener animationListener) {
    }

    public static /* synthetic */ View access$300(IdentityScanFrameView identityScanFrameView) {
    }

    private void init(AttributeSet attributeSet, int i2) {
    }

    private void reSizeUIHorizon(float f2) {
    }

    private void reSizeUIVertical(float f2) {
    }

    private void startAnimationVertical(int i2, boolean z, AnimationListener animationListener) {
    }

    public void contractionAnimation(int i2, AnimationListener animationListener) {
    }

    public void expansionAnimation(int i2, AnimationListener animationListener) {
    }

    public void fadeAnimation(int i2, boolean z, AnimationListener animationListener) {
    }

    public void initAnimationParams() {
    }

    public void setHorizonExpansionMinSize(int i2) {
    }

    public void setScanFrameTop(int i2) {
    }

    public void setVerticalExpansionSize(int i2) {
    }

    public void startHorizonAnimation(int i2, boolean z, AnimationListener animationListener) {
    }

    public IdentityScanFrameView(Context context, AttributeSet attributeSet) {
    }
}
