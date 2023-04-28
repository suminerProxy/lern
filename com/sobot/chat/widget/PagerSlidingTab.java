package com.sobot.chat.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import java.util.Locale;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PagerSlidingTab extends HorizontalScrollView {
    private static final int[] ATTRS = null;
    private boolean checkedTabWidths;
    private int curTabTextColor;
    private int currentPosition;
    private float currentPositionOffset;
    private LinearLayout.LayoutParams defaultTabLayoutParams;
    public ViewPager.OnPageChangeListener delegatePageListener;
    private int dividerColor;
    private int dividerPadding;
    private Paint dividerPaint;
    private int dividerWidth;
    private LinearLayout.LayoutParams expandedTabLayoutParams;
    private int indicatorColor;
    private int indicatorHeight;
    private int lastScrollX;
    private Locale locale;
    private int paddingBottom;
    private final PageListener pageListener;
    private ViewPager pager;
    private Paint rectPaint;
    private int scrollOffset;
    private boolean shouldExpand;
    private int tabBackgroundResId;
    private int tabCount;
    private int tabPadding;
    private int tabTextColor;
    private int tabTextSize;
    private Typeface tabTypeface;
    private int tabTypefaceStyle;
    private LinearLayout tabsContainer;
    private boolean textAllCaps;
    private int underlineColor;
    private int underlineHeight;

    /* renamed from: com.sobot.chat.widget.PagerSlidingTab$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ PagerSlidingTab this$0;

        public AnonymousClass1(PagerSlidingTab pagerSlidingTab) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @SuppressLint({"NewApi"})
        public void onGlobalLayout() {
        }
    }

    /* renamed from: com.sobot.chat.widget.PagerSlidingTab$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ PagerSlidingTab this$0;
        public final /* synthetic */ int val$position;

        public AnonymousClass2(PagerSlidingTab pagerSlidingTab, int i2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.widget.PagerSlidingTab$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ PagerSlidingTab this$0;
        public final /* synthetic */ int val$position;

        public AnonymousClass3(PagerSlidingTab pagerSlidingTab, int i2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface IconTabProvider {
        int getPageIconResId(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class PageListener implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ PagerSlidingTab this$0;

        private PageListener(PagerSlidingTab pagerSlidingTab) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }

        public /* synthetic */ PageListener(PagerSlidingTab pagerSlidingTab, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public int currentPosition;

        /* renamed from: com.sobot.chat.widget.PagerSlidingTab$SavedState$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState[] newArray(int i2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, AnonymousClass1 anonymousClass1) {
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public SavedState(Parcelable parcelable) {
        }

        private SavedState(Parcel parcel) {
        }
    }

    public PagerSlidingTab(Context context) {
    }

    public static /* synthetic */ int access$100(PagerSlidingTab pagerSlidingTab) {
    }

    public static /* synthetic */ int access$102(PagerSlidingTab pagerSlidingTab, int i2) {
    }

    public static /* synthetic */ ViewPager access$200(PagerSlidingTab pagerSlidingTab) {
    }

    public static /* synthetic */ void access$300(PagerSlidingTab pagerSlidingTab, int i2, int i3) {
    }

    public static /* synthetic */ float access$402(PagerSlidingTab pagerSlidingTab, float f2) {
    }

    public static /* synthetic */ LinearLayout access$500(PagerSlidingTab pagerSlidingTab) {
    }

    public static /* synthetic */ int access$600(PagerSlidingTab pagerSlidingTab) {
    }

    public static /* synthetic */ int access$700(PagerSlidingTab pagerSlidingTab) {
    }

    public static /* synthetic */ int access$800(PagerSlidingTab pagerSlidingTab) {
    }

    private void addIconTab(int i2, int i3) {
    }

    private void addTextTab(int i2, String str) {
    }

    private void scrollToChild(int i2, int i3) {
    }

    private void updateTabStyles() {
    }

    public int getDividerColor() {
    }

    public int getDividerPadding() {
    }

    public int getIndicatorColor() {
    }

    public int getIndicatorHeight() {
    }

    public int getScrollOffset() {
    }

    public boolean getShouldExpand() {
    }

    public int getTabBackground() {
    }

    public int getTabPaddingLeftRight() {
    }

    public int getTextColor() {
    }

    public int getTextSize() {
    }

    public int getUnderlineColor() {
    }

    public int getUnderlineHeight() {
    }

    public boolean isTextAllCaps() {
    }

    public void notifyDataSetChanged() {
    }

    @Override // android.view.View
    @TargetApi(21)
    public void onDraw(Canvas canvas) {
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
    }

    public void setAllCaps(boolean z) {
    }

    public void setDividerColor(int i2) {
    }

    public void setDividerColorResource(int i2) {
    }

    public void setDividerPadding(int i2) {
    }

    public void setIndicatorColor(int i2) {
    }

    public void setIndicatorColorResource(int i2) {
    }

    public void setIndicatorHeight(int i2) {
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
    }

    public void setScrollOffset(int i2) {
    }

    public void setShouldExpand(boolean z) {
    }

    public void setTabBackground(int i2) {
    }

    public void setTabPaddingLeftRight(int i2) {
    }

    public void setTextColor(int i2) {
    }

    public void setTextColorResource(int i2) {
    }

    public void setTextSize(int i2) {
    }

    public void setTypeface(Typeface typeface, int i2) {
    }

    public void setUnderlineColor(int i2) {
    }

    public void setUnderlineColorResource(int i2) {
    }

    public void setUnderlineHeight(int i2) {
    }

    public void setViewPager(ViewPager viewPager) {
    }

    public PagerSlidingTab(Context context, AttributeSet attributeSet) {
    }

    public PagerSlidingTab(Context context, AttributeSet attributeSet, int i2) {
    }
}
