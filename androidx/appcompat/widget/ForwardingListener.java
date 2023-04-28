package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ShowableListMenu;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class ForwardingListener implements View.OnTouchListener, View.OnAttachStateChangeListener {
    private int mActivePointerId;
    private Runnable mDisallowIntercept;
    private boolean mForwarding;
    private final int mLongPressTimeout;
    private final float mScaledTouchSlop;
    public final View mSrc;
    private final int mTapTimeout;
    private final int[] mTmpLocation;
    private Runnable mTriggerLongPress;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class DisallowIntercept implements Runnable {
        public final /* synthetic */ ForwardingListener this$0;

        public DisallowIntercept(ForwardingListener forwardingListener) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class TriggerLongPress implements Runnable {
        public final /* synthetic */ ForwardingListener this$0;

        public TriggerLongPress(ForwardingListener forwardingListener) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public ForwardingListener(View view) {
    }

    private void clearCallbacks() {
    }

    private boolean onTouchForwarded(MotionEvent motionEvent) {
    }

    private boolean onTouchObserved(MotionEvent motionEvent) {
    }

    private static boolean pointInView(View view, float f2, float f3, float f4) {
    }

    private boolean toGlobalMotionEvent(View view, MotionEvent motionEvent) {
    }

    private boolean toLocalMotionEvent(View view, MotionEvent motionEvent) {
    }

    public abstract ShowableListMenu getPopup();

    public boolean onForwardingStarted() {
    }

    public boolean onForwardingStopped() {
    }

    public void onLongPress() {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
