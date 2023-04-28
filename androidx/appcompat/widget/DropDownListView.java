package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.widget.ListViewAutoScrollHelper;
import java.lang.reflect.Field;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DropDownListView extends ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    private ViewPropertyAnimatorCompat mClickAnimation;
    private boolean mDrawsInPressedState;
    private boolean mHijackFocus;
    private Field mIsChildViewEnabled;
    private boolean mListSelectionHidden;
    private int mMotionPosition;
    public ResolveHoverRunnable mResolveHoverRunnable;
    private ListViewAutoScrollHelper mScrollHelper;
    private int mSelectionBottomPadding;
    private int mSelectionLeftPadding;
    private int mSelectionRightPadding;
    private int mSelectionTopPadding;
    private GateKeeperDrawable mSelector;
    private final Rect mSelectorRect;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class GateKeeperDrawable extends DrawableWrapper {
        private boolean mEnabled;

        public GateKeeperDrawable(Drawable drawable) {
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
        }

        public void setEnabled(boolean z) {
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void setHotspot(float f2, float f3) {
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ResolveHoverRunnable implements Runnable {
        public final /* synthetic */ DropDownListView this$0;

        public ResolveHoverRunnable(DropDownListView dropDownListView) {
        }

        public void cancel() {
        }

        public void post() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public DropDownListView(@NonNull Context context, boolean z) {
    }

    private void clearPressedItem() {
    }

    private void clickPressedItem(View view, int i2) {
    }

    private void drawSelectorCompat(Canvas canvas) {
    }

    private void positionSelectorCompat(int i2, View view) {
    }

    private void positionSelectorLikeFocusCompat(int i2, View view) {
    }

    private void positionSelectorLikeTouchCompat(int i2, View view, float f2, float f3) {
    }

    private void setPressedItem(View view, int i2, float f2, float f3) {
    }

    private void setSelectorEnabled(boolean z) {
    }

    private boolean touchModeDrawsInPressedStateCompat() {
    }

    private void updateSelectorStateCompat() {
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
    }

    @Override // android.view.View
    public boolean isFocused() {
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
    }

    public int lookForSelectablePosition(int i2, boolean z) {
    }

    public int measureHeightOfChildrenCompat(int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    public boolean onForwardedEvent(MotionEvent motionEvent, int i2) {
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setListSelectionHidden(boolean z) {
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
    }
}
