package com.google.android.material.datepicker;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class DateFormatTextWatcher extends TextWatcherAdapter {
    private static final int VALIDATION_DELAY = 1000;
    private final CalendarConstraints constraints;
    private final DateFormat dateFormat;
    private final String outOfRange;
    private final Runnable setErrorCallback;
    private Runnable setRangeErrorCallback;
    @NonNull
    private final TextInputLayout textInputLayout;

    /* renamed from: com.google.android.material.datepicker.DateFormatTextWatcher$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ DateFormatTextWatcher this$0;
        public final /* synthetic */ String val$formatHint;

        public AnonymousClass1(DateFormatTextWatcher dateFormatTextWatcher, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.datepicker.DateFormatTextWatcher$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ DateFormatTextWatcher this$0;
        public final /* synthetic */ long val$milliseconds;

        public AnonymousClass2(DateFormatTextWatcher dateFormatTextWatcher, long j2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public DateFormatTextWatcher(String str, DateFormat dateFormat, @NonNull TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
    }

    public static /* synthetic */ TextInputLayout access$000(DateFormatTextWatcher dateFormatTextWatcher) {
    }

    public static /* synthetic */ DateFormat access$100(DateFormatTextWatcher dateFormatTextWatcher) {
    }

    public static /* synthetic */ String access$200(DateFormatTextWatcher dateFormatTextWatcher) {
    }

    private Runnable createRangeErrorCallback(long j2) {
    }

    public void onInvalidDate() {
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(@NonNull CharSequence charSequence, int i2, int i3, int i4) {
    }

    public abstract void onValidDate(@Nullable Long l2);

    public void runValidation(View view, Runnable runnable) {
    }
}
