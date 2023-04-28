package com.aliyun.identity.face.ui.widget;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RoundProgressBar extends View {
    public static final int FILL = 1;
    public static final int STROKE = 0;
    private float backColorWidth;
    private int backgroundColor;
    private Context ctx;
    private int endAngle;
    private boolean isPausing;
    public BitmapShader mBitmapShader;
    private Handler mMainHandle;
    private Matrix mMatrix;
    public int mProgressAngle;
    private SweepGradient mRoundShader;
    private int mWidth;
    private int max;
    private int maxMiliSeconds;
    public Paint paint;
    private Runnable processRunnable;
    private int progress;
    private int radius;
    public int roundColor;
    private RoundProgressCallback roundProgressCallback;
    public int roundProgressColor;
    private boolean roundShader;
    private int roundShaderEndColor;
    private int roundShaderStartColor;
    private float roundWidth;
    private int secondProgressColor;
    public int startAngle;
    private int style;
    private int textColor;
    private boolean textIsDisplayable;
    private float textSize;

    /* renamed from: com.aliyun.identity.face.ui.widget.RoundProgressBar$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ RoundProgressBar this$0;

        public AnonymousClass1(RoundProgressBar roundProgressBar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public RoundProgressBar(Context context) {
    }

    public static /* synthetic */ boolean access$000(RoundProgressBar roundProgressBar) {
    }

    public static /* synthetic */ int access$100(RoundProgressBar roundProgressBar) {
    }

    public static /* synthetic */ Handler access$200(RoundProgressBar roundProgressBar) {
    }

    public static /* synthetic */ RoundProgressCallback access$300(RoundProgressBar roundProgressBar) {
    }

    public static /* synthetic */ int access$400(RoundProgressBar roundProgressBar) {
    }

    private void paintStroke(Canvas canvas, RectF rectF) {
    }

    public int getCricleColor() {
    }

    public int getCricleProgressColor() {
    }

    public synchronized int getMax() {
    }

    public synchronized int getProgress() {
    }

    public int getRadius() {
    }

    public float getRoundWidth() {
    }

    public int getTextColor() {
    }

    public float getTextSize() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void pauseProcess(boolean z) {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
    }

    public void setCricleColor(int i2) {
    }

    public void setCricleProgressColor(int i2) {
    }

    public void setGradientColor(int i2) {
    }

    public synchronized void setMax(int i2) {
    }

    public synchronized void setProgress(int i2) {
    }

    public synchronized void setProgressAngle(int i2) {
    }

    public void setRoundColor(int i2) {
    }

    public void setRoundProgressColor(int i2) {
    }

    public void setRoundWidth(float f2) {
    }

    public void setTextColor(int i2) {
    }

    public void setTextSize(float f2) {
    }

    public void startProcess(int i2, RoundProgressCallback roundProgressCallback) {
    }

    public void stopProcess() {
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet) {
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet, int i2) {
    }
}
