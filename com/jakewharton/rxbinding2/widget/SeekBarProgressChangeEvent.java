package com.jakewharton.rxbinding2.widget;

import android.widget.SeekBar;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class SeekBarProgressChangeEvent extends SeekBarChangeEvent {
    @NonNull
    @CheckResult
    public static SeekBarProgressChangeEvent create(@NonNull SeekBar seekBar, int i2, boolean z) {
    }

    public abstract boolean fromUser();

    public abstract int progress();
}
