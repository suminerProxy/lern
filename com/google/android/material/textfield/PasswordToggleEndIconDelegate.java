package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PasswordToggleEndIconDelegate extends EndIconDelegate {
    private final TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;
    private final TextInputLayout.OnEndIconChangedListener onEndIconChangedListener;
    private final TextWatcher textWatcher;

    /* renamed from: com.google.android.material.textfield.PasswordToggleEndIconDelegate$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends TextWatcherAdapter {
        public final /* synthetic */ PasswordToggleEndIconDelegate this$0;

        public AnonymousClass1(PasswordToggleEndIconDelegate passwordToggleEndIconDelegate) {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* renamed from: com.google.android.material.textfield.PasswordToggleEndIconDelegate$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements TextInputLayout.OnEditTextAttachedListener {
        public final /* synthetic */ PasswordToggleEndIconDelegate this$0;

        public AnonymousClass2(PasswordToggleEndIconDelegate passwordToggleEndIconDelegate) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
        public void onEditTextAttached(@NonNull TextInputLayout textInputLayout) {
        }
    }

    /* renamed from: com.google.android.material.textfield.PasswordToggleEndIconDelegate$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements TextInputLayout.OnEndIconChangedListener {
        public final /* synthetic */ PasswordToggleEndIconDelegate this$0;

        /* renamed from: com.google.android.material.textfield.PasswordToggleEndIconDelegate$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass3 this$1;
            public final /* synthetic */ EditText val$editText;

            public AnonymousClass1(AnonymousClass3 anonymousClass3, EditText editText) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass3(PasswordToggleEndIconDelegate passwordToggleEndIconDelegate) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener
        public void onEndIconChanged(@NonNull TextInputLayout textInputLayout, int i2) {
        }
    }

    /* renamed from: com.google.android.material.textfield.PasswordToggleEndIconDelegate$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ PasswordToggleEndIconDelegate this$0;

        public AnonymousClass4(PasswordToggleEndIconDelegate passwordToggleEndIconDelegate) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public PasswordToggleEndIconDelegate(@NonNull TextInputLayout textInputLayout) {
    }

    public static /* synthetic */ boolean access$000(PasswordToggleEndIconDelegate passwordToggleEndIconDelegate) {
    }

    public static /* synthetic */ TextWatcher access$100(PasswordToggleEndIconDelegate passwordToggleEndIconDelegate) {
    }

    private boolean hasPasswordTransformation() {
    }

    private static boolean isInputTypePassword(EditText editText) {
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void initialize() {
    }
}
