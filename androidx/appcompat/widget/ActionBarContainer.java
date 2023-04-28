package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ActionBarContainer extends FrameLayout {
    private View mActionBarView;
    public Drawable mBackground;
    private View mContextView;
    private int mHeight;
    public boolean mIsSplit;
    public boolean mIsStacked;
    private boolean mIsTransitioning;
    public Drawable mSplitBackground;
    public Drawable mStackedBackground;
    private View mTabContainer;

    public ActionBarContainer(Context context) {
    }

    private int getMeasuredHeightWithMargins(View view) {
    }

    private boolean isCollapsed(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
    }

    public View getTabContainer() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
    }

    @Override // android.view.View
    public void onFinishInflate() {
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setPrimaryBackground(Drawable drawable) {
    }

    public void setSplitBackground(Drawable drawable) {
    }

    public void setStackedBackground(Drawable drawable) {
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
    }

    public void setTransitioning(boolean z) {
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
    }
}
