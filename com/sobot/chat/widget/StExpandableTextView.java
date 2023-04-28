package com.sobot.chat.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class StExpandableTextView extends LinearLayout implements View.OnClickListener {
    private static final float DEFAULT_ANIM_ALPHA_START = 1.0f;
    private static final int DEFAULT_ANIM_DURATION = 300;
    private static final int MAX_COLLAPSED_LINES = 5;
    private static final String TAG = null;
    private boolean haveFile;
    private boolean linkBottomLine;
    private float mAnimAlphaStart;
    private boolean mAnimating;
    private int mAnimationDuration;
    public ViewGroup mButton;
    public int mCollapseStrResId;
    private boolean mCollapsed;
    private int mCollapsedHeight;
    private SparseBooleanArray mCollapsedStatus;
    public int mExpandStrResId;
    public ImageView mImageView;
    private OnExpandStateChangeListener mListener;
    private int mMarginBetweenTxtAndBottom;
    private int mMaxCollapsedLines;
    public ViewGroup mOtherView;
    private int mPosition;
    private boolean mRelayout;
    public TextView mTextBtn;
    private int mTextHeightWithMaxLines;
    public TextView mTv;
    public int otherViewHeight;

    /* renamed from: com.sobot.chat.widget.StExpandableTextView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements Animation.AnimationListener {
        public final /* synthetic */ StExpandableTextView this$0;

        public AnonymousClass1(StExpandableTextView stExpandableTextView) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.sobot.chat.widget.StExpandableTextView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ StExpandableTextView this$0;

        public AnonymousClass2(StExpandableTextView stExpandableTextView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class ExpandCollapseAnimation extends Animation {
        private final int mEndHeight;
        private final int mStartHeight;
        private final View mTargetView;
        public final /* synthetic */ StExpandableTextView this$0;

        public ExpandCollapseAnimation(StExpandableTextView stExpandableTextView, View view, int i2, int i3) {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f2, Transformation transformation) {
        }

        @Override // android.view.animation.Animation
        public void initialize(int i2, int i3, int i4, int i5) {
        }

        @Override // android.view.animation.Animation
        public boolean willChangeBounds() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface OnExpandStateChangeListener {
        void onExpandStateChanged(TextView textView, boolean z);
    }

    public StExpandableTextView(Context context) {
    }

    public static /* synthetic */ float access$000(StExpandableTextView stExpandableTextView) {
    }

    public static /* synthetic */ void access$100(View view, float f2) {
    }

    public static /* synthetic */ boolean access$202(StExpandableTextView stExpandableTextView, boolean z) {
    }

    public static /* synthetic */ OnExpandStateChangeListener access$300(StExpandableTextView stExpandableTextView) {
    }

    public static /* synthetic */ boolean access$400(StExpandableTextView stExpandableTextView) {
    }

    public static /* synthetic */ int access$500(StExpandableTextView stExpandableTextView) {
    }

    public static /* synthetic */ int access$502(StExpandableTextView stExpandableTextView, int i2) {
    }

    public static /* synthetic */ int access$600(StExpandableTextView stExpandableTextView) {
    }

    @TargetApi(11)
    private static void applyAlphaAnimation(View view, float f2) {
    }

    private void findViews() {
    }

    @TargetApi(21)
    private static Drawable getDrawable(@NonNull Context context, @DrawableRes int i2) {
    }

    private static int getRealTextViewHeight(@NonNull TextView textView) {
    }

    private void init(AttributeSet attributeSet) {
    }

    private static boolean isPostHoneycomb() {
    }

    private static boolean isPostLolipop() {
    }

    private void setOtherViewVisibility(int i2) {
    }

    private void setupExpandCollapse() {
    }

    public ImageView getImageView() {
    }

    @Nullable
    public CharSequence getText() {
    }

    public TextView getTextBtn() {
    }

    public ViewGroup getmOtherView() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void setHaveFile(boolean z) {
    }

    public void setLinkBottomLine(boolean z) {
    }

    public void setOnExpandStateChangeListener(@Nullable OnExpandStateChangeListener onExpandStateChangeListener) {
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i2) {
    }

    public void setText(@Nullable CharSequence charSequence) {
    }

    public StExpandableTextView(Context context, AttributeSet attributeSet) {
    }

    public StExpandableTextView(Context context, AttributeSet attributeSet, int i2) {
    }

    public void setText(@Nullable CharSequence charSequence, @NonNull SparseBooleanArray sparseBooleanArray, int i2) {
    }
}
