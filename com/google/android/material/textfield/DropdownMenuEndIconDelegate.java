package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DropdownMenuEndIconDelegate extends EndIconDelegate {
    private static final int ANIMATION_FADE_IN_DURATION = 67;
    private static final int ANIMATION_FADE_OUT_DURATION = 50;
    private static final boolean IS_LOLLIPOP = false;
    private final TextInputLayout.AccessibilityDelegate accessibilityDelegate;
    @Nullable
    private AccessibilityManager accessibilityManager;
    private final TextInputLayout.OnEditTextAttachedListener dropdownMenuOnEditTextAttachedListener;
    private long dropdownPopupActivatedAt;
    private boolean dropdownPopupDirty;
    @SuppressLint({"ClickableViewAccessibility"})
    private final TextInputLayout.OnEndIconChangedListener endIconChangedListener;
    private final TextWatcher exposedDropdownEndIconTextWatcher;
    private ValueAnimator fadeInAnim;
    private ValueAnimator fadeOutAnim;
    private StateListDrawable filledPopupBackground;
    private boolean isEndIconChecked;
    private final View.OnFocusChangeListener onFocusChangeListener;
    private MaterialShapeDrawable outlinedPopupBackground;

    /* renamed from: com.google.android.material.textfield.DropdownMenuEndIconDelegate$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends TextWatcherAdapter {
        public final /* synthetic */ DropdownMenuEndIconDelegate this$0;

        /* renamed from: com.google.android.material.textfield.DropdownMenuEndIconDelegate$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class RunnableC00601 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ AutoCompleteTextView val$editText;

            public RunnableC00601(AnonymousClass1 anonymousClass1, AutoCompleteTextView autoCompleteTextView) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }
    }

    /* renamed from: com.google.android.material.textfield.DropdownMenuEndIconDelegate$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass10 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ DropdownMenuEndIconDelegate this$0;

        public AnonymousClass10(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.textfield.DropdownMenuEndIconDelegate$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements View.OnFocusChangeListener {
        public final /* synthetic */ DropdownMenuEndIconDelegate this$0;

        public AnonymousClass2(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* renamed from: com.google.android.material.textfield.DropdownMenuEndIconDelegate$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends TextInputLayout.AccessibilityDelegate {
        public final /* synthetic */ DropdownMenuEndIconDelegate this$0;

        public AnonymousClass3(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, TextInputLayout textInputLayout) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.AccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
        }
    }

    /* renamed from: com.google.android.material.textfield.DropdownMenuEndIconDelegate$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements TextInputLayout.OnEditTextAttachedListener {
        public final /* synthetic */ DropdownMenuEndIconDelegate this$0;

        public AnonymousClass4(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
        public void onEditTextAttached(@NonNull TextInputLayout textInputLayout) {
        }
    }

    /* renamed from: com.google.android.material.textfield.DropdownMenuEndIconDelegate$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 implements TextInputLayout.OnEndIconChangedListener {
        public final /* synthetic */ DropdownMenuEndIconDelegate this$0;

        /* renamed from: com.google.android.material.textfield.DropdownMenuEndIconDelegate$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass5 this$1;
            public final /* synthetic */ AutoCompleteTextView val$editText;

            public AnonymousClass1(AnonymousClass5 anonymousClass5, AutoCompleteTextView autoCompleteTextView) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass5(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener
        public void onEndIconChanged(@NonNull TextInputLayout textInputLayout, int i2) {
        }
    }

    /* renamed from: com.google.android.material.textfield.DropdownMenuEndIconDelegate$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ DropdownMenuEndIconDelegate this$0;

        public AnonymousClass6(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.textfield.DropdownMenuEndIconDelegate$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass7 implements View.OnTouchListener {
        public final /* synthetic */ DropdownMenuEndIconDelegate this$0;
        public final /* synthetic */ AutoCompleteTextView val$editText;

        public AnonymousClass7(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, AutoCompleteTextView autoCompleteTextView) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.google.android.material.textfield.DropdownMenuEndIconDelegate$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass8 implements AutoCompleteTextView.OnDismissListener {
        public final /* synthetic */ DropdownMenuEndIconDelegate this$0;

        public AnonymousClass8(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
        }
    }

    /* renamed from: com.google.android.material.textfield.DropdownMenuEndIconDelegate$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass9 extends AnimatorListenerAdapter {
        public final /* synthetic */ DropdownMenuEndIconDelegate this$0;

        public AnonymousClass9(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public DropdownMenuEndIconDelegate(@NonNull TextInputLayout textInputLayout) {
    }

    public static /* synthetic */ AutoCompleteTextView access$000(EditText editText) {
    }

    public static /* synthetic */ AccessibilityManager access$100(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
    }

    public static /* synthetic */ TextInputLayout.AccessibilityDelegate access$1000(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
    }

    public static /* synthetic */ View.OnFocusChangeListener access$1100(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
    }

    public static /* synthetic */ boolean access$1200() {
    }

    public static /* synthetic */ boolean access$1300(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
    }

    public static /* synthetic */ long access$1402(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, long j2) {
    }

    public static /* synthetic */ boolean access$1500(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
    }

    public static /* synthetic */ ValueAnimator access$1600(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
    }

    public static /* synthetic */ boolean access$200(EditText editText) {
    }

    public static /* synthetic */ void access$300(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, boolean z) {
    }

    public static /* synthetic */ boolean access$402(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, boolean z) {
    }

    public static /* synthetic */ void access$500(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, AutoCompleteTextView autoCompleteTextView) {
    }

    public static /* synthetic */ void access$600(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, AutoCompleteTextView autoCompleteTextView) {
    }

    public static /* synthetic */ void access$700(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, AutoCompleteTextView autoCompleteTextView) {
    }

    public static /* synthetic */ void access$800(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, AutoCompleteTextView autoCompleteTextView) {
    }

    public static /* synthetic */ TextWatcher access$900(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
    }

    private void addRippleEffect(@NonNull AutoCompleteTextView autoCompleteTextView) {
    }

    private void addRippleEffectOnFilledLayout(@NonNull AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, @NonNull MaterialShapeDrawable materialShapeDrawable) {
    }

    private void addRippleEffectOnOutlinedLayout(@NonNull AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, @NonNull MaterialShapeDrawable materialShapeDrawable) {
    }

    @NonNull
    private static AutoCompleteTextView castAutoCompleteTextViewOrThrow(EditText editText) {
    }

    private ValueAnimator getAlphaAnimator(int i2, float... fArr) {
    }

    private MaterialShapeDrawable getPopUpMaterialShapeDrawable(float f2, float f3, float f4, int i2) {
    }

    private void initAnimators() {
    }

    private boolean isDropdownPopupActive() {
    }

    private static boolean isEditable(@NonNull EditText editText) {
    }

    private void setEndIconChecked(boolean z) {
    }

    private void setPopupBackground(@NonNull AutoCompleteTextView autoCompleteTextView) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpDropdownShowHideBehavior(@NonNull AutoCompleteTextView autoCompleteTextView) {
    }

    private void showHideDropdown(@Nullable AutoCompleteTextView autoCompleteTextView) {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void initialize() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean isBoxBackgroundModeSupported(int i2) {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean shouldTintIconOnError() {
    }
}
