package com.aliyun.identity.ocr;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.aliyun.identity.ocr.widget.RectMaskView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class IdentityScanView extends LinearLayout {
    private boolean hasScanLine;
    private int holeColor;
    private boolean holeHCenter;
    private float holeHeight;
    private float holeLeft;
    private Drawable holePicture;
    private float holeStrokeRoundCx;
    private float holeStrokeWidth;
    private float holeTop;
    private boolean holeVCenter;
    private float holeWidth;
    private boolean isPaused;
    private final float maskScale;
    private View rectMaskGapView;
    private RectMaskView rectMaskView;
    private ValueAnimator scanLineAnimation;

    /* renamed from: com.aliyun.identity.ocr.IdentityScanView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ IdentityScanView this$0;
        public final /* synthetic */ View val$rectMaskViewBackground;

        public AnonymousClass1(IdentityScanView identityScanView, View view) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.IdentityScanView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ IdentityScanView this$0;
        public final /* synthetic */ View val$scanLineGapView;

        public AnonymousClass2(IdentityScanView identityScanView, View view) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.IdentityScanView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ IdentityScanView this$0;
        public final /* synthetic */ float val$orgHeight;
        public final /* synthetic */ float val$orgTop;

        public AnonymousClass3(IdentityScanView identityScanView, float f2, float f3) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.IdentityScanView$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements Animator.AnimatorListener {
        public final /* synthetic */ IdentityScanView this$0;
        public final /* synthetic */ float val$orgHeight;
        public final /* synthetic */ float val$orgTop;

        public AnonymousClass4(IdentityScanView identityScanView, float f2, float f3) {
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

    public IdentityScanView(Context context) {
    }

    public static /* synthetic */ float access$000(IdentityScanView identityScanView) {
    }

    public static /* synthetic */ RectMaskView access$100(IdentityScanView identityScanView) {
    }

    private void init(Context context, AttributeSet attributeSet) {
    }

    public void autoLayout() {
    }

    public void blink(int i2) {
    }

    public float getHoleHeight() {
    }

    public float getHoleLeft() {
    }

    public Drawable getHolePicture() {
    }

    public float getHoleTop() {
    }

    public float getHoleWidth() {
    }

    public boolean isHoleHCenter() {
    }

    public boolean isHoleVCenter() {
    }

    public void puaseScanAnimation() {
    }

    public void refresh() {
    }

    public void resumeScanAnimation() {
    }

    public void setHoleHCenter(boolean z) {
    }

    public void setHoleHeight(float f2) {
    }

    public void setHoleLeft(float f2) {
    }

    public void setHolePicture(Drawable drawable) {
    }

    public void setHoleTop(float f2) {
    }

    public void setHoleVCenter(boolean z) {
    }

    public void setHoleWidth(float f2) {
    }

    public void startScanAnimation() {
    }

    public void stopScanAnimation() {
    }

    public IdentityScanView(Context context, AttributeSet attributeSet) {
    }
}
