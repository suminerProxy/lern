package com.sobot.chat.camera;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.sobot.chat.camera.listener.StCaptureListener;
import com.sobot.chat.camera.listener.StClickListener;
import com.sobot.chat.camera.listener.StReturnListener;
import com.sobot.chat.camera.listener.StTypeListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CaptureLayout extends FrameLayout {
    private StTypeButton btn_cancel;
    private CaptureButton btn_capture;
    private StTypeButton btn_confirm;
    private StReturnButton btn_return;
    private int button_size;
    private StCaptureListener captureLisenter;
    private int iconLeft;
    private int iconRight;
    private boolean isFirst;
    private ImageView iv_custom_left;
    private ImageView iv_custom_right;
    private int layout_height;
    private int layout_width;
    private StClickListener leftClickListener;
    private StReturnListener returnListener;
    private StClickListener rightClickListener;
    private TextView txt_tip;
    private StTypeListener typeLisenter;

    /* renamed from: com.sobot.chat.camera.CaptureLayout$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        public final /* synthetic */ CaptureLayout this$0;

        public AnonymousClass1(CaptureLayout captureLayout) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.sobot.chat.camera.CaptureLayout$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements StCaptureListener {
        public final /* synthetic */ CaptureLayout this$0;

        public AnonymousClass2(CaptureLayout captureLayout) {
        }

        @Override // com.sobot.chat.camera.listener.StCaptureListener
        public void recordEnd(long j2) {
        }

        @Override // com.sobot.chat.camera.listener.StCaptureListener
        public void recordError() {
        }

        @Override // com.sobot.chat.camera.listener.StCaptureListener
        public void recordShort(long j2) {
        }

        @Override // com.sobot.chat.camera.listener.StCaptureListener
        public void recordStart() {
        }

        @Override // com.sobot.chat.camera.listener.StCaptureListener
        public void recordZoom(float f2) {
        }

        @Override // com.sobot.chat.camera.listener.StCaptureListener
        public void takePictures() {
        }
    }

    /* renamed from: com.sobot.chat.camera.CaptureLayout$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ CaptureLayout this$0;

        public AnonymousClass3(CaptureLayout captureLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.camera.CaptureLayout$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ CaptureLayout this$0;

        public AnonymousClass4(CaptureLayout captureLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.camera.CaptureLayout$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public final /* synthetic */ CaptureLayout this$0;

        public AnonymousClass5(CaptureLayout captureLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.camera.CaptureLayout$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ CaptureLayout this$0;

        public AnonymousClass6(CaptureLayout captureLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.camera.CaptureLayout$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public final /* synthetic */ CaptureLayout this$0;

        public AnonymousClass7(CaptureLayout captureLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public CaptureLayout(Context context) {
    }

    public static /* synthetic */ StTypeButton access$000(CaptureLayout captureLayout) {
    }

    public static /* synthetic */ StTypeButton access$100(CaptureLayout captureLayout) {
    }

    public static /* synthetic */ StCaptureListener access$200(CaptureLayout captureLayout) {
    }

    public static /* synthetic */ StTypeListener access$300(CaptureLayout captureLayout) {
    }

    public static /* synthetic */ StClickListener access$400(CaptureLayout captureLayout) {
    }

    public static /* synthetic */ CaptureButton access$500(CaptureLayout captureLayout) {
    }

    public static /* synthetic */ StClickListener access$600(CaptureLayout captureLayout) {
    }

    private void initView() {
    }

    public void initEvent() {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void resetCaptureLayout() {
    }

    public void setButtonFeatures(int i2) {
    }

    public void setCaptureLisenter(StCaptureListener stCaptureListener) {
    }

    public void setDuration(int i2) {
    }

    public void setIconSrc(int i2, int i3) {
    }

    public void setLeftClickListener(StClickListener stClickListener) {
    }

    public void setReturnLisenter(StReturnListener stReturnListener) {
    }

    public void setRightClickListener(StClickListener stClickListener) {
    }

    public void setTextWithAnimation(String str) {
    }

    public void setTip(String str) {
    }

    public void setTypeLisenter(StTypeListener stTypeListener) {
    }

    public void showTip() {
    }

    public void startAlphaAnimation() {
    }

    public void startTypeBtnAnimator() {
    }

    public CaptureLayout(Context context, AttributeSet attributeSet) {
    }

    public CaptureLayout(Context context, AttributeSet attributeSet, int i2) {
    }
}
