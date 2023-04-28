package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MaterialTimePicker extends DialogFragment {
    public static final int INPUT_MODE_CLOCK = 0;
    public static final String INPUT_MODE_EXTRA = "TIME_PICKER_INPUT_MODE";
    public static final int INPUT_MODE_KEYBOARD = 1;
    public static final String TIME_MODEL_EXTRA = "TIME_PICKER_TIME_MODEL";
    public static final String TITLE_RES_EXTRA = "TIME_PICKER_TITLE_RES";
    public static final String TITLE_TEXT_EXTRA = "TIME_PICKER_TITLE_TEXT";
    @Nullable
    private TimePickerPresenter activePresenter;
    private final Set<DialogInterface.OnCancelListener> cancelListeners;
    @DrawableRes
    private int clockIcon;
    private final Set<DialogInterface.OnDismissListener> dismissListeners;
    private int inputMode;
    @DrawableRes
    private int keyboardIcon;
    private MaterialButton modeButton;
    private final Set<View.OnClickListener> negativeButtonListeners;
    private final Set<View.OnClickListener> positiveButtonListeners;
    private ViewStub textInputStub;
    private LinearLayout textInputView;
    private TimeModel time;
    @Nullable
    private TimePickerClockPresenter timePickerClockPresenter;
    @Nullable
    private TimePickerTextInputPresenter timePickerTextInputPresenter;
    private TimePickerView timePickerView;
    private int titleResId;
    private String titleText;

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements TimePickerView.OnDoubleTapListener {
        public final /* synthetic */ MaterialTimePicker this$0;

        public AnonymousClass1(MaterialTimePicker materialTimePicker) {
        }

        @Override // com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener
        public void onDoubleTap() {
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ MaterialTimePicker this$0;

        public AnonymousClass2(MaterialTimePicker materialTimePicker) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ MaterialTimePicker this$0;

        public AnonymousClass3(MaterialTimePicker materialTimePicker) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ MaterialTimePicker this$0;

        public AnonymousClass4(MaterialTimePicker materialTimePicker) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private int inputMode;
        private TimeModel time;
        private CharSequence titleText;
        private int titleTextResId;

        public static /* synthetic */ TimeModel access$000(Builder builder) {
        }

        public static /* synthetic */ int access$100(Builder builder) {
        }

        public static /* synthetic */ int access$200(Builder builder) {
        }

        public static /* synthetic */ CharSequence access$300(Builder builder) {
        }

        @NonNull
        public MaterialTimePicker build() {
        }

        @NonNull
        public Builder setHour(@IntRange(from = 0, to = 23) int i2) {
        }

        @NonNull
        public Builder setInputMode(int i2) {
        }

        @NonNull
        public Builder setMinute(@IntRange(from = 0, to = 60) int i2) {
        }

        @NonNull
        public Builder setTimeFormat(int i2) {
        }

        @NonNull
        public Builder setTitleText(@StringRes int i2) {
        }

        @NonNull
        public Builder setTitleText(@Nullable CharSequence charSequence) {
        }
    }

    public static /* synthetic */ MaterialTimePicker access$1000(Builder builder) {
    }

    public static /* synthetic */ int access$400(MaterialTimePicker materialTimePicker) {
    }

    public static /* synthetic */ int access$402(MaterialTimePicker materialTimePicker, int i2) {
    }

    public static /* synthetic */ MaterialButton access$500(MaterialTimePicker materialTimePicker) {
    }

    public static /* synthetic */ void access$600(MaterialTimePicker materialTimePicker, MaterialButton materialButton) {
    }

    public static /* synthetic */ TimePickerTextInputPresenter access$700(MaterialTimePicker materialTimePicker) {
    }

    public static /* synthetic */ Set access$800(MaterialTimePicker materialTimePicker) {
    }

    public static /* synthetic */ Set access$900(MaterialTimePicker materialTimePicker) {
    }

    private Pair<Integer, Integer> dataForMode(int i2) {
    }

    private TimePickerPresenter initializeOrRetrieveActivePresenterForMode(int i2) {
    }

    @NonNull
    private static MaterialTimePicker newInstance(@NonNull Builder builder) {
    }

    private void restoreState(@Nullable Bundle bundle) {
    }

    private void updateInputMode(MaterialButton materialButton) {
    }

    public boolean addOnCancelListener(@NonNull DialogInterface.OnCancelListener onCancelListener) {
    }

    public boolean addOnDismissListener(@NonNull DialogInterface.OnDismissListener onDismissListener) {
    }

    public boolean addOnNegativeButtonClickListener(@NonNull View.OnClickListener onClickListener) {
    }

    public boolean addOnPositiveButtonClickListener(@NonNull View.OnClickListener onClickListener) {
    }

    public void clearOnCancelListeners() {
    }

    public void clearOnDismissListeners() {
    }

    public void clearOnNegativeButtonClickListeners() {
    }

    public void clearOnPositiveButtonClickListeners() {
    }

    @IntRange(from = 0, to = 23)
    public int getHour() {
    }

    public int getInputMode() {
    }

    @IntRange(from = 0, to = 60)
    public int getMinute() {
    }

    @Nullable
    public TimePickerClockPresenter getTimePickerClockPresenter() {
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    public boolean removeOnCancelListener(@NonNull DialogInterface.OnCancelListener onCancelListener) {
    }

    public boolean removeOnDismissListener(@NonNull DialogInterface.OnDismissListener onDismissListener) {
    }

    public boolean removeOnNegativeButtonClickListener(@NonNull View.OnClickListener onClickListener) {
    }

    public boolean removeOnPositiveButtonClickListener(@NonNull View.OnClickListener onClickListener) {
    }
}
