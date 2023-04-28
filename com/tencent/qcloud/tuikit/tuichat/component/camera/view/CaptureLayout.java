package com.tencent.qcloud.tuikit.tuichat.component.camera.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.qcloud.tuikit.tuichat.component.camera.listener.CaptureListener;
import com.tencent.qcloud.tuikit.tuichat.component.camera.listener.ClickListener;
import com.tencent.qcloud.tuikit.tuichat.component.camera.listener.ReturnListener;
import com.tencent.qcloud.tuikit.tuichat.component.camera.listener.TypeListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CaptureLayout extends FrameLayout {
    private TypeButton btn_cancel;
    private CaptureButton btn_capture;
    private TypeButton btn_confirm;
    private ReturnButton btn_return;
    private int button_size;
    private CaptureListener captureLisenter;
    private int iconLeft;
    private int iconRight;
    private boolean isFirst;
    private ImageView iv_custom_left;
    private ImageView iv_custom_right;
    private int layout_height;
    private int layout_width;
    private ClickListener leftClickListener;
    private ReturnListener returnListener;
    private ClickListener rightClickListener;
    private TextView txt_tip;
    private TypeListener typeLisenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.CaptureLayout$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        public final /* synthetic */ CaptureLayout this$0;

        public AnonymousClass1(CaptureLayout captureLayout) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.CaptureLayout$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements CaptureListener {
        public final /* synthetic */ CaptureLayout this$0;

        public AnonymousClass2(CaptureLayout captureLayout) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.CaptureListener
        public void recordEnd(long j2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.CaptureListener
        public void recordError() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.CaptureListener
        public void recordShort(long j2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.CaptureListener
        public void recordStart() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.CaptureListener
        public void recordZoom(float f2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.CaptureListener
        public void takePictures() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.CaptureLayout$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ CaptureLayout this$0;

        public AnonymousClass3(CaptureLayout captureLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.CaptureLayout$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ CaptureLayout this$0;

        public AnonymousClass4(CaptureLayout captureLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.CaptureLayout$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public final /* synthetic */ CaptureLayout this$0;

        public AnonymousClass5(CaptureLayout captureLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.CaptureLayout$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ CaptureLayout this$0;

        public AnonymousClass6(CaptureLayout captureLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.CaptureLayout$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
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

    public static /* synthetic */ TypeButton access$000(CaptureLayout captureLayout) {
    }

    public static /* synthetic */ TypeButton access$100(CaptureLayout captureLayout) {
    }

    public static /* synthetic */ CaptureListener access$200(CaptureLayout captureLayout) {
    }

    public static /* synthetic */ TypeListener access$300(CaptureLayout captureLayout) {
    }

    public static /* synthetic */ ClickListener access$400(CaptureLayout captureLayout) {
    }

    public static /* synthetic */ ClickListener access$500(CaptureLayout captureLayout) {
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

    public void setCaptureLisenter(CaptureListener captureListener) {
    }

    public void setDuration(int i2) {
    }

    public void setIconSrc(int i2, int i3) {
    }

    public void setLeftClickListener(ClickListener clickListener) {
    }

    public void setReturnLisenter(ReturnListener returnListener) {
    }

    public void setRightClickListener(ClickListener clickListener) {
    }

    public void setTextWithAnimation(String str) {
    }

    public void setTip(String str) {
    }

    public void setTypeLisenter(TypeListener typeListener) {
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
