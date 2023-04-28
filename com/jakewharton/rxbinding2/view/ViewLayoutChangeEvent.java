package com.jakewharton.rxbinding2.view;

import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ViewLayoutChangeEvent {
    @NonNull
    @CheckResult
    public static ViewLayoutChangeEvent create(@NonNull View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
    }

    public abstract int bottom();

    public abstract int left();

    public abstract int oldBottom();

    public abstract int oldLeft();

    public abstract int oldRight();

    public abstract int oldTop();

    public abstract int right();

    public abstract int top();

    @NonNull
    public abstract View view();
}
