package com.jakewharton.rxbinding2.widget;

import android.widget.SearchView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.InitialValueObservable;
import i.a.x0.g;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RxSearchView {
    private RxSearchView() {
    }

    public static /* synthetic */ void a(@NonNull SearchView searchView, boolean z, CharSequence charSequence) throws Exception {
    }

    @NonNull
    @CheckResult
    public static g<? super CharSequence> query(@NonNull SearchView searchView, boolean z) {
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<SearchViewQueryTextEvent> queryTextChangeEvents(@NonNull SearchView searchView) {
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<CharSequence> queryTextChanges(@NonNull SearchView searchView) {
    }
}
