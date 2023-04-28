package com.sobot.chat.widget.timePicker.lib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.sobot.chat.widget.timePicker.adapter.SobotWheelAdapter;
import com.sobot.chat.widget.timePicker.listener.SobotOnItemSelectedListener;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotWheelView extends View {
    private static final float SCALECONTENT = 0.8f;
    private static final int VELOCITYFLING = 5;
    private float CENTERCONTENTOFFSET;
    public SobotWheelAdapter adapter;
    public float centerY;
    public int change;
    public Context context;
    public int dividerColor;
    private DividerType dividerType;
    private int drawCenterContentStart;
    private int drawOutContentStart;
    public float firstLineY;
    private GestureDetector gestureDetector;
    public int halfCircumference;
    public Handler handler;
    public int initPosition;
    private boolean isCenterLabel;
    public boolean isLoop;
    private boolean isOptions;
    public float itemHeight;
    public int itemsVisible;
    private String label;
    public float lineSpacingMultiplier;
    public ScheduledExecutorService mExecutor;
    private ScheduledFuture<?> mFuture;
    private int mGravity;
    private int mOffset;
    public int maxTextHeight;
    public int maxTextWidth;
    public int measuredHeight;
    public int measuredWidth;
    public SobotOnItemSelectedListener onItemSelectedListener;
    public Paint paintCenterText;
    public Paint paintIndicator;
    public Paint paintOuterText;
    public int preCurrentIndex;
    private float previousY;
    public int radius;
    public float secondLineY;
    private int selectedItem;
    public long startTime;
    public int textColorCenter;
    public int textColorOut;
    public int textSize;
    public float totalScrollY;
    public Typeface typeface;
    public int widthMeasureSpec;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class ACTION {
        private static final /* synthetic */ ACTION[] $VALUES = null;
        public static final ACTION CLICK = null;
        public static final ACTION DAGGLE = null;
        public static final ACTION FLING = null;

        private ACTION(String str, int i2) {
        }

        public static ACTION valueOf(String str) {
        }

        public static ACTION[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class DividerType {
        private static final /* synthetic */ DividerType[] $VALUES = null;
        public static final DividerType FILL = null;
        public static final DividerType WRAP = null;

        private DividerType(String str, int i2) {
        }

        public static DividerType valueOf(String str) {
        }

        public static DividerType[] values() {
        }
    }

    public SobotWheelView(Context context) {
    }

    private String getContentText(Object obj) {
    }

    private int getLoopMappingIndex(int i2) {
    }

    private void initLoopView(Context context) {
    }

    private void initPaints() {
    }

    private void judgeLineSpae() {
    }

    private void measureTextWidthHeight() {
    }

    private void measuredCenterContentStart(String str) {
    }

    private void measuredOutContentStart(String str) {
    }

    private void reMeasureTextSize(String str) {
    }

    private void remeasure() {
    }

    public void cancelFuture() {
    }

    public final SobotWheelAdapter getAdapter() {
    }

    public final int getCurrentItem() {
    }

    public int getItemsCount() {
    }

    public int getTextWidth(Paint paint, String str) {
    }

    public void isCenterLabel(Boolean bool) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public final void onItemSelected() {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public final void scrollBy(float f2) {
    }

    public final void setAdapter(SobotWheelAdapter sobotWheelAdapter) {
    }

    public final void setCurrentItem(int i2) {
    }

    public final void setCyclic(boolean z) {
    }

    public void setDividerColor(int i2) {
    }

    public void setDividerType(DividerType dividerType) {
    }

    public void setGravity(int i2) {
    }

    public void setIsOptions(boolean z) {
    }

    public void setLabel(String str) {
    }

    public void setLineSpacingMultiplier(float f2) {
    }

    public final void setOnItemSelectedListener(SobotOnItemSelectedListener sobotOnItemSelectedListener) {
    }

    public void setTextColorCenter(int i2) {
    }

    public void setTextColorOut(int i2) {
    }

    public final void setTextSize(float f2) {
    }

    public final void setTypeface(Typeface typeface) {
    }

    public void smoothScroll(ACTION action) {
    }

    public SobotWheelView(Context context, AttributeSet attributeSet) {
    }
}
