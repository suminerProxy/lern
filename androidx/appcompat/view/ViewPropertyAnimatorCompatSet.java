package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ViewPropertyAnimatorCompatSet {
    public final ArrayList<ViewPropertyAnimatorCompat> mAnimators;
    private long mDuration;
    private Interpolator mInterpolator;
    private boolean mIsStarted;
    public ViewPropertyAnimatorListener mListener;
    private final ViewPropertyAnimatorListenerAdapter mProxyListener;

    /* renamed from: androidx.appcompat.view.ViewPropertyAnimatorCompatSet$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends ViewPropertyAnimatorListenerAdapter {
        private int mProxyEndCount;
        private boolean mProxyStarted;
        public final /* synthetic */ ViewPropertyAnimatorCompatSet this$0;

        public AnonymousClass1(ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet) {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
        }

        public void onEnd() {
        }
    }

    public void cancel() {
    }

    public void onAnimationsEnded() {
    }

    public ViewPropertyAnimatorCompatSet play(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
    }

    public ViewPropertyAnimatorCompatSet playSequentially(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
    }

    public ViewPropertyAnimatorCompatSet setDuration(long j2) {
    }

    public ViewPropertyAnimatorCompatSet setInterpolator(Interpolator interpolator) {
    }

    public ViewPropertyAnimatorCompatSet setListener(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
    }

    public void start() {
    }
}
