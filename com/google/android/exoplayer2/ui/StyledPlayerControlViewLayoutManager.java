package com.google.android.exoplayer2.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class StyledPlayerControlViewLayoutManager {
    private static final long ANIMATION_INTERVAL_MS = 2000;
    private static final long DURATION_FOR_HIDING_ANIMATION_MS = 250;
    private static final long DURATION_FOR_SHOWING_ANIMATION_MS = 250;
    private static final int UX_STATE_ALL_VISIBLE = 0;
    private static final int UX_STATE_ANIMATING_HIDE = 3;
    private static final int UX_STATE_ANIMATING_SHOW = 4;
    private static final int UX_STATE_NONE_VISIBLE = 2;
    private static final int UX_STATE_ONLY_PROGRESS_VISIBLE = 1;
    private boolean animationEnabled;
    @Nullable
    private final ViewGroup basicControls;
    @Nullable
    private final ViewGroup bottomBar;
    @Nullable
    private final ViewGroup centerControls;
    @Nullable
    private final View controlsBackground;
    @Nullable
    private final ViewGroup extraControls;
    @Nullable
    private final ViewGroup extraControlsScrollView;
    private final AnimatorSet hideAllBarsAnimator;
    private final Runnable hideAllBarsRunnable;
    private final Runnable hideControllerRunnable;
    private final AnimatorSet hideMainBarAnimator;
    private final Runnable hideMainBarRunnable;
    private final AnimatorSet hideProgressBarAnimator;
    private final Runnable hideProgressBarRunnable;
    private boolean isMinimalMode;
    @Nullable
    private final ViewGroup minimalControls;
    private boolean needToShowBars;
    private final View.OnLayoutChangeListener onLayoutChangeListener;
    private final ValueAnimator overflowHideAnimator;
    private final ValueAnimator overflowShowAnimator;
    @Nullable
    private final View overflowShowButton;
    private final AnimatorSet showAllBarsAnimator;
    private final Runnable showAllBarsRunnable;
    private final AnimatorSet showMainBarAnimator;
    private final List<View> shownButtons;
    private final StyledPlayerControlView styledPlayerControlView;
    @Nullable
    private final View timeBar;
    @Nullable
    private final ViewGroup timeView;
    private int uxState;

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        public final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;

        public AnonymousClass1(final StyledPlayerControlViewLayoutManager this$0) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;

        public AnonymousClass2(final StyledPlayerControlViewLayoutManager this$0) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends AnimatorListenerAdapter {
        public final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;
        public final /* synthetic */ StyledPlayerControlView val$styledPlayerControlView;

        public AnonymousClass3(final StyledPlayerControlViewLayoutManager this$0, final StyledPlayerControlView val$styledPlayerControlView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 extends AnimatorListenerAdapter {
        public final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;
        public final /* synthetic */ StyledPlayerControlView val$styledPlayerControlView;

        public AnonymousClass4(final StyledPlayerControlViewLayoutManager this$0, final StyledPlayerControlView val$styledPlayerControlView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 extends AnimatorListenerAdapter {
        public final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;
        public final /* synthetic */ StyledPlayerControlView val$styledPlayerControlView;

        public AnonymousClass5(final StyledPlayerControlViewLayoutManager this$0, final StyledPlayerControlView val$styledPlayerControlView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass6 extends AnimatorListenerAdapter {
        public final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;

        public AnonymousClass6(final StyledPlayerControlViewLayoutManager this$0) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass7 extends AnimatorListenerAdapter {
        public final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;

        public AnonymousClass7(final StyledPlayerControlViewLayoutManager this$0) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass8 extends AnimatorListenerAdapter {
        public final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;

        public AnonymousClass8(final StyledPlayerControlViewLayoutManager this$0) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass9 extends AnimatorListenerAdapter {
        public final /* synthetic */ StyledPlayerControlViewLayoutManager this$0;

        public AnonymousClass9(final StyledPlayerControlViewLayoutManager this$0) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }
    }

    public StyledPlayerControlViewLayoutManager(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ void a(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ View access$000(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ boolean access$100(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ View access$200(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ ViewGroup access$300(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ ViewGroup access$400(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ void access$500(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, int i2) {
    }

    public static /* synthetic */ boolean access$600(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ boolean access$602(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, boolean z) {
    }

    public static /* synthetic */ Runnable access$700(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ ViewGroup access$800(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ ViewGroup access$900(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    private void animateOverflow(float animatedValue) {
    }

    public static /* synthetic */ void b(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ void c(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ void d(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ void e(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
    }

    public static /* synthetic */ void f(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    public static /* synthetic */ void g(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, View view) {
    }

    private static int getHeightWithMargins(@Nullable View v) {
    }

    private static int getWidthWithMargins(@Nullable View v) {
    }

    public static /* synthetic */ void h(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    private void hideAllBars() {
    }

    private void hideController() {
    }

    private void hideMainBar() {
    }

    private void hideProgressBar() {
    }

    private /* synthetic */ void i(ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void k(ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void m(ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void o(ValueAnimator valueAnimator) {
    }

    private static ObjectAnimator ofTranslationY(float startValue, float endValue, View target) {
    }

    private void onLayoutChange(View v, int left, int top2, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
    }

    private void onLayoutWidthChanged() {
    }

    private void onOverflowButtonClick(View v) {
    }

    private void postDelayedRunnable(Runnable runnable, long interval) {
    }

    public static /* synthetic */ void q(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager) {
    }

    private void setUxState(int uxState) {
    }

    private boolean shouldHideInMinimalMode(View button) {
    }

    private void showAllBars() {
    }

    private void updateLayoutForSizeChange() {
    }

    private boolean useMinimalMode() {
    }

    public boolean getShowButton(@Nullable View button) {
    }

    public void hide() {
    }

    public void hideImmediately() {
    }

    public boolean isAnimationEnabled() {
    }

    public boolean isFullyVisible() {
    }

    public /* synthetic */ void j(ValueAnimator valueAnimator) {
    }

    public /* synthetic */ void l(ValueAnimator valueAnimator) {
    }

    public /* synthetic */ void n(ValueAnimator valueAnimator) {
    }

    public void onAttachedToWindow() {
    }

    public void onDetachedFromWindow() {
    }

    public void onLayout(boolean changed, int left, int top2, int right, int bottom) {
    }

    public /* synthetic */ void p(ValueAnimator valueAnimator) {
    }

    public void removeHideCallbacks() {
    }

    public void resetHideCallbacks() {
    }

    public void setAnimationEnabled(boolean animationEnabled) {
    }

    public void setShowButton(@Nullable View button, boolean showButton) {
    }

    public void show() {
    }
}
