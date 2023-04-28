package androidx.viewpager.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.DecorView
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PagerTitleStrip extends ViewGroup {
    private static final int[] ATTRS = null;
    private static final float SIDE_ALPHA = 0.6f;
    private static final int[] TEXT_ATTRS = null;
    private static final int TEXT_SPACING = 16;
    public TextView mCurrText;
    private int mGravity;
    private int mLastKnownCurrentPage;
    public float mLastKnownPositionOffset;
    public TextView mNextText;
    private int mNonPrimaryAlpha;
    private final PageListener mPageListener;
    public ViewPager mPager;
    public TextView mPrevText;
    private int mScaledTextSpacing;
    public int mTextColor;
    private boolean mUpdatingPositions;
    private boolean mUpdatingText;
    private WeakReference<PagerAdapter> mWatchingAdapter;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class PageListener extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {
        private int mScrollState;
        public final /* synthetic */ PagerTitleStrip this$0;

        public PageListener(PagerTitleStrip pagerTitleStrip) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
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
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {
        private Locale mLocale;

        public SingleLineAllCapsTransform(Context context) {
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
        }
    }

    public PagerTitleStrip(@NonNull Context context) {
    }

    private static void setSingleLineAllCaps(TextView textView) {
    }

    public int getMinHeight() {
    }

    public int getTextSpacing() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public void setGravity(int i2) {
    }

    public void setNonPrimaryAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    public void setTextColor(@ColorInt int i2) {
    }

    public void setTextSize(int i2, float f2) {
    }

    public void setTextSpacing(int i2) {
    }

    public void updateAdapter(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
    }

    public void updateText(int i2, PagerAdapter pagerAdapter) {
    }

    public void updateTextPositions(int i2, float f2, boolean z) {
    }

    public PagerTitleStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
