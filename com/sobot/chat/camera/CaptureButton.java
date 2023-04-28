package com.sobot.chat.camera;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import com.sobot.chat.camera.listener.StCaptureListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CaptureButton extends View {
    public static final int STATE_BAN = 5;
    public static final int STATE_IDLE = 1;
    public static final int STATE_LONG_PRESS = 3;
    public static final int STATE_PRESS = 2;
    public static final int STATE_RECORDERING = 4;
    private float button_inside_radius;
    private float button_outside_radius;
    private float button_radius;
    private int button_size;
    private int button_state;
    private StCaptureListener captureLisenter;
    private float center_X;
    private float center_Y;
    private int duration;
    private float event_Y;
    private int inside_color;
    private int inside_reduce_size;
    private LongPressRunnable longPressRunnable;
    private Paint mPaint;
    private int min_duration;
    private int outside_add_size;
    private int outside_color;
    private float progress;
    private int progress_color;
    private int recorded_time;
    private RectF rectF;
    private int state;
    private float strokeWidth;
    private RecordCountDownTimer timer;

    /* renamed from: com.sobot.chat.camera.CaptureButton$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ CaptureButton this$0;

        public AnonymousClass1(CaptureButton captureButton) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.sobot.chat.camera.CaptureButton$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public final /* synthetic */ CaptureButton this$0;

        public AnonymousClass2(CaptureButton captureButton) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.sobot.chat.camera.CaptureButton$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ CaptureButton this$0;

        public AnonymousClass3(CaptureButton captureButton) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.sobot.chat.camera.CaptureButton$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ CaptureButton this$0;

        public AnonymousClass4(CaptureButton captureButton) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.sobot.chat.camera.CaptureButton$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 extends AnimatorListenerAdapter {
        public final /* synthetic */ CaptureButton this$0;

        public AnonymousClass5(CaptureButton captureButton) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class LongPressRunnable implements Runnable {
        public final /* synthetic */ CaptureButton this$0;

        private LongPressRunnable(CaptureButton captureButton) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ LongPressRunnable(CaptureButton captureButton, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class RecordCountDownTimer extends CountDownTimer {
        public final /* synthetic */ CaptureButton this$0;

        public RecordCountDownTimer(CaptureButton captureButton, long j2, long j3) {
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j2) {
        }
    }

    public CaptureButton(Context context) {
    }

    public static /* synthetic */ float access$100(CaptureButton captureButton) {
    }

    public static /* synthetic */ void access$1000(CaptureButton captureButton, float f2, float f3, float f4, float f5) {
    }

    public static /* synthetic */ float access$102(CaptureButton captureButton, float f2) {
    }

    public static /* synthetic */ StCaptureListener access$200(CaptureButton captureButton) {
    }

    public static /* synthetic */ int access$300(CaptureButton captureButton) {
    }

    public static /* synthetic */ int access$302(CaptureButton captureButton, int i2) {
    }

    public static /* synthetic */ float access$400(CaptureButton captureButton) {
    }

    public static /* synthetic */ float access$402(CaptureButton captureButton, float f2) {
    }

    public static /* synthetic */ RecordCountDownTimer access$500(CaptureButton captureButton) {
    }

    public static /* synthetic */ void access$600(CaptureButton captureButton, long j2) {
    }

    public static /* synthetic */ void access$700(CaptureButton captureButton) {
    }

    public static /* synthetic */ int access$800(CaptureButton captureButton) {
    }

    public static /* synthetic */ int access$900(CaptureButton captureButton) {
    }

    private void handlerUnpressByState() {
    }

    private void recordEnd() {
    }

    private void resetRecordAnim() {
    }

    private void startCaptureAnimation(float f2) {
    }

    private void startRecordAnimation(float f2, float f3, float f4, float f5) {
    }

    private void updateProgress(long j2) {
    }

    public boolean isIdle() {
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void resetState() {
    }

    public void setButtonFeatures(int i2) {
    }

    public void setCaptureLisenter(StCaptureListener stCaptureListener) {
    }

    public void setDuration(int i2) {
    }

    public void setMinDuration(int i2) {
    }

    public CaptureButton(Context context, int i2) {
    }
}
