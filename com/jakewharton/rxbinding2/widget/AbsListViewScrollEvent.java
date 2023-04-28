package com.jakewharton.rxbinding2.widget;

import android.widget.AbsListView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbsListViewScrollEvent {
    @NonNull
    @CheckResult
    public static AbsListViewScrollEvent create(AbsListView absListView, int i2, int i3, int i4, int i5) {
    }

    public abstract int firstVisibleItem();

    public abstract int scrollState();

    public abstract int totalItemCount();

    @NonNull
    public abstract AbsListView view();

    public abstract int visibleItemCount();
}
