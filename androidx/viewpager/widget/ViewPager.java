package androidx.viewpager.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator<ItemInfo> COMPARATOR = null;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    public static final int[] LAYOUT_ATTRS = null;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private static final Interpolator sInterpolator = null;
    private static final ViewPositionComparator sPositionComparator = null;
    private int mActivePointerId;
    public PagerAdapter mAdapter;
    private List<OnAdapterChangeListener> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    public int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<ItemInfo> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private OnPageChangeListener mOnPageChangeListener;
    private List<OnPageChangeListener> mOnPageChangeListeners;
    private int mPageMargin;
    private PageTransformer mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final ItemInfo mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    /* renamed from: androidx.viewpager.widget.ViewPager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements Comparator<ItemInfo> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(ItemInfo itemInfo, ItemInfo itemInfo2) {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ ViewPager this$0;

        public AnonymousClass3(ViewPager viewPager) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements OnApplyWindowInsetsListener {
        private final Rect mTempRect;
        public final /* synthetic */ ViewPager this$0;

        public AnonymousClass4(ViewPager viewPager) {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface DecorView {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ItemInfo {
        public Object object;
        public float offset;
        public int position;
        public boolean scrolling;
        public float widthFactor;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        public final /* synthetic */ ViewPager this$0;

        public MyAccessibilityDelegate(ViewPager viewPager) {
        }

        private boolean canScroll() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnAdapterChangeListener {
        void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i2);

        void onPageScrolled(int i2, float f2, @Px int i3);

        void onPageSelected(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface PageTransformer {
        void transformPage(@NonNull View view, float f2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class PagerObserver extends DataSetObserver {
        public final /* synthetic */ ViewPager this$0;

        public PagerObserver(ViewPager viewPager) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public Parcelable adapterState;
        public ClassLoader loader;
        public int position;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
            }
        }

        public SavedState(@NonNull Parcelable parcelable) {
        }

        public String toString() {
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ViewPositionComparator implements Comparator<View> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(View view, View view2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(View view, View view2) {
        }
    }

    public ViewPager(@NonNull Context context) {
    }

    private void calculatePageOffsets(ItemInfo itemInfo, int i2, ItemInfo itemInfo2) {
    }

    private void completeScroll(boolean z) {
    }

    private int determineTargetPage(int i2, float f2, int i3, int i4) {
    }

    private void dispatchOnPageScrolled(int i2, float f2, int i3) {
    }

    private void dispatchOnPageSelected(int i2) {
    }

    private void dispatchOnScrollStateChanged(int i2) {
    }

    private void enableLayers(boolean z) {
    }

    private void endDrag() {
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
    }

    private int getClientWidth() {
    }

    private ItemInfo infoForCurrentScrollPosition() {
    }

    private static boolean isDecorView(@NonNull View view) {
    }

    private boolean isGutterDrag(float f2, float f3) {
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
    }

    private boolean pageScrolled(int i2) {
    }

    private boolean performDrag(float f2) {
    }

    private void recomputeScrollPosition(int i2, int i3, int i4, int i5) {
    }

    private void removeNonDecorViews() {
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
    }

    private boolean resetTouch() {
    }

    private void scrollToItem(int i2, boolean z, int i3, boolean z2) {
    }

    private void setScrollingCacheEnabled(boolean z) {
    }

    private void sortChildDrawingOrder() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
    }

    public ItemInfo addNewItem(int i2, int i3) {
    }

    public void addOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
    }

    public void addOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
    }

    public boolean arrowScroll(int i2) {
    }

    public boolean beginFakeDrag() {
    }

    public boolean canScroll(View view, boolean z, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void clearOnPageChangeListeners() {
    }

    @Override // android.view.View
    public void computeScroll() {
    }

    public void dataSetChanged() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    public float distanceInfluenceForSnapDuration(float f2) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
    }

    public void endFakeDrag() {
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
    }

    public void fakeDragBy(float f2) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Nullable
    public PagerAdapter getAdapter() {
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
    }

    public int getCurrentItem() {
    }

    public int getOffscreenPageLimit() {
    }

    public int getPageMargin() {
    }

    public ItemInfo infoForAnyChild(View view) {
    }

    public ItemInfo infoForChild(View view) {
    }

    public ItemInfo infoForPosition(int i2) {
    }

    public void initViewPager() {
    }

    public boolean isFakeDragging() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @CallSuper
    public void onPageScrolled(int i2, float f2, int i3) {
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public boolean pageLeft() {
    }

    public boolean pageRight() {
    }

    public void populate() {
    }

    public void removeOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
    }

    public void removeOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) {
    }

    public void setCurrentItem(int i2) {
    }

    public void setCurrentItemInternal(int i2, boolean z, boolean z2) {
    }

    public OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onPageChangeListener) {
    }

    public void setOffscreenPageLimit(int i2) {
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
    }

    public void setPageMargin(int i2) {
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
    }

    public void setPageTransformer(boolean z, @Nullable PageTransformer pageTransformer) {
    }

    public void setScrollState(int i2) {
    }

    public void smoothScrollTo(int i2, int i3) {
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {
        public int childIndex;
        public int gravity;
        public boolean isDecor;
        public boolean needsMeasure;
        public int position;
        public float widthFactor;

        public LayoutParams() {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public void populate(int i2) {
    }

    public void setCurrentItemInternal(int i2, boolean z, boolean z2, int i3) {
    }

    public void setPageTransformer(boolean z, @Nullable PageTransformer pageTransformer, int i2) {
    }

    public void smoothScrollTo(int i2, int i3, int i4) {
    }

    public void setCurrentItem(int i2, boolean z) {
    }

    public void setPageMarginDrawable(@DrawableRes int i2) {
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
