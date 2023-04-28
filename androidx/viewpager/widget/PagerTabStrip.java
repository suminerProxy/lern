package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PagerTabStrip extends PagerTitleStrip {
    private static final int FULL_UNDERLINE_HEIGHT = 1;
    private static final int INDICATOR_HEIGHT = 3;
    private static final int MIN_PADDING_BOTTOM = 6;
    private static final int MIN_STRIP_HEIGHT = 32;
    private static final int MIN_TEXT_SPACING = 64;
    private static final int TAB_PADDING = 16;
    private static final int TAB_SPACING = 32;
    private static final String TAG = "PagerTabStrip";
    private boolean mDrawFullUnderline;
    private boolean mDrawFullUnderlineSet;
    private int mFullUnderlineHeight;
    private boolean mIgnoreTap;
    private int mIndicatorColor;
    private int mIndicatorHeight;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private int mMinPaddingBottom;
    private int mMinStripHeight;
    private int mMinTextSpacing;
    private int mTabAlpha;
    private int mTabPadding;
    private final Paint mTabPaint;
    private final Rect mTempRect;
    private int mTouchSlop;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ PagerTabStrip this$0;

        public AnonymousClass1(PagerTabStrip pagerTabStrip) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ PagerTabStrip this$0;

        public AnonymousClass2(PagerTabStrip pagerTabStrip) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public PagerTabStrip(@NonNull Context context) {
    }

    public boolean getDrawFullUnderline() {
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
    }

    @ColorInt
    public int getTabIndicatorColor() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i2) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
    }

    public void setDrawFullUnderline(boolean z) {
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setTabIndicatorColor(@ColorInt int i2) {
    }

    public void setTabIndicatorColorResource(@ColorRes int i2) {
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i2) {
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void updateTextPositions(int i2, float f2, boolean z) {
    }

    public PagerTabStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
