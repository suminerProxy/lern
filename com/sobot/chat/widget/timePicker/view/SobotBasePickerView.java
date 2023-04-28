package com.sobot.chat.widget.timePicker.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.sobot.chat.widget.timePicker.listener.SobotOnDismissListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotBasePickerView {
    public int bgColor_default;
    private boolean cancelable;
    public View clickView;
    public ViewGroup contentContainer;
    private Context context;
    public ViewGroup decorView;
    private ViewGroup dialogView;
    private boolean dismissing;
    private int gravity;
    private Animation inAnim;
    private boolean isAnim;
    private boolean isShowing;
    private Dialog mDialog;
    private final View.OnTouchListener onCancelableTouchListener;
    private SobotOnDismissListener onDismissListener;
    private View.OnKeyListener onKeyBackListener;
    private Animation outAnim;
    private final FrameLayout.LayoutParams params;
    public int pickerview_bg_topbar;
    public int pickerview_timebtn_nor;
    public int pickerview_timebtn_pre;
    public int pickerview_topbar_title;
    private ViewGroup rootView;

    /* renamed from: com.sobot.chat.widget.timePicker.view.SobotBasePickerView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ SobotBasePickerView this$0;

        public AnonymousClass1(SobotBasePickerView sobotBasePickerView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.widget.timePicker.view.SobotBasePickerView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements Animation.AnimationListener {
        public final /* synthetic */ SobotBasePickerView this$0;

        public AnonymousClass2(SobotBasePickerView sobotBasePickerView) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.sobot.chat.widget.timePicker.view.SobotBasePickerView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ SobotBasePickerView this$0;

        public AnonymousClass3(SobotBasePickerView sobotBasePickerView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.widget.timePicker.view.SobotBasePickerView$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements View.OnKeyListener {
        public final /* synthetic */ SobotBasePickerView this$0;

        public AnonymousClass4(SobotBasePickerView sobotBasePickerView) {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        }
    }

    /* renamed from: com.sobot.chat.widget.timePicker.view.SobotBasePickerView$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements View.OnTouchListener {
        public final /* synthetic */ SobotBasePickerView this$0;

        public AnonymousClass5(SobotBasePickerView sobotBasePickerView) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.sobot.chat.widget.timePicker.view.SobotBasePickerView$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 implements DialogInterface.OnDismissListener {
        public final /* synthetic */ SobotBasePickerView this$0;

        public AnonymousClass6(SobotBasePickerView sobotBasePickerView) {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public SobotBasePickerView(Context context) {
    }

    public static /* synthetic */ ViewGroup access$000(SobotBasePickerView sobotBasePickerView) {
    }

    public static /* synthetic */ boolean access$102(SobotBasePickerView sobotBasePickerView, boolean z) {
    }

    public static /* synthetic */ boolean access$202(SobotBasePickerView sobotBasePickerView, boolean z) {
    }

    public static /* synthetic */ SobotOnDismissListener access$300(SobotBasePickerView sobotBasePickerView) {
    }

    private void onAttached(View view) {
    }

    public void createDialog() {
    }

    public void dismiss() {
    }

    public void dismissDialog() {
    }

    public void dismissImmediately() {
    }

    public View findViewById(int i2) {
    }

    public Animation getInAnimation() {
    }

    public Animation getOutAnimation() {
    }

    public void init() {
    }

    public void initEvents() {
    }

    public void initViews(int i2) {
    }

    public boolean isDialog() {
    }

    public boolean isShowing() {
    }

    public void setDialogOutSideCancelable(boolean z) {
    }

    public void setKeyBackCancelable(boolean z) {
    }

    public SobotBasePickerView setOnDismissListener(SobotOnDismissListener sobotOnDismissListener) {
    }

    public SobotBasePickerView setOutSideCancelable(boolean z) {
    }

    public void show(View view, boolean z) {
    }

    public void showDialog() {
    }

    public void show(boolean z) {
    }

    public void show(View view) {
    }

    public void show() {
    }
}
