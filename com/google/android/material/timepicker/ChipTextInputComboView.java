package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    private final Chip chip;
    private final EditText editText;
    private TextView label;
    private final TextInputLayout textInputLayout;
    private TextWatcher watcher;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class TextFormatter extends TextWatcherAdapter {
        private static final String DEFAULT_TEXT = "00";
        public final /* synthetic */ ChipTextInputComboView this$0;

        private TextFormatter(ChipTextInputComboView chipTextInputComboView) {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        public /* synthetic */ TextFormatter(ChipTextInputComboView chipTextInputComboView, AnonymousClass1 anonymousClass1) {
        }
    }

    public ChipTextInputComboView(@NonNull Context context) {
    }

    public static /* synthetic */ String access$100(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
    }

    public static /* synthetic */ Chip access$200(ChipTextInputComboView chipTextInputComboView) {
    }

    private String formatText(CharSequence charSequence) {
    }

    private void updateHintLocales() {
    }

    public void addInputFilter(InputFilter inputFilter) {
    }

    public TextInputLayout getTextInput() {
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
    }

    public void setChipDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
    }

    public void setCursorVisible(boolean z) {
    }

    public void setHelperText(CharSequence charSequence) {
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
    }

    public void setText(CharSequence charSequence) {
    }

    @Override // android.widget.Checkable
    public void toggle() {
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
