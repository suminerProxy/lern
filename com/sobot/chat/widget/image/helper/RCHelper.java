package com.sobot.chat.widget.image.helper;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class RCHelper {
    public Region mAreaRegion;
    public boolean mChecked;
    public boolean mClipBackground;
    public Path mClipPath;
    public int mDefaultStrokeColor;
    public RectF mLayer;
    public OnCheckedChangeListener mOnCheckedChangeListener;
    public Paint mPaint;
    public boolean mRoundAsCircle;
    public int mStrokeColor;
    public ColorStateList mStrokeColorStateList;
    public int mStrokeWidth;
    public float[] radii;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface OnCheckedChangeListener {
        void onCheckedChanged(View view, boolean z);
    }

    public void drawableStateChanged(View view) {
    }

    public void initAttrs(Context context, AttributeSet attributeSet) {
    }

    public void onClipDraw(Canvas canvas) {
    }

    public void onSizeChanged(View view, int i2, int i3) {
    }

    public void refreshRegion(View view) {
    }
}
