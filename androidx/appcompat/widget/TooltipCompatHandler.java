package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TooltipCompatHandler implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static final long HOVER_HIDE_TIMEOUT_MS = 15000;
    private static final long HOVER_HIDE_TIMEOUT_SHORT_MS = 3000;
    private static final long LONG_CLICK_HIDE_TIMEOUT_MS = 2500;
    private static final String TAG = "TooltipCompatHandler";
    private static TooltipCompatHandler sActiveHandler;
    private static TooltipCompatHandler sPendingHandler;
    private final View mAnchor;
    private int mAnchorX;
    private int mAnchorY;
    private boolean mFromTouch;
    private final Runnable mHideRunnable;
    private final int mHoverSlop;
    private TooltipPopup mPopup;
    private final Runnable mShowRunnable;
    private final CharSequence mTooltipText;

    /* renamed from: androidx.appcompat.widget.TooltipCompatHandler$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ TooltipCompatHandler this$0;

        public AnonymousClass1(TooltipCompatHandler tooltipCompatHandler) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.appcompat.widget.TooltipCompatHandler$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ TooltipCompatHandler this$0;

        public AnonymousClass2(TooltipCompatHandler tooltipCompatHandler) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private TooltipCompatHandler(View view, CharSequence charSequence) {
    }

    private void cancelPendingShow() {
    }

    private void clearAnchorPos() {
    }

    private void scheduleShow() {
    }

    private static void setPendingHandler(TooltipCompatHandler tooltipCompatHandler) {
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
    }

    private boolean updateAnchorPos(MotionEvent motionEvent) {
    }

    public void hide() {
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }

    public void show(boolean z) {
    }
}
