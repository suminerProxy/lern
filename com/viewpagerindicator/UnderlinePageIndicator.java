package com.viewpagerindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import h.b0.b;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UnderlinePageIndicator extends View implements b {
    private static final int t = -1;
    private static final int u = 30;
    private final Paint b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private int f15508d;

    /* renamed from: e  reason: collision with root package name */
    private int f15509e;

    /* renamed from: f  reason: collision with root package name */
    private int f15510f;

    /* renamed from: g  reason: collision with root package name */
    private int f15511g;

    /* renamed from: h  reason: collision with root package name */
    private View f15512h;

    /* renamed from: i  reason: collision with root package name */
    private ViewPager f15513i;

    /* renamed from: j  reason: collision with root package name */
    private ViewPager.OnPageChangeListener f15514j;

    /* renamed from: k  reason: collision with root package name */
    private int f15515k;

    /* renamed from: l  reason: collision with root package name */
    private int f15516l;

    /* renamed from: m  reason: collision with root package name */
    private float f15517m;

    /* renamed from: n  reason: collision with root package name */
    private int f15518n;

    /* renamed from: o  reason: collision with root package name */
    private float f15519o;

    /* renamed from: p  reason: collision with root package name */
    private int f15520p;
    private boolean q;
    private int r;
    private final Runnable s;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public int currentPage;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static class a implements Parcelable.Creator<SavedState> {
            public SavedState a(Parcel parcel) {
            }

            public SavedState[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState[] newArray(int i2) {
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public SavedState(Parcelable parcelable) {
        }

        private SavedState(Parcel parcel) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class a implements Runnable {
        public final /* synthetic */ UnderlinePageIndicator b;

        public a(UnderlinePageIndicator underlinePageIndicator) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public UnderlinePageIndicator(Context context) {
    }

    public static /* synthetic */ boolean a(UnderlinePageIndicator underlinePageIndicator) {
    }

    public static /* synthetic */ Paint b(UnderlinePageIndicator underlinePageIndicator) {
    }

    public static /* synthetic */ int c(UnderlinePageIndicator underlinePageIndicator) {
    }

    private /* synthetic */ void d() {
    }

    public /* synthetic */ void e() {
    }

    public int getFadeDelay() {
    }

    public int getFadeLength() {
    }

    public boolean getFades() {
    }

    public int getSelectedColor() {
    }

    @Override // h.b0.b
    public void l(ViewPager viewPager, int i2) {
    }

    @Override // h.b0.b
    public void m() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
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

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setBottomView(View view) {
    }

    @Override // h.b0.b
    public void setCurrentItem(int i2) {
    }

    public void setFadeDelay(int i2) {
    }

    public void setFadeLength(int i2) {
    }

    public void setFades(boolean z) {
    }

    public void setLineLength(int i2) {
    }

    @Override // h.b0.b
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
    }

    public void setSelectedColor(int i2) {
    }

    @Override // h.b0.b
    public void setViewPager(ViewPager viewPager) {
    }

    public UnderlinePageIndicator(Context context, AttributeSet attributeSet) {
    }

    public UnderlinePageIndicator(Context context, AttributeSet attributeSet, int i2) {
    }
}
