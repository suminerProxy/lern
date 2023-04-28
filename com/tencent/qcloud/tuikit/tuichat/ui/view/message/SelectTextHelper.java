package com.tencent.qcloud.tuikit.tuichat.ui.view.message;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Magnifier;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SelectTextHelper {
    private static int DEFAULT_SELECTION_LENGTH = 2;
    private static int DEFAULT_SHOW_DURATION = 100;
    private static int STATUS_HEIGHT = 0;
    private static final String TAG = "SelectTextHelper";
    private boolean isHide;
    private boolean isHideWhenScroll;
    private List<Builder.onSeparateItemClickListener> itemListenerList;
    private List<Pair<Integer, String>> itemTextList;
    private Context mContext;
    private int mCursorHandleColor;
    private int mCursorHandleSize;
    private CursorHandle mEndHandle;
    private boolean mIsEmoji;
    private Magnifier mMagnifier;
    private boolean mMagnifierShow;
    private ViewTreeObserver.OnPreDrawListener mOnPreDrawListener;
    private ViewTreeObserver.OnScrollChangedListener mOnScrollChangedListener;
    private int mPopArrowImg;
    private int mPopBgResource;
    private int mPopSpanCount;
    private View.OnTouchListener mRootTouchListener;
    private boolean mScrollShow;
    private boolean mSelectAll;
    private OnSelectListener mSelectListener;
    private boolean mSelectedAllNoPop;
    private int mSelectedColor;
    private SelectionInfo mSelectionInfo;
    private final Runnable mShowSelectViewRunnable;
    private BackgroundColorSpan mSpan;
    private Spannable mSpannable;
    private CursorHandle mStartHandle;
    private TextView mTextView;
    private int mTextViewMarginStart;
    private int mTouchX;
    private int mTouchY;
    private boolean usedClickListener;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnLongClickListener {
        public final /* synthetic */ SelectTextHelper this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class RunnableC02211 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$1;

            public RunnableC02211(AnonymousClass1 anonymousClass1) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper$1$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass2 implements View.OnAttachStateChangeListener {
            public final /* synthetic */ AnonymousClass1 this$1;

            public AnonymousClass2(AnonymousClass1 anonymousClass1) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper$1$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass3 implements ViewTreeObserver.OnPreDrawListener {
            public final /* synthetic */ AnonymousClass1 this$1;

            public AnonymousClass3(AnonymousClass1 anonymousClass1) {
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper$1$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass4 implements View.OnTouchListener {
            public final /* synthetic */ AnonymousClass1 this$1;

            public AnonymousClass4(AnonymousClass1 anonymousClass1) {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper$1$5  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass5 implements ViewTreeObserver.OnScrollChangedListener {
            public final /* synthetic */ AnonymousClass1 this$1;

            public AnonymousClass5(AnonymousClass1 anonymousClass1) {
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
            }
        }

        public AnonymousClass1(SelectTextHelper selectTextHelper) {
        }

        public static /* synthetic */ void access$1600(AnonymousClass1 anonymousClass1) {
        }

        private void onLongTextViewClick() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ SelectTextHelper this$0;

        public AnonymousClass2(SelectTextHelper selectTextHelper) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class CursorHandle extends View {
        private boolean isLeft;
        private int mAdjustX;
        private int mAdjustY;
        private int mBeforeDragEnd;
        private int mBeforeDragStart;
        private int mCircleRadius;
        private int mHeight;
        private int mPadding;
        private Paint mPaint;
        private PopupWindow mPopupWindow;
        private int[] mTempCoors;
        private int mWidth;
        public final /* synthetic */ SelectTextHelper this$0;

        public CursorHandle(SelectTextHelper selectTextHelper, boolean z) {
        }

        public static /* synthetic */ boolean access$3600(CursorHandle cursorHandle) {
        }

        private void changeDirection() {
        }

        private void updateCursorHandle() {
        }

        public void dismiss() {
        }

        public int getExtraX() {
        }

        public int getExtraY() {
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
        }

        public void show(int i2, int i3) {
        }

        public void update(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class LinkMovementMethodInterceptor extends LinkMovementMethod {
        private long downLinkTime;
        public final /* synthetic */ SelectTextHelper this$0;

        private LinkMovementMethodInterceptor(SelectTextHelper selectTextHelper) {
        }

        @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        }

        public /* synthetic */ LinkMovementMethodInterceptor(SelectTextHelper selectTextHelper, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnSelectListener {
        void onClick(View view);

        void onClickUrl(String str);

        void onDismiss();

        void onDismissCustomPop();

        void onLongClick(View view);

        void onReset();

        void onScrolling();

        void onSelectAllShowCustomPop();

        void onTextSelected(CharSequence charSequence);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class SelectionInfo {
        public int mEnd;
        public String mSelectionContent;
        public int mStart;
        public final /* synthetic */ SelectTextHelper this$0;

        private SelectionInfo(SelectTextHelper selectTextHelper) {
        }

        public /* synthetic */ SelectionInfo(SelectTextHelper selectTextHelper, AnonymousClass1 anonymousClass1) {
        }
    }

    public SelectTextHelper(Builder builder) {
    }

    private /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
    }

    public static /* synthetic */ TextView access$1500(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ ViewTreeObserver.OnPreDrawListener access$1700(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ ViewTreeObserver.OnPreDrawListener access$1702(SelectTextHelper selectTextHelper, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
    }

    public static /* synthetic */ boolean access$1800(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ boolean access$1802(SelectTextHelper selectTextHelper, boolean z) {
    }

    public static /* synthetic */ int access$1900() {
    }

    public static /* synthetic */ void access$2000(SelectTextHelper selectTextHelper, int i2) {
    }

    public static /* synthetic */ int access$2100(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ int access$2102(SelectTextHelper selectTextHelper, int i2) {
    }

    public static /* synthetic */ View.OnTouchListener access$2200(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ View.OnTouchListener access$2202(SelectTextHelper selectTextHelper, View.OnTouchListener onTouchListener) {
    }

    public static /* synthetic */ ViewTreeObserver.OnScrollChangedListener access$2300(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ ViewTreeObserver.OnScrollChangedListener access$2302(SelectTextHelper selectTextHelper, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
    }

    public static /* synthetic */ boolean access$2400(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ boolean access$2500(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ CursorHandle access$2600(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ CursorHandle access$2700(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ OnSelectListener access$2800(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ boolean access$2900(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ void access$3000(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ int access$3100(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ int access$3200(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ void access$3300(SelectTextHelper selectTextHelper, int i2, int i3) {
    }

    public static /* synthetic */ void access$3500(SelectTextHelper selectTextHelper, CursorHandle cursorHandle) {
    }

    public static /* synthetic */ int access$3700(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ Context access$3800(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ int access$3900(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ SelectionInfo access$4000(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ boolean access$4100(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ Magnifier access$4200(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ Magnifier access$4202(SelectTextHelper selectTextHelper, Magnifier magnifier) {
    }

    public static /* synthetic */ void access$4300(SelectTextHelper selectTextHelper) {
    }

    public static /* synthetic */ CursorHandle access$4400(SelectTextHelper selectTextHelper, boolean z) {
    }

    public static /* synthetic */ void access$4500(SelectTextHelper selectTextHelper, int i2, int i3) {
    }

    public static /* synthetic */ boolean access$4602(SelectTextHelper selectTextHelper, boolean z) {
    }

    private /* synthetic */ void c(View view) {
    }

    public static int dp2px(float f2) {
    }

    private CursorHandle getCursorHandle(boolean z) {
    }

    public static int getDisplayHeight() {
    }

    public static int getDisplayWidth() {
    }

    public static int getHysteresisOffset(TextView textView, int i2, int i3, int i4) {
    }

    public static int getPreciseOffset(TextView textView, int i2, int i3) {
    }

    public static int getStatusHeight() {
    }

    private void handlerEmojiSelectText() {
    }

    private void hideSelectView() {
    }

    private void init() {
    }

    private static boolean isEndOfLineOffset(Layout layout, int i2) {
    }

    private void postShowSelectView(int i2) {
    }

    private void resetSelectionInfo() {
    }

    private void selectText(int i2, int i3) {
    }

    public static void setWidthHeight(View view, int i2, int i3) {
    }

    private void showAllView() {
    }

    private void showCursorHandle(CursorHandle cursorHandle) {
    }

    private void showSelectView(int i2, int i3) {
    }

    public /* synthetic */ boolean b(View view, MotionEvent motionEvent) {
    }

    public /* synthetic */ void d(View view) {
    }

    public void destroy() {
    }

    public void reset() {
    }

    public void selectAll() {
    }

    public void setSelectListener(OnSelectListener onSelectListener) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class Builder {
        private List<onSeparateItemClickListener> itemListenerList;
        private List<Pair<Integer, String>> itemTextList;
        private int mCursorHandleColor;
        private float mCursorHandleSizeInDp;
        private boolean mIsEmoji;
        private boolean mMagnifierShow;
        private int mPopArrowImg;
        private int mPopBgResource;
        private int mPopSpanCount;
        private boolean mScrollShow;
        private boolean mSelectAll;
        private boolean mSelectedAllNoPop;
        private int mSelectedColor;
        private TextView mTextView;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public interface onSeparateItemClickListener {
            void onClick();
        }

        public Builder(TextView textView) {
        }

        public static /* synthetic */ TextView access$100(Builder builder) {
        }

        public static /* synthetic */ int access$1000(Builder builder) {
        }

        public static /* synthetic */ boolean access$1100(Builder builder) {
        }

        public static /* synthetic */ List access$1200(Builder builder) {
        }

        public static /* synthetic */ List access$1300(Builder builder) {
        }

        public static /* synthetic */ float access$1400(Builder builder) {
        }

        public static /* synthetic */ int access$200(Builder builder) {
        }

        public static /* synthetic */ int access$300(Builder builder) {
        }

        public static /* synthetic */ boolean access$400(Builder builder) {
        }

        public static /* synthetic */ boolean access$500(Builder builder) {
        }

        public static /* synthetic */ boolean access$600(Builder builder) {
        }

        public static /* synthetic */ boolean access$700(Builder builder) {
        }

        public static /* synthetic */ int access$800(Builder builder) {
        }

        public static /* synthetic */ int access$900(Builder builder) {
        }

        public Builder addItem(@DrawableRes int i2, @StringRes int i3, onSeparateItemClickListener onseparateitemclicklistener) {
        }

        public SelectTextHelper build() {
        }

        public Builder setCursorHandleColor(@ColorInt int i2) {
        }

        public Builder setCursorHandleSizeInDp(float f2) {
        }

        public Builder setIsEmoji(boolean z) {
        }

        public Builder setMagnifierShow(boolean z) {
        }

        public Builder setPopSpanCount(int i2) {
        }

        public Builder setPopStyle(int i2, int i3) {
        }

        public Builder setScrollShow(boolean z) {
        }

        public Builder setSelectAll(boolean z) {
        }

        public Builder setSelectedAllNoPop(boolean z) {
        }

        public Builder setSelectedColor(@ColorInt int i2) {
        }

        public Builder addItem(@DrawableRes int i2, String str, onSeparateItemClickListener onseparateitemclicklistener) {
        }
    }
}
