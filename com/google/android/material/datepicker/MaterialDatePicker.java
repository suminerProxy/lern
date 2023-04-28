package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.util.Pair;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MaterialDatePicker<S> extends DialogFragment {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    public static final Object CANCEL_BUTTON_TAG = null;
    public static final Object CONFIRM_BUTTON_TAG = null;
    private static final String DATE_SELECTOR_KEY = "DATE_SELECTOR_KEY";
    public static final int INPUT_MODE_CALENDAR = 0;
    private static final String INPUT_MODE_KEY = "INPUT_MODE_KEY";
    public static final int INPUT_MODE_TEXT = 1;
    private static final String OVERRIDE_THEME_RES_ID = "OVERRIDE_THEME_RES_ID";
    private static final String TITLE_TEXT_KEY = "TITLE_TEXT_KEY";
    private static final String TITLE_TEXT_RES_ID_KEY = "TITLE_TEXT_RES_ID_KEY";
    public static final Object TOGGLE_BUTTON_TAG = null;
    @Nullable
    private MaterialShapeDrawable background;
    private MaterialCalendar<S> calendar;
    @Nullable
    private CalendarConstraints calendarConstraints;
    private Button confirmButton;
    @Nullable
    private DateSelector<S> dateSelector;
    private boolean fullscreen;
    private TextView headerSelectionText;
    private CheckableImageButton headerToggleButton;
    private int inputMode;
    private final LinkedHashSet<DialogInterface.OnCancelListener> onCancelListeners;
    private final LinkedHashSet<DialogInterface.OnDismissListener> onDismissListeners;
    private final LinkedHashSet<View.OnClickListener> onNegativeButtonClickListeners;
    private final LinkedHashSet<MaterialPickerOnPositiveButtonClickListener<? super S>> onPositiveButtonClickListeners;
    @StyleRes
    private int overrideThemeResId;
    private PickerFragment<S> pickerFragment;
    private CharSequence titleText;
    @StringRes
    private int titleTextResId;

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ MaterialDatePicker this$0;

        public AnonymousClass1(MaterialDatePicker materialDatePicker) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ MaterialDatePicker this$0;

        public AnonymousClass2(MaterialDatePicker materialDatePicker) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends OnSelectionChangedListener<S> {
        public final /* synthetic */ MaterialDatePicker this$0;

        public AnonymousClass3(MaterialDatePicker materialDatePicker) {
        }

        @Override // com.google.android.material.datepicker.OnSelectionChangedListener
        public void onIncompleteSelectionChanged() {
        }

        @Override // com.google.android.material.datepicker.OnSelectionChangedListener
        public void onSelectionChanged(S s) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ MaterialDatePicker this$0;

        public AnonymousClass4(MaterialDatePicker materialDatePicker) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface InputMode {
    }

    public static /* synthetic */ LinkedHashSet access$000(MaterialDatePicker materialDatePicker) {
    }

    public static /* synthetic */ LinkedHashSet access$100(MaterialDatePicker materialDatePicker) {
    }

    public static /* synthetic */ void access$200(MaterialDatePicker materialDatePicker) {
    }

    public static /* synthetic */ DateSelector access$300(MaterialDatePicker materialDatePicker) {
    }

    public static /* synthetic */ Button access$400(MaterialDatePicker materialDatePicker) {
    }

    public static /* synthetic */ CheckableImageButton access$500(MaterialDatePicker materialDatePicker) {
    }

    public static /* synthetic */ void access$600(MaterialDatePicker materialDatePicker, CheckableImageButton checkableImageButton) {
    }

    public static /* synthetic */ void access$700(MaterialDatePicker materialDatePicker) {
    }

    @NonNull
    private static Drawable createHeaderToggleDrawable(Context context) {
    }

    private static int getDialogPickerHeight(@NonNull Context context) {
    }

    private static int getPaddedPickerWidth(@NonNull Context context) {
    }

    private int getThemeResId(Context context) {
    }

    private void initHeaderToggle(Context context) {
    }

    public static boolean isFullscreen(@NonNull Context context) {
    }

    public static boolean isNestedScrollable(@NonNull Context context) {
    }

    @NonNull
    public static <S> MaterialDatePicker<S> newInstance(@NonNull Builder<S> builder) {
    }

    public static boolean readMaterialCalendarStyleBoolean(@NonNull Context context, int i2) {
    }

    private void startPickerFragment() {
    }

    public static long thisMonthInUtcMilliseconds() {
    }

    public static long todayInUtcMilliseconds() {
    }

    private void updateHeader() {
    }

    private void updateToggleContentDescription(@NonNull CheckableImageButton checkableImageButton) {
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
    }

    public boolean addOnPositiveButtonClickListener(MaterialPickerOnPositiveButtonClickListener<? super S> materialPickerOnPositiveButtonClickListener) {
    }

    public void clearOnCancelListeners() {
    }

    public void clearOnDismissListeners() {
    }

    public void clearOnNegativeButtonClickListeners() {
    }

    public void clearOnPositiveButtonClickListeners() {
    }

    public String getHeaderText() {
    }

    @Nullable
    public final S getSelection() {
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
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
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
    }

    public boolean removeOnPositiveButtonClickListener(MaterialPickerOnPositiveButtonClickListener<? super S> materialPickerOnPositiveButtonClickListener) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder<S> {
        public CalendarConstraints calendarConstraints;
        public final DateSelector<S> dateSelector;
        public int inputMode;
        public int overrideThemeResId;
        @Nullable
        public S selection;
        public CharSequence titleText;
        public int titleTextResId;

        private Builder(DateSelector<S> dateSelector) {
        }

        private Month createDefaultOpenAt() {
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static <S> Builder<S> customDatePicker(@NonNull DateSelector<S> dateSelector) {
        }

        @NonNull
        public static Builder<Long> datePicker() {
        }

        @NonNull
        public static Builder<Pair<Long, Long>> dateRangePicker() {
        }

        @NonNull
        public MaterialDatePicker<S> build() {
        }

        @NonNull
        public Builder<S> setCalendarConstraints(CalendarConstraints calendarConstraints) {
        }

        @NonNull
        public Builder<S> setInputMode(int i2) {
        }

        @NonNull
        public Builder<S> setSelection(S s) {
        }

        @NonNull
        public Builder<S> setTheme(@StyleRes int i2) {
        }

        @NonNull
        public Builder<S> setTitleText(@StringRes int i2) {
        }

        @NonNull
        public Builder<S> setTitleText(@Nullable CharSequence charSequence) {
        }
    }
}
