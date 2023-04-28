package com.aliyun.identity.platform;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class IdentityLoadingOverlay extends LinearLayout {
    private View leftFrameGapView;
    private ValueAnimator valueAnimator;

    /* renamed from: com.aliyun.identity.platform.IdentityLoadingOverlay$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ IdentityLoadingOverlay this$0;

        public AnonymousClass1(IdentityLoadingOverlay identityLoadingOverlay) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    public IdentityLoadingOverlay(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ View access$000(IdentityLoadingOverlay identityLoadingOverlay) {
    }

    public void startLoadingAnimation(boolean z) {
    }
}
