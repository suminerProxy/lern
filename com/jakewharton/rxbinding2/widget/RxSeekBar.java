package com.jakewharton.rxbinding2.widget;

import android.widget.SeekBar;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.InitialValueObservable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RxSeekBar {
    private RxSeekBar() {
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<SeekBarChangeEvent> changeEvents(@NonNull SeekBar seekBar) {
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<Integer> changes(@NonNull SeekBar seekBar) {
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<Integer> systemChanges(@NonNull SeekBar seekBar) {
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<Integer> userChanges(@NonNull SeekBar seekBar) {
    }
}
