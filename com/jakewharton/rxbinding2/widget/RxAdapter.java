package com.jakewharton.rxbinding2.widget;

import android.widget.Adapter;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.InitialValueObservable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RxAdapter {
    private RxAdapter() {
    }

    @NonNull
    @CheckResult
    public static <T extends Adapter> InitialValueObservable<T> dataChanges(@NonNull T t) {
    }
}
