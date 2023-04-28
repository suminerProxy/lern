package com.jakewharton.rxbinding2.widget;

import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class TextViewTextChangeEvent {
    @NonNull
    @CheckResult
    public static TextViewTextChangeEvent create(@NonNull TextView textView, @NonNull CharSequence charSequence, int i2, int i3, int i4) {
    }

    public abstract int before();

    public abstract int count();

    public abstract int start();

    @NonNull
    public abstract CharSequence text();

    @NonNull
    public abstract TextView view();
}
