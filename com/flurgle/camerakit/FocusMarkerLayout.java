package com.flurgle.camerakit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class FocusMarkerLayout extends FrameLayout {
    private FrameLayout b;
    private ImageView c;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ FocusMarkerLayout b;

        public a(FocusMarkerLayout focusMarkerLayout) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ FocusMarkerLayout b;

        public b(FocusMarkerLayout focusMarkerLayout) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public FocusMarkerLayout(@NonNull Context context) {
    }

    public static /* synthetic */ FrameLayout a(FocusMarkerLayout focusMarkerLayout) {
    }

    public static /* synthetic */ ImageView b(FocusMarkerLayout focusMarkerLayout) {
    }

    public void c(float f2, float f3) {
    }

    public FocusMarkerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
