package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class BottomSheetDialog extends AppCompatDialog {
    private BottomSheetBehavior<FrameLayout> behavior;
    @NonNull
    private BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    public boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    public boolean dismissWithAnimation;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ BottomSheetDialog this$0;

        public AnonymousClass1(BottomSheetDialog bottomSheetDialog) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends AccessibilityDelegateCompat {
        public final /* synthetic */ BottomSheetDialog this$0;

        public AnonymousClass2(BottomSheetDialog bottomSheetDialog) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements View.OnTouchListener {
        public final /* synthetic */ BottomSheetDialog this$0;

        public AnonymousClass3(BottomSheetDialog bottomSheetDialog) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 extends BottomSheetBehavior.BottomSheetCallback {
        public final /* synthetic */ BottomSheetDialog this$0;

        public AnonymousClass4(BottomSheetDialog bottomSheetDialog) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f2) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i2) {
        }
    }

    public BottomSheetDialog(@NonNull Context context) {
    }

    private FrameLayout ensureContainerAndBehavior() {
    }

    private static int getThemeResId(@NonNull Context context, int i2) {
    }

    private View wrapInBottomSheet(int i2, @Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> getBehavior() {
    }

    public boolean getDismissWithAnimation() {
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Dialog
    public void onStart() {
    }

    public void removeDefaultCallback() {
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i2) {
    }

    public void setDismissWithAnimation(boolean z) {
    }

    public boolean shouldWindowCloseOnTouchOutside() {
    }

    public BottomSheetDialog(@NonNull Context context, @StyleRes int i2) {
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setContentView(View view) {
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    public BottomSheetDialog(@NonNull Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
    }
}
