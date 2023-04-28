package com.jakewharton.rxbinding2.widget;

import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.InitialValueObservable;
import i.a.b0;
import i.a.x0.g;
import i.a.x0.r;
import java.util.concurrent.Callable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RxAdapterView {
    private RxAdapterView() {
    }

    @NonNull
    @CheckResult
    public static <T extends Adapter> b0<AdapterViewItemClickEvent> itemClickEvents(@NonNull AdapterView<T> adapterView) {
    }

    @NonNull
    @CheckResult
    public static <T extends Adapter> b0<Integer> itemClicks(@NonNull AdapterView<T> adapterView) {
    }

    @NonNull
    @CheckResult
    public static <T extends Adapter> b0<AdapterViewItemLongClickEvent> itemLongClickEvents(@NonNull AdapterView<T> adapterView) {
    }

    @NonNull
    @CheckResult
    public static <T extends Adapter> b0<Integer> itemLongClicks(@NonNull AdapterView<T> adapterView) {
    }

    @NonNull
    @CheckResult
    public static <T extends Adapter> InitialValueObservable<Integer> itemSelections(@NonNull AdapterView<T> adapterView) {
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static <T extends Adapter> g<? super Integer> selection(@NonNull AdapterView<T> adapterView) {
    }

    @NonNull
    @CheckResult
    public static <T extends Adapter> InitialValueObservable<AdapterViewSelectionEvent> selectionEvents(@NonNull AdapterView<T> adapterView) {
    }

    @NonNull
    @CheckResult
    public static <T extends Adapter> b0<AdapterViewItemLongClickEvent> itemLongClickEvents(@NonNull AdapterView<T> adapterView, @NonNull r<? super AdapterViewItemLongClickEvent> rVar) {
    }

    @NonNull
    @CheckResult
    public static <T extends Adapter> b0<Integer> itemLongClicks(@NonNull AdapterView<T> adapterView, @NonNull Callable<Boolean> callable) {
    }
}
