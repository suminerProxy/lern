package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ClearTextEndIconDelegate extends EndIconDelegate {
    private static final int ANIMATION_FADE_DURATION = 100;
    private static final int ANIMATION_SCALE_DURATION = 150;
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    private final TextWatcher clearTextEndIconTextWatcher;
    private final TextInputLayout.OnEditTextAttachedListener clearTextOnEditTextAttachedListener;
    private final TextInputLayout.OnEndIconChangedListener endIconChangedListener;
    private AnimatorSet iconInAnim;
    private ValueAnimator iconOutAnim;
    private final View.OnFocusChangeListener onFocusChangeListener;

    /* renamed from: com.google.android.material.textfield.ClearTextEndIconDelegate$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements TextWatcher {
        public final /* synthetic */ ClearTextEndIconDelegate this$0;

        public AnonymousClass1(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NonNull Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* renamed from: com.google.android.material.textfield.ClearTextEndIconDelegate$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements View.OnFocusChangeListener {
        public final /* synthetic */ ClearTextEndIconDelegate this$0;

        public AnonymousClass2(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* renamed from: com.google.android.material.textfield.ClearTextEndIconDelegate$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements TextInputLayout.OnEditTextAttachedListener {
        public final /* synthetic */ ClearTextEndIconDelegate this$0;

        public AnonymousClass3(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
        public void onEditTextAttached(@NonNull TextInputLayout textInputLayout) {
        }
    }

    /* renamed from: com.google.android.material.textfield.ClearTextEndIconDelegate$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements TextInputLayout.OnEndIconChangedListener {
        public final /* synthetic */ ClearTextEndIconDelegate this$0;

        /* renamed from: com.google.android.material.textfield.ClearTextEndIconDelegate$4$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass4 this$1;
            public final /* synthetic */ EditText val$editText;

            public AnonymousClass1(AnonymousClass4 anonymousClass4, EditText editText) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass4(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener
        public void onEndIconChanged(@NonNull TextInputLayout textInputLayout, int i2) {
        }
    }

    /* renamed from: com.google.android.material.textfield.ClearTextEndIconDelegate$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public final /* synthetic */ ClearTextEndIconDelegate this$0;

        public AnonymousClass5(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.textfield.ClearTextEndIconDelegate$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass6 extends AnimatorListenerAdapter {
        public final /* synthetic */ ClearTextEndIconDelegate this$0;

        public AnonymousClass6(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.textfield.ClearTextEndIconDelegate$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass7 extends AnimatorListenerAdapter {
        public final /* synthetic */ ClearTextEndIconDelegate this$0;

        public AnonymousClass7(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.textfield.ClearTextEndIconDelegate$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass8 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ ClearTextEndIconDelegate this$0;

        public AnonymousClass8(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.textfield.ClearTextEndIconDelegate$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass9 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ ClearTextEndIconDelegate this$0;

        public AnonymousClass9(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        }
    }

    public ClearTextEndIconDelegate(@NonNull TextInputLayout textInputLayout) {
    }

    public static /* synthetic */ boolean access$000(Editable editable) {
    }

    public static /* synthetic */ void access$100(ClearTextEndIconDelegate clearTextEndIconDelegate, boolean z) {
    }

    public static /* synthetic */ View.OnFocusChangeListener access$200(ClearTextEndIconDelegate clearTextEndIconDelegate) {
    }

    public static /* synthetic */ TextWatcher access$300(ClearTextEndIconDelegate clearTextEndIconDelegate) {
    }

    private void animateIcon(boolean z) {
    }

    private ValueAnimator getAlphaAnimator(float... fArr) {
    }

    private ValueAnimator getScaleAnimator() {
    }

    private static boolean hasText(@NonNull Editable editable) {
    }

    private void initAnimators() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void initialize() {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onSuffixVisibilityChanged(boolean z) {
    }
}
