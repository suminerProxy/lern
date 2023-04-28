package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TouchResponse {
    private static final boolean DEBUG = false;
    public static final int FLAG_DISABLE_POST_SCROLL = 1;
    public static final int FLAG_DISABLE_SCROLL = 2;
    private static final int SIDE_BOTTOM = 3;
    private static final int SIDE_END = 6;
    private static final int SIDE_LEFT = 1;
    private static final int SIDE_MIDDLE = 4;
    private static final int SIDE_RIGHT = 2;
    private static final int SIDE_START = 5;
    private static final int SIDE_TOP = 0;
    private static final String TAG = "TouchResponse";
    private static final float[][] TOUCH_DIRECTION = null;
    private static final int TOUCH_DOWN = 1;
    private static final int TOUCH_END = 5;
    private static final int TOUCH_LEFT = 2;
    private static final int TOUCH_RIGHT = 3;
    private static final float[][] TOUCH_SIDES = null;
    private static final int TOUCH_START = 4;
    private static final int TOUCH_UP = 0;
    private float[] mAnchorDpDt;
    private float mDragScale;
    private boolean mDragStarted;
    private float mDragThreshold;
    private int mFlags;
    private float mLastTouchX;
    private float mLastTouchY;
    private int mLimitBoundsTo;
    private float mMaxAcceleration;
    private float mMaxVelocity;
    private final MotionLayout mMotionLayout;
    private boolean mMoveWhenScrollAtTop;
    private int mOnTouchUp;
    private int mTouchAnchorId;
    private int mTouchAnchorSide;
    private float mTouchAnchorX;
    private float mTouchAnchorY;
    private float mTouchDirectionX;
    private float mTouchDirectionY;
    private int mTouchRegionId;
    private int mTouchSide;

    /* renamed from: androidx.constraintlayout.motion.widget.TouchResponse$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements View.OnTouchListener {
        public final /* synthetic */ TouchResponse this$0;

        public AnonymousClass1(TouchResponse touchResponse) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.TouchResponse$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements NestedScrollView.OnScrollChangeListener {
        public final /* synthetic */ TouchResponse this$0;

        public AnonymousClass2(TouchResponse touchResponse) {
        }

        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public void onScrollChange(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
        }
    }

    public TouchResponse(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
    }

    private void fill(TypedArray typedArray) {
    }

    private void fillFromAttributeList(Context context, AttributeSet attributeSet) {
    }

    public float dot(float f2, float f3) {
    }

    public int getAnchorId() {
    }

    public int getFlags() {
    }

    public RectF getLimitBoundsTo(ViewGroup viewGroup, RectF rectF) {
    }

    public int getLimitBoundsToId() {
    }

    public float getMaxAcceleration() {
    }

    public float getMaxVelocity() {
    }

    public boolean getMoveWhenScrollAtTop() {
    }

    public float getProgressDirection(float f2, float f3) {
    }

    public RectF getTouchRegion(ViewGroup viewGroup, RectF rectF) {
    }

    public int getTouchRegionId() {
    }

    public void processTouchEvent(MotionEvent motionEvent, MotionLayout.MotionTracker motionTracker, int i2, MotionScene motionScene) {
    }

    public void scrollMove(float f2, float f3) {
    }

    public void scrollUp(float f2, float f3) {
    }

    public void setAnchorId(int i2) {
    }

    public void setDown(float f2, float f3) {
    }

    public void setMaxAcceleration(float f2) {
    }

    public void setMaxVelocity(float f2) {
    }

    public void setRTL(boolean z) {
    }

    public void setTouchAnchorLocation(float f2, float f3) {
    }

    public void setUpTouchEvent(float f2, float f3) {
    }

    public void setupTouch() {
    }

    public String toString() {
    }
}
