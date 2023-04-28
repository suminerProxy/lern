package com.tencent.qcloud.tuikit.tuichat.component.photoview.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnGestureListener;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnMatrixChangedListener;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnOutsidePhotoTapListener;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnPhotoTapListener;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnScaleChangedListener;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnSingleFlingListener;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnViewDragListener;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnViewTapListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class PhotoViewAttacher implements View.OnTouchListener, View.OnLayoutChangeListener {
    private static float DEFAULT_MAX_SCALE = 3.0f;
    private static float DEFAULT_MID_SCALE = 1.75f;
    private static float DEFAULT_MIN_SCALE = 1.0f;
    private static int DEFAULT_ZOOM_DURATION = 200;
    private static final int EDGE_BOTH = 2;
    private static final int EDGE_LEFT = 0;
    private static final int EDGE_NONE = -1;
    private static final int EDGE_RIGHT = 1;
    private static int SINGLE_TOUCH = 1;
    private boolean mAllowParentInterceptOnEdge;
    private final Matrix mBaseMatrix;
    private float mBaseRotation;
    private boolean mBlockParentIntercept;
    private FlingRunnable mCurrentFlingRunnable;
    private final RectF mDisplayRect;
    private final Matrix mDrawMatrix;
    private GestureDetector mGestureDetector;
    private ImageView mImageView;
    private Interpolator mInterpolator;
    private View.OnLongClickListener mLongClickListener;
    private OnMatrixChangedListener mMatrixChangeListener;
    private final float[] mMatrixValues;
    private float mMaxScale;
    private float mMidScale;
    private float mMinScale;
    private View.OnClickListener mOnClickListener;
    private OnViewDragListener mOnViewDragListener;
    private OnOutsidePhotoTapListener mOutsidePhotoTapListener;
    private OnPhotoTapListener mPhotoTapListener;
    private OnScaleChangedListener mScaleChangeListener;
    private CustomGestureDetector mScaleDragDetector;
    private ImageView.ScaleType mScaleType;
    private int mScrollEdge;
    private OnSingleFlingListener mSingleFlingListener;
    private final Matrix mSuppMatrix;
    private OnViewTapListener mViewTapListener;
    private int mZoomDuration;
    private boolean mZoomEnabled;
    private OnGestureListener onGestureListener;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.photoview.view.PhotoViewAttacher$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements OnGestureListener {
        public final /* synthetic */ PhotoViewAttacher this$0;

        public AnonymousClass1(PhotoViewAttacher photoViewAttacher) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnGestureListener
        public void onDrag(float f2, float f3) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnGestureListener
        public void onFling(float f2, float f3, float f4, float f5) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnGestureListener
        public void onScale(float f2, float f3, float f4) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.photoview.view.PhotoViewAttacher$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ PhotoViewAttacher this$0;

        public AnonymousClass2(PhotoViewAttacher photoViewAttacher) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.photoview.view.PhotoViewAttacher$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements GestureDetector.OnDoubleTapListener {
        public final /* synthetic */ PhotoViewAttacher this$0;

        public AnonymousClass3(PhotoViewAttacher photoViewAttacher) {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.photoview.view.PhotoViewAttacher$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnimatedZoomRunnable implements Runnable {
        private final float mFocalX;
        private final float mFocalY;
        private final long mStartTime;
        private final float mZoomEnd;
        private final float mZoomStart;
        public final /* synthetic */ PhotoViewAttacher this$0;

        public AnimatedZoomRunnable(PhotoViewAttacher photoViewAttacher, float f2, float f3, float f4, float f5) {
        }

        private float interpolate() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class FlingRunnable implements Runnable {
        private int mCurrentX;
        private int mCurrentY;
        private final OverScroller mScroller;
        public final /* synthetic */ PhotoViewAttacher this$0;

        public FlingRunnable(PhotoViewAttacher photoViewAttacher, Context context) {
        }

        public void cancelFling() {
        }

        public void fling(int i2, int i3, int i4, int i5) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public PhotoViewAttacher(ImageView imageView) {
    }

    public static /* synthetic */ CustomGestureDetector access$000(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ OnViewDragListener access$100(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ int access$1000(PhotoViewAttacher photoViewAttacher, ImageView imageView) {
    }

    public static /* synthetic */ float access$1100(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ float access$1200(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ OnScaleChangedListener access$1300(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ View.OnLongClickListener access$1400(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ OnSingleFlingListener access$1500(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ float access$1600() {
    }

    public static /* synthetic */ int access$1700() {
    }

    public static /* synthetic */ View.OnClickListener access$1800(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ OnViewTapListener access$1900(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ Matrix access$200(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ OnPhotoTapListener access$2000(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ OnOutsidePhotoTapListener access$2100(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ OnGestureListener access$2200(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ int access$2300(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ Interpolator access$2400(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ void access$300(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ ImageView access$400(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ boolean access$500(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ boolean access$600(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ int access$700(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ FlingRunnable access$800(PhotoViewAttacher photoViewAttacher) {
    }

    public static /* synthetic */ FlingRunnable access$802(PhotoViewAttacher photoViewAttacher, FlingRunnable flingRunnable) {
    }

    public static /* synthetic */ int access$900(PhotoViewAttacher photoViewAttacher, ImageView imageView) {
    }

    private void cancelFling() {
    }

    private void checkAndDisplayMatrix() {
    }

    private boolean checkMatrixBounds() {
    }

    private Matrix getDrawMatrix() {
    }

    private int getImageViewHeight(ImageView imageView) {
    }

    private int getImageViewWidth(ImageView imageView) {
    }

    private float getValue(Matrix matrix, int i2) {
    }

    private void resetMatrix() {
    }

    private void setImageViewMatrix(Matrix matrix) {
    }

    private void updateBaseMatrix(Drawable drawable) {
    }

    public void getDisplayMatrix(Matrix matrix) {
    }

    public RectF getDisplayRect() {
    }

    public Matrix getImageMatrix() {
    }

    public float getMaximumScale() {
    }

    public float getMediumScale() {
    }

    public float getMinimumScale() {
    }

    public float getScale() {
    }

    public ImageView.ScaleType getScaleType() {
    }

    public void getSuppMatrix(Matrix matrix) {
    }

    @Deprecated
    public boolean isZoomEnabled() {
    }

    public boolean isZoomable() {
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
    }

    public void setBaseRotation(float f2) {
    }

    public boolean setDisplayMatrix(Matrix matrix) {
    }

    public void setMaximumScale(float f2) {
    }

    public void setMediumScale(float f2) {
    }

    public void setMinimumScale(float f2) {
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    public void setOnMatrixChangeListener(OnMatrixChangedListener onMatrixChangedListener) {
    }

    public void setOnOutsidePhotoTapListener(OnOutsidePhotoTapListener onOutsidePhotoTapListener) {
    }

    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
    }

    public void setOnScaleChangeListener(OnScaleChangedListener onScaleChangedListener) {
    }

    public void setOnSingleFlingListener(OnSingleFlingListener onSingleFlingListener) {
    }

    public void setOnViewDragListener(OnViewDragListener onViewDragListener) {
    }

    public void setOnViewTapListener(OnViewTapListener onViewTapListener) {
    }

    public void setRotationBy(float f2) {
    }

    public void setRotationTo(float f2) {
    }

    public void setScale(float f2) {
    }

    public void setScaleLevels(float f2, float f3, float f4) {
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public void setZoomInterpolator(Interpolator interpolator) {
    }

    public void setZoomTransitionDuration(int i2) {
    }

    public void setZoomable(boolean z) {
    }

    public void update() {
    }

    public void setScale(float f2, boolean z) {
    }

    private RectF getDisplayRect(Matrix matrix) {
    }

    public void setScale(float f2, float f3, float f4, boolean z) {
    }
}
